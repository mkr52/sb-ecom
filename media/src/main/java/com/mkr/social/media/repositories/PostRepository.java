package com.mkr.social.media.repositories;

import com.mkr.social.media.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
