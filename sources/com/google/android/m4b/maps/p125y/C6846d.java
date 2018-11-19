package com.google.android.m4b.maps.p125y;

import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C6846d;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.y.d */
public abstract class C6846d implements C5572k<Character> {
    /* renamed from: a */
    private static C6846d f25381a = new C77091();
    /* renamed from: b */
    private static final String f25382b;
    /* renamed from: c */
    private static C6846d f25383c = new C7717c("CharMatcher.DIGIT", "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray(), f25382b.toCharArray());
    /* renamed from: d */
    private static C6846d f25384d = new C6846d("CharMatcher.JAVA_DIGIT") {
        /* renamed from: a */
        public final boolean mo7019a(char c) {
            return Character.isDigit(c);
        }
    };
    /* renamed from: e */
    public static final C6846d f25385e = C6846d.m30302a('\u0000', '', "CharMatcher.ASCII");
    /* renamed from: f */
    public static final C6846d f25386f = new C7715a("CharMatcher.NONE") {
        /* renamed from: a */
        public final boolean mo7019a(char c) {
            return false;
        }

        /* renamed from: a */
        public final C6846d mo7583a(C6846d c6846d) {
            return (C6846d) C5571j.m24292a((Object) c6846d);
        }
    };
    /* renamed from: g */
    static final int f25387g = Integer.numberOfLeadingZeros(31);
    /* renamed from: h */
    private static C6846d f25388h = new C6846d("CharMatcher.JAVA_LETTER") {
        /* renamed from: a */
        public final boolean mo7019a(char c) {
            return Character.isLetter(c);
        }
    };
    /* renamed from: i */
    private static C6846d f25389i = new C6846d("CharMatcher.JAVA_LETTER_OR_DIGIT") {
        /* renamed from: a */
        public final boolean mo7019a(char c) {
            return Character.isLetterOrDigit(c);
        }
    };
    /* renamed from: j */
    private static C6846d f25390j = new C6846d("CharMatcher.JAVA_UPPER_CASE") {
        /* renamed from: a */
        public final boolean mo7019a(char c) {
            return Character.isUpperCase(c);
        }
    };
    /* renamed from: k */
    private static C6846d f25391k = new C6846d("CharMatcher.JAVA_LOWER_CASE") {
        /* renamed from: a */
        public final boolean mo7019a(char c) {
            return Character.isLowerCase(c);
        }
    };
    /* renamed from: l */
    private static C6846d f25392l = C6846d.m30301a('\u0000', '\u001f').mo7583a(C6846d.m30301a('', '')).mo7254a("CharMatcher.JAVA_ISO_CONTROL");
    /* renamed from: m */
    private static C6846d f25393m = new C7717c("CharMatcher.INVISIBLE", "\u0000­؀؜۝܏ ᠎   ⁦⁧⁨⁩⁪　?﻿￹￺".toCharArray(), "  ­؄؜۝܏ ᠎‏ ⁤⁦⁧⁨⁩⁯　﻿￹￻".toCharArray());
    /* renamed from: n */
    private static C6846d f25394n = new C7717c("CharMatcher.SINGLE_WIDTH", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
    /* renamed from: o */
    private static C6846d f25395o = new C7715a("CharMatcher.ANY") {
        /* renamed from: a */
        public final boolean mo7019a(char c) {
            return true;
        }

        /* renamed from: a */
        public final C6846d mo7583a(C6846d c6846d) {
            C5571j.m24292a((Object) c6846d);
            return this;
        }
    };
    /* renamed from: q */
    private static C6846d f25396q = new C7715a("WHITESPACE") {
        /* renamed from: a */
        public final boolean mo7019a(char c) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((1682554634 * c) >>> g) == c;
        }
    };
    /* renamed from: p */
    private String f25397p;

    /* renamed from: com.google.android.m4b.maps.y.d$1 */
    static class C77091 extends C6846d {
        /* renamed from: a */
        public final boolean mo7019a(char c) {
            if (!(c == ' ' || c == '' || c == ' ')) {
                if (c == ' ') {
                    return false;
                }
                if (!(c == ' ' || c == '　')) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case '\u000b':
                        case '\f':
                        case '\r':
                            break;
                        default:
                            switch (c) {
                                case ' ':
                                case ' ':
                                    break;
                                default:
                                    return c >= ' ' && c <= ' ';
                            }
                    }
                }
            }
            return true;
        }

