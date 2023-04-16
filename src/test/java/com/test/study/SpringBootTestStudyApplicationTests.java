package com.test.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootTest( properties = {
    "spring.config.location=classpath:application-test.yml"
})
class SpringBootTestStudyApplicationTests {

    @Test
    void contextLoads() {
    }

}
