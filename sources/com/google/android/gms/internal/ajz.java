package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class ajz extends aav implements zzll {
    public ajz() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public static zzll m27113a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof zzll ? (zzll) queryLocalInterface : new aka(iBinder);
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
            case 1: goto L_0x0079;
            case 2: goto L_0x0075;
            case 3: goto L_0x006d;
            case 4: goto L_0x0062;
            case 5: goto L_0x0057;
            case 6: goto L_0x004c;
            case 7: goto L_0x0047;
            case 8: goto L_0x0027;
            case 9: goto L_0x0022;
            case 10: goto L_0x001d;
            case 11: goto L_0x0012;
            case 12: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r2 = 0;
        return r2;
    L_0x000d:
        r2 = r1.isClickToExpandEnabled();
        goto L_0x0066;
    L_0x0012:
        r2 = r1.zzij();
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18804a(r4, r2);
        return r0;
    L_0x001d:
        r2 = r1.isCustomControlsEnabled();
        goto L_0x0066;
    L_0x0022:
        r2 = r1.getAspectRatio();
        goto L_0x0050;
    L_0x0027:
        r2 = r3.readStrongBinder();
        if (r2 != 0) goto L_0x002f;
    L_0x002d:
        r2 = 0;
        goto L_0x0043;
    L_0x002f:
        r3 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks";
        r3 = r2.queryLocalInterface(r3);
        r5 = r3 instanceof com.google.android.gms.internal.zzlo;
        if (r5 == 0) goto L_0x003d;
    L_0x0039:
        r2 = r3;
        r2 = (com.google.android.gms.internal.zzlo) r2;
        goto L_0x0043;
    L_0x003d:
        r3 = new com.google.android.gms.internal.akc;
        r3.<init>(r2);
        r2 = r3;
    L_0x0043:
        r1.zza(r2);
        goto L_0x007c;
    L_0x0047:
        r2 = r1.zzii();
        goto L_0x0050;
    L_0x004c:
        r2 = r1.zzih();
    L_0x0050:
        r4.writeNoException();
        r4.writeFloat(r2);
        return r0;
    L_0x0057:
        r2 = r1.getPlaybackState();
        r4.writeNoException();
        r4.writeInt(r2);
        return r0;
    L_0x0062:
        r2 = r1.isMuted();
    L_0x0066:
        r4.writeNoException();
        com.google.android.gms.internal.aaw.m18806a(r4, r2);
        return r0;
    L_0x006d:
        r2 = com.google.android.gms.internal.aaw.m18807a(r3);
        r1.mute(r2);
        goto L_0x007c;
    L_0x0075:
        r1.pause();
        goto L_0x007c;
    L_0x0079:
        r1.play();
    L_0x007c:
        r4.writeNoException();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ajz.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
