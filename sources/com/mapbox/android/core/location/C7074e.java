package com.mapbox.android.core.location;

import android.content.Context;

/* renamed from: com.mapbox.android.core.location.e */
class C7074e implements C5762g {
    /* renamed from: a */
    private final C5760c f25685a;

    C7074e(C5760c c5760c) {
        this.f25685a = c5760c;
    }

    /* renamed from: a */
    public LocationEngine mo6227a(Context context) {
        return C7073d.m30633a(context);
    }

    /* renamed from: a */
    public boolean mo6228a() {
        return this.f25685a.m25333a("com.google.android.gms.location.LocationServices");
    }
}
