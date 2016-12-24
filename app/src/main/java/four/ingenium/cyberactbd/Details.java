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

public class Details extends ActionBarActivity {
	
	 Button crime;
	 Button history;
	 Button virus;
	 Button home1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details);
		final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.slidebutton);		
		
		crime = (Button) findViewById(R.id.details_cybercrime);
		history = (Button) findViewById(R.id.details_cyberhistory);
		virus = (Button) findViewById(R.id.detail_virus);
		home1 = (Button) findViewById(R.id.home); 
	      
		crime.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Details.this, Crime.class);
				Bundle bndlanimation = 
				ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
				startActivity(in, bndlanimation);
				v.startAnimation(animTranslate);
			}
		});
	      history.setOnClickListener(new OnClickListener() {

	    	  @SuppressLint("NewApi") @Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in = new Intent(Details.this, Ciberhistory.class);
					Bundle bndlanimation = 
							ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
							startActivity(in, bndlanimation);
							v.startAnimation(animTranslate);
				}
			});
	      virus.setOnClickListener(new OnClickListener() {

	    	  @SuppressLint("NewApi") @Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in = new Intent(Details.this, Virus.class);
					Bundle bndlanimation = 
							ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
							startActivity(in, bndlanimation);
							v.startAnimation(animTranslate);
				}
			});
	      home1.setOnClickListener(new OnClickListener() {

	    	  @SuppressLint("NewApi") @Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in = new Intent(Details.this, Start.class);
					Bundle bndlanimation = 
							ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
							startActivity(in, bndlanimation);
							v.startAnimation(animTranslate);
				}
			});
	      }
}
