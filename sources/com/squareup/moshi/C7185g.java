package com.squareup.moshi;

import com.squareup.moshi.JsonReader.C5971a;
import com.squareup.moshi.JsonReader.Token;
import com.tinder.api.ManagerWebServices;
import java.io.EOFException;
import java.io.IOException;
import javax.annotation.Nullable;
import okio.BufferedSource;
import okio.ByteString;
import okio.C18549c;

/* renamed from: com.squareup.moshi.g */
final class C7185g extends JsonReader {
    /* renamed from: g */
    private static final ByteString f25969g = ByteString.a("'\\");
    /* renamed from: h */
    private static final ByteString f25970h = ByteString.a("\"\\");
    /* renamed from: i */
    private static final ByteString f25971i = ByteString.a("{}[]:, \n\t\r\f/\\;#=");
    /* renamed from: j */
    private static final ByteString f25972j = ByteString.a("\n\r");
    /* renamed from: k */
    private final BufferedSource f25973k;
    /* renamed from: l */
    private final C18549c f25974l;
    /* renamed from: m */
    private int f25975m = 0;
    /* renamed from: n */
    private long f25976n;
    /* renamed from: o */
    private int f25977o;
    @Nullable
    /* renamed from: p */
    private String f25978p;

    C7185g(BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.f25973k = bufferedSource;
        this.f25974l = bufferedSource.buffer();
        m25585a(6);
    }

