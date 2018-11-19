package com.mapbox.android.core.location;

import android.content.Context;
import android.support.annotation.NonNull;
import com.mapbox.android.core.location.LocationEngine.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.mapbox.android.core.location.f */
public class C5761f {
    /* renamed from: b */
    private static final List<Type> f21509b = new LocationEngineProvider$1();
    /* renamed from: a */
    private Map<Type, LocationEngine> f21510a;

    public C5761f(Context context) {
        m25334a(context);
    }

    @NonNull
    /* renamed from: a */
    public LocationEngine m25337a() {
        return m25336c();
    }

    /* renamed from: a */
    private void m25334a(Context context) {
        this.f21510a = new HashMap();
        for (Entry entry : m25335b().entrySet()) {
            C5762g c5762g = (C5762g) entry.getValue();
            if (c5762g.mo6228a()) {
                this.f21510a.put(entry.getKey(), c5762g.mo6227a(context));
            }
        }
    }

    /* renamed from: b */
    private Map<Type, C5762g> m25335b() {
        C5760c c5760c = new C5760c();
        Map<Type, C5762g> hashMap = new HashMap();
        hashMap.put(Type.GOOGLE_PLAY_SERVICES, new C7074e(c5760c));
        hashMap.put(Type.ANDROID, new C7072b());
        return hashMap;
    }

    /* renamed from: c */
    private LocationEngine m25336c() {
        LocationEngine locationEngine = (LocationEngine) this.f21510a.get(Type.ANDROID);
        for (Type type : f21509b) {
            LocationEngine locationEngine2 = (LocationEngine) this.f21510a.get(type);
            if (locationEngine2 != null) {
                return locationEngine2;
            }
        }
        return locationEngine;
    }
}
