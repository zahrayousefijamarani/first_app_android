package edu.sharif.yousefi.first_app;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button login_btn = findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userName = findViewById(R.id.username_inp);
                EditText email = findViewById(R.id.email_inp);
                EditText password = findViewById(R.id.pass_inp);

                Editable usernameText = userName.getText();
                Editable emailText = email.getText();
                Editable passwordText = password.getText();

                if ( (usernameText== null & emailText == null ) || passwordText == null ){
                    TextView login_error = findViewById(R.id.login_error_txt);
                    login_error.setText(R.string.Login_error);
                }
                else {
                    User user = new User(userName.getText().toString(),
                            email.getText().toString(),
                            password.getText().toString());
                }
            }
        });


    }


}
