package com.google.android.m4b.maps.ay;

import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.de.C5334h;
import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: com.google.android.m4b.maps.ay.i */
public final class C7438i extends C6409f {
    /* renamed from: a */
    private final C4716j f27246a;
    /* renamed from: b */
    private final C6413m f27247b;

    /* renamed from: a */
    public final boolean mo4878a() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo4879b() {
        return false;
    }

    /* renamed from: g */
    public final int mo7034g() {
        return 62;
    }

    public C7438i(C4716j c4716j, C6413m c6413m) {
        this.f27246a = c4716j;
        this.f27247b = c6413m;
        if (!c4716j.m20978e()) {
            String h = c6413m.m28022h();
            if (h != null) {
                c4716j.m20979f(h);
            }
        }
        if (!c4716j.m20980f()) {
            c6413m = c6413m.m28023i();
            if (c6413m != null) {
                c4716j.m20981g(c6413m);
            }
        }
    }

    /* renamed from: a */
    public final void mo7032a(DataOutput dataOutput) {
        C4665c.m20860a(dataOutput, this.f27246a.m20963a());
    }

    /* renamed from: a */
    public final boolean mo7033a(DataInput dataInput) {
        dataInput = C4665c.m20858a(C5334h.f19973b, dataInput);
        if (dataInput.m20845j(1)) {
            String h = dataInput.m20843h(1);
            this.f27246a.m20979f(h);
            this.f27247b.m28007a(h);
        }
        if (dataInput.m20845j(3)) {
            h = dataInput.m20843h(3);
            this.f27246a.m20981g(h);
            this.f27247b.m28014b(h);
        }
        if (dataInput.m20845j(2)) {
            this.f27247b.m28003a(dataInput.m20842g(2));
        }
        return true;
    }
}
