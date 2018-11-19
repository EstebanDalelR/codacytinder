package com.jakewharton.rxbinding2.p135a.p138b.p139a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import com.jakewharton.rxbinding2.internal.C5720a;
import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.p453a.C17353a;

/* renamed from: com.jakewharton.rxbinding2.a.b.a.d */
final class C7832d extends C3959e<Integer> {
    /* renamed from: a */
    private final RecyclerView f28306a;

    /* renamed from: com.jakewharton.rxbinding2.a.b.a.d$a */
    final class C7831a extends C17353a {
        /* renamed from: a */
        final OnScrollListener f28303a;
        /* renamed from: b */
        final /* synthetic */ C7832d f28304b;
        /* renamed from: c */
        private final RecyclerView f28305c;

        C7831a(final C7832d c7832d, RecyclerView recyclerView, final Observer<? super Integer> observer) {
            this.f28304b = c7832d;
            this.f28305c = recyclerView;
            this.f28303a = new OnScrollListener(this) {
                /* renamed from: c */
                final /* synthetic */ C7831a f25482c;

                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (this.f25482c.isDisposed() == null) {
                        observer.onNext(Integer.valueOf(i));
                    }
                }
            };
        }

        /* renamed from: a */
        protected void m33598a() {
            this.f28305c.removeOnScrollListener(this.f28303a);
        }
    }

    C7832d(RecyclerView recyclerView) {
        this.f28306a = recyclerView;
    }

    protected void subscribeActual(Observer<? super Integer> observer) {
        if (C5720a.m25012a(observer)) {
            Object c7831a = new C7831a(this, this.f28306a, observer);
            observer.onSubscribe(c7831a);
            this.f28306a.addOnScrollListener(c7831a.f28303a);
        }
    }
}
