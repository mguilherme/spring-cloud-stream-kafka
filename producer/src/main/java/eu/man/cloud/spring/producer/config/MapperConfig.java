package eu.man.cloud.spring.producer.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ObjectMapper objectMapper() {
        var objectMapper = new ObjectMapper();
        objectMapper.registerModules(new JavaTimeModule());

        return objectMapper;
    }

}
