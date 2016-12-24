package four.ingenium.cyberactbd;

import four.ingeniumbd.ictactbangladesh.R;
import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Advice extends ActionBarActivity {
	
	Button general;
	 Button computer;
	 Button mobile;
	 Button homefromadvice;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.advice);
final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.slidebutton);		
		
		general = (Button) findViewById(R.id.advice_general);
		computer = (Button) findViewById(R.id.advice_computer);
		mobile = (Button) findViewById(R.id.advice_mobile);
		homefromadvice = (Button) findViewById(R.id.home1);
		
		
		general.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Advice.this, Generaltips.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		computer.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Advice.this, Computertips.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		mobile.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Advice.this, Mobiletips.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		homefromadvice.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Advice.this, Start.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
	}
}
