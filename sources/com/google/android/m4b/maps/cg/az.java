package com.google.android.m4b.maps.cg;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate.Stub;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p125y.C5571j;
import com.tinder.domain.config.model.ProfileEditingConfig;

public final class az extends Stub {
    /* renamed from: a */
    private static final MarkerOptions f27901a = new MarkerOptions();
    /* renamed from: b */
    private final String f27902b;
    /* renamed from: c */
    private final ba f27903c;
    /* renamed from: d */
    private final C5176g f27904d;
    /* renamed from: e */
    private final cb f27905e;
    /* renamed from: f */
    private final aa f27906f;
    /* renamed from: g */
    private C5143a f27907g;
    /* renamed from: h */
    private LatLng f27908h;
    /* renamed from: i */
    private C5174f f27909i;
    /* renamed from: j */
    private float f27910j;
    /* renamed from: k */
    private float f27911k;
    /* renamed from: l */
    private boolean f27912l;
    /* renamed from: m */
    private float f27913m;
    /* renamed from: n */
    private boolean f27914n;
    /* renamed from: o */
    private boolean f27915o;
    /* renamed from: p */
    private boolean f27916p;
    /* renamed from: q */
    private String f27917q;
    /* renamed from: r */
    private String f27918r;
    /* renamed from: s */
    private float f27919s;
    /* renamed from: t */
    private float f27920t;
    /* renamed from: u */
    private boolean f27921u;
    /* renamed from: v */
    private float f27922v;
    /* renamed from: w */
    private Resources f27923w;

    /* renamed from: com.google.android.m4b.maps.cg.az$a */
    public interface C5143a {
        /* renamed from: a */
        void mo4940a();

        /* renamed from: a */
        void mo4941a(int i);

        /* renamed from: b */
        void mo4942b();

        /* renamed from: c */
        void mo4943c();

        /* renamed from: d */
        void mo4944d();

        /* renamed from: e */
        void mo4945e();

        /* renamed from: f */
        boolean mo4946f();

        /* renamed from: i */
        Rect mo4947i();
    }

    public az(String str, MarkerOptions markerOptions, ba baVar, C5176g c5176g, aa aaVar, cb cbVar, Resources resources) {
        this.f27902b = str;
        this.f27903c = (ba) C5571j.m24292a((Object) baVar);
        this.f27904d = c5176g;
        this.f27905e = cbVar;
        this.f27906f = aaVar;
        this.f27923w = resources;
        this.f27908h = (LatLng) C5571j.m24292a(markerOptions.getPosition());
        this.f27909i = C5174f.m23122a(markerOptions.getIcon(), this.f27923w);
        this.f27904d.m23130a(this.f27909i);
        this.f27910j = markerOptions.getAnchorU();
        this.f27911k = markerOptions.getAnchorV();
        this.f27912l = markerOptions.isFlat();
        this.f27913m = markerOptions.getRotation();
        this.f27922v = markerOptions.getAlpha();
        this.f27917q = markerOptions.getTitle();
        this.f27918r = markerOptions.getSnippet();
        this.f27914n = markerOptions.isDraggable();
        this.f27915o = markerOptions.isVisible();
        this.f27919s = markerOptions.getInfoWindowAnchorU();
        this.f27920t = markerOptions.getInfoWindowAnchorV();
        if (!(markerOptions.getAnchorU() == f27901a.getAnchorU() && markerOptions.getAnchorV() == f27901a.getAnchorV())) {
            this.f27905e.mo5310b(C5164a.MARKER_ANCHOR);
        }
        if (!(markerOptions.getInfoWindowAnchorU() == f27901a.getInfoWindowAnchorU() && markerOptions.getInfoWindowAnchorV() == f27901a.getInfoWindowAnchorV())) {
            this.f27905e.mo5310b(C5164a.MARKER_INFO_WINDOW_ANCHOR);
        }
        if (markerOptions.getIcon() != f27901a.getIcon()) {
            this.f27905e.mo5310b(C5164a.MARKER_ICON);
        }
        if (markerOptions.getTitle() != f27901a.getTitle()) {
            this.f27905e.mo5310b(C5164a.MARKER_TITLE);
        }
        if (markerOptions.getSnippet() != f27901a.getSnippet()) {
            this.f27905e.mo5310b(C5164a.MARKER_SNIPPET);
        }
        if (markerOptions.isDraggable() != f27901a.isDraggable()) {
            this.f27905e.mo5310b(C5164a.MARKER_DRAGGABLE);
        }
        if (markerOptions.isVisible() != f27901a.isVisible()) {
            this.f27905e.mo5310b(C5164a.MARKER_VISIBILITY);
        }
        if (markerOptions.isFlat() != f27901a.isFlat()) {
            this.f27905e.mo5310b(C5164a.MARKER_FLAT);
        }
        if (markerOptions.getRotation() != f27901a.getRotation()) {
            this.f27905e.mo5310b(C5164a.MARKER_ROTATION);
        }
        if (markerOptions.getAlpha() != f27901a.getAlpha()) {
            this.f27905e.mo5310b(C5164a.MARKER_ALPHA);
        }
    }

