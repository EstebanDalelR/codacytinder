package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.cg.C5174f.C6616e;
import com.google.android.m4b.maps.model.BitmapDescriptor;
import com.google.android.m4b.maps.model.GroundOverlayOptions;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.p114n.C7701d;
import java.util.List;

public final class av {
    /* renamed from: a */
    private final FrameLayout f19065a;
    /* renamed from: b */
    private final Resources f19066b;
    /* renamed from: c */
    private final Context f19067c;
    /* renamed from: d */
    private final be f19068d;
    /* renamed from: e */
    private final bd f19069e;
    /* renamed from: f */
    private final C5176g f19070f;
    /* renamed from: g */
    private final cb f19071g;
    /* renamed from: h */
    private final aa f19072h;
    /* renamed from: i */
    private au f19073i;
    /* renamed from: j */
    private C7520v f19074j;
    /* renamed from: k */
    private List<as> f19075k;
    /* renamed from: l */
    private as f19076l;

    public av(Context context, Resources resources, be beVar, bd bdVar, C5176g c5176g, cb cbVar, aa aaVar) {
        this.f19065a = new FrameLayout(context);
        this.f19065a.setLayoutParams(new LayoutParams(-1, -1));
        this.f19065a.setTag("GoogleMapMapsEngineInfocardManagerView");
        this.f19067c = context;
        this.f19066b = resources;
        this.f19068d = beVar;
        this.f19069e = bdVar;
        this.f19070f = c5176g;
        this.f19071g = cbVar;
        this.f19072h = aaVar;
    }

    /* renamed from: a */
    public final void m22899a(LatLngBounds latLngBounds, List<as> list) {
        if (this.f19075k != null) {
            m22901b();
        }
        this.f19075k = list;
        if (this.f19075k.size() > 1) {
            list = C4513R.drawable.maps_circle_active_grouped;
        } else {
            list = C4513R.drawable.maps_circle_active;
        }
        this.f19074j = new C7520v(new GroundOverlayOptions().image(new BitmapDescriptor(C7701d.m33407a(new C6616e(this.f19066b, list, (byte) 0)))).positionFromBounds(latLngBounds).zIndex(Float.MAX_VALUE), this.f19069e, this.f19070f, this.f19071g, this.f19072h, this.f19066b);
        this.f19074j.m33169a(this.f19068d.mo5363a(this.f19074j));
    }

    /* renamed from: a */
    public final void m22900a(List<as> list) {
        if (this.f19075k == list) {
            if (list.size() == 1) {
                m22898a((int) null);
            } else {
                m22897a();
            }
        }
    }

    /* renamed from: a */
    final void m22897a() {
        m22896e();
        this.f19073i = new aw(this.f19067c, this.f19066b, this, this.f19075k);
        this.f19073i.setTag("GoogleMapMapsEngineInfolist");
        this.f19065a.addView(this.f19073i);
    }

    /* renamed from: a */
    final void m22898a(int i) {
        m22896e();
        this.f19076l = (as) this.f19075k.get(i);
        Context context = this.f19067c;
        Resources resources = this.f19066b;
        boolean z = this.f19075k != null && this.f19075k.size() > 1;
        this.f19073i = new at(context, resources, this, z, this.f19076l);
        this.f19073i.setTag("GoogleMapMapsEngineInfocard");
        this.f19065a.addView(this.f19073i);
    }

    /* renamed from: e */
    private void m22896e() {
        if (this.f19073i != null) {
            this.f19065a.removeView(this.f19073i);
            this.f19065a.invalidate();
            this.f19076l = null;
            this.f19073i = null;
        }
    }

    /* renamed from: b */
    public final void m22901b() {
        m22896e();
        if (this.f19074j != null) {
            this.f19074j.remove();
            this.f19074j = null;
        }
        this.f19075k = null;
    }

    /* renamed from: c */
    public final as m22902c() {
        return this.f19076l;
    }

    /* renamed from: d */
    public final View m22903d() {
        return this.f19065a;
    }
}
