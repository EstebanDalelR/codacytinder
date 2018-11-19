package org.objectweb.asm;

/* renamed from: org.objectweb.asm.t */
public class C19349t {
    /* renamed from: a */
    byte[] f60400a;
    /* renamed from: b */
    int f60401b;

    C19349t(byte[] bArr, int i) {
        this.f60400a = bArr;
        this.f60401b = i;
    }

    /* renamed from: a */
    public int m69480a() {
        return this.f60400a[this.f60401b];
    }

    /* renamed from: a */
    public int m69481a(int i) {
        return this.f60400a[(this.f60401b + (i * 2)) + 1];
    }

    /* renamed from: b */
    public int m69482b(int i) {
        return this.f60400a[(this.f60401b + (i * 2)) + 2];
    }

    public String toString() {
        int a = m69480a();
        StringBuffer stringBuffer = new StringBuffer(a * 2);
        for (int i = 0; i < a; i++) {
            char c;
            switch (m69481a(i)) {
                case 0:
                    c = '[';
                    break;
                case 1:
                    c = '.';
                    break;
                case 2:
                    c = '*';
                    break;
                case 3:
                    stringBuffer.append(m69482b(i));
                    c = ';';
                    break;
                default:
                    c = '_';
                    break;
            }
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }
}
