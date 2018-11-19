package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.squareup.picasso.j */
public class C7256j implements Cache {
    /* renamed from: b */
    final LinkedHashMap<String, Bitmap> f26151b;
    /* renamed from: c */
    private final int f26152c;
    /* renamed from: d */
    private int f26153d;
    /* renamed from: e */
    private int f26154e;
    /* renamed from: f */
    private int f26155f;
    /* renamed from: g */
    private int f26156g;
    /* renamed from: h */
    private int f26157h;

    public C7256j(Context context) {
        this(C6120v.m26585c(context));
    }

    public C7256j(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.f26152c = i;
        this.f26151b = new LinkedHashMap(0, 0.75f, true);
    }

    public Bitmap get(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Bitmap bitmap = (Bitmap) this.f26151b.get(str);
            if (bitmap != null) {
                this.f26156g++;
                return bitmap;
            }
            this.f26157h++;
            return null;
        }
    }

    public void set(String str, Bitmap bitmap) {
        if (str != null) {
            if (bitmap != null) {
                synchronized (this) {
                    this.f26154e++;
                    this.f26153d += C6120v.m26565a(bitmap);
                    Bitmap bitmap2 = (Bitmap) this.f26151b.put(str, bitmap);
                    if (bitmap2 != null) {
                        this.f26153d -= C6120v.m26565a(bitmap2);
                    }
                }
                m31076a(this.f26152c);
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m31076a(int r4) {
        /*
        r3 = this;
    L_0x0000:
        monitor-enter(r3);
        r0 = r3.f26153d;	 Catch:{ all -> 0x0072 }
        if (r0 < 0) goto L_0x0053;
    L_0x0005:
        r0 = r3.f26151b;	 Catch:{ all -> 0x0072 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x0012;
    L_0x000d:
        r0 = r3.f26153d;	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0053;
    L_0x0012:
        r0 = r3.f26153d;	 Catch:{ all -> 0x0072 }
        if (r0 <= r4) goto L_0x0051;
    L_0x0016:
        r0 = r3.f26151b;	 Catch:{ all -> 0x0072 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0051;
    L_0x001f:
        r0 = r3.f26151b;	 Catch:{ all -> 0x0072 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0072 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0072 }
        r0 = r0.next();	 Catch:{ all -> 0x0072 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0072 }
        r1 = r0.getKey();	 Catch:{ all -> 0x0072 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0072 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0072 }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ all -> 0x0072 }
        r2 = r3.f26151b;	 Catch:{ all -> 0x0072 }
        r2.remove(r1);	 Catch:{ all -> 0x0072 }
        r1 = r3.f26153d;	 Catch:{ all -> 0x0072 }
        r0 = com.squareup.picasso.C6120v.m26565a(r0);	 Catch:{ all -> 0x0072 }
        r1 = r1 - r0;
        r3.f26153d = r1;	 Catch:{ all -> 0x0072 }
        r0 = r3.f26155f;	 Catch:{ all -> 0x0072 }
        r0 = r0 + 1;
        r3.f26155f = r0;	 Catch:{ all -> 0x0072 }
        monitor-exit(r3);	 Catch:{ all -> 0x0072 }
        goto L_0x0000;
    L_0x0051:
        monitor-exit(r3);	 Catch:{ all -> 0x0072 }
        return;
    L_0x0053:
        r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0072 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0072 }
        r0.<init>();	 Catch:{ all -> 0x0072 }
        r1 = r3.getClass();	 Catch:{ all -> 0x0072 }
        r1 = r1.getName();	 Catch:{ all -> 0x0072 }
        r0.append(r1);	 Catch:{ all -> 0x0072 }
        r1 = ".sizeOf() is reporting inconsistent results!";
        r0.append(r1);	 Catch:{ all -> 0x0072 }
        r0 = r0.toString();	 Catch:{ all -> 0x0072 }
        r4.<init>(r0);	 Catch:{ all -> 0x0072 }
        throw r4;	 Catch:{ all -> 0x0072 }
    L_0x0072:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0072 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.j.a(int):void");
    }

    /* renamed from: a */
    public final void m31077a() {
        m31076a(-1);
    }

    public final synchronized int size() {
        return this.f26153d;
    }

    public final synchronized int maxSize() {
        return this.f26152c;
    }

    public final synchronized void clear() {
        m31077a();
    }

    public final synchronized void clearKeyUri(String str) {
        int length = str.length();
        Iterator it = this.f26151b.entrySet().iterator();
        Object obj = null;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            String str2 = (String) entry.getKey();
            Bitmap bitmap = (Bitmap) entry.getValue();
            int indexOf = str2.indexOf(10);
            if (indexOf == length && str2.substring(0, indexOf).equals(str)) {
                it.remove();
                this.f26153d -= C6120v.m26565a(bitmap);
                obj = 1;
            }
        }
        if (obj != null) {
            m31076a(this.f26152c);
        }
    }
}
