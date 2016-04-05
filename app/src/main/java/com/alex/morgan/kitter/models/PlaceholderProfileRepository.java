package com.alex.morgan.kitter.models;

/**
 * A simple ProfileRepository implementation
 */
public class PlaceholderProfileRepository implements ProfileRepository {
    @Override
    public void createProfile(Profile profile) {
        //TODO implement me
    }

    @Override
    public void updateProfile(Profile profile) {
        //TODO implement me
    }

    @Override
    public Profile getFirstProfile() {
        return new Profile("Paprika", "Tabby", 1, "Lorem ipsum discription sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Cincinnati, OH");
    }

    @Override
    public Iterable<Profile> getAllProfiles() {
        return null;
    }
}
