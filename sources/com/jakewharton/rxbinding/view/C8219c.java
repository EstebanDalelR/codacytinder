package com.jakewharton.rxbinding.view;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.p494a.C19562a;

/* renamed from: com.jakewharton.rxbinding.view.c */
final class C8219c implements OnSubscribe<Void> {
    /* renamed from: a */
    final boolean f29362a;
    /* renamed from: b */
    final View f29363b;

    public /* synthetic */ void call(Object obj) {
        m35024a((C19571c) obj);
    }

    C8219c(View view, boolean z) {
        this.f29363b = view;
        this.f29362a = z;
    }

    /* renamed from: a */
    public void m35024a(final C19571c<? super Void> c19571c) {
        C19562a.b();
        final OnAttachStateChangeListener c57081 = new OnAttachStateChangeListener(this) {
            /* renamed from: b */
            final /* synthetic */ C8219c f21114b;

            public void onViewAttachedToWindow(@NonNull View view) {
                if (this.f21114b.f29362a != null && c19571c.isUnsubscribed() == null) {
                    c19571c.onNext(null);
                }
            }

            public void onViewDetachedFromWindow(@NonNull View view) {
                if (this.f21114b.f29362a == null && c19571c.isUnsubscribed() == null) {
                    c19571c.onNext(null);
                }
            }
        };
        c19571c.add(new C19562a(this) {
            /* renamed from: b */
            final /* synthetic */ C8219c f28285b;

            /* renamed from: a */
            protected void m33587a() {
                this.f28285b.f29363b.removeOnAttachStateChangeListener(c57081);
            }
        });
        this.f29363b.addOnAttachStateChangeListener(c57081);
    }
}
