package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0218d;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import com.jakewharton.rxbinding.support.design.widget.TabLayoutSelectionEvent.Kind;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.p494a.C19562a;

/* renamed from: com.jakewharton.rxbinding.support.design.widget.b */
final class C8218b implements OnSubscribe<TabLayoutSelectionEvent> {
    /* renamed from: a */
    final TabLayout f29361a;

    /* renamed from: com.jakewharton.rxbinding.support.design.widget.b$2 */
    class C78202 extends C19562a {
        /* renamed from: a */
        final /* synthetic */ C8218b f28283a;

        C78202(C8218b c8218b) {
            this.f28283a = c8218b;
        }

        /* renamed from: a */
        protected void m33586a() {
            this.f28283a.f29361a.setOnTabSelectedListener(null);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m35023a((C19571c) obj);
    }

    C8218b(TabLayout tabLayout) {
        this.f29361a = tabLayout;
    }

    /* renamed from: a */
    public void m35023a(final C19571c<? super TabLayoutSelectionEvent> c19571c) {
        C19562a.b();
        OnTabSelectedListener c70181 = new OnTabSelectedListener(this) {
            /* renamed from: b */
            final /* synthetic */ C8218b f25471b;

            public void onTabSelected(C0218d c0218d) {
                if (!c19571c.isUnsubscribed()) {
                    c19571c.onNext(TabLayoutSelectionEvent.m30516a(this.f25471b.f29361a, Kind.SELECTED, c0218d));
                }
            }

            public void onTabUnselected(C0218d c0218d) {
                if (!c19571c.isUnsubscribed()) {
                    c19571c.onNext(TabLayoutSelectionEvent.m30516a(this.f25471b.f29361a, Kind.UNSELECTED, c0218d));
                }
            }

            public void onTabReselected(C0218d c0218d) {
                if (!c19571c.isUnsubscribed()) {
                    c19571c.onNext(TabLayoutSelectionEvent.m30516a(this.f25471b.f29361a, Kind.RESELECTED, c0218d));
                }
            }
        };
        c19571c.add(new C78202(this));
        this.f29361a.setOnTabSelectedListener(c70181);
        int selectedTabPosition = this.f29361a.getSelectedTabPosition();
        if (selectedTabPosition != -1) {
            c19571c.onNext(TabLayoutSelectionEvent.m30516a(this.f29361a, Kind.SELECTED, this.f29361a.a(selectedTabPosition)));
        }
    }
}
