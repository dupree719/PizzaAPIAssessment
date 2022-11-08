package pizzaparlor.pizza.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pizzaparlor.pizza.models.Customer;
import pizzaparlor.pizza.services.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public void createCustomer(@Validated @RequestBody Customer customer) {
        customerService.createCustomer(customer);
    }
    @GetMapping("/customers")
    public ResponseEntity<Iterable<Customer>> getAllCustomers() {
        return customerService.getAllCustomers();
    }



}
