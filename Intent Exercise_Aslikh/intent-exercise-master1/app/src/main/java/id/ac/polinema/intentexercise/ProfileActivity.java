package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    TextView label_fullname;
    TextView label_email;
    TextView label_homepage;
    TextView label_about;
    Button btn_homepage;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().hide();

        label_fullname = findViewById(R.id.label_fullname);
        label_email = findViewById(R.id.label_email);
        label_homepage = findViewById(R.id.label_homepage);
        label_about = findViewById(R.id.label_about);

        Intent terima = getIntent();

        String fullname = terima.getStringExtra("text_fullname");
        String email = terima.getStringExtra("text_email");
        String homepage = terima.getStringExtra("text_homepage");
        String about = terima.getStringExtra("text_about");

        label_fullname.setText(fullname);
        label_email.setText(email);
        label_homepage.setText(homepage);
        label_about.setText(about);

        btn_homepage = findViewById(R.id.button_homepage);
        btn_homepage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(ProfileActivity.this, HomepageActivity.class);
        startActivity(i);

    }
}