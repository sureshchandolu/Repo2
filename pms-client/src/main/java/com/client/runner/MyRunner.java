package com.client.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.clent.model.ProductDTO;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	RestTemplate  restTemplate;

	@Override
	public void run(String... args) throws Exception {
		
		
		/*
		 * endpoint : /allProducts
		 * endpoint url:  http://localhost:2324/ProductRestApi/allProducts
		 * method: exchange(param1,param2,param3,param4)
		 * param1 -> endpoint url
		 * param2 -> HttpMethod
		 * param3 -> HttpEntity
		 * param4 -> ParameterizedTypeReference
		 * 
		 */
		/*
		ParameterizedTypeReference<List<ProductDTO>>  typeRef=new ParameterizedTypeReference<List<ProductDTO>>() {
		};
		
		ResponseEntity<List<ProductDTO>>  re = restTemplate.exchange("http://localhost:2324/ProductRestApi/allProducts", HttpMethod.GET, null, typeRef);
		
		List<ProductDTO>  productDtoList = re.getBody();
		productDtoList.forEach(System.out::println);
		*/
		
		/*
		 * endpoint: /{id}
		 * endpoint url: http://localhost:2324/ProductRestApi/{id}
		 * method: getForObject(String url, Class requiredType, Object... values)
		 */
		
		/*
		ProductDTO  pDto = restTemplate.getForObject("http://localhost:2324/ProductRestApi/{id}", ProductDTO.class, 102);
		System.out.println(pDto);
		*/
		
		/*
		 * endpoint:  /product/add
		 * endpoint url: http://localhost:2324/ProductRestApi/product/add
		 */
		
		/*
		ProductDTO  productDTO=new ProductDTO();
		productDTO.setProductId(104);
		productDTO.setProductName("IPOD");
		productDTO.setPrice(4999.0);
		productDTO.setManufacturer("Apple");
		
		HttpEntity  httpEntity=new HttpEntity(productDTO);
		ResponseEntity<String> re=restTemplate.exchange("http://localhost:2324/ProductRestApi/product/add", HttpMethod.POST, httpEntity, String.class);
		System.out.println(re.getBody());
		*/
		
		/*
		 * endpoint:  /product/delete/{id}
		 * endpoint url:  http://localhost:2324/ProductRestApi/product/delete/{id}
		 */
		ResponseEntity<String>  re = restTemplate.exchange("http://localhost:2324/ProductRestApi/product/delete/{id}", HttpMethod.DELETE, null, String.class, 102);
		System.out.println(re.getBody());
	
	}

}
