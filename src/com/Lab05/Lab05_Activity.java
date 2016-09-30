package com.Lab05;

import java.util.ArrayList;

import com.adapter.DanhBaAdapter;
import com.giaodienandroid.MainActivity;
import com.giaodienandroid.R;
import com.giaodienandroid.R.id;
import com.giaodienandroid.R.layout;
import com.giaodienandroid.R.menu;
import com.model.DanhBa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class Lab05_Activity extends Activity {

	Spinner spinnerDS;
	ListView listViewDanhba;
	ArrayList<DanhBa> danhsachdanhba;
	DanhBaAdapter danhbaadapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab05);
		
//		spinnerDS = (Spinner) findViewById(R.id.spinnerDS);
//		
//		spinnerDS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//			@Override
//			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//				String name=((TextView)view).getText().toString();
//				
//				Toast.makeText(getApplicationContext(), "Thông Báo: "+name, Toast.LENGTH_LONG).show();
//			}
//
//			@Override
//			public void onNothingSelected(AdapterView<?> parent) {
//							
//			}
//		});
		
		listViewDanhba = (ListView) findViewById(R.id.listViewDanhba);
		danhsachdanhba = new ArrayList<DanhBa>();
		danhsachdanhba.add(new DanhBa (1,"An","01234567890"));
		danhsachdanhba.add(new DanhBa (2,"Bình","0969789789"));
		danhsachdanhba.add(new DanhBa (3,"Chi","0987654321"));
		danhsachdanhba.add(new DanhBa (4,"Dũng","01676554556"));
		danhsachdanhba.add(new DanhBa (5,"Giang","01645115045"));
		danhsachdanhba.add(new DanhBa (6,"Hùng","0916022001"));
		danhsachdanhba.add(new DanhBa (7,"Hưng","01645115045"));
		danhsachdanhba.add(new DanhBa (8,"Hà","01645115045"));
		danhsachdanhba.add(new DanhBa (9,"Kiên","01645115045"));
		danhsachdanhba.add(new DanhBa (10,"Linh","0918531983"));
		danhsachdanhba.add(new DanhBa (11,"Mỹ","01645115045"));
		danhsachdanhba.add(new DanhBa (12,"Nhân","0918601991"));
		danhsachdanhba.add(new DanhBa (13,"Phương","01645115045"));
		danhsachdanhba.add(new DanhBa (14,"Quỳnh","0918601991"));
		danhsachdanhba.add(new DanhBa (15,"Sa","01645115045"));
		danhsachdanhba.add(new DanhBa (16,"Tuấn","01645115045"));
		danhsachdanhba.add(new DanhBa (17,"Tú","0916022001"));
		danhsachdanhba.add(new DanhBa (18,"Tâm","0918531983	"));
		danhsachdanhba.add(new DanhBa (19,"Vy","01645115045"));
		danhsachdanhba.add(new DanhBa (20,"Yến","0918601991"));
		
		danhbaadapter = new DanhBaAdapter(Lab05_Activity.this,R.layout.item,danhsachdanhba);
		listViewDanhba.setAdapter(danhbaadapter);
		
	}
}
