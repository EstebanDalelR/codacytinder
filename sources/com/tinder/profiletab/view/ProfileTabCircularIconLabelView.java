package com.tinder.profiletab.view;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.C6250b.C6249b;
import com.tinder.R;

public class ProfileTabCircularIconLabelView extends LinearLayout {
    /* renamed from: a */
    private ColorStateList f45847a;
    @BindView(2131362125)
    FloatingActionButton actionButton;
    /* renamed from: b */
    private Drawable f45848b;
    /* renamed from: c */
    private ObjectAnimator f45849c;
    @BindView(2131362126)
    TextView labelView;

    public ProfileTabCircularIconLabelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_circular_icon_with_label, this);
        ButterKnife.a(this);
        setOrientation(1);
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C6249b.ProfileTabCircularIconLabelView, 0, 0);
            try {
                attributeSet = context.getDrawable(0);
                CharSequence string = context.getString(1);
                this.actionButton.setImageDrawable(attributeSet);
                this.labelView.setText(string);
            } finally {
                context.recycle();
            }
        }
    }

    public void setOnClickListener(@Nullable OnClickListener onClickListener) {
        this.actionButton.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public void m55292a(float f, int i) {
        FloatingActionButton floatingActionButton = this.actionButton;
        r2 = new PropertyValuesHolder[2];
        r2[0] = PropertyValuesHolder.ofFloat("scaleX", new float[]{f});
        r2[1] = PropertyValuesHolder.ofFloat("scaleY", new float[]{f});
        this.f45849c = ObjectAnimator.ofPropertyValuesHolder(floatingActionButton, r2);
        this.f45849c.setDuration((long) i);
        this.f45849c.setRepeatCount(-1);
        this.f45849c.setRepeatMode(2);
        this.f45849c.start();
    }

    /* renamed from: a */
    public void m55291a() {
        if (this.f45849c != null) {
            this.f45849c.cancel();
        }
        this.actionButton.clearAnimation();
        this.f45849c = null;
    }

    public void setColor(@ColorRes int i) {
        this.f45847a = this.actionButton.getBackgroundTintList();
        this.actionButton.setBackgroundTintList(ColorStateList.valueOf(getContext().getResources().getColor(i)));
    }

    /* renamed from: b */
    public void m55293b() {
        if (this.f45847a != null) {
            this.actionButton.setBackgroundTintList(this.f45847a);
        }
    }

    public void setDrawable(@DrawableRes int i) {
        this.f45848b = this.actionButton.getDrawable();
        this.actionButton.setImageDrawable(getContext().getResources().getDrawable(i));
    }

    /* renamed from: c */
    public void m55294c() {
        if (this.f45848b != null) {
            this.actionButton.setImageDrawable(this.f45848b);
        }
    }

    /* renamed from: d */
    public void m55295d() {
        m55291a();
        setScaleX(1.0f);
        setScaleY(1.0f);
        m55294c();
        m55293b();
    }
}
