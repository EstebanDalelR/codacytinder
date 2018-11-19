package com.jakewharton.rxbinding2.p140b;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.jakewharton.rxbinding2.internal.C5720a;
import com.jakewharton.rxbinding2.internal.Notification;
import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.p453a.C17353a;

/* renamed from: com.jakewharton.rxbinding2.b.d */
final class C7839d extends C3959e<Object> {
    /* renamed from: a */
    private final View f28317a;

    /* renamed from: com.jakewharton.rxbinding2.b.d$a */
    static final class C7838a extends C17353a implements OnGlobalLayoutListener {
        /* renamed from: a */
        private final View f28315a;
        /* renamed from: b */
        private final Observer<? super Object> f28316b;

        C7838a(View view, Observer<? super Object> observer) {
            this.f28315a = view;
            this.f28316b = observer;
        }

        public void onGlobalLayout() {
            if (!isDisposed()) {
                this.f28316b.onNext(Notification.INSTANCE);
            }
        }

        /* renamed from: a */
        protected void m33603a() {
            this.f28315a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    C7839d(View view) {
        this.f28317a = view;
    }

    protected void subscribeActual(Observer<? super Object> observer) {
        if (C5720a.m25012a(observer)) {
            Object c7838a = new C7838a(this.f28317a, observer);
            observer.onSubscribe(c7838a);
            this.f28317a.getViewTreeObserver().addOnGlobalLayoutListener(c7838a);
        }
    }
}
