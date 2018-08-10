package pers.zy.fasterxml.study;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class PropertyNameingStrateyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertyNameingStrateyApplication.class, args);
    }

    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = buildObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper;
    }

    @Bean("camelCaseObjectMapper")
    public ObjectMapper camelCaseObjectMapper() {
        return buildObjectMapper();
    }

    @Bean("upperCamelCaseObjectMapper")
    public ObjectMapper upperCamelCaseObjectMapper() {
        ObjectMapper mapper = buildObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        return mapper;
    }

    private ObjectMapper buildObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//		mapper.setSerializerProvider(new CustomNullObjectSerializerProvider());
        return mapper;
    }
}
