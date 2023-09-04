package com.latihandidik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.latihandidik.config.AppConfig;
import com.latihandidik.domain.Author;
import com.latihandidik.domain.dto.BookDetailDto;
import com.latihandidik.service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Javabased configuration
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bookService = (BookService) appContext.getBean("bookService");
        BookDetailDto bookDetailDto = bookService.findBookById(2L);
        System.out.println(bookDetailDto);
    }
}
