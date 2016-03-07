package com.example.example;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String man = android.os.Build.MODEL + "——————————" + android.os.Build.MANUFACTURER;
		Log.i("yxa", man);
		
		((ImageView)findViewById(R.id.v1)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setComponent(new ComponentName("com.fxicrazy.sjml", 
						"com.fxicrazy.sjml.ui.Welcome"));
				startActivity(intent);
			}
		});
	}

}
