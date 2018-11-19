package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.tinder.api.ManagerWebServices;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* renamed from: com.facebook.internal.s */
public final class C1741s {
    /* renamed from: a */
    private static final String f4811a = "com.facebook.internal.s";
    /* renamed from: b */
    private static File f4812b;

    /* renamed from: com.facebook.internal.s$a */
    public static final class C1740a {
        /* renamed from: a */
        private final UUID f4804a;
        /* renamed from: b */
        private final String f4805b;
        /* renamed from: c */
        private final String f4806c;
        /* renamed from: d */
        private Bitmap f4807d;
        /* renamed from: e */
        private Uri f4808e;
        /* renamed from: f */
        private boolean f4809f;
        /* renamed from: g */
        private boolean f4810g;

        private C1740a(UUID uuid, Bitmap bitmap, Uri uri) {
            this.f4804a = uuid;
            this.f4807d = bitmap;
            this.f4808e = uri;
            boolean z = true;
            if (uri != null) {
                bitmap = uri.getScheme();
                if ("content".equalsIgnoreCase(bitmap)) {
                    this.f4809f = true;
                    if (uri.getAuthority() == null || uri.getAuthority().startsWith(ManagerWebServices.PARAM_MEDIA) != null) {
                        z = false;
                    }
                    this.f4810g = z;
                } else if (ManagerWebServices.PARAM_FILE.equalsIgnoreCase(uri.getScheme())) {
                    this.f4810g = true;
                } else if (Utility.m5794b(uri) == null) {
                    uri = new StringBuilder();
                    uri.append("Unsupported scheme for media Uri : ");
                    uri.append(bitmap);
                    throw new FacebookException(uri.toString());
                }
            } else if (bitmap != null) {
                this.f4810g = true;
            } else {
                throw new FacebookException("Cannot share media without a bitmap or Uri set");
            }
            this.f4806c = this.f4810g == null ? null : UUID.randomUUID().toString();
            if (this.f4810g == null) {
                uuid = this.f4808e.toString();
            } else {
                uuid = FacebookContentProvider.m3973a(FacebookSdk.m3998i(), uuid, this.f4806c);
            }
            this.f4805b = uuid;
        }

        /* renamed from: a */
        public String m5995a() {
            return this.f4805b;
        }
    }

    private C1741s() {
    }

    /* renamed from: a */
    public static C1740a m5996a(UUID uuid, Bitmap bitmap) {
        C1749x.m6064a((Object) uuid, "callId");
        C1749x.m6064a((Object) bitmap, "attachmentBitmap");
        return new C1740a(uuid, bitmap, null);
    }

    /* renamed from: a */
    public static C1740a m5997a(UUID uuid, Uri uri) {
        C1749x.m6064a((Object) uuid, "callId");
        C1749x.m6064a((Object) uri, "attachmentUri");
        return new C1740a(uuid, null, uri);
    }

