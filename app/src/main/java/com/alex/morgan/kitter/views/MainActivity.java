package com.alex.morgan.kitter.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alex.morgan.kitter.R;
import com.alex.morgan.kitter.presenters.ProfilePresenter;
import com.alex.morgan.kitter.presenters.ProfilePresenterImpl;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements ProfileView {

    /* Views */
    @Bind(R.id.profile_image)
    ImageView profileImage;
    @Bind(R.id.name_field)
    TextView nameField;
    @Bind(R.id.age_field)
    TextView ageField;
    @Bind(R.id.location_field)
    TextView locationField;
    @Bind(R.id.description_field)
    TextView descriptionField;

    /* Presenter */
    private ProfilePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        this.presenter = new ProfilePresenterImpl(this);
        presenter.onBindProfile();
    }

    @Override
    public void showName(String name) {
        nameField.setText(name);
    }

    @Override
    public void showAge(int age) {
        nameField.setText("Age: " + Integer.toString(age));
    }

    @Override
    public void showLocation(String location) {
        locationField.setText(location);
    }

    @Override
    public void showDescription(String description) {
        descriptionField.setText(description);
    }

    @OnClick(R.id.yes_button)
    public void onAdoptPressed() {
        presenter.onAdopt();
    }

    @OnClick(R.id.no_button)
    public void onNoPressed() {
        presenter.onViewNextProfile();
    }

    @Override
    public void showAdoptionFlair() {
        Toast.makeText(this, "Awesome!", Toast.LENGTH_SHORT).show();
        //TODO show some awesome fireworks animation
    }

    @Override
    public void showRejectionFlair() {
        //TODO show a sad face, then show the next profile
        Toast.makeText(this, ": (", Toast.LENGTH_SHORT).show();
    }
}
