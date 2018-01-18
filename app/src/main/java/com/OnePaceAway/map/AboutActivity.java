package com.OnePaceAway.map;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{

	private CustomVideoView videoview;
	private ImageButton btn_start;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.welcome);
		btn_start = (ImageButton) findViewById(R.id.imgButton);
		btn_start.setOnClickListener(this);
		btn_start.setVisibility(View.GONE);

		initView();

	}

	/**
	 * 初始化
	 */
	private void initView() {

		videoview = (CustomVideoView) findViewById(R.id.videoview);
		//设置播放加载路径
		videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.about));
		//播放
		videoview.start();

	}

	@Override
	public void onClick(View view) {
		switch (view.getId()){
			case R.id.imgButton:
				Intent intent = new Intent(AboutActivity.this,CulmenActivity.class);
				startActivity(intent);
				finish();
				break;
		}
	}
}