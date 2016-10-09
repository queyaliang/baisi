package demo.define.view;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class CustomView extends View{

	public CustomView(Context context) {
		super(context);
	}
	
	
	@Override
	protected void onDraw(Canvas canvas) {
		Paint paint = new Paint();
		
		paint.setColor(Color.RED);
		
		Rect rect = new Rect(0, 0, , bottom);
		
		canvas.dr
		
	}
	

}
