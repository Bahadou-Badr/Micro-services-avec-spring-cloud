package org.sid.customerserivce;

import org.sid.customerserivce.entities.Customer;
import org.sid.customerserivce.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerSerivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSerivceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null,"Amine","amine@gmail.com"));
			customerRepository.save(new Customer(null,"Said","said@gmail.com"));
			customerRepository.save(new Customer(null,"Ahmed","ahmed@gmail.com"));
			customerRepository.findAll().forEach(customer -> {
				System.out.println(customer.toString());
			});
		};
	}
}
