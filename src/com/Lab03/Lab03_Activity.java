package com.Lab03;

import com.giaodienandroid.R;
import com.giaodienandroid.R.id;
import com.giaodienandroid.R.layout;
import com.giaodienandroid.R.menu;
import com.Lab03.*;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lab03_Activity extends Activity {

	Button btnLogin;
	TextView textViewDK;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab03);
		
		btnLogin=(Button) findViewById(R.id.btnLogin);
		TextView DK= (TextView) findViewById(R.id.textViewDK);
		TextView QMK = (TextView) findViewById(R.id.textViewQMK);
		final EditText User = (EditText) findViewById(R.id.editTextUser);
		final EditText Pass = (EditText) findViewById(R.id.editTextPass);
		
		DK.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialogDK();
			}
		});
		
		QMK.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialogQMK();
			}
		});
		
		btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(User.getText().toString().equals("")||Pass.getText().toString().equals("")){
					Toast.makeText(getApplicationContext(), "Bạn chưa nhập tài khoản hoặc mật khẩu", Toast.LENGTH_LONG).show();
				}
				else if(User.getText().toString().equals("admin") && Pass.getText().toString().equals("admin")){
					Toast.makeText(getApplicationContext(), "Bạn là quản trị viên", Toast.LENGTH_LONG).show();
				}
				else{
					Toast.makeText(getApplicationContext(), "Sai mật khẩu hoặc tài khoản", Toast.LENGTH_LONG).show();
				}
			}
		});
	}
	
	Dialog dialogDKTK;
	public void dialogDK(){
		dialogDKTK = new Dialog(Lab03_Activity.this);
		dialogDKTK.setContentView(R.layout.activity_dangky);
		dialogDKTK.setTitle("Đăng Ký Tài Khoản");
		
		final EditText ten = (EditText)dialogDKTK.findViewById(R.id.editTextName);
		final EditText ngaySinh = (EditText)dialogDKTK.findViewById(R.id.editTextBirth);
		final EditText SDT = (EditText)dialogDKTK.findViewById(R.id.editTextSDT);
		final EditText taiKhoan = (EditText)dialogDKTK.findViewById(R.id.editTextUsername);
		final EditText matKhau = (EditText)dialogDKTK.findViewById(R.id.editTextPassword);
		final EditText nhapLaiMK = (EditText)dialogDKTK.findViewById(R.id.editTextRePass);
		final CheckBox agree = (CheckBox)dialogDKTK.findViewById(R.id.checkYes);
		Button dangKy = (Button)dialogDKTK.findViewById(R.id.btnDangKy);
		Button thoat = (Button)dialogDKTK.findViewById(R.id.btnThoatDK);
		final TextView thongbao = (TextView) dialogDKTK.findViewById(R.id.textViewNote);
		
		dangKy.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(ten.getText().toString().equals("")){
					thongbao.setText("Bạn chưa nhập tên");
				}else if(ngaySinh.getText().toString().equals("")){
					thongbao.setText("Bạn chưa nhập ngày sinh");
				}else if(SDT.getText().toString().equals("")){
					thongbao.setText("Bạn chưa nhập số điện thoại");
				}else if(taiKhoan.getText().toString().equals("")){
					thongbao.setText("Bạn chưa nhập tài khoản");
				}else if(matKhau.getText().toString().equals("")){
					thongbao.setText("Bạn chưa nhập mật khẩu");
				}else if(nhapLaiMK.getText().toString().equals("")){
					thongbao.setText("Bạn chưa xác nhận lại mật khẩu");
				}else if(agree.isChecked()){
					dialogDKTK.dismiss();
					Toast.makeText(getApplicationContext(), "Đăng ký thành công", Toast.LENGTH_LONG).show();
				}else{
					thongbao.setText("Bạn chưa đồng ý với điều khoản dịch vụ");
				}
				
			}
		});
		
		thoat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialogDKTK.dismiss();
			}
		});
		
		dialogDKTK.show();
	}
	
	Dialog dialogQMK;
	public void dialogQMK(){
		dialogQMK = new Dialog(Lab03_Activity.this);
		dialogQMK.setContentView(R.layout.activity_quenmk);
		dialogQMK.setTitle("Quên Mật Khẩu");
		
		final EditText SDT = (EditText)dialogQMK.findViewById(R.id.txtSdt);
		final EditText taiKhoan = (EditText)dialogQMK.findViewById(R.id.txtUsername);
		final EditText matKhau = (EditText)dialogQMK.findViewById(R.id.txtPassword);
		final EditText nhapLaiMK = (EditText)dialogQMK.findViewById(R.id.txtRePass);
		Button DMK = (Button)dialogQMK.findViewById(R.id.btnTDMK);
		Button thoat = (Button)dialogQMK.findViewById(R.id.btnThoatQMK);
		final TextView thongbao = (TextView) dialogQMK.findViewById(R.id.textViewNoteQMK);
		
		DMK.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(taiKhoan.getText().toString().equals("")){
					thongbao.setText("Bạn chưa nhập tài khoản");
				}else if(SDT.getText().toString().equals("")){
					thongbao.setText("Bạn chưa nhập số điện thoại");
				}else if(matKhau.getText().toString().equals("")){
					thongbao.setText("Bạn chưa nhập mật khẩu");
				}else if(nhapLaiMK.getText().toString().equals("")){
					thongbao.setText("Bạn chưa xác nhận lại mật khẩu");
				}else{
					
					Toast.makeText(getApplicationContext(), "Đổi mật khẩu thành công", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		thoat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialogQMK.dismiss();
			}
		});
		
		dialogQMK.show();
	}
}
