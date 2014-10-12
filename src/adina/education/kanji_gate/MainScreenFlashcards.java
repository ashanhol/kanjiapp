package adina.education.kanji_gate;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainScreenFlashcards extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen_flashcards);
		//Button flashcards= (Button) findViewById(R.id.button2);
		//flashcards.setBackgroundColor(0xff87adfc);
		//flashcards.getBackground().setColorFilter(new LightingColorFilter(0xff87adfc, 0xff87adfc));
		//flashcards.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_screen_flashcards, menu);
		return true;
	}
	
	/** Called when the user clicks the number button */
	public void startNumbers(View view) {
		Intent intent= new Intent(this, NumFlashcards.class);
		startActivity(intent);

	}
	public void back(View v){
		Intent intent= new Intent(this, Welcome.class);
		startActivity(intent);
	}
	
	/*
	public class Header extends View{
		private ShapeDrawable pageheader;
		 int left;
		 int top;
		 int right;
		 int bottom; 
		
		public Header(Context context) {
	    	 super(context);
	    	 
	    	 left=1;
	    	 top=1;
	    	 right=1010;
	    	 bottom=50;
	    	 pageheader=new ShapeDrawable(new RectShape());
	    	 pageheader.getPaint().setColor(0x00adeb);
		     pageheader.setBounds(left,top,right,bottom); 
		 }
		 public Header(Context context, AttributeSet attrs){
	    	 super(context, attrs);
	    	 
	    	 left=1;
	    	 top=1;
	    	 right=1010;
	    	 bottom=50;
	    	 pageheader=new ShapeDrawable(new RectShape());
	    	 pageheader.getPaint().setColor(0x00adeb);
		     pageheader.setBounds(left,top,right,bottom);
		 }
		 public Header(Context context, AttributeSet attrs, int defStyle){
	    	 super(context, attrs, defStyle);
	    	 
	    	 left=1;
	    	 top=1;
	    	 right=1010;
	    	 bottom=50;
	    	 pageheader=new ShapeDrawable(new RectShape());
	    	 pageheader.getPaint().setColor(0x00adeb);
		     pageheader.setBounds(left,top,right,bottom);
		 }
		
		   protected void onMeasure(){
		    	 setMeasuredDimension(100, 100);
		     }
		     
		     protected void onDraw(Canvas canvas) {
		    	 pageheader.draw(canvas);
		     }
	}*/
	
	

}
