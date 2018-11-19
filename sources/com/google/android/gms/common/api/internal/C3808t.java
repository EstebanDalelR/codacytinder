package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.api.Api.zze;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.t */
final class C3808t extends C2479x {
    /* renamed from: a */
    private final ArrayList<zze> f12035a;
    /* renamed from: b */
    private /* synthetic */ C3803n f12036b;

    public C3808t(C3803n c3803n, ArrayList<zze> arrayList) {
        this.f12036b = c3803n;
        super(c3803n);
        this.f12035a = arrayList;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo2565a() {
        this.f12036b.f12006a.f13947d.f11880c = this.f12036b.m14406f();
        ArrayList arrayList = this.f12035a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zze) obj).zza(this.f12036b.f12020o, this.f12036b.f12006a.f13947d.f11880c);
        }
    }
}
