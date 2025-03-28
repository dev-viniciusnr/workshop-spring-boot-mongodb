package com.viniciusnr.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciusnr.workshopmongo.domain.Post;
import com.viniciusnr.workshopmongo.repository.PostRepository;
import com.viniciusnr.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
	    Optional<Post> user = repo.findById(id);
	    if (user.isEmpty()) {
	        throw new ObjectNotFoundException("Objeto não encontrado");
	    }
	    return user.get();
	}

	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}
	
}
