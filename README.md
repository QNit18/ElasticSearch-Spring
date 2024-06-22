# Spring Boot + Elasticsearch Deployment with Docker

This project demonstrates how to deploy a Spring Boot application with Elasticsearch using Docker and Docker Compose.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project sets up a Spring Boot application along with Elasticsearch and Kibana services using Docker. Elasticsearch is a distributed search and analytics engine, and Kibana is its companion visualization tool.

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- [Docker](https://www.docker.com/get-started)
- [Docker Compose](https://docs.docker.com/compose/install/)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) (version 8 or above)
- [Maven](https://maven.apache.org/install.html)

## Installation

1. **Clone the Repository:**

    ```sh
    git clone https://github.com/your-username/spring-boot-elasticsearch-docker.git
    cd spring-boot-elasticsearch-docker
    ```

2. **Build the Spring Boot Application:**

    ```sh
    mvn clean package
    ```

3. **Setup Docker Containers:**

    Ensure your `docker-compose.yml` file looks like this:

    ```
    docker-compose up -d
    ```

## Usage

1. **Run the Spring Boot Application:**

    ```sh
    java -jar target/your-spring-boot-app.jar
    ```

2. **Access Elasticsearch:**

    Open your browser and navigate to `http://localhost:9200` to access Elasticsearch.

3. **Access Kibana:**

    Open your browser and navigate to `http://localhost:5601` to access Kibana.

## Troubleshooting

If you encounter any issues, consider the following steps:

- **Check Docker Containers:**

    Ensure all Docker containers are running:

    ```sh
    docker ps
    ```

- **Check Logs:**

    View logs for the Elasticsearch service:

    ```sh
    docker-compose logs elasticsearch
    ```

    View logs for the Kibana service:

    ```sh
    docker-compose logs kibana
    ```

- **Rebuild and Restart:**

    If issues persist, try rebuilding and restarting the Docker containers:

    ```sh
    docker-compose down
    docker-compose up --build
    ```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
