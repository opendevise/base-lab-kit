package com.tomitribe.training.setup;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.logging.Logger;

@RunWith(Arquillian.class)
public class SmokeTest {
    public static @Deployment Archive<?> createTestArchive() {
        return ShrinkWrap.create(WebArchive.class);
    }

    @Test
    public void shouldSayHiFromContainer() throws Exception {
        Logger.getLogger(getClass().getName()).info("Hello from test running in " + Thread.currentThread().getContextClassLoader());
    }
}
