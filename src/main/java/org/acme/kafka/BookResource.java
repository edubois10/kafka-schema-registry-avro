package org.acme.kafka;

import org.acme.kafka.quarkus.Book;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.jboss.logging.Logger;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/books")
public class BookResource {
    private static final Logger LOGGER = Logger.getLogger(BookResource.class);

    @Channel("book-out")
    Emitter<Book> emitter;

    @POST
    public Response enqueueBook(Book book) {
        LOGGER.infof("Sending books %s to Kafka", book.getTitle());
        emitter.send(book);
        return Response.accepted().build();
    }

}