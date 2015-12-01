package com.example.yaredbezu.swiperdiper;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;



public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{
    private TextView yarMessages;
    private GestureDetectorCompat gestureDetector;
    private LinearLayout yarlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yarlayout = new LinearLayout(this);
        setContentView(R.layout.activity_main);
        yarMessages=(TextView)findViewById(R.id.yarMessages);
        yarMessages = new TextView(this);
        yarMessages.setText("Lesson4");
        this.gestureDetector=new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
        yarMessages.setGravity(Gravity.CENTER_HORIZONTAL);
        yarMessages.setTextSize(50);
        yarlayout.setOrientation(LinearLayout.VERTICAL);
        yarlayout.setGravity(Gravity.CENTER_HORIZONTAL);
        yarlayout.setBackgroundColor(Color.rgb(153,255,51));
        yarlayout.addView(yarMessages);

        setContentView(yarlayout);
    }
////////////////// Begin Gestures //////////////////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        yarMessages.setText("onSingleTapConfirmed");
        return true;

    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        yarMessages.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        yarMessages.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        yarMessages.setText("onDown");

        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        yarMessages.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        yarMessages.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        yarMessages.setText("onScroll");

        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        yarMessages.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        yarMessages.setText("onFling");

        return true;
    }
//////////////////// End Gestures ///////////


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
