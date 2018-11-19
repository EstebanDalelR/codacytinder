package io.fabric.sdk.android.services.common;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.WritableByteChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueFile implements Closeable {
    /* renamed from: b */
    private static final Logger f48356b = Logger.getLogger(QueueFile.class.getName());
    /* renamed from: a */
    int f48357a;
    /* renamed from: c */
    private final RandomAccessFile f48358c;
    /* renamed from: d */
    private int f48359d;
    /* renamed from: e */
    private C15614a f48360e;
    /* renamed from: f */
    private C15614a f48361f;
    /* renamed from: g */
    private final byte[] f48362g = new byte[16];

    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    /* renamed from: io.fabric.sdk.android.services.common.QueueFile$a */
    static class C15614a {
        /* renamed from: a */
        static final C15614a f48350a = new C15614a(0, 0);
        /* renamed from: b */
        final int f48351b;
        /* renamed from: c */
        final int f48352c;

        C15614a(int i, int i2) {
            this.f48351b = i;
            this.f48352c = i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append("[position = ");
            stringBuilder.append(this.f48351b);
            stringBuilder.append(", length = ");
            stringBuilder.append(this.f48352c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: io.fabric.sdk.android.services.common.QueueFile$b */
    private final class C15615b extends InputStream {
        /* renamed from: a */
        final /* synthetic */ QueueFile f48353a;
        /* renamed from: b */
        private int f48354b;
        /* renamed from: c */
        private int f48355c;

        private C15615b(QueueFile queueFile, C15614a c15614a) {
            this.f48353a = queueFile;
            this.f48354b = queueFile.m58658b(c15614a.f48351b + 4);
            this.f48355c = c15614a.f48352c;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            QueueFile.m58660b(bArr, "buffer");
            if ((i | i2) >= 0) {
                if (i2 <= bArr.length - i) {
                    if (this.f48355c <= 0) {
                        return -1;
                    }
                    if (i2 > this.f48355c) {
                        i2 = this.f48355c;
                    }
                    this.f48353a.m58661b(this.f48354b, bArr, i, i2);
                    this.f48354b = this.f48353a.m58658b(this.f48354b + i2);
                    this.f48355c -= i2;
                    return i2;
                }
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        public int read() throws IOException {
            if (this.f48355c == 0) {
                return -1;
            }
            this.f48353a.f48358c.seek((long) this.f48354b);
            int read = this.f48353a.f48358c.read();
            this.f48354b = this.f48353a.m58658b(this.f48354b + 1);
            this.f48355c--;
            return read;
        }
    }

    public QueueFile(File file) throws IOException {
        if (!file.exists()) {
            m58656a(file);
        }
        this.f48358c = m58659b(file);
        m58665e();
    }

    /* renamed from: b */
    private static void m58662b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: a */
    private static void m58657a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int b : iArr) {
            m58662b(bArr, i, b);
            i += 4;
        }
    }

    /* renamed from: a */
    private static int m58649a(byte[] bArr, int i) {
        return ((((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16)) + ((bArr[i + 2] & 255) << 8)) + (bArr[i + 3] & 255);
    }

    /* renamed from: e */
    private void m58665e() throws IOException {
        this.f48358c.seek(0);
        this.f48358c.readFully(this.f48362g);
        this.f48357a = m58649a(this.f48362g, 0);
        if (((long) this.f48357a) > this.f48358c.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("File is truncated. Expected length: ");
            stringBuilder.append(this.f48357a);
            stringBuilder.append(", Actual length: ");
            stringBuilder.append(this.f48358c.length());
            throw new IOException(stringBuilder.toString());
        }
        this.f48359d = m58649a(this.f48362g, 4);
        int a = m58649a(this.f48362g, 8);
        int a2 = m58649a(this.f48362g, 12);
        this.f48360e = m58650a(a);
        this.f48361f = m58650a(a2);
    }

    /* renamed from: a */
    private void m58653a(int i, int i2, int i3, int i4) throws IOException {
        m58657a(this.f48362g, i, i2, i3, i4);
        this.f48358c.seek(0);
        this.f48358c.write(this.f48362g);
    }

    /* renamed from: a */
    private C15614a m58650a(int i) throws IOException {
        if (i == 0) {
            return C15614a.f48350a;
        }
        this.f48358c.seek((long) i);
        return new C15614a(i, this.f48358c.readInt());
    }

    /* renamed from: a */
    private static void m58656a(File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getPath());
        stringBuilder.append(".tmp");
        File file2 = new File(stringBuilder.toString());
        RandomAccessFile b = m58659b(file2);
        try {
            b.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            b.seek(0);
            byte[] bArr = new byte[16];
            m58657a(bArr, 4096, 0, 0, 0);
            b.write(bArr);
            if (file2.renameTo(file) == null) {
                throw new IOException("Rename failed!");
            }
        } finally {
            b.close();
        }
    }

    /* renamed from: b */
    private static RandomAccessFile m58659b(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: b */
    private int m58658b(int i) {
        return i < this.f48357a ? i : (i + 16) - this.f48357a;
    }

    /* renamed from: a */
    private void m58654a(int i, byte[] bArr, int i2, int i3) throws IOException {
        i = m58658b(i);
        if (i + i3 <= this.f48357a) {
            this.f48358c.seek((long) i);
            this.f48358c.write(bArr, i2, i3);
            return;
        }
        int i4 = this.f48357a - i;
        this.f48358c.seek((long) i);
        this.f48358c.write(bArr, i2, i4);
        this.f48358c.seek(16);
        this.f48358c.write(bArr, i2 + i4, i3 - i4);
    }

    /* renamed from: b */
    private void m58661b(int i, byte[] bArr, int i2, int i3) throws IOException {
        i = m58658b(i);
        if (i + i3 <= this.f48357a) {
            this.f48358c.seek((long) i);
            this.f48358c.readFully(bArr, i2, i3);
            return;
        }
        int i4 = this.f48357a - i;
        this.f48358c.seek((long) i);
        this.f48358c.readFully(bArr, i2, i4);
        this.f48358c.seek(16);
        this.f48358c.readFully(bArr, i2 + i4, i3 - i4);
    }

    /* renamed from: a */
    public void m58669a(byte[] bArr) throws IOException {
        m58670a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public synchronized void m58670a(byte[] bArr, int i, int i2) throws IOException {
        m58660b(bArr, "buffer");
        if ((i | i2) >= 0) {
            if (i2 <= bArr.length - i) {
                int i3;
                m58663c(i2);
                boolean b = m58672b();
                if (b) {
                    i3 = 16;
                } else {
                    i3 = m58658b((this.f48361f.f48351b + 4) + this.f48361f.f48352c);
                }
                C15614a c15614a = new C15614a(i3, i2);
                m58662b(this.f48362g, 0, i2);
                m58654a(c15614a.f48351b, this.f48362g, 0, 4);
                m58654a(c15614a.f48351b + 4, bArr, i, i2);
                m58653a(this.f48357a, this.f48359d + 1, b ? c15614a.f48351b : this.f48360e.f48351b, c15614a.f48351b);
                this.f48361f = c15614a;
                this.f48359d++;
                if (b) {
                    this.f48360e = this.f48361f;
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public int m58667a() {
        if (this.f48359d == 0) {
            return 16;
        }
        if (this.f48361f.f48351b >= this.f48360e.f48351b) {
            return (((this.f48361f.f48351b - this.f48360e.f48351b) + 4) + this.f48361f.f48352c) + 16;
        }
        return (((this.f48361f.f48351b + 4) + this.f48361f.f48352c) + this.f48357a) - this.f48360e.f48351b;
    }

    /* renamed from: f */
    private int m58666f() {
        return this.f48357a - m58667a();
    }

    /* renamed from: b */
    public synchronized boolean m58672b() {
        return this.f48359d == 0;
    }

    /* renamed from: c */
    private void m58663c(int i) throws IOException {
        i += 4;
        int f = m58666f();
        if (f < i) {
            int i2 = this.f48357a;
            do {
                f += i2;
                i2 <<= 1;
            } while (f < i);
            m58664d(i2);
            i = m58658b((this.f48361f.f48351b + 4) + this.f48361f.f48352c);
            if (i < this.f48360e.f48351b) {
                WritableByteChannel channel = this.f48358c.getChannel();
                channel.position((long) this.f48357a);
                long j = (long) (i - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f48361f.f48351b < this.f48360e.f48351b) {
                i = (this.f48357a + this.f48361f.f48351b) - 16;
                m58653a(i2, this.f48359d, this.f48360e.f48351b, i);
                this.f48361f = new C15614a(i, this.f48361f.f48352c);
            } else {
                m58653a(i2, this.f48359d, this.f48360e.f48351b, this.f48361f.f48351b);
            }
            this.f48357a = i2;
        }
    }

    /* renamed from: d */
    private void m58664d(int i) throws IOException {
        this.f48358c.setLength((long) i);
        this.f48358c.getChannel().force(true);
    }

    /* renamed from: a */
    public synchronized void m58668a(ElementReader elementReader) throws IOException {
        int i = this.f48360e.f48351b;
        for (int i2 = 0; i2 < this.f48359d; i2++) {
            C15614a a = m58650a(i);
            elementReader.read(new C15615b(a), a.f48352c);
            i = m58658b((a.f48351b + 4) + a.f48352c);
        }
    }

    /* renamed from: b */
    private static <T> T m58660b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public synchronized void m58673c() throws IOException {
        if (m58672b()) {
            throw new NoSuchElementException();
        } else if (this.f48359d == 1) {
            m58674d();
        } else {
            int b = m58658b((this.f48360e.f48351b + 4) + this.f48360e.f48352c);
            m58661b(b, this.f48362g, 0, 4);
            int a = m58649a(this.f48362g, 0);
            m58653a(this.f48357a, this.f48359d - 1, b, this.f48361f.f48351b);
            this.f48359d--;
            this.f48360e = new C15614a(b, a);
        }
    }

    /* renamed from: d */
    public synchronized void m58674d() throws IOException {
        m58653a(4096, 0, 0, 0);
        this.f48359d = 0;
        this.f48360e = C15614a.f48350a;
        this.f48361f = C15614a.f48350a;
        if (this.f48357a > 4096) {
            m58664d(4096);
        }
        this.f48357a = 4096;
    }

    public synchronized void close() throws IOException {
        this.f48358c.close();
    }

    /* renamed from: a */
    public boolean m58671a(int i, int i2) {
        return (m58667a() + 4) + i <= i2;
    }

    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append("fileLength=");
        stringBuilder.append(this.f48357a);
        stringBuilder.append(", size=");
        stringBuilder.append(this.f48359d);
        stringBuilder.append(", first=");
        stringBuilder.append(this.f48360e);
        stringBuilder.append(", last=");
        stringBuilder.append(this.f48361f);
        stringBuilder.append(", element lengths=[");
        try {
            m58668a(new ElementReader(this) {
                /* renamed from: a */
                boolean f53040a = true;
                /* renamed from: c */
                final /* synthetic */ QueueFile f53042c;

                public void read(InputStream inputStream, int i) throws IOException {
                    if (this.f53040a != null) {
                        this.f53040a = null;
                    } else {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(i);
                }
            });
        } catch (Throwable e) {
            f48356b.log(Level.WARNING, "read error", e);
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
