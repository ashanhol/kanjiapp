package adina.education.kanji_gate;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainAnimation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_animation);
		String title= "Kanji-gate";
		getActionBar().setTitle(title);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_animation, menu);
		return true;
	}

	public void Numbers(View v) {
		Intent intent= new Intent(this, NumAnimation.class);
		startActivity(intent);
	}
	public void back(View v){
		Intent intent= new Intent(this, Welcome.class);
		startActivity(intent);
	}
	
}
