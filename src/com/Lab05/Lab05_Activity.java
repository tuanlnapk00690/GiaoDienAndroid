package com.Lab05;

import com.aboutme.Aboutme_Activity;
import com.giaodienandroid.R;
import com.giaodienandroid.R.id;
import com.giaodienandroid.R.layout;
import com.giaodienandroid.R.menu;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.widget.TabHost.TabSpec;

public class Lab05_Activity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab05);
		
		TabHost tabhost = getTabHost();
		TabSpec tab1 = tabhost.newTabSpec("first");
		TabSpec tab2 = tabhost.newTabSpec("second");
		
		tab1.setIndicator("About me");
		tab1.setContent(new Intent(this,Aboutme_Activity.class));
		
		tab2.setIndicator("About Application");
		tab2.setContent(new Intent(this,About_App.class));
		
		tabhost.addTab(tab1);
		tabhost.addTab(tab2);
		
	}

}
