package com.tinder.learnmore;

import android.support.annotation.NonNull;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;

public class LearnMoreLinkMovementMethod extends LinkMovementMethod {
    /* renamed from: a */
    private final OnLinksClickedListener f32372a;

    public interface OnLinksClickedListener {
        void onContactUsClicked();

        void onPrivacyPolicyClicked();
    }

    public LearnMoreLinkMovementMethod(OnLinksClickedListener onLinksClickedListener) {
        this.f32372a = onLinksClickedListener;
    }

    public boolean onTouchEvent(@NonNull TextView textView, @NonNull Spannable spannable, @NonNull MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 1) {
            int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            x = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(x, x, URLSpan.class);
            if (uRLSpanArr.length != 0) {
                motionEvent = uRLSpanArr[null].getURL();
                if (motionEvent.endsWith("#contact")) {
                    textView.clearFocus();
                    if (this.f32372a == null) {
                        return true;
                    }
                    this.f32372a.onContactUsClicked();
                } else if (motionEvent.endsWith("#privacy") != null) {
                    textView.clearFocus();
                    if (this.f32372a != null) {
                        this.f32372a.onPrivacyPolicyClicked();
                    }
                } else {
                    z = false;
                }
                return z;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
