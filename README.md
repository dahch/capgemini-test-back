# How to run SpringBoot application in Tomcat with Docker

## Dockerfile explained

```
FROM tomcat:latest
ADD target/employees-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
```
| Keyword | Usage   |
| ------- | ------- |
| FROM    | Base image on top of which our custom image is to be build  |
| ADD     | Copy war file into webapps folder inside Docker             |
| EXPOSE  | Expose port 8080 outside Docker container                   |
| CMD     | The command to be executed when the Docker image is run     |

Now run the command

```
> docker-compose up --build
```

Once the docker container is up, try hitting http://localhost:8080/employees
