package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.y */
public final class C2509y {
    /* renamed from: a */
    private final List<String> f7665a;
    /* renamed from: b */
    private final Object f7666b;

    private C2509y(Object obj) {
        this.f7666b = ad.m9045a(obj);
        this.f7665a = new ArrayList();
    }

    /* renamed from: a */
    public final C2509y m9174a(String str, Object obj) {
        List list = this.f7665a;
        str = (String) ad.m9045a((Object) str);
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length());
        stringBuilder.append(str);
        stringBuilder.append("=");
        stringBuilder.append(valueOf);
        list.add(stringBuilder.toString());
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(this.f7666b.getClass().getSimpleName());
        stringBuilder.append('{');
        int size = this.f7665a.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append((String) this.f7665a.get(i));
            if (i < size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
