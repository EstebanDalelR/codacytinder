package com.google.android.m4b.maps.bx;

import android.util.Log;
import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.bq;
import com.google.android.m4b.maps.bz.C6570b;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;

public final class ar {
    /* renamed from: a */
    private final C4723n f18458a;
    /* renamed from: b */
    private af f18459b = new af(0, 0);
    /* renamed from: c */
    private int f18460c = -1;
    /* renamed from: d */
    private final af f18461d = new af();
    /* renamed from: e */
    private C4999a f18462e = null;
    /* renamed from: f */
    private C5000b f18463f = null;

    /* renamed from: com.google.android.m4b.maps.bx.ar$a */
    public interface C4999a {
    }

    /* renamed from: com.google.android.m4b.maps.bx.ar$b */
    public interface C5000b {
    }

    public ar(C4723n c4723n) {
        this.f18458a = c4723n;
    }

    /* renamed from: a */
    private void m22349a(af afVar, af afVar2, int i, bq bqVar) {
        int i2 = i;
        this.f18459b = afVar;
        this.f18460c = i2;
        int a = afVar.m21473a();
        int c = afVar.m21484c();
        int e = (int) ((((double) bqVar.m28679e()) * Math.cos((((double) a) * 1.0E-6d) * 0.017453292519943295d)) * 0.33527612686157227d);
        int d = (int) (((double) bqVar.m28678d()) * 0.33527612686157227d);
        boolean z = this.f18463f == null;
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(a);
            dataOutputStream.writeInt(c);
            dataOutputStream.writeInt(afVar2.m21473a());
            dataOutputStream.writeInt(afVar2.m21484c());
            dataOutputStream.writeShort(i2);
            dataOutputStream.writeInt(e);
            dataOutputStream.writeInt(d);
            dataOutputStream.writeBoolean(z);
            dataOutputStream.writeBoolean(true);
            r1.f18458a.mo4890a(7, byteArrayOutputStream.toByteArray(), false, false, true);
        } catch (Throwable e2) {
            Throwable th = e2;
            if (C4728u.m21050a("ViewPointRecoder", 6)) {
                Log.e("ViewPointRecoder", "Error writing on the stream", th);
            }
        }
    }

    /* renamed from: a */
    public final void m22352a(C6570b c6570b) {
        af b = c6570b.m29242b();
        int i = 0;
        int max = Math.max(0, Math.min(30, Math.round(c6570b.m29256l())));
        if (max != this.f18460c) {
            m22349a(b, b, max, c6570b.m29265u().mo5129a());
            return;
        }
        if (!this.f18459b.equals(b)) {
            af afVar = this.f18459b;
            af afVar2 = null;
            af b2 = c6570b.m29242b();
            int f = (int) (((float) (b2.m21490f() - afVar.m21490f())) / c6570b.m29262r());
            int g = (int) (((float) (b2.m21492g() - afVar.m21492g())) / c6570b.m29262r());
            int e = c6570b.m29249e();
            int f2 = c6570b.m29250f();
            int i2 = e / 2;
            int i3 = f2 / 2;
            if (Math.abs(f) <= e) {
                if (Math.abs(g) <= f2) {
                    int i4 = f < (-i2) ? -e : f > i2 ? e : 0;
                    if (g < (-i3)) {
                        i = -f2;
                    } else if (g > i3) {
                        i = f2;
                    }
                    if (!(i == 0 && i4 == 0)) {
                        this.f18461d.m21487d((int) (((float) i4) * c6570b.m29262r()), (int) (((float) i) * c6570b.m29262r()));
                        afVar2 = afVar.m21489e(this.f18461d);
                    }
                    if (afVar2 != null && (this.f18459b == null || b.m21486d(afVar2) < b.m21486d(this.f18459b))) {
                        m22349a(afVar2, b, max, c6570b.m29265u().mo5129a());
                    }
                }
            }
            afVar2 = b2;
            m22349a(afVar2, b, max, c6570b.m29265u().mo5129a());
        }
    }

    /* renamed from: a */
    public final void m22350a(C4999a c4999a) {
        this.f18462e = null;
    }

    /* renamed from: a */
    public final void m22351a(C5000b c5000b) {
        this.f18463f = c5000b;
    }
}
