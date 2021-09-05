package com.javalearn.integration.jdbc;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BookDataProducer {
	
	public Book produce() {
        return IntStream.range(6, 9)
                .mapToObj(i -> new Book("book" + i, i * 10.0d))
                .collect(Collectors.toList())
                .get(new Random().nextInt(3));
    }

}
