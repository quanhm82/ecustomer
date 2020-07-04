# Getting Started

### Introduction
eCusomter service expose APIs (HATEOAS) for read/save resources such as Customer. Swagger-ui is rendered at runtime to make it easier to call APIs.


### Guides
Building jar file by maven
```sh
$ mvn clean install
```
Starting eOrder instance with "dev" profile.
```sh
$ cd target
...
$ java -jar ecustomer-{version}.jar -Dspring.profile.active=dev
```
Access eCustomer by http://localhost:8080/swagger-ui.html
