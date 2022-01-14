package org.sid.inventoryserivce.repository;

import org.sid.inventoryserivce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {

}
