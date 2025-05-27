package com.cdac.dao;
import java.util.List;
import com.cdac.model.Product;
public interface ProductDao {
	void addProduct(Product product);
	List<Product> getAllProducts();
	Product getProductById(int productId);
	void updateProduct(Product product);
	void deleteProduct(int productId);
}
