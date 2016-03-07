package com.example.anjanagupta.happen2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

public class MainActivity extends AppCompatActivity {
    Button btnSignIn;
    EditText editTextUserNameToLogin, editTextPasswordToLogin;
    private static final String TAG = MainActivity.class.getSimpleName();
    private Firebase mFirebaseRef;
    /* Data from the authenticated user */
    private AuthData mAuthData;
    /* A dialog that is presented until the Firebase authentication finished. */
    private ProgressDialog mAuthProgressDialog;

    /* Listener for Firebase session changes */
    private Firebase.AuthStateListener mAuthStateListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_main);



    }

    //    public void submit(View view) {
//        Intent intent = new Intent(MainActivity.this, OptionActivity.class);
//        startActivity(intent);
//    }
    public void register(View view) {
        Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    // Methos to handleClick Event of Sign In Button
    public void signIn(View view)
    {
        editTextUserNameToLogin = (EditText)findViewById(R.id.editTextUserNameToLogin);
        editTextPasswordToLogin = (EditText)findViewById(R.id.editTextPasswordToLogin);
        // get The User name and Password
        String userName=editTextUserNameToLogin.getText().toString();
        String password=editTextPasswordToLogin.getText().toString();
        Firebase ref = new Firebase("https://luminous-heat-9678.firebaseio.com/");
        ref.authWithPassword(userName, password, new Firebase.AuthResultHandler() {
            @Override
            public void onAuthenticated(AuthData authData) {
                System.out.println("User ID: " + authData.getUid() + ", Provider: " + authData.getProvider());
                Toast.makeText(getApplicationContext(), "Successful login", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                startActivity(intent);
            }

            @Override
            public void onAuthenticationError(FirebaseError firebaseError) {
                Toast.makeText(getApplicationContext(), "Issue with login. Try again!", Toast.LENGTH_LONG).show();
                // there was an error
            }
        });
    }

}
