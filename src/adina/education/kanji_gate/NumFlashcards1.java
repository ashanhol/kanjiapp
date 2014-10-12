package adina.education.kanji_gate;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

public class NumFlashcards1 extends Activity {

ArrayList<View> arr= new ArrayList<View>();

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_num_flashcards1);
		// Show the Up button in the action bar.
		getActionBar().setDisplayHomeAsUpEnabled(true);
		String title= "Kanji-gate";
		getActionBar().setTitle(title);
		
		TextView numberKanji2= (TextView) findViewById(R.id.textView2);
		arr.add(numberKanji2);
		TextView onyomi= (TextView) findViewById(R.id.textView1);
		onyomi.setBackgroundColor(0xffffffff);
		arr.add(onyomi);
		TextView kunyomi= (TextView) findViewById(R.id.textView3);
		kunyomi.setBackgroundColor(0xffffffff);
		arr.add(kunyomi);
		TextView numDefinition2= (TextView) findViewById(R.id.textView4);
		arr.add(numDefinition2);
		TextView numberOnyomi2= (TextView)  findViewById(R.id.textView5);
		arr.add(numberOnyomi2);
		TextView numberKunyomi2= (TextView) findViewById(R.id.textView6);
		arr.add(numberKunyomi2);
		TextView numberStroke2=(TextView) findViewById(R.id.textView7);
		arr.add(numberStroke2);
		TextView examples=(TextView) findViewById(R.id.textView8);
		examples.setBackgroundColor(0xffffffff);
		arr.add(examples);
		TextView tricksToRemember=(TextView) findViewById(R.id.textView9);
		tricksToRemember.setBackgroundColor(0xffffffff);
		arr.add(tricksToRemember);
		TextView numberExample2=(TextView) findViewById(R.id.textView10);
		arr.add(numberExample2);
		TextView numberTrick2=(TextView) findViewById(R.id.textView11);
		arr.add(numberTrick2);
		TextView numberExampleMeaning2= (TextView) findViewById(R.id.textView12);
		arr.add(numberExampleMeaning2);
		TextView frontKanji2=(TextView) findViewById(R.id.textView13);
		arr.add(frontKanji2); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_num_flashcards1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void flipOver(View v){
		
		
		ScaleAnimation flipCard=new ScaleAnimation(1, 1, 1, .02f, 0, 262); 
		flipCard.setDuration(500);
		flipCard.setRepeatCount(1);
		flipCard.setRepeatMode(2);
		v.startAnimation(flipCard);
		
		
		Handler handle= new Handler();
		handle.postDelayed(new Runnable() {
	        @Override
	        public void run() {
	        	//visible=0, invisible=4
	    		for(int i=0; i<arr.size(); i++){
	    			if(arr.get(i).getVisibility()==4){
	    					arr.get(i).setVisibility(0);
	    				}
	    			
	    			else if(arr.get(i).getVisibility()==0){
	    					arr.get(i).setVisibility(4);
	    				}
	    			
	    		}
	        }
	    }, 990);
	} 
	
	
	
	public void prevPage(View v) {
		Intent intent= new Intent(this, NumFlashcards.class);
		startActivity(intent);

	}
	public void nextPage(View v) {
		Intent intent= new Intent(this, NumFlashcards2.class);
		startActivity(intent);

	}
}
