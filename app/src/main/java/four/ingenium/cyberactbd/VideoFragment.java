package four.ingenium.cyberactbd;

import four.ingeniumbd.ictactbangladesh.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class VideoFragment extends Fragment {
	
	Button vdo1,vdo2,vdo3,vdo4,vdo5;
	
	public View onCreateView(LayoutInflater inflater ,
			ViewGroup container , Bundle saveInstanceState) {
		
		View rootView = inflater.inflate(R.layout.video_fragment, container,false);
		
		vdo1 = (Button)rootView.findViewById(R.id.video1);
        vdo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Video1.class));
            }
        });
        vdo2 = (Button)rootView.findViewById(R.id.video2);
        vdo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Video2.class));
            }
        });
        vdo3 = (Button)rootView.findViewById(R.id.video3);
        vdo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Video3.class));
            }
        });
        vdo4 = (Button)rootView.findViewById(R.id.video4);
        vdo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Video4.class));
            }
        });
        vdo5 = (Button)rootView.findViewById(R.id.video5);
        vdo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Video5.class));
            }
        });
		

		
		

		return rootView;
	}
}
