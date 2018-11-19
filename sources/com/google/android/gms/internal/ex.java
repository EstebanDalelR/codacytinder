package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public abstract class ex implements zzaq {
    /* renamed from: a */
    public abstract ma mo6862a(aom<?> aom, Map<String, String> map) throws IOException, zza;

    @Deprecated
    public final HttpResponse zzb(aom<?> aom, Map<String, String> map) throws IOException, zza {
        ma a = mo6862a(aom, map);
        HttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.m20039a(), ""));
        List arrayList = new ArrayList();
        for (ajr ajr : a.m20040b()) {
            arrayList.add(new BasicHeader(ajr.m19223a(), ajr.m19224b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream d = a.m20042d();
        if (d != null) {
            HttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(d);
            basicHttpEntity.setContentLength((long) a.m20041c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
