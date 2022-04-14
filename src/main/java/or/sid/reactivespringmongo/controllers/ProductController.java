package or.sid.reactivespringmongo.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import or.sid.reactivespringmongo.dto.ProductDTO;
import or.sid.reactivespringmongo.entities.Product;
import or.sid.reactivespringmongo.mappers.ProductMapper;
import or.sid.reactivespringmongo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private ProductRepository productRepository;
    private ProductMapper productMapper;
    @GetMapping("")
    public Flux<ProductDTO> products(){
        return productRepository.findAll().map(productMapper::from);
    }
}
