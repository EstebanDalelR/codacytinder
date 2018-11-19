package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.formats.C2356c.C2354a;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import java.util.ArrayList;
import java.util.List;

@zzzv
public final class ann extends C2354a {
    /* renamed from: a */
    private final zzpm f23023a;
    /* renamed from: b */
    private final List<C2355b> f23024b = new ArrayList();
    /* renamed from: c */
    private String f23025c;

    public ann(zzpm zzpm) {
        this.f23023a = zzpm;
        try {
            this.f23025c = this.f23023a.getText();
        } catch (Throwable e) {
            hx.m19912b("Error while obtaining attribution text.", e);
            this.f23025c = "";
        }
        try {
            for (Object next : zzpm.zzjm()) {
                zzpq anp;
                if (next instanceof IBinder) {
                    IBinder iBinder = (IBinder) next;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        anp = queryLocalInterface instanceof zzpq ? (zzpq) queryLocalInterface : new anp(iBinder);
                        if (anp != null) {
                            this.f23024b.add(new anq(anp));
                        }
                    }
                }
                anp = null;
                if (anp != null) {
                    this.f23024b.add(new anq(anp));
                }
            }
        } catch (Throwable e2) {
            hx.m19912b("Error while obtaining image.", e2);
        }
    }
}
