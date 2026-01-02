package gr.aueb.cf.ch16;

public class Book {
    private final long id;
    private final String title;
    private final String authpr;
    private final String isbn;


    private Book(Builder builder)
    }
    public static class Builder{
        private final long id;
        private final String isbn;
        private final String title= "";
        private final String authpr=" ";
}
// Fluent setter-returns thw Builder object-chaining
 public Builder title(String title){
    this.title = title;
    return this
 }
 public Builder author(String author){
    this.author = author;
    return this;
 }
 public Book build(){
    return new Book(this);
 }
