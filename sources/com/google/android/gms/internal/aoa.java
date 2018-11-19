package com.google.android.gms.internal;

public abstract class aoa extends aav implements zzqi {
    public aoa() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
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
            case 2: goto L_0x008b;
            case 3: goto L_0x0080;
            case 4: goto L_0x0075;
            case 5: goto L_0x0070;
            case 6: goto L_0x006b;
            case 7: goto L_0x0066;
            case 8: goto L_0x0061;
            case 9: goto L_0x0056;
            case 10: goto L_0x004f;
            case 11: goto L_0x004a;
            case 12: goto L_0x003e;
            case 13: goto L_0x002b;
            case 14: goto L_0x001f;
            case 15: goto L_0x0019;
            case 16: goto L_0x0013;
            case 17: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r2 = r1.getMediationAdapterClassName();
        goto L_0x0084;
    L_0x0013:
        r2 = r1.zzjx();
        goto L_0x008f;
    L_0x0019:
        r2 = r1.zzjy();
        goto L_0x008f;
    L_0x001f:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.aaw.m18803a(r3, r2);
        r2 = (android.os.Bundle) r2;
        r1.reportTouchEvent(r2);
        goto L_0x0052;
    L_0x002b:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.aaw.m18803a(r3, r2);
        r2 = (android.os.Bundle) r2;
        r2 = r1.recordImpression(r2);
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18806a(r4, r2);
        return r0;
    L_0x003e:
        r2 = android.os.Bundle.CREATOR;
        r2 = com.google.android.gms.internal.aaw.m18803a(r3, r2);
        r2 = (android.os.Bundle) r2;
        r1.performClick(r2);
        goto L_0x0052;
    L_0x004a:
        r2 = r1.getVideoController();
        goto L_0x008f;
    L_0x004f:
        r1.destroy();
    L_0x0052:
        r4.writeNoException();
        return r0;
    L_0x0056:
        r2 = r1.getExtras();
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18809b(r4, r2);
        return r0;
    L_0x0061:
        r2 = r1.getAdvertiser();
        goto L_0x0084;
    L_0x0066:
        r2 = r1.getCallToAction();
        goto L_0x0084;
    L_0x006b:
        r2 = r1.zzjz();
        goto L_0x008f;
    L_0x0070:
        r2 = r1.getBody();
        goto L_0x0084;
    L_0x0075:
        r2 = r1.getImages();
        r4.writeNoException();
        r4.writeList(r2);
        return r0;
    L_0x0080:
        r2 = r1.getHeadline();
    L_0x0084:
        r4.writeNoException();
        r4.writeString(r2);
        return r0;
    L_0x008b:
        r2 = r1.zzjt();
    L_0x008f:
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18804a(r4, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aoa.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
