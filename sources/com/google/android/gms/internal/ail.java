package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@zzzv
public final class ail {
    /* renamed from: a */
    private long f15291a;
    /* renamed from: b */
    private Bundle f15292b;
    /* renamed from: c */
    private int f15293c;
    /* renamed from: d */
    private List<String> f15294d;
    /* renamed from: e */
    private boolean f15295e;
    /* renamed from: f */
    private int f15296f;
    /* renamed from: g */
    private boolean f15297g;
    /* renamed from: h */
    private String f15298h;
    /* renamed from: i */
    private zzmn f15299i;
    /* renamed from: j */
    private Location f15300j;
    /* renamed from: k */
    private String f15301k;
    /* renamed from: l */
    private Bundle f15302l;
    /* renamed from: m */
    private Bundle f15303m;
    /* renamed from: n */
    private List<String> f15304n;
    /* renamed from: o */
    private String f15305o;
    /* renamed from: p */
    private String f15306p;
    /* renamed from: q */
    private boolean f15307q;

    public ail() {
        this.f15291a = -1;
        this.f15292b = new Bundle();
        this.f15293c = -1;
        this.f15294d = new ArrayList();
        this.f15295e = false;
        this.f15296f = -1;
        this.f15297g = false;
        this.f15298h = null;
        this.f15299i = null;
        this.f15300j = null;
        this.f15301k = null;
        this.f15302l = new Bundle();
        this.f15303m = new Bundle();
        this.f15304n = new ArrayList();
        this.f15305o = null;
        this.f15306p = null;
        this.f15307q = false;
    }

    public ail(zzjj zzjj) {
        this.f15291a = zzjj.zzbdf;
        this.f15292b = zzjj.extras;
        this.f15293c = zzjj.zzbdg;
        this.f15294d = zzjj.zzbdh;
        this.f15295e = zzjj.zzbdi;
        this.f15296f = zzjj.zzbdj;
        this.f15297g = zzjj.zzbdk;
        this.f15298h = zzjj.zzbdl;
        this.f15299i = zzjj.zzbdm;
        this.f15300j = zzjj.zzbdn;
        this.f15301k = zzjj.zzbdo;
        this.f15302l = zzjj.zzbdp;
        this.f15303m = zzjj.zzbdq;
        this.f15304n = zzjj.zzbdr;
        this.f15305o = zzjj.zzbds;
        this.f15306p = zzjj.zzbdt;
    }

    /* renamed from: a */
    public final ail m19194a(@Nullable Location location) {
        this.f15300j = null;
        return this;
    }

    /* renamed from: a */
    public final zzjj m19195a() {
        long j = this.f15291a;
        Bundle bundle = this.f15292b;
        int i = this.f15293c;
        List list = this.f15294d;
        boolean z = this.f15295e;
        int i2 = this.f15296f;
        boolean z2 = this.f15297g;
        String str = this.f15298h;
        zzmn zzmn = this.f15299i;
        Location location = this.f15300j;
        String str2 = this.f15301k;
        Bundle bundle2 = this.f15302l;
        Bundle bundle3 = this.f15303m;
        Bundle bundle4 = bundle3;
        Bundle bundle5 = bundle4;
        return new zzjj(7, j, bundle, i, list, z, i2, z2, str, zzmn, location, str2, bundle2, bundle5, this.f15304n, this.f15305o, this.f15306p, false);
    }
}
