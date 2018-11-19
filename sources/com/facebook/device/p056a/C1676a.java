package com.facebook.device.p056a;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.facebook.device.a.a */
public class C1676a {
    /* renamed from: a */
    private static final FileFilter f4601a = new C16751();

    /* renamed from: com.facebook.device.a.a$1 */
    static class C16751 implements FileFilter {
        C16751() {
        }

        public boolean accept(File file) {
            file = file.getName();
            if (!file.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < file.length(); i++) {
                if (!Character.isDigit(file.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static int m5665a() {
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
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 10;
        if (r0 > r1) goto L_0x0008;
    L_0x0006:
        r0 = 1;
        return r0;
    L_0x0008:
        r0 = -1;
        r1 = "/sys/devices/system/cpu/possible";	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
        r1 = com.facebook.device.p056a.C1676a.m5671b(r1);	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
        if (r1 != r0) goto L_0x0017;	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
    L_0x0011:
        r1 = "/sys/devices/system/cpu/present";	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
        r1 = com.facebook.device.p056a.C1676a.m5671b(r1);	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
    L_0x0017:
        if (r1 != r0) goto L_0x001d;	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
    L_0x0019:
        r1 = com.facebook.device.p056a.C1676a.m5672c();	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
    L_0x001d:
        r0 = r1;
    L_0x001e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.device.a.a.a():int");
    }

    /* renamed from: b */
    private static int m5671b(java.lang.String r2) {
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
        r0 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x001b }
        r0.<init>(r2);	 Catch:{ IOException -> 0x001b }
        r2 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x001b }
        r1 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x001b }
        r1.<init>(r0);	 Catch:{ IOException -> 0x001b }
        r2.<init>(r1);	 Catch:{ IOException -> 0x001b }
        r0 = r2.readLine();	 Catch:{ IOException -> 0x001b }
        r2.close();	 Catch:{ IOException -> 0x001b }
        r2 = com.facebook.device.p056a.C1676a.m5666a(r0);	 Catch:{ IOException -> 0x001b }
        return r2;
    L_0x001b:
        r2 = -1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.device.a.a.b(java.lang.String):int");
    }

    /* renamed from: a */
    static int m5666a(String str) {
        if (str != null) {
            if (str.matches("0-[\\d]+$")) {
                return Integer.valueOf(str.substring(2)).intValue() + 1;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static int m5672c() {
        return new File("/sys/devices/system/cpu/").listFiles(f4601a).length;
    }

    /* renamed from: b */
    public static int m5670b() {
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
        r0 = 0;
        r1 = -1;
        r2 = 0;
        r3 = -1;
    L_0x0004:
        r4 = com.facebook.device.p056a.C1676a.m5665a();	 Catch:{ IOException -> 0x008a }
        if (r2 >= r4) goto L_0x006a;	 Catch:{ IOException -> 0x008a }
    L_0x000a:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x008a }
        r4.<init>();	 Catch:{ IOException -> 0x008a }
        r5 = "/sys/devices/system/cpu/cpu";	 Catch:{ IOException -> 0x008a }
        r4.append(r5);	 Catch:{ IOException -> 0x008a }
        r4.append(r2);	 Catch:{ IOException -> 0x008a }
        r5 = "/cpufreq/cpuinfo_max_freq";	 Catch:{ IOException -> 0x008a }
        r4.append(r5);	 Catch:{ IOException -> 0x008a }
        r4 = r4.toString();	 Catch:{ IOException -> 0x008a }
        r5 = new java.io.File;	 Catch:{ IOException -> 0x008a }
        r5.<init>(r4);	 Catch:{ IOException -> 0x008a }
        r4 = r5.exists();	 Catch:{ IOException -> 0x008a }
        if (r4 == 0) goto L_0x0067;	 Catch:{ IOException -> 0x008a }
    L_0x002b:
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ IOException -> 0x008a }
        r4 = new byte[r4];	 Catch:{ IOException -> 0x008a }
        r6 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x008a }
        r6.<init>(r5);	 Catch:{ IOException -> 0x008a }
        r6.read(r4);	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        r5 = 0;	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
    L_0x0038:
        r7 = r4[r5];	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        r7 = java.lang.Character.isDigit(r7);	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        if (r7 == 0) goto L_0x0046;	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
    L_0x0040:
        r7 = r4.length;	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        if (r5 >= r7) goto L_0x0046;	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
    L_0x0043:
        r5 = r5 + 1;	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        goto L_0x0038;	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
    L_0x0046:
        r7 = new java.lang.String;	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        r7.<init>(r4, r0, r5);	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        r4 = java.lang.Integer.parseInt(r7);	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        r5 = r4.intValue();	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        if (r5 <= r3) goto L_0x005e;	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
    L_0x0059:
        r4 = r4.intValue();	 Catch:{ NumberFormatException -> 0x005e, all -> 0x0062 }
        r3 = r4;
    L_0x005e:
        r6.close();	 Catch:{ IOException -> 0x008a }
        goto L_0x0067;	 Catch:{ IOException -> 0x008a }
    L_0x0062:
        r0 = move-exception;	 Catch:{ IOException -> 0x008a }
        r6.close();	 Catch:{ IOException -> 0x008a }
        throw r0;	 Catch:{ IOException -> 0x008a }
    L_0x0067:
        r2 = r2 + 1;	 Catch:{ IOException -> 0x008a }
        goto L_0x0004;	 Catch:{ IOException -> 0x008a }
    L_0x006a:
        if (r3 != r1) goto L_0x0089;	 Catch:{ IOException -> 0x008a }
    L_0x006c:
        r0 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x008a }
        r2 = "/proc/cpuinfo";	 Catch:{ IOException -> 0x008a }
        r0.<init>(r2);	 Catch:{ IOException -> 0x008a }
        r2 = "cpu MHz";	 Catch:{ all -> 0x0084 }
        r2 = com.facebook.device.p056a.C1676a.m5667a(r2, r0);	 Catch:{ all -> 0x0084 }
        r2 = r2 * 1000;
        if (r2 <= r3) goto L_0x007e;
    L_0x007d:
        goto L_0x007f;
    L_0x007e:
        r2 = r3;
    L_0x007f:
        r0.close();	 Catch:{ IOException -> 0x008a }
        r1 = r2;	 Catch:{ IOException -> 0x008a }
        goto L_0x008a;	 Catch:{ IOException -> 0x008a }
    L_0x0084:
        r2 = move-exception;	 Catch:{ IOException -> 0x008a }
        r0.close();	 Catch:{ IOException -> 0x008a }
        throw r2;	 Catch:{ IOException -> 0x008a }
    L_0x0089:
        r1 = r3;
    L_0x008a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.device.a.a.b():int");
    }

