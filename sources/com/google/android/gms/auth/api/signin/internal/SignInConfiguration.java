package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public final class SignInConfiguration extends zzbfm implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new C2455t();
    private final String zzeil;
    private GoogleSignInOptions zzeim;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.zzeil = ad.m9047a(str);
        this.zzeim = googleSignInOptions;
    }

    public final boolean equals(java.lang.Object r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r4 = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) r4;	 Catch:{ ClassCastException -> 0x0025 }
        r1 = r3.zzeil;	 Catch:{ ClassCastException -> 0x0025 }
        r2 = r4.zzeil;	 Catch:{ ClassCastException -> 0x0025 }
        r1 = r1.equals(r2);	 Catch:{ ClassCastException -> 0x0025 }
        if (r1 == 0) goto L_0x0025;	 Catch:{ ClassCastException -> 0x0025 }
    L_0x0010:
        r1 = r3.zzeim;	 Catch:{ ClassCastException -> 0x0025 }
        if (r1 != 0) goto L_0x0019;	 Catch:{ ClassCastException -> 0x0025 }
    L_0x0014:
        r4 = r4.zzeim;	 Catch:{ ClassCastException -> 0x0025 }
        if (r4 != 0) goto L_0x0025;	 Catch:{ ClassCastException -> 0x0025 }
    L_0x0018:
        goto L_0x0023;	 Catch:{ ClassCastException -> 0x0025 }
    L_0x0019:
        r1 = r3.zzeim;	 Catch:{ ClassCastException -> 0x0025 }
        r4 = r4.zzeim;	 Catch:{ ClassCastException -> 0x0025 }
        r4 = r1.equals(r4);	 Catch:{ ClassCastException -> 0x0025 }
        if (r4 == 0) goto L_0x0025;
    L_0x0023:
        r4 = 1;
        return r4;
    L_0x0025:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInConfiguration.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return new C2454o().m8826a(this.zzeil).m8826a(this.zzeim).m8825a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 2, this.zzeil, false);
        oj.a(parcel, 5, this.zzeim, i, false);
        oj.a(parcel, a);
    }

    public final GoogleSignInOptions zzabr() {
        return this.zzeim;
    }
}
