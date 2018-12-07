package eu.man.cloud.spring.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Handler {

    @StreamListener(target = Sink.INPUT)
    public void handle(@Payload MyMessage payload, @Headers MessageHeaders headers) {
        log.info("Received message: {}", payload);
    }

}
