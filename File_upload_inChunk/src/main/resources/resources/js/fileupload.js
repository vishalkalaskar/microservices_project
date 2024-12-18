
angular.module('fotafile', [])
    .controller('fotaUploadController', ['$scope', function ($scope) {

 var uploadbutton= document.getElementById('upload_btn');
/*Start*/
$scope.checkFileExtention = function() {
	 var fileInput = document.getElementById('fileInput');                
   	 var filePath = fileInput.value;
         
            // Allowing file type
            var allowedExtensions =  /(\.upd|\.json)$/i;
             
            if (!allowedExtensions.exec(filePath)) {
                alert('Invalid file type');
                fileInput.value = '';
                return false;
            }
            else
            {
            $scope. checkFile();
            }
        }
	
/*ENd*/	
   $scope.checkFile = function() {
	  // alert("hello")
	   const fileInput = document.getElementById('fileInput');
         const files = fileInput.files;
          let currentFileIndexFile = 0;
		   const file = files[currentFileIndexFile];

		     const deleteFile = new FormData();
          deleteFile.append('fileName', file.name);
		   
		   const xhr = new XMLHttpRequest();
      xhr.open('POST', '/check', true);
      xhr.onload = function () {
        if (xhr.status === 200) {
          console.log(' file delete successfully');
          $scope.uploadFile();
        } else {
          console.error('Error uploading chunk');
        }
      };
	xhr.send(deleteFile);  
	   }
        
       
   $scope.uploadFile = function() {
	  // alert("dggdgdg")
	  
      const fileInput = document.getElementById('fileInput');
      const files = fileInput.files;
      
    //button diable-------------
     uploadbutton.disabled=true; 

//-----

      let totalSize = 0;
      let uploadedSize = 0;

      for (let i = 0; i < files.length; i++) {
        totalSize += files[i].size;
      }
	
	
      for (let i = 0; i < files.length; i++) {
        const file = files[i];
        const fileSize = file.size;
        //
         const chunkSize =900 * 1024; // 1MB
        var totalChunks = Math.ceil(file.size / chunkSize);
        var chuncIntial =0;
        //
       
        let offset = 0;
      
        while (offset < fileSize) {
          const chunk = file.slice(offset, offset + chunkSize);
         
//var totalChunks = Math.ceil(file.size / chunkSize);
             
          const formData = new FormData();
          formData.append('chunk', chunk);
          formData.append('offset', chuncIntial);
          formData.append('fileName', file.name);
           formData.append('totalChunk', totalChunks);

           sendChunk(formData);
           chuncIntial++;
          offset += chunkSize;
          uploadedSize += chunkSize;

          const progress = Math.floor((uploadedSize / totalSize) * 100);
          
          
      // const progress = Math.floor((uploadedSize * 100 ) /totalSize);
        //  updateProgressBar(progress);
       // move(progress);
        
     //  console.log(JSON.stringify(progress));
        }
      }
    }

    function sendChunk(formData) {
      const xhr = new XMLHttpRequest();
      xhr.open('POST', '/uploadana', true);
      xhr.onload = function () {
		
        if (xhr.status === 200) {		
			console.table("Send chunk:-"+formData);
          console.log('Chunk uploaded successfully'); 
         //move();
        } else {
          console.error('Error uploading chunk');
        }
        
      //  console.log(xhr.response);
//upload Second file:------------------------------------------------------
         if(xhr.response==="File uploaded successfully"){
			//console.log("First file upload")
			
			  $scope.secondFile();
		
			 var fileInput = document.getElementById('fileInput');                
   			 fileInput.value = '';
		} 
//upload Second file:------------------------------------------------------
 
      };


      xhr.send(formData);
          
   
    }

//progress
/*var i = 0;
function move() {
  if (i == 0) {
    i = 1;
    var elem = document.getElementById("myBar");
    var width = 10;
    var id = setInterval(frame, 10);
    function frame() {
      if (width >= 100) {
        clearInterval(id);
        i = 0;
      } else {
        width++;
        elem.style.width = width + "%";
        elem.innerHTML = width  + "%";
      }
    }
  }
}*/


/*    function updateProgressBar(progress) {
      const myProgress = document.getElementById('myBar');
     // const progressT = document.getElementById('progressT'); 
      progressBar.style.width = progress + '%';
    //  progressT.innerText = progress + '%';
    }*/
    
//secFileUpload-------------------------------------------------------------------------------------    

    $scope.secondFile = function() {
	   const secfileInput = document.getElementById('secfileInput');
	 //  const uploadbutton= document.getElementById('upload_btn');
        const secfile = secfileInput.files[0];       
     	 //console.log("Second File Function"); 
     	
     	//disable button
     	//uploadbutton.disabled=true;
     	
      const secFileData = new FormData();   
      secFileData.append('secfile',secfile);
         //console.log(secFileData);
       
         const xhr = new XMLHttpRequest();
      xhr.open('POST', '/secfileupload', true);
      xhr.onload = function () {
        if (xhr.status === 200) {
          console.log('second file upload successfully');  
            secfileInput.value=null; 
            
        } else {
          console.error('Error while uploading');
        }
        
        //enable button
        uploadbutton.disabled=false;
        
      };
	xhr.send(secFileData);
        
        }
//secFileUpload end-------------------------------------------------------------------------------------    

   
   
    }]);
