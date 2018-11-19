package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.C6006f;
import com.squareup.okhttp.C6066n;
import com.squareup.okhttp.C6066n.C6065a;
import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.internal.C6040g;
import com.squareup.okhttp.internal.C6058i;
import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.squareup.okhttp.internal.http.j */
public final class C6053j {
    /* renamed from: a */
    static final String f22186a = C6040g.m26108a().m26116b();
    /* renamed from: b */
    public static final String f22187b;
    /* renamed from: c */
    public static final String f22188c;
    /* renamed from: d */
    public static final String f22189d;
    /* renamed from: e */
    private static final Comparator<String> f22190e = new C60521();

    /* renamed from: com.squareup.okhttp.internal.http.j$1 */
    static class C60521 implements Comparator<String> {
        C60521() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m26203a((String) obj, (String) obj2);
        }

        /* renamed from: a */
        public int m26203a(String str, String str2) {
            if (str == str2) {
                return null;
            }
            if (str == null) {
                return -1;
            }
            return str2 == null ? 1 : String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f22186a);
        stringBuilder.append("-Sent-Millis");
        f22187b = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f22186a);
        stringBuilder.append("-Received-Millis");
        f22188c = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f22186a);
        stringBuilder.append("-Selected-Protocol");
        f22189d = stringBuilder.toString();
    }

    /* renamed from: a */
    public static long m26205a(C6071q c6071q) {
        return C6053j.m26204a(c6071q.m26349e());
    }

    /* renamed from: a */
    public static long m26206a(C6075s c6075s) {
        return C6053j.m26204a(c6075s.m26401g());
    }

    /* renamed from: a */
    public static long m26204a(C6066n c6066n) {
        return C6053j.m26214b(c6066n.m26284a("Content-Length"));
    }

    /* renamed from: b */
    private static long m26214b(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = -1;
        if (r4 != 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x000a }
        return r2;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.j.b(java.lang.String):long");
    }

    /* renamed from: a */
    public static Map<String, List<String>> m26210a(C6066n c6066n, String str) {
        Map treeMap = new TreeMap(f22190e);
        int a = c6066n.m26282a();
        for (int i = 0; i < a; i++) {
            String a2 = c6066n.m26283a(i);
            String b = c6066n.m26286b(i);
            List arrayList = new ArrayList();
            List list = (List) treeMap.get(a2);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(b);
            treeMap.put(a2, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    /* renamed from: a */
    public static void m26211a(C6070a c6070a, Map<String, List<String>> map) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            String str = (String) entry.getKey();
            if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && !((List) entry.getValue()).isEmpty()) {
                c6070a.m26337b(str, C6053j.m26209a((List) entry.getValue()));
            }
        }
    }

    /* renamed from: a */
    private static String m26209a(List<String> list) {
        int i = 0;
        if (list.size() == 1) {
            return (String) list.get(0);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int size = list.size();
        while (i < size) {
            if (i > 0) {
                stringBuilder.append("; ");
            }
            stringBuilder.append((String) list.get(i));
            i++;
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static boolean m26212a(C6075s c6075s, C6066n c6066n, C6071q c6071q) {
        for (String str : C6053j.m26220d(c6075s)) {
            if (!C6058i.m26251a(c6066n.m26288c(str), c6071q.m26346b(str))) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m26217b(C6075s c6075s) {
        return C6053j.m26216b(c6075s.m26401g());
    }

    /* renamed from: b */
    public static boolean m26216b(C6066n c6066n) {
        return C6053j.m26219c(c6066n).contains("*");
    }

    /* renamed from: d */
    private static Set<String> m26220d(C6075s c6075s) {
        return C6053j.m26219c(c6075s.m26401g());
    }

    /* renamed from: c */
    public static Set<String> m26219c(C6066n c6066n) {
        Set<String> emptySet = Collections.emptySet();
        int a = c6066n.m26282a();
        Set<String> set = emptySet;
        for (int i = 0; i < a; i++) {
            if ("Vary".equalsIgnoreCase(c6066n.m26283a(i))) {
                String b = c6066n.m26286b(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : b.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }

    /* renamed from: c */
    public static C6066n m26218c(C6075s c6075s) {
        return C6053j.m26207a(c6075s.m26404j().m26393a().m26349e(), c6075s.m26401g());
    }

    /* renamed from: a */
    public static C6066n m26207a(C6066n c6066n, C6066n c6066n2) {
        c6066n2 = C6053j.m26219c(c6066n2);
        if (c6066n2.isEmpty()) {
            return new C6065a().m26277a();
        }
        C6065a c6065a = new C6065a();
        int a = c6066n.m26282a();
        for (int i = 0; i < a; i++) {
            String a2 = c6066n.m26283a(i);
            if (c6066n2.contains(a2)) {
                c6065a.m26276a(a2, c6066n.m26286b(i));
            }
        }
        return c6065a.m26277a();
    }

    /* renamed from: a */
    static boolean m26213a(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str) != null) ? null : true;
    }

    /* renamed from: b */
    public static List<C6006f> m26215b(C6066n c6066n, String str) {
        List<C6006f> arrayList = new ArrayList();
        int a = c6066n.m26282a();
        for (int i = 0; i < a; i++) {
            if (str.equalsIgnoreCase(c6066n.m26283a(i))) {
                String b = c6066n.m26286b(i);
                int i2 = 0;
                while (i2 < b.length()) {
                    int a2 = C6045d.m26134a(b, i2, " ");
                    String trim = b.substring(i2, a2).trim();
                    int a3 = C6045d.m26133a(b, a2);
                    if (!b.regionMatches(true, a3, "realm=\"", 0, "realm=\"".length())) {
                        break;
                    }
                    a3 += "realm=\"".length();
                    i2 = C6045d.m26134a(b, a3, "\"");
                    String substring = b.substring(a3, i2);
                    i2 = C6045d.m26133a(b, C6045d.m26134a(b, i2 + 1, ",") + 1);
                    arrayList.add(new C6006f(trim, substring));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C6071q m26208a(Authenticator authenticator, C6075s c6075s, Proxy proxy) throws IOException {
        if (c6075s.m26397c() == 407) {
            return authenticator.authenticateProxy(proxy, c6075s);
        }
        return authenticator.authenticate(proxy, c6075s);
    }
}
