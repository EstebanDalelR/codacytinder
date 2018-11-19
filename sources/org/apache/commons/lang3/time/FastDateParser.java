package org.apache.commons.lang3.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

public class FastDateParser implements Serializable, DateParser {
    /* renamed from: a */
    static final Locale f55143a = new Locale("ja", "JP", "JP");
    /* renamed from: h */
    private static final Comparator<String> f55144h = new C159941();
    /* renamed from: i */
    private static final ConcurrentMap<Locale, C15995f>[] f55145i = new ConcurrentMap[17];
    /* renamed from: j */
    private static final C15995f f55146j = new C17722d(1) {
        /* renamed from: a */
        int mo13959a(FastDateParser fastDateParser, int i) {
            return i < 100 ? fastDateParser.m64572a(i) : i;
        }
    };
    /* renamed from: k */
    private static final C15995f f55147k = new C17722d(2) {
        /* renamed from: a */
        int mo13959a(FastDateParser fastDateParser, int i) {
            return i - 1;
        }
    };
    /* renamed from: l */
    private static final C15995f f55148l = new C17722d(1);
    /* renamed from: m */
    private static final C15995f f55149m = new C17722d(3);
    /* renamed from: n */
    private static final C15995f f55150n = new C17722d(4);
    /* renamed from: o */
    private static final C15995f f55151o = new C17722d(6);
    /* renamed from: p */
    private static final C15995f f55152p = new C17722d(5);
    /* renamed from: q */
    private static final C15995f f55153q = new C17722d(7) {
        /* renamed from: a */
        int mo13959a(FastDateParser fastDateParser, int i) {
            return i != 7 ? 1 + i : 1;
        }
    };
    /* renamed from: r */
    private static final C15995f f55154r = new C17722d(8);
    /* renamed from: s */
    private static final C15995f f55155s = new C17722d(11);
    private static final long serialVersionUID = 3;
    /* renamed from: t */
    private static final C15995f f55156t = new C17722d(11) {
        /* renamed from: a */
        int mo13959a(FastDateParser fastDateParser, int i) {
            return i == 24 ? 0 : i;
        }
    };
    /* renamed from: u */
    private static final C15995f f55157u = new C17722d(10) {
        /* renamed from: a */
        int mo13959a(FastDateParser fastDateParser, int i) {
            return i == 12 ? 0 : i;
        }
    };
    /* renamed from: v */
    private static final C15995f f55158v = new C17722d(10);
    /* renamed from: w */
    private static final C15995f f55159w = new C17722d(12);
    /* renamed from: x */
    private static final C15995f f55160x = new C17722d(13);
    /* renamed from: y */
    private static final C15995f f55161y = new C17722d(14);
    /* renamed from: b */
    private final String f55162b;
    /* renamed from: c */
    private final TimeZone f55163c;
    /* renamed from: d */
    private final Locale f55164d;
    /* renamed from: e */
    private final int f55165e;
    /* renamed from: f */
    private final int f55166f;
    /* renamed from: g */
    private transient List<C15996g> f55167g;

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$1 */
    static class C159941 implements Comparator<String> {
        C159941() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m60743a((String) obj, (String) obj2);
        }

