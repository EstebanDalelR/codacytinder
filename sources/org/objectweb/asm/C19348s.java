package org.objectweb.asm;

/* renamed from: org.objectweb.asm.s */
public class C19348s {
    /* renamed from: a */
    public static final C19348s f60387a = new C19348s(0, null, 1443168256, 1);
    /* renamed from: b */
    public static final C19348s f60388b = new C19348s(1, null, 1509950721, 1);
    /* renamed from: c */
    public static final C19348s f60389c = new C19348s(2, null, 1124075009, 1);
    /* renamed from: d */
    public static final C19348s f60390d = new C19348s(3, null, 1107297537, 1);
    /* renamed from: e */
    public static final C19348s f60391e = new C19348s(4, null, 1392510721, 1);
    /* renamed from: f */
    public static final C19348s f60392f = new C19348s(5, null, 1224736769, 1);
    /* renamed from: g */
    public static final C19348s f60393g = new C19348s(6, null, 1174536705, 1);
    /* renamed from: h */
    public static final C19348s f60394h = new C19348s(7, null, 1241579778, 1);
    /* renamed from: i */
    public static final C19348s f60395i = new C19348s(8, null, 1141048066, 1);
    /* renamed from: j */
    private final int f60396j;
    /* renamed from: k */
    private final char[] f60397k;
    /* renamed from: l */
    private final int f60398l;
    /* renamed from: m */
    private final int f60399m;

    static {
        C19348s.m69473g();
    }

    private C19348s(int i, char[] cArr, int i2, int i3) {
        this.f60396j = i;
        this.f60397k = cArr;
        this.f60398l = i2;
        this.f60399m = i3;
    }

    /* renamed from: a */
    public static C19348s m69463a(Class cls) {
        return cls.isPrimitive() ? cls == Integer.TYPE ? f60392f : cls == Void.TYPE ? f60387a : cls == Boolean.TYPE ? f60388b : cls == Byte.TYPE ? f60390d : cls == Character.TYPE ? f60389c : cls == Short.TYPE ? f60391e : cls == Double.TYPE ? f60395i : cls == Float.TYPE ? f60393g : f60394h : C19348s.m69464a(C19348s.m69468b(cls));
    }

    /* renamed from: a */
    public static C19348s m69464a(String str) {
        return C19348s.m69465a(str.toCharArray(), 0);
    }

    /* renamed from: a */
    private static C19348s m69465a(char[] cArr, int i) {
        int i2;
        switch (cArr[i]) {
            case 'B':
                return f60390d;
            case 'C':
                return f60389c;
            case 'D':
                return f60395i;
            case 'F':
                return f60393g;
            case 'I':
                return f60392f;
            case 'J':
                return f60394h;
            case 'L':
                i2 = 1;
                while (cArr[i + i2] != ';') {
                    i2++;
                }
                return new C19348s(10, cArr, i + 1, i2 - 1);
            case 'S':
                return f60391e;
            case 'V':
                return f60387a;
            case 'Z':
                return f60388b;
            case '[':
                i2 = 1;
                while (true) {
                    int i3 = i + i2;
                    if (cArr[i3] == '[') {
                        i2++;
                    } else {
                        if (cArr[i3] == 'L') {
                            while (true) {
                                i2++;
                                if (cArr[i + i2] != ';') {
                                }
                            }
                        }
                        return new C19348s(9, cArr, i, i2 + 1);
                    }
                }
            default:
                return new C19348s(11, cArr, i, cArr.length - i);
        }
    }

    /* renamed from: a */
    private void m69466a(StringBuffer stringBuffer) {
        char c;
        if (this.f60397k == null) {
            c = (char) ((this.f60398l & -16777216) >>> 24);
        } else if (this.f60396j == 10) {
            stringBuffer.append('L');
            stringBuffer.append(this.f60397k, this.f60398l, this.f60399m);
            c = ';';
        } else {
            stringBuffer.append(this.f60397k, this.f60398l, this.f60399m);
            return;
        }
        stringBuffer.append(c);
    }

    /* renamed from: a */
    private static void m69467a(StringBuffer stringBuffer, Class cls) {
        while (!cls.isPrimitive()) {
            if (cls.isArray()) {
                stringBuffer.append('[');
                cls = cls.getComponentType();
            } else {
                stringBuffer.append('L');
                String name = cls.getName();
                int length = name.length();
                for (int i = 0; i < length; i++) {
                    char charAt = name.charAt(i);
                    if (charAt == '.') {
                        charAt = '/';
                    }
                    stringBuffer.append(charAt);
                }
                stringBuffer.append(';');
                return;
            }
        }
        char c = cls == Integer.TYPE ? 'I' : cls == Void.TYPE ? 'V' : cls == Boolean.TYPE ? 'Z' : cls == Byte.TYPE ? 'B' : cls == Character.TYPE ? 'C' : cls == Short.TYPE ? 'S' : cls == Double.TYPE ? 'D' : cls == Float.TYPE ? 'F' : 'J';
        stringBuffer.append(c);
    }

