package com.google.android.gms.internal;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

final class dw extends ex {
    /* renamed from: a */
    private final zzaq f26883a;

    dw(zzaq zzaq) {
        this.f26883a = zzaq;
    }

    /* renamed from: a */
    public final ma mo6862a(aom<?> aom, Map<String, String> map) throws IOException, zza {
        try {
            HttpResponse zzb = this.f26883a.zzb(aom, map);
            int statusCode = zzb.getStatusLine().getStatusCode();
            Header[] allHeaders = zzb.getAllHeaders();
            List arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new ajr(header.getName(), header.getValue()));
            }
            if (zzb.getEntity() == null) {
                return new ma(statusCode, arrayList);
            }
            long contentLength = zzb.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new ma(statusCode, arrayList, (int) zzb.getEntity().getContentLength(), zzb.getEntity().getContent());
            }
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Response too large: ");
            stringBuilder.append(contentLength);
            throw new IOException(stringBuilder.toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
