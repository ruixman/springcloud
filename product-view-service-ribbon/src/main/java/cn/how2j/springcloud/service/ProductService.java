package cn.how2j.springcloud.service;

import cn.how2j.springcloud.client.ProductClientFeign;
import cn.how2j.springcloud.client.ProductClientRibbon;
import cn.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProductService {
	@Autowired ProductClientRibbon productClientRibbon;
	@Autowired ProductClientFeign productClientFeign;

	public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();
	}

	public List<Product> listPorducts2(){
		return productClientFeign.listProdcuts();
	}

}
