package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText name = findViewById(R.id.text_fullname);
        final EditText email = findViewById(R.id.text_email);
        final EditText password = findViewById(R.id.text_password);
        final EditText confirm = findViewById(R.id.text_confirm_password);
        final EditText homepage = findViewById(R.id.text_homepage);
        final EditText about = findViewById(R.id.text_about);

        Button btn_ok = findViewById(R.id.button_ok);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name_ = name.getText().toString();
                String email_ = email.getText().toString();
                String password_ = password.getText().toString();
                String confirm_ = confirm.getText().toString();
                //check if password and confirm password is same and not empty
                if (password_.equals(confirm_)) {

                    //if field not empty, show toast back to register page if field empty
                    if (!name_.isEmpty() && !email_.isEmpty() && !password_.isEmpty() && !confirm_.isEmpty() && !homepage.getText().toString().isEmpty() && !about.getText().toString().isEmpty()) {
                        Intent intent = new Intent(RegisterActivity.this, ProfileActivity.class);
                        intent.putExtra("name", name_);
                        intent.putExtra("email", email_);
                        intent.putExtra("password", password_);
                        intent.putExtra("confirm", confirm_);
                        intent.putExtra("homepage", homepage.getText().toString());
                        intent.putExtra("about", about.getText().toString());
                        startActivity(intent);
                        Toast.makeText(RegisterActivity.this, "Register Success", Toast.LENGTH_SHORT).show();
                    } else {
                        //back to register page if field empty
                        Toast.makeText(RegisterActivity.this, "Register Failed", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(RegisterActivity.this, "Password not match", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
