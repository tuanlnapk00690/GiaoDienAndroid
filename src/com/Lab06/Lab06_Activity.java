package com.Lab06;


import com.giaodienandroid.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lab06_Activity extends Activity{

	EditText EditSoa, EditSob, EditSoc, EditKQ;
	Button btnKQ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab06);
		
		EditSoa = (EditText) findViewById(R.id.EditSoa);
		EditSob = (EditText) findViewById(R.id.EditSob);
		EditSoc = (EditText) findViewById(R.id.EditSoc);
		btnKQ = (Button) findViewById(R.id.btnTinh);
		
		btnKQ.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Intent intent = new Intent(getApplicationContext(),Hien_KQ.class);
				intent.putExtra("soA", EditSoa.getText().toString());
				intent.putExtra("soB", EditSob.getText().toString());
				intent.putExtra("soC", EditSoc.getText().toString());
				startActivity(intent);
			}
		});
	}
	
	public void giaiPT(){
		
	}
}
