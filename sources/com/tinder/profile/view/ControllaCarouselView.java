package com.tinder.profile.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0432b;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C2887d;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.common.p076a.C2640a;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import com.tinder.profile.p366e.C14408a;
import com.tinder.utils.RxUtils;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Subscription;
import rx.p494a.p496b.C19397a;

public class ControllaCarouselView extends FrameLayout {
    /* renamed from: a */
    private Subscription f45763a;
    /* renamed from: b */
    private boolean f45764b = false;
    /* renamed from: c */
    private boolean f45765c = false;
    @BindView(2131362237)
    CirclePageIndicator circlePageIndicator;
    /* renamed from: d */
    private C16137a f45766d;
    @Nullable
    /* renamed from: e */
    private C14443c f45767e;
    /* renamed from: f */
    private final OnPageChangeListener f45768f = new C177701(this);
    @BindView(2131362244)
    ViewPager viewPager;

    /* renamed from: com.tinder.profile.view.ControllaCarouselView$b */
    interface C14442b {
        /* renamed from: a */
        void mo11742a(C14408a c14408a);
    }

    /* renamed from: com.tinder.profile.view.ControllaCarouselView$c */
    interface C14443c {
        /* renamed from: b */
        void mo11743b(C14408a c14408a);
    }

    /* renamed from: com.tinder.profile.view.ControllaCarouselView$a */
    private static final class C16137a extends C0600i {
        /* renamed from: a */
        private C14442b f50208a;
        /* renamed from: b */
        private List<C14408a> f50209b;

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        private C16137a() {
            this.f50209b = Collections.emptyList();
        }

        /* renamed from: a */
        public void m61007a(List<C14408a> list) {
            this.f50209b = list;
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void m61006a(C14442b c14442b) {
            this.f50208a = c14442b;
        }

        /* renamed from: a */
        public C14408a m61004a(int i) {
            return (C14408a) this.f50209b.get(i);
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            C14408a c14408a = (C14408a) this.f50209b.get(i);
            View controllaAdvertisingView = new ControllaAdvertisingView(viewGroup.getContext(), null);
            controllaAdvertisingView.setIcon(c14408a.mo11613d());
            controllaAdvertisingView.setTitle(c14408a.mo11610a());
            controllaAdvertisingView.setDescription(c14408a.mo11611b());
            controllaAdvertisingView.setOnClickListener(new C14452h(this, c14408a));
            viewGroup.addView(controllaAdvertisingView);
            return controllaAdvertisingView;
        }

        /* renamed from: a */
        final /* synthetic */ void m61005a(C14408a c14408a, View view) {
            if (this.f50208a != null) {
                this.f50208a.mo11742a(c14408a);
            }
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((ControllaAdvertisingView) obj);
        }

        public int getCount() {
            return this.f50209b.size();
        }
    }

    /* renamed from: com.tinder.profile.view.ControllaCarouselView$1 */
    class C177701 extends C2887d {
        /* renamed from: a */
        final /* synthetic */ ControllaCarouselView f55452a;

        C177701(ControllaCarouselView controllaCarouselView) {
            this.f55452a = controllaCarouselView;
        }

        public void onPageSelected(int i) {
            this.f55452a.m55141a(i);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m55147a(long j) {
        m55145c(j);
    }

    public ControllaCarouselView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.view_controlla_carousel, this);
        ButterKnife.a(this);
        this.viewPager.addOnPageChangeListener(this.f45768f);
        this.f45766d = new C16137a();
        this.viewPager.setAdapter(this.f45766d);
        this.circlePageIndicator.setViewPager(this.viewPager);
        m55144c();
        m55143b(2000);
    }

    public void setViewModels(List<C14408a> list) {
        C2640a.a(list.isEmpty() ^ 1, "View models cannot be empty");
        this.viewPager.setOffscreenPageLimit(list.size() - 1);
        this.f45766d.m61007a((List) list);
        m55141a((int) null);
    }

    public void setItemClickListener(C14442b c14442b) {
        this.f45766d.m61006a(c14442b);
    }

    public void setAdvertisingPageChangeListener(C14443c c14443c) {
        this.f45767e = c14443c;
    }

    /* renamed from: b */
    private void m55143b(long j) {
        m55146a();
        this.f45763a = Observable.a(j, TimeUnit.MILLISECONDS).l().a(C19397a.a()).a(new C18594e(this), C18595f.f57998a);
    }

    /* renamed from: a */
    public void m55146a() {
        RxUtils.b(this.f45763a);
    }

    /* renamed from: b */
    public void m55149b() {
        m55143b(DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    }

    /* renamed from: c */
    private void m55145c(long j) {
        if (this.f45764b == null) {
            if (this.f45765c != null) {
                m55143b(DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
            }
            j = this.viewPager.getCurrentItem() + 1;
            if (j == this.f45766d.getCount()) {
                j = null;
            }
            this.viewPager.setCurrentItem(j);
        }
    }

    /* renamed from: c */
    private void m55144c() {
        this.viewPager.setOnTouchListener(new C14451g(this));
    }

    /* renamed from: a */
    final /* synthetic */ boolean m55148a(View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case null:
            case 2:
                this.f45764b = true;
                m55146a();
                break;
            case 1:
                this.f45764b = false;
                this.f45765c = true;
                m55143b(4000);
                break;
            default:
                break;
        }
        return false;
    }

    /* renamed from: a */
    private void m55141a(int i) {
        i = this.f45766d.m61004a(i);
        this.circlePageIndicator.setFillColor(C0432b.c(getContext(), i.mo11612c()));
        if (this.f45767e != null) {
            this.f45767e.mo11743b(i);
        }
    }
}
