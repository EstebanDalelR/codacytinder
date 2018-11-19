package com.tinder.goingout.view;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import com.tinder.R;

public class TimeSinceTextView_ViewBinding implements Unbinder {
    @CallSuper
    public void unbind() {
    }

    @UiThread
    @Deprecated
    public TimeSinceTextView_ViewBinding(TimeSinceTextView timeSinceTextView, View view) {
        this(timeSinceTextView, view.getContext());
    }

    @UiThread
    public TimeSinceTextView_ViewBinding(TimeSinceTextView timeSinceTextView, Context context) {
        context = context.getResources();
        timeSinceTextView.mHoursAgo = context.getString(R.string.hours_ago);
        timeSinceTextView.mMinutesAgo = context.getString(R.string.minutes_ago);
    }
}
