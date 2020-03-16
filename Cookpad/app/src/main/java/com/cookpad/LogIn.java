package com.cookpad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogIn extends AppCompatActivity implements View.OnClickListener {

    private EditText userEmail, userPassword;
    private Button btnLogin, btnRegister;

    // TODO: 2020-03-16 Vako will implement the forgot password 

    

    FirebaseAuth mAuth;
    // TODO: 2020-03-16 implement onAuthStateListener 

    private void initialize() {

        userEmail = findViewById(R.id.loginEmail);
        userPassword = findViewById(R.id.loginPassw);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        initialize();
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {

            case R.id.btnLogin:
                goTologIn(view);
                break;
            case R.id.btnRegister:
                Intent intent = new Intent(LogIn.this, Register.class);

                startActivity(intent);
                break;
        }
    }

    private void goTologIn(View view) {

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String password = userPassword.getText().toString().trim();

        if ((userEmail.getText().toString().trim().matches(emailPattern) && userEmail.length() > 0) && userPassword.length() > 5) {

            final String email = userEmail.getText().toString().trim();

//          Authenticate the User in FireBase

            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if (task.isSuccessful()) {

                        Toast.makeText(getApplicationContext(), "LogIn is Success!!!", Toast.LENGTH_LONG).show();

                        Intent nextView = new Intent(LogIn.this, MainActivity.class);
                        startActivity(nextView);

                        userEmail.setText(null);
                        userPassword.setText(null);
                    } else {

                        Toast.makeText(LogIn.this, "Error!!! " + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                    }
                }

            });
        }
    }

}
