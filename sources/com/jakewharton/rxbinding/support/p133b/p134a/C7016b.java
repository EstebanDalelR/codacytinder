package com.jakewharton.rxbinding.support.p133b.p134a;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.jakewharton.rxbinding.view.C5710e;

/* renamed from: com.jakewharton.rxbinding.support.b.a.b */
public final class C7016b extends C5710e<RecyclerView> {
    /* renamed from: a */
    private final int f25464a;
    /* renamed from: b */
    private final int f25465b;

    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C7016b m30515a(@NonNull RecyclerView recyclerView, int i, int i2) {
        return new C7016b(recyclerView, i, i2);
    }

    private C7016b(@NonNull RecyclerView recyclerView, int i, int i2) {
        super(recyclerView);
        this.f25464a = i;
        this.f25465b = i2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7016b)) {
            return false;
        }
        C7016b c7016b = (C7016b) obj;
        if (c7016b.m24986c() != m24986c() || this.f25464a != c7016b.f25464a || this.f25465b != c7016b.f25465b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((629 + ((RecyclerView) m24986c()).hashCode()) * 37) + this.f25464a) * 37) + this.f25465b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerViewScrollEvent{view=");
        stringBuilder.append(m24986c());
        stringBuilder.append(", dx=");
        stringBuilder.append(this.f25464a);
        stringBuilder.append(", dy=");
        stringBuilder.append(this.f25465b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
