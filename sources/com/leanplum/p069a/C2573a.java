package com.leanplum.p069a;

import android.util.Pair;
import java.util.Arrays;

/* renamed from: com.leanplum.a.a */
public final class C2573a {
    /* renamed from: a */
    private static final String f7887a;
    /* renamed from: b */
    private static final String f7888b;
    /* renamed from: c */
    private final String f7889c;
    /* renamed from: d */
    private final String f7890d;

    static {
        StringBuilder stringBuilder = new StringBuilder("L");
        stringBuilder.append("q3");
        stringBuilder.append("fz");
        f7887a = stringBuilder.toString();
        stringBuilder = new StringBuilder("b");
        stringBuilder.append("Lt");
        stringBuilder.append("i2");
        f7888b = stringBuilder.toString();
    }

    public C2573a(String str, String str2) {
        this.f7889c = str;
        this.f7890d = str2;
    }

    /* renamed from: a */
    private String m9442a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f7887a);
        stringBuilder.append(this.f7889c);
        stringBuilder.append(f7888b);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final String m9449a(String str) {
        if (str == null) {
            return null;
        }
        if (this.f7889c != null) {
            if (!this.f7889c.isEmpty()) {
                String a = C2573a.m9443a(m9442a(), str);
                if (a == null) {
                    ao.m9517b(new Object[]{"Failed to encrypt."});
                    return null;
                }
                if (!a.isEmpty() && a.equals(str) == null) {
                    if (a.startsWith("[") != null) {
                        str = new StringBuilder();
                        str.append(C5723b.f21176b.f21178c);
                        str.append(a);
                        return str.toString();
                    }
                }
                str = new Object[1];
                StringBuilder stringBuilder = new StringBuilder("Invalid ciphertext: ");
                stringBuilder.append(a);
                str[0] = stringBuilder.toString();
                ao.m9517b(str);
                return null;
            }
        }
        ao.m9516a("Encrypt called with null appId.");
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final java.lang.String m9448a(android.content.SharedPreferences r6, java.lang.String r7, java.lang.String r8) {
        /*
        r5 = this;
        r0 = 0;
        r6 = r6.getString(r7, r0);
        if (r6 != 0) goto L_0x0008;
    L_0x0007:
        return r8;
    L_0x0008:
        r7 = com.leanplum.p069a.C5723b.a(r6);
        r1 = 0;
        r2 = 1;
        if (r7 != 0) goto L_0x0027;
    L_0x0010:
        r7 = new java.lang.Object[r2];
        r3 = new java.lang.StringBuilder;
        r4 = "Got null encryptionSpec for encrypted: ";
        r3.<init>(r4);
        r3.append(r6);
        r3 = r3.toString();
        r7[r1] = r3;
        com.leanplum.p069a.ao.m9519d(r7);
        goto L_0x009b;
    L_0x0027:
        r3 = com.leanplum.p069a.a$1.f21136a;
        r4 = r7.first;
        r4 = (com.leanplum.p069a.C5723b) r4;
        r4 = r4.ordinal();
        r3 = r3[r4];
        switch(r3) {
            case 1: goto L_0x005b;
            case 2: goto L_0x0037;
            default: goto L_0x0036;
        };
    L_0x0036:
        goto L_0x009b;
    L_0x0037:
        r3 = r5.f7889c;
        if (r3 == 0) goto L_0x0051;
    L_0x003b:
        r3 = r5.f7889c;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0051;
    L_0x0044:
        r0 = r5.m9442a();
        r7 = r7.second;
        r7 = (java.lang.String) r7;
        r0 = com.leanplum.p069a.C2573a.m9446b(r0, r7);
        goto L_0x009b;
    L_0x0051:
        r7 = new java.lang.Object[r2];
        r3 = "Decrypt called with null appId.";
        r7[r1] = r3;
        com.leanplum.p069a.ao.m9516a(r7);
        goto L_0x009b;
    L_0x005b:
        r3 = r5.f7890d;
        if (r3 == 0) goto L_0x0092;
    L_0x005f:
        r3 = r5.f7890d;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0092;
    L_0x0068:
        r3 = r5.f7890d;
        r7 = r7.second;
        r7 = (java.lang.String) r7;
        r7 = com.leanplum.p069a.C2573a.m9446b(r3, r7);
        if (r7 == 0) goto L_0x0090;
    L_0x0074:
        r3 = com.leanplum.p069a.C2573a.m9447c(r7);
        if (r3 == 0) goto L_0x0090;
    L_0x007a:
        r6 = new java.lang.Object[r2];
        r2 = new java.lang.StringBuilder;
        r3 = "Discarding legacy value that appears to be an encrypted value: ";
        r2.<init>(r3);
        r2.append(r7);
        r7 = r2.toString();
        r6[r1] = r7;
        com.leanplum.p069a.ao.m9516a(r6);
        goto L_0x00b2;
    L_0x0090:
        r0 = r7;
        goto L_0x009b;
    L_0x0092:
        r7 = new java.lang.Object[r2];
        r3 = "Decrypt called with null token.";
        r7[r1] = r3;
        com.leanplum.p069a.ao.m9516a(r7);
    L_0x009b:
        if (r0 != 0) goto L_0x00b2;
    L_0x009d:
        r7 = new java.lang.Object[r2];
        r2 = new java.lang.StringBuilder;
        r3 = "Unable to decrypt ";
        r2.<init>(r3);
        r2.append(r6);
        r6 = r2.toString();
        r7[r1] = r6;
        com.leanplum.p069a.ao.m9517b(r7);
    L_0x00b2:
        if (r0 != 0) goto L_0x00b5;
    L_0x00b4:
        return r8;
    L_0x00b5:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.a.a(android.content.SharedPreferences, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private String m9445b(String str) {
        Pair a = C5723b.a(str);
        String str2 = null;
        if (a != null) {
            switch (a$1.f21136a[((C5723b) a.first).ordinal()]) {
                case 1:
                    if (this.f7890d != null) {
                        if (!this.f7890d.isEmpty()) {
                            String b = C2573a.m9446b(this.f7890d, (String) a.second);
                            if (b == null || C2573a.m9447c(b) == null) {
                                str2 = b;
                                break;
                            }
                            Object[] objArr = new Object[1];
                            StringBuilder stringBuilder = new StringBuilder("Discarding legacy value that appears to be an encrypted value: ");
                            stringBuilder.append(b);
                            objArr[0] = stringBuilder.toString();
                            ao.m9516a(objArr);
                            return null;
                        }
                    }
                    ao.m9516a("Decrypt called with null token.");
                    break;
                case 2:
                    if (this.f7889c != null) {
                        if (!this.f7889c.isEmpty()) {
                            str2 = C2573a.m9446b(m9442a(), (String) a.second);
                            break;
                        }
                    }
                    ao.m9516a("Decrypt called with null appId.");
                    break;
                default:
                    break;
            }
        }
        Object[] objArr2 = new Object[1];
        StringBuilder stringBuilder2 = new StringBuilder("Got null encryptionSpec for encrypted: ");
        stringBuilder2.append(str);
        objArr2[0] = stringBuilder2.toString();
        ao.m9519d(objArr2);
        if (str2 == null) {
            objArr2 = new Object[1];
            stringBuilder = new StringBuilder("Unable to decrypt ");
            stringBuilder.append(str);
            objArr2[0] = stringBuilder.toString();
            ao.m9517b(objArr2);
        }
        return str2;
    }

    /* renamed from: a */
    private static String m9443a(String str, String str2) {
        try {
            return Arrays.toString(C2573a.m9444a(1, str, str2.getBytes("UTF-8")));
        } catch (String str3) {
            Object[] objArr = new Object[2];
            StringBuilder stringBuilder = new StringBuilder("Unable to encrypt ");
            stringBuilder.append(str2);
            objArr[0] = stringBuilder.toString();
            objArr[1] = str3;
            ao.m9517b(objArr);
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m9447c(java.lang.String r4) {
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
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r4 = r4.trim();
        r1 = r4.length();
        r2 = 2;
        if (r1 >= r2) goto L_0x0010;
    L_0x000f:
        return r0;
    L_0x0010:
        r1 = r4.length();	 Catch:{ NumberFormatException -> 0x0037 }
        r2 = 1;	 Catch:{ NumberFormatException -> 0x0037 }
        r1 = r1 - r2;	 Catch:{ NumberFormatException -> 0x0037 }
        r4 = r4.substring(r2, r1);	 Catch:{ NumberFormatException -> 0x0037 }
        r4 = r4.trim();	 Catch:{ NumberFormatException -> 0x0037 }
        r1 = "\\s*,\\s*";	 Catch:{ NumberFormatException -> 0x0037 }
        r4 = r4.split(r1);	 Catch:{ NumberFormatException -> 0x0037 }
        r1 = r4.length;	 Catch:{ NumberFormatException -> 0x0037 }
        r1 = new byte[r1];	 Catch:{ NumberFormatException -> 0x0037 }
        r2 = 0;	 Catch:{ NumberFormatException -> 0x0037 }
    L_0x0028:
        r3 = r4.length;	 Catch:{ NumberFormatException -> 0x0037 }
        if (r2 >= r3) goto L_0x0036;	 Catch:{ NumberFormatException -> 0x0037 }
    L_0x002b:
        r3 = r4[r2];	 Catch:{ NumberFormatException -> 0x0037 }
        r3 = java.lang.Byte.parseByte(r3);	 Catch:{ NumberFormatException -> 0x0037 }
        r1[r2] = r3;	 Catch:{ NumberFormatException -> 0x0037 }
        r2 = r2 + 1;
        goto L_0x0028;
    L_0x0036:
        return r1;
    L_0x0037:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.a.c(java.lang.String):byte[]");
    }

    /* renamed from: b */
    private static String m9446b(String str, String str2) {
        try {
            byte[] c = C2573a.m9447c(str2);
            if (c == null) {
                str = new Object[1];
                StringBuilder stringBuilder = new StringBuilder("Invalid ciphertext: ");
                stringBuilder.append(str2);
                str[0] = stringBuilder.toString();
                ao.m9517b(str);
                return null;
            }
            str = C2573a.m9444a(2, str, c);
            if (str != null) {
                return new String(str, "UTF-8");
            }
            return null;
        } catch (Throwable e) {
            str2 = new Object[1];
            StringBuilder stringBuilder2 = new StringBuilder("Could not encode UTF8 string.\n");
            stringBuilder2.append(ao.m9513a(e));
            str2[0] = stringBuilder2.toString();
            ao.m9517b(str2);
        }
    }

    /* renamed from: a */
    private static byte[] m9444a(int r5, java.lang.String r6, byte[] r7) {
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
        r0 = "L3@nP1Vm";	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r1 = "UTF-8";	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r0 = r0.getBytes(r1);	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r1 = "__l3anplum__iv__";	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r2 = "UTF-8";	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r1 = r1.getBytes(r2);	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r2 = new javax.crypto.spec.PBEKeySpec;	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r6 = r6.toCharArray();	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r4 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r2.<init>(r6, r0, r3, r4);	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r6 = "PBEWithMD5And128BitAES-CBC-OpenSSL";	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r6 = javax.crypto.SecretKeyFactory.getInstance(r6);	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r6 = r6.generateSecret(r2);	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r6 = r6.getEncoded();	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r0 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r2 = "AES";	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r0.<init>(r6, r2);	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r6 = "AES/CBC/PKCS5Padding";	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r6 = javax.crypto.Cipher.getInstance(r6);	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r2 = new javax.crypto.spec.IvParameterSpec;	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r2.<init>(r1);	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r6.init(r5, r0, r2);	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        r5 = r6.doFinal(r7);	 Catch:{ InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045, InvalidKeyException -> 0x0045 }
        goto L_0x0046;
    L_0x0045:
        r5 = 0;
    L_0x0046:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.a.a(int, java.lang.String, byte[]):byte[]");
    }
}
