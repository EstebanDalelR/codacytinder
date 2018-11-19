package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.C6049f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: com.squareup.okhttp.n */
public final class C6066n {
    /* renamed from: a */
    private final String[] f22223a;

    /* renamed from: com.squareup.okhttp.n$a */
    public static final class C6065a {
        /* renamed from: a */
        private final List<String> f22222a = new ArrayList(20);

        /* renamed from: a */
        C6065a m26275a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return m26279b(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return m26279b("", str.substring(1));
            }
            return m26279b("", str);
        }

        /* renamed from: a */
        public C6065a m26276a(String str, String str2) {
            m26274d(str, str2);
            return m26279b(str, str2);
        }

        /* renamed from: b */
        C6065a m26279b(String str, String str2) {
            this.f22222a.add(str);
            this.f22222a.add(str2.trim());
            return this;
        }

        /* renamed from: b */
        public C6065a m26278b(String str) {
            int i = 0;
            while (i < this.f22222a.size()) {
                if (str.equalsIgnoreCase((String) this.f22222a.get(i))) {
                    this.f22222a.remove(i);
                    this.f22222a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: c */
        public C6065a m26280c(String str, String str2) {
            m26274d(str, str2);
            m26278b(str);
            m26279b(str, str2);
            return this;
        }

        /* renamed from: d */
        private void m26274d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            } else {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (charAt > '\u001f') {
                        if (charAt < '') {
                            i++;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                }
                if (str2 == null) {
                    throw new IllegalArgumentException("value == null");
                }
                str = str2.length();
                length = 0;
                while (length < str) {
                    char charAt2 = str2.charAt(length);
                    if (charAt2 > '\u001f') {
                        if (charAt2 < '') {
                            length++;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(length), str2}));
                }
            }
        }

        /* renamed from: a */
        public C6066n m26277a() {
            return new C6066n();
        }
    }

    private C6066n(C6065a c6065a) {
        this.f22223a = (String[]) c6065a.f22222a.toArray(new String[c6065a.f22222a.size()]);
    }

    /* renamed from: a */
    public String m26284a(String str) {
        return C6066n.m26281a(this.f22223a, str);
    }

    /* renamed from: b */
    public Date m26287b(String str) {
        str = m26284a(str);
        return str != null ? C6049f.m26164a(str) : null;
    }

    /* renamed from: a */
    public int m26282a() {
        return this.f22223a.length / 2;
    }

    /* renamed from: a */
    public String m26283a(int i) {
        i *= 2;
        if (i >= 0) {
            if (i < this.f22223a.length) {
                return this.f22223a[i];
            }
        }
        return 0;
    }

    /* renamed from: b */
    public String m26286b(int i) {
        i = (i * 2) + 1;
        if (i >= 0) {
            if (i < this.f22223a.length) {
                return this.f22223a[i];
            }
        }
        return 0;
    }

    /* renamed from: c */
    public List<String> m26288c(String str) {
        int a = m26282a();
        List list = null;
        for (int i = 0; i < a; i++) {
            if (str.equalsIgnoreCase(m26283a(i))) {
                if (list == null) {
                    list = new ArrayList(2);
                }
                list.add(m26286b(i));
            }
        }
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return Collections.emptyList();
    }

    /* renamed from: b */
    public C6065a m26285b() {
        C6065a c6065a = new C6065a();
        Collections.addAll(c6065a.f22222a, this.f22223a);
        return c6065a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int a = m26282a();
        for (int i = 0; i < a; i++) {
            stringBuilder.append(m26283a(i));
            stringBuilder.append(": ");
            stringBuilder.append(m26286b(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m26281a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }
}
