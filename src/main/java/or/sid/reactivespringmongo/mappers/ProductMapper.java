package or.sid.reactivespringmongo.mappers;

import or.sid.reactivespringmongo.dto.ProductDTO;
import or.sid.reactivespringmongo.entities.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ProductMapper {
    public ProductDTO from(Product product){
        ProductDTO productDTO=new ProductDTO();
        BeanUtils.copyProperties(product,productDTO);
        return productDTO;
    }
}
