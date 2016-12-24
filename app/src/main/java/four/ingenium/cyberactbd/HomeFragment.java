package four.ingenium.cyberactbd;

import four.ingeniumbd.ictactbangladesh.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {
    Button btn,btn2,btn3,btn4,btn5,btn6;
	
	public View onCreateView(LayoutInflater inflater ,
			ViewGroup container , Bundle saveInstanceState) {

		View rootView = inflater.inflate(R.layout.activity_home_fragment, container,false);
		
		btn = (Button)rootView.findViewById(R.id.home_details);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Details.class));
            }
        });

        
		btn2 = (Button)rootView.findViewById(R.id.home_advise);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Advice.class));
            }
        });
        
		btn3 = (Button)rootView.findViewById(R.id.home_law);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Ict_law.class));
            }
        });
        
        btn4 = (Button)rootView.findViewById(R.id.home_reservedlaw);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Reserved_law.class));
            }
        });
        
        btn5 = (Button)rootView.findViewById(R.id.home_tribunal);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Tribunal.class));
            }
        });
        
        btn6 = (Button)rootView.findViewById(R.id.home_aboutapps);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Aboutapps.class));
            }
        });

        
		return rootView;
	}
	
}
