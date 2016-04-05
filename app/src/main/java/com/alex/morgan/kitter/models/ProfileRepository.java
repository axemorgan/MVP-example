package com.alex.morgan.kitter.models;

/**
 * A repository interface for objects to provide access to Profiles
 */
public interface ProfileRepository {
    void createProfile(Profile profile);

    void updateProfile(Profile profile);

    Profile getFirstProfile();

    Iterable<Profile> getAllProfiles();
}
