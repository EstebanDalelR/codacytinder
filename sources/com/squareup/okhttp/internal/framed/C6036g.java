package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okio.BufferedSource;
import okio.ByteString;
import okio.C15976k;
import okio.C17704f;
import okio.C17708j;
import okio.C18549c;

/* renamed from: com.squareup.okhttp.internal.framed.g */
class C6036g {
    /* renamed from: a */
    private final C17708j f22123a;
    /* renamed from: b */
    private int f22124b;
    /* renamed from: c */
    private final BufferedSource f22125c = C15976k.a(this.f22123a);

    /* renamed from: com.squareup.okhttp.internal.framed.g$2 */
    class C60352 extends Inflater {
        /* renamed from: a */
        final /* synthetic */ C6036g f22122a;

        C60352(C6036g c6036g) {
            this.f22122a = c6036g;
        }

        public int inflate(byte[] bArr, int i, int i2) throws DataFormatException {
            int inflate = super.inflate(bArr, i, i2);
            if (inflate != 0 || !needsDictionary()) {
                return inflate;
            }
            setDictionary(C7232j.f26087a);
            return super.inflate(bArr, i, i2);
        }
    }

    public C6036g(BufferedSource bufferedSource) {
        this.f22123a = new C17708j(new C17704f(this, bufferedSource) {
            /* renamed from: a */
            final /* synthetic */ C6036g f28548a;

            public long read(C18549c c18549c, long j) throws IOException {
                if (this.f28548a.f22124b == 0) {
                    return -1;
                }
                c18549c = super.read(c18549c, Math.min(j, (long) this.f28548a.f22124b));
                if (c18549c == -1) {
                    return -1;
                }
                this.f28548a.f22124b = (int) (((long) this.f28548a.f22124b) - c18549c);
                return c18549c;
            }
        }, new C60352(this));
    }

    /* renamed from: a */
    public List<C6028c> m26089a(int i) throws IOException {
        this.f22124b += i;
        i = this.f22125c.readInt();
        StringBuilder stringBuilder;
        if (i < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("numberOfPairs < 0: ");
            stringBuilder.append(i);
            throw new IOException(stringBuilder.toString());
        } else if (i > 1024) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("numberOfPairs > 1024: ");
            stringBuilder.append(i);
            throw new IOException(stringBuilder.toString());
        } else {
            List<C6028c> arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                ByteString g = m26087b().g();
                ByteString b = m26087b();
                if (g.h() == 0) {
                    throw new IOException("name.size == 0");
                }
                arrayList.add(new C6028c(g, b));
            }
            m26088c();
            return arrayList;
        }
    }

    /* renamed from: b */
    private ByteString m26087b() throws IOException {
        return this.f22125c.readByteString((long) this.f22125c.readInt());
    }

    /* renamed from: c */
    private void m26088c() throws IOException {
        if (this.f22124b > 0) {
            this.f22123a.a();
            if (this.f22124b != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("compressedLimit > 0: ");
                stringBuilder.append(this.f22124b);
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public void m26090a() throws IOException {
        this.f22125c.close();
    }
}
