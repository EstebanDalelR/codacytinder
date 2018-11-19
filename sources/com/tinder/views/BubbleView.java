package com.tinder.views;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.tinder.R;
import com.tinder.utils.av;

public class BubbleView extends FrameLayout {
    /* renamed from: a */
    private boolean f47721a;
    @BindView(2131362007)
    View mBubbleLarge;
    @BindView(2131362008)
    View mBubbleSmall;
    @BindView(2131362211)
    TextView mContentTextView;

    public void setText(String str) {
        this.mContentTextView.setText(str);
    }

    public void setTailTop(int i) {
        post(new C15441b(this, i));
    }

    /* renamed from: b */
    final /* synthetic */ void m57835b(int i) {
        float width = (float) this.mBubbleLarge.getWidth();
        float height = (float) this.mBubbleSmall.getHeight();
        i = m57833c(i);
        if (!this.f47721a) {
            this.mBubbleLarge.setBackgroundResource(R.drawable.bubble_view_circle_light);
            this.mBubbleSmall.setBackgroundResource(R.drawable.bubble_view_circle_light);
        }
        i = (float) i;
        this.mBubbleSmall.setTranslationX((width / 1.5f) + i);
        this.mBubbleLarge.setTranslationX(i);
        this.mBubbleLarge.setTranslationY(av.a(6.0f, getContext()) + (height / 3.0f));
        this.mContentTextView.setTranslationY(av.a(6.0f, getContext()) + height);
    }

    public void setTailBottom(int i) {
        post(new C15442c(this, i));
    }

    /* renamed from: a */
    final /* synthetic */ void m57834a(int i) {
        float height = (float) this.mContentTextView.getHeight();
        float width = (float) this.mBubbleLarge.getWidth();
        float height2 = (float) this.mBubbleLarge.getHeight();
        i = (float) m57833c(i);
        this.mBubbleSmall.setTranslationX((width / 1.5f) + i);
        height2 /= 2.0f;
        this.mBubbleSmall.setTranslationY(height + height2);
        this.mBubbleLarge.setTranslationX(i);
        this.mBubbleLarge.setTranslationY(height - height2);
    }

    /* renamed from: c */
    private int m57833c(int i) {
        return i < 0 ? (int) av.a(1098907648, getContext()) : i;
    }

    public void setAlpha(float f) {
        this.mContentTextView.setAlpha(f);
        this.mBubbleLarge.setAlpha(f);
        this.mBubbleSmall.setAlpha(f);
    }

    public CharSequence getText() {
        return this.mContentTextView.getText();
    }

    public void setTextMaxWitdh(int i) {
        this.mContentTextView.setMaxWidth(i);
    }
}
