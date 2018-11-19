package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.ag.C4984a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cc.C5073c;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bx.r */
public abstract class C6561r implements C5073c {

    /* renamed from: com.google.android.m4b.maps.bx.r$a */
    public enum C5016a {
        UNUSED,
        BASE_IMAGERY,
        VECTORS,
        NIGHT_DIMMER,
        DESATURATE,
        TRAFFIC,
        INDOOR,
        LAYER_SHAPES,
        TRANSIT,
        BUILDINGS,
        POLYLINE,
        LABELS,
        FADE_OUT_OVERLAY,
        ROUTE_OVERVIEW_POLYLINE,
        TURN_ARROW_OVERLAY,
        IMPORTANT_LABELS,
        DEBUG_LABELS,
        INTERSECTION,
        SKY,
        MY_LOCATION_OVERLAY_DA,
        LAYERS_RAW_GPS,
        LAYER_MARKERS_SHADOW,
        LAYER_MARKERS,
        MY_LOCATION_OVERLAY_VECTORMAPS,
        COMPASS_OVERLAY,
        LOADING_SPINNY,
        BUBBLE,
        HEADS_UP_DISPLAY
    }

    /* renamed from: a */
    public void mo7038a(int i) {
    }

    /* renamed from: a */
    public void mo7039a(long j) {
    }

    /* renamed from: a */
    public void mo7040a(C5052d c5052d) {
    }

    /* renamed from: a */
    public void mo7041a(C5052d c5052d, aj ajVar) {
    }

    /* renamed from: a */
    public abstract void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j);

    /* renamed from: a */
    public void mo7042a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo7043a(float f, float f2, af afVar, C6570b c6570b) {
        return false;
    }

    /* renamed from: a */
    public boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        return true;
    }

    public void a_() {
    }

    public boolean a_(float f, float f2, C6570b c6570b) {
        return false;
    }

    /* renamed from: b */
    public void mo5223b(C5052d c5052d) {
    }

    /* renamed from: b */
    public boolean mo7104b(float f, float f2, af afVar, C6570b c6570b) {
        return false;
    }

    /* renamed from: b */
    public boolean mo7105b(float f, float f2, C6570b c6570b) {
        return false;
    }

    public boolean b_() {
        return false;
    }

    /* renamed from: c */
    public boolean mo7144c(float f, float f2, af afVar, C6570b c6570b) {
        return false;
    }

    /* renamed from: c */
    public boolean mo7145c(float f, float f2, C6570b c6570b) {
        return false;
    }

    public void c_() {
    }

    /* renamed from: d */
    public abstract C5016a mo7046d();

    public boolean e_() {
        return true;
    }

    public boolean f_() {
        return false;
    }

    /* renamed from: g */
    public C5002b mo7561g() {
        return null;
    }

    protected boolean i_() {
        return false;
    }

    /* renamed from: k */
    protected C4984a mo7100k() {
        return C4984a.DEFAULT;
    }

    /* renamed from: a */
    protected final ag m29097a(C4984a c4984a) {
        return new ag(this, c4984a, new ah[0]);
    }

    /* renamed from: a */
    protected final ag m29099a(C4984a c4984a, ah... ahVarArr) {
        return new ag(this, c4984a, ahVarArr);
    }

    /* renamed from: a */
    protected final ag m29098a(C4984a c4984a, Collection<ah> collection, Collection<ah> collection2) {
        return new ag(this, c4984a, collection, collection2);
    }

    /* renamed from: a */
    public boolean mo7558a(List<ag> list) {
        if (!list.isEmpty()) {
            return null;
        }
        list.add(m29097a(mo7100k()));
        return true;
    }

    /* renamed from: c */
    public void mo5224c(C5052d c5052d) {
        mo5223b(c5052d);
    }
}
