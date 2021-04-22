package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Component
@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
    @GetMapping("/products")
    public List<Product> listProdcuts();
}
