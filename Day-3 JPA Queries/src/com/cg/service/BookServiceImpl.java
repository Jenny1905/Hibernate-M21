package com.cg.service;

import java.util.List;

import com.cg.entities.Book;
import com.cg.repository.BookRepository;
import com.cg.repository.BookRepositoryImpl;

public class BookServiceImpl implements BookService {

	private BookRepository dao;

	public BookServiceImpl() {
		dao = new BookRepositoryImpl();
	}

	@Override
	public Book getBookById(int id) {
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {
		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}
	
	@Override
	public List<Book> getBooksInPriceRange(double low, double high){
		return dao.getBooksInPriceRange(low, high);
	}
}

