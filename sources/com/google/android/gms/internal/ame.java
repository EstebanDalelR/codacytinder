package com.google.android.gms.internal;

public abstract class ame extends aav implements zznx {
    public ame() {
        attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
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
            case 1: goto L_0x0029;
            case 2: goto L_0x0024;
            case 3: goto L_0x0015;
            case 4: goto L_0x0011;
            case 5: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r1.recordImpression();
        goto L_0x0020;
    L_0x0011:
        r1.recordClick();
        goto L_0x0020;
    L_0x0015:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.dynamic.IObjectWrapper.C3828a.a(r2);
        r1.zze(r2);
    L_0x0020:
        r4.writeNoException();
        return r0;
    L_0x0024:
        r2 = r1.getContent();
        goto L_0x002d;
    L_0x0029:
        r2 = r1.zzjj();
    L_0x002d:
        r4.writeNoException();
        r4.writeString(r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ame.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
