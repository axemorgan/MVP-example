package com.alex.morgan.kitter.presenters;

/**
 * A presenter that encapsulates the business logic of the kitten profile screen
 */
public interface ProfilePresenter {
    void onBindProfile();

    void onViewNextProfile();

    void onAdopt();
}
