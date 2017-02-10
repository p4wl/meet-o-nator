package pl.p4wl.mon.app.conf;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import pl.p4wl.mon.web.config.WebConfig;

@Configuration
@Import(WebConfig.class)
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertyPlaceholderConfigurer();
    }

}
