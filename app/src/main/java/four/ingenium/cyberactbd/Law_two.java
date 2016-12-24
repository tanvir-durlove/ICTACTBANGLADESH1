package four.ingenium.cyberactbd;

import java.io.IOException;
import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import four.ingeniumbd.ictactbangladesh.R;

public class Law_two extends ActionBarActivity {
	ListView listView;
	ArrayList<String>dbList=new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.law_two);
		ListView listView = (ListView) findViewById(R.id.listView9);
		caliingDpCopy();
		getContent();
		listView.setAdapter(new ArrayAdapter<>(this, 
				android.R.layout.simple_list_item_1,dbList));
	}
	@SuppressLint("SdCardPath") private void getContent() {
		// TODO Auto-generated method stub
		String dbPath = "/data/data/four.ingeniumbd.ictactbangladesh/databases/ictactbd.db";
		SQLiteDatabase myDatabase = null;

		try {
			myDatabase = SQLiteDatabase.openDatabase(dbPath, null,
					SQLiteDatabase.OPEN_READWRITE);
		} catch (Exception e) {
			
		}
		String sql = "SELECT info_two FROM two";

		Cursor c = null;
		try {
			c = myDatabase.rawQuery(sql, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {

			dbList.add(c.getString(c.getColumnIndex("info_two")));
		}

		myDatabase.close();
		
	}
	
	private void caliingDpCopy() {
		// TODO Auto-generated method stub
		DbCopy mydb = new DbCopy(this);
		try {
			mydb.createDataBase();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	


}
