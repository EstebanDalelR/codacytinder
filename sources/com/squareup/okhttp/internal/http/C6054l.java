package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.HttpUrl;
import com.tinder.api.ManagerWebServices;
import java.net.Proxy.Type;

/* renamed from: com.squareup.okhttp.internal.http.l */
public final class C6054l {
    /* renamed from: a */
    static String m26222a(C6071q c6071q, Type type) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c6071q.m26348d());
        stringBuilder.append(' ');
        if (C6054l.m26223b(c6071q, type) != null) {
            stringBuilder.append(c6071q.m26343a());
        } else {
            stringBuilder.append(C6054l.m26221a(c6071q.m26343a()));
        }
        stringBuilder.append(" HTTP/1.1");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static boolean m26223b(C6071q c6071q, Type type) {
        return (c6071q.m26353i() == null && type == Type.HTTP) ? true : null;
    }

    /* renamed from: a */
    public static String m26221a(HttpUrl httpUrl) {
        String i = httpUrl.m25746i();
        httpUrl = httpUrl.m25748k();
        if (httpUrl == null) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
        stringBuilder.append(httpUrl);
        return stringBuilder.toString();
    }
}
