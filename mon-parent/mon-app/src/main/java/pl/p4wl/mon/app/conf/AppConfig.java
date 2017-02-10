package pl.p4wl.mon.app.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pl.p4wl.mon.web.config.WebConfig;

@Configuration
@Import(WebConfig.class)
public class AppConfig {
}
