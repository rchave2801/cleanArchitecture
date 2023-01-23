package co.com.cleanarchitecture.api.infraestructure.adapters.jpa;

import co.com.cleanarchitecture.api.domain.model.gateways.ProductRepository;
import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.domain.model.product.dto.ProductDTO;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryAdapter implements ProductRepository {

    @Override
    public Product saveProduct(Product product) {
        //Convertir en DBO

        //Convertir de DBO a Product
        return null;
    }
}
