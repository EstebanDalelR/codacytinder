package com.tinder.application;

import com.tinder.fastmatch.C9370a;
import com.tinder.fastmatch.FastMatchRecsActivityComponent;
import com.tinder.fastmatch.FastMatchRecsActivityComponent.Builder;
import com.tinder.fastmatch.view.FastMatchRecsActivity.Source;
import dagger.internal.C15521i;

final class a$i implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33524a;
    /* renamed from: b */
    private C9370a f33525b;
    /* renamed from: c */
    private Source f33526c;

    private a$i(C4423a c4423a) {
        this.f33524a = c4423a;
    }

    public /* synthetic */ Builder source(Source source) {
        return m41820a(source);
    }

    public FastMatchRecsActivityComponent build() {
        if (this.f33525b == null) {
            this.f33525b = new C9370a();
        }
        if (this.f33526c != null) {
            return new a$j(this.f33524a, this, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Source.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$i m41820a(Source source) {
        this.f33526c = (Source) C15521i.a(source);
        return this;
    }
}
