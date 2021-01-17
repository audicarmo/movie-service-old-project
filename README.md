<h1 align="center"> Movie API </h1>

<p align="justify"> Api Rest de ligação ao banco de dados de Filmes. Com ela, você consegue consultar filmes e as informações: Categoria, Idade de classificação e Data de Lançamento. </p>

![Badge](https://img.shields.io/static/v1?label=Java&message=SpringBoot&color=blue&style=for-the-badge)


### Requirements

    *[Java 11] (https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk11-downloads-2133151.html)
    *[Maven] (https://maven.apache.org/download.cgi)
    *[Docker] (https://www.docker.com/products/docker-desktop)
    *[Docker Compose] (https://docs.docker.com/compose/install/)


## Getting Started

## Prepare the evironment

Add evironment variable M2_HOME

### Configure Database

Start database docker

```sh
docker-compose up -d
```

Be sure that container has been started
```sh
docker-compose ps
```

To accompain the log
```sh
docker-compose logs -f
```

Execute script to create database schema
```sh
bash setup-db.sh
```

To compile the project, run the command:
```sh
mvn clean compile
```
