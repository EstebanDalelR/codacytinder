package com.tinder.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class BubbleView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private BubbleView f52897b;

    @UiThread
    public BubbleView_ViewBinding(BubbleView bubbleView, View view) {
        this.f52897b = bubbleView;
        bubbleView.mContentTextView = (TextView) C0761c.b(view, R.id.contentTextView, "field 'mContentTextView'", TextView.class);
        bubbleView.mBubbleSmall = C0761c.a(view, R.id.bubbleSmall, "field 'mBubbleSmall'");
        bubbleView.mBubbleLarge = C0761c.a(view, R.id.bubbleLarge, "field 'mBubbleLarge'");
    }

    @CallSuper
    public void unbind() {
        BubbleView bubbleView = this.f52897b;
        if (bubbleView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52897b = null;
        bubbleView.mContentTextView = null;
        bubbleView.mBubbleSmall = null;
        bubbleView.mBubbleLarge = null;
    }
}
