package com.airbnb.lottie.model.animatable;

import android.support.annotation.Nullable;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.C0768a.C0767a;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.m */
public class C0820m<T> {
    @Nullable
    /* renamed from: a */
    private final JSONObject f2188a;
    /* renamed from: b */
    private final float f2189b;
    /* renamed from: c */
    private final C0788c f2190c;
    /* renamed from: d */
    private final Factory<T> f2191d;

    /* renamed from: com.airbnb.lottie.model.animatable.m$a */
    static class C0819a<T> {
        /* renamed from: a */
        final List<C0768a<T>> f2186a;
        @Nullable
        /* renamed from: b */
        final T f2187b;

        C0819a(List<C0768a<T>> list, @Nullable T t) {
            this.f2186a = list;
            this.f2187b = t;
        }
    }

    private C0820m(@Nullable JSONObject jSONObject, float f, C0788c c0788c, Factory<T> factory) {
        this.f2188a = jSONObject;
        this.f2189b = f;
        this.f2190c = c0788c;
        this.f2191d = factory;
    }

    /* renamed from: a */
    static <T> C0820m<T> m2884a(@Nullable JSONObject jSONObject, float f, C0788c c0788c, Factory<T> factory) {
        return new C0820m(jSONObject, f, c0788c, factory);
    }

    /* renamed from: a */
    C0819a<T> m2888a() {
        List b = m2887b();
        return new C0819a(b, m2885a(b));
    }

    /* renamed from: b */
    private List<C0768a<T>> m2887b() {
        if (this.f2188a == null) {
            return Collections.emptyList();
        }
        Object opt = this.f2188a.opt("k");
        if (C0820m.m2886a(opt)) {
            return C0767a.m2705a((JSONArray) opt, this.f2190c, this.f2189b, this.f2191d);
        }
        return Collections.emptyList();
    }

    @Nullable
    /* renamed from: a */
    private T m2885a(List<C0768a<T>> list) {
        if (this.f2188a == null) {
            return null;
        }
        if (list.isEmpty()) {
            return this.f2191d.valueFromObject(this.f2188a.opt("k"), this.f2189b);
        }
        return ((C0768a) list.get(0)).f2089a;
    }

    /* renamed from: a */
    private static boolean m2886a(Object obj) {
        boolean z = false;
        if (!(obj instanceof JSONArray)) {
            return false;
        }
        obj = ((JSONArray) obj).opt(0);
        if ((obj instanceof JSONObject) && ((JSONObject) obj).has("t") != null) {
            z = true;
        }
        return z;
    }
}
