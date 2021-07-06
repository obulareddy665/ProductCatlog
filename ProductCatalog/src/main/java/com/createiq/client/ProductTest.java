package com.createiq.client;

import com.createiq.service.ProductService;
import com.createiq.service.ProductServiceImpl;

public class ProductTest {
	public static void main(String[] args) {
		ProductService ps=new ProductServiceImpl();
		System.out.println(ps.findById(3));
	}

}
