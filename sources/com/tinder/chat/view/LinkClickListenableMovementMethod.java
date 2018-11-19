package com.tinder.chat.view;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

public class LinkClickListenableMovementMethod extends LinkMovementMethod {
    /* renamed from: a */
    private OnLinksClickedListener f30094a;

    public interface OnLinksClickedListener {
        void onLinkClicked(String str);
    }

    public LinkClickListenableMovementMethod(OnLinksClickedListener onLinksClickedListener) {
        this.f30094a = onLinksClickedListener;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getEventTime() - motionEvent.getDownTime() > ((long) ViewConfiguration.getTapTimeout())) {
                return null;
            }
            int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            x = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
            if (!(((ClickableSpan[]) spannable.getSpans(x, x, ClickableSpan.class)).length == 0 || this.f30094a == null)) {
                this.f30094a.onLinkClicked(spannable.toString());
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
