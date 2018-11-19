package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.C0768a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.animatable.n */
public abstract class C2984n<V, O> implements AnimatableValue<V, O> {
    /* renamed from: a */
    final List<C0768a<V>> f9238a;
    /* renamed from: b */
    final V f9239b;

    /* renamed from: a */
    O mo3178a(V v) {
        return v;
    }

    C2984n(V v) {
        this(Collections.emptyList(), v);
    }

    C2984n(List<C0768a<V>> list, V v) {
        this.f9238a = list;
        this.f9239b = v;
    }

    public boolean hasAnimation() {
        return this.f9238a.isEmpty() ^ 1;
    }

    /* renamed from: b */
    public O mo3177b() {
        return mo3178a(this.f9239b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("parseInitialValue=");
        stringBuilder.append(this.f9239b);
        if (!this.f9238a.isEmpty()) {
            stringBuilder.append(", values=");
            stringBuilder.append(Arrays.toString(this.f9238a.toArray()));
        }
        return stringBuilder.toString();
    }
}
