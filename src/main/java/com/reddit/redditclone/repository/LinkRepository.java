package com.reddit.redditclone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.redditclone.domain.Link;

public interface LinkRepository extends JpaRepository<Link,Long>{
		Link findByTitle(String title);
}