        public final String toString() {
            return "CharMatcher.BREAKING_WHITESPACE";
        }

        C77091() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.y.d$a */
    static abstract class C7715a extends C6846d {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo5815a(Object obj) {
            return super.m30307a((Character) obj);
        }

        C7715a(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.android.m4b.maps.y.d$b */
    static class C7716b extends C6846d {
        /* renamed from: a */
        private C6846d f28187a;
        /* renamed from: b */
        private C6846d f28188b;

        private C7716b(C6846d c6846d, C6846d c6846d2, String str) {
            super(str);
            this.f28187a = (C6846d) C5571j.m24292a((Object) c6846d);
            this.f28188b = (C6846d) C5571j.m24292a((Object) c6846d2);
        }

        C7716b(C6846d c6846d, C6846d c6846d2) {
            StringBuilder stringBuilder = new StringBuilder("CharMatcher.or(");
            stringBuilder.append(c6846d);
            stringBuilder.append(", ");
            stringBuilder.append(c6846d2);
            stringBuilder.append(")");
            this(c6846d, c6846d2, stringBuilder.toString());
        }

        /* renamed from: a */
        public final boolean mo7019a(char c) {
            if (!this.f28187a.mo7019a(c)) {
                if (this.f28188b.mo7019a(c) == '\u0000') {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        final C6846d mo7254a(String str) {
            return new C7716b(this.f28187a, this.f28188b, str);
        }
    }

    /* renamed from: com.google.android.m4b.maps.y.d$c */
    static class C7717c extends C6846d {
        /* renamed from: a */
        private final char[] f28189a;
        /* renamed from: b */
        private final char[] f28190b;

        C7717c(String str, char[] cArr, char[] cArr2) {
            super(str);
            this.f28189a = cArr;
            this.f28190b = cArr2;
            C5571j.m24297a(cArr.length == cArr2.length ? true : null);
            str = null;
            while (str < cArr.length) {
                C5571j.m24297a(cArr[str] <= cArr2[str]);
                int i = str + 1;
                if (i < cArr.length) {
                    C5571j.m24297a(cArr2[str] < cArr[i] ? true : null);
                }
                str = i;
            }
        }

        /* renamed from: a */
        public final boolean mo7019a(char c) {
            int binarySearch = Arrays.binarySearch(this.f28189a, c);
            if (binarySearch >= 0) {
                return true;
            }
            binarySearch = (binarySearch ^ -1) - 1;
            if (binarySearch < 0 || c > this.f28190b[binarySearch]) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public abstract boolean mo7019a(char c);

    static {
        StringBuilder stringBuilder = new StringBuilder(31);
        for (int i = 0; i < 31; i++) {
            stringBuilder.append((char) ("0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".charAt(i) + 9));
        }
        f25382b = stringBuilder.toString();
    }

    /* renamed from: b */
    private static String m30303b(char c) {
        String str = "0123456789ABCDEF";
        char[] cArr = new char[]{'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = str.charAt(c & 15);
            c = (char) (c >> '\u0004');
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: a */
    private static C6846d m30301a(char c, char c2) {
        C5571j.m24297a(c2 >= c);
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.inRange('");
        stringBuilder.append(C6846d.m30303b(c));
        stringBuilder.append("', '");
        stringBuilder.append(C6846d.m30303b(c2));
        stringBuilder.append("')");
        return C6846d.m30302a(c, c2, stringBuilder.toString());
    }

    /* renamed from: a */
    private static C6846d m30302a(final char c, final char c2, String str) {
        return new C7715a(str) {
            /* renamed from: a */
            public final boolean mo7019a(char c) {
                return c <= c && c <= c2;
            }
        };
    }

    C6846d(String str) {
        this.f25397p = str;
    }

    protected C6846d() {
        this.f25397p = super.toString();
    }

    /* renamed from: a */
    public C6846d mo7583a(C6846d c6846d) {
        return new C7716b(this, (C6846d) C5571j.m24292a((Object) c6846d));
    }

    /* renamed from: a */
    C6846d mo7254a(String str) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: a */
    public final boolean m30307a(Character ch) {
        return mo7019a(ch.charValue());
    }

    public String toString() {
        return this.f25397p;
    }
}
