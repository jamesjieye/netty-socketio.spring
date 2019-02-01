# An example of real-time chat application 

Built with 
- [netty-socketio 1.7.17](https://github.com/mrniko/netty-socketio) 
- Spring Boot 2.1.1.RELEASE
- socket.io-client 2.2.0

In this example, `SocketIONamespace` is used for declaring modules. 

This example project is inspired by the following projects.
- https://github.com/Heit/netty-socketio-spring
- https://github.com/mrniko/netty-socketio-demo

# Usage

## Server end

- Run server by command `mvn spring-boot:run`   
- Or build single executable jar file with `mvn package` and un single jar `java -jar rt-server.jar`

## Client end

- Put the `/client` directory under an HTTP server. Then open it from the browser after starting the server side.

# License

MIT