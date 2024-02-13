package com.pact.consumer.repository;


import com.pact.consumer.controller.Library;

import java.util.List;

public interface LibraryRepositoryCustom {

	List<Library> findAllByAuthor(String authorName);

	Library findByName(String bookName);

}
