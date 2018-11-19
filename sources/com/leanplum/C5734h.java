package com.leanplum;

import android.annotation.TargetApi;
import java.util.Map;

@TargetApi(26)
/* renamed from: com.leanplum.h */
final class C5734h {
    /* renamed from: a */
    String f21340a;
    /* renamed from: b */
    String f21341b;

    C5734h(Map<String, Object> map) {
        this.f21340a = (String) map.get("id");
        this.f21341b = (String) map.get("name");
    }
}
