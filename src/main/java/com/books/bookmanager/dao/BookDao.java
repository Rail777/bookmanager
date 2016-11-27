package com.books.bookmanager.dao;

import com.books.bookmanager.model.Book;

import java.util.List;

/**
 * Created by RR on 11.11.2016.
 */
public interface BookDao {
    public void addBook(Book book);


    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();

}
