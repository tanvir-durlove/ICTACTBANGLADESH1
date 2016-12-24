package four.ingenium.cyberactbd;

import four.ingeniumbd.ictactbangladesh.R;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;


@SuppressLint("NewApi") public class Start extends FragmentActivity implements ActionBar.TabListener{
	
	Adapter adapter;
	ViewPager pager;

    @SuppressWarnings("deprecation")
	@SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        
        final ActionBar ab = getActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        adapter = new Adapter(getSupportFragmentManager());
        
        pager = (ViewPager) findViewById(R.id.pager);
        
        
        
        pager.setAdapter(adapter);
        
        pager.setOnPageChangeListener(new OnPageChangeListener() {
			

			public void onPageSelected(int pos) {
				// TODO Auto-generated method stub
				ab.setSelectedNavigationItem(pos);
			}

			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}

			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        for (int i=0; i <adapter.getCount();i++){
        	
        	ab.addTab(ab.newTab().setText(adapter.getPageTitle(i)).setTabListener(this));
        }
    }

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		pager.setCurrentItem(tab.getPosition());
	}
    
}
