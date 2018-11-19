package com.google.android.gms.internal;

final class gv implements zzx {
    /* renamed from: a */
    private /* synthetic */ String f23309a;
    /* renamed from: b */
    private /* synthetic */ gy f23310b;

    gv(gr grVar, String str, gy gyVar) {
        this.f23309a = str;
        this.f23310b = gyVar;
    }

    public final void zzd(zzad zzad) {
        String str = this.f23309a;
        String zzad2 = zzad.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(zzad2).length());
        stringBuilder.append("Failed to load URL: ");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        stringBuilder.append(zzad2);
        hx.m19916e(stringBuilder.toString());
        this.f23310b.zzb(null);
    }
}
