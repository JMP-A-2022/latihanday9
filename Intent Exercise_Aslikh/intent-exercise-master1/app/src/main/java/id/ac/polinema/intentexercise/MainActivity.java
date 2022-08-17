package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	Button btn_register;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getSupportActionBar().hide();

		btn_register = findViewById(R.id.btn_register);

		btn_register.setOnClickListener(this);




	}

	@Override
	public void onClick(View view) {
		Intent i = new Intent(MainActivity.this, RegisterActivity.class);
		startActivity(i);

	}
}