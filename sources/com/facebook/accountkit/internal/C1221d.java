package com.facebook.accountkit.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.facebook.accountkit.internal.d */
final class C1221d implements CookieStore {
    /* renamed from: a */
    private static final List<String> f3262a = new ArrayList();
    /* renamed from: b */
    private static final List<String> f3263b = new ArrayList();
    /* renamed from: c */
    private final Map<URI, List<HttpCookie>> f3264c = new HashMap();
    /* renamed from: d */
    private final SharedPreferences f3265d;

    static {
        f3262a.add(".accountkit.com");
        f3263b.add("aksb");
    }

    public C1221d(Context context) {
        this.f3265d = context.getSharedPreferences("cookieStore", 0);
        m4318a();
    }

    /* renamed from: a */
    private void m4318a() {
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
        r0 = r5.f3265d;
        r0 = r0.getAll();
        r0 = r0.entrySet();
        r0 = r0.iterator();
    L_0x000e:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0058;
    L_0x0014:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getKey();
        r2 = (java.lang.String) r2;
        r3 = "\\|";
        r4 = 2;
        r2 = r2.split(r3, r4);
        r3 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x000e }
        r4 = 0;	 Catch:{ URISyntaxException -> 0x000e }
        r2 = r2[r4];	 Catch:{ URISyntaxException -> 0x000e }
        r3.<init>(r2);	 Catch:{ URISyntaxException -> 0x000e }
        r1 = r1.getValue();	 Catch:{ URISyntaxException -> 0x000e }
        r1 = (java.lang.String) r1;	 Catch:{ URISyntaxException -> 0x000e }
        r2 = new com.facebook.accountkit.internal.SerializableHttpCookie;	 Catch:{ URISyntaxException -> 0x000e }
        r2.<init>();	 Catch:{ URISyntaxException -> 0x000e }
        r1 = r2.m4246a(r1);	 Catch:{ URISyntaxException -> 0x000e }
        if (r1 == 0) goto L_0x000e;	 Catch:{ URISyntaxException -> 0x000e }
    L_0x0040:
        r2 = r5.f3264c;	 Catch:{ URISyntaxException -> 0x000e }
        r2 = r2.get(r3);	 Catch:{ URISyntaxException -> 0x000e }
        r2 = (java.util.List) r2;	 Catch:{ URISyntaxException -> 0x000e }
        if (r2 != 0) goto L_0x0054;	 Catch:{ URISyntaxException -> 0x000e }
    L_0x004a:
        r2 = new java.util.ArrayList;	 Catch:{ URISyntaxException -> 0x000e }
        r2.<init>();	 Catch:{ URISyntaxException -> 0x000e }
        r4 = r5.f3264c;	 Catch:{ URISyntaxException -> 0x000e }
        r4.put(r3, r2);	 Catch:{ URISyntaxException -> 0x000e }
    L_0x0054:
        r2.add(r1);	 Catch:{ URISyntaxException -> 0x000e }
        goto L_0x000e;
    L_0x0058:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.d.a():void");
    }

    /* renamed from: a */
    private void m4319a(URI uri, HttpCookie httpCookie) {
        if (f3262a.contains(httpCookie.getDomain()) && f3263b.contains(httpCookie.getName())) {
            Editor edit = this.f3265d.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(uri.toString());
            stringBuilder.append("|");
            stringBuilder.append(httpCookie.getName());
            edit.putString(stringBuilder.toString(), new SerializableHttpCookie().m4245a(httpCookie));
            edit.apply();
        }
    }

    public synchronized void add(URI uri, HttpCookie httpCookie) {
        if (httpCookie == null) {
            throw new NullPointerException("cookie == null");
        }
        uri = m4317a(uri);
        List list = (List) this.f3264c.get(uri);
        if (list == null) {
            list = new ArrayList();
            this.f3264c.put(uri, list);
        } else {
            list.remove(httpCookie);
        }
        list.add(httpCookie);
        m4319a(uri, httpCookie);
    }

    /* renamed from: a */
    private java.net.URI m4317a(java.net.URI r5) {
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
        r0 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0010 }
        r2 = "http";	 Catch:{ URISyntaxException -> 0x0010 }
        r3 = r5.getHost();	 Catch:{ URISyntaxException -> 0x0010 }
        r1.<init>(r2, r3, r0, r0);	 Catch:{ URISyntaxException -> 0x0010 }
        return r1;
    L_0x0010:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.d.a(java.net.URI):java.net.URI");
    }

    public synchronized List<HttpCookie> get(URI uri) {
        List arrayList;
        if (uri == null) {
            throw new NullPointerException("uri == null");
        }
        Iterator it;
        arrayList = new ArrayList();
        List list = (List) this.f3264c.get(uri);
        if (list != null) {
            it = list.iterator();
            while (it.hasNext()) {
                HttpCookie httpCookie = (HttpCookie) it.next();
                if (httpCookie.hasExpired()) {
                    it.remove();
                } else {
                    arrayList.add(httpCookie);
                }
            }
        }
        for (Entry entry : this.f3264c.entrySet()) {
            if (!uri.equals(entry.getKey())) {
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    HttpCookie httpCookie2 = (HttpCookie) it2.next();
                    if (HttpCookie.domainMatches(httpCookie2.getDomain(), uri.getHost())) {
                        if (httpCookie2.hasExpired()) {
                            it2.remove();
                        } else if (!arrayList.contains(httpCookie2)) {
                            arrayList.add(httpCookie2);
                        }
                    }
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized List<HttpCookie> getCookies() {
        List arrayList;
        arrayList = new ArrayList();
        for (List it : this.f3264c.values()) {
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                HttpCookie httpCookie = (HttpCookie) it2.next();
                if (httpCookie.hasExpired()) {
                    it2.remove();
                } else if (!arrayList.contains(httpCookie)) {
                    arrayList.add(httpCookie);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized List<URI> getURIs() {
        List arrayList;
        arrayList = new ArrayList(this.f3264c.keySet());
        arrayList.remove(null);
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        if (httpCookie == null) {
            throw new NullPointerException("cookie == null");
        }
        List list = (List) this.f3264c.get(m4317a(uri));
        if (list == null) {
            return null;
        }
        return list.remove(httpCookie);
    }

    public synchronized boolean removeAll() {
        boolean isEmpty;
        isEmpty = this.f3264c.isEmpty() ^ 1;
        this.f3264c.clear();
        return isEmpty;
    }
}
