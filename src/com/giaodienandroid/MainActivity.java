package com.giaodienandroid;

import com.Lab04.Lab04Activity;
import com.aboutme.Aboutme_Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	Button btnLab04;
	ImageButton imgbtnAboutme;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imgbtnAboutme = (ImageButton) findViewById(R.id.imgbtnAboutme);
		imgbtnAboutme.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Aboutme_Activity.class);
				startActivity(intent);
			}
		});
		
		btnLab04 = (Button) findViewById(R.id.btnLab04);
		btnLab04.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Lab04Activity.class);
				startActivity(intent);
			}
		});
		
	}
}
