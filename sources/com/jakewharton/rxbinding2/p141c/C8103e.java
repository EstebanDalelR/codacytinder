package com.jakewharton.rxbinding2.p141c;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding2.C7833a;
import io.reactivex.Observer;
import io.reactivex.p453a.C17353a;

/* renamed from: com.jakewharton.rxbinding2.c.e */
final class C8103e extends C7833a<C5718d> {
    /* renamed from: a */
    private final TextView f29067a;

    /* renamed from: com.jakewharton.rxbinding2.c.e$a */
    static final class C7840a extends C17353a implements TextWatcher {
        /* renamed from: a */
        private final TextView f28318a;
        /* renamed from: b */
        private final Observer<? super C5718d> f28319b;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C7840a(TextView textView, Observer<? super C5718d> observer) {
            this.f28318a = textView;
            this.f28319b = observer;
        }

        public void afterTextChanged(Editable editable) {
            this.f28319b.onNext(C5718d.m25002a(this.f28318a, editable));
        }

        /* renamed from: a */
        protected void m33604a() {
            this.f28318a.removeTextChangedListener(this);
        }
    }

    /* renamed from: a */
    protected /* synthetic */ Object mo7603a() {
        return m34461b();
    }

    C8103e(TextView textView) {
        this.f29067a = textView;
    }

    /* renamed from: a */
    protected void mo7604a(Observer<? super C5718d> observer) {
        Object c7840a = new C7840a(this.f29067a, observer);
        observer.onSubscribe(c7840a);
        this.f29067a.addTextChangedListener(c7840a);
    }

    /* renamed from: b */
    protected C5718d m34461b() {
        return C5718d.m25002a(this.f29067a, this.f29067a.getEditableText());
    }
}
