package com.Lab06;

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

public class Lab06_Activity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab06);
		
		TabHost tabhost = getTabHost();
		TabSpec tab1 = tabhost.newTabSpec("first");
		TabSpec tab2 = tabhost.newTabSpec("second");
		TabSpec tab3 = tabhost.newTabSpec("third");
		
		tab1.setIndicator("News");
		tab1.setContent(new Intent(this,news.class));
		
		tab2.setIndicator("Option");
		tab2.setContent(new Intent(this,option.class));
		
		tab3.setIndicator("Contact");
		tab3.setContent(new Intent(this,contact.class));
		
		tabhost.addTab(tab1);
		tabhost.addTab(tab2);
		tabhost.addTab(tab3);
		
	}

}
