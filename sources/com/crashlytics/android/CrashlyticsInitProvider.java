package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import io.fabric.sdk.android.services.common.C15627j;

public class CrashlyticsInitProvider extends ContentProvider {
    private static final String TAG = "CrashlyticsInitProvider";

    interface EnabledCheckStrategy {
        boolean isCrashlyticsEnabled(Context context);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
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
        r5 = this;
        r0 = r5.getContext();
        r1 = new io.fabric.sdk.android.services.common.j;
        r1.<init>();
        r2 = new com.crashlytics.android.ManifestEnabledCheckStrategy;
        r2.<init>();
        r1 = r5.shouldInitializeFabric(r0, r1, r2);
        r2 = 1;
        if (r1 == 0) goto L_0x003a;
    L_0x0015:
        r1 = 0;
        r3 = new io.fabric.sdk.android.C15611g[r2];	 Catch:{ IllegalStateException -> 0x002e }
        r4 = new com.crashlytics.android.Crashlytics;	 Catch:{ IllegalStateException -> 0x002e }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x002e }
        r3[r1] = r4;	 Catch:{ IllegalStateException -> 0x002e }
        io.fabric.sdk.android.C15608c.a(r0, r3);	 Catch:{ IllegalStateException -> 0x002e }
        r0 = io.fabric.sdk.android.C15608c.h();	 Catch:{ IllegalStateException -> 0x002e }
        r3 = "CrashlyticsInitProvider";	 Catch:{ IllegalStateException -> 0x002e }
        r4 = "CrashlyticsInitProvider initialization successful";	 Catch:{ IllegalStateException -> 0x002e }
        r0.i(r3, r4);	 Catch:{ IllegalStateException -> 0x002e }
        goto L_0x003a;
    L_0x002e:
        r0 = io.fabric.sdk.android.C15608c.h();
        r2 = "CrashlyticsInitProvider";
        r3 = "CrashlyticsInitProvider initialization unsuccessful";
        r0.i(r2, r3);
        return r1;
    L_0x003a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.CrashlyticsInitProvider.onCreate():boolean");
    }

    boolean shouldInitializeFabric(Context context, C15627j c15627j, EnabledCheckStrategy enabledCheckStrategy) {
        return (c15627j.b(context) == null || enabledCheckStrategy.isCrashlyticsEnabled(context) == null) ? null : true;
    }
}
