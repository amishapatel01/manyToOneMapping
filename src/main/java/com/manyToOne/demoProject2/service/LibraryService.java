package com.manyToOne.demoProject2.service;


import com.manyToOne.demoProject2.entity.Library;
import com.manyToOne.demoProject2.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    public Library saveLibrary(Library library) {
        return libraryRepository.save(library);
    }
}
