package com.books.bookmanager.service;

import com.books.bookmanager.model.Book;

import java.util.List;

/**
 * Created by RR on 11.11.2016.
 */
public interface BookService {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();

}
