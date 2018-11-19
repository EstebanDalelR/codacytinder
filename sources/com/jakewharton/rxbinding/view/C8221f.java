package com.jakewharton.rxbinding.view;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.p494a.C19562a;

/* renamed from: com.jakewharton.rxbinding.view.f */
final class C8221f implements OnSubscribe<Void> {
    /* renamed from: a */
    final View f29365a;

    public /* synthetic */ void call(Object obj) {
        m35026a((C19571c) obj);
    }

    C8221f(View view) {
        this.f29365a = view;
    }

    /* renamed from: a */
    public void m35026a(final C19571c<? super Void> c19571c) {
        C19562a.b();
        final OnLayoutChangeListener c57111 = new OnLayoutChangeListener(this) {
            /* renamed from: b */
            final /* synthetic */ C8221f f21119b;

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (c19571c.isUnsubscribed() == null) {
                    c19571c.onNext(0);
                }
            }
        };
        c19571c.add(new C19562a(this) {
            /* renamed from: b */
            final /* synthetic */ C8221f f28288b;

            /* renamed from: a */
            protected void m33589a() {
                this.f28288b.f29365a.removeOnLayoutChangeListener(c57111);
            }
        });
        this.f29365a.addOnLayoutChangeListener(c57111);
    }
}
