package com.jvfinal.post;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvfinal.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	 
	}
