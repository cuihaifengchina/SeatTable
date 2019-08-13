package com.qiye.myviewtest;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class HotalView extends View {


    List<String> list=new ArrayList<String>();

    public HotalView(Context context) {
        super(context);
    }

    public HotalView(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        initList();

        float x=0;
        float y=50;

        Paint paint=new Paint();
        paint.setStyle(Paint.Style.STROKE);//空心

        Paint paintText=new Paint();
        paintText.setColor(getResources().getColor(R.color.colorAccent));
        for (String item:list){
            x=x+50;

            if (item.equals("0"))
                continue;
            canvas.drawRect(x,0,x+50,y,paint);
            canvas.drawText(item,x+10,y-10,paintText);



        }



    }



    private void initList(){
        list.add("101");
        list.add("0");
        list.add("102");
        list.add("0");
        list.add("103");
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("104");
    }
}
