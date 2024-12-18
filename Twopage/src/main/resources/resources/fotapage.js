var fotaapp = angular.module('fotaapp', []);
fotaapp.controller('fotaCtrl', function($scope, $http) {

	
	$scope.fotavar='this second page';
	$scope.uploadfile = function()
	 {
          $scope.fotavar='this second page';
	 }

});