    /* renamed from: a */
    public final void m32866a(C5143a c5143a) {
        this.f27907g = c5143a;
    }

    /* renamed from: a */
    private void m32864a(int i) {
        if (!this.f27921u) {
            C5143a c = this.f27903c.m22933c(this);
            if (c != null) {
                c.mo4941a(i);
            }
        }
    }

    public final String getId() {
        return this.f27902b;
    }

    public final void remove() {
        this.f27906f.mo4875a();
        this.f27905e.mo5310b(C5164a.MARKER_REMOVE);
        m32865a();
    }

    /* renamed from: a */
    final void m32865a() {
        if (!this.f27921u) {
            if (isInfoWindowShown()) {
                hideInfoWindow();
            }
            this.f27921u = true;
            synchronized (this) {
                this.f27904d.m23132c(this.f27909i);
            }
            this.f27903c.m22926a(this);
        }
    }

    public final void setPosition(LatLng latLng) {
        this.f27906f.mo4875a();
        this.f27905e.mo5310b(C5164a.MARKER_SET_POSITION);
        m32867a(latLng);
        m32864a(1);
    }

    /* renamed from: a */
    public final synchronized void m32867a(LatLng latLng) {
        this.f27908h = latLng;
    }

    public final LatLng getPosition() {
        this.f27906f.mo4875a();
        return m32869b();
    }

    /* renamed from: b */
    public final synchronized LatLng m32869b() {
        return this.f27908h;
    }

    public final void setIcon(C5484b c5484b) {
        this.f27906f.mo4875a();
        synchronized (this) {
            this.f27904d.m23132c(this.f27909i);
            this.f27909i = C5174f.m23123a(c5484b, this.f27923w);
            this.f27904d.m23130a(this.f27909i);
        }
        m32864a(2);
    }

    /* renamed from: c */
    public final synchronized Bitmap m32870c() {
        return this.f27904d.m23131b(this.f27909i).m23127c();
    }

    public final void setAnchor(float f, float f2) {
        this.f27906f.mo4875a();
        synchronized (this) {
            this.f27910j = f;
            this.f27911k = f2;
        }
        m32864a((int) 5.6E-45f);
    }

    /* renamed from: d */
    public final float m32871d() {
        this.f27906f.mo4875a();
        return m32872e();
    }

    /* renamed from: e */
    public final synchronized float m32872e() {
        return this.f27910j;
    }

    /* renamed from: f */
    public final float m32873f() {
        this.f27906f.mo4875a();
        return m32874g();
    }

    /* renamed from: g */
    public final synchronized float m32874g() {
        return this.f27911k;
    }

    public final void setInfoWindowAnchor(float f, float f2) {
        this.f27906f.mo4875a();
        synchronized (this) {
            this.f27919s = f;
            this.f27920t = f2;
        }
        m32864a((int) 7.175E-43f);
    }

    /* renamed from: h */
    public final float m32875h() {
        this.f27906f.mo4875a();
        return m32876i();
    }

    /* renamed from: i */
    public final synchronized float m32876i() {
        return this.f27919s;
    }

    /* renamed from: j */
    public final float m32877j() {
        this.f27906f.mo4875a();
        return m32878k();
    }

