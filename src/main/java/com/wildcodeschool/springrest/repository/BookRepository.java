package com.wildcodeschool.springrest.repository;

import org.springframework.stereotype.Repository;

import com.wildcodeschool.springrest.entity.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	List<Book> findByTitleContainingOrDescriptionContaining(String searchTerm, String searchTerm2);
	
	
}
