package com.jakewharton.rxbinding.support.p133b.p134a;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import android.support.v7.widget.RecyclerView.ViewHolder;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.p494a.C19562a;

/* renamed from: com.jakewharton.rxbinding.support.b.a.a */
final class C8216a<T extends Adapter<? extends ViewHolder>> implements OnSubscribe<T> {
    /* renamed from: a */
    final T f29359a;

    public /* synthetic */ void call(Object obj) {
        m35021a((C19571c) obj);
    }

    C8216a(T t) {
        this.f29359a = t;
    }

    /* renamed from: a */
    public void m35021a(final C19571c<? super T> c19571c) {
        C19562a.b();
        final AdapterDataObserver c70151 = new AdapterDataObserver(this) {
            /* renamed from: b */
            final /* synthetic */ C8216a f25463b;

            public void onChanged() {
                if (!c19571c.isUnsubscribed()) {
                    c19571c.onNext(this.f25463b.f29359a);
                }
            }
        };
        c19571c.add(new C19562a(this) {
            /* renamed from: b */
            final /* synthetic */ C8216a f28280b;

            /* renamed from: a */
            protected void m33584a() {
                this.f28280b.f29359a.unregisterAdapterDataObserver(c70151);
            }
        });
        this.f29359a.registerAdapterDataObserver(c70151);
        c19571c.onNext(this.f29359a);
    }
}
