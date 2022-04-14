package or.sid.reactivespringmongo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data @NoArgsConstructor @AllArgsConstructor
public class ProductDTO {
    private String id;
    private String name;
    private double price;
}
