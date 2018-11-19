package androidx.text.emoji.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* renamed from: androidx.text.emoji.flatbuffer.c */
public class C0749c {
    /* renamed from: a */
    public static final ThreadLocal<Charset> f2039a = new C07482();
    /* renamed from: d */
    private static final ThreadLocal<CharsetDecoder> f2040d = new C07471();
    /* renamed from: e */
    private static final ThreadLocal<CharBuffer> f2041e = new ThreadLocal();
    /* renamed from: b */
    protected int f2042b;
    /* renamed from: c */
    protected ByteBuffer f2043c;

    /* renamed from: androidx.text.emoji.flatbuffer.c$1 */
    static class C07471 extends ThreadLocal<CharsetDecoder> {
        C07471() {
        }

        protected /* synthetic */ Object initialValue() {
            return m2655a();
        }

        /* renamed from: a */
        protected CharsetDecoder m2655a() {
            return Charset.forName("UTF-8").newDecoder();
        }
    }

    /* renamed from: androidx.text.emoji.flatbuffer.c$2 */
    static class C07482 extends ThreadLocal<Charset> {
        C07482() {
        }

        protected /* synthetic */ Object initialValue() {
            return m2656a();
        }

        /* renamed from: a */
        protected Charset m2656a() {
            return Charset.forName("UTF-8");
        }
    }

    /* renamed from: b */
    protected int m2657b(int i) {
        int i2 = this.f2042b - this.f2043c.getInt(this.f2042b);
        return i < this.f2043c.getShort(i2) ? this.f2043c.getShort(i2 + i) : 0;
    }

    /* renamed from: c */
    protected int m2658c(int i) {
        return i + this.f2043c.getInt(i);
    }

    /* renamed from: d */
    protected int m2659d(int i) {
        i += this.f2042b;
        return this.f2043c.getInt(i + this.f2043c.getInt(i));
    }

    /* renamed from: e */
    protected int m2660e(int i) {
        i += this.f2042b;
        return (i + this.f2043c.getInt(i)) + 4;
    }
}
