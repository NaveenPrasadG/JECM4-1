package com.jspiders.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	ListView phonelistview;
	GridView phonesgridview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		phonelistview = (ListView) findViewById(R.id.listViewphones);
		phonesgridview = (GridView) findViewById(R.id.gridViewphones);
		
		final String[] phonebrands = {"Sony","Samsung","Moto","Apple","Micromax","HTC","Blackberry","MI","Lenovo"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, 
				                                                phonebrands);
        phonelistview.setAdapter(adapter);
        phonesgridview.setAdapter(adapter);
		
        phonelistview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) 
			{
				Toast.makeText(MainActivity.this,phonebrands[position],Toast.LENGTH_SHORT).show();
				
			}
		});
	
        phonesgridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				Toast.makeText(MainActivity.this,phonebrands[position],Toast.LENGTH_SHORT).show();
				
			}
		});
	
	
	}

	

}
