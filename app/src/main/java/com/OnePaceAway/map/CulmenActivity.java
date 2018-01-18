package com.OnePaceAway.map;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CulmenActivity extends Activity {
	
	private ImageView eat;
	private ImageView buy; 
	private ImageView hotle; 
	private ImageView movie;
	private ImageView sport;
	private ImageView hospital;
	private ImageView park; 
	private ImageView gongce; 
	private ImageView fun;
	private ImageView atm;
	private ImageView bank;
	private ImageView book; 
	private ImageView fengjing; 
	private ImageView we;
	private ImageView bus;
    private ImageView back;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_culmen);
		init();
		eat.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","餐饮");
				startActivityForResult(intent,0);
			}
		});
		buy.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","购物");
				startActivityForResult(intent,0);
			}
		});
		hotle.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","酒店");
				startActivityForResult(intent,0);
			}
		});
		movie.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","电影院");
				startActivityForResult(intent,0);
			}
		});
		sport.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","运动场");
				startActivityForResult(intent,0);
			}
		});
		hospital.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","医疗");
				startActivityForResult(intent,0);
			}
		});
		park.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","停车");
				startActivityForResult(intent,0);
			}
		});
		gongce.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","洗手间");
				startActivityForResult(intent,0);
			}
		});
		fun.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","KTV");
				startActivityForResult(intent,0);
			}
		});
		atm.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","取款");
				startActivityForResult(intent,0);
		    }
		});
		bank.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","银行");  
				startActivityForResult(intent,0);
		    }
		});
		book.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","科教");
				startActivityForResult(intent,0);
		    }
		});
		fengjing.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","名胜");
				startActivityForResult(intent,0);
		    }
		});

        bus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,MainActivity.class);
				//将类目传递给mainactivity
				intent.putExtra("Cloum","交通");
				startActivityForResult(intent,0);
			}
		});
        we.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(CulmenActivity.this,AboutActivity.class);
				startActivity(intent);
			}
		});
        back.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                exit();
            }
        });
	}

	private void init() {
		eat=(ImageView) findViewById(R.id.eat);
		buy=(ImageView) findViewById(R.id.buy);
		hotle=(ImageView) findViewById(R.id.hotal);
		movie=(ImageView) findViewById(R.id.movie);
		sport=(ImageView) findViewById(R.id.sport);
		hospital=(ImageView) findViewById(R.id.hospita);
		park=(ImageView) findViewById(R.id.park);
		gongce=(ImageView) findViewById(R.id.gongce);
		fun=(ImageView) findViewById(R.id.fun);
		atm=(ImageView) findViewById(R.id.atm);
		bank=(ImageView) findViewById(R.id.bank);
		book=(ImageView) findViewById(R.id.book);
		fengjing=(ImageView) findViewById(R.id.fengjing);
		we=(ImageView) findViewById(R.id.we);
		bus=(ImageView) findViewById(R.id.bus);
        back=(ImageView) findViewById(R.id.back);
	}
	private void exit(){
		AlertDialog.Builder dialog = new AlertDialog.Builder(CulmenActivity.this);
		dialog.setTitle("退出");
		dialog.setMessage("真的要退出应用吗？");
		dialog.setCancelable(false);
		dialog.setPositiveButton("是的", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialogInterface, int i) {
				finish();
				System.exit(0);
			}
		});
		dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialogInterface, int i) {

			}
		});
		dialog.show();
	}


	private long firstTime=0;

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode==KeyEvent.KEYCODE_BACK && event.getAction()== KeyEvent.ACTION_DOWN){
			if (System.currentTimeMillis()-firstTime>2000){
				Toast.makeText(CulmenActivity.this,"再按一次退出程序",Toast.LENGTH_SHORT).show();
				firstTime=System.currentTimeMillis();
			}else{
				finish();
				System.exit(0);
			}
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}
