package android.support.v4.graphics;

import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;

@RequiresApi(21)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.graphics.e */
class C4019e extends C2850h {
    C4019e() {
    }

    /* renamed from: a */
    private java.io.File m15751a(android.os.ParcelFileDescriptor r4) {
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
        r3 = this;
        r0 = 0;
        r1 = new java.lang.StringBuilder;	 Catch:{ ErrnoException -> 0x002d }
        r1.<init>();	 Catch:{ ErrnoException -> 0x002d }
        r2 = "/proc/self/fd/";	 Catch:{ ErrnoException -> 0x002d }
        r1.append(r2);	 Catch:{ ErrnoException -> 0x002d }
        r4 = r4.getFd();	 Catch:{ ErrnoException -> 0x002d }
        r1.append(r4);	 Catch:{ ErrnoException -> 0x002d }
        r4 = r1.toString();	 Catch:{ ErrnoException -> 0x002d }
        r4 = android.system.Os.readlink(r4);	 Catch:{ ErrnoException -> 0x002d }
        r1 = android.system.Os.stat(r4);	 Catch:{ ErrnoException -> 0x002d }
        r1 = r1.st_mode;	 Catch:{ ErrnoException -> 0x002d }
        r1 = android.system.OsConstants.S_ISREG(r1);	 Catch:{ ErrnoException -> 0x002d }
        if (r1 == 0) goto L_0x002c;	 Catch:{ ErrnoException -> 0x002d }
    L_0x0026:
        r1 = new java.io.File;	 Catch:{ ErrnoException -> 0x002d }
        r1.<init>(r4);	 Catch:{ ErrnoException -> 0x002d }
        return r1;
    L_0x002c:
        return r0;
    L_0x002d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.e.a(android.os.ParcelFileDescriptor):java.io.File");
    }

    /* renamed from: a */
    public android.graphics.Typeface mo469a(android.content.Context r5, android.os.CancellationSignal r6, @android.support.annotation.NonNull android.support.v4.provider.FontsContractCompat.C0533b[] r7, int r8) {
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
        r4 = this;
        r0 = r7.length;
        r1 = 0;
        r2 = 1;
        if (r0 >= r2) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r7 = r4.m11266a(r7, r8);
        r8 = r5.getContentResolver();
        r7 = r7.m1958a();	 Catch:{ IOException -> 0x007b }
        r0 = "r";	 Catch:{ IOException -> 0x007b }
        r6 = r8.openFileDescriptor(r7, r0, r6);	 Catch:{ IOException -> 0x007b }
        r7 = r4.m15751a(r6);	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
        if (r7 == 0) goto L_0x002f;	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
    L_0x001e:
        r8 = r7.canRead();	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
        if (r8 != 0) goto L_0x0025;	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
    L_0x0024:
        goto L_0x002f;	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
    L_0x0025:
        r5 = android.graphics.Typeface.createFromFile(r7);	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
        if (r6 == 0) goto L_0x002e;
    L_0x002b:
        r6.close();	 Catch:{ IOException -> 0x007b }
    L_0x002e:
        return r5;
    L_0x002f:
        r7 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
        r8 = r6.getFileDescriptor();	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
        r7.<init>(r8);	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
        r5 = super.m11265a(r5, r7);	 Catch:{ Throwable -> 0x004a, all -> 0x0047 }
        if (r7 == 0) goto L_0x0041;
    L_0x003e:
        r7.close();	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
    L_0x0041:
        if (r6 == 0) goto L_0x0046;
    L_0x0043:
        r6.close();	 Catch:{ IOException -> 0x007b }
    L_0x0046:
        return r5;
    L_0x0047:
        r5 = move-exception;
        r8 = r1;
        goto L_0x0050;
    L_0x004a:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x004c }
    L_0x004c:
        r8 = move-exception;
        r3 = r8;
        r8 = r5;
        r5 = r3;
    L_0x0050:
        if (r7 == 0) goto L_0x0060;
    L_0x0052:
        if (r8 == 0) goto L_0x005d;
    L_0x0054:
        r7.close();	 Catch:{ Throwable -> 0x0058, all -> 0x0061 }
        goto L_0x0060;
    L_0x0058:
        r7 = move-exception;
        r8.addSuppressed(r7);	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
        goto L_0x0060;	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
    L_0x005d:
        r7.close();	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
    L_0x0060:
        throw r5;	 Catch:{ Throwable -> 0x0064, all -> 0x0061 }
    L_0x0061:
        r5 = move-exception;
        r7 = r1;
        goto L_0x006a;
    L_0x0064:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0066 }
    L_0x0066:
        r7 = move-exception;
        r3 = r7;
        r7 = r5;
        r5 = r3;
    L_0x006a:
        if (r6 == 0) goto L_0x007a;
    L_0x006c:
        if (r7 == 0) goto L_0x0077;
    L_0x006e:
        r6.close();	 Catch:{ Throwable -> 0x0072 }
        goto L_0x007a;
    L_0x0072:
        r6 = move-exception;
        r7.addSuppressed(r6);	 Catch:{ IOException -> 0x007b }
        goto L_0x007a;	 Catch:{ IOException -> 0x007b }
    L_0x0077:
        r6.close();	 Catch:{ IOException -> 0x007b }
    L_0x007a:
        throw r5;	 Catch:{ IOException -> 0x007b }
    L_0x007b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.e.a(android.content.Context, android.os.CancellationSignal, android.support.v4.provider.FontsContractCompat$b[], int):android.graphics.Typeface");
    }
}
