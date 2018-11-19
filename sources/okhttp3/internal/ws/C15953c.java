package okhttp3.internal.ws;

import android.support.v4.media.session.PlaybackStateCompat;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.util.Random;
import okio.BufferedSink;
import okio.ByteString;
import okio.C15982q;
import okio.C18549c;
import okio.C18549c.C15975a;
import okio.Sink;

/* renamed from: okhttp3.internal.ws.c */
final class C15953c {
    /* renamed from: a */
    final boolean f49490a;
    /* renamed from: b */
    final Random f49491b;
    /* renamed from: c */
    final BufferedSink f49492c;
    /* renamed from: d */
    final C18549c f49493d;
    /* renamed from: e */
    boolean f49494e;
    /* renamed from: f */
    final C18549c f49495f = new C18549c();
    /* renamed from: g */
    final C17687a f49496g = new C17687a(this);
    /* renamed from: h */
    boolean f49497h;
    /* renamed from: i */
    private final byte[] f49498i;
    /* renamed from: j */
    private final C15975a f49499j;

    /* renamed from: okhttp3.internal.ws.c$a */
    final class C17687a implements Sink {
        /* renamed from: a */
        int f55016a;
        /* renamed from: b */
        long f55017b;
        /* renamed from: c */
        boolean f55018c;
        /* renamed from: d */
        boolean f55019d;
        /* renamed from: e */
        final /* synthetic */ C15953c f55020e;

        C17687a(C15953c c15953c) {
            this.f55020e = c15953c;
        }

        public void write(C18549c c18549c, long j) throws IOException {
            if (this.f55019d) {
                throw new IOException("closed");
            }
            this.f55020e.f49495f.write(c18549c, j);
            c18549c = (this.f55018c == null || this.f55017b == -1 || this.f55020e.f49495f.m66945a() <= this.f55017b - PlaybackStateCompat.ACTION_PLAY_FROM_URI) ? null : true;
            long c = this.f55020e.f49495f.m66959c();
            if (c > 0 && c18549c == null) {
                this.f55020e.m60450a(this.f55016a, c, this.f55018c, false);
                this.f55018c = 0;
            }
        }

        public void flush() throws IOException {
            if (this.f55019d) {
                throw new IOException("closed");
            }
            this.f55020e.m60450a(this.f55016a, this.f55020e.f49495f.m66945a(), this.f55018c, false);
            this.f55018c = false;
        }

        public C15982q timeout() {
            return this.f55020e.f49492c.timeout();
        }

        public void close() throws IOException {
            if (this.f55019d) {
                throw new IOException("closed");
            }
            this.f55020e.m60450a(this.f55016a, this.f55020e.f49495f.m66945a(), this.f55018c, true);
            this.f55019d = true;
            this.f55020e.f49497h = false;
        }
    }

    C15953c(boolean z, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        } else if (random == null) {
            throw new NullPointerException("random == null");
        } else {
            this.f49490a = z;
            this.f49492c = bufferedSink;
            this.f49493d = bufferedSink.buffer();
            this.f49491b = random;
            bufferedSink = null;
            this.f49498i = z ? new byte[4] : null;
            if (z) {
                bufferedSink = new C15975a();
            }
            this.f49499j = bufferedSink;
        }
    }

    /* renamed from: a */
    void m60452a(ByteString byteString) throws IOException {
        m60448b(9, byteString);
    }

    /* renamed from: b */
    void m60453b(ByteString byteString) throws IOException {
        m60448b(10, byteString);
    }

    /* renamed from: a */
    void m60451a(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.f49592b;
        if (!(i == 0 && byteString == null)) {
            if (i != 0) {
                C15952b.m60447b(i);
            }
            C18549c c18549c = new C18549c();
            c18549c.m66960c(i);
            if (byteString != null) {
                c18549c.m66952a(byteString);
            }
            byteString2 = c18549c.readByteString();
        }
        try {
            m60448b(8, byteString2);
        } finally {
            this.f49494e = true;
        }
    }

    /* renamed from: b */
    private void m60448b(int i, ByteString byteString) throws IOException {
        if (this.f49494e) {
            throw new IOException("closed");
        }
        int h = byteString.mo13431h();
        if (((long) h) > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f49493d.m66958b(i | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        if (this.f49490a != 0) {
            this.f49493d.m66958b(h | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            this.f49491b.nextBytes(this.f49498i);
            this.f49493d.m66954a(this.f49498i);
            if (h > 0) {
                long a = this.f49493d.m66945a();
                this.f49493d.m66952a(byteString);
                this.f49493d.m66946a(this.f49499j);
                this.f49499j.m60607a(a);
                C15952b.m60446a(this.f49499j, this.f49498i);
                this.f49499j.close();
            }
        } else {
            this.f49493d.m66958b(h);
            this.f49493d.m66952a(byteString);
        }
        this.f49492c.flush();
    }

    /* renamed from: a */
    Sink m60449a(int i, long j) {
        if (this.f49497h) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.f49497h = true;
        this.f49496g.f55016a = i;
        this.f49496g.f55017b = j;
        this.f49496g.f55018c = true;
        this.f49496g.f55019d = 0;
        return this.f49496g;
    }

    /* renamed from: a */
    void m60450a(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f49494e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
        }
        this.f49493d.m66958b(i);
        if (this.f49490a != 0) {
            i2 = ProfileEditingConfig.DEFAULT_MAX_LENGTH;
        }
        if (j <= true) {
            this.f49493d.m66958b(((int) j) | i2);
        } else if (j <= true) {
            this.f49493d.m66958b(i2 | 126);
            this.f49493d.m66960c((int) j);
        } else {
            this.f49493d.m66958b(i2 | 127);
            this.f49493d.m66961c(j);
        }
        if (this.f49490a != 0) {
            this.f49491b.nextBytes(this.f49498i);
            this.f49493d.m66954a(this.f49498i);
            if (j > false) {
                z = this.f49493d.m66945a();
                this.f49493d.write(this.f49495f, j);
                this.f49493d.m66946a(this.f49499j);
                this.f49499j.m60607a(z);
                C15952b.m60446a(this.f49499j, this.f49498i);
                this.f49499j.close();
            }
        } else {
            this.f49493d.write(this.f49495f, j);
        }
        this.f49492c.emit();
    }
}
