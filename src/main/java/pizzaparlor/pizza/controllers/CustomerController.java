package pizzaparlor.pizza.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/customer/{customerID}")
    public ResponseEntity<?> getCustomer(@PathVariable Long customerID) {
        return customerService.getCustomer(customerID);
    }
    @PutMapping("/customer/{customerID}")
    public void updateCategory(@RequestBody Customer customer, @PathVariable Long customerID) {

        customerService.updateCustomer(customer, customerID);
    }
    @DeleteMapping("/customer/{customerID}")
    public void deleteCategory(@PathVariable Long customerID) {

        customerService.deleteCustomer(customerID);
    }



}
