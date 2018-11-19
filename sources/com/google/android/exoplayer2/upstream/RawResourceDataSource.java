package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class RawResourceDataSource implements DataSource {
    /* renamed from: a */
    private final Resources f11673a;
    /* renamed from: b */
    private final TransferListener<? super RawResourceDataSource> f11674b;
    /* renamed from: c */
    private Uri f11675c;
    /* renamed from: d */
    private AssetFileDescriptor f11676d;
    /* renamed from: e */
    private InputStream f11677e;
    /* renamed from: f */
    private long f11678f;
    /* renamed from: g */
    private boolean f11679g;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context, TransferListener<? super RawResourceDataSource> transferListener) {
        this.f11673a = context.getResources();
        this.f11674b = transferListener;
    }

    public long open(com.google.android.exoplayer2.upstream.DataSpec r7) throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = r7.f6822a;	 Catch:{ IOException -> 0x008f }
        r6.f11675c = r0;	 Catch:{ IOException -> 0x008f }
        r0 = "rawresource";	 Catch:{ IOException -> 0x008f }
        r1 = r6.f11675c;	 Catch:{ IOException -> 0x008f }
        r1 = r1.getScheme();	 Catch:{ IOException -> 0x008f }
        r0 = android.text.TextUtils.equals(r0, r1);	 Catch:{ IOException -> 0x008f }
        if (r0 != 0) goto L_0x001a;	 Catch:{ IOException -> 0x008f }
    L_0x0012:
        r7 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException;	 Catch:{ IOException -> 0x008f }
        r0 = "URI must use scheme rawresource";	 Catch:{ IOException -> 0x008f }
        r7.<init>(r0);	 Catch:{ IOException -> 0x008f }
        throw r7;	 Catch:{ IOException -> 0x008f }
    L_0x001a:
        r0 = r6.f11675c;	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = r0.getLastPathSegment();	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0087 }
        r1 = r6.f11673a;	 Catch:{ IOException -> 0x008f }
        r0 = r1.openRawResourceFd(r0);	 Catch:{ IOException -> 0x008f }
        r6.f11676d = r0;	 Catch:{ IOException -> 0x008f }
        r0 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x008f }
        r1 = r6.f11676d;	 Catch:{ IOException -> 0x008f }
        r1 = r1.getFileDescriptor();	 Catch:{ IOException -> 0x008f }
        r0.<init>(r1);	 Catch:{ IOException -> 0x008f }
        r6.f11677e = r0;	 Catch:{ IOException -> 0x008f }
        r0 = r6.f11677e;	 Catch:{ IOException -> 0x008f }
        r1 = r6.f11676d;	 Catch:{ IOException -> 0x008f }
        r1 = r1.getStartOffset();	 Catch:{ IOException -> 0x008f }
        r0.skip(r1);	 Catch:{ IOException -> 0x008f }
        r0 = r6.f11677e;	 Catch:{ IOException -> 0x008f }
        r1 = r7.f6825d;	 Catch:{ IOException -> 0x008f }
        r0 = r0.skip(r1);	 Catch:{ IOException -> 0x008f }
        r2 = r7.f6825d;	 Catch:{ IOException -> 0x008f }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ IOException -> 0x008f }
        if (r4 >= 0) goto L_0x0058;	 Catch:{ IOException -> 0x008f }
    L_0x0052:
        r7 = new java.io.EOFException;	 Catch:{ IOException -> 0x008f }
        r7.<init>();	 Catch:{ IOException -> 0x008f }
        throw r7;	 Catch:{ IOException -> 0x008f }
    L_0x0058:
        r0 = r7.f6826e;	 Catch:{ IOException -> 0x008f }
        r2 = -1;	 Catch:{ IOException -> 0x008f }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ IOException -> 0x008f }
        if (r4 == 0) goto L_0x0065;	 Catch:{ IOException -> 0x008f }
    L_0x0060:
        r0 = r7.f6826e;	 Catch:{ IOException -> 0x008f }
        r6.f11678f = r0;	 Catch:{ IOException -> 0x008f }
        goto L_0x0078;	 Catch:{ IOException -> 0x008f }
    L_0x0065:
        r0 = r6.f11676d;	 Catch:{ IOException -> 0x008f }
        r0 = r0.getLength();	 Catch:{ IOException -> 0x008f }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ IOException -> 0x008f }
        if (r4 != 0) goto L_0x0070;	 Catch:{ IOException -> 0x008f }
    L_0x006f:
        goto L_0x0076;	 Catch:{ IOException -> 0x008f }
    L_0x0070:
        r2 = r7.f6825d;	 Catch:{ IOException -> 0x008f }
        r4 = 0;	 Catch:{ IOException -> 0x008f }
        r4 = r0 - r2;	 Catch:{ IOException -> 0x008f }
        r2 = r4;	 Catch:{ IOException -> 0x008f }
    L_0x0076:
        r6.f11678f = r2;	 Catch:{ IOException -> 0x008f }
    L_0x0078:
        r0 = 1;
        r6.f11679g = r0;
        r0 = r6.f11674b;
        if (r0 == 0) goto L_0x0084;
    L_0x007f:
        r0 = r6.f11674b;
        r0.onTransferStart(r6, r7);
    L_0x0084:
        r0 = r6.f11678f;
        return r0;
    L_0x0087:
        r7 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException;	 Catch:{ IOException -> 0x008f }
        r0 = "Resource identifier must be an integer.";	 Catch:{ IOException -> 0x008f }
        r7.<init>(r0);	 Catch:{ IOException -> 0x008f }
        throw r7;	 Catch:{ IOException -> 0x008f }
    L_0x008f:
        r7 = move-exception;
        r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException;
        r0.<init>(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.open(com.google.android.exoplayer2.upstream.DataSpec):long");
    }

    public int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return null;
        }
        if (this.f11678f == 0) {
            return -1;
        }
        try {
            if (this.f11678f != -1) {
                i2 = (int) Math.min(this.f11678f, (long) i2);
            }
            bArr = this.f11677e.read(bArr, i, i2);
            if (bArr != -1) {
                if (this.f11678f != -1) {
                    this.f11678f -= (long) bArr;
                }
                if (this.f11674b != 0) {
                    this.f11674b.onBytesTransferred(this, bArr);
                }
                return bArr;
            } else if (this.f11678f == -1) {
                return -1;
            } else {
                throw new RawResourceDataSourceException(new EOFException());
            }
        } catch (IOException e) {
            throw new RawResourceDataSourceException(e);
        }
    }

    public Uri getUri() {
        return this.f11675c;
    }

    public void close() throws RawResourceDataSourceException {
        this.f11675c = null;
        try {
            if (this.f11677e != null) {
                this.f11677e.close();
            }
            this.f11677e = null;
            try {
                if (this.f11676d != null) {
                    this.f11676d.close();
                }
                this.f11676d = null;
                if (this.f11679g) {
                    this.f11679g = false;
                    if (this.f11674b != null) {
                        this.f11674b.onTransferEnd(this);
                    }
                }
            } catch (IOException e) {
                throw new RawResourceDataSourceException(e);
            } catch (Throwable th) {
                this.f11676d = null;
                if (this.f11679g) {
                    this.f11679g = false;
                    if (this.f11674b != null) {
                        this.f11674b.onTransferEnd(this);
                    }
                }
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException(e2);
        } catch (Throwable th2) {
            this.f11677e = null;
            try {
                if (this.f11676d != null) {
                    this.f11676d.close();
                }
                this.f11676d = null;
                if (this.f11679g) {
                    this.f11679g = false;
                    if (this.f11674b != null) {
                        this.f11674b.onTransferEnd(this);
                    }
                }
            } catch (IOException e22) {
                throw new RawResourceDataSourceException(e22);
            } catch (Throwable th3) {
                this.f11676d = null;
                if (this.f11679g) {
                    this.f11679g = false;
                    if (this.f11674b != null) {
                        this.f11674b.onTransferEnd(this);
                    }
                }
            }
        }
    }
}
