package org.example.javaboy.Demo1;

public class User {
    private Integer id;
    private String name;
    private Integer age;

    public void doSth() {
        Book book = new Book(1, "个别", 3.2);
        book.setId(1);
        book.setName("格林童话");
        book.setPrice((double) 10);
    }
}
