package co.com.cleanarchitecture.api.infraestructure.adapters.jpa;

import co.com.cleanarchitecture.api.domain.model.gateways.ProductRepository;
import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.domain.model.product.dto.ProductDTO;

public class ProductReposirotyAdapter implements ProductRepository {

    @Override
    public Product saveProduct(ProductDTO productDTO) {
        return null;
    }
}
