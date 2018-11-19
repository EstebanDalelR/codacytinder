package com.leanplum;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public class LeanplumInflater {
    /* renamed from: a */
    private Context f21134a;
    /* renamed from: b */
    private LeanplumResources f21135b;

    public static LeanplumInflater from(Context context) {
        return new LeanplumInflater(context);
    }

    private LeanplumInflater(Context context) {
        this.f21134a = context;
    }

    public LeanplumResources getLeanplumResources() {
        return getLeanplumResources(null);
    }

    public LeanplumResources getLeanplumResources(Resources resources) {
        if (this.f21135b != null) {
            return this.f21135b;
        }
        if (resources == null) {
            resources = this.f21134a.getResources();
        }
        if (resources instanceof LeanplumResources) {
            return (LeanplumResources) resources;
        }
        this.f21135b = new LeanplumResources(resources);
        return this.f21135b;
    }

    public View inflate(int i) {
        return inflate(i, null, false);
    }

    public View inflate(int i, ViewGroup viewGroup) {
        return inflate(i, viewGroup, viewGroup != null);
    }

    public android.view.View inflate(int r11, android.view.ViewGroup r12, boolean r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = r10.f21134a;	 Catch:{ Throwable -> 0x0113 }
        r0 = r0.getResources();	 Catch:{ Throwable -> 0x0113 }
        r0 = r10.getLeanplumResources(r0);	 Catch:{ Throwable -> 0x0113 }
        r0 = r0.a(r11);	 Catch:{ Throwable -> 0x0113 }
        if (r0 == 0) goto L_0x0108;	 Catch:{ Throwable -> 0x0113 }
    L_0x0010:
        r1 = r0.stringValue;	 Catch:{ Throwable -> 0x0113 }
        r2 = r0.defaultValue();	 Catch:{ Throwable -> 0x0113 }
        r1 = r1.equals(r2);	 Catch:{ Throwable -> 0x0113 }
        if (r1 == 0) goto L_0x001e;	 Catch:{ Throwable -> 0x0113 }
    L_0x001c:
        goto L_0x0108;	 Catch:{ Throwable -> 0x0113 }
    L_0x001e:
        r1 = r0.overrideResId();	 Catch:{ Throwable -> 0x0113 }
        if (r1 == 0) goto L_0x002f;	 Catch:{ Throwable -> 0x0113 }
    L_0x0024:
        r0 = r10.f21134a;	 Catch:{ Throwable -> 0x0113 }
        r0 = android.view.LayoutInflater.from(r0);	 Catch:{ Throwable -> 0x0113 }
        r0 = r0.inflate(r1, r12, r13);	 Catch:{ Throwable -> 0x0113 }
        return r0;
    L_0x002f:
        r1 = 0;
        r2 = 1;
        r3 = 0;
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ Throwable -> 0x00b6, all -> 0x00b3 }
        r4.<init>();	 Catch:{ Throwable -> 0x00b6, all -> 0x00b3 }
        r5 = r0.stream();	 Catch:{ Throwable -> 0x00b6, all -> 0x00b3 }
        r6 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r6 = new byte[r6];	 Catch:{ Throwable -> 0x00b1 }
    L_0x003f:
        r7 = r5.read(r6);	 Catch:{ Throwable -> 0x00b1 }
        if (r7 < 0) goto L_0x0049;	 Catch:{ Throwable -> 0x00b1 }
    L_0x0045:
        r4.write(r6, r3, r7);	 Catch:{ Throwable -> 0x00b1 }
        goto L_0x003f;	 Catch:{ Throwable -> 0x00b1 }
    L_0x0049:
        r6 = "android.content.res.XmlBlock";	 Catch:{ Throwable -> 0x00b1 }
        r6 = java.lang.Class.forName(r6);	 Catch:{ Throwable -> 0x00b1 }
        r7 = new java.lang.Class[r2];	 Catch:{ Throwable -> 0x00b1 }
        r8 = byte[].class;	 Catch:{ Throwable -> 0x00b1 }
        r7[r3] = r8;	 Catch:{ Throwable -> 0x00b1 }
        r6 = r6.getConstructor(r7);	 Catch:{ Throwable -> 0x00b1 }
        r7 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x00b1 }
        r4 = r4.toByteArray();	 Catch:{ Throwable -> 0x00b1 }
        r7[r3] = r4;	 Catch:{ Throwable -> 0x00b1 }
        r4 = r6.newInstance(r7);	 Catch:{ Throwable -> 0x00b1 }
        r6 = r4.getClass();	 Catch:{ Throwable -> 0x00a4 }
        r7 = "newParser";	 Catch:{ Throwable -> 0x00a4 }
        r8 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x00a4 }
        r6 = r6.getMethod(r7, r8);	 Catch:{ Throwable -> 0x00a4 }
        r7 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x00a4 }
        r4 = r6.invoke(r4, r7);	 Catch:{ Throwable -> 0x00a4 }
        r4 = (android.content.res.XmlResourceParser) r4;	 Catch:{ Throwable -> 0x00a4 }
        r1 = r10.f21134a;	 Catch:{ Throwable -> 0x009d, all -> 0x0098 }
        r1 = android.view.LayoutInflater.from(r1);	 Catch:{ Throwable -> 0x009d, all -> 0x0098 }
        r1 = r1.inflate(r4, r12, r13);	 Catch:{ Throwable -> 0x009d, all -> 0x0098 }
        if (r4 == 0) goto L_0x0088;
    L_0x0085:
        r4.close();	 Catch:{ Throwable -> 0x00b1 }
    L_0x0088:
        if (r5 == 0) goto L_0x0097;
    L_0x008a:
        r5.close();	 Catch:{ IOException -> 0x008e }
        goto L_0x0097;
    L_0x008e:
        r11 = new java.lang.Object[r2];
        r12 = "Failed to close input stream.";
        r11[r3] = r12;
        com.leanplum.p069a.ao.a(r11);
    L_0x0097:
        return r1;
    L_0x0098:
        r1 = move-exception;
        r9 = r4;
        r4 = r1;
        r1 = r9;
        goto L_0x00ab;
    L_0x009d:
        r1 = move-exception;
        r9 = r4;
        r4 = r1;
        r1 = r9;
        goto L_0x00a5;
    L_0x00a2:
        r4 = move-exception;
        goto L_0x00ab;
    L_0x00a4:
        r4 = move-exception;
    L_0x00a5:
        r6 = new java.lang.RuntimeException;	 Catch:{ all -> 0x00a2 }
        r6.<init>(r4);	 Catch:{ all -> 0x00a2 }
        throw r6;	 Catch:{ all -> 0x00a2 }
    L_0x00ab:
        if (r1 == 0) goto L_0x00b0;
    L_0x00ad:
        r1.close();	 Catch:{ Throwable -> 0x00b1 }
    L_0x00b0:
        throw r4;	 Catch:{ Throwable -> 0x00b1 }
    L_0x00b1:
        r1 = move-exception;
        goto L_0x00b9;
    L_0x00b3:
        r11 = move-exception;
        r5 = r1;
        goto L_0x00f8;
    L_0x00b6:
        r4 = move-exception;
        r5 = r1;
        r1 = r4;
    L_0x00b9:
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00f7 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f7 }
        r7 = "Could not inflate resource ";	 Catch:{ all -> 0x00f7 }
        r6.<init>(r7);	 Catch:{ all -> 0x00f7 }
        r6.append(r11);	 Catch:{ all -> 0x00f7 }
        r7 = ":";	 Catch:{ all -> 0x00f7 }
        r6.append(r7);	 Catch:{ all -> 0x00f7 }
        r0 = r0.stringValue();	 Catch:{ all -> 0x00f7 }
        r6.append(r0);	 Catch:{ all -> 0x00f7 }
        r0 = r6.toString();	 Catch:{ all -> 0x00f7 }
        r4[r3] = r0;	 Catch:{ all -> 0x00f7 }
        r4[r2] = r1;	 Catch:{ all -> 0x00f7 }
        com.leanplum.p069a.ao.a(r4);	 Catch:{ all -> 0x00f7 }
        if (r5 == 0) goto L_0x00ec;
    L_0x00df:
        r5.close();	 Catch:{ IOException -> 0x00e3 }
        goto L_0x00ec;
    L_0x00e3:
        r0 = new java.lang.Object[r2];
        r1 = "Failed to close input stream.";
        r0[r3] = r1;
        com.leanplum.p069a.ao.a(r0);
    L_0x00ec:
        r0 = r10.f21134a;
        r0 = android.view.LayoutInflater.from(r0);
        r11 = r0.inflate(r11, r12, r13);
        return r11;
    L_0x00f7:
        r11 = move-exception;
    L_0x00f8:
        if (r5 == 0) goto L_0x0107;
    L_0x00fa:
        r5.close();	 Catch:{ IOException -> 0x00fe }
        goto L_0x0107;
    L_0x00fe:
        r12 = new java.lang.Object[r2];
        r13 = "Failed to close input stream.";
        r12[r3] = r13;
        com.leanplum.p069a.ao.a(r12);
    L_0x0107:
        throw r11;
    L_0x0108:
        r0 = r10.f21134a;	 Catch:{ Throwable -> 0x0113 }
        r0 = android.view.LayoutInflater.from(r0);	 Catch:{ Throwable -> 0x0113 }
        r0 = r0.inflate(r11, r12, r13);	 Catch:{ Throwable -> 0x0113 }
        return r0;
    L_0x0113:
        r0 = move-exception;
        r1 = r0 instanceof android.view.InflateException;
        if (r1 != 0) goto L_0x011b;
    L_0x0118:
        com.leanplum.p069a.bo.a(r0);
    L_0x011b:
        r0 = r10.f21134a;
        r0 = android.view.LayoutInflater.from(r0);
        r11 = r0.inflate(r11, r12, r13);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.LeanplumInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View");
    }
}
