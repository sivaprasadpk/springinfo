package com.sathya.springboot.mapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sathya.springboot.Product;
import com.sathya.springboot.model.ProductDetails;
@Component
public class ProductMapper 
{
	public Product modelToEntityConversion(ProductDetails productDetails)
	{
		Product product = new Product();
		product.setProId(productDetails.getProId());
		product.setProName(productDetails.getProName());
		product.setProPrice(productDetails.getProPrice());
		product.setCreateAt(System.getProperty("user.name"));
		product.setUpdateAt(LocalDate.now());

		
		return product;
	
	}
	
	public List<Product> modelToEntityConversion(List<ProductDetails> productdetails)
	{
		List<Product> products= new ArrayList<Product>();
		for(ProductDetails details: productdetails)
		{
			Product product = new Product();
			product.setProId(details.getProId());
			product.setProName(details.getProName());
			product.setProPrice(details.getProPrice());
			product.setCreateAt(System.getProperty("user.name"));
			product.setUpdateAt(LocalDate.now());
			products.add(product);
		}
		return products;
	}
}
