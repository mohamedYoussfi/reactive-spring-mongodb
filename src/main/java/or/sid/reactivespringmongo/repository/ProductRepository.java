package or.sid.reactivespringmongo.repository;
import or.sid.reactivespringmongo.entities.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
public interface ProductRepository extends ReactiveMongoRepository<Product,String> {
}
