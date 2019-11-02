package com.lili.controller.front;


import com.lili.Service.IProductService;
import com.lili.common.ServerResponse;
import com.lili.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/front/product/")
public class FrontProductController {

    @Autowired
    IProductService productService;

    /**
     * 查找最热商品
     */
    @RequestMapping(value = "detail.do")
    public ServerResponse findHotProduct(Product product) {
        return productService.findCategory(product);
    }

}
