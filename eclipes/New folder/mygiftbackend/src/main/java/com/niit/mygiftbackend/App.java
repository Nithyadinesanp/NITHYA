package com.niit.mygiftbackend;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.mygiftbackend.config.AppContext;
import com.niit.mygiftbackend.model.Product;
import com.niit.mygiftbackend.dao.ProductDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContext.class);
        ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
        Product product=new Product();
        product.setName("GoogleGlasses");
        product.setBrand("Google");
        product.setCategory("Miscelleneous");
        product.setDesc("Intelligent and blah blah blah.");        
        productDAO.addProduct(product);
        for(Product p:productDAO.listProducts())
        {
        	System.out.println(p.getId());
        	System.out.println(p.getName());
        }
        
    }
}
