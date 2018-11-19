package com.tinder.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import com.tinder.C6250b.C6249b;
import java.lang.reflect.Field;
import p000a.p001a.C0001a;

public class ConfigurableScrollingViewPager extends ViewPager {
    /* renamed from: a */
    private float f52898a = ViewConfiguration.getScrollFriction();

    public ConfigurableScrollingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C6249b.ConfigurableScrollingViewPager, 0, 0);
            try {
                this.f52898a = context.getFloat(0, this.f52898a);
            } finally {
                context.recycle();
            }
        }
        setFriction(this.f52898a);
    }

    public void setFriction(float f) {
        this.f52898a = f;
        m63192a();
    }

    public float getFriction() {
        return this.f52898a;
    }

    /* renamed from: a */
    private void m63192a() {
        try {
            C15440a c15440a = new C15440a(getContext());
            c15440a.m57935a(800);
            c15440a.setFriction(this.f52898a);
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, c15440a);
        } catch (NoSuchFieldException e) {
            C0001a.e("Failed to override scroller in view pager, view pager implementation has no field 'mScroller'.", new Object[]{e});
        } catch (IllegalAccessException e2) {
            C0001a.e("Failed to set ConfigurableScrollableViewPager scroller found via reflection", new Object[]{e2});
        }
    }
}