    @android.annotation.TargetApi(16)
    /* renamed from: a */
    public static long m5669a(android.content.Context r4) {
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
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = -1;
        r3 = 16;
        if (r0 < r3) goto L_0x001e;
    L_0x0008:
        r0 = new android.app.ActivityManager$MemoryInfo;
        r0.<init>();
        r3 = "activity";
        r4 = r4.getSystemService(r3);
        r4 = (android.app.ActivityManager) r4;
        r4.getMemoryInfo(r0);
        if (r0 == 0) goto L_0x001d;
    L_0x001a:
        r0 = r0.totalMem;
        return r0;
    L_0x001d:
        return r1;
    L_0x001e:
        r4 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0039 }
        r0 = "/proc/meminfo";	 Catch:{ IOException -> 0x0039 }
        r4.<init>(r0);	 Catch:{ IOException -> 0x0039 }
        r0 = "MemTotal";	 Catch:{ all -> 0x0034 }
        r0 = com.facebook.device.p056a.C1676a.m5667a(r0, r4);	 Catch:{ all -> 0x0034 }
        r0 = (long) r0;
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r1 = r0 * r2;
        r4.close();	 Catch:{ IOException -> 0x0039 }
        goto L_0x0039;	 Catch:{ IOException -> 0x0039 }
    L_0x0034:
        r0 = move-exception;	 Catch:{ IOException -> 0x0039 }
        r4.close();	 Catch:{ IOException -> 0x0039 }
        throw r0;	 Catch:{ IOException -> 0x0039 }
    L_0x0039:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.device.a.a.a(android.content.Context):long");
    }

    /* renamed from: a */
    private static int m5667a(java.lang.String r6, java.io.FileInputStream r7) {
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
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r0 = new byte[r0];
        r7 = r7.read(r0);	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
        r1 = 0;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x0009:
        if (r1 >= r7) goto L_0x003a;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x000b:
        r2 = r0[r1];	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
        r3 = 10;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
        if (r2 == r3) goto L_0x0013;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x0011:
        if (r1 != 0) goto L_0x0037;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x0013:
        r2 = r0[r1];	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
        if (r2 != r3) goto L_0x0019;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x0017:
        r1 = r1 + 1;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x0019:
        r2 = r1;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x001a:
        if (r2 >= r7) goto L_0x0037;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x001c:
        r3 = r2 - r1;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
        r4 = r0[r2];	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
        r5 = r6.charAt(r3);	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
        if (r4 == r5) goto L_0x0027;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x0026:
        goto L_0x0037;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x0027:
        r4 = r6.length();	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
        r4 = r4 + -1;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
        if (r3 != r4) goto L_0x0034;	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
    L_0x002f:
        r6 = com.facebook.device.p056a.C1676a.m5668a(r0, r2);	 Catch:{ IOException -> 0x003a, IOException -> 0x003a }
        return r6;
    L_0x0034:
        r2 = r2 + 1;
        goto L_0x001a;
    L_0x0037:
        r1 = r1 + 1;
        goto L_0x0009;
    L_0x003a:
        r6 = -1;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.device.a.a.a(java.lang.String, java.io.FileInputStream):int");
    }

    /* renamed from: a */
    private static int m5668a(byte[] bArr, int i) {
        while (i < bArr.length && bArr[i] != (byte) 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }
}
