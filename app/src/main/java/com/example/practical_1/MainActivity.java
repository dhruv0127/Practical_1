package com.example.practical_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextUsername, editTextPassword;
    RadioGroup radioGroupUserType;
    RadioButton radioUser, radioAdmin;
    CheckBox checkRememberMe;
    Button buttonLogin;
    TextView textViewUserDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        radioGroupUserType = findViewById(R.id.radioUserType);
        radioUser = findViewById(R.id.radioUser);
        radioAdmin = findViewById(R.id.radioAdmin);
        checkRememberMe = findViewById(R.id.checkRememberMe);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewUserDetails = findViewById(R.id.textViewUserDetails);

        // Set up a click listener for the Login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();
                int userType = radioUser.isChecked() ? 0 : 1; // 0 for Male, 1 for Female
                boolean rememberMe = checkRememberMe.isChecked();

                // Display user details
                String userDetails = "Entered User Details : \n* Username: " + username + "\n* Password: " + password + "\n* Gender: " + (userType == 0 ? "Male" : "Female") + "\n* Remember Me: " + (rememberMe ? "Yes" : "No");
                textViewUserDetails.setText(userDetails);
            }
        });
    }
}