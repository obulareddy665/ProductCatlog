package com.createiq.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.bean.Product;
import com.createiq.dao.ProductDao;
import com.createiq.dao.ProductDaoImpl;
import com.createiq.service.ProductService;
import com.createiq.service.ProductServiceImpl;

/**
 * Servlet implementation class FindAllController
 */
public class FindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService ps=new ProductServiceImpl();
		
	List<Product> products=	ps.findAll();
	System.out.println(products);
	request.setAttribute("products", products);
	request.getRequestDispatcher("findAll.jsp").forward(request, response);
	
	}

}
