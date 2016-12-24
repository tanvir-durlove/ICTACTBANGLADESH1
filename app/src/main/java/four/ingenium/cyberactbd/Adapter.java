package four.ingenium.cyberactbd;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Adapter extends FragmentPagerAdapter{

	public Adapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int pos) {
		 
        switch (pos) {
        case 0:
            // Home fragment activity
            return new HomeFragment();
        case 1:
            // Video fragment activity
            return new VideoFragment();
        case 2:
            // Contact fragment activity
            return new ContactFragment();
        }
 
        return null;
    }

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		
		if (position == 0) {
			return "হোম";
		}
		else if (position == 1) {
			return "ভিডিও";
		}
		else if (position == 2) {
			return "যোগাযোগ";
		}
		return super.getPageTitle(position);
	}
	
	
}
