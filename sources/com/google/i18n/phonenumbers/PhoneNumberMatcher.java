package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency;
import com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonemetadata.NumberFormat;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource;
import java.lang.Character.UnicodeBlock;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class PhoneNumberMatcher implements Iterator<C5625g> {
    /* renamed from: a */
    private static final Pattern f20710a;
    /* renamed from: b */
    private static final Pattern f20711b = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    /* renamed from: c */
    private static final Pattern f20712c = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    /* renamed from: d */
    private static final Pattern f20713d = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    /* renamed from: e */
    private static final Pattern f20714e = Pattern.compile(":[0-5]\\d");
    /* renamed from: f */
    private static final Pattern f20715f;
    /* renamed from: g */
    private static final Pattern[] f20716g = new Pattern[]{Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    /* renamed from: h */
    private static final Pattern f20717h;
    /* renamed from: i */
    private final PhoneNumberUtil f20718i;
    /* renamed from: j */
    private final CharSequence f20719j;
    /* renamed from: k */
    private final String f20720k;
    /* renamed from: l */
    private final Leniency f20721l;
    /* renamed from: m */
    private long f20722m;
    /* renamed from: n */
    private State f20723n = State.NOT_READY;
    /* renamed from: o */
    private C5625g f20724o = null;
    /* renamed from: p */
    private int f20725p = 0;

    private enum State {
        NOT_READY,
        READY,
        DONE
    }

    /* renamed from: com.google.i18n.phonenumbers.PhoneNumberMatcher$a */
    interface C5617a {
        /* renamed from: a */
        boolean mo5922a(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, StringBuilder stringBuilder, String[] strArr);
    }

    public /* synthetic */ Object next() {
        return m24472a();
    }

    static {
        String str = "(\\[（［";
        String str2 = ")\\]）］";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[^");
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append("]");
        String stringBuilder2 = stringBuilder.toString();
        String a = m24460a(0, 3);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("(?:[");
        stringBuilder3.append(str);
        stringBuilder3.append("])?(?:");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("+[");
        stringBuilder3.append(str2);
        stringBuilder3.append("])?");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("+(?:[");
        stringBuilder3.append(str);
        stringBuilder3.append("]");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("+[");
        stringBuilder3.append(str2);
        stringBuilder3.append("])");
        stringBuilder3.append(a);
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("*");
        f20715f = Pattern.compile(stringBuilder3.toString());
        str2 = m24460a(0, 2);
        String a2 = m24460a(0, 4);
        String a3 = m24460a(0, 20);
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]");
        stringBuilder4.append(a2);
        a2 = stringBuilder4.toString();
        stringBuilder4 = new StringBuilder();
        stringBuilder4.append("\\p{Nd}");
        stringBuilder4.append(m24460a(1, 20));
        String stringBuilder5 = stringBuilder4.toString();
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(str);
        stringBuilder6.append("+＋");
        str = stringBuilder6.toString();
        stringBuilder6 = new StringBuilder();
        stringBuilder6.append("[");
        stringBuilder6.append(str);
        stringBuilder6.append("]");
        str = stringBuilder6.toString();
        f20717h = Pattern.compile(str);
        stringBuilder6 = new StringBuilder();
        stringBuilder6.append("(?:");
        stringBuilder6.append(str);
        stringBuilder6.append(a2);
        stringBuilder6.append(")");
        stringBuilder6.append(str2);
        stringBuilder6.append(stringBuilder5);
        stringBuilder6.append("(?:");
        stringBuilder6.append(a2);
        stringBuilder6.append(stringBuilder5);
        stringBuilder6.append(")");
        stringBuilder6.append(a3);
        stringBuilder6.append("(?:");
        stringBuilder6.append(PhoneNumberUtil.f20737d);
        stringBuilder6.append(")?");
        f20710a = Pattern.compile(stringBuilder6.toString(), 66);
    }

    /* renamed from: a */
    private static String m24460a(int i, int i2) {
        if (i >= 0 && i2 > 0) {
            if (i2 >= i) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("{");
                stringBuilder.append(i);
                stringBuilder.append(",");
                stringBuilder.append(i2);
                stringBuilder.append("}");
                return stringBuilder.toString();
            }
        }
        throw new IllegalArgumentException();
    }

    PhoneNumberMatcher(PhoneNumberUtil phoneNumberUtil, CharSequence charSequence, String str, Leniency leniency, long j) {
        if (phoneNumberUtil != null) {
            if (leniency != null) {
                if (j < 0) {
                    throw new IllegalArgumentException();
                }
                this.f20718i = phoneNumberUtil;
                if (charSequence == null) {
                    charSequence = "";
                }
                this.f20719j = charSequence;
                this.f20720k = str;
                this.f20721l = leniency;
                this.f20722m = j;
                return;
            }
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private C5625g m24457a(int i) {
        Matcher matcher = f20710a.matcher(this.f20719j);
        while (this.f20722m > 0 && matcher.find(r8) != 0) {
            i = matcher.start();
            CharSequence a = m24459a(PhoneNumberUtil.f20735b, this.f20719j.subSequence(i, matcher.end()));
            C5625g a2 = m24458a(a, i);
            if (a2 != null) {
                return a2;
            }
            i += a.length();
            this.f20722m--;
        }
        return 0;
    }

    /* renamed from: a */
    private static CharSequence m24459a(Pattern pattern, CharSequence charSequence) {
        pattern = pattern.matcher(charSequence);
        return pattern.find() ? charSequence.subSequence(0, pattern.start()) : charSequence;
    }

    /* renamed from: a */
    static boolean m24461a(char c) {
        boolean z = false;
        if (!Character.isLetter(c) && Character.getType(c) != 6) {
            return false;
        }
        c = UnicodeBlock.of(c);
        if (c.equals(UnicodeBlock.BASIC_LATIN) || c.equals(UnicodeBlock.LATIN_1_SUPPLEMENT) || c.equals(UnicodeBlock.LATIN_EXTENDED_A) || c.equals(UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || c.equals(UnicodeBlock.LATIN_EXTENDED_B) || c.equals(UnicodeBlock.COMBINING_DIACRITICAL_MARKS) != '\u0000') {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m24469b(char c) {
        if (c != '%') {
            if (Character.getType(c) != '\u001a') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private C5625g m24458a(CharSequence charSequence, int i) {
        if (f20712c.matcher(charSequence).find()) {
            return null;
        }
        if (f20713d.matcher(charSequence).find()) {
            if (f20714e.matcher(this.f20719j.toString().substring(charSequence.length() + i)).lookingAt()) {
                return null;
            }
        }
        C5625g c = m24471c(charSequence, i);
        if (c != null) {
            return c;
        }
        return m24468b(charSequence, i);
    }

    /* renamed from: b */
    private C5625g m24468b(CharSequence charSequence, int i) {
        for (Pattern matcher : f20716g) {
            Matcher matcher2 = matcher.matcher(charSequence);
            Object obj = 1;
            while (matcher2.find() && this.f20722m > 0) {
                if (obj != null) {
                    C5625g c = m24471c(m24459a(PhoneNumberUtil.f20736c, charSequence.subSequence(0, matcher2.start())), i);
                    if (c != null) {
                        return c;
                    }
                    this.f20722m--;
                    obj = null;
                }
                C5625g c2 = m24471c(m24459a(PhoneNumberUtil.f20736c, matcher2.group(1)), matcher2.start(1) + i);
                if (c2 != null) {
                    return c2;
                }
                this.f20722m--;
            }
        }
        return null;
    }

    /* renamed from: c */
    private com.google.i18n.phonenumbers.C5625g m24471c(java.lang.CharSequence r5, int r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = 0;
        r1 = f20715f;	 Catch:{ NumberParseException -> 0x00be }
        r1 = r1.matcher(r5);	 Catch:{ NumberParseException -> 0x00be }
        r1 = r1.matches();	 Catch:{ NumberParseException -> 0x00be }
        if (r1 == 0) goto L_0x00bd;	 Catch:{ NumberParseException -> 0x00be }
    L_0x000d:
        r1 = f20711b;	 Catch:{ NumberParseException -> 0x00be }
        r1 = r1.matcher(r5);	 Catch:{ NumberParseException -> 0x00be }
        r1 = r1.find();	 Catch:{ NumberParseException -> 0x00be }
        if (r1 == 0) goto L_0x001b;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0019:
        goto L_0x00bd;	 Catch:{ NumberParseException -> 0x00be }
    L_0x001b:
        r1 = r4.f20721l;	 Catch:{ NumberParseException -> 0x00be }
        r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.VALID;	 Catch:{ NumberParseException -> 0x00be }
        r1 = r1.compareTo(r2);	 Catch:{ NumberParseException -> 0x00be }
        if (r1 < 0) goto L_0x0068;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0025:
        if (r6 <= 0) goto L_0x0048;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0027:
        r1 = f20717h;	 Catch:{ NumberParseException -> 0x00be }
        r1 = r1.matcher(r5);	 Catch:{ NumberParseException -> 0x00be }
        r1 = r1.lookingAt();	 Catch:{ NumberParseException -> 0x00be }
        if (r1 != 0) goto L_0x0048;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0033:
        r1 = r4.f20719j;	 Catch:{ NumberParseException -> 0x00be }
        r2 = r6 + -1;	 Catch:{ NumberParseException -> 0x00be }
        r1 = r1.charAt(r2);	 Catch:{ NumberParseException -> 0x00be }
        r2 = m24469b(r1);	 Catch:{ NumberParseException -> 0x00be }
        if (r2 != 0) goto L_0x0047;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0041:
        r1 = m24461a(r1);	 Catch:{ NumberParseException -> 0x00be }
        if (r1 == 0) goto L_0x0048;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0047:
        return r0;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0048:
        r1 = r5.length();	 Catch:{ NumberParseException -> 0x00be }
        r1 = r1 + r6;	 Catch:{ NumberParseException -> 0x00be }
        r2 = r4.f20719j;	 Catch:{ NumberParseException -> 0x00be }
        r2 = r2.length();	 Catch:{ NumberParseException -> 0x00be }
        if (r1 >= r2) goto L_0x0068;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0055:
        r2 = r4.f20719j;	 Catch:{ NumberParseException -> 0x00be }
        r1 = r2.charAt(r1);	 Catch:{ NumberParseException -> 0x00be }
        r2 = m24469b(r1);	 Catch:{ NumberParseException -> 0x00be }
        if (r2 != 0) goto L_0x0067;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0061:
        r1 = m24461a(r1);	 Catch:{ NumberParseException -> 0x00be }
        if (r1 == 0) goto L_0x0068;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0067:
        return r0;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0068:
        r1 = r4.f20718i;	 Catch:{ NumberParseException -> 0x00be }
        r2 = r4.f20720k;	 Catch:{ NumberParseException -> 0x00be }
        r1 = r1.m24527b(r5, r2);	 Catch:{ NumberParseException -> 0x00be }
        r2 = r4.f20718i;	 Catch:{ NumberParseException -> 0x00be }
        r3 = r1.m24616a();	 Catch:{ NumberParseException -> 0x00be }
        r2 = r2.m24528b(r3);	 Catch:{ NumberParseException -> 0x00be }
        r3 = "IL";	 Catch:{ NumberParseException -> 0x00be }
        r2 = r2.equals(r3);	 Catch:{ NumberParseException -> 0x00be }
        if (r2 == 0) goto L_0x00a0;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0082:
        r2 = r4.f20718i;	 Catch:{ NumberParseException -> 0x00be }
        r2 = r2.m24516a(r1);	 Catch:{ NumberParseException -> 0x00be }
        r2 = r2.length();	 Catch:{ NumberParseException -> 0x00be }
        r3 = 4;	 Catch:{ NumberParseException -> 0x00be }
        if (r2 != r3) goto L_0x00a0;	 Catch:{ NumberParseException -> 0x00be }
    L_0x008f:
        if (r6 == 0) goto L_0x009f;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0091:
        if (r6 <= 0) goto L_0x00a0;	 Catch:{ NumberParseException -> 0x00be }
    L_0x0093:
        r2 = r4.f20719j;	 Catch:{ NumberParseException -> 0x00be }
        r3 = r6 + -1;	 Catch:{ NumberParseException -> 0x00be }
        r2 = r2.charAt(r3);	 Catch:{ NumberParseException -> 0x00be }
        r3 = 42;	 Catch:{ NumberParseException -> 0x00be }
        if (r2 == r3) goto L_0x00a0;	 Catch:{ NumberParseException -> 0x00be }
    L_0x009f:
        return r0;	 Catch:{ NumberParseException -> 0x00be }
    L_0x00a0:
        r2 = r4.f20721l;	 Catch:{ NumberParseException -> 0x00be }
        r3 = r4.f20718i;	 Catch:{ NumberParseException -> 0x00be }
        r2 = r2.verify(r1, r5, r3);	 Catch:{ NumberParseException -> 0x00be }
        if (r2 == 0) goto L_0x00be;	 Catch:{ NumberParseException -> 0x00be }
    L_0x00aa:
        r1.m24638n();	 Catch:{ NumberParseException -> 0x00be }
        r1.m24635k();	 Catch:{ NumberParseException -> 0x00be }
        r1.m24641q();	 Catch:{ NumberParseException -> 0x00be }
        r2 = new com.google.i18n.phonenumbers.g;	 Catch:{ NumberParseException -> 0x00be }
        r5 = r5.toString();	 Catch:{ NumberParseException -> 0x00be }
        r2.<init>(r6, r5, r1);	 Catch:{ NumberParseException -> 0x00be }
        return r2;
    L_0x00bd:
        return r0;
    L_0x00be:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberMatcher.c(java.lang.CharSequence, int):com.google.i18n.phonenumbers.g");
    }

    /* renamed from: a */
    static boolean m24462a(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, StringBuilder stringBuilder, String[] strArr) {
        int length;
        if (phoneNumber.m24637m() != CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            String num = Integer.toString(phoneNumber.m24616a());
            length = num.length() + stringBuilder.indexOf(num);
        } else {
            length = 0;
        }
        int i = length;
        length = 0;
        while (length < strArr.length) {
            i = stringBuilder.indexOf(strArr[length], i);
            if (i < 0) {
                return false;
            }
            i += strArr[length].length();
            if (length != 0 || i >= stringBuilder.length() || phoneNumberUtil.m24519a(phoneNumberUtil.m24528b(phoneNumber.m24616a()), true) == null || !Character.isDigit(stringBuilder.charAt(i))) {
                length++;
            } else {
                return stringBuilder.substring(i - strArr[length].length()).startsWith(phoneNumberUtil.m24516a(phoneNumber));
            }
        }
        return stringBuilder.substring(i).contains(phoneNumber.m24628d());
    }

    /* renamed from: b */
    static boolean m24470b(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, StringBuilder stringBuilder, String[] strArr) {
        stringBuilder = PhoneNumberUtil.f20738e.split(stringBuilder.toString());
        int length = phoneNumber.m24627c() ? stringBuilder.length - 2 : stringBuilder.length - 1;
        if (stringBuilder.length != 1) {
            if (stringBuilder[length].contains(phoneNumberUtil.m24516a(phoneNumber)) == null) {
                phoneNumberUtil = strArr.length - 1;
                while (true) {
                    phoneNumber = null;
                    if (phoneNumberUtil <= null || length < 0) {
                        if (length >= 0 && stringBuilder[length].endsWith(strArr[0]) != null) {
                            phoneNumber = true;
                        }
                    } else if (!stringBuilder[length].equals(strArr[phoneNumberUtil])) {
                        return false;
                    } else {
                        phoneNumberUtil--;
                        length--;
                    }
                }
                phoneNumber = true;
                return phoneNumber;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static String[] m24467a(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, NumberFormat numberFormat) {
        if (numberFormat != null) {
            return phoneNumberUtil.m24518a(phoneNumberUtil.m24516a(phoneNumber), numberFormat, PhoneNumberFormat.RFC3966).split("-");
        }
        phoneNumberUtil = phoneNumberUtil.m24517a(phoneNumber, PhoneNumberFormat.RFC3966);
        phoneNumber = phoneNumberUtil.indexOf(59);
        if (phoneNumber < null) {
            phoneNumber = phoneNumberUtil.length();
        }
        return phoneNumberUtil.substring(phoneNumberUtil.indexOf(45) + 1, phoneNumber).split("-");
    }

    /* renamed from: a */
    static boolean m24464a(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, C5617a c5617a) {
        charSequence = PhoneNumberUtil.m24485a(charSequence, true);
        if (c5617a.mo5922a(phoneNumberUtil, phoneNumber, charSequence, m24467a(phoneNumberUtil, phoneNumber, null))) {
            return true;
        }
        PhoneMetadata a = C5623d.m24669a(phoneNumber.m24616a());
        if (a != null) {
            for (NumberFormat a2 : a.m24601v()) {
                if (c5617a.mo5922a(phoneNumberUtil, phoneNumber, charSequence, m24467a(phoneNumberUtil, phoneNumber, a2))) {
                    return true;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    static boolean m24465a(PhoneNumber phoneNumber, String str) {
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return false;
        }
        int indexOf2 = str.indexOf(47, indexOf + 1);
        if (indexOf2 < 0) {
            return false;
        }
        Object obj;
        if (phoneNumber.m24637m() != CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN) {
            if (phoneNumber.m24637m() != CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN) {
                obj = null;
                if (obj != null || PhoneNumberUtil.m24499c(str.substring(0, indexOf)).equals(Integer.toString(phoneNumber.m24616a())) == null) {
                    return true;
                }
                return str.substring(indexOf2 + 1).contains("/");
            }
        }
        obj = 1;
        if (obj != null) {
        }
        return true;
    }

    /* renamed from: a */
    static boolean m24466a(PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
        int i = 0;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt == 'X') {
                int i2 = i + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 != 'x') {
                    if (charAt2 != 'X') {
                        if (!PhoneNumberUtil.m24499c(str.substring(i)).equals(phoneNumber.m24628d())) {
                            return false;
                        }
                    }
                }
                if (phoneNumberUtil.m24509a(phoneNumber, str.substring(i2)) != MatchType.NSN_MATCH) {
                    return false;
                }
                i = i2;
            }
            i++;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static boolean m24463a(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber r4, com.google.i18n.phonenumbers.PhoneNumberUtil r5) {
        /*
        r0 = r4.m24637m();
        r1 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        r2 = 1;
        if (r0 == r1) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r0 = r4.m24616a();
        r0 = r5.m24528b(r0);
        r0 = r5.m24526b(r0);
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        return r2;
    L_0x0019:
        r1 = r5.m24516a(r4);
        r3 = r0.m24601v();
        r1 = r5.m24511a(r3, r1);
        if (r1 == 0) goto L_0x0056;
    L_0x0027:
        r3 = r1.m24546d();
        r3 = r3.length();
        if (r3 <= 0) goto L_0x0056;
    L_0x0031:
        r3 = r1.m24547e();
        if (r3 == 0) goto L_0x0038;
    L_0x0037:
        return r2;
    L_0x0038:
        r1 = r1.m24546d();
        r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.m24494a(r1);
        if (r1 == 0) goto L_0x0043;
    L_0x0042:
        return r2;
    L_0x0043:
        r4 = r4.m24634j();
        r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.m24499c(r4);
        r1 = new java.lang.StringBuilder;
        r1.<init>(r4);
        r4 = 0;
        r4 = r5.m24525a(r1, r0, r4);
        return r4;
    L_0x0056:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberMatcher.a(com.google.i18n.phonenumbers.Phonenumber$PhoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil):boolean");
    }

    public boolean hasNext() {
        if (this.f20723n == State.NOT_READY) {
            this.f20724o = m24457a(this.f20725p);
            if (this.f20724o == null) {
                this.f20723n = State.DONE;
            } else {
                this.f20725p = this.f20724o.m24676b();
                this.f20723n = State.READY;
            }
        }
        return this.f20723n == State.READY;
    }

    /* renamed from: a */
    public C5625g m24472a() {
        if (hasNext()) {
            C5625g c5625g = this.f20724o;
            this.f20724o = null;
            this.f20723n = State.NOT_READY;
            return c5625g;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
