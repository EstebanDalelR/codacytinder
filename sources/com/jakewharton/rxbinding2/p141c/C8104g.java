package com.jakewharton.rxbinding2.p141c;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding2.C7833a;
import io.reactivex.Observer;
import io.reactivex.p453a.C17353a;

/* renamed from: com.jakewharton.rxbinding2.c.g */
final class C8104g extends C7833a<C5719f> {
    /* renamed from: a */
    private final TextView f29068a;

    /* renamed from: com.jakewharton.rxbinding2.c.g$a */
    static final class C7841a extends C17353a implements TextWatcher {
        /* renamed from: a */
        private final TextView f28320a;
        /* renamed from: b */
        private final Observer<? super C5719f> f28321b;

        public void afterTextChanged(Editable editable) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C7841a(TextView textView, Observer<? super C5719f> observer) {
            this.f28320a = textView;
            this.f28321b = observer;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.f28321b.onNext(C5719f.m25005a(this.f28320a, charSequence, i, i2, i3));
            }
        }

        /* renamed from: a */
        protected void m33605a() {
            this.f28320a.removeTextChangedListener(this);
        }
    }

    /* renamed from: a */
    protected /* synthetic */ Object mo7603a() {
        return m34464b();
    }

    C8104g(TextView textView) {
        this.f29068a = textView;
    }

    /* renamed from: a */
    protected void mo7604a(Observer<? super C5719f> observer) {
        Object c7841a = new C7841a(this.f29068a, observer);
        observer.onSubscribe(c7841a);
        this.f29068a.addTextChangedListener(c7841a);
    }

    /* renamed from: b */
    protected C5719f m34464b() {
        return C5719f.m25005a(this.f29068a, this.f29068a.getText(), 0, 0, 0);
    }
}
