package com.jakewharton.rxbinding.view;

import android.view.View;
import android.view.View.OnClickListener;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.p494a.C19562a;

/* renamed from: com.jakewharton.rxbinding.view.d */
final class C8220d implements OnSubscribe<Void> {
    /* renamed from: a */
    final View f29364a;

    /* renamed from: com.jakewharton.rxbinding.view.d$2 */
    class C78222 extends C19562a {
        /* renamed from: a */
        final /* synthetic */ C8220d f28286a;

        C78222(C8220d c8220d) {
            this.f28286a = c8220d;
        }

        /* renamed from: a */
        protected void m33588a() {
            this.f28286a.f29364a.setOnClickListener(null);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m35025a((C19571c) obj);
    }

    C8220d(View view) {
        this.f29364a = view;
    }

    /* renamed from: a */
    public void m35025a(final C19571c<? super Void> c19571c) {
        C19562a.b();
        OnClickListener c57091 = new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ C8220d f21116b;

            public void onClick(View view) {
                if (c19571c.isUnsubscribed() == null) {
                    c19571c.onNext(null);
                }
            }
        };
        c19571c.add(new C78222(this));
        this.f29364a.setOnClickListener(c57091);
    }
}
