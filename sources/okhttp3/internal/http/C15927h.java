package okhttp3.internal.http;

import com.tinder.api.ManagerWebServices;
import java.net.Proxy.Type;
import okhttp3.C15963q;
import okhttp3.HttpUrl;

/* renamed from: okhttp3.internal.http.h */
public final class C15927h {
    /* renamed from: a */
    public static String m60281a(C15963q c15963q, Type type) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c15963q.m60527b());
        stringBuilder.append(' ');
        if (C15927h.m60282b(c15963q, type) != null) {
            stringBuilder.append(c15963q.m60526a());
        } else {
            stringBuilder.append(C15927h.m60280a(c15963q.m60526a()));
        }
        stringBuilder.append(" HTTP/1.1");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static boolean m60282b(C15963q c15963q, Type type) {
        return (c15963q.m60533g() == null && type == Type.HTTP) ? true : null;
    }

    /* renamed from: a */
    public static String m60280a(HttpUrl httpUrl) {
        String i = httpUrl.m60012i();
        httpUrl = httpUrl.m60015l();
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
