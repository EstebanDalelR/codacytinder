package android.support.v4.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.annotation.GuardedBy;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.VisibleForTesting;
import android.support.v4.content.res.FontResourcesParserCompat;
import android.support.v4.graphics.C0455i;
import android.support.v4.provider.SelfDestructiveThread.ReplyCallback;
import android.support.v4.util.C0551g;
import android.support.v4.util.C0561l;
import android.support.v4.util.C0562m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FontsContractCompat {
    /* renamed from: a */
    private static final C0551g<String, Typeface> f1642a = new C0551g(16);
    /* renamed from: b */
    private static final SelfDestructiveThread f1643b = new SelfDestructiveThread("fonts", 10, 10000);
    /* renamed from: c */
    private static final Object f1644c = new Object();
    @GuardedBy("sLock")
    /* renamed from: d */
    private static final C0562m<String, ArrayList<ReplyCallback<C0534c>>> f1645d = new C0562m();
    /* renamed from: e */
    private static final Comparator<byte[]> f1646e = new C05314();

    /* renamed from: android.support.v4.provider.FontsContractCompat$4 */
    static class C05314 implements Comparator<byte[]> {
        C05314() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m1955a((byte[]) obj, (byte[]) obj2);
        }

        /* renamed from: a */
        public int m1955a(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return bArr[i] - bArr2[i];
                }
            }
            return 0;
        }
    }

    public static class FontRequestCallback {

        @RestrictTo({Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }
    }

    /* renamed from: android.support.v4.provider.FontsContractCompat$a */
    public static class C0532a {
        /* renamed from: a */
        private final int f1633a;
        /* renamed from: b */
        private final C0533b[] f1634b;

        @RestrictTo({Scope.LIBRARY_GROUP})
        public C0532a(int i, @Nullable C0533b[] c0533bArr) {
            this.f1633a = i;
            this.f1634b = c0533bArr;
        }

        /* renamed from: a */
        public int m1956a() {
            return this.f1633a;
        }

        /* renamed from: b */
        public C0533b[] m1957b() {
            return this.f1634b;
        }
    }

    /* renamed from: android.support.v4.provider.FontsContractCompat$b */
    public static class C0533b {
        /* renamed from: a */
        private final Uri f1635a;
        /* renamed from: b */
        private final int f1636b;
        /* renamed from: c */
        private final int f1637c;
        /* renamed from: d */
        private final boolean f1638d;
        /* renamed from: e */
        private final int f1639e;

        @RestrictTo({Scope.LIBRARY_GROUP})
        public C0533b(@NonNull Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, to = 1000) int i2, boolean z, int i3) {
            this.f1635a = (Uri) C0561l.m2061a(uri);
            this.f1636b = i;
            this.f1637c = i2;
            this.f1638d = z;
            this.f1639e = i3;
        }

        @NonNull
        /* renamed from: a */
        public Uri m1958a() {
            return this.f1635a;
        }

        @IntRange(from = 0)
        /* renamed from: b */
        public int m1959b() {
            return this.f1636b;
        }

        @IntRange(from = 1, to = 1000)
        /* renamed from: c */
        public int m1960c() {
            return this.f1637c;
        }

        /* renamed from: d */
        public boolean m1961d() {
            return this.f1638d;
        }

        /* renamed from: e */
        public int m1962e() {
            return this.f1639e;
        }
    }

    /* renamed from: android.support.v4.provider.FontsContractCompat$c */
    private static final class C0534c {
        /* renamed from: a */
        final Typeface f1640a;
        /* renamed from: b */
        final int f1641b;

        C0534c(@Nullable Typeface typeface, int i) {
            this.f1640a = typeface;
            this.f1641b = i;
        }
    }

    @android.support.annotation.VisibleForTesting
    @android.support.annotation.NonNull
    /* renamed from: a */
    static android.support.v4.provider.FontsContractCompat.C0533b[] m1972a(android.content.Context r21, android.support.v4.provider.C0539a r22, java.lang.String r23, android.os.CancellationSignal r24) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0116 in list [B:8:0x008f]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
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
        r1 = r23;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = new android.net.Uri$Builder;
        r3.<init>();
        r4 = "content";
        r3 = r3.scheme(r4);
        r3 = r3.authority(r1);
        r3 = r3.build();
        r4 = new android.net.Uri$Builder;
        r4.<init>();
        r5 = "content";
        r4 = r4.scheme(r5);
        r1 = r4.authority(r1);
        r4 = "file";
        r1 = r1.appendPath(r4);
        r1 = r1.build();
        r11 = 0;
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0124 }
        r5 = 16;	 Catch:{ all -> 0x0124 }
        r12 = 1;	 Catch:{ all -> 0x0124 }
        r13 = 0;	 Catch:{ all -> 0x0124 }
        if (r4 <= r5) goto L_0x0066;	 Catch:{ all -> 0x0124 }
    L_0x003c:
        r4 = r21.getContentResolver();	 Catch:{ all -> 0x0124 }
        r14 = "_id";	 Catch:{ all -> 0x0124 }
        r15 = "file_id";	 Catch:{ all -> 0x0124 }
        r16 = "font_ttc_index";	 Catch:{ all -> 0x0124 }
        r17 = "font_variation_settings";	 Catch:{ all -> 0x0124 }
        r18 = "font_weight";	 Catch:{ all -> 0x0124 }
        r19 = "font_italic";	 Catch:{ all -> 0x0124 }
        r20 = "result_code";	 Catch:{ all -> 0x0124 }
        r6 = new java.lang.String[]{r14, r15, r16, r17, r18, r19, r20};	 Catch:{ all -> 0x0124 }
        r7 = "query = ?";	 Catch:{ all -> 0x0124 }
        r8 = new java.lang.String[r12];	 Catch:{ all -> 0x0124 }
        r5 = r22.m1985c();	 Catch:{ all -> 0x0124 }
        r8[r13] = r5;	 Catch:{ all -> 0x0124 }
        r9 = 0;	 Catch:{ all -> 0x0124 }
        r5 = r3;	 Catch:{ all -> 0x0124 }
        r10 = r24;	 Catch:{ all -> 0x0124 }
        r4 = r4.query(r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0124 }
    L_0x0064:
        r11 = r4;	 Catch:{ all -> 0x0124 }
        goto L_0x008d;	 Catch:{ all -> 0x0124 }
    L_0x0066:
        r4 = r21.getContentResolver();	 Catch:{ all -> 0x0124 }
        r14 = "_id";	 Catch:{ all -> 0x0124 }
        r15 = "file_id";	 Catch:{ all -> 0x0124 }
        r16 = "font_ttc_index";	 Catch:{ all -> 0x0124 }
        r17 = "font_variation_settings";	 Catch:{ all -> 0x0124 }
        r18 = "font_weight";	 Catch:{ all -> 0x0124 }
        r19 = "font_italic";	 Catch:{ all -> 0x0124 }
        r20 = "result_code";	 Catch:{ all -> 0x0124 }
        r6 = new java.lang.String[]{r14, r15, r16, r17, r18, r19, r20};	 Catch:{ all -> 0x0124 }
        r7 = "query = ?";	 Catch:{ all -> 0x0124 }
        r8 = new java.lang.String[r12];	 Catch:{ all -> 0x0124 }
        r5 = r22.m1985c();	 Catch:{ all -> 0x0124 }
        r8[r13] = r5;	 Catch:{ all -> 0x0124 }
        r9 = 0;	 Catch:{ all -> 0x0124 }
        r5 = r3;	 Catch:{ all -> 0x0124 }
        r4 = r4.query(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0124 }
        goto L_0x0064;	 Catch:{ all -> 0x0124 }
    L_0x008d:
        if (r11 == 0) goto L_0x0116;	 Catch:{ all -> 0x0124 }
    L_0x008f:
        r4 = r11.getCount();	 Catch:{ all -> 0x0124 }
        if (r4 <= 0) goto L_0x0116;	 Catch:{ all -> 0x0124 }
    L_0x0095:
        r2 = "result_code";	 Catch:{ all -> 0x0124 }
        r2 = r11.getColumnIndex(r2);	 Catch:{ all -> 0x0124 }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0124 }
        r4.<init>();	 Catch:{ all -> 0x0124 }
        r5 = "_id";	 Catch:{ all -> 0x0124 }
        r5 = r11.getColumnIndex(r5);	 Catch:{ all -> 0x0124 }
        r6 = "file_id";	 Catch:{ all -> 0x0124 }
        r6 = r11.getColumnIndex(r6);	 Catch:{ all -> 0x0124 }
        r7 = "font_ttc_index";	 Catch:{ all -> 0x0124 }
        r7 = r11.getColumnIndex(r7);	 Catch:{ all -> 0x0124 }
        r8 = "font_weight";	 Catch:{ all -> 0x0124 }
        r8 = r11.getColumnIndex(r8);	 Catch:{ all -> 0x0124 }
        r9 = "font_italic";	 Catch:{ all -> 0x0124 }
        r9 = r11.getColumnIndex(r9);	 Catch:{ all -> 0x0124 }
    L_0x00be:
        r10 = r11.moveToNext();	 Catch:{ all -> 0x0124 }
        if (r10 == 0) goto L_0x0115;	 Catch:{ all -> 0x0124 }
    L_0x00c4:
        r10 = -1;	 Catch:{ all -> 0x0124 }
        if (r2 == r10) goto L_0x00ce;	 Catch:{ all -> 0x0124 }
    L_0x00c7:
        r14 = r11.getInt(r2);	 Catch:{ all -> 0x0124 }
        r20 = r14;	 Catch:{ all -> 0x0124 }
        goto L_0x00d0;	 Catch:{ all -> 0x0124 }
    L_0x00ce:
        r20 = 0;	 Catch:{ all -> 0x0124 }
    L_0x00d0:
        if (r7 == r10) goto L_0x00d9;	 Catch:{ all -> 0x0124 }
    L_0x00d2:
        r14 = r11.getInt(r7);	 Catch:{ all -> 0x0124 }
        r17 = r14;	 Catch:{ all -> 0x0124 }
        goto L_0x00db;	 Catch:{ all -> 0x0124 }
    L_0x00d9:
        r17 = 0;	 Catch:{ all -> 0x0124 }
    L_0x00db:
        if (r6 != r10) goto L_0x00e8;	 Catch:{ all -> 0x0124 }
    L_0x00dd:
        r14 = r11.getLong(r5);	 Catch:{ all -> 0x0124 }
        r14 = android.content.ContentUris.withAppendedId(r3, r14);	 Catch:{ all -> 0x0124 }
    L_0x00e5:
        r16 = r14;	 Catch:{ all -> 0x0124 }
        goto L_0x00f1;	 Catch:{ all -> 0x0124 }
    L_0x00e8:
        r14 = r11.getLong(r6);	 Catch:{ all -> 0x0124 }
        r14 = android.content.ContentUris.withAppendedId(r1, r14);	 Catch:{ all -> 0x0124 }
        goto L_0x00e5;	 Catch:{ all -> 0x0124 }
    L_0x00f1:
        if (r8 == r10) goto L_0x00fa;	 Catch:{ all -> 0x0124 }
    L_0x00f3:
        r14 = r11.getInt(r8);	 Catch:{ all -> 0x0124 }
        r18 = r14;	 Catch:{ all -> 0x0124 }
        goto L_0x00fe;	 Catch:{ all -> 0x0124 }
    L_0x00fa:
        r14 = 400; // 0x190 float:5.6E-43 double:1.976E-321;	 Catch:{ all -> 0x0124 }
        r18 = 400; // 0x190 float:5.6E-43 double:1.976E-321;	 Catch:{ all -> 0x0124 }
    L_0x00fe:
        if (r9 == r10) goto L_0x0109;	 Catch:{ all -> 0x0124 }
    L_0x0100:
        r10 = r11.getInt(r9);	 Catch:{ all -> 0x0124 }
        if (r10 != r12) goto L_0x0109;	 Catch:{ all -> 0x0124 }
    L_0x0106:
        r19 = 1;	 Catch:{ all -> 0x0124 }
        goto L_0x010b;	 Catch:{ all -> 0x0124 }
    L_0x0109:
        r19 = 0;	 Catch:{ all -> 0x0124 }
    L_0x010b:
        r10 = new android.support.v4.provider.FontsContractCompat$b;	 Catch:{ all -> 0x0124 }
        r15 = r10;	 Catch:{ all -> 0x0124 }
        r15.<init>(r16, r17, r18, r19, r20);	 Catch:{ all -> 0x0124 }
        r4.add(r10);	 Catch:{ all -> 0x0124 }
        goto L_0x00be;
    L_0x0115:
        r2 = r4;
    L_0x0116:
        if (r11 == 0) goto L_0x011b;
    L_0x0118:
        r11.close();
    L_0x011b:
        r1 = new android.support.v4.provider.FontsContractCompat.C0533b[r13];
        r1 = r2.toArray(r1);
        r1 = (android.support.v4.provider.FontsContractCompat.C0533b[]) r1;
        return r1;
    L_0x0124:
        r0 = move-exception;
        r1 = r0;
        if (r11 == 0) goto L_0x012b;
    L_0x0128:
        r11.close();
    L_0x012b:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.provider.FontsContractCompat.a(android.content.Context, android.support.v4.provider.a, java.lang.String, android.os.CancellationSignal):android.support.v4.provider.FontsContractCompat$b[]");
    }

    @android.support.annotation.NonNull
    /* renamed from: b */
    private static android.support.v4.provider.FontsContractCompat.C0534c m1973b(android.content.Context r3, android.support.v4.provider.C0539a r4, int r5) {
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
        r4 = m1965a(r3, r0, r4);	 Catch:{ NameNotFoundException -> 0x002b }
        r1 = r4.m1956a();
        r2 = -3;
        if (r1 != 0) goto L_0x001d;
    L_0x000c:
        r4 = r4.m1957b();
        r3 = android.support.v4.graphics.C0449d.m1711a(r3, r0, r4, r5);
        r4 = new android.support.v4.provider.FontsContractCompat$c;
        if (r3 == 0) goto L_0x0019;
    L_0x0018:
        r2 = 0;
    L_0x0019:
        r4.<init>(r3, r2);
        return r4;
    L_0x001d:
        r3 = r4.m1956a();
        r4 = 1;
        if (r3 != r4) goto L_0x0025;
    L_0x0024:
        r2 = -2;
    L_0x0025:
        r3 = new android.support.v4.provider.FontsContractCompat$c;
        r3.<init>(r0, r2);
        return r3;
    L_0x002b:
        r3 = new android.support.v4.provider.FontsContractCompat$c;
        r4 = -1;
        r3.<init>(r0, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.provider.FontsContractCompat.b(android.content.Context, android.support.v4.provider.a, int):android.support.v4.provider.FontsContractCompat$c");
    }

    @android.support.annotation.RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static android.graphics.Typeface m1964a(final android.content.Context r2, final android.support.v4.provider.C0539a r3, @android.support.annotation.Nullable final android.support.v4.content.res.C0441a.C0440a r4, @android.support.annotation.Nullable final android.os.Handler r5, boolean r6, int r7, final int r8) {
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
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r3.m1988f();
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r0.append(r8);
        r0 = r0.toString();
        r1 = f1642a;
        r1 = r1.get(r0);
        r1 = (android.graphics.Typeface) r1;
        if (r1 == 0) goto L_0x0028;
    L_0x0022:
        if (r4 == 0) goto L_0x0027;
    L_0x0024:
        r4.onFontRetrieved(r1);
    L_0x0027:
        return r1;
    L_0x0028:
        if (r6 == 0) goto L_0x0045;
    L_0x002a:
        r1 = -1;
        if (r7 != r1) goto L_0x0045;
    L_0x002d:
        r2 = m1973b(r2, r3, r8);
        if (r4 == 0) goto L_0x0042;
    L_0x0033:
        r3 = r2.f1641b;
        if (r3 != 0) goto L_0x003d;
    L_0x0037:
        r3 = r2.f1640a;
        r4.callbackSuccessAsync(r3, r5);
        goto L_0x0042;
    L_0x003d:
        r3 = r2.f1641b;
        r4.callbackFailAsync(r3, r5);
    L_0x0042:
        r2 = r2.f1640a;
        return r2;
    L_0x0045:
        r1 = new android.support.v4.provider.FontsContractCompat$1;
        r1.<init>(r2, r3, r8, r0);
        r2 = 0;
        if (r6 == 0) goto L_0x0059;
    L_0x004d:
        r3 = f1643b;	 Catch:{ InterruptedException -> 0x0058 }
        r3 = r3.m1981a(r1, r7);	 Catch:{ InterruptedException -> 0x0058 }
        r3 = (android.support.v4.provider.FontsContractCompat.C0534c) r3;	 Catch:{ InterruptedException -> 0x0058 }
        r3 = r3.f1640a;	 Catch:{ InterruptedException -> 0x0058 }
        return r3;
    L_0x0058:
        return r2;
    L_0x0059:
        if (r4 != 0) goto L_0x005d;
    L_0x005b:
        r3 = r2;
        goto L_0x0062;
    L_0x005d:
        r3 = new android.support.v4.provider.FontsContractCompat$2;
        r3.<init>(r4, r5);
    L_0x0062:
        r4 = f1644c;
        monitor-enter(r4);
        r5 = f1645d;	 Catch:{ all -> 0x0097 }
        r5 = r5.containsKey(r0);	 Catch:{ all -> 0x0097 }
        if (r5 == 0) goto L_0x007c;	 Catch:{ all -> 0x0097 }
    L_0x006d:
        if (r3 == 0) goto L_0x007a;	 Catch:{ all -> 0x0097 }
    L_0x006f:
        r5 = f1645d;	 Catch:{ all -> 0x0097 }
        r5 = r5.get(r0);	 Catch:{ all -> 0x0097 }
        r5 = (java.util.ArrayList) r5;	 Catch:{ all -> 0x0097 }
        r5.add(r3);	 Catch:{ all -> 0x0097 }
    L_0x007a:
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        return r2;	 Catch:{ all -> 0x0097 }
    L_0x007c:
        if (r3 == 0) goto L_0x008b;	 Catch:{ all -> 0x0097 }
    L_0x007e:
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0097 }
        r5.<init>();	 Catch:{ all -> 0x0097 }
        r5.add(r3);	 Catch:{ all -> 0x0097 }
        r3 = f1645d;	 Catch:{ all -> 0x0097 }
        r3.put(r0, r5);	 Catch:{ all -> 0x0097 }
    L_0x008b:
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        r3 = f1643b;
        r4 = new android.support.v4.provider.FontsContractCompat$3;
        r4.<init>(r0);
        r3.m1982a(r1, r4);
        return r2;
    L_0x0097:
        r2 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.provider.FontsContractCompat.a(android.content.Context, android.support.v4.provider.a, android.support.v4.content.res.a$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    @RequiresApi(19)
    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m1970a(Context context, C0533b[] c0533bArr, CancellationSignal cancellationSignal) {
        Map hashMap = new HashMap();
        for (C0533b c0533b : c0533bArr) {
            if (c0533b.m1962e() == 0) {
                Uri a = c0533b.m1958a();
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, C0455i.m1746a(context, cancellationSignal, a));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @NonNull
    /* renamed from: a */
    public static C0532a m1965a(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull C0539a c0539a) throws NameNotFoundException {
        ProviderInfo a = m1963a(context.getPackageManager(), c0539a, context.getResources());
        if (a == null) {
            return new C0532a(1, null);
        }
        return new C0532a(null, m1972a(context, c0539a, a.authority, cancellationSignal));
    }

    @VisibleForTesting
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    /* renamed from: a */
    public static ProviderInfo m1963a(@NonNull PackageManager packageManager, @NonNull C0539a c0539a, @Nullable Resources resources) throws NameNotFoundException {
        String a = c0539a.m1983a();
        int i = 0;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider == null) {
            c0539a = new StringBuilder();
            c0539a.append("No package found for authority: ");
            c0539a.append(a);
            throw new NameNotFoundException(c0539a.toString());
        } else if (resolveContentProvider.packageName.equals(c0539a.m1984b())) {
            List a2 = m1969a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f1646e);
            c0539a = m1968a(c0539a, resources);
            while (i < c0539a.size()) {
                List arrayList = new ArrayList((Collection) c0539a.get(i));
                Collections.sort(arrayList, f1646e);
                if (m1971a(a2, arrayList) != null) {
                    return resolveContentProvider;
                }
                i++;
            }
            return null;
        } else {
            resources = new StringBuilder();
            resources.append("Found content provider ");
            resources.append(a);
            resources.append(", but package was not ");
            resources.append(c0539a.m1984b());
            throw new NameNotFoundException(resources.toString());
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m1968a(C0539a c0539a, Resources resources) {
        if (c0539a.m1986d() != null) {
            return c0539a.m1986d();
        }
        return FontResourcesParserCompat.m1659a(resources, c0539a.m1987e());
    }

    /* renamed from: a */
    private static boolean m1971a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static List<byte[]> m1969a(Signature[] signatureArr) {
        List<byte[]> arrayList = new ArrayList();
        for (Signature toByteArray : signatureArr) {
            arrayList.add(toByteArray.toByteArray());
        }
        return arrayList;
    }
}
