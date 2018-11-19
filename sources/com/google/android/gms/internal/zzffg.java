package com.google.android.gms.internal;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzffg extends abe {
    /* renamed from: b */
    private static final Logger f23543b = Logger.getLogger(zzffg.class.getName());
    /* renamed from: c */
    private static final boolean f23544c = adp.m18943a();
    /* renamed from: a */
    abo f23545a = this;

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            str = String.valueOf(str);
            super(str.length() != 0 ? valueOf.concat(str) : new String(valueOf), th);
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzffg$a */
    static abstract class C7361a extends zzffg {
        /* renamed from: b */
        final byte[] f27069b;
        /* renamed from: c */
        final int f27070c;
        /* renamed from: d */
        int f27071d;
        /* renamed from: e */
        int f27072e;

        C7361a(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            this.f27069b = new byte[Math.max(i, 20)];
            this.f27070c = this.f27069b.length;
        }

        /* renamed from: b */
        public final int mo6938b() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* renamed from: b */
        final void m31682b(byte b) {
            byte[] bArr = this.f27069b;
            int i = this.f27071d;
            this.f27071d = i + 1;
            bArr[i] = b;
            this.f27072e++;
        }

        /* renamed from: h */
        final void m31683h(int i, int i2) {
            mo6940m((i << 3) | i2);
        }

        /* renamed from: h */
        final void mo6939h(long j) {
            byte[] bArr;
            if (zzffg.f23544c) {
                long j2 = (long) this.f27071d;
                while ((j & -128) != 0) {
                    bArr = this.f27069b;
                    int i = this.f27071d;
                    this.f27071d = i + 1;
                    adp.m18942a(bArr, (long) i, (byte) ((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                    j >>>= 7;
                }
                bArr = this.f27069b;
                int i2 = this.f27071d;
                this.f27071d = i2 + 1;
                adp.m18942a(bArr, (long) i2, (byte) ((int) j));
                this.f27072e += (int) (((long) this.f27071d) - j2);
                return;
            }
            while ((j & -128) != 0) {
                bArr = this.f27069b;
                int i3 = this.f27071d;
                this.f27071d = i3 + 1;
                bArr[i3] = (byte) ((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                this.f27072e++;
                j >>>= 7;
            }
            bArr = this.f27069b;
            i2 = this.f27071d;
            this.f27071d = i2 + 1;
            bArr[i2] = (byte) ((int) j);
            this.f27072e++;
        }

        /* renamed from: i */
        final void m31685i(long j) {
            byte[] bArr = this.f27069b;
            int i = this.f27071d;
            this.f27071d = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            bArr = this.f27069b;
            i = this.f27071d;
            this.f27071d = i + 1;
            bArr[i] = (byte) ((int) ((j >> 8) & 255));
            bArr = this.f27069b;
            i = this.f27071d;
            this.f27071d = i + 1;
            bArr[i] = (byte) ((int) ((j >> 16) & 255));
            bArr = this.f27069b;
            i = this.f27071d;
            this.f27071d = i + 1;
            bArr[i] = (byte) ((int) ((j >> 24) & 255));
            bArr = this.f27069b;
            i = this.f27071d;
            this.f27071d = i + 1;
            bArr[i] = (byte) ((int) (j >> 32));
            bArr = this.f27069b;
            i = this.f27071d;
            this.f27071d = i + 1;
            bArr[i] = (byte) ((int) (j >> 40));
            bArr = this.f27069b;
            i = this.f27071d;
            this.f27071d = i + 1;
            bArr[i] = (byte) ((int) (j >> 48));
            bArr = this.f27069b;
            i = this.f27071d;
            this.f27071d = i + 1;
            bArr[i] = (byte) ((int) (j >> 56));
            this.f27072e += 8;
        }

        /* renamed from: m */
        final void mo6940m(int i) {
            if (zzffg.f23544c) {
                byte[] bArr;
                int i2;
                long j = (long) this.f27071d;
                while ((i & -128) != 0) {
                    bArr = this.f27069b;
                    i2 = this.f27071d;
                    this.f27071d = i2 + 1;
                    adp.m18942a(bArr, (long) i2, (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                    i >>>= 7;
                }
                bArr = this.f27069b;
                i2 = this.f27071d;
                this.f27071d = i2 + 1;
                adp.m18942a(bArr, (long) i2, (byte) i);
                this.f27072e += (int) (((long) this.f27071d) - j);
                return;
            }
            byte[] bArr2;
            int i3;
            while ((i & -128) != 0) {
                bArr2 = this.f27069b;
                i3 = this.f27071d;
                this.f27071d = i3 + 1;
                bArr2[i3] = (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                this.f27072e++;
                i >>>= 7;
            }
            bArr2 = this.f27069b;
            i3 = this.f27071d;
            this.f27071d = i3 + 1;
            bArr2[i3] = (byte) i;
            this.f27072e++;
        }

        /* renamed from: n */
        final void m31687n(int i) {
            byte[] bArr = this.f27069b;
            int i2 = this.f27071d;
            this.f27071d = i2 + 1;
            bArr[i2] = (byte) i;
            bArr = this.f27069b;
            i2 = this.f27071d;
            this.f27071d = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            bArr = this.f27069b;
            i2 = this.f27071d;
            this.f27071d = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            bArr = this.f27069b;
            i2 = this.f27071d;
            this.f27071d = i2 + 1;
            bArr[i2] = i >> 24;
            this.f27072e += 4;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzffg$b */
    static class C7362b extends zzffg {
        /* renamed from: b */
        private final byte[] f27073b;
        /* renamed from: c */
        private final int f27074c;
        /* renamed from: d */
        private final int f27075d;
        /* renamed from: e */
        private int f27076e;

        C7362b(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if (((i | i2) | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            this.f27073b = bArr;
            this.f27074c = i;
            this.f27076e = i;
            this.f27075d = i3;
        }

        /* renamed from: a */
        public void mo6941a() {
        }

        /* renamed from: a */
        public final void mo6942a(byte b) throws IOException {
            try {
                byte[] bArr = this.f27073b;
                int i = this.f27076e;
                this.f27076e = i + 1;
                bArr[i] = b;
            } catch (Throwable e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27076e), Integer.valueOf(this.f27075d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo6943a(int i, int i2) throws IOException {
            mo6960c((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo6944a(int i, long j) throws IOException {
            mo6943a(i, 0);
            mo6949a(j);
        }

        /* renamed from: a */
        public final void mo6945a(int i, zzfes zzfes) throws IOException {
            mo6943a(i, 2);
            mo6950a(zzfes);
        }

        /* renamed from: a */
        public final void mo6946a(int i, zzfhe zzfhe) throws IOException {
            mo6943a(i, 2);
            mo6951a(zzfhe);
        }

        /* renamed from: a */
        public final void mo6947a(int i, String str) throws IOException {
            mo6943a(i, 2);
            mo6952a(str);
        }

        /* renamed from: a */
        public final void mo6948a(int i, boolean z) throws IOException {
            mo6943a(i, 0);
            mo6942a((byte) z);
        }

        /* renamed from: a */
        public final void mo6949a(long j) throws IOException {
            byte[] bArr;
            if (!zzffg.f23544c || mo6938b() < 10) {
                while ((j & -128) != 0) {
                    bArr = this.f27073b;
                    int i = this.f27076e;
                    this.f27076e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    j >>>= 7;
                }
                try {
                    bArr = this.f27073b;
                    int i2 = this.f27076e;
                    this.f27076e = i2 + 1;
                    bArr[i2] = (byte) ((int) j);
                    return;
                } catch (Throwable e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27076e), Integer.valueOf(this.f27075d), Integer.valueOf(1)}), e);
                }
            }
            while ((j & -128) != 0) {
                bArr = this.f27073b;
                i = this.f27076e;
                this.f27076e = i + 1;
                adp.m18942a(bArr, (long) i, (byte) ((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                j >>>= 7;
            }
            bArr = this.f27073b;
            i2 = this.f27076e;
            this.f27076e = i2 + 1;
            adp.m18942a(bArr, (long) i2, (byte) ((int) j));
        }

        /* renamed from: a */
        public final void mo6950a(zzfes zzfes) throws IOException {
            mo6960c(zzfes.mo6930a());
            zzfes.mo6933a((abe) this);
        }

        /* renamed from: a */
        public final void mo6951a(zzfhe zzfhe) throws IOException {
            mo6960c(zzfhe.zzho());
            zzfhe.zza(this);
        }

        /* renamed from: a */
        public final void mo6952a(String str) throws IOException {
            int i = this.f27076e;
            try {
                int g = zzffg.m27551g(str.length() * 3);
                int g2 = zzffg.m27551g(str.length());
                if (g2 == g) {
                    this.f27076e = i + g2;
                    g = adr.m18963a(str, this.f27073b, this.f27076e, mo6938b());
                    this.f27076e = i;
                    mo6960c((g - i) - g2);
                    this.f27076e = g;
                    return;
                }
                mo6960c(adr.m18962a((CharSequence) str));
                this.f27076e = adr.m18963a(str, this.f27073b, this.f27076e, mo6938b());
            } catch (zzfiv e) {
                this.f27076e = i;
                m27573a(str, e);
            } catch (Throwable e2) {
                throw new zzc(e2);
            }
        }

        /* renamed from: a */
        public final void mo6953a(byte[] bArr, int i, int i2) throws IOException {
            mo6962c(bArr, i, i2);
        }

        /* renamed from: b */
        public final int mo6938b() {
            return this.f27075d - this.f27076e;
        }

        /* renamed from: b */
        public final void mo6954b(int i) throws IOException {
            if (i >= 0) {
                mo6960c(i);
            } else {
                mo6949a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo6955b(int i, int i2) throws IOException {
            mo6943a(i, 0);
            mo6954b(i2);
        }

        /* renamed from: b */
        public final void mo6956b(int i, long j) throws IOException {
            mo6943a(i, 1);
            mo6959b(j);
        }

        /* renamed from: b */
        public final void mo6957b(int i, zzfes zzfes) throws IOException {
            mo6943a(1, 3);
            mo6961c(2, i);
            mo6945a(3, zzfes);
            mo6943a(1, 4);
        }

        /* renamed from: b */
        public final void mo6958b(int i, zzfhe zzfhe) throws IOException {
            mo6943a(1, 3);
            mo6961c(2, i);
            mo6946a(3, zzfhe);
            mo6943a(1, 4);
        }

        /* renamed from: b */
        public final void mo6959b(long j) throws IOException {
            try {
                byte[] bArr = this.f27073b;
                int i = this.f27076e;
                this.f27076e = i + 1;
                bArr[i] = (byte) ((int) j);
                bArr = this.f27073b;
                i = this.f27076e;
                this.f27076e = i + 1;
                bArr[i] = (byte) ((int) (j >> 8));
                bArr = this.f27073b;
                i = this.f27076e;
                this.f27076e = i + 1;
                bArr[i] = (byte) ((int) (j >> 16));
                bArr = this.f27073b;
                i = this.f27076e;
                this.f27076e = i + 1;
                bArr[i] = (byte) ((int) (j >> 24));
                bArr = this.f27073b;
                i = this.f27076e;
                this.f27076e = i + 1;
                bArr[i] = (byte) ((int) (j >> 32));
                bArr = this.f27073b;
                i = this.f27076e;
                this.f27076e = i + 1;
                bArr[i] = (byte) ((int) (j >> 40));
                bArr = this.f27073b;
                i = this.f27076e;
                this.f27076e = i + 1;
                bArr[i] = (byte) ((int) (j >> 48));
                bArr = this.f27073b;
                i = this.f27076e;
                this.f27076e = i + 1;
                bArr[i] = (byte) ((int) (j >> 56));
            } catch (Throwable e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27076e), Integer.valueOf(this.f27075d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: c */
        public final void mo6960c(int i) throws IOException {
            byte[] bArr;
            int i2;
            if (!zzffg.f23544c || mo6938b() < 10) {
                while ((i & -128) != 0) {
                    bArr = this.f27073b;
                    i2 = this.f27076e;
                    this.f27076e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    i >>>= 7;
                }
                try {
                    bArr = this.f27073b;
                    i2 = this.f27076e;
                    this.f27076e = i2 + 1;
                    bArr[i2] = (byte) i;
                    return;
                } catch (Throwable e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27076e), Integer.valueOf(this.f27075d), Integer.valueOf(1)}), e);
                }
            }
            while ((i & -128) != 0) {
                bArr = this.f27073b;
                i2 = this.f27076e;
                this.f27076e = i2 + 1;
                adp.m18942a(bArr, (long) i2, (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                i >>>= 7;
            }
            bArr = this.f27073b;
            i2 = this.f27076e;
            this.f27076e = i2 + 1;
            adp.m18942a(bArr, (long) i2, (byte) i);
        }

        /* renamed from: c */
        public final void mo6961c(int i, int i2) throws IOException {
            mo6943a(i, 0);
            mo6960c(i2);
        }

        /* renamed from: c */
        public final void mo6962c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f27073b, this.f27076e, i2);
                this.f27076e += i2;
            } catch (Throwable e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27076e), Integer.valueOf(this.f27075d), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: d */
        public final void mo6963d(int i) throws IOException {
            try {
                byte[] bArr = this.f27073b;
                int i2 = this.f27076e;
                this.f27076e = i2 + 1;
                bArr[i2] = (byte) i;
                bArr = this.f27073b;
                i2 = this.f27076e;
                this.f27076e = i2 + 1;
                bArr[i2] = (byte) (i >> 8);
                bArr = this.f27073b;
                i2 = this.f27076e;
                this.f27076e = i2 + 1;
                bArr[i2] = (byte) (i >> 16);
                bArr = this.f27073b;
                i2 = this.f27076e;
                this.f27076e = i2 + 1;
                bArr[i2] = i >> 24;
            } catch (Throwable e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27076e), Integer.valueOf(this.f27075d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: d */
        public final void mo6964d(int i, int i2) throws IOException {
            mo6943a(i, 5);
            mo6963d(i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzffg$c */
    static final class C8035c extends C7361a {
        /* renamed from: f */
        private final OutputStream f28824f;

        C8035c(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f28824f = outputStream;
        }

        /* renamed from: e */
        private final void m34069e() throws IOException {
            this.f28824f.write(this.b, 0, this.d);
            this.d = 0;
        }

        /* renamed from: o */
        private final void m34070o(int i) throws IOException {
            if (this.c - this.d < i) {
                m34069e();
            }
        }

        /* renamed from: a */
        public final void mo6941a() throws IOException {
            if (this.d > 0) {
                m34069e();
            }
        }

        /* renamed from: a */
        public final void mo6942a(byte b) throws IOException {
            if (this.d == this.c) {
                m34069e();
            }
            m31682b(b);
        }

        /* renamed from: a */
        public final void mo6943a(int i, int i2) throws IOException {
            mo6960c((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo6944a(int i, long j) throws IOException {
            m34070o(20);
            m31683h(i, 0);
            mo6939h(j);
        }

        /* renamed from: a */
        public final void mo6945a(int i, zzfes zzfes) throws IOException {
            mo6943a(i, 2);
            mo6950a(zzfes);
        }

        /* renamed from: a */
        public final void mo6946a(int i, zzfhe zzfhe) throws IOException {
            mo6943a(i, 2);
            mo6951a(zzfhe);
        }

        /* renamed from: a */
        public final void mo6947a(int i, String str) throws IOException {
            mo6943a(i, 2);
            mo6952a(str);
        }

        /* renamed from: a */
        public final void mo6948a(int i, boolean z) throws IOException {
            m34070o(11);
            m31683h(i, 0);
            m31682b((byte) z);
        }

        /* renamed from: a */
        public final void mo6949a(long j) throws IOException {
            m34070o(10);
            mo6939h(j);
        }

        /* renamed from: a */
        public final void mo6950a(zzfes zzfes) throws IOException {
            mo6960c(zzfes.mo6930a());
            zzfes.mo6933a((abe) this);
        }

        /* renamed from: a */
        public final void mo6951a(zzfhe zzfhe) throws IOException {
            mo6960c(zzfhe.zzho());
            zzfhe.zza(this);
        }

        /* renamed from: a */
        public final void mo6952a(String str) throws IOException {
            int i;
            try {
                int length = str.length() * 3;
                int g = zzffg.m27551g(length);
                i = g + length;
                if (i > this.c) {
                    byte[] bArr = new byte[length];
                    length = adr.m18963a(str, bArr, 0, length);
                    mo6960c(length);
                    mo6953a(bArr, 0, length);
                    return;
                }
                int i2;
                if (i > this.c - this.d) {
                    m34069e();
                }
                length = zzffg.m27551g(str.length());
                i = this.d;
                if (length == g) {
                    this.d = i + length;
                    g = adr.m18963a(str, this.b, this.d, this.c - this.d);
                    this.d = i;
                    i2 = (g - i) - length;
                    mo6940m(i2);
                    this.d = g;
                } else {
                    i2 = adr.m18962a((CharSequence) str);
                    mo6940m(i2);
                    this.d = adr.m18963a(str, this.b, this.d, i2);
                }
                this.e += i2;
            } catch (zzfiv e) {
                this.e -= this.d - i;
                this.d = i;
                throw e;
            } catch (Throwable e2) {
                throw new zzc(e2);
            } catch (zzfiv e3) {
                m27573a(str, e3);
            }
        }

        /* renamed from: a */
        public final void mo6953a(byte[] bArr, int i, int i2) throws IOException {
            mo6962c(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo6954b(int i) throws IOException {
            if (i >= 0) {
                mo6960c(i);
            } else {
                mo6949a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo6955b(int i, int i2) throws IOException {
            m34070o(20);
            m31683h(i, 0);
            if (i2 >= 0) {
                mo6940m(i2);
            } else {
                mo6939h((long) i2);
            }
        }

        /* renamed from: b */
        public final void mo6956b(int i, long j) throws IOException {
            m34070o(18);
            m31683h(i, 1);
            m31685i(j);
        }

        /* renamed from: b */
        public final void mo6957b(int i, zzfes zzfes) throws IOException {
            mo6943a(1, 3);
            mo6961c(2, i);
            mo6945a(3, zzfes);
            mo6943a(1, 4);
        }

        /* renamed from: b */
        public final void mo6958b(int i, zzfhe zzfhe) throws IOException {
            mo6943a(1, 3);
            mo6961c(2, i);
            mo6946a(3, zzfhe);
            mo6943a(1, 4);
        }

        /* renamed from: b */
        public final void mo6959b(long j) throws IOException {
            m34070o(8);
            m31685i(j);
        }

        /* renamed from: c */
        public final void mo6960c(int i) throws IOException {
            m34070o(10);
            mo6940m(i);
        }

        /* renamed from: c */
        public final void mo6961c(int i, int i2) throws IOException {
            m34070o(20);
            m31683h(i, 0);
            mo6940m(i2);
        }

        /* renamed from: c */
        public final void mo6962c(byte[] bArr, int i, int i2) throws IOException {
            if (this.c - this.d >= i2) {
                System.arraycopy(bArr, i, this.b, this.d, i2);
                this.d += i2;
            } else {
                int i3 = this.c - this.d;
                System.arraycopy(bArr, i, this.b, this.d, i3);
                i += i3;
                i2 -= i3;
                this.d = this.c;
                this.e += i3;
                m34069e();
                if (i2 <= this.c) {
                    System.arraycopy(bArr, i, this.b, 0, i2);
                    this.d = i2;
                } else {
                    this.f28824f.write(bArr, i, i2);
                }
            }
            this.e += i2;
        }

        /* renamed from: d */
        public final void mo6963d(int i) throws IOException {
            m34070o(4);
            m31687n(i);
        }

        /* renamed from: d */
        public final void mo6964d(int i, int i2) throws IOException {
            m34070o(14);
            m31683h(i, 5);
            m31687n(i2);
        }
    }

    private zzffg() {
    }

    /* renamed from: a */
    public static int m27519a(double d) {
        return 8;
    }

    /* renamed from: a */
    public static int m27520a(float f) {
        return 4;
    }

    /* renamed from: a */
    static int m27521a(int i) {
        return i > 4096 ? 4096 : i;
    }

    /* renamed from: a */
    public static int m27522a(int i, acc acc) {
        i = m27545e(i);
        int b = acc.m18865b();
        return i + (m27551g(b) + b);
    }

    /* renamed from: a */
    public static int m27523a(acc acc) {
        int b = acc.m18865b();
        return m27551g(b) + b;
    }

    /* renamed from: a */
    public static int m27524a(boolean z) {
        return 1;
    }

    /* renamed from: a */
    public static zzffg m27525a(OutputStream outputStream, int i) {
        return new C8035c(outputStream, i);
    }

    /* renamed from: a */
    public static zzffg m27526a(byte[] bArr) {
        return m27534b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m27527b(int i, acc acc) {
        return ((m27545e(1) << 1) + m27546e(2, i)) + m27522a(3, acc);
    }

    /* renamed from: b */
    public static int m27528b(int i, String str) {
        return m27545e(i) + m27532b(str);
    }

    /* renamed from: b */
    public static int m27529b(int i, boolean z) {
        return m27545e(i) + 1;
    }

    /* renamed from: b */
    public static int m27530b(zzfes zzfes) {
        int a = zzfes.mo6930a();
        return m27551g(a) + a;
    }

    /* renamed from: b */
    public static int m27531b(zzfhe zzfhe) {
        int zzho = zzfhe.zzho();
        return m27551g(zzho) + zzho;
    }

    /* renamed from: b */
    public static int m27532b(java.lang.String r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = com.google.android.gms.internal.adr.m18962a(r1);	 Catch:{ zzfiv -> 0x0005 }
        goto L_0x000c;
    L_0x0005:
        r0 = com.google.android.gms.internal.abx.f15002a;
        r1 = r1.getBytes(r0);
        r0 = r1.length;
    L_0x000c:
        r1 = m27551g(r0);
        r1 = r1 + r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzffg.b(java.lang.String):int");
    }

    /* renamed from: b */
    public static int m27533b(byte[] bArr) {
        int length = bArr.length;
        return m27551g(length) + length;
    }

    /* renamed from: b */
    public static zzffg m27534b(byte[] bArr, int i, int i2) {
        return new C7362b(bArr, i, i2);
    }

    /* renamed from: c */
    public static int m27535c(int i, long j) {
        return m27545e(i) + m27543d(j);
    }

    /* renamed from: c */
    public static int m27536c(int i, zzfes zzfes) {
        i = m27545e(i);
        int a = zzfes.mo6930a();
        return i + (m27551g(a) + a);
    }

    /* renamed from: c */
    public static int m27537c(int i, zzfhe zzfhe) {
        return m27545e(i) + m27531b(zzfhe);
    }

    /* renamed from: c */
    public static int m27538c(long j) {
        return m27543d(j);
    }

    @Deprecated
    /* renamed from: c */
    public static int m27539c(zzfhe zzfhe) {
        return zzfhe.zzho();
    }

    /* renamed from: d */
    public static int m27540d(int i, long j) {
        return m27545e(i) + 8;
    }

    /* renamed from: d */
    public static int m27541d(int i, zzfes zzfes) {
        return ((m27545e(1) << 1) + m27546e(2, i)) + m27536c(3, zzfes);
    }

    /* renamed from: d */
    public static int m27542d(int i, zzfhe zzfhe) {
        return ((m27545e(1) << 1) + m27546e(2, i)) + m27537c(3, zzfhe);
    }

    /* renamed from: d */
    public static int m27543d(long j) {
        if ((j & -128) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i;
        if ((j & -34359738368L) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((j & -2097152) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: e */
    public static int m27545e(int i) {
        return m27551g(i << 3);
    }

    /* renamed from: e */
    public static int m27546e(int i, int i2) {
        return m27545e(i) + m27551g(i2);
    }

    /* renamed from: e */
    public static int m27547e(long j) {
        return m27543d(mo6939h(j));
    }

    /* renamed from: f */
    public static int m27548f(int i) {
        return i >= 0 ? m27551g(i) : 10;
    }

    /* renamed from: f */
    public static int m27549f(int i, int i2) {
        return m27545e(i) + 4;
    }

    /* renamed from: f */
    public static int m27550f(long j) {
        return 8;
    }

    /* renamed from: g */
    public static int m27551g(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m27552g(int i, int i2) {
        return m27545e(i) + m27548f(i2);
    }

    /* renamed from: g */
    public static int m27553g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m27554h(int i) {
        return m27551g(mo6940m(i));
    }

    /* renamed from: h */
    private static long mo6939h(long j) {
        return (j << 1) ^ (j >> 63);
    }

    /* renamed from: i */
    public static int m27556i(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m27557j(int i) {
        return 4;
    }

    /* renamed from: k */
    public static int m27558k(int i) {
        return m27548f(i);
    }

    @Deprecated
    /* renamed from: l */
    public static int m27559l(int i) {
        return m27551g(i);
    }

    /* renamed from: m */
    private static int mo6940m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo6941a() throws IOException;

    /* renamed from: a */
    public abstract void mo6942a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo6943a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo6944a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo6945a(int i, zzfes zzfes) throws IOException;

    /* renamed from: a */
    public abstract void mo6946a(int i, zzfhe zzfhe) throws IOException;

    /* renamed from: a */
    public abstract void mo6947a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo6948a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo6949a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo6950a(zzfes zzfes) throws IOException;

    /* renamed from: a */
    public abstract void mo6951a(zzfhe zzfhe) throws IOException;

    /* renamed from: a */
    public abstract void mo6952a(String str) throws IOException;

    /* renamed from: a */
    final void m27573a(String str, zzfiv zzfiv) throws IOException {
        f23543b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzfiv);
        byte[] bytes = str.getBytes(abx.f15002a);
        try {
            mo6960c(bytes.length);
            mo6953a(bytes, 0, bytes.length);
        } catch (Throwable e) {
            throw new zzc(e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public abstract int mo6938b();

    /* renamed from: b */
    public abstract void mo6954b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo6955b(int i, int i2) throws IOException;

    /* renamed from: b */
    public abstract void mo6956b(int i, long j) throws IOException;

    /* renamed from: b */
    public abstract void mo6957b(int i, zzfes zzfes) throws IOException;

    /* renamed from: b */
    public abstract void mo6958b(int i, zzfhe zzfhe) throws IOException;

    /* renamed from: b */
    public abstract void mo6959b(long j) throws IOException;

    /* renamed from: c */
    public final void m27581c() {
        if (mo6938b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: c */
    public abstract void mo6960c(int i) throws IOException;

    /* renamed from: c */
    public abstract void mo6961c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo6962c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: d */
    public abstract void mo6963d(int i) throws IOException;

    /* renamed from: d */
    public abstract void mo6964d(int i, int i2) throws IOException;
}
