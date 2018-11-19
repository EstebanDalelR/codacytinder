package com.facebook.ads.internal.p043j.p044a;

import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.j.a.g */
public class C3300g implements C1444r {
    /* renamed from: a */
    private void m12735a(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String str2 : (List) map.get(str)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(":");
                    stringBuilder.append(str2);
                    mo1763a(stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1762a(C1440n c1440n) {
        if (c1440n != null) {
            mo1763a("=== HTTP Response ===");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Receive url: ");
            stringBuilder.append(c1440n.m5043b());
            mo1763a(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("Status: ");
            stringBuilder.append(c1440n.m5042a());
            mo1763a(stringBuilder.toString());
            m12735a(c1440n.m5044c());
            stringBuilder = new StringBuilder();
            stringBuilder.append("Content:\n");
            stringBuilder.append(c1440n.m5046e());
            mo1763a(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void mo1763a(String str) {
        System.out.println(str);
    }

    /* renamed from: a */
    public void mo1764a(HttpURLConnection httpURLConnection, Object obj) {
        mo1763a("=== HTTP Request ===");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(httpURLConnection.getRequestMethod());
        stringBuilder.append(" ");
        stringBuilder.append(httpURLConnection.getURL().toString());
        mo1763a(stringBuilder.toString());
        if (obj instanceof String) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Content: ");
            stringBuilder.append((String) obj);
            mo1763a(stringBuilder.toString());
        }
        m12735a(httpURLConnection.getRequestProperties());
    }

    /* renamed from: a */
    public boolean mo1765a() {
        return false;
    }
}