        /* renamed from: a */
        public int m60743a(String str, String str2) {
            return str2.compareTo(str);
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$f */
    private static abstract class C15995f {
        /* renamed from: a */
        boolean mo13475a() {
            return false;
        }

        /* renamed from: a */
        abstract boolean mo13476a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i);

        private C15995f() {
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$g */
    private static class C15996g {
        /* renamed from: a */
        final C15995f f49743a;
        /* renamed from: b */
        final int f49744b;

        C15996g(C15995f c15995f, int i) {
            this.f49743a = c15995f;
            this.f49744b = i;
        }

        /* renamed from: a */
        int m60746a(ListIterator<C15996g> listIterator) {
            int i = 0;
            if (this.f49743a.mo13475a()) {
                if (listIterator.hasNext()) {
                    C15995f c15995f = ((C15996g) listIterator.next()).f49743a;
                    listIterator.previous();
                    if (c15995f.mo13475a() != null) {
                        i = this.f49744b;
                    }
                    return i;
                }
            }
            return 0;
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$h */
    private class C15997h {
        /* renamed from: a */
        final /* synthetic */ FastDateParser f49745a;
        /* renamed from: b */
        private final String f49746b;
        /* renamed from: c */
        private final Calendar f49747c;
        /* renamed from: d */
        private int f49748d;

        C15997h(FastDateParser fastDateParser, String str, Calendar calendar) {
            this.f49745a = fastDateParser;
            this.f49746b = str;
            this.f49747c = calendar;
        }

        /* renamed from: a */
        C15996g m60749a() {
            if (this.f49748d >= this.f49746b.length()) {
                return null;
            }
            char charAt = this.f49746b.charAt(this.f49748d);
            if (FastDateParser.m64585b(charAt)) {
                return m60747a(charAt);
            }
            return m60748b();
        }

        /* renamed from: a */
        private C15996g m60747a(char c) {
            int i;
            int i2 = this.f49748d;
            do {
                i = this.f49748d + 1;
                this.f49748d = i;
                if (i >= this.f49746b.length()) {
                    break;
                }
            } while (this.f49746b.charAt(this.f49748d) == c);
            i = this.f49748d - i2;
            return new C15996g(this.f49745a.m64577a(c, i, this.f49747c), i);
        }

        /* renamed from: b */
        private C15996g m60748b() {
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            while (this.f49748d < this.f49746b.length()) {
                char charAt = this.f49746b.charAt(this.f49748d);
                if (i == 0 && FastDateParser.m64585b(charAt)) {
                    break;
                }
                if (charAt == '\'') {
                    int i2 = this.f49748d + 1;
                    this.f49748d = i2;
                    if (i2 == this.f49746b.length() || this.f49746b.charAt(this.f49748d) != '\'') {
                        i ^= 1;
                    }
                }
                this.f49748d++;
                stringBuilder.append(charAt);
            }
            if (i != 0) {
                throw new IllegalArgumentException("Unterminated quote");
            }
            String stringBuilder2 = stringBuilder.toString();
            return new C15996g(new C17721b(stringBuilder2), stringBuilder2.length());
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$b */
    private static class C17721b extends C15995f {
        /* renamed from: a */
        private final String f55140a;

        /* renamed from: a */
        boolean mo13475a() {
            return false;
        }

        C17721b(String str) {
            super();
            this.f55140a = str;
        }

        /* renamed from: a */
        boolean mo13476a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            calendar = null;
            while (calendar < this.f55140a.length()) {
                i = parsePosition.getIndex() + calendar;
                if (i == str.length()) {
                    parsePosition.setErrorIndex(i);
                    return false;
                } else if (this.f55140a.charAt(calendar) != str.charAt(i)) {
                    parsePosition.setErrorIndex(i);
                    return false;
                } else {
                    calendar++;
                }
            }
            parsePosition.setIndex(this.f55140a.length() + parsePosition.getIndex());
            return true;
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$d */
    private static class C17722d extends C15995f {
        /* renamed from: a */
        private final int f55141a;

        /* renamed from: a */
        int mo13959a(FastDateParser fastDateParser, int i) {
            return i;
        }

        /* renamed from: a */
        boolean mo13475a() {
            return true;
        }

        C17722d(int i) {
            super();
            this.f55141a = i;
        }

        /* renamed from: a */
        boolean mo13476a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i == 0) {
                while (index < length) {
                    if (Character.isWhitespace(str.charAt(index)) == 0) {
                        break;
                    }
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                i += index;
                if (length > i) {
                    length = i;
                }
            }
            while (index < length) {
                if (Character.isDigit(str.charAt(index)) == 0) {
                    break;
                }
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return null;
            }
            str = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.f55141a, mo13959a(fastDateParser, str));
            return true;
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$e */
    private static abstract class C17723e extends C15995f {
        /* renamed from: a */
        private Pattern f55142a;

        /* renamed from: a */
        abstract void mo13960a(FastDateParser fastDateParser, Calendar calendar, String str);

        /* renamed from: a */
        boolean mo13475a() {
            return false;
        }

        private C17723e() {
            super();
        }

        /* renamed from: a */
        void m64568a(StringBuilder stringBuilder) {
            m64567a(stringBuilder.toString());
        }

        /* renamed from: a */
        void m64567a(String str) {
            this.f55142a = Pattern.compile(str);
        }

        /* renamed from: a */
        boolean mo13476a(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            str = this.f55142a.matcher(str.substring(parsePosition.getIndex()));
            if (str.lookingAt() == 0) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return null;
            }
            parsePosition.setIndex(parsePosition.getIndex() + str.end(1));
            mo13960a(fastDateParser, calendar, str.group(1));
            return true;
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$a */
    private static class C18559a extends C17723e {
        /* renamed from: a */
        final Locale f57809a;
        /* renamed from: b */
        private final int f57810b;
        /* renamed from: c */
        private final Map<String, Integer> f57811c;

        C18559a(int i, Calendar calendar, Locale locale) {
            super();
            this.f57810b = i;
            this.f57809a = locale;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("((?iu)");
            this.f57811c = FastDateParser.m64583b(calendar, locale, i, stringBuilder);
            stringBuilder.setLength(stringBuilder.length() - 1);
            stringBuilder.append(")");
            m64568a(stringBuilder);
        }

        /* renamed from: a */
        void mo13960a(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.f57810b, ((Integer) this.f57811c.get(str.toLowerCase(this.f57809a))).intValue());
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$c */
    private static class C18560c extends C17723e {
        /* renamed from: a */
        private static final C15995f f57812a = new C18560c("(Z|(?:[+-]\\d{2}))");
        /* renamed from: b */
        private static final C15995f f57813b = new C18560c("(Z|(?:[+-]\\d{2}\\d{2}))");
        /* renamed from: c */
        private static final C15995f f57814c = new C18560c("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        C18560c(String str) {
            super();
            m64567a(str);
        }

        /* renamed from: a */
        void mo13960a(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (str.equals("Z") != null) {
                calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
                return;
            }
            fastDateParser = new StringBuilder();
            fastDateParser.append("GMT");
            fastDateParser.append(str);
            calendar.setTimeZone(TimeZone.getTimeZone(fastDateParser.toString()));
        }

        /* renamed from: a */
        static C15995f m66994a(int i) {
            switch (i) {
                case 1:
                    return f57812a;
                case 2:
                    return f57813b;
                case 3:
                    return f57814c;
                default:
                    throw new IllegalArgumentException("invalid number of X");
            }
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDateParser$i */
    static class C18561i extends C17723e {
        /* renamed from: a */
        private final Locale f57815a;
        /* renamed from: b */
        private final Map<String, C15998a> f57816b = new HashMap();

        /* renamed from: org.apache.commons.lang3.time.FastDateParser$i$a */
        private static class C15998a {
            /* renamed from: a */
            TimeZone f49749a;
            /* renamed from: b */
            int f49750b;

            C15998a(TimeZone timeZone, boolean z) {
                this.f49749a = timeZone;
                this.f49750b = z ? timeZone.getDSTSavings() : null;
            }
        }

        C18561i(Locale locale) {
            super();
            this.f57815a = locale;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            Set<String> treeSet = new TreeSet(FastDateParser.f55144h);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    C15998a c15998a = new C15998a(timeZone, false);
                    Object obj = c15998a;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i == 3) {
                            obj = new C15998a(timeZone, true);
                        } else if (i == 5) {
                            obj = c15998a;
                        }
                        String toLowerCase = strArr[i].toLowerCase(locale);
                        if (treeSet.add(toLowerCase)) {
                            this.f57816b.put(toLowerCase, obj);
                        }
                    }
                }
            }
            for (String str2 : treeSet) {
                stringBuilder.append('|');
                FastDateParser.m64582b(stringBuilder, str2);
            }
            stringBuilder.append(")");
            m64568a(stringBuilder);
        }

        /* renamed from: a */
        void mo13960a(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (str.charAt(0) != '+') {
                if (str.charAt(0) != 45) {
                    if (str.regionMatches(true, 0, "GMT", 0, 3) != null) {
                        calendar.setTimeZone(TimeZone.getTimeZone(str.toUpperCase()));
                        return;
                    }
                    C15998a c15998a = (C15998a) this.f57816b.get(str.toLowerCase(this.f57815a));
                    calendar.set(16, c15998a.f49750b);
                    calendar.set(15, c15998a.f49749a.getRawOffset());
                    return;
                }
            }
            fastDateParser = new StringBuilder();
            fastDateParser.append("GMT");
            fastDateParser.append(str);
            calendar.setTimeZone(TimeZone.getTimeZone(fastDateParser.toString()));
        }
    }

    /* renamed from: b */
    private static boolean m64585b(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    protected FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        this.f55162b = str;
        this.f55163c = timeZone;
        this.f55164d = locale;
        Calendar instance = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            instance.setTime(date);
            timeZone = instance.get(1);
        } else if (locale.equals(f55143a) != null) {
            timeZone = null;
        } else {
            instance.setTime(new Date());
            timeZone = instance.get(1) - 80;
        }
        this.f55165e = (timeZone / 100) * 100;
        this.f55166f = timeZone - this.f55165e;
        m64580a(instance);
    }

    /* renamed from: a */
    private void m64580a(Calendar calendar) {
        this.f55167g = new ArrayList();
        C15997h c15997h = new C15997h(this, this.f55162b, calendar);
        while (true) {
            calendar = c15997h.m60749a();
            if (calendar != null) {
                this.f55167g.add(calendar);
            } else {
                return;
            }
        }
    }

    public String getPattern() {
        return this.f55162b;
    }

    public TimeZone getTimeZone() {
        return this.f55163c;
    }

    public Locale getLocale() {
        return this.f55164d;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        if (this.f55162b.equals(fastDateParser.f55162b) && this.f55163c.equals(fastDateParser.f55163c) && this.f55164d.equals(fastDateParser.f55164d) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.f55162b.hashCode() + ((this.f55163c.hashCode() + (this.f55164d.hashCode() * 13)) * 13);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastDateParser[");
        stringBuilder.append(this.f55162b);
        stringBuilder.append(",");
        stringBuilder.append(this.f55164d);
        stringBuilder.append(",");
        stringBuilder.append(this.f55163c.getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m64580a(Calendar.getInstance(this.f55163c, this.f55164d));
    }

    public Object parseObject(String str) throws ParseException {
        return parse(str);
    }

    public Date parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = parse(str, parsePosition);
        if (parse != null) {
            return parse;
        }
        if (this.f55164d.equals(f55143a)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(The ");
            stringBuilder.append(this.f55164d);
            stringBuilder.append(" locale does not support dates before 1868 AD)\nUnparseable date: \"");
            stringBuilder.append(str);
            throw new ParseException(stringBuilder.toString(), parsePosition.getErrorIndex());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unparseable date: ");
        stringBuilder.append(str);
        throw new ParseException(stringBuilder.toString(), parsePosition.getErrorIndex());
    }

    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        Calendar instance = Calendar.getInstance(this.f55163c, this.f55164d);
        instance.clear();
        return parse(str, parsePosition, instance) != null ? instance.getTime() : null;
    }

    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator listIterator = this.f55167g.listIterator();
        while (listIterator.hasNext()) {
            C15996g c15996g = (C15996g) listIterator.next();
            if (!c15996g.f49743a.mo13476a(this, calendar, str, parsePosition, c15996g.m60746a(listIterator))) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static StringBuilder m64582b(StringBuilder stringBuilder, String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '$':
                case '(':
                case ')':
                case '*':
                case '+':
                case '.':
                case '?':
                case '[':
                case '\\':
                case '^':
                case '{':
                case '|':
                    stringBuilder.append('\\');
                    break;
                default:
                    break;
            }
            stringBuilder.append(charAt);
        }
        return stringBuilder;
    }

    /* renamed from: b */
    private static Map<String, Integer> m64583b(Calendar calendar, Locale locale, int i, StringBuilder stringBuilder) {
        Map<String, Integer> hashMap = new HashMap();
        calendar = calendar.getDisplayNames(i, 0, locale);
        i = new TreeSet(f55144h);
        for (Entry entry : calendar.entrySet()) {
            String toLowerCase = ((String) entry.getKey()).toLowerCase(locale);
            if (i.add(toLowerCase)) {
                hashMap.put(toLowerCase, entry.getValue());
            }
        }
        calendar = i.iterator();
        while (calendar.hasNext() != null) {
            m64582b(stringBuilder, (String) calendar.next()).append(124);
        }
        return hashMap;
    }

    /* renamed from: a */
    private int m64572a(int i) {
        int i2 = this.f55165e + i;
        return i >= this.f55166f ? i2 : i2 + 100;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private org.apache.commons.lang3.time.FastDateParser.C15995f m64577a(char r2, int r3, java.util.Calendar r4) {
        /*
        r1 = this;
        switch(r2) {
            case 68: goto L_0x0086;
            case 69: goto L_0x0080;
            case 70: goto L_0x007d;
            case 71: goto L_0x0077;
            case 72: goto L_0x0074;
            default: goto L_0x0003;
        };
    L_0x0003:
        r0 = 2;
        switch(r2) {
            case 87: goto L_0x0071;
            case 88: goto L_0x006c;
            case 89: goto L_0x0064;
            case 90: goto L_0x0056;
            default: goto L_0x0007;
        };
    L_0x0007:
        switch(r2) {
            case 121: goto L_0x0064;
            case 122: goto L_0x005d;
            default: goto L_0x000a;
        };
    L_0x000a:
        switch(r2) {
            case 75: goto L_0x0053;
            case 77: goto L_0x0048;
            case 83: goto L_0x0045;
            case 97: goto L_0x003e;
            case 100: goto L_0x003b;
            case 104: goto L_0x0038;
            case 107: goto L_0x0035;
            case 109: goto L_0x0032;
            case 115: goto L_0x002f;
            case 117: goto L_0x002c;
            case 119: goto L_0x0029;
            default: goto L_0x000d;
        };
    L_0x000d:
        r3 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = "Format '";
        r4.append(r0);
        r4.append(r2);
        r2 = "' not supported";
        r4.append(r2);
        r2 = r4.toString();
        r3.<init>(r2);
        throw r3;
    L_0x0029:
        r2 = f55149m;
        return r2;
    L_0x002c:
        r2 = f55153q;
        return r2;
    L_0x002f:
        r2 = f55160x;
        return r2;
    L_0x0032:
        r2 = f55159w;
        return r2;
    L_0x0035:
        r2 = f55156t;
        return r2;
    L_0x0038:
        r2 = f55157u;
        return r2;
    L_0x003b:
        r2 = f55152p;
        return r2;
    L_0x003e:
        r2 = 9;
        r2 = r1.m64578a(r2, r4);
        return r2;
    L_0x0045:
        r2 = f55161y;
        return r2;
    L_0x0048:
        r2 = 3;
        if (r3 < r2) goto L_0x0050;
    L_0x004b:
        r2 = r1.m64578a(r0, r4);
        goto L_0x0052;
    L_0x0050:
        r2 = f55147k;
    L_0x0052:
        return r2;
    L_0x0053:
        r2 = f55158v;
        return r2;
    L_0x0056:
        if (r3 != r0) goto L_0x005d;
    L_0x0058:
        r2 = org.apache.commons.lang3.time.FastDateParser.C18560c.f57814c;
        return r2;
    L_0x005d:
        r2 = 15;
        r2 = r1.m64578a(r2, r4);
        return r2;
    L_0x0064:
        if (r3 <= r0) goto L_0x0069;
    L_0x0066:
        r2 = f55148l;
        goto L_0x006b;
    L_0x0069:
        r2 = f55146j;
    L_0x006b:
        return r2;
    L_0x006c:
        r2 = org.apache.commons.lang3.time.FastDateParser.C18560c.m66994a(r3);
        return r2;
    L_0x0071:
        r2 = f55150n;
        return r2;
    L_0x0074:
        r2 = f55155s;
        return r2;
    L_0x0077:
        r2 = 0;
        r2 = r1.m64578a(r2, r4);
        return r2;
    L_0x007d:
        r2 = f55154r;
        return r2;
    L_0x0080:
        r2 = 7;
        r2 = r1.m64578a(r2, r4);
        return r2;
    L_0x0086:
        r2 = f55151o;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.FastDateParser.a(char, int, java.util.Calendar):org.apache.commons.lang3.time.FastDateParser$f");
    }

    /* renamed from: b */
    private static ConcurrentMap<Locale, C15995f> m64584b(int i) {
        synchronized (f55145i) {
            if (f55145i[i] == null) {
                f55145i[i] = new ConcurrentHashMap(3);
            }
            i = f55145i[i];
        }
        return i;
    }

    /* renamed from: a */
    private C15995f m64578a(int i, Calendar calendar) {
        ConcurrentMap b = m64584b(i);
        C15995f c15995f = (C15995f) b.get(this.f55164d);
        if (c15995f == null) {
            c15995f = i == 15 ? new C18561i(this.f55164d) : new C18559a(i, calendar, this.f55164d);
            C15995f c15995f2 = (C15995f) b.putIfAbsent(this.f55164d, c15995f);
            if (c15995f2 != null) {
                return c15995f2;
            }
        }
        return c15995f;
    }
}
