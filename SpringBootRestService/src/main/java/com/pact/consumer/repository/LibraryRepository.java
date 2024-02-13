package com.pact.consumer.repository;

import com.pact.consumer.controller.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LibraryRepository extends JpaRepository<Library, String>,LibraryRepositoryCustom{

}
