## Running the application
```
mvn clean package quarkus:dev -DskipTests
```

### Listening to the consumer
```
curl -N http://localhost:8080/consumed-books
```

### Sending messages from producer
```
curl --header "Content-Type: application/json"   --request POST   
--data '{"title":"The Lord of the Rings","editor":"J. R. R. Tolkien","year":1954}'   http://localhost:8080/books
```
