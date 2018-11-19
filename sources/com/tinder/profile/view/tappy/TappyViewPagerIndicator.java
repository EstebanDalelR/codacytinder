package com.tinder.profile.view.tappy;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.recs.view.tappablecards.TappyPageIndicatorView;
import com.viewpagerindicator.PageIndicator;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/profile/view/tappy/TappyViewPagerIndicator;", "Lcom/tinder/recs/view/tappablecards/TappyPageIndicatorView;", "Lcom/viewpagerindicator/PageIndicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pageChangeListener", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "viewPager", "Landroid/support/v4/view/ViewPager;", "notifyDataSetChanged", "", "onPageScrollStateChanged", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "setCurrentItem", "item", "setOnPageChangeListener", "listener", "setViewPager", "initialPosition", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappyViewPagerIndicator extends TappyPageIndicatorView implements PageIndicator {
    /* renamed from: a */
    private ViewPager f55464a;
    /* renamed from: b */
    private OnPageChangeListener f55465b;
    /* renamed from: c */
    private HashMap f55466c;

    public void _$_clearFindViewByIdCache() {
        if (this.f55466c != null) {
            this.f55466c.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f55466c == null) {
            this.f55466c = new HashMap();
        }
        View view = (View) this.f55466c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f55466c.put(Integer.valueOf(i), view);
        return view;
    }

    public TappyViewPagerIndicator(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        getRenderer().setPageCountProvider((Function0) new Function0<Integer>() {
            public /* synthetic */ Object invoke() {
                return Integer.valueOf(m67056a());
            }

            /* renamed from: a */
            public final int m67056a() {
                ViewPager a = this.f55464a;
                if (a != null) {
                    C0600i adapter = a.getAdapter();
                    if (adapter != null) {
                        return adapter.getCount();
                    }
                }
                return 0;
            }
        });
        getRenderer().setPageActive((Function1) new Function1<Integer, Boolean>() {
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(m67057a(((Number) obj).intValue()));
            }

            /* renamed from: a */
            public final boolean m67057a(int i) {
                ViewPager a = this.f55464a;
                return a != null && i == a.getCurrentItem();
            }
        });
    }

    public void setViewPager(@NotNull ViewPager viewPager) {
        C2668g.b(viewPager, "viewPager");
        if (!C2668g.a(this.f55464a, viewPager)) {
            if (viewPager.getAdapter() == null) {
                throw ((Throwable) new IllegalStateException("ViewPager does not have adapter instance."));
            }
            ViewPager viewPager2 = this.f55464a;
            if (viewPager2 != null) {
                viewPager2.removeOnPageChangeListener(this);
            }
            this.f55464a = viewPager;
            viewPager = this.f55464a;
            if (viewPager != null) {
                viewPager.addOnPageChangeListener(this);
            }
            invalidate();
        }
    }

    public void setViewPager(@NotNull ViewPager viewPager, int i) {
        C2668g.b(viewPager, "viewPager");
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public void setCurrentItem(int i) {
        if (this.f55464a == null) {
            throw ((Throwable) new IllegalStateException("ViewPager has not been bound."));
        }
        ViewPager viewPager = this.f55464a;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
        }
        invalidate();
    }

    public void setOnPageChangeListener(@Nullable OnPageChangeListener onPageChangeListener) {
        this.f55465b = onPageChangeListener;
    }

    public void notifyDataSetChanged() {
        invalidate();
    }

    public void onPageScrollStateChanged(int i) {
        OnPageChangeListener onPageChangeListener = this.f55465b;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        OnPageChangeListener onPageChangeListener = this.f55465b;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        OnPageChangeListener onPageChangeListener = this.f55465b;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
        invalidate();
    }
}
