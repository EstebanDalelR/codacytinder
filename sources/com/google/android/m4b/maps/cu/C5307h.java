package com.google.android.m4b.maps.cu;

/* renamed from: com.google.android.m4b.maps.cu.h */
public final class C5307h {
    /* renamed from: a */
    public static <T extends C5306g> String m23537a(T t) {
        String str;
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            C5307h.m23539a(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (T t2) {
            str = "Error printing proto: ";
            t2 = String.valueOf(t2.getMessage());
            return t2.length() != 0 ? str.concat(t2) : new String(str);
        } catch (T t22) {
            str = "Error printing proto: ";
            t22 = String.valueOf(t22.getMessage());
            return t22.length() != 0 ? str.concat(t22) : new String(str);
        }
    }

    /* renamed from: a */
    private static void m23539a(java.lang.String r11, java.lang.Object r12, java.lang.StringBuffer r13, java.lang.StringBuffer r14) {
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
        if (r12 == 0) goto L_0x0163;
    L_0x0002:
        r0 = r12 instanceof com.google.android.m4b.maps.cu.C5306g;
        r1 = 0;
        if (r0 == 0) goto L_0x010c;
    L_0x0007:
        r0 = r13.length();
        if (r11 == 0) goto L_0x0021;
    L_0x000d:
        r14.append(r13);
        r2 = com.google.android.m4b.maps.cu.C5307h.m23538a(r11);
        r14.append(r2);
        r2 = " <\n";
        r14.append(r2);
        r2 = "  ";
        r13.append(r2);
    L_0x0021:
        r2 = r12.getClass();
        r3 = r2.getFields();
        r4 = r3.length;
        r5 = 0;
    L_0x002b:
        if (r5 >= r4) goto L_0x008f;
    L_0x002d:
        r6 = r3[r5];
        r7 = r6.getModifiers();
        r8 = r6.getName();
        r9 = "cachedSize";
        r9 = r9.equals(r8);
        if (r9 != 0) goto L_0x008c;
    L_0x003f:
        r9 = r7 & 1;
        r10 = 1;
        if (r9 != r10) goto L_0x008c;
    L_0x0044:
        r7 = r7 & 8;
        r9 = 8;
        if (r7 == r9) goto L_0x008c;
    L_0x004a:
        r7 = "_";
        r7 = r8.startsWith(r7);
        if (r7 != 0) goto L_0x008c;
    L_0x0052:
        r7 = "_";
        r7 = r8.endsWith(r7);
        if (r7 != 0) goto L_0x008c;
    L_0x005a:
        r7 = r6.getType();
        r6 = r6.get(r12);
        r9 = r7.isArray();
        if (r9 == 0) goto L_0x0089;
    L_0x0068:
        r7 = r7.getComponentType();
        r9 = java.lang.Byte.TYPE;
        if (r7 != r9) goto L_0x0074;
    L_0x0070:
        com.google.android.m4b.maps.cu.C5307h.m23539a(r8, r6, r13, r14);
        goto L_0x008c;
    L_0x0074:
        if (r6 != 0) goto L_0x0078;
    L_0x0076:
        r7 = 0;
        goto L_0x007c;
    L_0x0078:
        r7 = java.lang.reflect.Array.getLength(r6);
    L_0x007c:
        r9 = 0;
    L_0x007d:
        if (r9 >= r7) goto L_0x008c;
    L_0x007f:
        r10 = java.lang.reflect.Array.get(r6, r9);
        com.google.android.m4b.maps.cu.C5307h.m23539a(r8, r10, r13, r14);
        r9 = r9 + 1;
        goto L_0x007d;
    L_0x0089:
        com.google.android.m4b.maps.cu.C5307h.m23539a(r8, r6, r13, r14);
    L_0x008c:
        r5 = r5 + 1;
        goto L_0x002b;
    L_0x008f:
        r3 = r2.getMethods();
        r4 = r3.length;
        r5 = 0;
    L_0x0095:
        if (r5 >= r4) goto L_0x00fe;
    L_0x0097:
        r6 = r3[r5];
        r6 = r6.getName();
        r7 = "set";
        r7 = r6.startsWith(r7);
        if (r7 == 0) goto L_0x00fb;
    L_0x00a5:
        r7 = 3;
        r6 = r6.substring(r7);
        r7 = "has";	 Catch:{ NoSuchMethodException -> 0x00fb }
        r8 = java.lang.String.valueOf(r6);	 Catch:{ NoSuchMethodException -> 0x00fb }
        r9 = r8.length();	 Catch:{ NoSuchMethodException -> 0x00fb }
        if (r9 == 0) goto L_0x00bb;	 Catch:{ NoSuchMethodException -> 0x00fb }
    L_0x00b6:
        r7 = r7.concat(r8);	 Catch:{ NoSuchMethodException -> 0x00fb }
        goto L_0x00c1;	 Catch:{ NoSuchMethodException -> 0x00fb }
    L_0x00bb:
        r8 = new java.lang.String;	 Catch:{ NoSuchMethodException -> 0x00fb }
        r8.<init>(r7);	 Catch:{ NoSuchMethodException -> 0x00fb }
        r7 = r8;	 Catch:{ NoSuchMethodException -> 0x00fb }
    L_0x00c1:
        r8 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x00fb }
        r7 = r2.getMethod(r7, r8);	 Catch:{ NoSuchMethodException -> 0x00fb }
        r8 = new java.lang.Object[r1];
        r7 = r7.invoke(r12, r8);
        r7 = (java.lang.Boolean) r7;
        r7 = r7.booleanValue();
        if (r7 == 0) goto L_0x00fb;
    L_0x00d5:
        r7 = "get";	 Catch:{ NoSuchMethodException -> 0x00fb }
        r8 = java.lang.String.valueOf(r6);	 Catch:{ NoSuchMethodException -> 0x00fb }
        r9 = r8.length();	 Catch:{ NoSuchMethodException -> 0x00fb }
        if (r9 == 0) goto L_0x00e6;	 Catch:{ NoSuchMethodException -> 0x00fb }
    L_0x00e1:
        r7 = r7.concat(r8);	 Catch:{ NoSuchMethodException -> 0x00fb }
        goto L_0x00ec;	 Catch:{ NoSuchMethodException -> 0x00fb }
    L_0x00e6:
        r8 = new java.lang.String;	 Catch:{ NoSuchMethodException -> 0x00fb }
        r8.<init>(r7);	 Catch:{ NoSuchMethodException -> 0x00fb }
        r7 = r8;	 Catch:{ NoSuchMethodException -> 0x00fb }
    L_0x00ec:
        r8 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x00fb }
        r7 = r2.getMethod(r7, r8);	 Catch:{ NoSuchMethodException -> 0x00fb }
        r8 = new java.lang.Object[r1];
        r7 = r7.invoke(r12, r8);
        com.google.android.m4b.maps.cu.C5307h.m23539a(r6, r7, r13, r14);
    L_0x00fb:
        r5 = r5 + 1;
        goto L_0x0095;
    L_0x00fe:
        if (r11 == 0) goto L_0x010b;
    L_0x0100:
        r13.setLength(r0);
        r14.append(r13);
        r11 = ">\n";
        r14.append(r11);
    L_0x010b:
        return;
    L_0x010c:
        r11 = com.google.android.m4b.maps.cu.C5307h.m23538a(r11);
        r14.append(r13);
        r14.append(r11);
        r11 = ": ";
        r14.append(r11);
        r11 = r12 instanceof java.lang.String;
        if (r11 == 0) goto L_0x0151;
    L_0x011f:
        r12 = (java.lang.String) r12;
        r11 = "http";
        r11 = r12.startsWith(r11);
        if (r11 != 0) goto L_0x013f;
    L_0x0129:
        r11 = r12.length();
        r13 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r11 <= r13) goto L_0x013f;
    L_0x0131:
        r11 = r12.substring(r1, r13);
        r11 = java.lang.String.valueOf(r11);
        r12 = "[...]";
        r12 = r11.concat(r12);
    L_0x013f:
        r11 = com.google.android.m4b.maps.cu.C5307h.m23541b(r12);
        r12 = "\"";
        r14.append(r12);
        r14.append(r11);
        r11 = "\"";
        r14.append(r11);
        goto L_0x015e;
    L_0x0151:
        r11 = r12 instanceof byte[];
        if (r11 == 0) goto L_0x015b;
    L_0x0155:
        r12 = (byte[]) r12;
        com.google.android.m4b.maps.cu.C5307h.m23540a(r12, r14);
        goto L_0x015e;
    L_0x015b:
        r14.append(r12);
    L_0x015e:
        r11 = "\n";
        r14.append(r11);
    L_0x0163:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cu.h.a(java.lang.String, java.lang.Object, java.lang.StringBuffer, java.lang.StringBuffer):void");
    }

    /* renamed from: a */
    private static String m23538a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private static String m23541b(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static void m23540a(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b : bArr) {
            int i = b & 255;
            if (i != 92) {
                if (i != 34) {
                    if (i < 32 || i >= 127) {
                        stringBuffer.append(String.format("\\%03o", new Object[]{Integer.valueOf(i)}));
                    } else {
                        stringBuffer.append((char) i);
                    }
                }
            }
            stringBuffer.append('\\');
            stringBuffer.append((char) i);
        }
        stringBuffer.append('\"');
    }
}
