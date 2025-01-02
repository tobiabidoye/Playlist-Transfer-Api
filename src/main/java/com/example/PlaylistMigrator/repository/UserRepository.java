package com.example.PlaylistMigrator.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.PlaylistMigrator.model.User;

@Repository
public interface UserRepository extends MongoRepository <User,String>{

    User findBySpotifyId(String spotifyUserId);
}

