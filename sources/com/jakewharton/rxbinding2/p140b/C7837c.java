package com.jakewharton.rxbinding2.p140b;

import android.view.View;
import android.view.View.OnClickListener;
import com.jakewharton.rxbinding2.internal.C5720a;
import com.jakewharton.rxbinding2.internal.Notification;
import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.p453a.C17353a;

/* renamed from: com.jakewharton.rxbinding2.b.c */
final class C7837c extends C3959e<Object> {
    /* renamed from: a */
    private final View f28314a;

    /* renamed from: com.jakewharton.rxbinding2.b.c$a */
    static final class C7836a extends C17353a implements OnClickListener {
        /* renamed from: a */
        private final View f28312a;
        /* renamed from: b */
        private final Observer<? super Object> f28313b;

        C7836a(View view, Observer<? super Object> observer) {
            this.f28312a = view;
            this.f28313b = observer;
        }

        public void onClick(View view) {
            if (isDisposed() == null) {
                this.f28313b.onNext(Notification.INSTANCE);
            }
        }

        /* renamed from: a */
        protected void m33602a() {
            this.f28312a.setOnClickListener(null);
        }
    }

    C7837c(View view) {
        this.f28314a = view;
    }

    protected void subscribeActual(Observer<? super Object> observer) {
        if (C5720a.m25012a(observer)) {
            Object c7836a = new C7836a(this.f28314a, observer);
            observer.onSubscribe(c7836a);
            this.f28314a.setOnClickListener(c7836a);
        }
    }
}
