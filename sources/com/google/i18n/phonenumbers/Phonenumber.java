package com.google.i18n.phonenumbers;

import java.io.Serializable;

public final class Phonenumber {

    public static class PhoneNumber implements Serializable {
        private static final long serialVersionUID = 1;
        /* renamed from: a */
        private boolean f20837a;
        /* renamed from: b */
        private int f20838b = 0;
        /* renamed from: c */
        private boolean f20839c;
        /* renamed from: d */
        private long f20840d = 0;
        /* renamed from: e */
        private boolean f20841e;
        /* renamed from: f */
        private String f20842f = "";
        /* renamed from: g */
        private boolean f20843g;
        /* renamed from: h */
        private boolean f20844h = false;
        /* renamed from: i */
        private boolean f20845i;
        /* renamed from: j */
        private int f20846j = 1;
        /* renamed from: k */
        private boolean f20847k;
        /* renamed from: l */
        private String f20848l = "";
        /* renamed from: m */
        private boolean f20849m;
        /* renamed from: n */
        private CountryCodeSource f20850n = CountryCodeSource.UNSPECIFIED;
        /* renamed from: o */
        private boolean f20851o;
        /* renamed from: p */
        private String f20852p = "";

        public enum CountryCodeSource {
            FROM_NUMBER_WITH_PLUS_SIGN,
            FROM_NUMBER_WITH_IDD,
            FROM_NUMBER_WITHOUT_PLUS_SIGN,
            FROM_DEFAULT_COUNTRY,
            UNSPECIFIED
        }

        /* renamed from: a */
        public int m24616a() {
            return this.f20838b;
        }

        /* renamed from: a */
        public PhoneNumber m24617a(int i) {
            this.f20837a = true;
            this.f20838b = i;
            return this;
        }

        /* renamed from: b */
        public long m24623b() {
            return this.f20840d;
        }

        /* renamed from: a */
        public PhoneNumber m24618a(long j) {
            this.f20839c = true;
            this.f20840d = j;
            return this;
        }

        /* renamed from: c */
        public boolean m24627c() {
            return this.f20841e;
        }

        /* renamed from: d */
        public String m24628d() {
            return this.f20842f;
        }

        /* renamed from: a */
        public PhoneNumber m24620a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f20841e = true;
            this.f20842f = str;
            return this;
        }

        /* renamed from: e */
        public boolean m24629e() {
            return this.f20843g;
        }

        /* renamed from: f */
        public boolean m24630f() {
            return this.f20844h;
        }

        /* renamed from: a */
        public PhoneNumber m24621a(boolean z) {
            this.f20843g = true;
            this.f20844h = z;
            return this;
        }

        /* renamed from: g */
        public boolean m24631g() {
            return this.f20845i;
        }

        /* renamed from: h */
        public int m24632h() {
            return this.f20846j;
        }

        /* renamed from: b */
        public PhoneNumber m24624b(int i) {
            this.f20845i = true;
            this.f20846j = i;
            return this;
        }

        /* renamed from: i */
        public boolean m24633i() {
            return this.f20847k;
        }

        /* renamed from: j */
        public String m24634j() {
            return this.f20848l;
        }

        /* renamed from: b */
        public PhoneNumber m24625b(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f20847k = true;
            this.f20848l = str;
            return this;
        }

        /* renamed from: k */
        public PhoneNumber m24635k() {
            this.f20847k = false;
            this.f20848l = "";
            return this;
        }

        /* renamed from: l */
        public boolean m24636l() {
            return this.f20849m;
        }

        /* renamed from: m */
        public CountryCodeSource m24637m() {
            return this.f20850n;
        }

        /* renamed from: a */
        public PhoneNumber m24619a(CountryCodeSource countryCodeSource) {
            if (countryCodeSource == null) {
                throw new NullPointerException();
            }
            this.f20849m = true;
            this.f20850n = countryCodeSource;
            return this;
        }

        /* renamed from: n */
        public PhoneNumber m24638n() {
            this.f20849m = false;
            this.f20850n = CountryCodeSource.UNSPECIFIED;
            return this;
        }

        /* renamed from: o */
        public boolean m24639o() {
            return this.f20851o;
        }

        /* renamed from: p */
        public String m24640p() {
            return this.f20852p;
        }

        /* renamed from: c */
        public PhoneNumber m24626c(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f20851o = true;
            this.f20852p = str;
            return this;
        }

        /* renamed from: q */
        public PhoneNumber m24641q() {
            this.f20851o = false;
            this.f20852p = "";
            return this;
        }

        /* renamed from: a */
        public boolean m24622a(PhoneNumber phoneNumber) {
            boolean z = false;
            if (phoneNumber == null) {
                return false;
            }
            if (this == phoneNumber) {
                return true;
            }
            if (this.f20838b == phoneNumber.f20838b && this.f20840d == phoneNumber.f20840d && this.f20842f.equals(phoneNumber.f20842f) && this.f20844h == phoneNumber.f20844h && this.f20846j == phoneNumber.f20846j && this.f20848l.equals(phoneNumber.f20848l) && this.f20850n == phoneNumber.f20850n && this.f20852p.equals(phoneNumber.f20852p) && m24639o() == phoneNumber.m24639o()) {
                z = true;
            }
            return z;
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof PhoneNumber) || m24622a((PhoneNumber) obj) == null) ? null : true;
        }

        public int hashCode() {
            int i = 1237;
            int a = (((((((((((((((2173 + m24616a()) * 53) + Long.valueOf(m24623b()).hashCode()) * 53) + m24628d().hashCode()) * 53) + (m24630f() ? 1231 : 1237)) * 53) + m24632h()) * 53) + m24634j().hashCode()) * 53) + m24637m().hashCode()) * 53) + m24640p().hashCode()) * 53;
            if (m24639o()) {
                i = 1231;
            }
            return a + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Country Code: ");
            stringBuilder.append(this.f20838b);
            stringBuilder.append(" National Number: ");
            stringBuilder.append(this.f20840d);
            if (m24629e() && m24630f()) {
                stringBuilder.append(" Leading Zero(s): true");
            }
            if (m24631g()) {
                stringBuilder.append(" Number of leading zeros: ");
                stringBuilder.append(this.f20846j);
            }
            if (m24627c()) {
                stringBuilder.append(" Extension: ");
                stringBuilder.append(this.f20842f);
            }
            if (m24636l()) {
                stringBuilder.append(" Country Code Source: ");
                stringBuilder.append(this.f20850n);
            }
            if (m24639o()) {
                stringBuilder.append(" Preferred Domestic Carrier Code: ");
                stringBuilder.append(this.f20852p);
            }
            return stringBuilder.toString();
        }
    }
}
