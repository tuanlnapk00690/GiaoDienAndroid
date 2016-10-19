package com.giaodienandroid;

import com.Lab01.Lab01_Activity;
import com.Lab02.Lab02_Activity;
import com.Lab03.Lab03_Activity;
import com.Lab04.Lab04Activity;
import com.Lab05.Lab05_Activity;
import com.Lab06.Lab06_Activity;
import com.Lab05.Lab05_Activity;
import com.Lab07.Lab07_Activity;
import com.Lab08.Lab08_Activity;
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

	Button btnLab01,btnLab02,btnLab03,btnLab04,btnLab05,btnLab06,btnLab07,btnLab08;
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
		
		btnLab01 = (Button) findViewById(R.id.btnLab01);
		btnLab01.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Lab01_Activity.class);
				startActivity(intent);
			}
		});
		
		btnLab02 = (Button) findViewById(R.id.btnLab02);
		btnLab02.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Lab02_Activity.class);
				startActivity(intent);
			}
		});
		
		btnLab03 = (Button) findViewById(R.id.btnLab03);
		btnLab03.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Lab03_Activity.class);
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
		
		btnLab05 = (Button) findViewById(R.id.btnLab05);
		btnLab05.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Lab05_Activity.class);
				startActivity(intent);
			}
		});
		
		btnLab06 = (Button) findViewById(R.id.btnLab06);
		btnLab06.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Lab06_Activity.class);
				startActivity(intent);
			}
		});
		
		btnLab07 = (Button) findViewById(R.id.btnLab07);
		btnLab07.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Lab07_Activity.class);
				startActivity(intent);
			}
		});
		
		btnLab08 = (Button) findViewById(R.id.btnLab08);
		btnLab08.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Lab08_Activity.class);
				startActivity(intent);
			}
		});
		
	}
}
