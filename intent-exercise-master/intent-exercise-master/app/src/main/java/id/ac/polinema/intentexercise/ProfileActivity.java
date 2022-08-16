package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    Button btn_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btn_home = findViewById(R.id.button_homepage);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, HomePage.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String confirm = intent.getStringExtra("confirm");
        String homepage = intent.getStringExtra("homepage");
        String about = intent.getStringExtra("about");

//        show data from input
        TextView txt_about = findViewById(R.id.label_about);
        TextView txt_name = findViewById(R.id.label_fullname);
        TextView txt_email = findViewById(R.id.label_email);
        TextView txt_home = findViewById(R.id.label_homepage);
        txt_name.setText(name);
        txt_about.setText(about);
        txt_email.setText(email);
        txt_home.setText(homepage);
    }
}
