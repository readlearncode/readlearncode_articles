package com.readlearncode.restserver;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Path("/books")
public class BookResource {

    @Inject
    private BookRepository bookRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBooks() {
        List<Book> books = bookRepository.getAllBooks(); // queries database for all books
        GenericEntity<List<Book>> list = new GenericEntity<List<Book>>(books) {
        };
        return Response.ok(list).build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    @Produces({"application/json", "application/xml"})
    public Response getAllNewBooks() {
        return Response.ok(
                new GenericEntity<List<Book>>(
                        bookRepository.getAllNewBooks()
                ) {
                }).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBookBy(@MatrixParam("author") String author,
                              @MatrixParam("category") String category,
                              @MatrixParam("language") String language) {
        return Response.ok(
                new GenericEntity<List<Book>>(
                        bookRepository.getBookBy(author, category, language)
                ) {
                }).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCart(@CookieParam("cartId") int cartId) {
        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getReferrer(@HeaderParam("referer") String referrer) {
        return Response.ok(referrer).build();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveBook(Book book) {
        book = bookRepository.saveBook(book);
        return Response.ok(book).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveBookF(@FormParam("title") String title,
                              @FormParam("author") String author,
                              @FormParam("price") Float price) {
        return Response.ok(bookRepository.saveBook(new Book(title, author, price))).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateBook(Book book) {
        book = bookRepository.updateBook(book);
        return Response.ok(book).build();
    }

    @DELETE
    @Path("{isbn:}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteBook(@PathParam("isbn") String isbn) {
        Book book = bookRepository.deleteBookByIsbn(isbn);
        return Response.ok(book).build();
    }

    @OPTIONS
    public Response preflight() {
        return Response.ok().header("Allow", true).build();
    }

    @HEAD
    public Response headsUp() {
        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("search")
    public Response searchBook(@QueryParam("keyword") String keyword, @QueryParam("limit") int limit) {
        List<Book> books = bookRepository.searchBook(keyword, limit);
        return Response.ok(new GenericEntity<List<Book>>(books) {
        }).build();
    }


public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        return books;
    }

    public Book saveBook(Book book) {
        books.add(book);
        return book;
    }

    public Book updateBook(Book book) {
        // check book contains new data then update otherwise return
        books.add(book);
        return book;
    }

    public Book deleteBookByIsbn(String isbn) {
        int i = books.indexOf(new Book(isbn));
        return books.remove(i);
    }

    public List<Book> searchBook(String keyword, int limit) {
        // Search DB for book title containing 'keyword' and return
        // result page of size 'limit'
        return new ArrayList<>();
    }

    public List<Book> getAllNewBooks() {
        return new ArrayList<>();
    }

    public List<Book> getBookBy(String author, String category, String language) {
        return new ArrayList<>();
    }
}


public class Book {

    private String isbn;
    private String title;
    private String author;
    private Float price;

    public Book() {
    }

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public Book(String title, String author, Float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

}