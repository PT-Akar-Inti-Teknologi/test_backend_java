# Java Test
## Summary

Your task is to create PPOB Gateway modules and PPOB Aggregator Modules using Spring Boot.

PPOB Gateway: a module that accepts requests such as credit purchases or bill payments (such as telephone and electricity bills).
PPOB Aggregator: is a module that provides module products that accept requests such as credit purchases or bill payments.

In this case PPOB Gateway is considered as an aggregator and our PPOB Gateway takes the items from other PPOB Aggregators.

example PPOB Aggregator: https://www.rajabiller.com/

This repository contains a starter app ready for you to work on. Feel free to add any additional libraries you need.

## Project Starter

* Java version: 16 
* Spring version: 2.5.4
* Kafka Version: 2.13 (download: https://kafka.apache.org/quickstart)
* Database: PostgreSQL (Any Version)
* Dependency List:
1. Spring Data JPA
	* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
2. PostgreSQL Driver 
	* A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code.
3. Spring Boot Actuator
	* Supports built in (or custom) endpoints that let you monitor and manage your application - such as application health, metrics, sessions, etc.
4. Spring for Apache Kafka
	* Publish, subscribe, store, and process streams of records.
5. Spring Web
	* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
6. Spring Reactive Web 
	* Build reactive web applications with Spring WebFlux and Netty.

## Instructions

### Objective

Design and implement the PPOB Gateway Module and PPOB Aggregator Module, Your Assessment will be assessed based on the main indicators stated in the Assessment Aspects section

The PPOB Gateway module functions as a backend API for client applications using a RESTful interface with JSON as the data format.
The PPOB Aggregator module functions as a PPOB Gateway supplier by using a RESTful API interface with JSON as the data format.
As well as using kafka technology which functions as a message broker in sending a successful transaction response from the PPOB Aggregator to the PPOB Gateway.

Develop the task with the mindset that it must be ready for production. 

### Design

![alt text](https://github.com/PT-Akar-Inti-Teknologi/test_backend_java/blob/main/architecture.png)

Flow Details

1. H2H Client makes a request (POST) for PPOB product item payments
2. PPOB Gateway validates and records client requests then forwards the request (POST) to the PPOB Aggregator
3. PPOB Aggregator receives the request and sends a response that the transaction is being processed
4. PPOB Gateway forwards the response to the H2H client with an additional reference number for the transaction

* a. The transaction request has been successfully processed, then PPOB Aggregator makes a callback via Kafka as producer
* b. PPOB Gateway that acts as a subscriber receives the message that has been inputted and then changes the status of the transaction that has occurred 
* c. PPOB Gateway forwards the transaction results to the H2H client with API callbacks


## Submission

1. Fork this repository
2. Make some changes with proper commit logs
3. Make a Pull Request

## Test Conditions

1. Use **WebClient** as the interface that represents the main entry point for making web requests
2. Modify default JSON error response from Spring Boot Rest Controller with the ResponseTemplate that has been provided 
	* Example default response springboot on error:
	* {
	*    "timestamp" : 1426615606,
	*    "exception" : "org.springframework.web.bind.MissingServletRequestParameterException",
	*    "status" : 400,
	*    "error" : "Bad Request",
	*    "path" : "/welcome",
	*    "message" : "Required String parameter 'name' is not present"
	* }
3. Use and implement all interface functions provided, the rest Feel free to add any code.
4. Use OAUTH authentication using JWT tokens in each module, the security method is up to you
5. Use Lombok.

## Assessment Aspects

* Using the features of java programming (Optional, Lambda and Generic)
* Feature completeness
* Code cleanliness
* Quality assessment with unit test and or functional API test

Good luck.