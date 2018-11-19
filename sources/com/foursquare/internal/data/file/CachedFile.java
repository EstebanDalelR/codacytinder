package com.foursquare.internal.data.file;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.util.C1946h;
import com.foursquare.pilgrim.PilgrimSdk;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;

public class CachedFile {
    /* renamed from: a */
    private static final String f5143a = "CachedFile";
    @NonNull
    /* renamed from: b */
    private final String f5144b;
    /* renamed from: c */
    private final int f5145c;

    public static class VersionMismatchException extends Exception {
        /* renamed from: a */
        private final String f5141a;
        /* renamed from: b */
        private final int f5142b;

        public VersionMismatchException(String str, int i) {
            this.f5141a = str;
            this.f5142b = i;
        }

        /* renamed from: a */
        public String m6669a() {
            return this.f5141a;
        }
    }

    public CachedFile(@NonNull String str, int i) {
        this.f5144b = str;
        this.f5145c = i;
    }

    /* renamed from: a */
    public void m6673a(Context context, String str) {
        Object obj = null;
        try {
            Object openFileOutput = context.openFileOutput(this.f5144b, 0);
            try {
                openFileOutput.write(String.valueOf(this.f5145c).getBytes());
                openFileOutput.write("\n".getBytes());
                openFileOutput.write(String.valueOf(System.currentTimeMillis()).getBytes());
                openFileOutput.write("\n".getBytes());
                openFileOutput.write(str.getBytes());
                C1946h.m6836a(openFileOutput);
            } catch (Exception e) {
                str = e;
                obj = openFileOutput;
                try {
                    PilgrimSdk.get().log(LogLevel.ERROR, "Error saving cache file.", str);
                    C1946h.m6836a(obj);
                } catch (Throwable th) {
                    str = th;
                    openFileOutput = obj;
                    C1946h.m6836a(openFileOutput);
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                C1946h.m6836a(openFileOutput);
                throw str;
            }
        } catch (Exception e2) {
            str = e2;
            PilgrimSdk.get().log(LogLevel.ERROR, "Error saving cache file.", str);
            C1946h.m6836a(obj);
        }
    }

    /* renamed from: a */
    public void m6672a(@NonNull Context context, @Nullable Object obj, @NonNull Type type) {
        Object openFileOutput;
        Object obj2 = null;
        try {
            openFileOutput = context.openFileOutput(this.f5144b, 0);
            try {
                openFileOutput.write(String.valueOf(this.f5145c).getBytes());
                openFileOutput.write("\n".getBytes());
                openFileOutput.write(String.valueOf(System.currentTimeMillis()).getBytes());
                openFileOutput.write("\n".getBytes());
                Object jsonWriter = new JsonWriter(new OutputStreamWriter(openFileOutput, "UTF-8"));
                try {
                    C1913a.m6654a(obj, type, jsonWriter);
                    C1946h.m6836a(jsonWriter);
                } catch (Exception e) {
                    obj = e;
                    obj2 = jsonWriter;
                    try {
                        PilgrimSdk.get().log(LogLevel.ERROR, "Error saving cache file.", obj);
                        C1946h.m6836a(obj2);
                        C1946h.m6836a(openFileOutput);
                    } catch (Throwable th) {
                        obj = th;
                        C1946h.m6836a(obj2);
                        C1946h.m6836a(openFileOutput);
                        throw obj;
                    }
                } catch (Throwable th2) {
                    obj = th2;
                    obj2 = jsonWriter;
                    C1946h.m6836a(obj2);
                    C1946h.m6836a(openFileOutput);
                    throw obj;
                }
            } catch (Exception e2) {
                obj = e2;
                PilgrimSdk.get().log(LogLevel.ERROR, "Error saving cache file.", obj);
                C1946h.m6836a(obj2);
                C1946h.m6836a(openFileOutput);
            }
        } catch (Exception e3) {
            obj = e3;
            openFileOutput = null;
            PilgrimSdk.get().log(LogLevel.ERROR, "Error saving cache file.", obj);
            C1946h.m6836a(obj2);
            C1946h.m6836a(openFileOutput);
        } catch (Throwable th3) {
            obj = th3;
            openFileOutput = null;
            C1946h.m6836a(obj2);
            C1946h.m6836a(openFileOutput);
            throw obj;
        }
        C1946h.m6836a(openFileOutput);
    }

    /* renamed from: a */
    public java.lang.String m6671a(android.content.Context r11) throws com.foursquare.internal.data.file.CachedFile.VersionMismatchException {
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
        r10 = this;
        r0 = 0;
        r1 = r10.f5144b;	 Catch:{ FileNotFoundException -> 0x006d, VersionMismatchException -> 0x0063, Exception -> 0x0055, all -> 0x0050 }
        r11 = r11.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x006d, VersionMismatchException -> 0x0063, Exception -> 0x0055, all -> 0x0050 }
        r1 = new java.io.BufferedReader;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r2 = new java.io.InputStreamReader;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r2.<init>(r11);	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r2 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r2.<init>();	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r3 = r10.f5145c;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r4 = 0;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r5 = r3;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r3 = 0;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x001b:
        r6 = r1.readLine();	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        if (r6 == 0) goto L_0x0038;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x0021:
        r7 = 1;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        if (r4 != 0) goto L_0x002f;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x0024:
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r8 = r10.f5145c;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        if (r6 >= r8) goto L_0x0035;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x002c:
        r5 = r6;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r3 = 1;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        goto L_0x0035;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x002f:
        if (r4 != r7) goto L_0x0032;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x0031:
        goto L_0x0035;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x0032:
        r2.append(r6);	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x0035:
        r4 = r4 + 1;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        goto L_0x001b;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x0038:
        if (r3 == 0) goto L_0x0044;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x003a:
        r1 = new com.foursquare.internal.data.file.CachedFile$VersionMismatchException;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r2 = r2.toString();	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        r1.<init>(r2, r5);	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        throw r1;	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
    L_0x0044:
        r1 = r2.toString();	 Catch:{ FileNotFoundException -> 0x006e, VersionMismatchException -> 0x004e, Exception -> 0x004c }
        com.foursquare.internal.util.C1946h.m6836a(r11);
        return r1;
    L_0x004c:
        r1 = move-exception;
        goto L_0x0057;
    L_0x004e:
        r0 = move-exception;
        goto L_0x0067;
    L_0x0050:
        r11 = move-exception;
        r9 = r0;
        r0 = r11;
        r11 = r9;
        goto L_0x0069;
    L_0x0055:
        r1 = move-exception;
        r11 = r0;
    L_0x0057:
        r2 = com.foursquare.pilgrim.PilgrimSdk.get();	 Catch:{ all -> 0x0068 }
        r3 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.ERROR;	 Catch:{ all -> 0x0068 }
        r4 = "Error loading cached file.";	 Catch:{ all -> 0x0068 }
        r2.log(r3, r4, r1);	 Catch:{ all -> 0x0068 }
        goto L_0x006e;	 Catch:{ all -> 0x0068 }
    L_0x0063:
        r11 = move-exception;	 Catch:{ all -> 0x0068 }
        r9 = r0;	 Catch:{ all -> 0x0068 }
        r0 = r11;	 Catch:{ all -> 0x0068 }
        r11 = r9;	 Catch:{ all -> 0x0068 }
    L_0x0067:
        throw r0;	 Catch:{ all -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
    L_0x0069:
        com.foursquare.internal.util.C1946h.m6836a(r11);
        throw r0;
    L_0x006d:
        r11 = r0;
    L_0x006e:
        com.foursquare.internal.util.C1946h.m6836a(r11);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.data.file.CachedFile.a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public <T> T m6670a(android.content.Context r6, java.lang.reflect.Type r7) throws com.foursquare.internal.data.file.CachedFile.VersionMismatchException {
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
        r0 = 0;
        r1 = r5.f5144b;	 Catch:{ FileNotFoundException -> 0x0055, VersionMismatchException -> 0x004f, Exception -> 0x003f }
        r6 = r6.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x0055, VersionMismatchException -> 0x004f, Exception -> 0x003f }
        r1 = new java.io.BufferedReader;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        r2 = new java.io.InputStreamReader;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        r2.<init>(r6);	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        r2 = 0;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
    L_0x0012:
        r3 = r1.readLine();	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        if (r3 == 0) goto L_0x002f;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
    L_0x0018:
        if (r2 != 0) goto L_0x0028;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
    L_0x001a:
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        r4 = r5.f5145c;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        if (r3 >= r4) goto L_0x002c;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
    L_0x0022:
        r7 = new com.foursquare.internal.data.file.CachedFile$VersionMismatchException;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        r7.<init>(r0, r3);	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        throw r7;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
    L_0x0028:
        r3 = 1;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        if (r2 != r3) goto L_0x002c;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
    L_0x002b:
        goto L_0x002f;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
    L_0x002c:
        r2 = r2 + 1;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        goto L_0x0012;	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
    L_0x002f:
        r7 = com.foursquare.internal.api.C1913a.m6648a(r1, r7);	 Catch:{ FileNotFoundException -> 0x0056, VersionMismatchException -> 0x0039, Exception -> 0x0037 }
        com.foursquare.internal.util.C1946h.m6836a(r6);
        return r7;
    L_0x0037:
        r7 = move-exception;
        goto L_0x0041;
    L_0x0039:
        r7 = move-exception;
        r0 = r6;
        goto L_0x0050;
    L_0x003c:
        r7 = move-exception;
        r6 = r0;
        goto L_0x0051;
    L_0x003f:
        r7 = move-exception;
        r6 = r0;
    L_0x0041:
        r1 = com.foursquare.pilgrim.PilgrimSdk.get();	 Catch:{ all -> 0x004d }
        r2 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.ERROR;	 Catch:{ all -> 0x004d }
        r3 = "Error loading cached file.";	 Catch:{ all -> 0x004d }
        r1.log(r2, r3, r7);	 Catch:{ all -> 0x004d }
        goto L_0x0056;
    L_0x004d:
        r7 = move-exception;
        goto L_0x0051;
    L_0x004f:
        r7 = move-exception;
    L_0x0050:
        throw r7;	 Catch:{ all -> 0x003c }
    L_0x0051:
        com.foursquare.internal.util.C1946h.m6836a(r6);
        throw r7;
    L_0x0055:
        r6 = r0;
    L_0x0056:
        com.foursquare.internal.util.C1946h.m6836a(r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.data.file.CachedFile.a(android.content.Context, java.lang.reflect.Type):T");
    }
}
