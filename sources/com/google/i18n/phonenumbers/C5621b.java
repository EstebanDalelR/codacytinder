package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata.NumberFormat;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import com.google.i18n.phonenumbers.internal.C5628b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.i18n.phonenumbers.b */
public class C5621b {
    /* renamed from: l */
    private static final PhoneMetadata f20858l = new PhoneMetadata().m24556b("NA");
    /* renamed from: o */
    private static final Pattern f20859o = Pattern.compile("\\[([^\\[\\]])*\\]");
    /* renamed from: p */
    private static final Pattern f20860p = Pattern.compile("\\d(?=[^,}][^,}])");
    /* renamed from: q */
    private static final Pattern f20861q = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    /* renamed from: r */
    private static final Pattern f20862r = Pattern.compile("[- ]");
    /* renamed from: s */
    private static final Pattern f20863s = Pattern.compile(" ");
    /* renamed from: A */
    private List<NumberFormat> f20864A = new ArrayList();
    /* renamed from: B */
    private C5628b f20865B = new C5628b(64);
    /* renamed from: a */
    private String f20866a = "";
    /* renamed from: b */
    private StringBuilder f20867b = new StringBuilder();
    /* renamed from: c */
    private String f20868c = "";
    /* renamed from: d */
    private StringBuilder f20869d = new StringBuilder();
    /* renamed from: e */
    private StringBuilder f20870e = new StringBuilder();
    /* renamed from: f */
    private boolean f20871f = true;
    /* renamed from: g */
    private boolean f20872g = false;
    /* renamed from: h */
    private boolean f20873h = false;
    /* renamed from: i */
    private boolean f20874i = false;
    /* renamed from: j */
    private final PhoneNumberUtil f20875j = PhoneNumberUtil.m24496b();
    /* renamed from: k */
    private String f20876k;
    /* renamed from: m */
    private PhoneMetadata f20877m;
    /* renamed from: n */
    private PhoneMetadata f20878n;
    /* renamed from: t */
    private int f20879t = 0;
    /* renamed from: u */
    private int f20880u = 0;
    /* renamed from: v */
    private int f20881v = 0;
    /* renamed from: w */
    private StringBuilder f20882w = new StringBuilder();
    /* renamed from: x */
    private boolean f20883x = false;
    /* renamed from: y */
    private String f20884y = "";
    /* renamed from: z */
    private StringBuilder f20885z = new StringBuilder();

    C5621b(String str) {
        this.f20876k = str;
        this.f20878n = m24643a(this.f20876k);
        this.f20877m = this.f20878n;
    }

    /* renamed from: a */
    private PhoneMetadata m24643a(String str) {
        str = this.f20875j.m24526b(this.f20875j.m24528b(this.f20875j.m24532c(str)));
        if (str != null) {
            return str;
        }
        return f20858l;
    }

    /* renamed from: d */
    private boolean m24653d() {
        Iterator it = this.f20864A.iterator();
        while (it.hasNext()) {
            NumberFormat numberFormat = (NumberFormat) it.next();
            String a = numberFormat.m24539a();
            if (this.f20868c.equals(a)) {
                return false;
            }
            if (m24646a(numberFormat)) {
                this.f20868c = a;
                this.f20883x = f20862r.matcher(numberFormat.m24546d()).find();
                this.f20879t = 0;
                return true;
            }
            it.remove();
        }
        this.f20871f = false;
        return false;
    }

    /* renamed from: b */
    private void m24648b(String str) {
        List v;
        if (!this.f20873h || this.f20878n.m24604y() <= 0) {
            v = this.f20878n.m24601v();
        } else {
            v = this.f20878n.m24603x();
        }
        boolean n = this.f20878n.m24590n();
        for (NumberFormat numberFormat : r0) {
            if ((!n || this.f20873h || numberFormat.m24547e() || PhoneNumberUtil.m24494a(numberFormat.m24546d())) && m24650c(numberFormat.m24542b())) {
                this.f20864A.add(numberFormat);
            }
        }
        m24652d(str);
    }

    /* renamed from: c */
    private boolean m24650c(String str) {
        return f20861q.matcher(str).matches();
    }

