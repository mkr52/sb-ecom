package com.mkr.social.media.services;

import com.mkr.social.media.models.SocialUser;
import com.mkr.social.media.repositories.SocialUserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService {
    @Autowired
    SocialUserRepository socialUserRepository;

    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    public SocialUser saveUser(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }

//    @Transactional
    public SocialUser deleteUser(Long id) {
        SocialUser socialUser = socialUserRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
//        if (socialUser != null) {
//            // Save any transient SocialUser references first
//            if (socialUser.getGroups().isEmpty()) {
//                socialUserRepository.save(socialUser);
//            }
//            socialUserRepository.delete(socialUser);
//        }
        socialUserRepository.delete(socialUser);
        return socialUser;
    }
}