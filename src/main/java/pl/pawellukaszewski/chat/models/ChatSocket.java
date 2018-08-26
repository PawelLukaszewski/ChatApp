package pl.pawellukaszewski.chat.models;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Configuration
@EnableWebSocket
public class ChatSocket extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println("new message");
    }
}
