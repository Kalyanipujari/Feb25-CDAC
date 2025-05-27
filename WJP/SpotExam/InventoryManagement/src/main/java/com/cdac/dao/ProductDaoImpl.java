package com.cdac.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cdac.model.Product;
import com.cdac.utils.DBUtils;

public class ProductDaoImpl implements ProductDao {
	private Connection conn;
	
	public ProductDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		String sql = "insert into products (product_id, name, category,price, quantity) values(?,?,?,?,?)";
		try (PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getName());
			ps.setString(3, product.getCategory());
			ps.setDouble(4, product.getPrice());
			ps.setInt(5, product.getQuantity());
			
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		String sql = "select * from products order by name ASC";
		try (PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()){
				while(rs.next()) {
					Product p = new Product(
							rs.getInt("product_id"),
							rs.getString("name"),
							rs.getString("category"),
							rs.getDouble("price"),
							rs.getInt("quantity")
							);
					list.add(p);
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		Product product = null;
		String sql = "select * from products where product_id = ?";
		try(PreparedStatement ps = conn.prepareStatement(sql))
		{
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				product = new Product(
						rs.getInt("product_id"),
						rs.getString("name"),
						rs.getString("category"),
						rs.getDouble("price"),
						rs.getInt("quantity")
						);
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		String sql = "update products set name=?, category=?, price=?, quantity=? where product_id =?";
		try(PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setString(1, product.getName());
			ps.setString(2, product.getCategory());
			ps.setDouble(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
			ps.setInt(5, product.getProductId());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		String sql = "delete from products where product_id = ?";
		try(PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setInt(1, productId);
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
