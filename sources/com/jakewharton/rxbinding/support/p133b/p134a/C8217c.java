package com.jakewharton.rxbinding.support.p133b.p134a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.p494a.C19562a;

/* renamed from: com.jakewharton.rxbinding.support.b.a.c */
final class C8217c implements OnSubscribe<C7016b> {
    /* renamed from: a */
    final RecyclerView f29360a;

    public /* synthetic */ void call(Object obj) {
        m35022a((C19571c) obj);
    }

    public C8217c(RecyclerView recyclerView) {
        this.f29360a = recyclerView;
    }

    /* renamed from: a */
    public void m35022a(final C19571c<? super C7016b> c19571c) {
        C19562a.b();
        final OnScrollListener c70171 = new OnScrollListener(this) {
            /* renamed from: b */
            final /* synthetic */ C8217c f25467b;

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (!c19571c.isUnsubscribed()) {
                    c19571c.onNext(C7016b.m30515a(recyclerView, i, i2));
                }
            }
        };
        c19571c.add(new C19562a(this) {
            /* renamed from: b */
            final /* synthetic */ C8217c f28282b;

            /* renamed from: a */
            protected void m33585a() {
                this.f28282b.f29360a.removeOnScrollListener(c70171);
            }
        });
        this.f29360a.addOnScrollListener(c70171);
    }
}
