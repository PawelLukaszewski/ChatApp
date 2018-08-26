package pl.pawellukaszewski.chat.models;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Configuration
@EnableWebSocket
public class ChatSocket extends TextWebSocketHandler {

    

}
