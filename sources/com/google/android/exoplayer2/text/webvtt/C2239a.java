package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.C2293d;
import com.google.android.exoplayer2.util.C2302k;
import com.tinder.api.ManagerWebServices;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.webvtt.a */
final class C2239a {
    /* renamed from: a */
    private static final Pattern f6623a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    /* renamed from: b */
    private final C2302k f6624b = new C2302k();
    /* renamed from: c */
    private final StringBuilder f6625c = new StringBuilder();

    /* renamed from: a */
    public WebvttCssStyle m8066a(C2302k c2302k) {
        this.f6625c.setLength(0);
        int d = c2302k.m8389d();
        C2239a.m8061c(c2302k);
        this.f6624b.m8383a(c2302k.f6929a, c2302k.m8389d());
        this.f6624b.m8388c(d);
        String b = C2239a.m8058b(this.f6624b, this.f6625c);
        WebvttCssStyle webvttCssStyle = null;
        if (b != null) {
            if ("{".equals(C2239a.m8055a(this.f6624b, this.f6625c))) {
                WebvttCssStyle webvttCssStyle2 = new WebvttCssStyle();
                m8056a(webvttCssStyle2, b);
                Object obj = null;
                c2302k = null;
                while (c2302k == null) {
                    C2302k c2302k2;
                    c2302k = this.f6624b.m8389d();
                    obj = C2239a.m8055a(this.f6624b, this.f6625c);
                    if (obj != null) {
                        if (!"}".equals(obj)) {
                            c2302k2 = null;
                            if (c2302k2 == null) {
                                this.f6624b.m8388c(c2302k);
                                C2239a.m8057a(this.f6624b, webvttCssStyle2, this.f6625c);
                            }
                            c2302k = c2302k2;
                        }
                    }
                    c2302k2 = true;
                    if (c2302k2 == null) {
                        this.f6624b.m8388c(c2302k);
                        C2239a.m8057a(this.f6624b, webvttCssStyle2, this.f6625c);
                    }
                    c2302k = c2302k2;
                }
                if ("}".equals(obj) != null) {
                    webvttCssStyle = webvttCssStyle2;
                }
                return webvttCssStyle;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m8058b(C2302k c2302k, StringBuilder stringBuilder) {
        C2239a.m8059b(c2302k);
        if (c2302k.m8385b() < 5) {
            return null;
        }
        if (!"::cue".equals(c2302k.m8392e(5))) {
            return null;
        }
        int d = c2302k.m8389d();
        String a = C2239a.m8055a(c2302k, stringBuilder);
        if (a == null) {
            return null;
        }
        if ("{".equals(a)) {
            c2302k.m8388c(d);
            return "";
        }
        String d2 = "(".equals(a) ? C2239a.m8062d(c2302k) : null;
        c2302k = C2239a.m8055a(c2302k, stringBuilder);
        if (")".equals(c2302k) != null) {
            if (c2302k != null) {
                return d2;
            }
        }
        return null;
    }

    /* renamed from: d */
    private static String m8062d(C2302k c2302k) {
        int d = c2302k.m8389d();
        int c = c2302k.m8387c();
        Object obj = null;
        while (d < c && r3 == null) {
            int i = d + 1;
            obj = ((char) c2302k.f6929a[d]) == ')' ? 1 : null;
            d = i;
        }
        return c2302k.m8392e((d - 1) - c2302k.m8389d()).trim();
    }

    /* renamed from: a */
    private static void m8057a(C2302k c2302k, WebvttCssStyle webvttCssStyle, StringBuilder stringBuilder) {
        C2239a.m8059b(c2302k);
        String d = C2239a.m8063d(c2302k, stringBuilder);
        if (!"".equals(d) && ":".equals(C2239a.m8055a(c2302k, stringBuilder))) {
            C2239a.m8059b(c2302k);
            String c = C2239a.m8060c(c2302k, stringBuilder);
            if (c != null) {
                if (!"".equals(c)) {
                    int d2 = c2302k.m8389d();
                    stringBuilder = C2239a.m8055a(c2302k, stringBuilder);
                    if (!";".equals(stringBuilder)) {
                        if ("}".equals(stringBuilder) != null) {
                            c2302k.m8388c(d2);
                        } else {
                            return;
                        }
                    }
                    if (ManagerWebServices.PARAM_BADGE_COLOR.equals(d) != null) {
                        webvttCssStyle.m8032a(C2293d.m8331b(c));
                    } else if ("background-color".equals(d) != null) {
                        webvttCssStyle.m8038b(C2293d.m8331b(c));
                    } else if ("text-decoration".equals(d) != null) {
                        if ("underline".equals(c) != null) {
                            webvttCssStyle.m8033a(true);
                        }
                    } else if ("font-family".equals(d) != null) {
                        webvttCssStyle.m8044d(c);
                    } else if ("font-weight".equals(d) != null) {
                        if ("bold".equals(c) != null) {
                            webvttCssStyle.m8039b(true);
                        }
                    } else if (!("font-style".equals(d) == null || "italic".equals(c) == null)) {
                        webvttCssStyle.m8041c(true);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    static void m8059b(C2302k c2302k) {
        while (true) {
            Object obj = 1;
            while (c2302k.m8385b() > 0 && r1 != null) {
                if (!C2239a.m8064e(c2302k)) {
                    if (!C2239a.m8065f(c2302k)) {
                        obj = null;
                    }
                }
            }
            return;
        }
    }

    /* renamed from: a */
    static String m8055a(C2302k c2302k, StringBuilder stringBuilder) {
        C2239a.m8059b(c2302k);
        if (c2302k.m8385b() == 0) {
            return null;
        }
        stringBuilder = C2239a.m8063d(c2302k, stringBuilder);
        if (!"".equals(stringBuilder)) {
            return stringBuilder;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append((char) c2302k.m8395g());
        return stringBuilder.toString();
    }

    /* renamed from: e */
    private static boolean m8064e(C2302k c2302k) {
        switch (C2239a.m8054a(c2302k, c2302k.m8389d())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c2302k.m8390d(1);
                return true;
            default:
                return null;
        }
    }

    /* renamed from: c */
    static void m8061c(C2302k c2302k) {
        do {
        } while (!TextUtils.isEmpty(c2302k.m8414z()));
    }

    /* renamed from: a */
    private static char m8054a(C2302k c2302k, int i) {
        return (char) c2302k.f6929a[i];
    }

    /* renamed from: c */
    private static String m8060c(C2302k c2302k, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder();
        Object obj = null;
        while (obj == null) {
            int d = c2302k.m8389d();
            String a = C2239a.m8055a(c2302k, stringBuilder);
            if (a == null) {
                return null;
            }
            if (!"}".equals(a)) {
                if (!";".equals(a)) {
                    stringBuilder2.append(a);
                }
            }
            c2302k.m8388c(d);
            obj = 1;
        }
        return stringBuilder2.toString();
    }

    /* renamed from: f */
    private static boolean m8065f(C2302k c2302k) {
        int d = c2302k.m8389d();
        int c = c2302k.m8387c();
        byte[] bArr = c2302k.f6929a;
        if (d + 2 <= c) {
            int i = d + 1;
            if (bArr[d] == (byte) 47) {
                d = i + 1;
                if (bArr[i] == (byte) 42) {
                    while (true) {
                        i = d + 1;
                        if (i >= c) {
                            c2302k.m8390d(c - c2302k.m8389d());
                            return true;
                        } else if (((char) bArr[d]) == '*' && ((char) bArr[i]) == '/') {
                            d = i + 1;
                            c = d;
                        } else {
                            d = i;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static String m8063d(C2302k c2302k, StringBuilder stringBuilder) {
        int i = 0;
        stringBuilder.setLength(0);
        int d = c2302k.m8389d();
        int c = c2302k.m8387c();
        while (d < c && r0 == 0) {
            char c2 = (char) c2302k.f6929a[d];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.'))) {
                if (c2 != '_') {
                    i = 1;
                }
            }
            d++;
            stringBuilder.append(c2);
        }
        c2302k.m8390d(d - c2302k.m8389d());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void m8056a(WebvttCssStyle webvttCssStyle, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f6623a.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    webvttCssStyle.m8042c(matcher.group(1));
                }
                str = str.substring(0, indexOf);
            }
            str = str.split("\\.");
            String str2 = str[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                webvttCssStyle.m8040b(str2.substring(0, indexOf2));
                webvttCssStyle.m8035a(str2.substring(indexOf2 + 1));
            } else {
                webvttCssStyle.m8040b(str2);
            }
            if (str.length > 1) {
                webvttCssStyle.m8036a((String[]) Arrays.copyOfRange(str, 1, str.length));
            }
        }
    }
}
