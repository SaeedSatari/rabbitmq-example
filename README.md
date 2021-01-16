# rabbitmq-example

An Example for integrating Spring boot and RabbitMQ. RabbitMQ is an open-source message-broker software that originally implemented the Advanced Message Queuing Protocol and has since been extended with a plug-in architecture to support Streaming Text Oriented Messaging Protocol, MQ Telemetry Transport, and other protocols. 

## Getting started

### Prerequisites:

- Java 11
- Spring Boot 2.4.1
- RabbitMQ as our message broker
- Maven as our project management and comprehension tool

### Tools:
- IntelliJ IDEA
- Lombok

### Installing RabbitMQ on windows:

There are several ways to install RabbitMQ on your machine. Here, I used chocolaty to install:

- Run cmd.exe
- Run the following command to install chocolaty:

```bash
    @"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "[System.Net.ServicePointManager]::SecurityProtocol = 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"
```

- To install RabbitMQ using chocolaty, run the following command:

```bash
    choco install rabbitmq
```

### Start RabbitMQ server:

- Run cmd.exe
- Navigate to the sbin directory of the RabbitMQ Server installation directory
- Run the following command to enable the plugin:

```bash
    rabbitmq-plugins.bat enable rabbitmq_management
```

The RabbitMQ service starts automatically. You can stop/reinstall/start the RabbitMQ service from the Start Menu.

### Access to RabbitMQ management console:

Once all done open : http://localhost:15672/ for opening the rabbitmq management.

- username = guest
- password = guest

### Clone the repository

```bash
    git clone https://github.com/SaeedSatari/rabbitmq-example.git
```

### Run the app using maven

```bash
    cd rabbitmq-example
    mvn spring-boot:run
```

### Testing:

Call http://localhost:8080/rabbitmq-example/producer?name=testProduct&id=1 to create and send a simple message to the broker. Then, you can see these logs on console:

- Sending Message to RabbitMQ = Product(name=testProduct, id=1)
- Received Message From RabbitMQ = Product(name=testProduct, id=1)

I hope this example helps developers who want to learn more about RabbitMQ and Spring Boot integrity.
If you have any questions, please feel free to reach me by email: saeedsatari93@gmail.com 
