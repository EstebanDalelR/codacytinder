package com.google.android.m4b.maps.aq;

import android.content.Context;
import com.google.android.m4b.maps.ap.C4658e;
import com.google.android.m4b.maps.ap.C4658e.C4657a;
import com.google.android.m4b.maps.ap.C6400a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.aq.a */
public final class C7435a extends C6400a implements C4658e {
    /* renamed from: a */
    private Context f27242a;
    /* renamed from: b */
    private final Set<String> f27243b = Collections.synchronizedSet(new HashSet());

    public C7435a(Context context) {
        this.f27242a = context;
    }

    /* renamed from: c */
    private static String m32013c(String str) {
        String valueOf = String.valueOf("DATA_");
        str = String.valueOf(str);
        return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    /* renamed from: a */
    public final boolean mo7028a(String str) {
        return this.f27242a.deleteFile(C7435a.m32013c(str));
    }

    /* renamed from: b */
    private int m32012b(byte[] bArr, String str) {
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (byte[] bArr2) {
                throw new C4657a(bArr2.getMessage(), -1);
            } catch (byte[] bArr22) {
                throw new C4657a(bArr22.getMessage(), -1);
            }
        }
        str = this.f27242a.openFileOutput(C7435a.m32013c(str), 0);
        str.write(bArr22);
        str.close();
        return (((bArr22.length - 1) / 4096) + 1) * 4096;
    }

    /* renamed from: a */
    public final int mo7027a(byte[] bArr, String str) {
        try {
            return m32012b(bArr, str);
        } catch (byte[] bArr2) {
            return bArr2.m20782a();
        }
    }

    /* renamed from: b */
    public final byte[] mo7029b(java.lang.String r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = 0;
        r1 = com.google.android.m4b.maps.aq.C7435a.m32013c(r8);	 Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x006b, all -> 0x0063 }
        r2 = r7.f27242a;	 Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x006b, all -> 0x0063 }
        r2 = r2.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x006b, all -> 0x0063 }
        r3 = r7.f27242a;	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r1 = r3.getFileStreamPath(r1);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r3 = r1.length();	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r1 = (int) r3;	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r3 = new byte[r1];	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r4 = 0;	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
    L_0x0019:
        if (r1 <= 0) goto L_0x005b;	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
    L_0x001b:
        r5 = r2.read(r3, r4, r1);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r6 = -1;	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        if (r5 != r6) goto L_0x0058;	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
    L_0x0022:
        r3 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r5 = java.lang.String.valueOf(r8);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r5 = r5.length();	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r5 = r5 + 55;	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r3.<init>(r5);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r5 = "Read ";	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r3.append(r5);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r3.append(r4);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r4 = " bytes from ";	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r3.append(r4);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r3.append(r8);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r8 = "; expected ";	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r3.append(r8);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r3.append(r1);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r8 = " more";	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r3.append(r8);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r8 = r3.toString();	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r1 = new java.io.IOException;	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        r1.<init>(r8);	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
        throw r1;	 Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x006c, all -> 0x0061 }
    L_0x0058:
        r1 = r1 - r5;
        r4 = r4 + r5;
        goto L_0x0019;
    L_0x005b:
        if (r2 == 0) goto L_0x0060;
    L_0x005d:
        r2.close();	 Catch:{ IOException -> 0x0060 }
    L_0x0060:
        return r3;
    L_0x0061:
        r8 = move-exception;
        goto L_0x0065;
    L_0x0063:
        r8 = move-exception;
        r2 = r0;
    L_0x0065:
        if (r2 == 0) goto L_0x006a;
    L_0x0067:
        r2.close();	 Catch:{ IOException -> 0x006a }
    L_0x006a:
        throw r8;
    L_0x006b:
        r2 = r0;
    L_0x006c:
        if (r2 == 0) goto L_0x0071;
    L_0x006e:
        r2.close();	 Catch:{ IOException -> 0x0071 }
    L_0x0071:
        return r0;
    L_0x0072:
        r2 = r0;
    L_0x0073:
        if (r2 == 0) goto L_0x0078;
    L_0x0075:
        r2.close();	 Catch:{ IOException -> 0x0078 }
    L_0x0078:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aq.a.b(java.lang.String):byte[]");
    }
}
