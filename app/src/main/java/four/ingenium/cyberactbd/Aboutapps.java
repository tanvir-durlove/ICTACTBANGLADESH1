package four.ingenium.cyberactbd;

import four.ingeniumbd.ictactbangladesh.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Aboutapps extends ActionBarActivity {
	
	Button fb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutapps);
		
		fb=(Button)findViewById(R.id.facbook);
		
		fb.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/ingeniumbd"));
				startActivity(in);
			}
		});
	}
}
		
	

