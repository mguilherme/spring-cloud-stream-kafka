package eu.man.cloud.spring.producer;

import lombok.Data;

import java.time.Instant;

@Data
public class MyMessage {

    String title;
    Instant timestamp;

}
