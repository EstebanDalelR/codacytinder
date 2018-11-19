package com.facebook.ads.internal.p043j.p044a;

import com.tinder.api.ManagerWebServices;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.facebook.ads.internal.j.a.f */
public abstract class C3299f implements C1443q {
    /* renamed from: a */
    private final C1444r f10078a;

    public C3299f() {
        this(new C3300g());
    }

    public C3299f(C1444r c1444r) {
        this.f10078a = c1444r;
    }

    /* renamed from: a */
    public OutputStream mo1755a(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getOutputStream();
    }

    /* renamed from: a */
    public HttpURLConnection mo1756a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }

    /* renamed from: a */
    public void mo1757a(OutputStream outputStream, byte[] bArr) {
        outputStream.write(bArr);
    }

    /* renamed from: a */
    public void mo1758a(HttpURLConnection httpURLConnection, C1437j c1437j, String str) {
        httpURLConnection.setRequestMethod(c1437j.m5036c());
        httpURLConnection.setDoOutput(c1437j.m5035b());
        httpURLConnection.setDoInput(c1437j.m5034a());
        if (str != null) {
            httpURLConnection.setRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, str);
        }
        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
    }

    /* renamed from: a */
    public boolean mo1759a(C1439m c1439m) {
        C1440n a = c1439m.m5041a();
        if (this.f10078a.mo1765a()) {
            this.f10078a.mo1763a("BasicRequestHandler.onError got");
            c1439m.printStackTrace();
        }
        return a != null && a.m5042a() > 0;
    }

    /* renamed from: a */
    public byte[] mo1760a(InputStream inputStream) {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: b */
    public InputStream mo1761b(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getInputStream();
    }
}
