package com.Lab01;

import com.giaodienandroid.R;
import com.giaodienandroid.R.id;
import com.giaodienandroid.R.layout;
import com.giaodienandroid.R.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class Lab01_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab01);
		
		String doc = "https://drive.google.com/a/fpt.edu.vn/file/d/0B5T9OA3s5A52UGNvQy00bGFRems/view?usp=sharing";
		
		WebView wv = (WebView) findViewById(R.id.webView);
		
		wv.getSettings().setJavaScriptEnabled(true); 
		wv.getSettings().setAllowFileAccess(true);
		wv.getSettings().setLoadsImagesAutomatically(true);
		wv.loadUrl(doc);
	}
}
