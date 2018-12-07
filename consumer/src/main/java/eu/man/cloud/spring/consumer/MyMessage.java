package eu.man.cloud.spring.consumer;

import lombok.Data;

import java.time.Instant;

@Data
public class MyMessage {

    String title;
    Instant timestamp;

}
