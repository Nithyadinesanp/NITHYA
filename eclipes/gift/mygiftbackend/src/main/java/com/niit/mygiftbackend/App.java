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
        product.setId(101);
        product.setName("BIRTHDAY PERSONALISED WOODEN PLAQUE");
        product.setDescription("Express love for your dear one in the most special way as you present her or him this personalised plaque.");
        product.setCategory("Birthday Gift");
        product.setPrice(499);  
        productDAO.addProduct(product);
        for(Product p:productDAO.listProducts())
        {
        	System.out.println(p.getId());
        	System.out.println(p.getName());
        }
        
    }
}
