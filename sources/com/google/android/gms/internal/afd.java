package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.js.C2388t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@zzzv
public final class afd implements zzga {
    /* renamed from: a */
    private final Object f22897a = new Object();
    /* renamed from: b */
    private final WeakHashMap<dl, afe> f22898b = new WeakHashMap();
    /* renamed from: c */
    private final ArrayList<afe> f22899c = new ArrayList();
    /* renamed from: d */
    private final Context f22900d;
    /* renamed from: e */
    private final zzakd f22901e;
    /* renamed from: f */
    private final C2388t f22902f;

    public afd(Context context, zzakd zzakd) {
        this.f22900d = context.getApplicationContext();
        this.f22901e = zzakd;
        this.f22902f = new C2388t(context.getApplicationContext(), zzakd, (String) aja.m19221f().m19334a(alo.f15449a));
    }

    /* renamed from: e */
    private final boolean m27068e(dl dlVar) {
        boolean z;
        synchronized (this.f22897a) {
            afe afe = (afe) this.f22898b.get(dlVar);
            z = afe != null && afe.m19095c();
        }
        return z;
    }

    /* renamed from: a */
    public final void m27069a(dl dlVar) {
        synchronized (this.f22897a) {
            afe afe = (afe) this.f22898b.get(dlVar);
            if (afe != null) {
                afe.m19091b();
            }
        }
    }

    /* renamed from: a */
    public final void m27070a(zzjn zzjn, dl dlVar) {
        zzanh zzanh = dlVar.f15970b;
        if (zzanh == null) {
            throw null;
        }
        m27071a(zzjn, dlVar, (View) zzanh);
    }

    /* renamed from: a */
    public final void m27071a(zzjn zzjn, dl dlVar, View view) {
        m27073a(zzjn, dlVar, new afm(view, dlVar), null);
    }

    /* renamed from: a */
    public final void m27072a(zzjn zzjn, dl dlVar, View view, zzanh zzanh) {
        m27073a(zzjn, dlVar, new afm(view, dlVar), zzanh);
    }

    /* renamed from: a */
    public final void m27073a(zzjn zzjn, dl dlVar, zzhd zzhd, @Nullable zzanh zzanh) {
        synchronized (this.f22897a) {
            afe afe;
            if (m27068e(dlVar)) {
                afe = (afe) this.f22898b.get(dlVar);
            } else {
                afe afe2 = new afe(this.f22900d, zzjn, dlVar, this.f22901e, zzhd);
                afe2.m19087a((zzga) this);
                this.f22898b.put(dlVar, afe2);
                this.f22899c.add(afe2);
                afe = afe2;
            }
            afe.m19088a(zzanh != null ? new afn(afe, zzanh) : new afr(afe, this.f22902f, this.f22900d));
        }
    }

    /* renamed from: b */
    public final void m27074b(dl dlVar) {
        synchronized (this.f22897a) {
            afe afe = (afe) this.f22898b.get(dlVar);
            if (afe != null) {
                afe.m19096d();
            }
        }
    }

    /* renamed from: c */
    public final void m27075c(dl dlVar) {
        synchronized (this.f22897a) {
            afe afe = (afe) this.f22898b.get(dlVar);
            if (afe != null) {
                afe.m19097e();
            }
        }
    }

    /* renamed from: d */
    public final void m27076d(dl dlVar) {
        synchronized (this.f22897a) {
            afe afe = (afe) this.f22898b.get(dlVar);
            if (afe != null) {
                afe.m19098f();
            }
        }
    }

    public final void zza(afe afe) {
        synchronized (this.f22897a) {
            if (!afe.m19095c()) {
                this.f22899c.remove(afe);
                Iterator it = this.f22898b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == afe) {
                        it.remove();
                    }
                }
            }
        }
    }
}
