package org.sid.inventoryserivce;

import org.sid.inventoryserivce.entities.Product;
import org.sid.inventoryserivce.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventorySerivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorySerivceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			productRepository.save(new Product(null,"Lenovo",6690,9));
			productRepository.save(new Product(null,"HP",6300,11));
			productRepository.save(new Product(null,"Dell",5880,8));
			productRepository.findAll().forEach(product -> {
				System.out.println(product.getName());
			});
		};
	}
}