    /* renamed from: b */
    public static String m69468b(Class cls) {
        StringBuffer stringBuffer = new StringBuffer();
        C19348s.m69467a(stringBuffer, cls);
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static C19348s m69469b(String str) {
        char[] toCharArray = str.toCharArray();
        return new C19348s(toCharArray[0] == '[' ? 9 : 10, toCharArray, 0, toCharArray.length);
    }

    /* renamed from: c */
    public static C19348s m69470c(String str) {
        return C19348s.m69465a(str.toCharArray(), 0);
    }

    /* renamed from: d */
    public static C19348s[] m69471d(String str) {
        char[] toCharArray = str.toCharArray();
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            char c = toCharArray[i2];
            if (c == ')') {
                break;
            } else if (c == 'L') {
                while (true) {
                    i2 = i4 + 1;
                    if (toCharArray[i4] == ';') {
                        break;
                    }
                    i4 = i2;
                }
                i3++;
            } else {
                if (c != '[') {
                    i3++;
                }
                i2 = i4;
            }
        }
        C19348s[] c19348sArr = new C19348s[i3];
        i3 = 0;
        while (toCharArray[i] != ')') {
            c19348sArr[i3] = C19348s.m69465a(toCharArray, i);
            i += c19348sArr[i3].f60399m + (c19348sArr[i3].f60396j == 10 ? 2 : 0);
            i3++;
        }
        return c19348sArr;
    }

    /* renamed from: e */
    public static int m69472e(String str) {
        int i;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            i = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt == ')') {
                break;
            } else if (charAt == 'L') {
                while (true) {
                    i3 = i + 1;
                    if (str.charAt(i) == ';') {
                        break;
                    }
                    i = i3;
                }
                i4++;
            } else {
                if (charAt == '[') {
                    while (true) {
                        charAt = str.charAt(i);
                        if (charAt != '[') {
                            break;
                        }
                        i++;
                    }
                    if (charAt == 'D' || charAt == 'J') {
                        i4--;
                    }
                } else {
                    if (charAt != 'D') {
                        if (charAt != 'J') {
                            i4++;
                        }
                    }
                    i4 += 2;
                }
                i3 = i;
            }
        }
        char charAt2 = str.charAt(i);
        i4 <<= 2;
        if (charAt2 == 'V') {
            i2 = 0;
        } else if (charAt2 == 'D' || charAt2 == 'J') {
            i2 = 2;
        }
        return i4 | i2;
    }

    /* renamed from: g */
    static void m69473g() {
    }

    /* renamed from: a */
    public int m69474a() {
        return this.f60396j;
    }

    /* renamed from: b */
    public int m69475b() {
        int i = 1;
        while (this.f60397k[this.f60398l + i] == '[') {
            i++;
        }
        return i;
    }

    /* renamed from: c */
    public C19348s m69476c() {
        return C19348s.m69465a(this.f60397k, this.f60398l + m69475b());
    }

    /* renamed from: d */
    public String m69477d() {
        switch (this.f60396j) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuffer stringBuffer = new StringBuffer(m69476c().m69477d());
                for (int b = m69475b(); b > 0; b--) {
                    stringBuffer.append("[]");
                }
                return stringBuffer.toString();
            case 10:
                return new String(this.f60397k, this.f60398l, this.f60399m).replace('/', '.');
            default:
                return null;
        }
    }

    /* renamed from: e */
    public String m69478e() {
        return new String(this.f60397k, this.f60398l, this.f60399m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19348s)) {
            return false;
        }
        C19348s c19348s = (C19348s) obj;
        if (this.f60396j != c19348s.f60396j) {
            return false;
        }
        if (this.f60396j >= 9) {
            if (this.f60399m != c19348s.f60399m) {
                return false;
            }
            int i = this.f60398l;
            int i2 = c19348s.f60398l;
            int i3 = this.f60399m + i;
            while (i < i3) {
                if (this.f60397k[i] != c19348s.f60397k[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
        }
        return true;
    }

    /* renamed from: f */
    public String m69479f() {
        StringBuffer stringBuffer = new StringBuffer();
        m69466a(stringBuffer);
        return stringBuffer.toString();
    }

    public int hashCode() {
        int i = this.f60396j * 13;
        if (this.f60396j >= 9) {
            int i2 = this.f60398l;
            int i3 = this.f60399m + i2;
            while (i2 < i3) {
                i = (i + this.f60397k[i2]) * 17;
                i2++;
            }
        }
        return i;
    }

    public String toString() {
        return m69479f();
    }
}
