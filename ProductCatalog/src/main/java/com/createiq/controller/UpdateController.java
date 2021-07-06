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
 * Servlet implementation class UpdateController
 */
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer pid=Integer.parseInt(request.getParameter("pid"));
		ProductService ps=new ProductServiceImpl();
		Product product=  ps.findById(pid);
		request.setAttribute("product",product);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	
}
