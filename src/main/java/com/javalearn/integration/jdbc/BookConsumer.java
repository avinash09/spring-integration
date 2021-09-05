package com.javalearn.integration.jdbc;

import java.util.List;

public class BookConsumer {

	public void consume(List<Book> books) {
        books.stream().forEach(System.out::println);
    }
}
