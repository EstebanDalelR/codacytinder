package com.google.android.gms.internal;

public abstract class asf extends aav implements zzvj {
    public asf() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
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
            case 2: goto L_0x00a5;
            case 3: goto L_0x009a;
            case 4: goto L_0x0095;
            case 5: goto L_0x008a;
            case 6: goto L_0x0085;
            case 7: goto L_0x007a;
            case 8: goto L_0x0075;
            case 9: goto L_0x0070;
            case 10: goto L_0x0069;
            case 11: goto L_0x005d;
            case 12: goto L_0x0051;
            case 13: goto L_0x0046;
            case 14: goto L_0x0041;
            case 15: goto L_0x0036;
            case 16: goto L_0x002a;
            case 17: goto L_0x0025;
            case 18: goto L_0x001f;
            case 19: goto L_0x0019;
            case 20: goto L_0x0013;
            case 21: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r2 = r1.zzjx();
        goto L_0x008e;
    L_0x0013:
        r2 = r1.zzml();
        goto L_0x008e;
    L_0x0019:
        r2 = r1.zzjy();
        goto L_0x008e;
    L_0x001f:
        r2 = r1.zzmk();
        goto L_0x008e;
    L_0x0025:
        r2 = r1.getVideoController();
        goto L_0x008e;
    L_0x002a:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r2);
        r1.zzj(r2);
        goto L_0x006c;
    L_0x0036:
        r2 = r1.getExtras();
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18809b(r4, r2);
        return r0;
    L_0x0041:
        r2 = r1.getOverrideClickHandling();
        goto L_0x004a;
    L_0x0046:
        r2 = r1.getOverrideImpressionRecording();
    L_0x004a:
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18806a(r4, r2);
        return r0;
    L_0x0051:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r2);
        r1.zzi(r2);
        goto L_0x006c;
    L_0x005d:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r2);
        r1.zzh(r2);
        goto L_0x006c;
    L_0x0069:
        r1.recordImpression();
    L_0x006c:
        r4.writeNoException();
        return r0;
    L_0x0070:
        r2 = r1.getPrice();
        goto L_0x00a9;
    L_0x0075:
        r2 = r1.getStore();
        goto L_0x00a9;
    L_0x007a:
        r2 = r1.getStarRating();
        r4.writeNoException();
        r4.writeDouble(r2);
        return r0;
    L_0x0085:
        r2 = r1.getCallToAction();
        goto L_0x00a9;
    L_0x008a:
        r2 = r1.zzjs();
    L_0x008e:
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18804a(r4, r2);
        return r0;
    L_0x0095:
        r2 = r1.getBody();
        goto L_0x00a9;
    L_0x009a:
        r2 = r1.getImages();
        r4.writeNoException();
        r4.writeList(r2);
        return r0;
    L_0x00a5:
        r2 = r1.getHeadline();
    L_0x00a9:
        r4.writeNoException();
        r4.writeString(r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.asf.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
