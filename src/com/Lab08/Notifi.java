package com.Lab08;


import com.giaodienandroid.R;
import com.giaodienandroid.R.id;
import com.giaodienandroid.R.layout;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Notifi extends Activity {

	TextView textViewNotifi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notifi);
		
setContentView(R.layout.notifi);
		
		textViewNotifi = (TextView) findViewById(R.id.textViewNotifi);
		
		int requestCode = getIntent().getExtras().getInt("requestCode");
		
		DongNotification(requestCode);
		
		textViewNotifi.setText("Đã đóng thông báo số: "+requestCode+"\n có thể dùng id này để hiển thị chi tiết");
	}
	private void DongNotification(int notiID) {
		NotificationManager notiMa = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notiMa.cancel(notiID);
		
	}

}
