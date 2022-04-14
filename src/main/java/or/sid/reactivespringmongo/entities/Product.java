package or.sid.reactivespringmongo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Data @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private double quantity;
    @DBRef
    private Category category;
}