    /* renamed from: a */
    private static void m6002a(Bitmap bitmap, File file) throws IOException {
        Closeable fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            Utility.m5774a(fileOutputStream);
        }
    }

    /* renamed from: a */
    private static void m6003a(Uri uri, boolean z, File file) throws IOException {
        InputStream openInputStream;
        Closeable fileOutputStream = new FileOutputStream(file);
        if (z) {
            openInputStream = FacebookSdk.m3994e().getContentResolver().openInputStream(uri);
        } else {
            try {
                openInputStream = new FileInputStream(uri.getPath());
            } catch (Throwable th) {
                Utility.m5774a(fileOutputStream);
            }
        }
        Utility.m5748a(openInputStream, (OutputStream) fileOutputStream);
        Utility.m5774a(fileOutputStream);
    }

    /* renamed from: a */
    public static void m6004a(java.util.Collection<com.facebook.internal.C1741s.C1740a> r5) {
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
        if (r5 == 0) goto L_0x0092;
    L_0x0002:
        r0 = r5.size();
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        goto L_0x0092;
    L_0x000a:
        r0 = f4812b;
        if (r0 != 0) goto L_0x0011;
    L_0x000e:
        com.facebook.internal.C1741s.m6007c();
    L_0x0011:
        com.facebook.internal.C1741s.m6006b();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r5 = r5.iterator();	 Catch:{ IOException -> 0x0061 }
    L_0x001d:
        r1 = r5.hasNext();	 Catch:{ IOException -> 0x0061 }
        if (r1 == 0) goto L_0x0060;	 Catch:{ IOException -> 0x0061 }
    L_0x0023:
        r1 = r5.next();	 Catch:{ IOException -> 0x0061 }
        r1 = (com.facebook.internal.C1741s.C1740a) r1;	 Catch:{ IOException -> 0x0061 }
        r2 = r1.f4810g;	 Catch:{ IOException -> 0x0061 }
        if (r2 != 0) goto L_0x0030;	 Catch:{ IOException -> 0x0061 }
    L_0x002f:
        goto L_0x001d;	 Catch:{ IOException -> 0x0061 }
    L_0x0030:
        r2 = r1.f4804a;	 Catch:{ IOException -> 0x0061 }
        r3 = r1.f4806c;	 Catch:{ IOException -> 0x0061 }
        r4 = 1;	 Catch:{ IOException -> 0x0061 }
        r2 = com.facebook.internal.C1741s.m6000a(r2, r3, r4);	 Catch:{ IOException -> 0x0061 }
        r0.add(r2);	 Catch:{ IOException -> 0x0061 }
        r3 = r1.f4807d;	 Catch:{ IOException -> 0x0061 }
        if (r3 == 0) goto L_0x004e;	 Catch:{ IOException -> 0x0061 }
    L_0x0046:
        r1 = r1.f4807d;	 Catch:{ IOException -> 0x0061 }
        com.facebook.internal.C1741s.m6002a(r1, r2);	 Catch:{ IOException -> 0x0061 }
        goto L_0x001d;	 Catch:{ IOException -> 0x0061 }
    L_0x004e:
        r3 = r1.f4808e;	 Catch:{ IOException -> 0x0061 }
        if (r3 == 0) goto L_0x001d;	 Catch:{ IOException -> 0x0061 }
    L_0x0054:
        r3 = r1.f4808e;	 Catch:{ IOException -> 0x0061 }
        r1 = r1.f4809f;	 Catch:{ IOException -> 0x0061 }
        com.facebook.internal.C1741s.m6003a(r3, r1, r2);	 Catch:{ IOException -> 0x0061 }
        goto L_0x001d;
    L_0x0060:
        return;
    L_0x0061:
        r5 = move-exception;
        r1 = f4811a;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Got unexpected exception:";
        r2.append(r3);
        r2.append(r5);
        r2 = r2.toString();
        android.util.Log.e(r1, r2);
        r0 = r0.iterator();
    L_0x007c:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x008c;
    L_0x0082:
        r1 = r0.next();
        r1 = (java.io.File) r1;
        r1.delete();	 Catch:{ Exception -> 0x007c }
        goto L_0x007c;
    L_0x008c:
        r0 = new com.facebook.FacebookException;
        r0.<init>(r5);
        throw r0;
    L_0x0092:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.s.a(java.util.Collection):void");
    }

    /* renamed from: a */
    public static void m6005a(UUID uuid) {
        File a = C1741s.m6001a(uuid, false);
        if (a != null) {
            Utility.m5775a(a);
        }
    }

    /* renamed from: a */
    public static java.io.File m5999a(java.util.UUID r1, java.lang.String r2) throws java.io.FileNotFoundException {
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
        r0 = com.facebook.internal.Utility.m5785a(r2);
        if (r0 != 0) goto L_0x0015;
    L_0x0006:
        if (r1 != 0) goto L_0x0009;
    L_0x0008:
        goto L_0x0015;
    L_0x0009:
        r0 = 0;
        r1 = com.facebook.internal.C1741s.m6000a(r1, r2, r0);	 Catch:{ IOException -> 0x000f }
        return r1;
    L_0x000f:
        r1 = new java.io.FileNotFoundException;
        r1.<init>();
        throw r1;
    L_0x0015:
        r1 = new java.io.FileNotFoundException;
        r1.<init>();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.s.a(java.util.UUID, java.lang.String):java.io.File");
    }

    /* renamed from: a */
    static synchronized File m5998a() {
        File file;
        synchronized (C1741s.class) {
            if (f4812b == null) {
                f4812b = new File(FacebookSdk.m3994e().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f4812b;
        }
        return file;
    }

    /* renamed from: b */
    static File m6006b() {
        File a = C1741s.m5998a();
        a.mkdirs();
        return a;
    }

    /* renamed from: a */
    static File m6001a(UUID uuid, boolean z) {
        if (f4812b == null) {
            return null;
        }
        File file = new File(f4812b, uuid.toString());
        if (z && file.exists() == null) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    static java.io.File m6000a(java.util.UUID r2, java.lang.String r3, boolean r4) throws java.io.IOException {
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
        r2 = com.facebook.internal.C1741s.m6001a(r2, r4);
        r4 = 0;
        if (r2 != 0) goto L_0x0008;
    L_0x0007:
        return r4;
    L_0x0008:
        r0 = new java.io.File;	 Catch:{ UnsupportedEncodingException -> 0x0014 }
        r1 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0014 }
        r3 = java.net.URLEncoder.encode(r3, r1);	 Catch:{ UnsupportedEncodingException -> 0x0014 }
        r0.<init>(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x0014 }
        return r0;
    L_0x0014:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.s.a(java.util.UUID, java.lang.String, boolean):java.io.File");
    }

    /* renamed from: c */
    public static void m6007c() {
        Utility.m5775a(C1741s.m5998a());
    }
}
