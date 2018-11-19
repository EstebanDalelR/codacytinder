package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.ar;
import java.io.IOException;

@zzzv
final class aqu {
    /* renamed from: a */
    final zzjj f15606a;
    /* renamed from: b */
    final String f15607b;
    /* renamed from: c */
    final int f15608c;

    aqu(aqq aqq) {
        this(aqq.m19428a(), aqq.m19432c(), aqq.m19431b());
    }

    private aqu(zzjj zzjj, String str, int i) {
        this.f15606a = zzjj;
        this.f15607b = str;
        this.f15608c = i;
    }

    /* renamed from: a */
    static aqu m19450a(String str) throws IOException {
        String[] split = str.split("\u0000");
        if (split.length != 3) {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
        Parcel obtain = Parcel.obtain();
        try {
            String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
            int parseInt = Integer.parseInt(split[1]);
            byte[] decode = Base64.decode(split[2], 0);
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            aqu aqu = new aqu((zzjj) zzjj.CREATOR.createFromParcel(obtain), str2, parseInt);
            obtain.recycle();
            return aqu;
        } catch (Throwable e) {
            ar.i().m27296a(e, "QueueSeed.decode");
            throw new IOException("Malformed QueueSeed encoding.", e);
        } catch (Throwable th) {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    final java.lang.String m19451a() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = android.os.Parcel.obtain();
        r1 = r6.f15607b;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r2 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r1 = r1.getBytes(r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r2 = 0;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r1 = android.util.Base64.encodeToString(r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r3 = r6.f15608c;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r6.f15606a;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4.writeToParcel(r0, r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r0.marshall();	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r2 = android.util.Base64.encodeToString(r4, r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r4.length();	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r4 + 2;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5 = java.lang.String.valueOf(r3);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5 = r5.length();	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r4 + r5;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5 = r5.length();	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r4 = r4 + r5;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.<init>(r4);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.append(r1);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r1 = "\u0000";	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.append(r1);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.append(r3);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r1 = "\u0000";	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.append(r1);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r5.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r1 = r5.toString();	 Catch:{ UnsupportedEncodingException -> 0x0062 }
        r0.recycle();
        return r1;
    L_0x0060:
        r1 = move-exception;
        goto L_0x006d;
    L_0x0062:
        r1 = "QueueSeed encode failed because UTF-8 is not available.";	 Catch:{ all -> 0x0060 }
        com.google.android.gms.internal.hx.m19913c(r1);	 Catch:{ all -> 0x0060 }
        r0.recycle();
        r0 = "";
        return r0;
    L_0x006d:
        r0.recycle();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aqu.a():java.lang.String");
    }
}
