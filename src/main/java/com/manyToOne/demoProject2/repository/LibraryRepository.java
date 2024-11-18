package com.manyToOne.demoProject2.repository;


import com.manyToOne.demoProject2.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
