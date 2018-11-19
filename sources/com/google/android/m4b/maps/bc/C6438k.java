package com.google.android.m4b.maps.bc;

import android.content.res.Resources;
import android.location.Location;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.bo.ae;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.ac;
import com.google.android.m4b.maps.cg.bc.C5146a;
import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.bc.k */
public final class C6438k implements C5146a {
    /* renamed from: a */
    private final C6450v f23898a;
    /* renamed from: b */
    private final Resources f23899b;
    /* renamed from: c */
    private ac f23900c;

    public C6438k(C6450v c6450v) {
        this.f23898a = (C6450v) C5571j.m24292a((Object) c6450v);
        this.f23899b = c6450v.getResources();
    }

    /* renamed from: b */
    public final void mo4982b() {
        this.f23898a.m28297b(this.f23900c);
    }

    /* renamed from: a */
    public final void mo4981a(Location location) {
        af a = af.m21455a(location.getLatitude(), location.getLongitude());
        ae aeVar = new ae(a, location.getBearing(), (int) location.getAccuracy());
        aeVar.m21439a(a);
        aeVar.m21441a(location.hasBearing());
        this.f23900c.m34294a(aeVar);
        this.f23898a.mo7051a(true, true);
    }

    /* renamed from: a */
    public final void mo4980a() {
        if (this.f23900c == null) {
            this.f23900c = this.f23898a.m28299d(true);
            this.f23900c.m34293a(this.f23899b.getDimension(C4513R.dimen.maps_vm_mylocation_dot_size), this.f23899b.getInteger(C4513R.integer.maps_vm_mylocation_dot_opaque_percent), this.f23899b.getInteger(C4513R.integer.maps_vm_mylocation_chevron_opaque_percent));
        }
        this.f23898a.m28294a(this.f23900c);
    }
}
