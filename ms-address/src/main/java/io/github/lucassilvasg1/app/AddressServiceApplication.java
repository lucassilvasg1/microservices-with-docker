package io.github.lucassilvasg1.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "io.github.lucassilvasg1.controller", "io.github.lucassilvasg1.service" })
@EntityScan("io.github.lucassilvasg1.entity")
@EnableJpaRepositories("io.github.lucassilvasg1.repository")
public class AddressServiceApplication
{

   public static void main(String[] args)
   {
      SpringApplication.run(AddressServiceApplication.class, args);
   }

}
