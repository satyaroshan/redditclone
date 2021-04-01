package com.reddit.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.redditclone.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long>{
     
}
