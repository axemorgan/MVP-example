package com.alex.morgan.kitter.views;

/**
 * A View interface for a kitten profile
 */
public interface ProfileView {

    void showName(String name);

    void showAge(int age);

    void showLocation(String location);

    void showDescription(String description);

    void showAdoptionFlair();

    void showRejectionFlair();
}
