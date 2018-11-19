package androidx.text.emoji.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class FlatBufferBuilder {
    /* renamed from: c */
    static final Charset f2024c = Charset.forName("UTF-8");
    /* renamed from: o */
    static final /* synthetic */ boolean f2025o = true;
    /* renamed from: a */
    ByteBuffer f2026a;
    /* renamed from: b */
    int f2027b;
    /* renamed from: d */
    int f2028d;
    /* renamed from: e */
    int[] f2029e;
    /* renamed from: f */
    int f2030f;
    /* renamed from: g */
    boolean f2031g;
    /* renamed from: h */
    boolean f2032h;
    /* renamed from: i */
    int[] f2033i;
    /* renamed from: j */
    int f2034j;
    /* renamed from: k */
    int f2035k;
    /* renamed from: l */
    boolean f2036l;
    /* renamed from: m */
    CharsetEncoder f2037m;
    /* renamed from: n */
    ByteBufferFactory f2038n;

    public interface ByteBufferFactory {
        ByteBuffer newByteBuffer(int i);
    }

    /* renamed from: androidx.text.emoji.flatbuffer.FlatBufferBuilder$a */
    public static final class C2959a implements ByteBufferFactory {
        public ByteBuffer newByteBuffer(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder(int i, ByteBufferFactory byteBufferFactory) {
        this.f2028d = 1;
        this.f2029e = null;
        this.f2030f = 0;
        this.f2031g = false;
        this.f2032h = false;
        this.f2033i = new int[16];
        this.f2034j = 0;
        this.f2035k = 0;
        this.f2036l = false;
        this.f2037m = f2024c.newEncoder();
        if (i <= 0) {
            i = 1;
        }
        this.f2027b = i;
        this.f2038n = byteBufferFactory;
        this.f2026a = byteBufferFactory.newByteBuffer(i);
    }

    public FlatBufferBuilder(int i) {
        this(i, new C2959a());
    }

    public FlatBufferBuilder() {
        this(1024);
    }
}
