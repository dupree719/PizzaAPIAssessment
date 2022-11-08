package pizzaparlor.pizza.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pizzaparlor.pizza.models.Pizza;
import pizzaparlor.pizza.services.PizzaService;

@RestController
public class PizzaController{
    @Autowired
    private PizzaService pizzaService;

    @PostMapping("/pizza/{customerID}/pizza")
    public void createPizza(@PathVariable(value = "customerID") Long customerID, @Validated @RequestBody Pizza pizza) {
        pizzaService.createPizza(customerID, pizza);
    }

    @GetMapping("/pizza")
    public ResponseEntity<Iterable<Pizza>> getAllPizza() {
        return pizzaService.getAllPizza();
    }
}
