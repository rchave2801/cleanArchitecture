package co.com.cleanarchitecture.api.domain.model.product.dto;

import co.com.cleanarchitecture.api.domain.model.product.Product;

public class ProductDTO {

    private Integer id;
    private String name;
    private Integer price;

    public ProductDTO(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public ProductDTO fromDomain(Product product){
        return new ProductDTO();
    }

    public Product toDomain(ProductDTO productDTO){
        return new Product();
    }
}
