package pizzaparlor.pizza.repos;

import org.springframework.data.repository.CrudRepository;
import pizzaparlor.pizza.models.Pizza;

public interface PizzaRepo extends CrudRepository<Pizza, Long> {
}
