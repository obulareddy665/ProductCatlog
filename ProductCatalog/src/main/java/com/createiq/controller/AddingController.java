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
 * Servlet implementation class AddingController
 */
public class AddingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		Double pcost=Double.parseDouble(request.getParameter("pprice"));
		
		Product product=new Product(pid, pname, pcost);
		ProductService ps=new ProductServiceImpl();
		ps.update(product);
			//request.setAttribute("products", product);
		request.setAttribute("successMsg", "update of project sucessfully with id no record"+pid);
		request.getRequestDispatcher("./findController").forward(request, response);
	}

}
