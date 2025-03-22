package vallegrande.webflux_demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import vallegrande.webflux_demo.model.Product;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}
