package com.jakewharton.rxbinding2.p141c;

import android.support.annotation.NonNull;
import android.widget.TextView;

/* renamed from: com.jakewharton.rxbinding2.c.b */
final class C7026b extends C5719f {
    /* renamed from: a */
    private final TextView f25485a;
    /* renamed from: b */
    private final CharSequence f25486b;
    /* renamed from: c */
    private final int f25487c;
    /* renamed from: d */
    private final int f25488d;
    /* renamed from: e */
    private final int f25489e;

    C7026b(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        if (textView == null) {
            throw new NullPointerException("Null view");
        }
        this.f25485a = textView;
        if (charSequence == null) {
            throw new NullPointerException("Null text");
        }
        this.f25486b = charSequence;
        this.f25487c = i;
        this.f25488d = i2;
        this.f25489e = i3;
    }

    @NonNull
    /* renamed from: a */
    public TextView mo6189a() {
        return this.f25485a;
    }

    @NonNull
    /* renamed from: b */
    public CharSequence mo6190b() {
        return this.f25486b;
    }

    /* renamed from: c */
    public int mo6191c() {
        return this.f25487c;
    }

    /* renamed from: d */
    public int mo6192d() {
        return this.f25488d;
    }

    /* renamed from: e */
    public int mo6193e() {
        return this.f25489e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TextViewBeforeTextChangeEvent{view=");
        stringBuilder.append(this.f25485a);
        stringBuilder.append(", text=");
        stringBuilder.append(this.f25486b);
        stringBuilder.append(", start=");
        stringBuilder.append(this.f25487c);
        stringBuilder.append(", count=");
        stringBuilder.append(this.f25488d);
        stringBuilder.append(", after=");
        stringBuilder.append(this.f25489e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5719f)) {
            return false;
        }
        C5719f c5719f = (C5719f) obj;
        if (!this.f25485a.equals(c5719f.mo6189a()) || !this.f25486b.equals(c5719f.mo6190b()) || this.f25487c != c5719f.mo6191c() || this.f25488d != c5719f.mo6192d() || this.f25489e != c5719f.mo6193e()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((this.f25485a.hashCode() ^ 1000003) * 1000003) ^ this.f25486b.hashCode()) * 1000003) ^ this.f25487c) * 1000003) ^ this.f25488d) * 1000003) ^ this.f25489e;
    }
}
