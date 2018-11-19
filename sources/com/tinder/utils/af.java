package com.tinder.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import p000a.p001a.C0001a;

public final class af implements CookieStore {
    /* renamed from: a */
    private final Map<URI, List<HttpCookie>> f47617a = new HashMap();
    /* renamed from: b */
    private final SharedPreferences f47618b;

    public af(Context context) {
        int i = 0;
        this.f47618b = context.getSharedPreferences("CookiePrefsFile", 0);
        context = this.f47618b != null ? this.f47618b.getString("names", null) : null;
        if (context != null) {
            context = TextUtils.split(context, ",");
            int length = context.length;
            while (i < length) {
                String str = context[i];
                SharedPreferences sharedPreferences = this.f47618b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cookie_");
                stringBuilder.append(str);
                String string = sharedPreferences.getString(stringBuilder.toString(), null);
                if (string != null) {
                    HttpCookie a = m57614a(string);
                    if (a != null) {
                        List arrayList = new ArrayList();
                        arrayList.add(a);
                        this.f47617a.put(URI.create(str), arrayList);
                    }
                }
                i++;
            }
        }
    }

    public synchronized void add(URI uri, HttpCookie httpCookie) {
        if (httpCookie == null) {
            throw new NullPointerException("cookie == null");
        }
        uri = m57611a(uri);
        List list = (List) this.f47617a.get(uri);
        if (list == null) {
            list = new ArrayList();
            this.f47617a.put(uri, list);
        } else {
            list.remove(httpCookie);
        }
        list.add(httpCookie);
        Editor edit = this.f47618b.edit();
        edit.putString("names", TextUtils.join(",", this.f47617a.keySet()));
        String a = m57612a(new SerializableHttpCookie(httpCookie));
        if (a != null) {
            httpCookie = new StringBuilder();
            httpCookie.append("cookie_");
            httpCookie.append(uri);
            edit.putString(httpCookie.toString(), a);
            edit.commit();
        } else {
            list.remove(httpCookie);
            C0001a.c(String.format("Failed to encode cookie: %s", new Object[]{httpCookie}), new Object[0]);
        }
    }

    public synchronized List<HttpCookie> get(URI uri) {
        List arrayList;
        if (uri == null) {
            throw new NullPointerException("uri == null");
        }
        Iterator it;
        arrayList = new ArrayList();
        List list = (List) this.f47617a.get(uri);
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
        for (Entry entry : this.f47617a.entrySet()) {
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
        for (List it : this.f47617a.values()) {
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
        arrayList = new ArrayList(this.f47617a.keySet());
        arrayList.remove(null);
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        if (httpCookie == null) {
            throw new NullPointerException("cookie == null");
        }
        uri = m57611a(uri);
        List list = (List) this.f47617a.get(uri);
        if (list == null) {
            return null;
        }
        Editor edit = this.f47618b.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("cookie_");
        stringBuilder.append(uri);
        edit.remove(stringBuilder.toString()).commit();
        return list.remove(httpCookie);
    }

    public synchronized boolean removeAll() {
        this.f47618b.edit().clear().commit();
        this.f47617a.isEmpty();
        this.f47617a.clear();
        return true;
    }

    /* renamed from: a */
    protected java.lang.String m57612a(com.tinder.utils.SerializableHttpCookie r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r2 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x001e }
        r2.<init>(r1);	 Catch:{ IOException -> 0x001e }
        r2.writeObject(r4);	 Catch:{ IOException -> 0x001e }
        r4 = r1.toByteArray();
        r4 = r3.m57613a(r4);
        r1.close();	 Catch:{ IOException -> 0x001d }
        return r4;
    L_0x001d:
        return r0;
    L_0x001e:
        r4 = move-exception;
        r1 = "IOException in encodeCookie";
        com.tinder.utils.ad.a(r1, r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.utils.af.a(com.tinder.utils.SerializableHttpCookie):java.lang.String");
    }

    /* renamed from: a */
    protected HttpCookie m57614a(String str) {
        HttpCookie httpCookie;
        Throwable th;
        InputStream byteArrayInputStream = new ByteArrayInputStream(m57615b(str));
        str = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            HttpCookie a = ((SerializableHttpCookie) objectInputStream.readObject()).m57604a();
            try {
                objectInputStream.close();
                return a;
            } catch (String str2) {
                httpCookie = a;
                th = str2;
                str2 = httpCookie;
                ad.a("IOException in decodeCookie", th);
                return str2;
            } catch (String str22) {
                httpCookie = a;
                th = str22;
                str22 = httpCookie;
                ad.a("ClassNotFoundException in decodeCookie", th);
                return str22;
            }
        } catch (IOException e) {
            th = e;
            ad.a("IOException in decodeCookie", th);
            return str22;
        } catch (ClassNotFoundException e2) {
            th = e2;
            ad.a("ClassNotFoundException in decodeCookie", th);
            return str22;
        }
    }

    /* renamed from: a */
    protected String m57613a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString(i));
        }
        return stringBuilder.toString().toUpperCase(Locale.US);
    }

    /* renamed from: b */
    protected byte[] m57615b(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    private java.net.URI m57611a(java.net.URI r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.utils.af.a(java.net.URI):java.net.URI");
    }
}
