package com.jakewharton.rxbinding2.p135a.p136a.p137a;

import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0218d;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import com.jakewharton.rxbinding2.internal.C5720a;
import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.p453a.C17353a;

/* renamed from: com.jakewharton.rxbinding2.a.a.a.f */
final class C7828f extends C3959e<C5713e> {
    /* renamed from: a */
    final TabLayout f28298a;

    /* renamed from: com.jakewharton.rxbinding2.a.a.a.f$a */
    final class C7827a extends C17353a implements OnTabSelectedListener {
        /* renamed from: a */
        final /* synthetic */ C7828f f28295a;
        /* renamed from: b */
        private final TabLayout f28296b;
        /* renamed from: c */
        private final Observer<? super C5713e> f28297c;

        C7827a(C7828f c7828f, TabLayout tabLayout, Observer<? super C5713e> observer) {
            this.f28295a = c7828f;
            this.f28296b = tabLayout;
            this.f28297c = observer;
        }

        public void onTabSelected(C0218d c0218d) {
            if (!isDisposed()) {
                this.f28297c.onNext(C7020h.m30521a(this.f28295a.f28298a, c0218d));
            }
        }

        public void onTabUnselected(C0218d c0218d) {
            if (!isDisposed()) {
                this.f28297c.onNext(C7021i.m30522a(this.f28295a.f28298a, c0218d));
            }
        }

        public void onTabReselected(C0218d c0218d) {
            if (!isDisposed()) {
                this.f28297c.onNext(C7019g.m30520a(this.f28295a.f28298a, c0218d));
            }
        }

        /* renamed from: a */
        protected void m33596a() {
            this.f28296b.b(this);
        }
    }

    C7828f(TabLayout tabLayout) {
        this.f28298a = tabLayout;
    }

    protected void subscribeActual(Observer<? super C5713e> observer) {
        if (C5720a.m25012a(observer)) {
            Object c7827a = new C7827a(this, this.f28298a, observer);
            observer.onSubscribe(c7827a);
            this.f28298a.a(c7827a);
            int selectedTabPosition = this.f28298a.getSelectedTabPosition();
            if (selectedTabPosition != -1) {
                observer.onNext(C7020h.m30521a(this.f28298a, this.f28298a.a(selectedTabPosition)));
            }
        }
    }
}
