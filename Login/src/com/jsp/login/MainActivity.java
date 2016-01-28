package com.jsp.login;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	TextView logotextview,signuptextview,forgotpassswordtextview;
	EditText usernameedittext,passwordedittedt;
	CheckBox rembrpwdcheckbox;
	Button loginbutton;
	
	String stUsername = "abc";
	String stPassword = "1234";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		usernameedittext = (EditText) findViewById(R.id.editTextusername);
		passwordedittedt = (EditText) findViewById(R.id.editTextpassword);
		loginbutton = (Button) findViewById(R.id.buttonlogin);
		
		loginbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				String entusername = usernameedittext.getText().toString();
				String entpassword = passwordedittedt.getText().toString();
				
				if(entusername.equalsIgnoreCase(stUsername)&&entpassword.equals(stPassword))
				{
					Log.d("[DEBUG]", "Login Success");
				}
				
				else
				{
					Log.d("[DEBUG]", "Login failed");
				}
			}
		});
		
	}



}
