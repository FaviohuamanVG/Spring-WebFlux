package vallegrande.webflux_demo.rest;

import vallegrande.webflux_demo.model.Product;
import vallegrande.webflux_demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Flux<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Product> findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping("/save")
    public Mono<Product> save(@RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping("/update")
    public Mono<Product> update(@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return productService.delete(id);
    }
}