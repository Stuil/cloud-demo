package com.productdemo.webSocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @title: WebSocketStompConfig
 * @description:
 * @date: 2020/12/23
 * @author: stuil
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */

@Configuration
public class WebSocketStompConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
