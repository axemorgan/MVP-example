package com.alex.morgan.kitter.presenters;

import com.alex.morgan.kitter.models.PlaceholderProfileRepository;
import com.alex.morgan.kitter.models.Profile;
import com.alex.morgan.kitter.models.ProfileRepository;
import com.alex.morgan.kitter.views.ProfileView;

/**
 * A ProfilePresenter implementation to manage
 */
public class ProfilePresenterImpl implements ProfilePresenter {

    private ProfileView view;
    private ProfileRepository profileRepository;

    public ProfilePresenterImpl(ProfileView view) {
        this.view = view;
        this.profileRepository = new PlaceholderProfileRepository();
    }

    @Override
    public void onBindProfile() {
        Profile profile = profileRepository.getFirstProfile();
        view.showName(profile.getName());
        view.showAge(profile.getAge());
        view.showLocation(profile.getLocation());
        view.showDescription(profile.getDescription());
    }

    @Override
    public void onViewNextProfile() {
        view.showRejectionFlair();
    }

    @Override
    public void onAdopt() {
        view.showAdoptionFlair();
    }
}
