package com.createiq.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.bean.Product;
import com.createiq.service.ProductService;
import com.createiq.service.ProductServiceImpl;

/**
 * Servlet implementation class AddProductController
 */
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		Double pcost = Double.parseDouble(request.getParameter("pcost"));
		Product product = new Product(pid, pname, pcost);
		ProductService productService = new ProductServiceImpl();
		productService.save(product);
		request.setAttribute("successMsg", "Product created Success fully with Product Id : "+pid);
		request.getRequestDispatcher("./findController").forward(request, response);
	}

}
