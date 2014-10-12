package adina.education.kanji_gate;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NumAnimation1 extends Activity {
	AnimationDrawable frameAnimation;
	ImageView drawKanji;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_num_animation1);
		// Show the Up button in the action bar.
		getActionBar().setDisplayHomeAsUpEnabled(true);
		String title= "Kanji-gate";
		getActionBar().setTitle(title);
		
		// Load the ImageView that will host the animation and
		 // set its background to our AnimationDrawable XML resource.
		drawKanji = (ImageView)findViewById(R.id.imageView1);
		drawKanji.setBackgroundResource(R.drawable.numkanjitwo);
		drawKanji.setAdjustViewBounds(true);


		 // Get the background, which has been compiled to an AnimationDrawable object.
		 frameAnimation = (AnimationDrawable) drawKanji.getBackground();
		 
		 Button button1= (Button) findViewById(R.id.button2);
		 button1.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
		 
		 Button button2=(Button) findViewById(R.id.button1);
		 button2.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_num_animation1, menu);
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
	

	public void onTouchStart(View v) {
			frameAnimation.start();
	}	
	public void onTouchStop(View v){
			frameAnimation.stop();
	}
	public void prev(View v){
		Intent intent= new Intent(this, MainAnimation.class);
		startActivity(intent);

	}
	public void next(View v){
		Intent intent= new Intent(this, NumAnimation2.class);
		startActivity(intent);

	}

}
