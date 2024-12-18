var app = angular.module('app', []);

app.controller('MainCtrl', function($scope, $http) {

	
	$scope.filename='this first page';
	$scope.uploadfile = function()
	 {
          $scope.filename='this first page';
	 }

});