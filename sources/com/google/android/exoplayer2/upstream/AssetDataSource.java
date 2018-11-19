package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class AssetDataSource implements DataSource {
    /* renamed from: a */
    private final AssetManager f11641a;
    /* renamed from: b */
    private final TransferListener<? super AssetDataSource> f11642b;
    /* renamed from: c */
    private Uri f11643c;
    /* renamed from: d */
    private InputStream f11644d;
    /* renamed from: e */
    private long f11645e;
    /* renamed from: f */
    private boolean f11646f;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context, TransferListener<? super AssetDataSource> transferListener) {
        this.f11641a = context.getAssets();
        this.f11642b = transferListener;
    }

    public long open(DataSpec dataSpec) throws AssetDataSourceException {
        try {
            this.f11643c = dataSpec.f6822a;
            String path = this.f11643c.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            this.f11644d = this.f11641a.open(path, 1);
            if (this.f11644d.skip(dataSpec.f6825d) < dataSpec.f6825d) {
                throw new EOFException();
            }
            if (dataSpec.f6826e != -1) {
                this.f11645e = dataSpec.f6826e;
            } else {
                this.f11645e = (long) this.f11644d.available();
                if (this.f11645e == 2147483647L) {
                    this.f11645e = -1;
                }
            }
            this.f11646f = true;
            if (this.f11642b != null) {
                this.f11642b.onTransferStart(this, dataSpec);
            }
            return this.f11645e;
        } catch (DataSpec dataSpec2) {
            throw new AssetDataSourceException(dataSpec2);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return null;
        }
        if (this.f11645e == 0) {
            return -1;
        }
        try {
            if (this.f11645e != -1) {
                i2 = (int) Math.min(this.f11645e, (long) i2);
            }
            bArr = this.f11644d.read(bArr, i, i2);
            if (bArr != -1) {
                if (this.f11645e != -1) {
                    this.f11645e -= (long) bArr;
                }
                if (this.f11642b != 0) {
                    this.f11642b.onBytesTransferred(this, bArr);
                }
                return bArr;
            } else if (this.f11645e == -1) {
                return -1;
            } else {
                throw new AssetDataSourceException(new EOFException());
            }
        } catch (byte[] bArr2) {
            throw new AssetDataSourceException(bArr2);
        }
    }

    public Uri getUri() {
        return this.f11643c;
    }

    public void close() throws AssetDataSourceException {
        this.f11643c = null;
        try {
            if (this.f11644d != null) {
                this.f11644d.close();
            }
            this.f11644d = null;
            if (this.f11646f) {
                this.f11646f = false;
                if (this.f11642b != null) {
                    this.f11642b.onTransferEnd(this);
                }
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        } catch (Throwable th) {
            this.f11644d = null;
            if (this.f11646f) {
                this.f11646f = false;
                if (this.f11642b != null) {
                    this.f11642b.onTransferEnd(this);
                }
            }
        }
    }
}
