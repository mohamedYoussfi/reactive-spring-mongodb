package or.sid.reactivespringmongo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Data @NoArgsConstructor @AllArgsConstructor
public class Category {
    @Id
    private String id;
    private String name;
    private List<Product> products=new ArrayList<>();
}
