package com.cdac.controller;

import java.io.IOException;
import java.sql.Connection;

import com.cdac.dao.ProductDao;
import com.cdac.model.Product;
import com.cdac.dao.ProductDaoImpl;
import com.cdac.utils.DBUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(value ="/", loadOnStartup = 1)
public class FrontController extends HttpServlet{
	private ProductDao productDao;
	private Connection conn;
	
	public void init() throws ServletException{
		try {
			conn = DBUtils.openConnection(getServletContext());
			productDao = new ProductDaoImpl(conn);
		}
		catch(Exception e) {
			throw new ServletException(e);
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String action = req.getParameter("action");
		
		if(action==null || action.equals("list")) {
			listProducts(req,resp);
		}
		else if(action.equals("add")) {
			req.getRequestDispatcher("/WEB-INF/views/add.jsp").forward(req, resp);
		}
		else if(action.equals("edit")) {
			int id=Integer.parseInt(req.getParameter("id"));
			Product p = productDao.getProductById(id);
			req.setAttribute("product", p);
			req.getRequestDispatcher("/WEB-INF/views/edit.jsp").forward(req, resp);
		}
		else if(action.equals("delete")) {
			int id=Integer.parseInt(req.getParameter("id"));
			productDao.deleteProduct(id);
			resp.sendRedirect("?");
		}
		else {
			listProducts(req,resp);
		}
	}

	private void listProducts(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Product> list = productDao.getAllProducts();
		req.setAttribute("productList", list);
		req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if(action.equals("add")) {
			addProduct(req,resp);
		}
		else if(action.equals("edit"))
		{
			editProduct(req,resp);
		}
		else {
			resp.sendRedirect("?");
		}
	}
	  private void addProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	        try {
	            int id = Integer.parseInt(req.getParameter("productId"));
	            String name = req.getParameter("name");
	            String category = req.getParameter("category");
	            double price = Double.parseDouble(req.getParameter("price"));
	            int quantity = Integer.parseInt(req.getParameter("quantity"));

	            if(name.isEmpty() || category.isEmpty()){
	                req.setAttribute("error", "All fields are required!");
	                req.getRequestDispatcher("/WEB-INF/views/add.jsp").forward(req, resp);
	                return;
	            }

	            Product p = new Product(id, name, category, price, quantity);
	            productDao.addProduct(p);
	            resp.sendRedirect("?");
	        } catch (Exception e) {
	            req.setAttribute("error", "Invalid Input");
	            req.getRequestDispatcher("/WEB-INF/views/add.jsp").forward(req, resp);
	        }
	    }

	    private void editProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	        try {
	            int id = Integer.parseInt(req.getParameter("productId"));
	            String name = req.getParameter("name");
	            String category = req.getParameter("category");
	            double price = Double.parseDouble(req.getParameter("price"));
	            int quantity = Integer.parseInt(req.getParameter("quantity"));

	            if(name.isEmpty() || category.isEmpty()){
	                req.setAttribute("error", "All fields are required!");
	                req.setAttribute("product", new Product(id, name, category, price, quantity));
	                req.getRequestDispatcher("/WEB-INF/views/edit.jsp").forward(req, resp);
	                return;
	            }

	            Product p = new Product(id, name, category, price, quantity);
	            productDao.updateProduct(p);
	            resp.sendRedirect("?");
	        } catch (Exception e) {
	            req.setAttribute("error", "Invalid Input");
	            req.getRequestDispatcher("/WEB-INF/views/edit.jsp").forward(req, resp);
	        }
	    }

	    @Override
	    public void destroy() {
	        try {
	            DBUtils.closeConnection();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
