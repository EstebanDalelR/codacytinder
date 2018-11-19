package com.bumptech.glide.p023a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.a.b */
class C0973b implements Closeable {
    /* renamed from: a */
    private final InputStream f2604a;
    /* renamed from: b */
    private final Charset f2605b;
    /* renamed from: c */
    private byte[] f2606c;
    /* renamed from: d */
    private int f2607d;
    /* renamed from: e */
    private int f2608e;

    public C0973b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C0973b(InputStream inputStream, int i, Charset charset) {
        if (inputStream != null) {
            if (charset != null) {
                if (i < 0) {
                    throw new IllegalArgumentException("capacity <= 0");
                } else if (charset.equals(C0974c.f2609a)) {
                    this.f2604a = inputStream;
                    this.f2605b = charset;
                    this.f2606c = new byte[i];
                    return;
                } else {
                    throw new IllegalArgumentException("Unsupported encoding");
                }
            }
        }
        throw new NullPointerException();
    }

    public void close() throws IOException {
        synchronized (this.f2604a) {
            if (this.f2606c != null) {
                this.f2606c = null;
                this.f2604a.close();
            }
        }
    }

    /* renamed from: a */
    public String m3343a() throws IOException {
        synchronized (this.f2604a) {
            if (this.f2606c == null) {
                throw new IOException("LineReader is closed");
            }
            int i;
            if (this.f2607d >= this.f2608e) {
                m3342c();
            }
            for (int i2 = this.f2607d; i2 != this.f2608e; i2++) {
                if (this.f2606c[i2] == (byte) 10) {
                    int i3;
                    String str;
                    if (i2 != this.f2607d) {
                        i3 = i2 - 1;
                        if (this.f2606c[i3] == (byte) 13) {
                            str = new String(this.f2606c, this.f2607d, i3 - this.f2607d, this.f2605b.name());
                            this.f2607d = i2 + 1;
                            return str;
                        }
                    }
                    i3 = i2;
                    str = new String(this.f2606c, this.f2607d, i3 - this.f2607d, this.f2605b.name());
                    this.f2607d = i2 + 1;
                    return str;
                }
            }
            ByteArrayOutputStream c09721 = new ByteArrayOutputStream(this, (this.f2608e - this.f2607d) + 80) {
                /* renamed from: a */
                final /* synthetic */ C0973b f2603a;

                public String toString() {
                    int i = (this.count <= 0 || this.buf[this.count - 1] != (byte) 13) ? this.count : this.count - 1;
                    try {
                        return new String(this.buf, 0, i, this.f2603a.f2605b.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1:
            while (true) {
                c09721.write(this.f2606c, this.f2607d, this.f2608e - this.f2607d);
                this.f2608e = -1;
                m3342c();
                i = this.f2607d;
                while (i != this.f2608e) {
                    if (this.f2606c[i] == (byte) 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.f2607d) {
                c09721.write(this.f2606c, this.f2607d, i - this.f2607d);
            }
            this.f2607d = i + 1;
            String byteArrayOutputStream = c09721.toString();
            return byteArrayOutputStream;
        }
    }

    /* renamed from: b */
    public boolean m3344b() {
        return this.f2608e == -1;
    }

    /* renamed from: c */
    private void m3342c() throws IOException {
        int read = this.f2604a.read(this.f2606c, 0, this.f2606c.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f2607d = 0;
        this.f2608e = read;
    }
}
