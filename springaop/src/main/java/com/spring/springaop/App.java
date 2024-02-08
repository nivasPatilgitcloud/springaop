package com.spring.springaop;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner scan = new Scanner(System.in);
        ApplicationContext obj = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart cart = obj.getBean(ShoppingCart.class);
        System.out.println("Enter true or false");
        Boolean data = scan.nextBoolean();
        System.out.println(data);
        cart.checkout(data);
    }
}
