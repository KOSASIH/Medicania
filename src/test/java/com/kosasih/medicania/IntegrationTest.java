package com.kosasih.medicania;

import com.kosasih.medicania.MedicaniaApp;
import com.kosasih.medicania.config.AsyncSyncConfiguration;
import com.kosasih.medicania.config.EmbeddedElasticsearch;
import com.kosasih.medicania.config.EmbeddedKafka;
import com.kosasih.medicania.config.EmbeddedSQL;
import com.kosasih.medicania.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { MedicaniaApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
