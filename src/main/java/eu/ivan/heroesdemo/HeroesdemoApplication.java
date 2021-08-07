package eu.ivan.heroesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@SpringBootApplication
public class HeroesdemoApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(HeroesdemoApplication.class, args);
	}
	
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
        .allowedOriginPatterns("http://localhost:*");
        
        
    }

}
