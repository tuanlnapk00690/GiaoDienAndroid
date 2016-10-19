package com.Lab06;

import com.giaodienandroid.R;
import com.giaodienandroid.R.id;
import com.giaodienandroid.R.layout;
import com.giaodienandroid.R.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class Hien_KQ extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hien__kq);
		
		Button back = (Button)findViewById(R.id.btnBackLab06);
		TextView textViewKQPT = (TextView) findViewById(R.id.textViewKQPT);
		
		int Soa = getIntent().getExtras().getInt("soA");
		int Sob = getIntent().getExtras().getInt("soB");
		int Soc = getIntent().getExtras().getInt("soC");
		double delta = (Sob*Sob)-(4*Soa*Soc);
		double x,x1,x2;
		String n1,n2,n3,n4;
		if(delta>0){
			x1 = -(Sob + Math.sqrt(delta))/(2*Soa);
			x2 = -(Sob - Math.sqrt(delta))/(2*Soa);
			textViewKQPT.setText("X1= "+x1+"X2= "+x2);
		}else if(delta==0){
			x = -(Sob)/(2*Soa);
			textViewKQPT.setText("X= "+x);
		}else{
			textViewKQPT.setText("Phương trình vô nhiệm");
		}
		
		back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),Lab06_Activity.class);
				startActivity(intent);
			}
		});
	}
}
