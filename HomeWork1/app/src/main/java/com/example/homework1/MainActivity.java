package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView, emailTextView, introductionTextView, subjectTextView, learningTextView;
    private ImageView profileImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        setProfileData();
    }

    private void initializeViews() {
        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailValueTextView);
        introductionTextView = findViewById(R.id.introductionValueTextView);
        subjectTextView = findViewById(R.id.subjectValueTextView);
        learningTextView = findViewById(R.id.learningValueTextView);
        profileImageView = findViewById(R.id.profileImageView);
    }

    private void setProfileData() {
        ProfileData profileData = getProfileData();

        nameTextView.setText(profileData.getName());
        emailTextView.setText(profileData.getEmail());
        introductionTextView.setText(profileData.getIntroduction());
        subjectTextView.setText(profileData.getSubject());
        learningTextView.setText(profileData.getLearning());

        profileImageView.setImageResource(R.drawable.dreams);
    }

    private ProfileData getProfileData() {
        return new ProfileData(
                "Phạm Phước Tỷ",
                "typ00448@gmail.com",
                "I playing the video game and enjoy the movie when I got free time, hang out with my friends.",
                "I learn at UIT-VNUHCM and work for 2 company in 5 years.",
                "Web Developer, Project Management and Scrum Technique Skills"
        );
    }

    private static class ProfileData {
        private final String name, email, introduction, subject, learning;

        public ProfileData(String name, String email, String introduction, String subject, String learning) {
            this.name = name;
            this.email = email;
            this.introduction = introduction;
            this.subject = subject;
            this.learning = learning;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getIntroduction() {
            return introduction;
        }

        public String getSubject() {
            return subject;
        }

        public String getLearning() {
            return learning;
        }
    }
}
