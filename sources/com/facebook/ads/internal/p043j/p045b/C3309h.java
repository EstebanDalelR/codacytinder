package com.facebook.ads.internal.p043j.p045b;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.facebook.ads.internal.j.b.h */
public class C3309h implements C1469n {
    /* renamed from: a */
    public final String f10091a;
    /* renamed from: b */
    private HttpURLConnection f10092b;
    /* renamed from: c */
    private InputStream f10093c;
    /* renamed from: d */
    private volatile int f10094d;
    /* renamed from: e */
    private volatile String f10095e;

    public C3309h(C3309h c3309h) {
        this.f10094d = Integer.MIN_VALUE;
        this.f10091a = c3309h.f10091a;
        this.f10095e = c3309h.f10095e;
        this.f10094d = c3309h.f10094d;
    }

    public C3309h(String str) {
        this(str, C1468m.m5136a(str));
    }

    public C3309h(String str, String str2) {
        this.f10094d = Integer.MIN_VALUE;
        this.f10091a = (String) C1463j.m5119a(str);
        this.f10095e = str2;
    }

    /* renamed from: a */
    private int m12766a(HttpURLConnection httpURLConnection, int i, int i2) {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == Callback.DEFAULT_DRAG_ANIMATION_DURATION ? contentLength : i2 == 206 ? contentLength + i : this.f10094d;
    }

    /* renamed from: a */
    private HttpURLConnection m12767a(int i, int i2) {
        HttpURLConnection httpURLConnection;
        String str = this.f10091a;
        int i3 = 0;
        Object obj;
        do {
            String stringBuilder;
            String str2 = "ProxyCache";
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Open connection ");
            if (i > 0) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(" with offset ");
                stringBuilder3.append(i);
                stringBuilder = stringBuilder3.toString();
            } else {
                stringBuilder = "";
            }
            stringBuilder2.append(stringBuilder);
            stringBuilder2.append(" to ");
            stringBuilder2.append(str);
            Log.d(str2, stringBuilder2.toString());
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (i > 0) {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append("bytes=");
                stringBuilder3.append(i);
                stringBuilder3.append("-");
                httpURLConnection.setRequestProperty("Range", stringBuilder3.toString());
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (!(responseCode == 301 || responseCode == 302)) {
                if (responseCode != 303) {
                    obj = null;
                    if (obj != null) {
                        str = httpURLConnection.getHeaderField("Location");
                        i3++;
                        httpURLConnection.disconnect();
                    }
                    if (i3 > 5) {
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append("Too many redirects: ");
                        stringBuilder4.append(i3);
                        throw new C1467l(stringBuilder4.toString());
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                str = httpURLConnection.getHeaderField("Location");
                i3++;
                httpURLConnection.disconnect();
            }
            if (i3 > 5) {
                StringBuilder stringBuilder42 = new StringBuilder();
                stringBuilder42.append("Too many redirects: ");
                stringBuilder42.append(i3);
                throw new C1467l(stringBuilder42.toString());
            }
        } while (obj != null);
        return httpURLConnection;
    }

    /* renamed from: d */
    private void m12768d() {
        HttpURLConnection a;
        Closeable inputStream;
        Throwable th;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Read content info from ");
        stringBuilder2.append(this.f10091a);
        Log.d("ProxyCache", stringBuilder2.toString());
        try {
            a = m12767a(0, 10000);
            try {
                this.f10094d = a.getContentLength();
                this.f10095e = a.getContentType();
                inputStream = a.getInputStream();
            } catch (Throwable e) {
                th = e;
                inputStream = null;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error fetching info from ");
                    stringBuilder.append(this.f10091a);
                    Log.e("ProxyCache", stringBuilder.toString(), th);
                    C1468m.m5138a(inputStream);
                    if (a == null) {
                        return;
                    }
                    a.disconnect();
                } catch (Throwable th2) {
                    th = th2;
                    C1468m.m5138a(inputStream);
                    if (a != null) {
                        a.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable e2) {
                th = e2;
                inputStream = null;
                C1468m.m5138a(inputStream);
                if (a != null) {
                    a.disconnect();
                }
                throw th;
            }
            try {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Content info for `");
                stringBuilder3.append(this.f10091a);
                stringBuilder3.append("`: mime: ");
                stringBuilder3.append(this.f10095e);
                stringBuilder3.append(", content-length: ");
                stringBuilder3.append(this.f10094d);
                Log.i("ProxyCache", stringBuilder3.toString());
                C1468m.m5138a(inputStream);
                if (a != null) {
                    a.disconnect();
                }
            } catch (IOException e3) {
                th = e3;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error fetching info from ");
                stringBuilder.append(this.f10091a);
                Log.e("ProxyCache", stringBuilder.toString(), th);
                C1468m.m5138a(inputStream);
                if (a == null) {
                    return;
                }
                a.disconnect();
            }
        } catch (Throwable e4) {
            inputStream = null;
            th = e4;
            a = inputStream;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error fetching info from ");
            stringBuilder.append(this.f10091a);
            Log.e("ProxyCache", stringBuilder.toString(), th);
            C1468m.m5138a(inputStream);
            if (a == null) {
                return;
            }
            a.disconnect();
        } catch (Throwable e42) {
            inputStream = null;
            th = e42;
            a = inputStream;
            C1468m.m5138a(inputStream);
            if (a != null) {
                a.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized int mo1777a() {
        if (this.f10094d == Integer.MIN_VALUE) {
            m12768d();
        }
        return this.f10094d;
    }

    /* renamed from: a */
    public int mo1778a(byte[] bArr) {
        StringBuilder stringBuilder;
        if (this.f10093c == null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Error reading data from ");
            stringBuilder2.append(this.f10091a);
            stringBuilder2.append(": connection is absent!");
            throw new C1467l(stringBuilder2.toString());
        }
        try {
            return this.f10093c.read(bArr, 0, bArr.length);
        } catch (Throwable e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Reading source ");
            stringBuilder.append(this.f10091a);
            stringBuilder.append(" is interrupted");
            throw new C3310i(stringBuilder.toString(), e);
        } catch (Throwable e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error reading data from ");
            stringBuilder.append(this.f10091a);
            throw new C1467l(stringBuilder.toString(), e2);
        }
    }

    /* renamed from: a */
    public void mo1779a(int i) {
        try {
            this.f10092b = m12767a(i, -1);
            this.f10095e = this.f10092b.getContentType();
            this.f10093c = new BufferedInputStream(this.f10092b.getInputStream(), 8192);
            this.f10094d = m12766a(this.f10092b, i, this.f10092b.getResponseCode());
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error opening connection for ");
            stringBuilder.append(this.f10091a);
            stringBuilder.append(" with offset ");
            stringBuilder.append(i);
            throw new C1467l(stringBuilder.toString(), e);
        }
    }

    /* renamed from: b */
    public void mo1780b() {
        if (this.f10092b != null) {
            try {
                this.f10092b.disconnect();
            } catch (Throwable e) {
                throw new C1467l("Error disconnecting HttpUrlConnection", e);
            }
        }
    }

    /* renamed from: c */
    public synchronized String m12773c() {
        if (TextUtils.isEmpty(this.f10095e)) {
            m12768d();
        }
        return this.f10095e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HttpUrlSource{url='");
        stringBuilder.append(this.f10091a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
