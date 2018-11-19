package com.tinder.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.leanplum.Leanplum;
import com.tinder.analytics.p153b.C6211a;
import com.tinder.analytics.p153b.C6212b;
import com.tinder.analytics.p155d.C6217a;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.p077b.C2641a;
import com.tinder.common.utils.C8578a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.tinder.analytics.i */
public class C7334i implements CrmEventTracker {
    /* renamed from: a */
    private final Map<String, Set<String>> f26491a;

    public C7334i(@NonNull C6212b c6212b) {
        this.f26491a = c6212b.m26841a();
    }

    public void trackEvent(@NonNull C6211a c6211a) {
        m31298b(c6211a.m26838a(), c6211a.m26839b());
    }

    @VisibleForTesting
    /* renamed from: a */
    void m31302a(String str, Map<String, Object> map) {
        if (C2641a.a(map)) {
            m31301a(str);
        } else {
            Leanplum.track(str, map);
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    void m31301a(String str) {
        Leanplum.track(str);
    }

    /* renamed from: b */
    private void m31298b(@NonNull String str, @NonNull Map<String, Object> map) {
        if (!C8578a.a(str)) {
            if (this.f26491a.containsKey(str)) {
                if (C2641a.a((Collection) this.f26491a.get(str))) {
                    m31301a(str);
                } else {
                    m31302a(str, m31299c(str, map));
                }
            }
        }
    }

    @NonNull
    /* renamed from: c */
    private Map<String, Object> m31299c(@NonNull String str, @NonNull Map<String, Object> map) {
        str = m31300d(str, map);
        boolean containsKey = str.containsKey(ManagerWebServices.PARAM_LAT);
        boolean containsKey2 = str.containsKey(ManagerWebServices.PARAM_LON);
        if (containsKey || containsKey2) {
            str.putAll(C6217a.m26845a(map));
        }
        return str;
    }

    @NonNull
    /* renamed from: d */
    private Map<String, Object> m31300d(@NonNull String str, @NonNull Map<String, Object> map) {
        Set set = (Set) this.f26491a.get(str);
        Map<String, Object> hashMap = new HashMap();
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            String str2 = (String) entry.getKey();
            if (set != null && set.contains(str2)) {
                hashMap.put(str2, entry.getValue());
            }
        }
        return hashMap;
    }
}
