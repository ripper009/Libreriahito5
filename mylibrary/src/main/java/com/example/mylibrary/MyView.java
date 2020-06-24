package com.example.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.text.AttributedCharacterIterator;

public class MyView extends LinearLayout {
    public MyView(Context context){
        super(context);
        initialize(context);
    }

    public MyView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context,R.layout.myview, this);

    }
}
