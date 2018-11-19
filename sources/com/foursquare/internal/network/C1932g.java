package com.foursquare.internal.network;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.text.TextUtils;
import com.foursquare.api.types.FoursquareType;
import com.foursquare.api.types.ResponseV2;
import com.foursquare.api.types.ResponseV2.Meta;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: com.foursquare.internal.network.g */
public class C1932g<T extends FoursquareType> {
    /* renamed from: a */
    private int f5201a;
    /* renamed from: b */
    private int f5202b;
    /* renamed from: c */
    private ResponseV2<T> f5203c;
    /* renamed from: d */
    private String f5204d;
    /* renamed from: e */
    private FoursquareError f5205e;
    /* renamed from: f */
    private String f5206f;

    public C1932g(int i) {
        this.f5201a = i;
    }

    /* renamed from: a */
    public int m6767a() {
        return this.f5201a;
    }

    /* renamed from: b */
    public ResponseV2<T> m6772b() {
        return this.f5203c;
    }

    /* renamed from: a */
    public void m6769a(ResponseV2<T> responseV2) {
        this.f5203c = responseV2;
    }

    /* renamed from: c */
    public T m6774c() {
        return this.f5203c != null ? this.f5203c.getResult() : null;
    }

    /* renamed from: a */
    public void m6771a(String str) {
        this.f5204d = str;
    }

    /* renamed from: d */
    public FoursquareError m6775d() {
        return this.f5205e;
    }

    /* renamed from: a */
    public void m6770a(FoursquareError foursquareError) {
        this.f5205e = foursquareError;
    }

    /* renamed from: b */
    public void m6773b(String str) {
        this.f5206f = str;
    }

    /* renamed from: a */
    public void m6768a(int i) {
        this.f5202b = i;
    }

    /* renamed from: e */
    public String m6776e() {
        if (!TextUtils.isEmpty(this.f5206f)) {
            return this.f5206f;
        }
        String str = null;
        if (m6775d() == null) {
            return null;
        }
        if (!(this.f5203c == null || this.f5203c.getMeta() == null)) {
            Meta meta = this.f5203c.getMeta();
            str = meta.getErrorMessage();
            if (TextUtils.isEmpty(str)) {
                str = meta.getErrorDetail();
            }
        }
        return str;
    }

    /* renamed from: f */
    public boolean m6777f() {
        ResponseV2 b = m6772b();
        boolean z = false;
        if (b == null) {
            return false;
        }
        Meta meta = b.getMeta();
        if (meta == null) {
            return false;
        }
        int code = meta.getCode();
        if (code >= Callback.DEFAULT_DRAG_ANIMATION_DURATION && code < MapboxConstants.ANIMATION_DURATION) {
            z = true;
        }
        return z;
    }
}
