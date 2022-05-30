package dev.avanzi.customer.repository;

import dev.avanzi.customer.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {


}
