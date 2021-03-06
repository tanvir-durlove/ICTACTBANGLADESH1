package four.ingenium.cyberactbd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
import android.widget.ExpandableListView;
import four.ingeniumbd.ictactbangladesh.R;

public class Virus extends ActionBarActivity {
	Button home9;
	
	 ExpandableListAdapter listAdapter;
	    ExpandableListView expListView;
	    List<String> listDataHeader;
	    HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.virus);
		final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.slidebutton);
		
		home9 = (Button) findViewById(R.id.btn);
		
		home9.setOnClickListener(new OnClickListener() {

	    	  @SuppressLint("NewApi") @Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent in = new Intent(Virus.this, Start.class);
					Bundle bndlanimation = 
							ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
							startActivity(in, bndlanimation);
							v.startAnimation(animTranslate);
				}
			});
		// get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
 
        // preparing list data
        prepareListData();
 
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
 
        // setting list adapter
        expListView.setAdapter(listAdapter);
    }
 
    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
 
        // Adding child data
        listDataHeader.add("স্প্যাম");
        listDataHeader.add("অ্যাডওয়ার ভাইরাস");
        listDataHeader.add("ম্যালওয়ার ভাইরাস");
        listDataHeader.add("ট্রোজান ভাইরাস");
        listDataHeader.add("স্পাইইওয়ার ভাইরাস");
        listDataHeader.add("প্রতিরোধ");
 
        // Adding child data
        List<String> স্প্যাম  = new ArrayList<String>();
        			স্প্যাম.add("স্পাম হছে অনাকাঙ্খিত মেসেজ, যা সাধারণত ইমেইলের মাধ্যমে ইউজারের কাছে প্রেরণ করা হয়। স্পামের মাধ্যমে সাধারণত বিভিন্ন সস্তা পন্যের বা সেবার বিজ্ঞাপন যেমন বিভিন্ন প্রকার লোন, দ্রততম সময়ে বড়লোক হওয়ার সুবর্ণ সুযোগ, অর্থ উপার্জনের উপায়, লটারি সহ বিভিন্ন প্রতিযোগিতায় অংশগ্রহণের জন্য বিজ্ঞাপন ইত্যাদি প্রেরন করা হয়। অনেক সময় বিভিন্ন নিউজ গ্রুপ বা বুলেটিনবোর্ডে অপ্রাসঙ্গিক পোস্টকেও স্পাম বলা হয়। স্পাম নামটি এসেছে বিখ্যাত “হরমেল ফুডের” খাদ্যপন্য “স্পাম”(শূকরের মাংস থেকে তৈরী খাবার)থেকে।স্পামকে “জাংক মেইল” ও বলা হয়।" +
        					"\n\n\nস্পাম ভাইরাস কি ভাবে ছড়ায়ঃ\n\n বর্তমানে স্প্যাম মেইলের সমস্যা মারাত্মক আকার ধারন করেছে।বিশ্বের প্রতিটি দেশের মানুষ তাদের ইমেইল ঠিকানার গোপনীয়তা নিয়ে সন্দিহান।অবৈধভাবে বিভিন্ন প্রতিষ্ঠান তাদের গ্রাহকের বা পাঠকের ইমেইল ঠিকানা বিক্রি করছে তৃতীয় পক্ষের কাছে এবং তারা আবার বিক্রি করছে অন্যপক্ষের কাছে এভাবেই বিভিন্ন প্রতিষ্ঠান বা ব্যাক্তি অসংখ্য মেইল পাঠাচ্ছে এবং স্প্যাম মেইলের সংখ্যা দিন দিন চক্র বৃদ্ধি হারে বেড়েই চলেছে। " +
        					"\n\n\nস্পাম ভাইরাস কি ভাবে প্রতিরোধ করা যায়ঃ \n\nপ্রতিনিয়ত অবাঞ্ছিত ইমেইল সমূহকে চেক করুন ইনবক্সে থাকা স্প্যাম মেইলকে রিপোর্ট স্প্যাম হিসেবে তালিকাভুক্ত করা উচিত এবং স্প্যাম মেইল নিয়ে কাজ করার সময় ম্যালওয়্যার সফটওয়্যার কম্পিউটারে ইন্সটল করা আবশ্যক।"+
        					"যদি আপনার কম্পিউটারে ম্যালওয়্যার সফটওয়্যার ইন্সটল করা না থাকে তবে স্প্যাম মেইল নাড়াচাড়া করবেননা এতে করে স্বয়ংক্রিয়ভাবে ম্যালওয়্যার অথবা ভাইরাস ছড়িয়ে পড়তে পারে।");
        
 
        List<String>অ্যাডওয়ার  = new ArrayList<String>();
        		অ্যাডওয়ার.add("অ্যাডওয়ার সধারন্ত বিজ্ঞাপন প্রদর্শন কাজে ব্যাবহার হয় , যেমন উইন্ডোজ লাইভ মেসেঞ্জার বা ইয়াহু মেসেঞ্জারে অ্যাডওয়ার সংযত করা থাকে । যাকিনা মেসেঞ্জার ইনস্টল করার সময় চক্তির অন্তর্ভুক্ত থাকে । এছাড়াও অনেক প্রকার অ্যাডওয়ার আছে , যে সব আপনার অনুমতি ছারাই কম্পিউটার ইনস্টল হতে পারে , যদিও অ্যাডওয়ার সরাসরি আমাদের কোন ক্ষতি করে না তবুও অবৈধ অ্যাডওয়ার অনান্য ক্ষতিকারক প্রোগ্রাম আনার রাস্তা হয়ে যায় ।");
        
 
        List<String> ম্যালওয়ার = new ArrayList<String>();
        			ম্যালওয়ার.add("ম্যালওয়ার(malware)কেও বানান হয় অসদুদ্দেশ্য । মেলিকিওউস(malicious) সফটওয়্যারের সংক্ষিপ্ত রূপ ম্যালওয়ার । ঘটনাক্রমে যদি পিসিতে ম্যালওয়ার ইনস্টল হয়, তাহলে এটি ভাইরাস,ট্রোজান,ওয়রম,স্পাইওয়্যার,অ্যাডওয়ারে বা অন্য ম্যালওয়ার কাজে ব্যাবহার করতে পারে, মোট কথা উপরের যেকন ক্ষতিকারক দিক থেকে ক্ষতি হতে পারে ।ম্যালওয়ারকেও সাধারণ এন্টিভাইরাস শনাক্ত করতে পারে না , আর ক্র্যাক করা এন্টিভাইরাসের কথা নাই বা বললাম ।");
        			
        List<String> ট্রোজান = new ArrayList<String>();
        			ট্রোজান.add("ভাইরাসের পরপরি বর্তমানে সবচে বড় নিরাপত্তা জনিত হুমকি হচ্ছে ট্রোজান বা ট্রোজান হরসেস ।" +
        					"\n\nএকটি ভাইরাস এবং একটি ট্রোজান এর মধ্যে প্রধান পার্থক্য যে এটি নিজেকে অন্য কোন ফাইল বা প্রোগ্রামে রিপ্লেস করে না , তাই বলে এটি কম ক্ষতিকারক নয় । ট্রোজানের প্রধান কাজ হচ্ছে অপারেটিংএ প্রোগ্রামারের জন্য ব্যাকডোর(backdoor) তৈরি করা । আর একবার ব্যাকডোর হলে প্রোগ্রামার বা প্রোগ্রামারের স্ক্রিপ্ট(Scripts) আপনার কম্পিউটারে রিমোটলি নিয়ন্ত্রণ থেকে শুরু করে সব কিছুই করতে পারবে । এছারাও ট্রোজান ভাইরাসের মত আমাদের কম্পিউটারের অনেক ভাবে ক্ষতি করতে পারে ।" +
        					"\n\nট্রোজান হর্স যে সমস্ত উপায়ে সিস্টেমে ছড়িয়ে থাকে তা হল-\n১. রেপার টুলসের মাধ্যমে অন্য প্রোগ্রামের সাথে সংযুক্ত হয়ে।\n২. কোনো সফটয়ারের সোর্স কোডের মধ্যে নিজের কোড ঢুকিয়ে দিয়ে।" +
        					"৩. ত্রুটিপূর্ণ ওয়েব ব্রাউজারের মাধ্যমে।৪.\n এক্সিকিউটেবল ফাইলের মধ্যে ইনস্ট্রাকশন সেট যোগ করার মাধ্যমে।" +
        					"ট্রোজান হর্স যে সমস্ত উপায়ে সিস্টেমে ছড়িয়ে থাকে তা হল-\n১. রেপার টুলসের মাধ্যমে অন্য প্রোগ্রামের সাথে সংযুক্ত হয়ে।\n২.কোনো সফটয়ারের সোর্স কোডের মধ্যে নিজের কোড ঢুকিয়ে দিয়ে।"+
        					"\n৩. ত্রুটিপূর্ণ ওয়েব ব্রাউজারের মাধ্যমে।\n৪. এক্সিকিউটেবল ফাইলের মধ্যে ইনস্ট্রাকশন সেট যোগ করার মাধ্যমে।");
        			
        List<String> স্পাইওয়ার = new ArrayList<String>();	
        		স্পাইওয়ার.add("স্পাইওয়্যার মূল কাজ হচ্ছে আপনার ব্যক্তিগত তথ্য সংগ্রহ করে তার রচয়িতাকে পেরন করা , যাতে তারা এই সব তথ্য আইনবহির্ভূত কাজে ব্যাবহার করতে পারে । স্পাইওয়্যার আপনার ব্রাউজারের হোম পেজ পরিবর্তন, সার্চং পেজ পরিবর্তন , অনাকাংকিত টুলবার যোগ করে নানান সমস্যার সৃষ্টি করে, যা খুবই বিরক্তকর । এছাড়া এই সমস্ত স্পাইওয়্যার সাথে কীলজ্ঞিং(keylogging) থাকতে পারে , যা থেকে স্পাইওয়্যার রচয়িতা আপনার ক্রেডিট কার্ড নাম্বার, পাসওয়ার্ড, ইউজার নামের মত বিভিন্ন তথ্য পতে পারে ।"+
        					"স্পাইওয়্যার নিজে নিজে ছড়াতে পারে না, এটা কোন প্রোগ্রামের বা ওয়েবপেজর অংশ হিসেবে কম্পিউটার ইনস্টল হয় , তারপর তার কাজ শুরু করে । সবচে বড় ভাবনার বিষয় হচ্ছে , সাধারণ এন্টিভাইরাস এদের শনাক্ত করতে পারে না । এর জন্য এন্টিভাইরাসে এন্টিস্পাইওয়্যার অপশন থাকতে হয় ।");
        		
        		
        List<String> প্রতিরোধ = new ArrayList<String>();
        		প্রতিরোধ.add("কম্পিউটার এর নিরাপত্তায় আপনার করণীয়ঃ কম্পিউটারের নিরাপত্তার বিষয়টি নিঃসন্দেহে গুরুত্বপূর্ণ। অনলাইনে বিভিন্ন ওয়েবসাইট ব্রাউজ এবং ই-মেইলে ফাইলসমূহ ও তথ্য-উপাত্ত আদান-প্রদানের ফলে অনেক সময় আপনার কম্পিউটার নিরাপত্তা ঝুঁকিতে পড়ে। এ সকল ব্যাপারে সতর্ক থাকা এবং সে অনুসারে কার্যকর পদক্ষেপ গ্রহণ একান্ত অপরিহার্য। এ ধরনের কিছু বিষয় নিম্নে উল্লেখ করা হলোঃ" +
        				"\n\nই-মেইলে সংযুক্ত ফাইলসমূহের ব্যাপারে সতর্ক থাকাঃ \nঅনেক সময় ই-মেইলের মাধ্যমে ভাইরাস দ্রুত ছড়িয়ে পড়ে। এ ধরনের ই-মেইলে সাধারণত সংযুক্ত ফাইল যেমন win 32.torjan, ভাইরাস ইত্যাদি থাকতে পারে। বেশির ভাগ ক্ষেত্রে এর মাধ্যমে ম্যাক্রো ভাইরাস ছড়িয়ে পড়ে মাইক্রোসফট্ ওয়ার্ড কিংবা মাইক্রোসফট্ এক্সেল প্রোগ্রামে। আবার অনেক সময় এর মাধ্যমে কম্পিউটার অতিরিক্ত নিরাপত্তা ঝুঁকিতে পড়তে পারে। এই ফাইল সমূহের ব্যাপারে সতর্কতা অবলম্বন করা উচিত। এ ধরনের ই-মেইল ওপেন না করে কম্পিউটার থেকে মুছে ফেলতে হবে। তবে আর একটি সতর্কতা হচ্ছে অপরিচিত ই-মেইল না পড়ে মুছে ফেলা যুক্তিসঙ্গত। .scr, .pif, .exe, .pps, .zip, .vbs, .bat, .com, .asp, .doc, .xls ইত্যাদি এক্সটেনশনযুক্ত ফাইলের ব্যাপারে সতর্ক থাকাটা ভাল।" +
        				"\n\nভুয়া নিরাপত্তা সংক্রান্ত সতর্কীকরণ ম্যাসেজঃ\n ওয়েবসাইট ব্রাউজ করছেন, এমন সময় সতর্কীকরণ নোটিশ আসলো আপনার পিসি নিরাপত্তা ঝুঁকিতে রয়েছে। কম্পিউটারকে ঝুঁকি হতে মুক্ত রাখতে এখানে ক্লিক করুন এমন নির্দেশনা পেলেন এবং নির্দেশনা অনুযায়ী ব্যবস্থা নিলেন তো বিপদে পড়লেন। কাজেই এ ধরনের নির্দেশনা কার্যকর করা থেকে বিরত থাকুন।" +
        				"\n\nফ্রি সফট্ওয়্যারঃ\n অনেক সময় আপনাকে কম্পিউটারকে সুরক্ষিত রাখতে ফ্রি এন্টিভাইরাস সফট্ওয়্যার ইনস্টল করার জন্য অপশন আসে। ভাবলেন একটি ভাল সুযোগ পেলেন। কিন্তু সফট্ওয়্যারটি ইনস্টল করার পর কম্পিউটারে ভাইরাস স্ক্যান করতে গিয়ে বুঝলেন ব্যাপারটা আসলে সহজ নয়। এই ফ্রি সফট্ওয়্যারে বলা যায়, অনেক অপশনই নেই। দেখলেন, সম্পূর্ণ সংস্করণ কিনলে কেবলমাত্র আপনার কম্পিউটার সুরক্ষিত হবে। এক্ষেত্রে এ ধরনের ফ্রি এন্টিভাইরাস সফট্ওয়্যার ইনস্টল থেকে বিরত থাকুন।" +
        				"\n\nউইন্ডোজ ফায়ারওয়ালঃ\n হার্ডওয়্যারের একটি গুরুত্বপূর্ণ ফিচার ফায়ারওয়্যাল। এটি উইন্ডোজ অপারেটিং সিস্টেমের নেটওয়ার্কে আইপি এড্রেসের মাধ্যমে আপনার কম্পিউটারে অনাকাঙ্খিত আক্রমণ হতে আত্মরক্ষা করার সক্ষমতা দেয়। একারণে আপনার পিসিতে উইন্ডোজ ফায়ারওয়ালকে এনাবল বা কার্যকর করুন। ডেস্কটপ হতে My Network Places নির্বাচন করার পর রাইট ক্লিক করে Property অপশনে ক্লিক করুন। এবার যে উইন্ডোটি প্রদর্শিত হয় তার বাম পার্শ্বে Change Windows Firewall আইকনে ক্লিক করুন। এখন ফায়ারওয়াল কার্যকর করুন।" +
        				"\n\nব্রাউজার হ্যাইজ্যাকের আশংকা কমাতে যে বিষয়গুলো খেয়াল রাখবেনঃ।"+
        				"\n১. ব্রাউজারে কোন সর্তকতা বার্তা আসলে তা না পড়েই ক্লিক করবেন না।।"+
        				"\n২. সন্দেহজনক ইমেইল খুলবেন না। বিশেষ করে অপরিচিত ইমেইল থেকে আসা অ্যাটাচ ফাইল খুলবেন না এবং ইমেইলের উত্তর দেবেন না।।"+
        				"\n৩. ভাইরাসের কারণে এই সমস্যা হতে পারে। তাই নিয়মিত হালনাগাদ এ্যান্টিভাইরাস ব্যবহার করুন।।"+
        				"\n৪. উইন্ডোজের বিভিন্ন নিরাপত্তাজনিত ক্রটির কারনে এই সমস্যা হতে পারে। তাই উইন্ডোজের সিকিউরিটি প্যাচ হালনাগাদ করার চেষ্টা করুন।"+
        				"\n৫. অকারনণে পর্নোগ্রাফিক/ক্র্যাক/সিরিয়াল সাইটে প্রবেশ করবেন না।" +
        				"\n\n\nপাসওয়ার্ড সম্পর্কিত কিছু গুরুত্বপূর্ণ টিপসঃ বর্তমানে আমরা অনেকেই ইন্টারনেটে কাজ করি। এখানে বিভিন্ন‌ সময় পাসওয়ার্ড দেওয়ার প্রয়োজন পড়ে। সম্প্রতি ইয়াহু থেকে ৫০ হাজার, লিংকডইন থেকে ৬০ লাখ আর এনভিডিয়া থেকে ৪ লাখ পাসওয়ার্ড চুরি করে নিয়েছে হ্যাকাররা। ইন্টারনেটে বিভিন্ন অ্যাকাউন্টের তথ্য চুরির ঘটনা প্রায়শই ঘটছে। ইন্টারনেট নিরাপত্তা-বিশেষজ্ঞরা ইন্টারনেটে তথ্য হ্যাক হয়ে যাওয়ার এ ঘটনায় সবাইকে সতর্ক থাকার এবং বিভিন্ন ওয়েবসাইটে জটিল পাসওয়ার্ড ব্যবহার করার পরামর্শ দিয়েছেন। পাশাপাশি বিভিন্ন অ্যাকাউন্টের পাসওয়ার্ড হালনাগাদ করা এবং একই পাসওয়ার্ড সব ধরনের অ্যাকাউন্টে ব্যবহার না করারও পরামর্শ দিয়েছেন তাঁরা। আপনার ইন্টারনেটের গোপনীয়তা সুরক্ষিত করার প্রথম পদক্ষেপ হল একটি এমন পাসওয়ার্ড তৈরি করা যা অস্থায়ী/স্থায়ী ব্যবহারকারী বা কম্পিউটার প্রোগ্রামের দ্বারা সহজেই আন্দাজ করা যাবে না৷");
        			
        			
        listDataChild.put(listDataHeader.get(0), স্প্যাম); // Header, Child data
        listDataChild.put(listDataHeader.get(1), অ্যাডওয়ার);
        listDataChild.put(listDataHeader.get(2), ম্যালওয়ার);
        listDataChild.put(listDataHeader.get(3), ট্রোজান);
        listDataChild.put(listDataHeader.get(4), স্পাইওয়ার);
        listDataChild.put(listDataHeader.get(5), প্রতিরোধ);

    }
}