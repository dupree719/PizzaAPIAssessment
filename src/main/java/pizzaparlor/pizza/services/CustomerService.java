package pizzaparlor.pizza.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pizzaparlor.pizza.models.Customer;
import pizzaparlor.pizza.repos.CustomerRepo;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
    public ResponseEntity<Iterable<Customer>> getAllCustomers() {
        Iterable<Customer> allCustomers = customerRepo.findAll();
        return new ResponseEntity<>(customerRepo.findAll(), HttpStatus.OK);
    }
}
