package com.jakewharton.rxbinding2.p141c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.widget.TextView;

/* renamed from: com.jakewharton.rxbinding2.c.a */
final class C7025a extends C5718d {
    /* renamed from: a */
    private final TextView f25483a;
    /* renamed from: b */
    private final Editable f25484b;

    C7025a(TextView textView, @Nullable Editable editable) {
        if (textView == null) {
            throw new NullPointerException("Null view");
        }
        this.f25483a = textView;
        this.f25484b = editable;
    }

    @NonNull
    /* renamed from: a */
    public TextView mo6187a() {
        return this.f25483a;
    }

    @Nullable
    /* renamed from: b */
    public Editable mo6188b() {
        return this.f25484b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TextViewAfterTextChangeEvent{view=");
        stringBuilder.append(this.f25483a);
        stringBuilder.append(", editable=");
        stringBuilder.append(this.f25484b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5718d)) {
            return false;
        }
        C5718d c5718d = (C5718d) obj;
        if (this.f25483a.equals(c5718d.mo6187a())) {
            if (this.f25484b == null) {
                if (c5718d.mo6188b() == null) {
                    return z;
                }
            } else if (this.f25484b.equals(c5718d.mo6188b()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((this.f25483a.hashCode() ^ 1000003) * 1000003) ^ (this.f25484b == null ? 0 : this.f25484b.hashCode());
    }
}
