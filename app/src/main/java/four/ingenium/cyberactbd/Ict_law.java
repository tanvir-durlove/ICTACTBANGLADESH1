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

public class Ict_law extends ActionBarActivity {
	
	Button one,two,three,four,five,six,seven,eight,nine,homefromlaw;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ict_law);
final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.slidebutton);		
		
		one=(Button)findViewById(R.id.lawone);
		two=(Button)findViewById(R.id.lawtwo);
		three=(Button)findViewById(R.id.lawthree);
		four=(Button)findViewById(R.id.lawfour);
		five=(Button)findViewById(R.id.lawfive);
		six=(Button)findViewById(R.id.lawsix);
		seven=(Button)findViewById(R.id.lawseven);
		eight=(Button)findViewById(R.id.laweight);
		nine=(Button)findViewById(R.id.lawnine);
		homefromlaw=(Button)findViewById(R.id.homefrmlaw);
		
		
		one.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Ict_law.this, Law_one.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		two.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Ict_law.this, Law_two.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		three.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Ict_law.this, Law_three.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		four.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Ict_law.this, Law_four.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		five.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Ict_law.this, Law_five.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		six.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Ict_law.this, Law_six.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		seven.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Ict_law.this, Law_seven.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		eight.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Ict_law.this, Law_eight.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		nine.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Ict_law.this, Law_nine.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
		
		homefromlaw.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Ict_law.this, Start.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
	}
}
