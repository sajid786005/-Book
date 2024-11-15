package com.Abbas.Book_Network_api.Book;

import org.springframework.data.jpa.domain.Specification;

import java.awt.print.Book;

public class BookSpecification {
    public static Specification<Book> withOwnerId(String ownerId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("createdBy"), ownerId);
    }
}
