package com.leanplum.p069a;

import com.leanplum.callbacks.StartCallback;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.leanplum.a.ar */
public final class ar {
    /* renamed from: a */
    public static void m25060a(String str, StartCallback startCallback) {
        Map hashMap = new HashMap();
        hashMap.put("email", str);
        str = aw.b("registerDevice", hashMap);
        str.a(new C7037n(startCallback));
        str.a(new C7038o(startCallback));
        str.j();
    }
}
