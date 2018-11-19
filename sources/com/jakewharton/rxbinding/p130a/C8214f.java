package com.jakewharton.rxbinding.p130a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.p494a.C19562a;

/* renamed from: com.jakewharton.rxbinding.a.f */
final class C8214f implements OnSubscribe<CharSequence> {
    /* renamed from: a */
    final TextView f29357a;

    public /* synthetic */ void call(Object obj) {
        m35019a((C19571c) obj);
    }

    C8214f(TextView textView) {
        this.f29357a = textView;
    }

    /* renamed from: a */
    public void m35019a(final C19571c<? super CharSequence> c19571c) {
        C19562a.b();
        final TextWatcher c57001 = new TextWatcher(this) {
            /* renamed from: b */
            final /* synthetic */ C8214f f21111b;

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (c19571c.isUnsubscribed() == 0) {
                    c19571c.onNext(charSequence);
                }
            }
        };
        c19571c.add(new C19562a(this) {
            /* renamed from: b */
            final /* synthetic */ C8214f f28274b;

            /* renamed from: a */
            protected void m33582a() {
                this.f28274b.f29357a.removeTextChangedListener(c57001);
            }
        });
        this.f29357a.addTextChangedListener(c57001);
        c19571c.onNext(this.f29357a.getText());
    }
}
