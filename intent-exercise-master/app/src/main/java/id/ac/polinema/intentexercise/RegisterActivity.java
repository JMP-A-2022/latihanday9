package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {
    private TextInputEditText text_email,text_fullname, text_password,
            text_confirm_password, text_homepage,text_about;
    private Button button_ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button_ok = findViewById(R.id.button_ok);
        text_email = findViewById(R.id.text_email);
        text_fullname = findViewById(R.id.text_fullname);
        text_password = findViewById(R.id.text_password);
        text_confirm_password = findViewById(R.id.text_confirm_password);
        text_homepage = findViewById(R.id.text_homepage);
        text_about = findViewById(R.id.text_about);

        button_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = text_email.getText().toString().trim();
                String fullname = text_fullname.getText().toString().trim();
                String password = text_password.getText().toString().trim();
                String confirmPassword = text_confirm_password.getText().toString().trim();
                String homepage = text_homepage.getText().toString().trim();
                String about = text_about.getText().toString().trim();

                if (email.isEmpty() || fullname.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Please fill all the details", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                }

            }
        });

        button_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                finish();
            }
        });


    }
}
