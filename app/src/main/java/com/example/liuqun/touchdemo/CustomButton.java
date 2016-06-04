package com.example.liuqun.touchdemo;

import android.content.Context;
import android.text.LoginFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by 90516 on 6/3/2016.
 */
public class CustomButton extends Button {

    private static final String TAG = "MotionEventDispatch";

    public CustomButton(Context context, AttributeSet attrs) {//attribute属性
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "CustomButton-onTouchEvent: ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "CustomButton-onTouchEvent: ACTION_UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "CustomButton-dispatchTouchEvent: ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "CustomButton-dispatchTouchEvent: ACTION_UP");
                break;
            default:
                break;
        }
        return super.dispatchTouchEvent(event);
    }
}
