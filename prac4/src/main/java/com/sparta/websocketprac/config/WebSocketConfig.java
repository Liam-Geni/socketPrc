package com.sparta.websocketprac.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration//설정이라는것을 알수있음
@EnableWebSocket//소켓 실행
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        pure webSocket
//        registry.addHandler(new ReplyEchoHandler(), "/replyEcho").setAllowedOrigins("*");
//        sockJs
        registry.addHandler(new ReplyEchoHandler(), "/replyEcho").setAllowedOrigins("*").withSockJS();

    }
}
