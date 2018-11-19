package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;

@Deprecated
public final class MapsEngineLayerOptions implements C5468c {
    public static final MapsEngineLayerOptionsCreator CREATOR = new MapsEngineLayerOptionsCreator();
    /* renamed from: a */
    private final int f25157a;
    /* renamed from: b */
    private MapsEngineLayerInfo f25158b;
    /* renamed from: c */
    private boolean f25159c;
    /* renamed from: d */
    private float f25160d;
    /* renamed from: e */
    private boolean f25161e;

    public final int describeContents() {
        return 0;
    }

    public MapsEngineLayerOptions() {
        this.f25158b = new MapsEngineLayerInfo();
        this.f25159c = true;
        this.f25161e = true;
        this.f25157a = 1;
    }

    MapsEngineLayerOptions(int i, MapsEngineLayerInfo mapsEngineLayerInfo, boolean z, float f, boolean z2) {
        this.f25158b = new MapsEngineLayerInfo();
        this.f25159c = true;
        this.f25161e = true;
        this.f25157a = i;
        this.f25158b = mapsEngineLayerInfo;
        this.f25159c = z;
        this.f25160d = f;
        this.f25161e = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        MapsEngineLayerOptionsCreator.m23872a(this, parcel, i);
    }

    /* renamed from: a */
    final int m30001a() {
        return this.f25157a;
    }

    public final MapsEngineLayerOptions layerId(String str) {
        this.f25158b.m29998a(str);
        return this;
    }

    public final MapsEngineLayerOptions layerInMap(String str, String str2) {
        this.f25158b.m29999a(str, str2);
        return this;
    }

    public final MapsEngineLayerOptions version(String str) {
        this.f25158b.m30000b(str);
        return this;
    }

    public final MapsEngineLayerOptions zIndex(float f) {
        this.f25160d = f;
        return this;
    }

    public final MapsEngineLayerOptions visible(boolean z) {
        this.f25159c = z;
        return this;
    }

    public final MapsEngineLayerOptions defaultUi(boolean z) {
        this.f25161e = z;
        return this;
    }

    public final MapsEngineLayerInfo getLayerInfo() {
        return this.f25158b;
    }

    public final float getZIndex() {
        return this.f25160d;
    }

    public final boolean isVisible() {
        return this.f25159c;
    }

    public final boolean isDefaultUiEnabled() {
        return this.f25161e;
    }
}
