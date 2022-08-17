package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    TextInputEditText text_fullname;
    TextInputEditText text_email;
    TextInputEditText text_password;
    TextInputEditText text_confirm_password;
    TextInputEditText text_homepage;
    TextInputEditText text_about;
    Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        text_fullname = findViewById(R.id.text_fullname);
        text_email = findViewById(R.id.text_email);
        text_password = findViewById(R.id.text_password);
        text_confirm_password = findViewById(R.id.text_confirm_password);
        text_homepage = findViewById(R.id.text_homepage);
        text_about = findViewById(R.id.text_about);

        btn_ok = findViewById(R.id.button_ok);
        btn_ok.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String fullname = text_fullname.getText().toString();
        String email = text_email.getText().toString();
        String password = text_password.getText().toString();
        String confirm_password = text_confirm_password.getText().toString();
        String homepage = text_homepage.getText().toString();
        String about = text_about.getText().toString();

        if(fullname.trim().equals("")){
            text_fullname.setError("Fullname is required");
        }
        else if(email.trim().equals("")){
            text_email.setError("Email is required");
        }
        else if(password.trim().equals("")){
            text_password.setError("Password is required");
        }
        else if(confirm_password.trim().equals("")){
            text_confirm_password.setError("Confirm Password is required");
        }
        else{
            Intent kirim = new Intent(RegisterActivity.this, ProfileActivity.class);
            kirim.putExtra("text_fullname", fullname);
            kirim.putExtra("text_email", email);
            kirim.putExtra("text_password", password);
            kirim.putExtra("text_homepage", homepage);
            kirim.putExtra("text_about", about);
            startActivity(kirim);
        }



    }
}
