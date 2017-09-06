package com.example.tashi.coordinator;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by tashi on 9/3/17.
 */

public class SearchHeaderView extends LinearLayout {
    public TextView detail;
    public TextView mini;
    public SearchHeaderView(Context context) {
        super(context);
        setOrientation(VERTICAL);
    }

    public SearchHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOrientation(VERTICAL);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        detail = findViewById(R.id.detail);
        mini = findViewById(R.id.mini);
    }
}
