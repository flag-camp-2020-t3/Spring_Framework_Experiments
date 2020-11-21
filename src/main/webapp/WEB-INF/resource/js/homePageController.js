/**
 * This serves single home page
 * 
 * Reference: 
 * onlineShop
 * https://stackoverflow.com/questions/38117412/can-two-different-modules-have-controllers-with-the-same-name-in-angular-js
 * https://ermakovich.name/posts/can-i-send-http-get-request-with-body-form-browser/
 */
var app = angular.module("myapp", []).controller(
		"homePageController",
		function($scope, $http) {
			var BASE_PATH = "http://localhost:8080/sampleProject";
			$scope.getInfo = function(userId) {
				let user = {
						"id": 1,
						"email": "abc",
						"password": "123",
						"enabled": false
				};
				
				console.log(user);
				$http.post(BASE_PATH + "/getUserInfo")
				.then(function(data) {
					$scope.userInfo = data;
					console.log($scope.userInfo);
				},
				function(data) {
					console.log(data);
				});
			}
		});