package four.ingenium.cyberactbd;

import four.ingeniumbd.ictactbangladesh.R;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video3 extends ActionBarActivity {
	private MediaController media_control;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video3);
VideoView video_view = (VideoView) findViewById(R.id.videoView3);
		
		Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.passwordsecurity);
		 
	    media_control = new MediaController(this);
	    video_view.setMediaController(media_control);
	 
	    video_view.setVideoURI(uri);
	    video_view.start();
	}
}
