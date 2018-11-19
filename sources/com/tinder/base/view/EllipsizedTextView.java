package com.tinder.base.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public class EllipsizedTextView extends AppCompatTextView {

    /* renamed from: com.tinder.base.view.EllipsizedTextView$1 */
    class C83151 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ EllipsizedTextView f29594a;

        C83151(EllipsizedTextView ellipsizedTextView) {
            this.f29594a = ellipsizedTextView;
        }

        public void onGlobalLayout() {
            this.f29594a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f29594a.m49834b();
            if (this.f29594a.getText() != null) {
                this.f29594a.setText(this.f29594a.getText());
            }
        }
    }

    public EllipsizedTextView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        m49832a();
    }

    public EllipsizedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49832a();
    }

    /* renamed from: a */
    private void m49832a() {
        setEllipsize(TruncateAt.END);
        getViewTreeObserver().addOnGlobalLayoutListener(new C83151(this));
    }

    /* renamed from: b */
    private void m49834b() {
        if (getLineHeight() > 0) {
            int height = (getHeight() / getLineHeight()) - 1;
            if (height > 1) {
                setMaxLines(height);
                return;
            }
        }
        setSingleLine();
        setMaxLines(1);
    }
}
