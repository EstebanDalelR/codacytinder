package android.support.text.emoji;

import android.content.res.AssetManager;
import android.support.annotation.AnyThread;
import android.support.annotation.IntRange;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import androidx.text.emoji.flatbuffer.C2961b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@AnyThread
@RequiresApi(19)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.text.emoji.c */
class C0296c {

    /* renamed from: android.support.text.emoji.c$b */
    private static class C0294b {
        /* renamed from: a */
        private final long f1045a;
        /* renamed from: b */
        private final long f1046b;

        C0294b(long j, long j2) {
            this.f1045a = j;
            this.f1046b = j2;
        }

        /* renamed from: a */
        long m1111a() {
            return this.f1045a;
        }

        /* renamed from: b */
        long m1112b() {
            return this.f1046b;
        }
    }

    /* renamed from: android.support.text.emoji.c$c */
    private interface C0295c {
        /* renamed from: a */
        int mo295a() throws IOException;

        /* renamed from: a */
        void mo296a(int i) throws IOException;

        /* renamed from: b */
        long mo297b() throws IOException;

        /* renamed from: c */
        int mo298c() throws IOException;

        /* renamed from: d */
        long mo299d();
    }

    /* renamed from: android.support.text.emoji.c$a */
    private static class C2789a implements C0295c {
        /* renamed from: a */
        private final byte[] f8835a;
        /* renamed from: b */
        private final ByteBuffer f8836b;
        /* renamed from: c */
        private final InputStream f8837c;
        /* renamed from: d */
        private long f8838d = 0;

        C2789a(InputStream inputStream) {
            this.f8837c = inputStream;
            this.f8835a = new byte[4];
            this.f8836b = ByteBuffer.wrap(this.f8835a);
            this.f8836b.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo295a() throws IOException {
            this.f8836b.position(0);
            m10853b(2);
            return C0296c.m1123b(this.f8836b.getShort());
        }

        /* renamed from: b */
        public long mo297b() throws IOException {
            this.f8836b.position(0);
            m10853b(4);
            return C0296c.m1124b(this.f8836b.getInt());
        }

        /* renamed from: c */
        public int mo298c() throws IOException {
            this.f8836b.position(0);
            m10853b(4);
            return this.f8836b.getInt();
        }

        /* renamed from: a */
        public void mo296a(int i) throws IOException {
            while (i > 0) {
                int skip = (int) this.f8837c.skip((long) i);
                if (skip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i -= skip;
                this.f8838d += (long) skip;
            }
        }

        /* renamed from: d */
        public long mo299d() {
            return this.f8838d;
        }

        /* renamed from: b */
        private void m10853b(@IntRange(from = 0, to = 4) int i) throws IOException {
            if (this.f8837c.read(this.f8835a, 0, i) != i) {
                throw new IOException("read failed");
            }
            this.f8838d += (long) i;
        }
    }

    /* renamed from: b */
    private static int m1123b(short s) {
        return s & 65535;
    }

    /* renamed from: b */
    private static long m1124b(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: a */
    static C2961b m1122a(InputStream inputStream) throws IOException {
        C0295c c2789a = new C2789a(inputStream);
        C0294b a = C0296c.m1120a(c2789a);
        c2789a.mo296a((int) (a.m1111a() - c2789a.mo299d()));
        ByteBuffer allocate = ByteBuffer.allocate((int) a.m1112b());
        inputStream = inputStream.read(allocate.array());
        if (((long) inputStream) == a.m1112b()) {
            return C2961b.m11466a(allocate);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Needed ");
        stringBuilder.append(a.m1112b());
        stringBuilder.append(" bytes, got ");
        stringBuilder.append(inputStream);
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: a */
    static C2961b m1121a(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        try {
            str = C0296c.m1122a(open);
            if (open != null) {
                open.close();
            }
            return str;
        } catch (Throwable th) {
            str = th;
        }
        if (open != null) {
            if (r0 != null) {
                try {
                    open.close();
                } catch (AssetManager assetManager2) {
                    r0.addSuppressed(assetManager2);
                }
            } else {
                open.close();
            }
        }
        throw str;
        throw str;
    }

    /* renamed from: a */
    private static C0294b m1120a(C0295c c0295c) throws IOException {
        c0295c.mo296a(4);
        int a = c0295c.mo295a();
        if (a > 100) {
            throw new IOException("Cannot read metadata.");
        }
        int i;
        long b;
        c0295c.mo296a(6);
        int i2 = 0;
        for (i = 0; i < a; i++) {
            int c = c0295c.mo298c();
            c0295c.mo296a(4);
            b = c0295c.mo297b();
            c0295c.mo296a(4);
            if (1835365473 == c) {
                break;
            }
        }
        b = -1;
        if (b != -1) {
            c0295c.mo296a((int) (b - c0295c.mo299d()));
            c0295c.mo296a(12);
            long b2 = c0295c.mo297b();
            while (((long) i2) < b2) {
                i = c0295c.mo298c();
                long b3 = c0295c.mo297b();
                long b4 = c0295c.mo297b();
                if (1164798569 != i) {
                    if (1701669481 != i) {
                        i2++;
                    }
                }
                return new C0294b(b3 + b, b4);
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
