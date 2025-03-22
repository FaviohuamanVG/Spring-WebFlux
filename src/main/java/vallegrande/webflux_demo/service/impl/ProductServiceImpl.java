package vallegrande.webflux_demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vallegrande.webflux_demo.model.Product;
import vallegrande.webflux_demo.repository.ProductRepository;
import vallegrande.webflux_demo.service.ProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    public Flux<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Product> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Product> save(Product product) {
        return repository.save(product);
    }

    @Override
    public Mono<Product> update(Product product) {
        return repository.findById(product.getId())
            .flatMap(existingProduct -> repository.save(product));
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }
} 