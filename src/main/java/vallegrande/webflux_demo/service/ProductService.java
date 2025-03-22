package vallegrande.webflux_demo.service;

import vallegrande.webflux_demo.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

    Flux<Product> findAll();

    Mono<Product> findById(String id);

    Mono<Product> save(Product product);

    Mono<Product> update(Product product);

    Mono<Void> delete(String id);
}
