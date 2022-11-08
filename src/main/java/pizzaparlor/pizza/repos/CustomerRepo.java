package pizzaparlor.pizza.repos;

import org.springframework.data.repository.CrudRepository;
import pizzaparlor.pizza.models.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
