'use strict';

/**
 * @ngdoc function
 * @name clientApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the clientApp
 */
angular.module('clientApp')
    .controller('MainCtrl', function ($scope, $rootScope, $http, message, PubNub) {
        $scope.message = {};
        $scope.messages = [];
        $scope.channel = 'my_channel';



        PubNub.init({
            subscribe_key: 'sub-c-93ac4a0a-f45a-11e8-86f0-9a6b1c0db2e9'
        });

        PubNub.ngSubscribe({ channel: $scope.channel });

        $rootScope.$on(PubNub.ngMsgEv($scope.channel), function (ngEvent, payload) {
            // console.log(JSON.parse(payload));
            $scope.$apply(function () {
                console.log(payload)
                $scope.messages.push(payload.message);
            });
        });

        $scope.save = function (m) {
            // message.save(m);
            $scope.url = 'http://localhost:8080/comman';

            $http({
                url: $scope.url,
                method: 'POST',
                data: {
                    "name": m.name,
                    "text": m.text,
                    "channel": m.channel,
                    "timestampUtc": m.timestampUtc,
                    "integrationId": m.integrationId,
                    "fromName": m.fromName,
                    "fromId": m.fromId
                },

            }).then(function success(response) {
                $scope.messages.push(response.data)

            }, function error(response) {
                // console.log(response)
            });
            // console.log(data)
            $scope.message = {}

        }
        $scope.send = function (m) {
            console.log(m)
            $scope.message =
                {
                    "name": m.name,
                    "text": m.text,
                    "channel": m.channel,
                    "timestampUtc": m.timestampUtc,
                    "integrationId": m.integrationId,
                    "fromName": m.fromName,
                    "fromId": m.fromId
                }

        }

    });
