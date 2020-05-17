# Course Management Rest API

## About

A Spring boot application for managing back-end for course management.

This practice application provides full CRUD functionality for topics and courses (many to one) and entity relationships using Spring Data JPA and Apache Derby as back-end. 

## Technology Stack

1. Developed using Spring boot
1. Back-end managed by Spring Data JPA
1. Back-end provided by Apache Derby

## Developer

-  Adnan Hakim [github.com/adnanhakim](https://github.com/adnanhakim)

## List of APIs

- `GET` `/topics`: Get all topics
- `GET` `/topics/{topicId}`: Get topic by id
- `POST` `/topics`: Add new topic
- `PUT` `/topics/{topicId}`: Update topic by id
- `DELETE` `/topics/{topicId}`: Delete topic by id
- `GET` `/topics/{topicId}/courses`: Get all courses by topic id
- `GET` `/topics/{topicId}/courses/{courseId}`: Get course by id
- `POST` `/topics/{topicId}/courses`: Add new course
- `PUT` `/topics/{topicId}/courses/{courseId}`: Update course by id
- `DELETE` `/topics/{topicId}/courses/{courseId}`: Delete course by id

## Build

-  Clean and install project
    ```shell script
   mvnw clean install 
   ```
-  Run spring application
    ```shell script
   java -jar target/course-api-0.0.1-SNAPSHOT.jar
   ```

## MIT LICENSE

> Copyright (c) 2020 Adnan Hakim
>
> Permission is hereby granted, free of charge, to any person obtaining a copy
> of this software and associated documentation files (the "Software"), to deal
> in the Software without restriction, including without limitation the rights
> to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
> copies of the Software, and to permit persons to whom the Software is
> furnished to do so, subject to the following conditions:
>
> The above copyright notice and this permission notice shall be included in all
> copies or substantial portions of the Software.
>
> THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
> IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
> FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
> AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
> LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
> OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
> SOFTWARE.
