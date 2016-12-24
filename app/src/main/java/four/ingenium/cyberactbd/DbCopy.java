package four.ingenium.cyberactbd;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

@SuppressLint("SdCardPath") public class DbCopy extends SQLiteOpenHelper {
	
	// The Android's default system path of your application database.
		private static String DB_PATH = "/data/data/four.ingeniumbd.ictactbangladesh/databases/";

		private static String DB_NAME = "ictactbd.db";

		private SQLiteDatabase myDataBase;

		private final Context myContext;

		public DbCopy(Context context) {

			super(context, DB_NAME, null, 1);
			this.myContext = context;
		}

		public void createDataBase() throws IOException {

			boolean dbExist = checkDataBase();

			if (dbExist) {
				
			} else {

				this.getReadableDatabase();

				try {

					copyDataBase();

				} catch (IOException e) {
					throw new Error("Error copying database");

				}
			}

		}

		/**
		 * Check if the database already exist to avoid re-copying the file each
		 * time you open the application.
		 * 
		 * @return true if it exists, false if it doesn't
		 */
		private boolean checkDataBase() {

			SQLiteDatabase checkDB = null;

			try {
				String myPath = DB_PATH + DB_NAME;
				checkDB = SQLiteDatabase.openDatabase(myPath, null,
						SQLiteDatabase.OPEN_READONLY);

			} catch (SQLiteException e) {

				// Log.d("myLog", "database does't exist yet.");

			}

			if (checkDB != null) {

				checkDB.close();

			}

			return checkDB != null ? true : false;
		}


		private void copyDataBase() throws IOException {

			InputStream myInput = myContext.getAssets().open(DB_NAME);

			String outFileName = DB_PATH + DB_NAME;

			OutputStream myOutput = new FileOutputStream(outFileName);

			byte[] buffer = new byte[1024];
			int length;
			while ((length = myInput.read(buffer)) > 0) {
				myOutput.write(buffer, 0, length);
			}

			myOutput.flush();
			myOutput.close();
			myInput.close();

		}

		public void openDataBase() throws SQLException {

			String myPath = DB_PATH + DB_NAME;
			myDataBase = SQLiteDatabase.openDatabase(myPath, null,
					SQLiteDatabase.OPEN_READONLY);

		}

		@Override
		public synchronized void close() {

			if (myDataBase != null)
				myDataBase.close();

			super.close();

		}

		@Override
		public void onCreate(SQLiteDatabase db) {

		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

		}
		
		


}
