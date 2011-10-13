package com.ijy.iplay.ui;

import com.ijy.iplay.R;
import com.ijy.iplay.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IplayActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        playlists_button=(Button)findViewById(R.id.playlists_button);
        playlists_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(IplayActivity.this,PalyUI.class);
				IplayActivity.this.startActivity(intent);
				
			}
		});
    }
    private Button playlists_button;
}