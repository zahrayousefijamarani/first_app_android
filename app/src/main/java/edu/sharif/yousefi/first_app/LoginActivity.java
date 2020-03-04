package edu.sharif.yousefi.first_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button login_btn = findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userName = findViewById(R.id.username_inp);
                EditText password = findViewById(R.id.pass_inp);

                Editable usernameText = userName.getText();
                Editable passwordText = password.getText();

                if ( usernameText== null  || passwordText == null ){
                    Toast toast=Toast.makeText(getApplicationContext(),R.string.Login_error,Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }
                else {
                    try {
                        User user = User.find_user(usernameText.toString(), passwordText.toString());
                        startActivity(new Intent(LoginActivity.this,SearchActivity.class));
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
