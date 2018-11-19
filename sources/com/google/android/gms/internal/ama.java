package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@zzzv
public final class ama {
    /* renamed from: a */
    private final Map<String, alz> f15498a = new HashMap();
    @Nullable
    /* renamed from: b */
    private final amb f15499b;

    public ama(@Nullable amb amb) {
        this.f15499b = amb;
    }

    @Nullable
    /* renamed from: a */
    public final amb m19358a() {
        return this.f15499b;
    }

    /* renamed from: a */
    public final void m19359a(String str, alz alz) {
        this.f15498a.put(str, alz);
    }

    /* renamed from: a */
    public final void m19360a(String str, String str2, long j) {
        amb amb = this.f15499b;
        alz alz = (alz) this.f15498a.get(str2);
        String[] strArr = new String[]{str};
        if (amb != null) {
            if (alz != null) {
                amb.m19366a(alz, j, strArr);
            }
        }
        Map map = this.f15498a;
        amb = this.f15499b;
        map.put(str, amb == null ? null : amb.m19362a(j));
    }
}