    /* renamed from: k */
    public final synchronized float m32878k() {
        return this.f27920t;
    }

    public final void setTitle(String str) {
        this.f27906f.mo4875a();
        synchronized (this) {
            this.f27917q = str;
        }
        m32864a((int) ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    }

    public final String getTitle() {
        this.f27906f.mo4875a();
        return m32879l();
    }

    /* renamed from: l */
    public final synchronized String m32879l() {
        return this.f27917q;
    }

    public final void setSnippet(String str) {
        this.f27906f.mo4875a();
        this.f27918r = str;
        m32864a(256);
    }

    public final String getSnippet() {
        this.f27906f.mo4875a();
        return this.f27918r;
    }

    /* renamed from: m */
    public final String m32880m() {
        return this.f27918r;
    }

    public final void setDraggable(boolean z) {
        this.f27906f.mo4875a();
        this.f27914n = z;
        m32864a((int) true);
    }

    public final boolean isDraggable() {
        this.f27906f.mo4875a();
        return m32881n();
    }

    /* renamed from: n */
    public final synchronized boolean m32881n() {
        return this.f27914n;
    }

    public final void showInfoWindow() {
        if (!this.f27921u) {
            this.f27906f.mo4875a();
            this.f27905e.mo5310b(C5164a.MARKER_SHOW_INFO_BUBBLE);
            C5143a c = this.f27903c.m22933c(this);
            if (c != null) {
                c.mo4943c();
            }
        }
    }

    public final void hideInfoWindow() {
        if (!this.f27921u && isInfoWindowShown()) {
            this.f27906f.mo4875a();
            this.f27905e.mo5310b(C5164a.MARKER_HIDE_INFO_BUBBLE);
            C5143a c = this.f27903c.m22933c(this);
            if (c != null) {
                c.mo4944d();
            }
        }
    }

    public final boolean isInfoWindowShown() {
        this.f27906f.mo4875a();
        return !this.f27921u ? this.f27903c.m22932b(this) : false;
    }

    public final void setVisible(boolean z) {
        this.f27906f.mo4875a();
        synchronized (this) {
            this.f27915o = z;
        }
        m32864a((int) true);
    }

    public final boolean isVisible() {
        this.f27906f.mo4875a();
        return m32882o();
    }

    /* renamed from: o */
    public final synchronized boolean m32882o() {
        boolean z;
        z = this.f27915o && !this.f27916p;
        return z;
    }

    public final void setFlat(boolean z) {
        this.f27906f.mo4875a();
        synchronized (this) {
            this.f27912l = z;
        }
        m32864a((int) true);
    }

    public final boolean isFlat() {
        this.f27906f.mo4875a();
        return m32883p();
    }

    /* renamed from: p */
    public final synchronized boolean m32883p() {
        return this.f27912l;
    }

    public final void setRotation(float f) {
        this.f27906f.mo4875a();
        synchronized (this) {
            this.f27913m = f;
        }
        m32864a((int) 2.24E-44f);
    }

    public final float getRotation() {
        this.f27906f.mo4875a();
        return m32884q();
    }

    /* renamed from: q */
    public final synchronized float m32884q() {
        return this.f27913m;
    }

    public final void setAlpha(float f) {
        this.f27906f.mo4875a();
        synchronized (this) {
            this.f27922v = f;
        }
        m32864a((int) 1.435E-42f);
    }

    public final float getAlpha() {
        this.f27906f.mo4875a();
        return m32885r();
    }

    /* renamed from: r */
    public final synchronized float m32885r() {
        return this.f27922v;
    }

    public final boolean equalsRemote(IMarkerDelegate iMarkerDelegate) {
        return equals(iMarkerDelegate);
    }

    public final int hashCodeRemote() {
        return hashCode();
    }

    public final String toString() {
        return this.f27902b;
    }

    /* renamed from: s */
    public final ba m32886s() {
        return this.f27903c;
    }

    /* renamed from: t */
    public final Rect m32887t() {
        return this.f27907g.mo4947i();
    }

    /* renamed from: a */
    final void m32868a(boolean z) {
        this.f27906f.mo4875a();
        synchronized (this) {
            this.f27916p = z;
        }
        m32864a((int) true);
    }
}
