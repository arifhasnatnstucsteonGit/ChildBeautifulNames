package info.arif.hasnat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Front extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.front);
 Thread th=new Thread(){
        	
        	public void run(){
        		try{
        			sleep(3000);
        			
        		}catch(InterruptedException e){
        			e.printStackTrace();
        			
        		}finally{
        			Intent intent1 =new Intent("info.arif.hasnat.MainActivity");
        			startActivity(intent1);
        			
        		}
        		
        		
        		
        		
        	}
        	
        
        	
        	
        };
		th.start();
	
	
	
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	} 
	}
	


