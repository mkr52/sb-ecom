package com.mkr.social.media.repositories;

import com.mkr.social.media.models.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialUserRepository extends JpaRepository<SocialUser,Long> {
}
