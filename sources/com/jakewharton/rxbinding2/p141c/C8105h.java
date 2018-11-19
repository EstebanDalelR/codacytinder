package com.jakewharton.rxbinding2.p141c;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding2.C7833a;
import io.reactivex.Observer;
import io.reactivex.p453a.C17353a;

/* renamed from: com.jakewharton.rxbinding2.c.h */
final class C8105h extends C7833a<CharSequence> {
    /* renamed from: a */
    private final TextView f29069a;

    /* renamed from: com.jakewharton.rxbinding2.c.h$a */
    static final class C7842a extends C17353a implements TextWatcher {
        /* renamed from: a */
        private final TextView f28322a;
        /* renamed from: b */
        private final Observer<? super CharSequence> f28323b;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C7842a(TextView textView, Observer<? super CharSequence> observer) {
            this.f28322a = textView;
            this.f28323b = observer;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (isDisposed() == 0) {
                this.f28323b.onNext(charSequence);
            }
        }

        /* renamed from: a */
        protected void m33606a() {
            this.f28322a.removeTextChangedListener(this);
        }
    }

    /* renamed from: a */
    protected /* synthetic */ Object mo7603a() {
        return m34467b();
    }

    C8105h(TextView textView) {
        this.f29069a = textView;
    }

    /* renamed from: a */
    protected void mo7604a(Observer<? super CharSequence> observer) {
        Object c7842a = new C7842a(this.f29069a, observer);
        observer.onSubscribe(c7842a);
        this.f29069a.addTextChangedListener(c7842a);
    }

    /* renamed from: b */
    protected CharSequence m34467b() {
        return this.f29069a.getText();
    }
}
