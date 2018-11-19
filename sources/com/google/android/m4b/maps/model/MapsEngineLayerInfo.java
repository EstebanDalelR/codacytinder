package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;

@Deprecated
public final class MapsEngineLayerInfo implements C5468c {
    public static final MapsEngineLayerInfoCreator CREATOR = new MapsEngineLayerInfoCreator();
    /* renamed from: a */
    private final int f25151a;
    /* renamed from: b */
    private String f25152b;
    /* renamed from: c */
    private String f25153c;
    /* renamed from: d */
    private String f25154d;
    /* renamed from: e */
    private boolean f25155e;
    /* renamed from: f */
    private String f25156f;

    public final int describeContents() {
        return 0;
    }

    public MapsEngineLayerInfo() {
        this.f25156f = "published";
        this.f25151a = 1;
    }

    MapsEngineLayerInfo(int i, String str, String str2, String str3, boolean z, String str4) {
        this.f25156f = "published";
        this.f25151a = i;
        this.f25152b = str;
        this.f25153c = str2;
        this.f25156f = str4;
        this.f25154d = str3;
        this.f25155e = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        MapsEngineLayerInfoCreator.m23869a(this, parcel);
    }

    /* renamed from: a */
    final int m29997a() {
        return this.f25151a;
    }

    /* renamed from: a */
    final void m29998a(String str) {
        this.f25154d = str;
        this.f25155e = null;
    }

    /* renamed from: a */
    final void m29999a(String str, String str2) {
        this.f25152b = str;
        this.f25153c = str2;
    }

    /* renamed from: b */
    final void m30000b(String str) {
        this.f25156f = str;
    }

    public final String getMapId() {
        return this.f25152b;
    }

    public final String getLayerKey() {
        return this.f25153c;
    }

    public final String getVersion() {
        return this.f25156f;
    }

    public final String getLayerId() {
        return this.f25154d;
    }

    public final boolean isLite() {
        return this.f25155e;
    }
}
