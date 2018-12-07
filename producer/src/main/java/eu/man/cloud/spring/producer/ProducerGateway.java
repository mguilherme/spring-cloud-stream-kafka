package eu.man.cloud.spring.producer;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface ProducerGateway {

    @Gateway(requestChannel = Source.OUTPUT)
    void send(MyMessage message);
}