    /* renamed from: c */
    public void mo6449c() throws IOException {
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        if (i == 3) {
            m25585a(1);
            this.d[this.a - 1] = 0;
            this.f25975m = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_ARRAY but was ");
        stringBuilder.append(mo6454h());
        stringBuilder.append(" at path ");
        stringBuilder.append(m25606r());
        throw new JsonDataException(stringBuilder.toString());
    }

    /* renamed from: d */
    public void mo6450d() throws IOException {
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        if (i == 4) {
            this.a--;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f25975m = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_ARRAY but was ");
        stringBuilder.append(mo6454h());
        stringBuilder.append(" at path ");
        stringBuilder.append(m25606r());
        throw new JsonDataException(stringBuilder.toString());
    }

    /* renamed from: e */
    public void mo6451e() throws IOException {
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        if (i == 1) {
            m25585a(3);
            this.f25975m = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_OBJECT but was ");
        stringBuilder.append(mo6454h());
        stringBuilder.append(" at path ");
        stringBuilder.append(m25606r());
        throw new JsonDataException(stringBuilder.toString());
    }

    /* renamed from: f */
    public void mo6452f() throws IOException {
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        if (i == 2) {
            this.a--;
            this.c[this.a] = null;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f25975m = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_OBJECT but was ");
        stringBuilder.append(mo6454h());
        stringBuilder.append(" at path ");
        stringBuilder.append(m25606r());
        throw new JsonDataException(stringBuilder.toString());
    }

    /* renamed from: g */
    public boolean mo6453g() throws IOException {
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: h */
    public Token mo6454h() throws IOException {
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        switch (i) {
            case 1:
                return Token.BEGIN_OBJECT;
            case 2:
                return Token.END_OBJECT;
            case 3:
                return Token.BEGIN_ARRAY;
            case 4:
                return Token.END_ARRAY;
            case 5:
            case 6:
                return Token.BOOLEAN;
            case 7:
                return Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return Token.NAME;
            case 16:
            case 17:
                return Token.NUMBER;
            case 18:
                return Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: t */
    private int m30848t() throws IOException {
        int c;
        int i = this.b[this.a - 1];
        if (i == 1) {
            r0.b[r0.a - 1] = 2;
        } else if (i == 2) {
            c = m30847c(true);
            r0.f25974l.readByte();
            if (c != 44) {
                if (c == 59) {
                    m30853y();
                } else if (c != 93) {
                    throw m25584a("Unterminated array");
                } else {
                    r0.f25975m = 4;
                    return 4;
                }
            }
        } else {
            if (i != 3) {
                if (i != 5) {
                    if (i == 4) {
                        r0.b[r0.a - 1] = 5;
                        c = m30847c(true);
                        r0.f25974l.readByte();
                        if (c != 58) {
                            if (c != 61) {
                                throw m25584a("Expected ':'");
                            }
                            m30853y();
                            if (r0.f25973k.request(1) && r0.f25974l.a(0) == (byte) 62) {
                                r0.f25974l.readByte();
                            }
                        }
                    } else if (i == 6) {
                        r0.b[r0.a - 1] = 7;
                    } else if (i == 7) {
                        if (m30847c(false) == -1) {
                            r0.f25975m = 18;
                            return 18;
                        }
                        m30853y();
                    } else if (i == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
            }
            r0.b[r0.a - 1] = 4;
            if (i == 5) {
                int c2 = m30847c(true);
                r0.f25974l.readByte();
                if (c2 != 44) {
                    if (c2 == 59) {
                        m30853y();
                    } else if (c2 != 125) {
                        throw m25584a("Unterminated object");
                    } else {
                        r0.f25975m = 2;
                        return 2;
                    }
                }
            }
            int c3 = m30847c(true);
            if (c3 == 34) {
                r0.f25974l.readByte();
                r0.f25975m = 13;
                return 13;
            } else if (c3 == 39) {
                r0.f25974l.readByte();
                m30853y();
                r0.f25975m = 12;
                return 12;
            } else if (c3 != 125) {
                m30853y();
                if (m30845b((char) c3)) {
                    r0.f25975m = 14;
                    return 14;
                }
                throw m25584a("Expected name");
            } else if (i != 5) {
                r0.f25974l.readByte();
                r0.f25975m = 2;
                return 2;
            } else {
                throw m25584a("Expected name");
            }
        }
        c = m30847c(true);
        if (c == 34) {
            r0.f25974l.readByte();
            r0.f25975m = 9;
            return 9;
        } else if (c != 39) {
            if (!(c == 44 || c == 59)) {
                if (c == 91) {
                    r0.f25974l.readByte();
                    r0.f25975m = 3;
                    return 3;
                } else if (c != 93) {
                    if (c != 123) {
                        i = m30849u();
                        if (i != 0) {
                            return i;
                        }
                        i = m30850v();
                        if (i != 0) {
                            return i;
                        }
                        if (m30845b(r0.f25974l.a(0))) {
                            m30853y();
                            r0.f25975m = 10;
                            return 10;
                        }
                        throw m25584a("Expected value");
                    }
                    r0.f25974l.readByte();
                    r0.f25975m = 1;
                    return 1;
                } else if (i == 1) {
                    r0.f25974l.readByte();
                    r0.f25975m = 4;
                    return 4;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw m25584a("Unexpected value");
                }
            }
            m30853y();
            r0.f25975m = 7;
            return 7;
        } else {
            m30853y();
            r0.f25974l.readByte();
            r0.f25975m = 8;
            return 8;
        }
    }

    /* renamed from: u */
    private int m30849u() throws IOException {
        String str;
        String str2;
        int i;
        int length;
        int i2;
        int i3;
        char a;
        byte a2 = this.f25974l.a(0);
        if (a2 != (byte) 116) {
            if (a2 != (byte) 84) {
                if (a2 != (byte) 102) {
                    if (a2 != (byte) 70) {
                        if (a2 != (byte) 110) {
                            if (a2 != (byte) 78) {
                                return 0;
                            }
                        }
                        str = ManagerWebServices.NULL_STRING_VALUE;
                        str2 = "NULL";
                        i = 7;
                        length = str.length();
                        i2 = 1;
                        while (i2 < length) {
                            i3 = i2 + 1;
                            if (this.f25973k.request((long) i3)) {
                                return 0;
                            }
                            a = this.f25974l.a((long) i2);
                            if (a != str.charAt(i2) && a != r2.charAt(i2)) {
                                return 0;
                            }
                            i2 = i3;
                        }
                        if (!this.f25973k.request((long) (length + 1)) && m30845b(this.f25974l.a((long) length))) {
                            return 0;
                        }
                        this.f25974l.skip((long) length);
                        this.f25975m = i;
                        return i;
                    }
                }
                str = "false";
                str2 = "FALSE";
                i = 6;
                length = str.length();
                i2 = 1;
                while (i2 < length) {
                    i3 = i2 + 1;
                    if (this.f25973k.request((long) i3)) {
                        return 0;
                    }
                    a = this.f25974l.a((long) i2);
                    if (a != str.charAt(i2)) {
                    }
                    i2 = i3;
                }
                if (!this.f25973k.request((long) (length + 1))) {
                }
                this.f25974l.skip((long) length);
                this.f25975m = i;
                return i;
            }
        }
        str = "true";
        str2 = "TRUE";
        i = 5;
        length = str.length();
        i2 = 1;
        while (i2 < length) {
            i3 = i2 + 1;
            if (this.f25973k.request((long) i3)) {
                return 0;
            }
            a = this.f25974l.a((long) i2);
            if (a != str.charAt(i2)) {
            }
            i2 = i3;
        }
        if (!this.f25973k.request((long) (length + 1))) {
        }
        this.f25974l.skip((long) length);
        this.f25975m = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: v */
    private int m30850v() throws java.io.IOException {
        /*
        r18 = this;
        r0 = r18;
        r1 = 0;
        r3 = 1;
        r4 = 0;
        r7 = r1;
        r5 = 0;
        r6 = 0;
        r9 = 1;
        r10 = 0;
    L_0x000b:
        r11 = r0.f25973k;
        r12 = r5 + 1;
        r13 = (long) r12;
        r11 = r11.request(r13);
        r15 = 2;
        if (r11 != 0) goto L_0x0019;
    L_0x0017:
        goto L_0x0089;
    L_0x0019:
        r11 = r0.f25974l;
        r13 = (long) r5;
        r11 = r11.a(r13);
        r13 = 43;
        r14 = 5;
        if (r11 == r13) goto L_0x00d9;
    L_0x0025:
        r13 = 69;
        if (r11 == r13) goto L_0x00d0;
    L_0x0029:
        r13 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r11 == r13) goto L_0x00d0;
    L_0x002d:
        switch(r11) {
            case 45: goto L_0x00c6;
            case 46: goto L_0x00c0;
            default: goto L_0x0030;
        };
    L_0x0030:
        r13 = 48;
        if (r11 < r13) goto L_0x0083;
    L_0x0034:
        r13 = 57;
        if (r11 <= r13) goto L_0x0039;
    L_0x0038:
        goto L_0x0083;
    L_0x0039:
        if (r6 == r3) goto L_0x007b;
    L_0x003b:
        if (r6 != 0) goto L_0x003e;
    L_0x003d:
        goto L_0x007b;
    L_0x003e:
        if (r6 != r15) goto L_0x0067;
    L_0x0040:
        r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r5 != 0) goto L_0x0045;
    L_0x0044:
        return r4;
    L_0x0045:
        r13 = 10;
        r13 = r13 * r7;
        r11 = r11 + -48;
        r3 = (long) r11;
        r15 = r13 - r3;
        r3 = -922337203685477580; // 0xf333333333333334 float:4.1723254E-8 double:-8.390303882365713E246;
        r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r5 > 0) goto L_0x0062;
    L_0x0057:
        r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x0060;
    L_0x005b:
        r3 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1));
        if (r3 >= 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0062;
    L_0x0060:
        r3 = 0;
        goto L_0x0063;
    L_0x0062:
        r3 = 1;
    L_0x0063:
        r3 = r3 & r9;
        r9 = r3;
        r7 = r15;
        goto L_0x0074;
    L_0x0067:
        r3 = 3;
        if (r6 != r3) goto L_0x006e;
    L_0x006a:
        r4 = 0;
        r6 = 4;
        goto L_0x00dd;
    L_0x006e:
        if (r6 == r14) goto L_0x0077;
    L_0x0070:
        r3 = 6;
        if (r6 != r3) goto L_0x0074;
    L_0x0073:
        goto L_0x0077;
    L_0x0074:
        r4 = 0;
        goto L_0x00dd;
    L_0x0077:
        r4 = 0;
        r6 = 7;
        goto L_0x00dd;
    L_0x007b:
        r11 = r11 + -48;
        r3 = -r11;
        r3 = (long) r3;
        r7 = r3;
        r4 = 0;
        r6 = 2;
        goto L_0x00dd;
    L_0x0083:
        r3 = r0.m30845b(r11);
        if (r3 != 0) goto L_0x00be;
    L_0x0089:
        if (r6 != r15) goto L_0x00ac;
    L_0x008b:
        if (r9 == 0) goto L_0x00ac;
    L_0x008d:
        r3 = -9223372036854775808;
        r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r9 != 0) goto L_0x0095;
    L_0x0093:
        if (r10 == 0) goto L_0x00ac;
    L_0x0095:
        r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r3 != 0) goto L_0x009b;
    L_0x0099:
        if (r10 != 0) goto L_0x00ac;
    L_0x009b:
        if (r10 == 0) goto L_0x009e;
    L_0x009d:
        goto L_0x009f;
    L_0x009e:
        r7 = -r7;
    L_0x009f:
        r0.f25976n = r7;
        r1 = r0.f25974l;
        r2 = (long) r5;
        r1.skip(r2);
        r1 = 16;
        r0.f25975m = r1;
        return r1;
    L_0x00ac:
        if (r6 == r15) goto L_0x00b7;
    L_0x00ae:
        r1 = 4;
        if (r6 == r1) goto L_0x00b7;
    L_0x00b1:
        r1 = 7;
        if (r6 != r1) goto L_0x00b5;
    L_0x00b4:
        goto L_0x00b7;
    L_0x00b5:
        r4 = 0;
        return r4;
    L_0x00b7:
        r0.f25977o = r5;
        r1 = 17;
        r0.f25975m = r1;
        return r1;
    L_0x00be:
        r4 = 0;
        return r4;
    L_0x00c0:
        r3 = 3;
        if (r6 != r15) goto L_0x00c5;
    L_0x00c3:
        r6 = 3;
        goto L_0x00dd;
    L_0x00c5:
        return r4;
    L_0x00c6:
        r3 = 6;
        if (r6 != 0) goto L_0x00cc;
    L_0x00c9:
        r6 = 1;
        r10 = 1;
        goto L_0x00dd;
    L_0x00cc:
        if (r6 != r14) goto L_0x00cf;
    L_0x00ce:
        goto L_0x00dc;
    L_0x00cf:
        return r4;
    L_0x00d0:
        if (r6 == r15) goto L_0x00d7;
    L_0x00d2:
        r3 = 4;
        if (r6 != r3) goto L_0x00d6;
    L_0x00d5:
        goto L_0x00d7;
    L_0x00d6:
        return r4;
    L_0x00d7:
        r6 = 5;
        goto L_0x00dd;
    L_0x00d9:
        r3 = 6;
        if (r6 != r14) goto L_0x00e1;
    L_0x00dc:
        r6 = 6;
    L_0x00dd:
        r5 = r12;
        r3 = 1;
        goto L_0x000b;
    L_0x00e1:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.v():int");
    }

    /* renamed from: b */
    private boolean m30845b(int i) throws IOException {
        switch (i) {
            case 9:
            case 10:
            case 12:
            case 13:
            case 32:
            case 44:
            case 58:
            case 91:
            case 93:
            case 123:
            case 125:
                break;
            case 35:
            case 47:
            case 59:
            case 61:
            case 92:
                m30853y();
                break;
            default:
                return true;
        }
        return false;
    }

    /* renamed from: i */
    public String mo6455i() throws IOException {
        String w;
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        if (i == 14) {
            w = m30851w();
        } else if (i == 13) {
            w = m30842a(f25970h);
        } else if (i == 12) {
            w = m30842a(f25969g);
        } else if (i == 15) {
            w = this.f25978p;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a name but was ");
            stringBuilder.append(mo6454h());
            stringBuilder.append(" at path ");
            stringBuilder.append(m25606r());
            throw new JsonDataException(stringBuilder.toString());
        }
        this.f25975m = 0;
        this.c[this.a - 1] = w;
        return w;
    }

    /* renamed from: a */
    public int mo6447a(C5971a c5971a) throws IOException {
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        if (i >= 12) {
            if (i <= 15) {
                if (i == 15) {
                    return m30841a(this.f25978p, c5971a);
                }
                i = this.f25973k.select(c5971a.f21803b);
                if (i != -1) {
                    this.f25975m = 0;
                    this.c[this.a - 1] = c5971a.f21802a[i];
                    return i;
                }
                String str = this.c[this.a - 1];
                String i2 = mo6455i();
                c5971a = m30841a(i2, c5971a);
                if (c5971a == -1) {
                    this.f25975m = 15;
                    this.f25978p = i2;
                    this.c[this.a - 1] = str;
                }
                return c5971a;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private int m30841a(String str, C5971a c5971a) {
        int length = c5971a.f21802a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c5971a.f21802a[i])) {
                this.f25975m = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public String mo6456j() throws IOException {
        String w;
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        if (i == 10) {
            w = m30851w();
        } else if (i == 9) {
            w = m30842a(f25970h);
        } else if (i == 8) {
            w = m30842a(f25969g);
        } else if (i == 11) {
            w = this.f25978p;
            this.f25978p = null;
        } else if (i == 16) {
            w = Long.toString(this.f25976n);
        } else if (i == 17) {
            w = this.f25974l.readUtf8((long) this.f25977o);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a string but was ");
            stringBuilder.append(mo6454h());
            stringBuilder.append(" at path ");
            stringBuilder.append(m25606r());
            throw new JsonDataException(stringBuilder.toString());
        }
        this.f25975m = 0;
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return w;
    }

    /* renamed from: b */
    public int mo6448b(C5971a c5971a) throws IOException {
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        if (i >= 8) {
            if (i <= 11) {
                if (i == 11) {
                    return m30843b(this.f25978p, c5971a);
                }
                i = this.f25973k.select(c5971a.f21803b);
                int i2;
                if (i != -1) {
                    this.f25975m = null;
                    c5971a = this.d;
                    i2 = this.a - 1;
                    c5971a[i2] = c5971a[i2] + 1;
                    return i;
                }
                String j = mo6456j();
                c5971a = m30843b(j, c5971a);
                if (c5971a == -1) {
                    this.f25975m = 11;
                    this.f25978p = j;
                    int[] iArr = this.d;
                    i2 = this.a - 1;
                    iArr[i2] = iArr[i2] - 1;
                }
                return c5971a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private int m30843b(String str, C5971a c5971a) {
        int length = c5971a.f21802a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c5971a.f21802a[i])) {
                this.f25975m = 0;
                str = this.d;
                c5971a = this.a - 1;
                str[c5971a] = str[c5971a] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public boolean mo6457k() throws IOException {
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        int[] iArr;
        int i2;
        if (i == 5) {
            this.f25975m = 0;
            iArr = this.d;
            i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f25975m = 0;
            iArr = this.d;
            i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a boolean but was ");
            stringBuilder.append(mo6454h());
            stringBuilder.append(" at path ");
            stringBuilder.append(m25606r());
            throw new JsonDataException(stringBuilder.toString());
        }
    }

    @Nullable
    /* renamed from: l */
    public <T> T mo6458l() throws IOException {
        int i = this.f25975m;
        if (i == 0) {
            i = m30848t();
        }
        if (i == 7) {
            this.f25975m = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected null but was ");
        stringBuilder.append(mo6454h());
        stringBuilder.append(" at path ");
        stringBuilder.append(m25606r());
        throw new JsonDataException(stringBuilder.toString());
    }

    /* renamed from: m */
    public double mo6459m() throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r6.f25975m;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r6.m30848t();
    L_0x0008:
        r1 = 16;
        r2 = 0;
        if (r0 != r1) goto L_0x001f;
    L_0x000d:
        r6.f25975m = r2;
        r0 = r6.d;
        r1 = r6.a;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        r0 = r6.f25976n;
        r0 = (double) r0;
        return r0;
    L_0x001f:
        r1 = 17;
        r3 = 11;
        if (r0 != r1) goto L_0x0031;
    L_0x0025:
        r0 = r6.f25974l;
        r1 = r6.f25977o;
        r4 = (long) r1;
        r0 = r0.readUtf8(r4);
        r6.f25978p = r0;
        goto L_0x007f;
    L_0x0031:
        r1 = 9;
        if (r0 != r1) goto L_0x003e;
    L_0x0035:
        r0 = f25970h;
        r0 = r6.m30842a(r0);
        r6.f25978p = r0;
        goto L_0x007f;
    L_0x003e:
        r1 = 8;
        if (r0 != r1) goto L_0x004b;
    L_0x0042:
        r0 = f25969g;
        r0 = r6.m30842a(r0);
        r6.f25978p = r0;
        goto L_0x007f;
    L_0x004b:
        r1 = 10;
        if (r0 != r1) goto L_0x0056;
    L_0x004f:
        r0 = r6.m30851w();
        r6.f25978p = r0;
        goto L_0x007f;
    L_0x0056:
        if (r0 == r3) goto L_0x007f;
    L_0x0058:
        r0 = new com.squareup.moshi.JsonDataException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected a double but was ";
        r1.append(r2);
        r2 = r6.mo6454h();
        r1.append(r2);
        r2 = " at path ";
        r1.append(r2);
        r2 = r6.m25606r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x007f:
        r6.f25975m = r3;
        r0 = r6.f25978p;	 Catch:{ NumberFormatException -> 0x00cc }
        r0 = java.lang.Double.parseDouble(r0);	 Catch:{ NumberFormatException -> 0x00cc }
        r3 = r6.e;
        if (r3 != 0) goto L_0x00ba;
    L_0x008b:
        r3 = java.lang.Double.isNaN(r0);
        if (r3 != 0) goto L_0x0097;
    L_0x0091:
        r3 = java.lang.Double.isInfinite(r0);
        if (r3 == 0) goto L_0x00ba;
    L_0x0097:
        r2 = new com.squareup.moshi.JsonEncodingException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "JSON forbids NaN and infinities: ";
        r3.append(r4);
        r3.append(r0);
        r0 = " at path ";
        r3.append(r0);
        r0 = r6.m25606r();
        r3.append(r0);
        r0 = r3.toString();
        r2.<init>(r0);
        throw r2;
    L_0x00ba:
        r3 = 0;
        r6.f25978p = r3;
        r6.f25975m = r2;
        r2 = r6.d;
        r3 = r6.a;
        r3 = r3 + -1;
        r4 = r2[r3];
        r4 = r4 + 1;
        r2[r3] = r4;
        return r0;
    L_0x00cc:
        r0 = new com.squareup.moshi.JsonDataException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected a double but was ";
        r1.append(r2);
        r2 = r6.f25978p;
        r1.append(r2);
        r2 = " at path ";
        r1.append(r2);
        r2 = r6.m25606r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.m():double");
    }

    /* renamed from: n */
    public long mo6460n() throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = r7.f25975m;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r7.m30848t();
    L_0x0008:
        r1 = 16;
        r2 = 0;
        if (r0 != r1) goto L_0x001e;
    L_0x000d:
        r7.f25975m = r2;
        r0 = r7.d;
        r1 = r7.a;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        r0 = r7.f25976n;
        return r0;
    L_0x001e:
        r1 = 17;
        r3 = 11;
        if (r0 != r1) goto L_0x0030;
    L_0x0024:
        r0 = r7.f25974l;
        r1 = r7.f25977o;
        r4 = (long) r1;
        r0 = r0.readUtf8(r4);
        r7.f25978p = r0;
        goto L_0x0088;
    L_0x0030:
        r1 = 9;
        if (r0 == r1) goto L_0x0062;
    L_0x0034:
        r4 = 8;
        if (r0 != r4) goto L_0x0039;
    L_0x0038:
        goto L_0x0062;
    L_0x0039:
        if (r0 == r3) goto L_0x0088;
    L_0x003b:
        r0 = new com.squareup.moshi.JsonDataException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected a long but was ";
        r1.append(r2);
        r2 = r7.mo6454h();
        r1.append(r2);
        r2 = " at path ";
        r1.append(r2);
        r2 = r7.m25606r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0062:
        if (r0 != r1) goto L_0x006b;
    L_0x0064:
        r0 = f25970h;
        r0 = r7.m30842a(r0);
        goto L_0x0071;
    L_0x006b:
        r0 = f25969g;
        r0 = r7.m30842a(r0);
    L_0x0071:
        r7.f25978p = r0;
        r0 = r7.f25978p;	 Catch:{ NumberFormatException -> 0x0088 }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0088 }
        r7.f25975m = r2;	 Catch:{ NumberFormatException -> 0x0088 }
        r4 = r7.d;	 Catch:{ NumberFormatException -> 0x0088 }
        r5 = r7.a;	 Catch:{ NumberFormatException -> 0x0088 }
        r5 = r5 + -1;	 Catch:{ NumberFormatException -> 0x0088 }
        r6 = r4[r5];	 Catch:{ NumberFormatException -> 0x0088 }
        r6 = r6 + 1;	 Catch:{ NumberFormatException -> 0x0088 }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x0088 }
        return r0;
    L_0x0088:
        r7.f25975m = r3;
        r0 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x00a7, NumberFormatException -> 0x00a7 }
        r1 = r7.f25978p;	 Catch:{ NumberFormatException -> 0x00a7, NumberFormatException -> 0x00a7 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x00a7, NumberFormatException -> 0x00a7 }
        r0 = r0.longValueExact();	 Catch:{ NumberFormatException -> 0x00a7, NumberFormatException -> 0x00a7 }
        r3 = 0;
        r7.f25978p = r3;
        r7.f25975m = r2;
        r2 = r7.d;
        r3 = r7.a;
        r3 = r3 + -1;
        r4 = r2[r3];
        r4 = r4 + 1;
        r2[r3] = r4;
        return r0;
    L_0x00a7:
        r0 = new com.squareup.moshi.JsonDataException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected a long but was ";
        r1.append(r2);
        r2 = r7.f25978p;
        r1.append(r2);
        r2 = " at path ";
        r1.append(r2);
        r2 = r7.m25606r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.n():long");
    }

    /* renamed from: a */
    private String m30842a(ByteString byteString) throws IOException {
        StringBuilder stringBuilder = null;
        while (true) {
            long indexOfElement = this.f25973k.indexOfElement(byteString);
            if (indexOfElement != -1) {
                if (this.f25974l.a(indexOfElement) != (byte) 92) {
                    break;
                }
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(this.f25974l.readUtf8(indexOfElement));
                this.f25974l.readByte();
                stringBuilder.append(m30840A());
            } else {
                throw m25584a("Unterminated string");
            }
        }
        if (stringBuilder == null) {
            byteString = this.f25974l.readUtf8(indexOfElement);
            this.f25974l.readByte();
            return byteString;
        }
        stringBuilder.append(this.f25974l.readUtf8(indexOfElement));
        this.f25974l.readByte();
        return stringBuilder.toString();
    }

    /* renamed from: w */
    private String m30851w() throws IOException {
        long indexOfElement = this.f25973k.indexOfElement(f25971i);
        return indexOfElement != -1 ? this.f25974l.readUtf8(indexOfElement) : this.f25974l.readUtf8();
    }

    /* renamed from: b */
    private void m30844b(ByteString byteString) throws IOException {
        while (true) {
            long indexOfElement = this.f25973k.indexOfElement(byteString);
            if (indexOfElement == -1) {
                throw m25584a("Unterminated string");
            } else if (this.f25974l.a(indexOfElement) == (byte) 92) {
                this.f25974l.skip(indexOfElement + 1);
                m30840A();
            } else {
                this.f25974l.skip(indexOfElement + 1);
                return;
            }
        }
    }

    /* renamed from: x */
    private void m30852x() throws IOException {
        long indexOfElement = this.f25973k.indexOfElement(f25971i);
        C18549c c18549c = this.f25974l;
        if (indexOfElement == -1) {
            indexOfElement = this.f25974l.a();
        }
        c18549c.skip(indexOfElement);
    }

    /* renamed from: o */
    public int mo6461o() throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = r7.f25975m;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r7.m30848t();
    L_0x0008:
        r1 = 16;
        r2 = 0;
        if (r0 != r1) goto L_0x004b;
    L_0x000d:
        r0 = r7.f25976n;
        r0 = (int) r0;
        r3 = r7.f25976n;
        r5 = (long) r0;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 == 0) goto L_0x003c;
    L_0x0017:
        r0 = new com.squareup.moshi.JsonDataException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected an int but was ";
        r1.append(r2);
        r2 = r7.f25976n;
        r1.append(r2);
        r2 = " at path ";
        r1.append(r2);
        r2 = r7.m25606r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x003c:
        r7.f25975m = r2;
        r1 = r7.d;
        r2 = r7.a;
        r2 = r2 + -1;
        r3 = r1[r2];
        r3 = r3 + 1;
        r1[r2] = r3;
        return r0;
    L_0x004b:
        r1 = 17;
        r3 = 11;
        if (r0 != r1) goto L_0x005d;
    L_0x0051:
        r0 = r7.f25974l;
        r1 = r7.f25977o;
        r4 = (long) r1;
        r0 = r0.readUtf8(r4);
        r7.f25978p = r0;
        goto L_0x00b5;
    L_0x005d:
        r1 = 9;
        if (r0 == r1) goto L_0x008f;
    L_0x0061:
        r4 = 8;
        if (r0 != r4) goto L_0x0066;
    L_0x0065:
        goto L_0x008f;
    L_0x0066:
        if (r0 == r3) goto L_0x00b5;
    L_0x0068:
        r0 = new com.squareup.moshi.JsonDataException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected an int but was ";
        r1.append(r2);
        r2 = r7.mo6454h();
        r1.append(r2);
        r2 = " at path ";
        r1.append(r2);
        r2 = r7.m25606r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x008f:
        if (r0 != r1) goto L_0x0098;
    L_0x0091:
        r0 = f25970h;
        r0 = r7.m30842a(r0);
        goto L_0x009e;
    L_0x0098:
        r0 = f25969g;
        r0 = r7.m30842a(r0);
    L_0x009e:
        r7.f25978p = r0;
        r0 = r7.f25978p;	 Catch:{ NumberFormatException -> 0x00b5 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00b5 }
        r7.f25975m = r2;	 Catch:{ NumberFormatException -> 0x00b5 }
        r1 = r7.d;	 Catch:{ NumberFormatException -> 0x00b5 }
        r4 = r7.a;	 Catch:{ NumberFormatException -> 0x00b5 }
        r4 = r4 + -1;	 Catch:{ NumberFormatException -> 0x00b5 }
        r5 = r1[r4];	 Catch:{ NumberFormatException -> 0x00b5 }
        r5 = r5 + 1;	 Catch:{ NumberFormatException -> 0x00b5 }
        r1[r4] = r5;	 Catch:{ NumberFormatException -> 0x00b5 }
        return r0;
    L_0x00b5:
        r7.f25975m = r3;
        r0 = r7.f25978p;	 Catch:{ NumberFormatException -> 0x00fa }
        r0 = java.lang.Double.parseDouble(r0);	 Catch:{ NumberFormatException -> 0x00fa }
        r3 = (int) r0;
        r4 = (double) r3;
        r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r6 == 0) goto L_0x00e8;
    L_0x00c3:
        r0 = new com.squareup.moshi.JsonDataException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected an int but was ";
        r1.append(r2);
        r2 = r7.f25978p;
        r1.append(r2);
        r2 = " at path ";
        r1.append(r2);
        r2 = r7.m25606r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00e8:
        r0 = 0;
        r7.f25978p = r0;
        r7.f25975m = r2;
        r0 = r7.d;
        r1 = r7.a;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r3;
    L_0x00fa:
        r0 = new com.squareup.moshi.JsonDataException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected an int but was ";
        r1.append(r2);
        r2 = r7.f25978p;
        r1.append(r2);
        r2 = " at path ";
        r1.append(r2);
        r2 = r7.m25606r();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.o():int");
    }

    public void close() throws IOException {
        this.f25975m = 0;
        this.b[0] = 8;
        this.a = 1;
        this.f25974l.d();
        this.f25973k.close();
    }

    /* renamed from: p */
    public void mo6462p() throws IOException {
        if (this.f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot skip unexpected ");
            stringBuilder.append(mo6454h());
            stringBuilder.append(" at ");
            stringBuilder.append(m25606r());
            throw new JsonDataException(stringBuilder.toString());
        }
        int i = 0;
        do {
            int i2 = this.f25975m;
            if (i2 == 0) {
                i2 = m30848t();
            }
            if (i2 == 3) {
                m25585a(1);
                i++;
            } else if (i2 == 1) {
                m25585a(3);
                i++;
            } else if (i2 == 4) {
                this.a--;
                i--;
            } else if (i2 == 2) {
                this.a--;
                i--;
            } else {
                if (i2 != 14) {
                    if (i2 != 10) {
                        if (i2 != 9) {
                            if (i2 != 13) {
                                if (i2 != 8) {
                                    if (i2 != 12) {
                                        if (i2 == 17) {
                                            this.f25974l.skip((long) this.f25977o);
                                        }
                                    }
                                }
                                m30844b(f25969g);
                            }
                        }
                        m30844b(f25970h);
                    }
                }
                m30852x();
            }
            this.f25975m = 0;
        } while (i != 0);
        int[] iArr = this.d;
        i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        this.c[this.a - 1] = ManagerWebServices.NULL_STRING_VALUE;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private int m30847c(boolean r7) throws java.io.IOException {
        /*
        r6 = this;
        r0 = 0;
    L_0x0001:
        r1 = 0;
    L_0x0002:
        r2 = r6.f25973k;
        r3 = r1 + 1;
        r4 = (long) r3;
        r2 = r2.request(r4);
        if (r2 == 0) goto L_0x0090;
    L_0x000d:
        r2 = r6.f25974l;
        r4 = (long) r1;
        r1 = r2.a(r4);
        r2 = 10;
        if (r1 == r2) goto L_0x008d;
    L_0x0018:
        r2 = 32;
        if (r1 == r2) goto L_0x008d;
    L_0x001c:
        r2 = 13;
        if (r1 == r2) goto L_0x008d;
    L_0x0020:
        r2 = 9;
        if (r1 != r2) goto L_0x0025;
    L_0x0024:
        goto L_0x008d;
    L_0x0025:
        r2 = r6.f25974l;
        r3 = r3 + -1;
        r3 = (long) r3;
        r2.skip(r3);
        r2 = 47;
        if (r1 != r2) goto L_0x0080;
    L_0x0031:
        r3 = r6.f25973k;
        r4 = 2;
        r3 = r3.request(r4);
        if (r3 != 0) goto L_0x003c;
    L_0x003b:
        return r1;
    L_0x003c:
        r6.m30853y();
        r3 = r6.f25974l;
        r4 = 1;
        r3 = r3.a(r4);
        r4 = 42;
        if (r3 == r4) goto L_0x005c;
    L_0x004b:
        if (r3 == r2) goto L_0x004e;
    L_0x004d:
        return r1;
    L_0x004e:
        r1 = r6.f25974l;
        r1.readByte();
        r1 = r6.f25974l;
        r1.readByte();
        r6.m30854z();
        goto L_0x0001;
    L_0x005c:
        r1 = r6.f25974l;
        r1.readByte();
        r1 = r6.f25974l;
        r1.readByte();
        r1 = "*/";
        r1 = r6.m30846b(r1);
        if (r1 != 0) goto L_0x0075;
    L_0x006e:
        r7 = "Unterminated comment";
        r7 = r6.m25584a(r7);
        throw r7;
    L_0x0075:
        r1 = r6.f25974l;
        r1.readByte();
        r1 = r6.f25974l;
        r1.readByte();
        goto L_0x0001;
    L_0x0080:
        r2 = 35;
        if (r1 != r2) goto L_0x008c;
    L_0x0084:
        r6.m30853y();
        r6.m30854z();
        goto L_0x0001;
    L_0x008c:
        return r1;
    L_0x008d:
        r1 = r3;
        goto L_0x0002;
    L_0x0090:
        if (r7 == 0) goto L_0x009a;
    L_0x0092:
        r7 = new java.io.EOFException;
        r0 = "End of input";
        r7.<init>(r0);
        throw r7;
    L_0x009a:
        r7 = -1;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.c(boolean):int");
    }

    /* renamed from: y */
    private void m30853y() throws IOException {
        if (!this.e) {
            throw m25584a("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: z */
    private void m30854z() throws IOException {
        long indexOfElement = this.f25973k.indexOfElement(f25972j);
        this.f25974l.skip(indexOfElement != -1 ? indexOfElement + 1 : this.f25974l.a());
    }

    /* renamed from: b */
    private boolean m30846b(String str) throws IOException {
        while (true) {
            int i = 0;
            if (!this.f25973k.request((long) str.length())) {
                return false;
            }
            while (i < str.length()) {
                if (this.f25974l.a((long) i) != str.charAt(i)) {
                    this.f25974l.readByte();
                } else {
                    i++;
                }
            }
            return true;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JsonReader(");
        stringBuilder.append(this.f25973k);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: A */
    private char m30840A() throws IOException {
        if (this.f25973k.request(1)) {
            byte readByte = this.f25974l.readByte();
            if (readByte == (byte) 10 || readByte == (byte) 34 || readByte == (byte) 39 || readByte == (byte) 47 || readByte == (byte) 92) {
                return (char) readByte;
            }
            if (readByte == (byte) 98) {
                return '\b';
            }
            if (readByte == (byte) 102) {
                return '\f';
            }
            if (readByte == (byte) 110) {
                return '\n';
            }
            if (readByte == (byte) 114) {
                return '\r';
            }
            StringBuilder stringBuilder;
            switch (readByte) {
                case (byte) 116:
                    return '\t';
                case (byte) 117:
                    if (this.f25973k.request(4)) {
                        char c = '\u0000';
                        for (int i = 0; i < 4; i++) {
                            byte a = this.f25974l.a((long) i);
                            c = (char) (c << 4);
                            if (a >= (byte) 48 && a <= (byte) 57) {
                                c = (char) (c + (a - 48));
                            } else if (a >= (byte) 97 && a <= (byte) 102) {
                                c = (char) (c + ((a - 97) + 10));
                            } else if (a < (byte) 65 || a > (byte) 70) {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("\\u");
                                stringBuilder2.append(this.f25974l.readUtf8(4));
                                throw m25584a(stringBuilder2.toString());
                            } else {
                                c = (char) (c + ((a - 65) + 10));
                            }
                        }
                        this.f25974l.skip(4);
                        return c;
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unterminated escape sequence at path ");
                    stringBuilder.append(m25606r());
                    throw new EOFException(stringBuilder.toString());
                default:
                    if (this.e) {
                        return (char) readByte;
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid escape sequence: \\");
                    stringBuilder.append((char) readByte);
                    throw m25584a(stringBuilder.toString());
            }
        }
        throw m25584a("Unterminated escape sequence");
    }

    /* renamed from: s */
    void mo6463s() throws IOException {
        if (mo6453g()) {
            this.f25978p = mo6455i();
            this.f25975m = 11;
        }
    }
}
