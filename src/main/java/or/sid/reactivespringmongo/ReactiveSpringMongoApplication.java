package or.sid.reactivespringmongo;

import or.sid.reactivespringmongo.entities.Category;
import or.sid.reactivespringmongo.entities.Product;
import or.sid.reactivespringmongo.repository.CategoryRepository;
import or.sid.reactivespringmongo.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class ReactiveSpringMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveSpringMongoApplication.class, args);
    }

    // Comments
    @Bean
    CommandLineRunner start(ProductRepository productRepository, CategoryRepository categoryRepository){
        return args -> {

            categoryRepository.deleteAll().block();
            productRepository.deleteAll().block();
            Stream.of("Computers","Printers").forEach(cat->{
                categoryRepository.save(new Category(null,cat,new ArrayList<>())).block();
            });
            categoryRepository.findAll().subscribe(cat->{
                for (int i = 1; i <5 ; i++) {
                    productRepository.save(new Product(null,cat.getName()+" "+i,))
                }
            });
        };
    }
}
