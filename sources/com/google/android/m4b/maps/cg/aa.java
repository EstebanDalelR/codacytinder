package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate;
import com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate.Stub;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Arrays;

public final class aa extends Stub {
    /* renamed from: a */
    private final ac f27828a;
    /* renamed from: b */
    private final ab f27829b;
    /* renamed from: c */
    private final cb f27830c;

    public aa(ac acVar, ab abVar, cb cbVar) {
        C5571j.m24293a(abVar.mo5143b(), (Object) "Level must have an id");
        this.f27828a = acVar;
        this.f27829b = abVar;
        this.f27830c = cbVar;
    }

    /* renamed from: a */
    private String m32786a() {
        return this.f27829b.mo5143b().toString();
    }

    public final String getName() {
        return this.f27829b.mo5144d();
    }

    public final String getShortName() {
        return this.f27829b.mo5145e();
    }

    public final void activate() {
        this.f27830c.mo5310b(C5164a.INDOOR_ACTIVATE_LEVEL);
        this.f27828a.mo4968a(this.f27829b.mo5142a());
    }

    public final String toString() {
        return C5569h.m24283a(this).m24281a("id", m32786a()).m24281a("name", getName()).m24281a("shortName", getShortName()).toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{m32786a()});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return null;
        }
        return this.f27829b.mo5143b().equals(((aa) obj).f27829b.mo5143b());
    }

    public final boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate) {
        return equals(iIndoorLevelDelegate);
    }

    public final int hashCodeRemote() {
        return hashCode();
    }
}