    /* renamed from: d */
    private void m24652d(String str) {
        int length = str.length() - 3;
        Iterator it = this.f20864A.iterator();
        while (it.hasNext()) {
            NumberFormat numberFormat = (NumberFormat) it.next();
            if (numberFormat.m24543c() != 0) {
                if (!this.f20865B.m24681a(numberFormat.m24540a(Math.min(length, numberFormat.m24543c() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m24646a(NumberFormat numberFormat) {
        CharSequence a = numberFormat.m24539a();
        if (a.indexOf(124) != -1) {
            return false;
        }
        String replaceAll = f20860p.matcher(f20859o.matcher(a).replaceAll("\\\\d")).replaceAll("\\\\d");
        this.f20867b.setLength(0);
        numberFormat = m24645a(replaceAll, numberFormat.m24542b());
        if (numberFormat.length() <= 0) {
            return false;
        }
        this.f20867b.append(numberFormat);
        return true;
    }

    /* renamed from: a */
    private String m24645a(String str, String str2) {
        Matcher matcher = this.f20865B.m24681a(str).matcher("999999999999999");
        matcher.find();
        String group = matcher.group();
        if (group.length() < this.f20885z.length()) {
            return "";
        }
        return group.replaceAll(str, str2).replaceAll("9", " ");
    }

    /* renamed from: a */
    public void m24664a() {
        this.f20866a = "";
        this.f20869d.setLength(0);
        this.f20870e.setLength(0);
        this.f20867b.setLength(0);
        this.f20879t = 0;
        this.f20868c = "";
        this.f20882w.setLength(0);
        this.f20884y = "";
        this.f20885z.setLength(0);
        this.f20871f = true;
        this.f20872g = false;
        this.f20881v = 0;
        this.f20880u = 0;
        this.f20873h = false;
        this.f20874i = false;
        this.f20864A.clear();
        this.f20883x = false;
        if (!this.f20878n.equals(this.f20877m)) {
            this.f20878n = m24643a(this.f20876k);
        }
    }

    /* renamed from: a */
    public String m24663a(char c) {
        this.f20866a = m24644a(c, false);
        return this.f20866a;
    }

    /* renamed from: b */
    public String m24666b(char c) {
        this.f20866a = m24644a(c, true);
        return this.f20866a;
    }

    /* renamed from: a */
    private String m24644a(char c, boolean z) {
        this.f20869d.append(c);
        if (z) {
            this.f20880u = this.f20869d.length();
        }
        if (m24649c(c)) {
            c = m24647b(c, z);
        } else {
            this.f20871f = false;
            this.f20872g = true;
        }
        if (this.f20871f) {
            switch (this.f20870e.length()) {
                case false:
                case true:
                case true:
                    return this.f20869d.toString();
                case true:
                    if (m24661k()) {
                        this.f20874i = true;
                        break;
                    }
                    this.f20884y = m24660j();
                    return m24657g();
                default:
                    break;
            }
            if (this.f20874i) {
                if (m24662l() != '\u0000') {
                    this.f20874i = false;
                }
                c = new StringBuilder();
                c.append(this.f20882w);
                c.append(this.f20885z.toString());
                return c.toString();
            } else if (this.f20864A.size() > false) {
                return m24657g();
            } else {
                c = m24651d(c);
                z = m24665b();
                if (z.length() > 0) {
                    return z;
                }
                m24652d(this.f20885z.toString());
                if (m24653d()) {
                    return m24658h();
                }
                if (this.f20871f) {
                    c = m24655e(c);
                } else {
                    c = this.f20869d.toString();
                }
                return c;
            }
        } else if (this.f20872g != '\u0000') {
            return this.f20869d.toString();
        } else {
            if (m24661k() != '\u0000') {
                if (m24662l() != '\u0000') {
                    return m24654e();
                }
            } else if (m24656f() != '\u0000') {
                this.f20882w.append(true);
                return m24654e();
            }
            return this.f20869d.toString();
        }
    }

    /* renamed from: e */
    private String m24654e() {
        this.f20871f = true;
        this.f20874i = false;
        this.f20864A.clear();
        this.f20879t = 0;
        this.f20867b.setLength(0);
        this.f20868c = "";
        return m24657g();
    }

    /* renamed from: f */
    private boolean m24656f() {
        if (this.f20884y.length() > 0) {
            this.f20885z.insert(0, this.f20884y);
            this.f20882w.setLength(this.f20882w.lastIndexOf(this.f20884y));
        }
        return this.f20884y.equals(m24660j()) ^ 1;
    }

    /* renamed from: c */
    private boolean m24649c(char c) {
        if (Character.isDigit(c)) {
            return true;
        }
        if (this.f20869d.length() != 1 || PhoneNumberUtil.f20734a.matcher(Character.toString(c)).matches() == '\u0000') {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    String m24665b() {
        for (NumberFormat numberFormat : this.f20864A) {
            Matcher matcher = this.f20865B.m24681a(numberFormat.m24539a()).matcher(this.f20885z);
            if (matcher.matches()) {
                this.f20883x = f20862r.matcher(numberFormat.m24546d()).find();
                return m24655e(matcher.replaceAll(numberFormat.m24542b()));
            }
        }
        return "";
    }

    /* renamed from: c */
    public int m24667c() {
        if (!this.f20871f) {
            return this.f20880u;
        }
        int i = 0;
        int i2 = 0;
        while (i < this.f20881v && i2 < this.f20866a.length()) {
            if (this.f20870e.charAt(i) == this.f20866a.charAt(i2)) {
                i++;
            }
            i2++;
        }
        return i2;
    }

    /* renamed from: e */
    private String m24655e(String str) {
        int length = this.f20882w.length();
        if (!this.f20883x || length <= 0 || this.f20882w.charAt(length - 1) == ' ') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f20882w);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(new String(this.f20882w));
        stringBuilder.append(' ');
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: g */
    private String m24657g() {
        if (this.f20885z.length() < 3) {
            return m24655e(this.f20885z.toString());
        }
        m24648b(this.f20885z.toString());
        String b = m24665b();
        if (b.length() > 0) {
            return b;
        }
        return m24653d() ? m24658h() : this.f20869d.toString();
    }

    /* renamed from: h */
    private String m24658h() {
        int length = this.f20885z.length();
        if (length <= 0) {
            return this.f20882w.toString();
        }
        String str = "";
        for (int i = 0; i < length; i++) {
            str = m24651d(this.f20885z.charAt(i));
        }
        return this.f20871f ? m24655e(str) : this.f20869d.toString();
    }

    /* renamed from: i */
    private boolean m24659i() {
        if (this.f20878n.m24585l() != 1 || this.f20885z.charAt(0) != '1' || this.f20885z.charAt(1) == '0' || this.f20885z.charAt(1) == '1') {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private String m24660j() {
        int i = 1;
        if (m24659i()) {
            StringBuilder stringBuilder = this.f20882w;
            stringBuilder.append('1');
            stringBuilder.append(' ');
            this.f20873h = true;
        } else {
            if (this.f20878n.m24597r()) {
                Matcher matcher = this.f20865B.m24681a(this.f20878n.m24598s()).matcher(this.f20885z);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.f20873h = true;
                    i = matcher.end();
                    this.f20882w.append(this.f20885z.substring(0, i));
                }
            }
            i = 0;
        }
        String substring = this.f20885z.substring(0, i);
        this.f20885z.delete(0, i);
        return substring;
    }

    /* renamed from: k */
    private boolean m24661k() {
        C5628b c5628b = this.f20865B;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\\+|");
        stringBuilder.append(this.f20878n.m24588m());
        Matcher matcher = c5628b.m24681a(stringBuilder.toString()).matcher(this.f20870e);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f20873h = true;
        int end = matcher.end();
        this.f20885z.setLength(0);
        this.f20885z.append(this.f20870e.substring(end));
        this.f20882w.setLength(0);
        this.f20882w.append(this.f20870e.substring(0, end));
        if (this.f20870e.charAt(0) != '+') {
            this.f20882w.append(' ');
        }
        return true;
    }

    /* renamed from: l */
    private boolean m24662l() {
        if (this.f20885z.length() == 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int a = this.f20875j.m24507a(this.f20885z, stringBuilder);
        if (a == 0) {
            return false;
        }
        this.f20885z.setLength(0);
        this.f20885z.append(stringBuilder);
        String b = this.f20875j.m24528b(a);
        if ("001".equals(b)) {
            this.f20878n = this.f20875j.m24512a(a);
        } else if (!b.equals(this.f20876k)) {
            this.f20878n = m24643a(b);
        }
        b = Integer.toString(a);
        StringBuilder stringBuilder2 = this.f20882w;
        stringBuilder2.append(b);
        stringBuilder2.append(' ');
        this.f20884y = "";
        return true;
    }

    /* renamed from: b */
    private char m24647b(char c, boolean z) {
        if (c == '+') {
            this.f20870e.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            this.f20870e.append(c);
            this.f20885z.append(c);
        }
        if (z) {
            this.f20881v = this.f20870e.length();
        }
        return c;
    }

    /* renamed from: d */
    private String m24651d(char c) {
        Matcher matcher = f20863s.matcher(this.f20867b);
        if (matcher.find(this.f20879t)) {
            c = matcher.replaceFirst(Character.toString(c));
            this.f20867b.replace(0, c.length(), c);
            this.f20879t = matcher.start();
            return this.f20867b.substring(0, this.f20879t + 1);
        }
        if (this.f20864A.size() == '\u0001') {
            this.f20871f = false;
        }
        this.f20868c = "";
        return this.f20869d.toString();
    }
}
