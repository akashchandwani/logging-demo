# logging-demo

This project is a demo project on how to setup the logs for a spring boot application.

Features -

* Add timezone to the logs
* Add sessionId to the logs
* Add userId to the logs
* Add http method to the logs
* Add http request uri to the logs
* A Filter to add sessionId, userId, http-method and http-request-uri to all the logs
* A Filter to log all requests and the response
(Request log contents - http method, http request URI,
* An Aspect to track all method invocations and their return values
* Add httptrace using spring-actuators
