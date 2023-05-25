package com.geestion.pharmacier;

import com.geestion.pharmacier.entity.Product;
import com.geestion.pharmacier.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class PharmacierApplicationTests {
	@Autowired
	ProductRepository productRepository;
	@Test
	public  void  TestCreateProduct(){
		Product product = new Product("Doliprane",16.80,new Date());
		productRepository.save(product);
	}
	@Test
	public void TestUpdateProduct(){
		Product product = productRepository.findById(1L).get();
		product.setPriceProduct(15.90);
		productRepository.save(product);
	}
	@Test
	public void TestFindProductById(){
		Product product = productRepository.findById(1L).get();
		System.out.println(product);
	}
	@Test
	public void TestFindAllProducts(){
		List<Product> products=productRepository.findAll();
		products.forEach(System.out::println);
	}
	@Test
	public void TestDeleteProductById(){
		productRepository.deleteById(1L);
	}
	@Test
	public  void TestDeleteAllProducts(){
		productRepository.deleteAll();
	}

}
