package com.weather;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class Weather extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()) {
		case R.id.about:
			Intent about = new Intent("com.weather.ABOUT");
			startActivity(about);
			break;
		case R.id.menu_settings:
			Intent setting = new Intent("com.weather.SETTING");
			startActivity(setting);
			break;
		
		}
		return false;
		
	}
}
