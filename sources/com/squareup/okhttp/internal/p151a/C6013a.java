package com.squareup.okhttp.internal.p151a;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.squareup.okhttp.internal.a.a */
final class C6013a {
    /* renamed from: a */
    private final String f21987a;
    /* renamed from: b */
    private final int f21988b = this.f21987a.length();
    /* renamed from: c */
    private int f21989c;
    /* renamed from: d */
    private int f21990d;
    /* renamed from: e */
    private int f21991e;
    /* renamed from: f */
    private int f21992f;
    /* renamed from: g */
    private char[] f21993g;

    public C6013a(X500Principal x500Principal) {
        this.f21987a = x500Principal.getName("RFC2253");
    }

    /* renamed from: a */
    private String m25875a() {
        while (this.f21989c < this.f21988b && this.f21993g[this.f21989c] == ' ') {
            this.f21989c++;
        }
        if (this.f21989c == this.f21988b) {
            return null;
        }
        this.f21990d = this.f21989c;
        this.f21989c++;
        while (this.f21989c < this.f21988b && this.f21993g[this.f21989c] != '=' && this.f21993g[this.f21989c] != ' ') {
            this.f21989c++;
        }
        if (this.f21989c >= this.f21988b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected end of DN: ");
            stringBuilder.append(this.f21987a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f21991e = this.f21989c;
        if (this.f21993g[this.f21989c] == ' ') {
            while (this.f21989c < this.f21988b && this.f21993g[this.f21989c] != '=' && this.f21993g[this.f21989c] == ' ') {
                this.f21989c++;
            }
            if (this.f21993g[this.f21989c] != '=' || this.f21989c == this.f21988b) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected end of DN: ");
                stringBuilder.append(this.f21987a);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        this.f21989c++;
        while (this.f21989c < this.f21988b && this.f21993g[this.f21989c] == ' ') {
            this.f21989c++;
        }
        if (this.f21991e - this.f21990d > 4 && this.f21993g[this.f21990d + 3] == '.' && ((this.f21993g[this.f21990d] == 'O' || this.f21993g[this.f21990d] == 'o') && ((this.f21993g[this.f21990d + 1] == 'I' || this.f21993g[this.f21990d + 1] == 'i') && (this.f21993g[this.f21990d + 2] == 'D' || this.f21993g[this.f21990d + 2] == 'd')))) {
            this.f21990d += 4;
        }
        return new String(this.f21993g, this.f21990d, this.f21991e - this.f21990d);
    }

    /* renamed from: b */
    private String m25876b() {
        this.f21989c++;
        this.f21990d = this.f21989c;
        this.f21991e = this.f21990d;
        while (this.f21989c != this.f21988b) {
            if (this.f21993g[this.f21989c] == '\"') {
                this.f21989c++;
                while (this.f21989c < this.f21988b && this.f21993g[this.f21989c] == ' ') {
                    this.f21989c++;
                }
                return new String(this.f21993g, this.f21990d, this.f21991e - this.f21990d);
            }
            if (this.f21993g[this.f21989c] == '\\') {
                this.f21993g[this.f21991e] = m25879e();
            } else {
                this.f21993g[this.f21991e] = this.f21993g[this.f21989c];
            }
            this.f21989c++;
            this.f21991e++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected end of DN: ");
        stringBuilder.append(this.f21987a);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: c */
    private String m25877c() {
        if (this.f21989c + 4 >= this.f21988b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected end of DN: ");
            stringBuilder.append(this.f21987a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        int i;
        this.f21990d = this.f21989c;
        this.f21989c++;
        while (this.f21989c != this.f21988b && this.f21993g[this.f21989c] != '+' && this.f21993g[this.f21989c] != ',') {
            byte[] bArr;
            int i2;
            int i3;
            if (this.f21993g[this.f21989c] == ';') {
                break;
            } else if (this.f21993g[this.f21989c] == ' ') {
                this.f21991e = this.f21989c;
                this.f21989c++;
                while (this.f21989c < this.f21988b && this.f21993g[this.f21989c] == ' ') {
                    this.f21989c++;
                }
                i = this.f21991e - this.f21990d;
                if (i >= 5) {
                    if ((i & 1) == 0) {
                        bArr = new byte[(i / 2)];
                        i2 = this.f21990d + 1;
                        for (i3 = 0; i3 < bArr.length; i3++) {
                            bArr[i3] = (byte) m25874a(i2);
                            i2 += 2;
                        }
                        return new String(this.f21993g, this.f21990d, i);
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected end of DN: ");
                stringBuilder.append(this.f21987a);
                throw new IllegalStateException(stringBuilder.toString());
            } else {
                if (this.f21993g[this.f21989c] >= 'A' && this.f21993g[this.f21989c] <= 'F') {
                    char[] cArr = this.f21993g;
                    i3 = this.f21989c;
                    cArr[i3] = (char) (cArr[i3] + 32);
                }
                this.f21989c++;
            }
        }
        this.f21991e = this.f21989c;
        i = this.f21991e - this.f21990d;
        if (i >= 5) {
            if ((i & 1) == 0) {
                bArr = new byte[(i / 2)];
                i2 = this.f21990d + 1;
                for (i3 = 0; i3 < bArr.length; i3++) {
                    bArr[i3] = (byte) m25874a(i2);
                    i2 += 2;
                }
                return new String(this.f21993g, this.f21990d, i);
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected end of DN: ");
        stringBuilder.append(this.f21987a);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: d */
    private String m25878d() {
        this.f21990d = this.f21989c;
        this.f21991e = this.f21989c;
        while (this.f21989c < this.f21988b) {
            char c = this.f21993g[this.f21989c];
            char[] cArr;
            if (c != ' ') {
                if (c != ';') {
                    int i;
                    if (c != '\\') {
                        switch (c) {
                            case '+':
                            case ',':
                                break;
                            default:
                                cArr = this.f21993g;
                                i = this.f21991e;
                                this.f21991e = i + 1;
                                cArr[i] = this.f21993g[this.f21989c];
                                this.f21989c++;
                                continue;
                        }
                    } else {
                        cArr = this.f21993g;
                        i = this.f21991e;
                        this.f21991e = i + 1;
                        cArr[i] = m25879e();
                        this.f21989c++;
                    }
                }
                return new String(this.f21993g, this.f21990d, this.f21991e - this.f21990d);
            }
            this.f21992f = this.f21991e;
            this.f21989c++;
            cArr = this.f21993g;
            int i2 = this.f21991e;
            this.f21991e = i2 + 1;
            cArr[i2] = ' ';
            while (this.f21989c < this.f21988b && this.f21993g[this.f21989c] == ' ') {
                cArr = this.f21993g;
                i2 = this.f21991e;
                this.f21991e = i2 + 1;
                cArr[i2] = ' ';
                this.f21989c++;
            }
            if (this.f21989c == this.f21988b || this.f21993g[this.f21989c] == ',' || this.f21993g[this.f21989c] == '+' || this.f21993g[this.f21989c] == ';') {
                return new String(this.f21993g, this.f21990d, this.f21992f - this.f21990d);
            }
        }
        return new String(this.f21993g, this.f21990d, this.f21991e - this.f21990d);
    }

    /* renamed from: e */
    private char m25879e() {
        this.f21989c++;
        if (this.f21989c == this.f21988b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected end of DN: ");
            stringBuilder.append(this.f21987a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        char c = this.f21993g[this.f21989c];
        if (!(c == ' ' || c == '%' || c == '\\' || c == '_')) {
            switch (c) {
                case '\"':
                case '#':
                    break;
                default:
                    switch (c) {
                        case '*':
                        case '+':
                        case ',':
                            break;
                        default:
                            switch (c) {
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                    break;
                                default:
                                    return m25880f();
                            }
                    }
            }
        }
        return this.f21993g[this.f21989c];
    }

    /* renamed from: f */
    private char m25880f() {
        int a = m25874a(this.f21989c);
        this.f21989c++;
        if (a < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            return (char) a;
        }
        if (a < 192 || a > 247) {
            return ManagerWebServices.QUERY_QUESTION_MARK;
        }
        int i;
        if (a <= 223) {
            a &= 31;
            i = 1;
        } else if (a <= 239) {
            i = 2;
            a &= 15;
        } else {
            i = 3;
            a &= 7;
        }
        int i2 = 0;
        while (i2 < i) {
            this.f21989c++;
            if (this.f21989c != this.f21988b) {
                if (this.f21993g[this.f21989c] == '\\') {
                    this.f21989c++;
                    int a2 = m25874a(this.f21989c);
                    this.f21989c++;
                    if ((a2 & 192) != ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        return ManagerWebServices.QUERY_QUESTION_MARK;
                    }
                    a = (a << 6) + (a2 & 63);
                    i2++;
                }
            }
            return ManagerWebServices.QUERY_QUESTION_MARK;
        }
        return (char) a;
    }

    /* renamed from: a */
    private int m25874a(int i) {
        int i2 = i + 1;
        if (i2 >= this.f21988b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Malformed DN: ");
            stringBuilder.append(this.f21987a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        i = this.f21993g[i];
        if (i >= 48 && i <= 57) {
            i -= 48;
        } else if (i >= 97 && i <= 102) {
            i -= 87;
        } else if (i < 65 || i > 70) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Malformed DN: ");
            stringBuilder.append(this.f21987a);
            throw new IllegalStateException(stringBuilder.toString());
        } else {
            i -= 55;
        }
        char c = this.f21993g[i2];
        if (c >= '0' && c <= '9') {
            i2 = c - 48;
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 87;
        } else if (c < 'A' || c > 'F') {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Malformed DN: ");
            stringBuilder.append(this.f21987a);
            throw new IllegalStateException(stringBuilder.toString());
        } else {
            i2 = c - 55;
        }
        return (i << 4) + i2;
    }

    /* renamed from: a */
    public String m25881a(String str) {
        this.f21989c = 0;
        this.f21990d = 0;
        this.f21991e = 0;
        this.f21992f = 0;
        this.f21993g = this.f21987a.toCharArray();
        String a = m25875a();
        if (a == null) {
            return null;
        }
        StringBuilder stringBuilder;
        do {
            String str2 = "";
            if (this.f21989c == this.f21988b) {
                return null;
            }
            switch (this.f21993g[this.f21989c]) {
                case '\"':
                    str2 = m25876b();
                    break;
                case '#':
                    str2 = m25877c();
                    break;
                case '+':
                case ',':
                case ';':
                    break;
                default:
                    str2 = m25878d();
                    break;
            }
            if (str.equalsIgnoreCase(a)) {
                return str2;
            }
            if (this.f21989c >= this.f21988b) {
                return null;
            }
            if (this.f21993g[this.f21989c] != ',') {
                if (this.f21993g[this.f21989c] != ';') {
                    if (this.f21993g[this.f21989c] != '+') {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Malformed DN: ");
                        stringBuilder.append(this.f21987a);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
            this.f21989c++;
            a = m25875a();
        } while (a != null);
        stringBuilder = new StringBuilder();
        stringBuilder.append("Malformed DN: ");
        stringBuilder.append(this.f21987a);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
