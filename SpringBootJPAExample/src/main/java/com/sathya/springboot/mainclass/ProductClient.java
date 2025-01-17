package com.sathya.springboot.mainclass;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sathya.springboot.Product;
import com.sathya.springboot.mapper.ProductMapper;
import com.sathya.springboot.model.ProductDetails;
import com.sathya.springboot.respository.ProductRepository;

@Component
public class ProductClient implements CommandLineRunner
{
	@Autowired
	ProductRepository productRespository;
	
	@Autowired
	ProductMapper productMapper;

	@Override
	public void run(String... args) throws Exception {
		//model class data: having the values
		
		ProductDetails productDetails = new ProductDetails();
		productDetails.setProId(1);
		productDetails.setProName("chitapandu");
		productDetails.setProPrice(220);
		
		//conversion of model class data to entity
		Product product = productMapper.modelToEntityConversion(productDetails);
		
		//1.save
		productRespository.save(product);
		
		ProductDetails p1 = new ProductDetails();
		p1.setProId(2);
		p1.setProName("sugar");
		p1.setProPrice(22);
		
		ProductDetails p2 = new ProductDetails();
		p2.setProId(3);
		p2.setProName("salt");
		p2.setProPrice(2202);
		
		List<ProductDetails> productDetails2 = List.of(p1,p2);
		List<Product>  products =productMapper.modelToEntityConversion(productDetails2);
		//2.save all
		productRespository.saveAll(products);
		
		//3.findById
		Optional<Product> product1=productRespository.findById(1);
			if(product1.isPresent())
				{
				System.out.println(product1);
				}
			else
			{
				System.out.println("product is not available");
			}
		
		
		
		
		//4.count
		Long count=productRespository.count();
		System.out.println("Total record in database..."+count);
		
		//5.findAll
		List<Product> products2=productRespository.findAll();
		System.out.println(products2);
		
		//6.deleteById
		productRespository.deleteById(1);
		
		//7.deleteAll
		productRespository.deleteAll();
		
		//8.existById
	 boolean status =	productRespository.existsById(111);
	 System.out.println(status);
		
		
		
		
		
		
		
	}
	
	
}
