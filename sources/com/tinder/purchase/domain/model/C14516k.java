package com.tinder.purchase.domain.model;

import io.reactivex.annotations.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.tinder.purchase.domain.model.k */
public class C14516k {
    /* renamed from: a */
    private final Map<String, C14514j> f45897a = new HashMap();

    /* renamed from: com.tinder.purchase.domain.model.k$a */
    public static class C14515a {
        /* renamed from: a */
        private final C14516k f45896a = new C14516k();

        /* renamed from: a */
        public C14515a m55434a(@NonNull String str, @Nullable C14514j c14514j) {
            this.f45896a.f45897a.put(str, c14514j);
            return this;
        }

        /* renamed from: a */
        public C14516k m55435a() {
            return this.f45896a;
        }
    }

    @NonNull
    /* renamed from: a */
    public List<String> m55438a() {
        return new ArrayList(this.f45897a.keySet());
    }

    @Nullable
    /* renamed from: a */
    public C14514j m55437a(String str) {
        return (C14514j) this.f45897a.get(str);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PriceListing{mPriceMap=");
        stringBuilder.append(this.f45897a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
