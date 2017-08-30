package com.readlearncode.restserver.genericlist;

import com.readlearncode.restserver.Book;
import com.readlearncode.restserver.BookRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Path("/my-books")
public class BookResource {

    @Inject
    private BookRepository bookRepository;

    @GET
    @Path("response")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBooksResponse() {
        List<Book> books = bookRepository.getAllBooks(); // queries database for all books
        GenericEntity<List<Book>> list = new GenericEntity<List<Book>>(books) {
        };
        return Response.ok(list).build();
    }

    @GET
    @Path("raw")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooksRaw() {
        List<Book> books = bookRepository.getAllBooks(); // queries database for all books
        return books;
    }

    @GET
    @Path("raw-response")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBooksRawResponse() {
        List<Book> books = bookRepository.getAllBooks(); // queries database for all books
        return Response.ok(books).build();
    }
}