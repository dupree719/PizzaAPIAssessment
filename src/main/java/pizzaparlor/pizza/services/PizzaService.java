package pizzaparlor.pizza.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pizzaparlor.pizza.models.Customer;
import pizzaparlor.pizza.models.Pizza;
import pizzaparlor.pizza.repos.CustomerRepo;
import pizzaparlor.pizza.repos.PizzaRepo;

@Service
public class PizzaService {
    @Autowired
    PizzaRepo pizzaRepo;
    @Autowired
    CustomerRepo customerRepo;

    public void createPizza(Long customerId, Pizza pizza){
        customerRepo.findById(customerId).map(customer ->{
            pizza.setCustomer(customer);
            return pizzaRepo.save(pizza);
        });
    }
    public ResponseEntity<Iterable<Pizza>> getAllPizza() {
        Iterable<Pizza> allPizza = pizzaRepo.findAll();
        return new ResponseEntity<>(pizzaRepo.findAll(), HttpStatus.OK);
    }


}
