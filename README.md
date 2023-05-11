# Spring Boot - Kotlin - RabbitMQ

### Table of Contents
1. [Introduction](#introduction)
   1. [Motivation](#motivation)
   2. [Tool Chain](#tool-chain)
   3. [Guides](#guides)
2. [Getting Started](#getting-started)
   1. [Pre-requisites](#pre-requisites)
   2. [Running](#running)
   3. [Architecture](#architecture)
   4. [Software Model Diagram](#software-model-diagram)

<a name="introduction"></a>
## Introduction
<a name="motivation"></a>
### Motivation
This project made to demonstrate Api implementation of Magic Coffee Machine using RabbitMQ messaging.

<a name="tools"></a>
### Tool Chain
This project includes following tools/frameworks
* [Gradle](https://docs.gradle.org)
* [Java 17](https://docs.oracle.com/en/java/javase/17/)
* [Spring Boot 2.7.11](https://docs.spring.io/spring-boot/docs/2.7.11/reference/html/)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/2.7.11/reference/htmlsingle/#messaging.amqp)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.11/reference/htmlsingle/#web)
* [Gradle 7.6](https://docs.gradle.org/current/userguide/userguide.html)
* [Docker](https://docs.docker.com/)
* [Swagger](https://swagger.io/tools/swagger-ui/)

<a name="guide"></a>
### Guides
The following guides illustrate how to use some features concretely:
* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

<a name="gettingstart"></a>
## Getting Started

<a name="preprequisites"></a>
#### Pre-requisites
* Install docker from [this link](https://docs.docker.com/get-docker/)
* Clone the project and cd into it's root folder

<a name="running"></a>
#### Running
* Run the docker composer with following command
  ``docker-compose up -d``
* When initialization is complete of docker containers. Api will be ready to take calls on `localhost:8080`
* For ease of use swagger is implemented to project which is accessible at `http://localhost:8080/swagger-ui/index.html`
* Other available endpoints are listed below
   * `GET /healthcheck` Returns contain the server status.
   * `GET /order/available` Returns available drink options for `drink_type` field
   * `POST /order` Sending body with following format will enqueue the drink to brew process
     `{"drink_type" : "coffee", "sugar_amount" : 1, "with_milk" : true}`
     <a name="architecture"></a>
#### Architecture
This project (trying to) follow Clean Code Architecture as it can be seen in image
![CleanArchitecture.jpg](docs%2FCleanArchitecture.jpg)
<a name="model"></a>
#### Software Model Diagram
![C4Model.png](docs%2FC4Model.png)