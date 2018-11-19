package com.jakewharton.rxbinding2.p140b;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.jakewharton.rxbinding2.internal.C5720a;
import com.jakewharton.rxbinding2.internal.Notification;
import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.p453a.C17353a;

/* renamed from: com.jakewharton.rxbinding2.b.b */
final class C7835b extends C3959e<Object> {
    /* renamed from: a */
    private final boolean f28310a;
    /* renamed from: b */
    private final View f28311b;

    /* renamed from: com.jakewharton.rxbinding2.b.b$a */
    static final class C7834a extends C17353a implements OnAttachStateChangeListener {
        /* renamed from: a */
        private final View f28307a;
        /* renamed from: b */
        private final boolean f28308b;
        /* renamed from: c */
        private final Observer<? super Object> f28309c;

        C7834a(View view, boolean z, Observer<? super Object> observer) {
            this.f28307a = view;
            this.f28308b = z;
            this.f28309c = observer;
        }

        public void onViewAttachedToWindow(View view) {
            if (this.f28308b != null && isDisposed() == null) {
                this.f28309c.onNext(Notification.INSTANCE);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (this.f28308b == null && isDisposed() == null) {
                this.f28309c.onNext(Notification.INSTANCE);
            }
        }

        /* renamed from: a */
        protected void m33601a() {
            this.f28307a.removeOnAttachStateChangeListener(this);
        }
    }

    C7835b(View view, boolean z) {
        this.f28311b = view;
        this.f28310a = z;
    }

    protected void subscribeActual(Observer<? super Object> observer) {
        if (C5720a.m25012a(observer)) {
            Object c7834a = new C7834a(this.f28311b, this.f28310a, observer);
            observer.onSubscribe(c7834a);
            this.f28311b.addOnAttachStateChangeListener(c7834a);
        }
    }
}
