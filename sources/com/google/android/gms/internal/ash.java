package com.google.android.gms.internal;

public abstract class ash extends aav implements zzvm {
    public ash() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
        r1 = this;
        r5 = r1.zza(r2, r3, r4, r5);
        r0 = 1;
        if (r5 == 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        switch(r2) {
            case 2: goto L_0x0092;
            case 3: goto L_0x0087;
            case 4: goto L_0x0082;
            case 5: goto L_0x0077;
            case 6: goto L_0x0072;
            case 7: goto L_0x006d;
            case 8: goto L_0x0066;
            case 9: goto L_0x005a;
            case 10: goto L_0x004e;
            case 11: goto L_0x0043;
            case 12: goto L_0x003e;
            case 13: goto L_0x0033;
            case 14: goto L_0x0027;
            case 15: goto L_0x0022;
            case 16: goto L_0x001d;
            case 17: goto L_0x000b;
            case 18: goto L_0x000b;
            case 19: goto L_0x0018;
            case 20: goto L_0x0013;
            case 21: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r2 = r1.zzjx();
        goto L_0x007b;
    L_0x0013:
        r2 = r1.zzml();
        goto L_0x007b;
    L_0x0018:
        r2 = r1.zzjy();
        goto L_0x007b;
    L_0x001d:
        r2 = r1.getVideoController();
        goto L_0x007b;
    L_0x0022:
        r2 = r1.zzmk();
        goto L_0x007b;
    L_0x0027:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r2);
        r1.zzj(r2);
        goto L_0x0069;
    L_0x0033:
        r2 = r1.getExtras();
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18809b(r4, r2);
        return r0;
    L_0x003e:
        r2 = r1.getOverrideClickHandling();
        goto L_0x0047;
    L_0x0043:
        r2 = r1.getOverrideImpressionRecording();
    L_0x0047:
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18806a(r4, r2);
        return r0;
    L_0x004e:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r2);
        r1.zzi(r2);
        goto L_0x0069;
    L_0x005a:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r2);
        r1.zzh(r2);
        goto L_0x0069;
    L_0x0066:
        r1.recordImpression();
    L_0x0069:
        r4.writeNoException();
        return r0;
    L_0x006d:
        r2 = r1.getAdvertiser();
        goto L_0x0096;
    L_0x0072:
        r2 = r1.getCallToAction();
        goto L_0x0096;
    L_0x0077:
        r2 = r1.zzjz();
    L_0x007b:
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18804a(r4, r2);
        return r0;
    L_0x0082:
        r2 = r1.getBody();
        goto L_0x0096;
    L_0x0087:
        r2 = r1.getImages();
        r4.writeNoException();
        r4.writeList(r2);
        return r0;
    L_0x0092:
        r2 = r1.getHeadline();
    L_0x0096:
        r4.writeNoException();
        r4.writeString(r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ash.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
