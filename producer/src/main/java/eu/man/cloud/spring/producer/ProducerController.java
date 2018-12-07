package eu.man.cloud.spring.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "messages")
public class ProducerController {

    private final ProducerGateway producerGateway;

    @PostMapping
    public ResponseEntity<MyMessage> sendMessage(@RequestBody MyMessage myMessage) {
        producerGateway.send(myMessage);

        return ResponseEntity.ok(myMessage);
    }

}
