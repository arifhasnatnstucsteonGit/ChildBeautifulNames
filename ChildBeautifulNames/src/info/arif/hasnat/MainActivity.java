package info.arif.hasnat;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends Activity implements SearchView.OnQueryTextListener{
	TextView tv;
	ListView lv;
	SearchView sv;
	Typeface tf;
	private final String word[]=Word.word;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		tv=(TextView) findViewById(R.id.textView1);
		lv=(ListView) findViewById(R.id.listView1);
		sv=(SearchView) findViewById(R.id.searchView1);
		
		
		tf=Typeface.createFromAsset(getAssets(), "DroidSansFallback.ttf");
		tv.setTypeface(tf);
		  lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,word) );
	      lv.setTextFilterEnabled(true);
		  searchview();
		
	}

	
	 private void searchview(){
	    	sv.setIconified(true);
	    	sv.setBackgroundColor(Color.WHITE);
	    	sv.setAnimationCacheEnabled(true);
	    	
	    	sv.setOnQueryTextListener(this);
	    	//sv.setSubmitButtonEnabled(true);
	    	sv.setQueryHint("Search");
	    	
	    	
	    	
	    	
	    }
	@Override
	public boolean onQueryTextChange(String newText) {
		// TODO Auto-generated method stub
		if (TextUtils.isEmpty(newText)) {
            lv.clearTextFilter();
        } else {
            lv.setFilterText(newText.toString());
        }
        return true;
    }
	

	@Override
	public boolean onQueryTextSubmit(String query) {
		// TODO Auto-generated method stub
		return false;
	}

	

}

