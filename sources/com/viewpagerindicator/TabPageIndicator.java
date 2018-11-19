package com.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.viewpagerindicator.C15509b.C15503a;

public class TabPageIndicator extends HorizontalScrollView implements PageIndicator {
    /* renamed from: a */
    private static final CharSequence f56723a = "";
    /* renamed from: b */
    private Runnable f56724b;
    /* renamed from: c */
    private final OnClickListener f56725c;
    /* renamed from: d */
    private final C15502a f56726d;
    /* renamed from: e */
    private ViewPager f56727e;
    /* renamed from: f */
    private OnPageChangeListener f56728f;
    /* renamed from: g */
    private int f56729g;
    /* renamed from: h */
    private int f56730h;
    /* renamed from: i */
    private OnTabReselectedListener f56731i;

    public interface OnTabReselectedListener {
        void onTabReselected(int i);
    }

    /* renamed from: com.viewpagerindicator.TabPageIndicator$a */
    private class C15496a extends TextView {
        /* renamed from: a */
        final /* synthetic */ TabPageIndicator f47936a;
        /* renamed from: b */
        private int f47937b;

        public C15496a(TabPageIndicator tabPageIndicator, Context context) {
            this.f47936a = tabPageIndicator;
            super(context, null, C15503a.vpiTabPageIndicatorStyle);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f47936a.f56729g > 0 && getMeasuredWidth() > this.f47936a.f56729g) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(this.f47936a.f56729g, 1073741824), i2);
            }
        }
    }

    public void setOnTabReselectedListener(OnTabReselectedListener onTabReselectedListener) {
        this.f56731i = onTabReselectedListener;
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f56726d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f56729g = -1;
        } else if (childCount > 2) {
            this.f56729g = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
        } else {
            this.f56729g = MeasureSpec.getSize(i) / 2;
        }
        mode = getMeasuredWidth();
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        if (z && mode != i) {
            setCurrentItem(this.f56730h);
        }
    }

    /* renamed from: a */
    private void m66316a(int i) {
        i = this.f56726d.getChildAt(i);
        if (this.f56724b != null) {
            removeCallbacks(this.f56724b);
        }
        this.f56724b = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ TabPageIndicator f47935b;

            public void run() {
                this.f47935b.smoothScrollTo(i.getLeft() - ((this.f47935b.getWidth() - i.getWidth()) / 2), 0);
                this.f47935b.f56724b = null;
            }
        };
        post(this.f56724b);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f56724b != null) {
            post(this.f56724b);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f56724b != null) {
            removeCallbacks(this.f56724b);
        }
    }

    /* renamed from: a */
    private void m66317a(int i, CharSequence charSequence, int i2) {
        View c15496a = new C15496a(this, getContext());
        c15496a.f47937b = i;
        c15496a.setFocusable(1);
        c15496a.setOnClickListener(this.f56725c);
        c15496a.setText(charSequence);
        if (i2 != 0) {
            c15496a.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        }
        this.f56726d.addView(c15496a, new LayoutParams(0, -1, 1.0f));
    }

    public void onPageScrollStateChanged(int i) {
        if (this.f56728f != null) {
            this.f56728f.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f56728f != null) {
            this.f56728f.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        setCurrentItem(i);
        if (this.f56728f != null) {
            this.f56728f.onPageSelected(i);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f56727e != viewPager) {
            if (this.f56727e != null) {
                this.f56727e.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f56727e = viewPager;
            viewPager.setOnPageChangeListener(this);
            notifyDataSetChanged();
        }
    }

    public void notifyDataSetChanged() {
        this.f56726d.removeAllViews();
        C0600i adapter = this.f56727e.getAdapter();
        IconPagerAdapter iconPagerAdapter = adapter instanceof IconPagerAdapter ? (IconPagerAdapter) adapter : null;
        int count = adapter.getCount();
        int i = 0;
        while (i < count) {
            CharSequence pageTitle = adapter.getPageTitle(i);
            if (pageTitle == null) {
                pageTitle = f56723a;
            }
            m66317a(i, pageTitle, iconPagerAdapter != null ? iconPagerAdapter.getIconResId(i) : 0);
            i++;
        }
        if (this.f56730h > count) {
            this.f56730h = count - 1;
        }
        setCurrentItem(this.f56730h);
        requestLayout();
    }

    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public void setCurrentItem(int i) {
        if (this.f56727e == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f56730h = i;
        this.f56727e.setCurrentItem(i);
        int childCount = this.f56726d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f56726d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m66316a(i);
            }
            i2++;
        }
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f56728f = onPageChangeListener;
    }
}
