package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.l */
public final class C15957l {
    /* renamed from: a */
    private final String[] f49508a;

    /* renamed from: okhttp3.l$a */
    public static final class C15956a {
        /* renamed from: a */
        final List<String> f49507a = new ArrayList(20);

        /* renamed from: a */
        C15956a m60464a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return m60468b(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return m60468b("", str.substring(1));
            }
            return m60468b("", str);
        }

        /* renamed from: a */
        public C15956a m60465a(String str, String str2) {
            m60463d(str, str2);
            return m60468b(str, str2);
        }

        /* renamed from: b */
        C15956a m60468b(String str, String str2) {
            this.f49507a.add(str);
            this.f49507a.add(str2.trim());
            return this;
        }

        /* renamed from: b */
        public C15956a m60467b(String str) {
            int i = 0;
            while (i < this.f49507a.size()) {
                if (str.equalsIgnoreCase((String) this.f49507a.get(i))) {
                    this.f49507a.remove(i);
                    this.f49507a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: c */
        public C15956a m60470c(String str, String str2) {
            m60463d(str, str2);
            m60467b(str);
            m60468b(str, str2);
            return this;
        }

        /* renamed from: d */
        private void m60463d(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            } else {
                char charAt;
                int length = str.length();
                int i = 0;
                while (i < length) {
                    charAt = str.charAt(i);
                    if (charAt > ' ') {
                        if (charAt < '') {
                            i++;
                        }
                    }
                    throw new IllegalArgumentException(C15908c.m60157a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
                if (str2 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("value for name ");
                    stringBuilder.append(str);
                    stringBuilder.append(" == null");
                    throw new NullPointerException(stringBuilder.toString());
                }
                length = str2.length();
                i = 0;
                while (i < length) {
                    charAt = str2.charAt(i);
                    if ((charAt > '\u001f' || charAt == '\t') && charAt < '') {
                        i++;
                    } else {
                        throw new IllegalArgumentException(C15908c.m60157a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str, str2));
                    }
                }
            }
        }

        /* renamed from: c */
        public String m60469c(String str) {
            for (int size = this.f49507a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) this.f49507a.get(size))) {
                    return (String) this.f49507a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: a */
        public C15957l m60466a() {
            return new C15957l(this);
        }
    }

    C15957l(C15956a c15956a) {
        this.f49508a = (String[]) c15956a.f49507a.toArray(new String[c15956a.f49507a.size()]);
    }

    private C15957l(String[] strArr) {
        this.f49508a = strArr;
    }

    @Nullable
    /* renamed from: a */
    public String m60475a(String str) {
        return C15957l.m60471a(this.f49508a, str);
    }

    /* renamed from: a */
    public int m60473a() {
        return this.f49508a.length / 2;
    }

    /* renamed from: a */
    public String m60474a(int i) {
        return this.f49508a[i * 2];
    }

    /* renamed from: b */
    public String m60476b(int i) {
        return this.f49508a[(i * 2) + 1];
    }

    /* renamed from: b */
    public List<String> m60477b(String str) {
        int a = m60473a();
        List list = null;
        for (int i = 0; i < a; i++) {
            if (str.equalsIgnoreCase(m60474a(i))) {
                if (list == null) {
                    list = new ArrayList(2);
                }
                list.add(m60476b(i));
            }
        }
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return Collections.emptyList();
    }

    /* renamed from: b */
    public C15956a m60478b() {
        C15956a c15956a = new C15956a();
        Collections.addAll(c15956a.f49507a, this.f49508a);
        return c15956a;
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof C15957l) || Arrays.equals(((C15957l) obj).f49508a, this.f49508a) == null) ? null : true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f49508a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int a = m60473a();
        for (int i = 0; i < a; i++) {
            stringBuilder.append(m60474a(i));
            stringBuilder.append(": ");
            stringBuilder.append(m60476b(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m60471a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C15957l m60472a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        } else {
            int i;
            strArr = (String[]) strArr.clone();
            for (i = 0; i < strArr.length; i++) {
                if (strArr[i] == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i] = strArr[i].trim();
            }
            i = 0;
            while (i < strArr.length) {
                String str = strArr[i];
                String str2 = strArr[i + 1];
                if (str.length() != 0 && str.indexOf(0) == -1) {
                    if (str2.indexOf(0) == -1) {
                        i += 2;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected header: ");
                stringBuilder.append(str);
                stringBuilder.append(": ");
                stringBuilder.append(str2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return new C15957l(strArr);
        }
    }
}
