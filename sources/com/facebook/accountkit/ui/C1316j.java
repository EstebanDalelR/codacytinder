package com.facebook.accountkit.ui;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.facebook.accountkit.ui.j */
final class C1316j extends LinkMovementMethod {
    /* renamed from: a */
    private final C1315a f3459a;

    /* renamed from: com.facebook.accountkit.ui.j$a */
    interface C1315a {
        /* renamed from: a */
        void mo1619a(String str);
    }

    public C1316j(C1315a c1315a) {
        this.f3459a = c1315a;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            x = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(x, x, URLSpan.class);
            if (uRLSpanArr.length != 0) {
                this.f3459a.mo1619a(uRLSpanArr[0].getURL());
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
