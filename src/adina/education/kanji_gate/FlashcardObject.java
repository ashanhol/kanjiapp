package adina.education.kanji_gate;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;

public class FlashcardObject extends View{
	 private ShapeDrawable flashcard;
	 int left;
	 int top;
	 int right;
	 int bottom;
	 
	 private ShapeDrawable line1;
	 int lineTop1;
	 int lineBottom1;
	 
	 private ShapeDrawable line2;
	 int lineTop2;
	 int lineBottom2;
	 
	 private ShapeDrawable line3;
	 int lineTop3;
	 int lineBottom3;
	 
	 private ShapeDrawable line4;
	 int lineTop4;
	 int lineBottom4;
	 
	 private ShapeDrawable line5;
	 int lineTop5;
	 int lineBottom5;
	 
	 private ShapeDrawable line6;
	 int lineTop6;
	 int lineBottom6;
	 
	 private ShapeDrawable line7;
	 int lineTop7;
	 int lineBottom7;
	 
	 private ShapeDrawable line8;
	 int lineTop8;
	 int lineBottom8;
	 
	 private ShapeDrawable line9;
	 int lineTop9;
	 int lineBottom9;
	 
	 private ShapeDrawable line10;
	 int lineTop10;
	 int lineBottom10;
	 
	 private ShapeDrawable line11;
	 int lineTop11;
	 int lineBottom11;
	 
