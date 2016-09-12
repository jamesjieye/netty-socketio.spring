package com.jamesye;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatEventHandler {

    private final SocketIOServer server;

    @Autowired
    public ChatEventHandler(SocketIOServer server) {
        this.server = server;
    }

    @OnEvent(value = "chatevent")
    public void onEvent(SocketIOClient client, AckRequest request, ChatDTO data) {
        server.getBroadcastOperations().sendEvent("chatevent", data);
    }

}
