package vallegrande.webflux_demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import vallegrande.webflux_demo.model.Product;

public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {
}
