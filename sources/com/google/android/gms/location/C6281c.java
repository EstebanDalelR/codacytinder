package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.C2467b;
import com.google.android.gms.common.api.internal.bb;
import com.google.android.gms.common.api.internal.be;
import com.google.android.gms.common.api.internal.bt;
import com.google.android.gms.common.api.internal.cf;
import com.google.android.gms.common.internal.C2510z;
import com.google.android.gms.internal.rj;
import com.google.android.gms.internal.sg;
import com.google.android.gms.internal.zzceo;
import com.google.android.gms.internal.zzceu;
import com.google.android.gms.internal.zzcfo;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.C4501b;

/* renamed from: com.google.android.gms.location.c */
public class C6281c extends C2467b<Object> {

    /* renamed from: com.google.android.gms.location.c$a */
    static class C7364a extends rj {
        /* renamed from: a */
        private final C4501b<Void> f27081a;

        public C7364a(C4501b<Void> c4501b) {
            this.f27081a = c4501b;
        }

        public final void zza(zzceo zzceo) {
            bt.a(zzceo.getStatus(), null, this.f27081a);
        }
    }

    public C6281c(@NonNull Context context) {
        super(context, C4486f.f16730a, null, new cf());
    }

    /* renamed from: a */
    private final zzceu m27591a(C4501b<Boolean> c4501b) {
        return new C7366v(this, c4501b);
    }

    /* renamed from: a */
    public C4500a<Void> m27592a(PendingIntent pendingIntent) {
        return C2510z.a(C4486f.f16731b.removeLocationUpdates(d(), pendingIntent));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    public C4500a<Void> m27593a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return C2510z.a(C4486f.f16731b.requestLocationUpdates(d(), locationRequest, pendingIntent));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    public C4500a<Void> m27594a(LocationRequest locationRequest, C4485e c4485e, @Nullable Looper looper) {
        zzcfo zza = zzcfo.zza(locationRequest);
        bb a = be.a(c4485e, sg.m20169a(looper), C4485e.class.getSimpleName());
        return a(new C6283t(this, a, zza, a), new C6284u(this, a.b()));
    }

    /* renamed from: a */
    public C4500a<Void> m27595a(C4485e c4485e) {
        return bt.a(a(be.a(c4485e, C4485e.class.getSimpleName())));
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: g */
    public C4500a<Location> m27596g() {
        return a(new C6282s(this));
    }
}
