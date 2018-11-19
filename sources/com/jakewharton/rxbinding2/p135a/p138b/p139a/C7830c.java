package com.jakewharton.rxbinding2.p135a.p138b.p139a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import com.jakewharton.rxbinding2.internal.C5720a;
import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.p453a.C17353a;

/* renamed from: com.jakewharton.rxbinding2.a.b.a.c */
final class C7830c extends C3959e<C5714b> {
    /* renamed from: a */
    private final RecyclerView f28302a;

    /* renamed from: com.jakewharton.rxbinding2.a.b.a.c$a */
    final class C7829a extends C17353a {
        /* renamed from: a */
        final OnScrollListener f28299a;
        /* renamed from: b */
        final /* synthetic */ C7830c f28300b;
        /* renamed from: c */
        private final RecyclerView f28301c;

        C7829a(final C7830c c7830c, RecyclerView recyclerView, final Observer<? super C5714b> observer) {
            this.f28300b = c7830c;
            this.f28301c = recyclerView;
            this.f28299a = new OnScrollListener(this) {
                /* renamed from: c */
                final /* synthetic */ C7829a f25479c;

                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    if (!this.f25479c.isDisposed()) {
                        observer.onNext(C5714b.m24990a(recyclerView, i, i2));
                    }
                }
            };
        }

        /* renamed from: a */
        protected void m33597a() {
            this.f28301c.removeOnScrollListener(this.f28299a);
        }
    }

    C7830c(RecyclerView recyclerView) {
        this.f28302a = recyclerView;
    }

    protected void subscribeActual(Observer<? super C5714b> observer) {
        if (C5720a.m25012a(observer)) {
            Object c7829a = new C7829a(this, this.f28302a, observer);
            observer.onSubscribe(c7829a);
            this.f28302a.addOnScrollListener(c7829a.f28299a);
        }
    }
}
