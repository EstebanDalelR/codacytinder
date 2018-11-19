package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileDataSource implements DataSource {
    /* renamed from: a */
    private final TransferListener<? super FileDataSource> f11654a;
    /* renamed from: b */
    private RandomAccessFile f11655b;
    /* renamed from: c */
    private Uri f11656c;
    /* renamed from: d */
    private long f11657d;
    /* renamed from: e */
    private boolean f11658e;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public FileDataSource() {
        this(null);
    }

    public FileDataSource(TransferListener<? super FileDataSource> transferListener) {
        this.f11654a = transferListener;
    }

    public long open(DataSpec dataSpec) throws FileDataSourceException {
        try {
            this.f11656c = dataSpec.f6822a;
            this.f11655b = new RandomAccessFile(dataSpec.f6822a.getPath(), "r");
            this.f11655b.seek(dataSpec.f6825d);
            this.f11657d = dataSpec.f6826e == -1 ? this.f11655b.length() - dataSpec.f6825d : dataSpec.f6826e;
            if (this.f11657d < 0) {
                throw new EOFException();
            }
            this.f11658e = true;
            if (this.f11654a != null) {
                this.f11654a.onTransferStart(this, dataSpec);
            }
            return this.f11657d;
        } catch (DataSpec dataSpec2) {
            throw new FileDataSourceException(dataSpec2);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return null;
        }
        if (this.f11657d == 0) {
            return -1;
        }
        try {
            bArr = this.f11655b.read(bArr, i, (int) Math.min(this.f11657d, (long) i2));
            if (bArr > null) {
                this.f11657d -= (long) bArr;
                if (this.f11654a != 0) {
                    this.f11654a.onBytesTransferred(this, bArr);
                }
            }
            return bArr;
        } catch (byte[] bArr2) {
            throw new FileDataSourceException(bArr2);
        }
    }

    public Uri getUri() {
        return this.f11656c;
    }

    public void close() throws FileDataSourceException {
        this.f11656c = null;
        try {
            if (this.f11655b != null) {
                this.f11655b.close();
            }
            this.f11655b = null;
            if (this.f11658e) {
                this.f11658e = false;
                if (this.f11654a != null) {
                    this.f11654a.onTransferEnd(this);
                }
            }
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        } catch (Throwable th) {
            this.f11655b = null;
            if (this.f11658e) {
                this.f11658e = false;
                if (this.f11654a != null) {
                    this.f11654a.onTransferEnd(this);
                }
            }
        }
    }
}
