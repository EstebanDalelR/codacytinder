package com.jakewharton.rxbinding.support.p131a.p132a;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C2887d;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.p494a.C19562a;

/* renamed from: com.jakewharton.rxbinding.support.a.a.b */
final class C8215b implements OnSubscribe<Integer> {
    /* renamed from: a */
    final ViewPager f29358a;

    public /* synthetic */ void call(Object obj) {
        m35020a((C19571c) obj);
    }

    C8215b(ViewPager viewPager) {
        this.f29358a = viewPager;
    }

    /* renamed from: a */
    public void m35020a(final C19571c<? super Integer> c19571c) {
        C19562a.b();
        final OnPageChangeListener c78161 = new C2887d(this) {
            /* renamed from: b */
            final /* synthetic */ C8215b f28276b;

            public void onPageSelected(int i) {
                if (!c19571c.isUnsubscribed()) {
                    c19571c.onNext(Integer.valueOf(i));
                }
            }
        };
        c19571c.add(new C19562a(this) {
            /* renamed from: b */
            final /* synthetic */ C8215b f28278b;

            /* renamed from: a */
            protected void m33583a() {
                this.f28278b.f29358a.removeOnPageChangeListener(c78161);
            }
        });
        this.f29358a.addOnPageChangeListener(c78161);
        c19571c.onNext(Integer.valueOf(this.f29358a.getCurrentItem()));
    }
}
