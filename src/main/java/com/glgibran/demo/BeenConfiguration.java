package com.glgibran.demo;

import com.glgibran.demo.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeenConfiguration {

    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Buat foo baru");
        return foo;
    }

}
