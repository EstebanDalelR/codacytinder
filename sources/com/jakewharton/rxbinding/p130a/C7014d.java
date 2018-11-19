package com.jakewharton.rxbinding.p130a;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.widget.TextView;
import com.jakewharton.rxbinding.view.C5710e;

/* renamed from: com.jakewharton.rxbinding.a.d */
public final class C7014d extends C5710e<TextView> {
    /* renamed from: a */
    private final Editable f25461a;

    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C7014d m30513a(@NonNull TextView textView, @Nullable Editable editable) {
        return new C7014d(textView, editable);
    }

    private C7014d(@NonNull TextView textView, @Nullable Editable editable) {
        super(textView);
        this.f25461a = editable;
    }

    @Nullable
    /* renamed from: a */
    public Editable m30514a() {
        return this.f25461a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7014d)) {
            return false;
        }
        C7014d c7014d = (C7014d) obj;
        if (c7014d.m24986c() != m24986c() || this.f25461a.equals(c7014d.f25461a) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((629 + ((TextView) m24986c()).hashCode()) * 37) + this.f25461a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TextViewAfterTextChangeEvent{editable=");
        stringBuilder.append(this.f25461a);
        stringBuilder.append(", view=");
        stringBuilder.append(m24986c());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
