package lt.asprogramuoju.pvexample.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Class required for auditing.
 *
 * @author pavel.vrublevskij
 * @version 1.0.0
 */
@Configuration
@EnableJpaAuditing
public class PersistanceConfig {
}
