package com.yangguojun.web.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceInfoUtil implements ApplicationListener<EmbeddedServletContainerInitializedEvent>{

    private static EmbeddedServletContainerInitializedEvent event;
    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
        ServiceInfoUtil.event = event;
    }

    public static int getPort(){
        int port = event.getEmbeddedServletContainer().getPort();
        return port;
    }
}
