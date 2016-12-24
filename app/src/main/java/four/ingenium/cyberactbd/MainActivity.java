package four.ingenium.cyberactbd;

import four.ingeniumbd.ictactbangladesh.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity {

	LinearLayout touch;
	Thread timer;
	


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        timer = new Thread(){
        	public void run(){
        		try{
        			sleep(1000);
        		}
        		catch(InterruptedException e){
        			e.printStackTrace();
        		}
        		finally
        		{
        			Intent nn = new Intent (MainActivity.this ,Start.class);
        			startActivity(nn);
        		}
        		}
        		
        	};
        	timer.start();
        	
        	 touch = (LinearLayout) findViewById(R.id.LinearLayout1);
        	   touch.setOnTouchListener(new OnTouchListener() {

        		@Override
        		public boolean onTouch(View v, MotionEvent event) {
        			// TODO Auto-generated method stub
        			Intent in = new Intent(MainActivity.this, Start.class);
        			startActivity(in);
        			return false;
        		}

        	  });
        }
        

	}