# ivory-test Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

API created for Ivory dev test.

## Resources used
- Java
- Quarkus
- Redis
- Maven
- Docker
- Angular (front-end)

## Redis database

``` shell script 
docker run --ulimit memlock=-1:-1 -it --rm=true --memory-swappiness=0 --name redis_quarkus_test -p 6379:6379 redis:5.0.6
```

## Running the application

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Endpoint for task registration

``` sehll script
http://localhost:8080/add/task
```

### Model Json
{
    "title": "string",
    "description": "string"
}


## Front-End
https://github.com/rodrigokaconde/-mandalorian-dev-test-front.git