     public FlashcardObject(Context context) {
    	 super(context);
	
    	  left=120;
    	  top=50;
    	  right=1150;
    	  bottom=475;
    	  
    	  lineTop1=50;
    	  lineBottom1=60;
    	  lineTop2=90;
    	  lineBottom2=100;
    	  lineTop3=130;
    	  lineBottom3=140;
    	  lineTop4=170;
    	  lineBottom4=180;
    	  lineTop5=210;
    	  lineBottom5=220;
    	  lineTop6=250;
          lineBottom6=260;
          lineTop7=290;
          lineBottom7=300;
          lineTop8=330;
          lineBottom8=340;
          lineTop9=370;
          lineBottom9=380;
          lineTop10=410;
          lineBottom10=420;
          lineTop11=450;
          lineBottom11=460;
    	 
	     flashcard = new ShapeDrawable(new RectShape());
	     flashcard.getPaint().setColor(0xfff0ed3c);
	     flashcard.setBounds(left,top,right,bottom); 	
	     
	     line1= new ShapeDrawable(new RectShape());
	     line1.getPaint().setColor(0xff7fb0db);
	     line1.setBounds(left,lineTop1,right,lineBottom1);
	     line2= new ShapeDrawable(new RectShape());
	     line2.getPaint().setColor(0xff7fb0db);
	     line2.setBounds(left, lineTop2, right, lineBottom2);
	     line3= new ShapeDrawable(new RectShape());
	     line3.getPaint().setColor(0xff7fb0db);
	     line3.setBounds(left, lineTop3, right, lineBottom3);
	     line4= new ShapeDrawable(new RectShape());
	     line4.getPaint().setColor(0xff7fb0db);
	     line4.setBounds(left, lineTop4, right, lineBottom4);
	     line5= new ShapeDrawable(new RectShape());
	     line5.getPaint().setColor(0xff7fb0db);
	     line5.setBounds(left, lineTop5, right, lineBottom5);
	     line6= new ShapeDrawable(new RectShape());
	     line6.getPaint().setColor(0xff7fb0db);
	     line6.setBounds(left, lineTop6, right, lineBottom6);
	     line7= new ShapeDrawable(new RectShape());
	     line7.getPaint().setColor(0xff7fb0db);
	     line7.setBounds(left, lineTop7, right, lineBottom7);
	     line8= new ShapeDrawable(new RectShape());
	     line8.getPaint().setColor(0xff7fb0db);
	     line8.setBounds(left, lineTop8, right, lineBottom8);
	     line9= new ShapeDrawable(new RectShape());
	     line9.getPaint().setColor(0xff7fb0db);
	     line9.setBounds(left, lineTop9, right, lineBottom9);
	     line10= new ShapeDrawable(new RectShape());
	     line10.getPaint().setColor(0xff7fb0db);
	     line10.setBounds(left, lineTop10, right, lineBottom10);
	     line11= new ShapeDrawable(new RectShape());
	     line11.getPaint().setColor(0xff7fb0db);
	     line11.setBounds(left, lineTop11, right, lineBottom11);
	     
	     }
     public FlashcardObject(Context context, AttributeSet attrs){
    	 super(context, attrs);
    	
    	  left=120;
    	  top=50;
    	  right=1150;
    	  bottom=475;
    	 
    	  lineTop1=50;
    	  lineBottom1=60;
    	  lineTop2=90;
    	  lineBottom2=100;
    	  lineTop3=130;
    	  lineBottom3=140;
    	  lineTop4=170;
    	  lineBottom4=180;
    	  lineTop5=210;
    	  lineBottom5=220;
    	  lineTop6=250;
    	  lineBottom6=260;
    	  lineTop7=290;
          lineBottom7=300;
          lineTop8=330;
          lineBottom8=340;
          lineTop9=370;
          lineBottom9=380;
          lineTop10=410;
          lineBottom10=420;
          lineTop11=450;
          lineBottom11=460;
    	  
	     flashcard = new ShapeDrawable(new RectShape());
	     flashcard.getPaint().setColor(0xfff0ed3c);
	     flashcard.setBounds(left,top,right,bottom);
	     
	     line1= new ShapeDrawable(new RectShape());
	     line1.getPaint().setColor(0xff7fb0db);
	     line1.setBounds(left,lineTop1,right,lineBottom1);
	     line2= new ShapeDrawable(new RectShape());
	     line2.getPaint().setColor(0xff7fb0db);
	     line2.setBounds(left, lineTop2, right, lineBottom2);
	     line3= new ShapeDrawable(new RectShape());
	     line3.getPaint().setColor(0xff7fb0db);
	     line3.setBounds(left, lineTop3, right, lineBottom3);
	     line4= new ShapeDrawable(new RectShape());
	     line4.getPaint().setColor(0xff7fb0db);
	     line4.setBounds(left, lineTop4, right, lineBottom4);
	     line5= new ShapeDrawable(new RectShape());
	     line5.getPaint().setColor(0xff7fb0db);
	     line5.setBounds(left, lineTop5, right, lineBottom5);
	     line6= new ShapeDrawable(new RectShape());
	     line6.getPaint().setColor(0xff7fb0db);
	     line6.setBounds(left, lineTop6, right, lineBottom6);
	     line7= new ShapeDrawable(new RectShape());
	     line7.getPaint().setColor(0xff7fb0db);
	     line7.setBounds(left, lineTop7, right, lineBottom7);
	     line8= new ShapeDrawable(new RectShape());
	     line8.getPaint().setColor(0xff7fb0db);
	     line8.setBounds(left, lineTop8, right, lineBottom8);
	     line9= new ShapeDrawable(new RectShape());
	     line9.getPaint().setColor(0xff7fb0db);
	     line9.setBounds(left, lineTop9, right, lineBottom9);
	     line10= new ShapeDrawable(new RectShape());
	     line10.getPaint().setColor(0xff7fb0db);
	     line10.setBounds(left, lineTop10, right, lineBottom10);
	     line11= new ShapeDrawable(new RectShape());
	     line11.getPaint().setColor(0xff7fb0db);
	     line11.setBounds(left, lineTop11, right, lineBottom11);
     }
     public FlashcardObject(Context context, AttributeSet attrs, int defStyle){
    	 super(context, attrs, defStyle);
    	 
    	  left=120;
    	  top=50;
    	  right=1150;
    	  bottom=475;
    	 
    	  lineTop1=50;
    	  lineBottom1=60;
    	  lineTop2=90;
    	  lineBottom2=100;
    	  lineTop3=130;
    	  lineBottom3=140;
    	  lineTop4=170;
    	  lineBottom4=180;
    	  lineTop5=210;
    	  lineBottom5=220;
    	  lineTop6=250;
    	  lineBottom6=260;
    	  lineTop7=290;
          lineBottom7=300;
          lineTop8=330;
          lineBottom8=340;
          lineTop9=370;
          lineBottom9=380;
          lineTop10=410;
          lineBottom10=420;
          lineTop11=450;
          lineBottom11=460;
    	  
	     flashcard = new ShapeDrawable(new RectShape());
	     flashcard.getPaint().setColor(0xfff0ed3c);
	     flashcard.setBounds(left,top,right,bottom);
	     
	     line1= new ShapeDrawable(new RectShape());
	     line1.getPaint().setColor(0xff7fb0db);
	     line1.setBounds(left,lineTop1,right,lineBottom1);
	     line2= new ShapeDrawable(new RectShape());
	     line2.getPaint().setColor(0xff7fb0db);
	     line2.setBounds(left, lineTop2, right, lineBottom2);
	     line3= new ShapeDrawable(new RectShape());
	     line3.getPaint().setColor(0xff7fb0db);
	     line3.setBounds(left, lineTop3, right, lineBottom3);
	     line4= new ShapeDrawable(new RectShape());
	     line4.getPaint().setColor(0xff7fb0db);
	     line4.setBounds(left, lineTop4, right, lineBottom4);
	     line5= new ShapeDrawable(new RectShape());
	     line5.getPaint().setColor(0xff7fb0db);
	     line5.setBounds(left, lineTop5, right, lineBottom5);
	     line6= new ShapeDrawable(new RectShape());
	     line6.getPaint().setColor(0xff7fb0db);
	     line6.setBounds(left, lineTop6, right, lineBottom6);
	     line7= new ShapeDrawable(new RectShape());
	     line7.getPaint().setColor(0xff7fb0db);
	     line7.setBounds(left, lineTop7, right, lineBottom7);
	     line8= new ShapeDrawable(new RectShape());
	     line8.getPaint().setColor(0xff7fb0db);
	     line8.setBounds(left, lineTop8, right, lineBottom8);
	     line9= new ShapeDrawable(new RectShape());
	     line9.getPaint().setColor(0xff7fb0db);
	     line9.setBounds(left, lineTop9, right, lineBottom9);
	     line10= new ShapeDrawable(new RectShape());
	     line10.getPaint().setColor(0xff7fb0db);
	     line10.setBounds(left, lineTop10, right, lineBottom10);
	     line11= new ShapeDrawable(new RectShape());
	     line11.getPaint().setColor(0xff7fb0db);
	     line11.setBounds(left, lineTop11, right, lineBottom11);
     }

/*    public void resetBounds(int left, int top, int right, int bottom){
    	flashcard.setBounds(left, top, right, bottom);
    } */
 
     protected void onMeasure(){
    	 setMeasuredDimension(100, 100);
     }
     
     protected void onDraw(Canvas canvas) {
    	 
    	 flashcard.draw(canvas);
    	 line1.draw(canvas);
    	 line2.draw(canvas);
    	 line3.draw(canvas);
    	 line4.draw(canvas);
    	 line5.draw(canvas);
    	 line6.draw(canvas);
    	 line7.draw(canvas);
    	 line8.draw(canvas);
    	 line9.draw(canvas);
    	 line10.draw(canvas);
    	 line11.draw(canvas);
    	  
   	}
}


