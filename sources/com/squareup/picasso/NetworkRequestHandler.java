package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.squareup.picasso.C6107q.C6106a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;
import java.io.InputStream;

class NetworkRequestHandler extends C6107q {
    /* renamed from: a */
    private final Downloader f26143a;
    /* renamed from: b */
    private final C6110s f26144b;

    static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    int mo6573a() {
        return 2;
    }

    /* renamed from: b */
    boolean mo6577b() {
        return true;
    }

    public NetworkRequestHandler(Downloader downloader, C6110s c6110s) {
        this.f26143a = downloader;
        this.f26144b = c6110s;
    }

    /* renamed from: a */
    public boolean mo6575a(C6104o c6104o) {
        c6104o = c6104o.f22430d.getScheme();
        if (!"http".equals(c6104o)) {
            if ("https".equals(c6104o) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public C6106a mo6574a(C6104o c6104o, int i) throws IOException {
        c6104o = this.f26143a.load(c6104o.f22430d, c6104o.f22429c);
        if (c6104o == null) {
            return null;
        }
        LoadedFrom loadedFrom = c6104o.f22299c ? LoadedFrom.DISK : LoadedFrom.NETWORK;
        Bitmap b = c6104o.m26419b();
        if (b != null) {
            return new C6106a(b, loadedFrom);
        }
        InputStream a = c6104o.m26418a();
        if (a == null) {
            return null;
        }
        if (loadedFrom == LoadedFrom.DISK && c6104o.m26420c() == 0) {
            C6120v.m26577a(a);
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == LoadedFrom.NETWORK && c6104o.m26420c() > 0) {
            this.f26144b.m26547a(c6104o.m26420c());
        }
        return new C6106a(a, loadedFrom);
    }

    /* renamed from: a */
    boolean mo6576a(boolean z, NetworkInfo networkInfo) {
        if (networkInfo != null) {
            if (!networkInfo.isConnected()) {
                return false;
            }
        }
        return true;
    }
}
