package com.google.android.m4b.maps.cg;

import android.os.IBinder;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate.Stub;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.cg.y */
public final class C7521y extends Stub {
    /* renamed from: a */
    private final ac f28117a;
    /* renamed from: b */
    private final C5196z f28118b;
    /* renamed from: c */
    private final cb f28119c;

    public C7521y(ac acVar, C5196z c5196z, cb cbVar) {
        C5571j.m24293a(c5196z.mo5136a(), (Object) "Building must have an id");
        this.f28117a = acVar;
        this.f28118b = c5196z;
        this.f28119c = cbVar;
    }

    /* renamed from: a */
    private String m33178a() {
        return this.f28118b.mo5136a().toString();
    }

    public final int getActiveLevelIndex() {
        this.f28119c.mo5310b(C5164a.INDOOR_GET_ACTIVE_LEVEL);
        return this.f28117a.mo4966a(this.f28118b);
    }

    public final int getDefaultLevelIndex() {
        this.f28119c.mo5310b(C5164a.INDOOR_GET_DEFAULT_LEVEL);
        return this.f28117a.mo4971b(this.f28118b);
    }

    public final boolean isUnderground() {
        this.f28119c.mo5310b(C5164a.INDOOR_IS_UNDERGROUND);
        return this.f28117a.mo4974c(this.f28118b);
    }

    public final List<IBinder> getLevels() {
        List<ab> b = this.f28118b.mo5138b();
        List<IBinder> a = au.m20524a(b.size());
        for (ab aaVar : b) {
            a.add(new aa(this.f28117a, aaVar, this.f28119c));
        }
        return a;
    }

    public final String toString() {
        return C5569h.m24283a(this).m24281a("id", m33178a()).m24279a("number of level: ", this.f28118b.mo5138b().size()).toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{m33178a()});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7521y)) {
            return null;
        }
        return this.f28118b.mo5136a().equals(((C7521y) obj).f28118b.mo5136a());
    }

    public final boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
        return equals(iIndoorBuildingDelegate);
    }

    public final int hashCodeRemote() {
        return hashCode();
    }
}
