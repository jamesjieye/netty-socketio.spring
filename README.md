# An example real-time project 

Built with 
- [Netty-socketio](https://github.com/mrniko/netty-socketio) and 
- Spring Boot

In this example, `SocketIONamespace` is used for declaring modules. 

This example project is inspired by the following projects.
- https://github.com/Heit/netty-socketio-spring
- https://github.com/mrniko/netty-socketio-demo

# Usage

## Server end

- Run server by command `mvn spring-boot:run`   
- Or build single executable jar file with `mvn package` and un single jar `java -jar rt-server.jar`

## Client end

- Put the `/client` directory to an HTTP server. And then open it from the browser after starting the server end.
   
# TODO

- Add test code