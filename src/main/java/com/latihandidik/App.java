package com.latihandidik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
//        Author author = new Author();
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("aplication-context.xml");
//        Author author = (Author) appContext.getBean("author");
//        System.out.println("ID Author : "+author.getId());
//        System.out.println("Name Author : "+author.getName());
        
//        BookService bookService = (BookService) appContext.getBean("bookService");
//        BookDetailDto bookDetailDto = bookService.findBookById(1L);
//        System.out.println(bookDetailDto);
        
        Author author = (Author) appContext.getBean("author");
        System.out.println("Author : "+author);
    }
}
