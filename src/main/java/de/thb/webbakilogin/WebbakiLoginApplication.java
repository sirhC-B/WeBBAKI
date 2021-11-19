package de.thb.webbakilogin;

import de.thb.webbakilogin.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class WebbakiLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebbakiLoginApplication.class, args);
    }

}
