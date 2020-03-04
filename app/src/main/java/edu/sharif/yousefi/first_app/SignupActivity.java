package edu.sharif.yousefi.first_app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button login_btn = findViewById(R.id.signup_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userName = findViewById(R.id.username_inp_su);
                EditText email = findViewById(R.id.email_inp_su);
                EditText password = findViewById(R.id.pass_inp_su);

                Editable usernameText = userName.getText();
                Editable emailText = email.getText();
                Editable passwordText = password.getText();

                if ( usernameText== null || emailText == null  || passwordText == null ){
                    Toast toast=Toast.makeText(getApplicationContext(),R.string.Login_error,Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }
                else {
                    try {
                        User user = new User(userName.getText().toString(),
                                email.getText().toString(),
                                password.getText().toString());
                    }catch (Exception e){
                        Toast toast=Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT);
                        toast.setMargin(50,50);
                        toast.show();
                    }
                }
            }
        });

    }

}