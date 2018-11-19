package com.google.android.m4b.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.p111k.C5468c;
import com.google.android.m4b.maps.p124x.C5534a;

public final class GoogleMapOptions implements C5468c {
    public static final GoogleMapOptionsCreator CREATOR = new GoogleMapOptionsCreator();
    /* renamed from: a */
    private final int f23572a;
    /* renamed from: b */
    private Boolean f23573b;
    /* renamed from: c */
    private Boolean f23574c;
    /* renamed from: d */
    private int f23575d;
    /* renamed from: e */
    private CameraPosition f23576e;
    /* renamed from: f */
    private Boolean f23577f;
    /* renamed from: g */
    private Boolean f23578g;
    /* renamed from: h */
    private Boolean f23579h;
    /* renamed from: i */
    private Boolean f23580i;
    /* renamed from: j */
    private Boolean f23581j;
    /* renamed from: k */
    private Boolean f23582k;
    /* renamed from: l */
    private Boolean f23583l;
    /* renamed from: m */
    private Boolean f23584m;
    /* renamed from: n */
    private Boolean f23585n;

    public final int describeContents() {
        return 0;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11) {
        this.f23575d = -1;
        this.f23572a = i;
        this.f23573b = C5534a.m24048a(b);
        this.f23574c = C5534a.m24048a(b2);
        this.f23575d = i2;
        this.f23576e = cameraPosition;
        this.f23577f = C5534a.m24048a(b3);
        this.f23578g = C5534a.m24048a(b4);
        this.f23579h = C5534a.m24048a(b5);
        this.f23580i = C5534a.m24048a(b6);
        this.f23581j = C5534a.m24048a(b7);
        this.f23582k = C5534a.m24048a(b8);
        this.f23583l = C5534a.m24048a(b9);
        this.f23584m = C5534a.m24048a(b10);
        this.f23585n = C5534a.m24048a(b11);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        GoogleMapOptionsCreator.m20399a(this, parcel, i);
    }

    /* renamed from: a */
    final int m27633a() {
        return this.f23572a;
    }

    /* renamed from: b */
    final byte m27634b() {
        return C5534a.m24047a(this.f23573b);
    }

    /* renamed from: c */
    final byte m27635c() {
        return C5534a.m24047a(this.f23574c);
    }

    /* renamed from: d */
    final byte m27636d() {
        return C5534a.m24047a(this.f23577f);
    }

    /* renamed from: e */
    final byte m27637e() {
        return C5534a.m24047a(this.f23578g);
    }

    /* renamed from: f */
    final byte m27638f() {
        return C5534a.m24047a(this.f23579h);
    }

    /* renamed from: g */
    final byte m27639g() {
        return C5534a.m24047a(this.f23580i);
    }

    /* renamed from: h */
    final byte m27640h() {
        return C5534a.m24047a(this.f23581j);
    }

    /* renamed from: i */
    final byte m27641i() {
        return C5534a.m24047a(this.f23582k);
    }

    /* renamed from: j */
    final byte m27642j() {
        return C5534a.m24047a(this.f23583l);
    }

    /* renamed from: k */
    final byte m27643k() {
        return C5534a.m24047a(this.f23584m);
    }

    /* renamed from: l */
    final byte m27644l() {
        return C5534a.m24047a(this.f23585n);
    }

    public GoogleMapOptions() {
        this.f23575d = -1;
        this.f23572a = 1;
    }

    public final GoogleMapOptions zOrderOnTop(boolean z) {
        this.f23573b = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.f23574c = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions mapType(int i) {
        this.f23575d = i;
        return this;
    }

    public final GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.f23576e = cameraPosition;
        return this;
    }

    public final GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.f23577f = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions compassEnabled(boolean z) {
        this.f23578g = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.f23579h = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.f23580i = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.f23581j = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.f23582k = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions liteMode(boolean z) {
        this.f23583l = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.f23584m = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions ambientEnabled(boolean z) {
        this.f23585n = Boolean.valueOf(z);
        return this;
    }

    public final Boolean getZOrderOnTop() {
        return this.f23573b;
    }

    public final Boolean getUseViewLifecycleInFragment() {
        return this.f23574c;
    }

    public final int getMapType() {
        return this.f23575d;
    }

    public final CameraPosition getCamera() {
        return this.f23576e;
    }

    public final Boolean getZoomControlsEnabled() {
        return this.f23577f;
    }

    public final Boolean getCompassEnabled() {
        return this.f23578g;
    }

    public final Boolean getScrollGesturesEnabled() {
        return this.f23579h;
    }

    public final Boolean getZoomGesturesEnabled() {
        return this.f23580i;
    }

    public final Boolean getTiltGesturesEnabled() {
        return this.f23581j;
    }

    public final Boolean getRotateGesturesEnabled() {
        return this.f23582k;
    }

    public final Boolean getLiteMode() {
        return this.f23583l;
    }

    public final Boolean getMapToolbarEnabled() {
        return this.f23584m;
    }

    public final Boolean getAmbientEnabled() {
        return this.f23585n;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C4513R.styleable.MapM4bAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_mapType)) {
            googleMapOptions.mapType(obtainAttributes.getInt(C4513R.styleable.MapM4bAttrs_m4b_mapType, -1));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_uiCompass)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_uiCompass, true));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_liteMode)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_liteMode, false));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(C4513R.styleable.MapM4bAttrs_m4b_ambientEnabled)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(C4513R.styleable.MapM4bAttrs_m4b_ambientEnabled, false));
        }
        googleMapOptions.camera(CameraPosition.createFromAttributes(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }
}
