package com.glgibran.demo;

import com.glgibran.demo.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeenTest {
    @Test
    void testCobaBeen() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeenConfiguration.class);
        Assertions.assertNotNull(context);
    }

    @Test
    void testGetbeen() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeenConfiguration.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Assertions.assertSame(foo1, foo2);
    }
}
