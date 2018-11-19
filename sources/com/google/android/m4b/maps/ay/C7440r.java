package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.m4b.maps.p101a.C4525k;
import com.google.android.m4b.maps.p102b.C4739e;
import com.google.android.m4b.maps.p119s.C5518a;
import com.google.android.m4b.maps.p119s.C5518a.C6767a;
import com.tinder.api.ManagerWebServices;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.google.android.m4b.maps.ay.r */
public class C7440r extends C6408c<C5518a> implements C4739e {
    /* renamed from: a */
    private static final String f27249a = "r";

    public C7440r(Context context, String str) {
        super(context, str, "com.google.android.gms.maps.service.HttpProxyService", 5000, Executors.newScheduledThreadPool(0), C4712d.m20955a());
    }

    /* renamed from: a */
    public final HttpResponse mo4903a(C4525k<?> c4525k, Map<String, String> map) {
        String str;
        int a = c4525k.m20422a();
        switch (a) {
            case 0:
                str = "GET";
                break;
            case 1:
                str = "POST";
                break;
            default:
                if (C4728u.m21050a(f27249a, 6)) {
                    String str2 = f27249a;
                    StringBuilder stringBuilder = new StringBuilder(34);
                    stringBuilder.append("Unexpected URL method: ");
                    stringBuilder.append(a);
                    Log.e(str2, stringBuilder.toString());
                }
                str = "";
                break;
        }
        Serializable hashMap = new HashMap(c4525k.mo4887h());
        hashMap.putAll(map);
        map = c4525k.m20434c();
        c4525k = c4525k.mo4889k();
        Bundle bundle = new Bundle();
        bundle.putString("REQUEST_METHOD", str);
        bundle.putString("REQUEST_URL", map);
        bundle.putSerializable("REQUEST_HEADERS", hashMap);
        bundle.putSerializable("REQUEST_DATA", c4525k);
        c4525k = m32031a(bundle);
        if (c4525k == null) {
            return new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), 500, "Internal Server Error"));
        }
        ProtocolVersion protocolVersion = (ProtocolVersion) c4525k.getSerializable("RESPONSE_PROTOCOL_VERSION");
        if (protocolVersion == null) {
            protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        }
        HttpResponse basicHttpResponse = new BasicHttpResponse(protocolVersion, c4525k.getInt("RESPONSE_STATUS_CODE"), c4525k.getString("RESPONSE_STATUS_REASON"));
        byte[] bArr = (byte[]) c4525k.getSerializable("RESPONSE_DATA");
        if (bArr != null) {
            HttpEntity basicHttpEntity = new BasicHttpEntity();
            str2 = c4525k.getString("RESPONSE_CONTENT_TYPE");
            c4525k = c4525k.getString("RESPONSE_CONTENT_ENCODING");
            basicHttpEntity.setContent(new ByteArrayInputStream(bArr));
            basicHttpEntity.setContentLength((long) bArr.length);
            basicHttpEntity.setContentType(str2);
            if (c4525k != null) {
                basicHttpEntity.setContentEncoding(c4525k);
            }
            basicHttpResponse.setEntity(basicHttpEntity);
            basicHttpResponse.addHeader(ManagerWebServices.PARAM_CONTENT_TYPE, str2);
        }
        return basicHttpResponse;
    }

    /* renamed from: a */
    private android.os.Bundle m32031a(final android.os.Bundle r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = new com.google.android.m4b.maps.ay.r$1;
        r0.<init>(r3, r4);
        r4 = r3.mo4877a(r0);
        r0 = 0;
        r4 = r4.get();	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0011 }
        r4 = (android.os.Bundle) r4;	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0011 }
        return r4;
    L_0x0011:
        r4 = move-exception;
        r1 = f27249a;
        r2 = 6;
        r1 = com.google.android.m4b.maps.ay.C4728u.m21050a(r1, r2);
        if (r1 == 0) goto L_0x0026;
    L_0x001b:
        r1 = f27249a;
        r2 = "Error while executing http request through proxy.";
        r4 = r4.getCause();
        android.util.Log.e(r1, r2, r4);
    L_0x0026:
        return r0;
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.r.a(android.os.Bundle):android.os.Bundle");
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo4863a(IBinder iBinder) {
        return C6767a.m30134a(iBinder);
    }
}
