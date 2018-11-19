package com.jakewharton.rxbinding.p130a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.p494a.C19562a;

/* renamed from: com.jakewharton.rxbinding.a.e */
final class C8213e implements OnSubscribe<C7014d> {
    /* renamed from: a */
    final TextView f29356a;

    public /* synthetic */ void call(Object obj) {
        m35018a((C19571c) obj);
    }

    C8213e(TextView textView) {
        this.f29356a = textView;
    }

    /* renamed from: a */
    public void m35018a(final C19571c<? super C7014d> c19571c) {
        C19562a.b();
        final TextWatcher c56991 = new TextWatcher(this) {
            /* renamed from: b */
            final /* synthetic */ C8213e f21109b;

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (!c19571c.isUnsubscribed()) {
                    c19571c.onNext(C7014d.m30513a(this.f21109b.f29356a, editable));
                }
            }
        };
        c19571c.add(new C19562a(this) {
            /* renamed from: b */
            final /* synthetic */ C8213e f28272b;

            /* renamed from: a */
            protected void m33581a() {
                this.f28272b.f29356a.removeTextChangedListener(c56991);
            }
        });
        this.f29356a.addTextChangedListener(c56991);
        c19571c.onNext(C7014d.m30513a(this.f29356a, this.f29356a.getEditableText()));
    }
}
