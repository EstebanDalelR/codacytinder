package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class ContentDataSource implements DataSource {
    /* renamed from: a */
    private final ContentResolver f11647a;
    /* renamed from: b */
    private final TransferListener<? super ContentDataSource> f11648b;
    /* renamed from: c */
    private Uri f11649c;
    /* renamed from: d */
    private AssetFileDescriptor f11650d;
    /* renamed from: e */
    private FileInputStream f11651e;
    /* renamed from: f */
    private long f11652f;
    /* renamed from: g */
    private boolean f11653g;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context, TransferListener<? super ContentDataSource> transferListener) {
        this.f11647a = context.getContentResolver();
        this.f11648b = transferListener;
    }

    public long open(DataSpec dataSpec) throws ContentDataSourceException {
        try {
            this.f11649c = dataSpec.f6822a;
            this.f11650d = this.f11647a.openAssetFileDescriptor(this.f11649c, "r");
            if (this.f11650d == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not open file descriptor for: ");
                stringBuilder.append(this.f11649c);
                throw new FileNotFoundException(stringBuilder.toString());
            }
            this.f11651e = new FileInputStream(this.f11650d.getFileDescriptor());
            long startOffset = this.f11650d.getStartOffset();
            long skip = this.f11651e.skip(startOffset + dataSpec.f6825d) - startOffset;
            if (skip != dataSpec.f6825d) {
                throw new EOFException();
            }
            long j = -1;
            if (dataSpec.f6826e != -1) {
                this.f11652f = dataSpec.f6826e;
            } else {
                startOffset = this.f11650d.getLength();
                if (startOffset == -1) {
                    FileChannel channel = this.f11651e.getChannel();
                    skip = channel.size();
                    if (skip != 0) {
                        j = skip - channel.position();
                    }
                    this.f11652f = j;
                } else {
                    this.f11652f = startOffset - skip;
                }
            }
            this.f11653g = true;
            if (this.f11648b != null) {
                this.f11648b.onTransferStart(this, dataSpec);
            }
            return this.f11652f;
        } catch (DataSpec dataSpec2) {
            throw new ContentDataSourceException(dataSpec2);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return null;
        }
        if (this.f11652f == 0) {
            return -1;
        }
        try {
            if (this.f11652f != -1) {
                i2 = (int) Math.min(this.f11652f, (long) i2);
            }
            bArr = this.f11651e.read(bArr, i, i2);
            if (bArr != -1) {
                if (this.f11652f != -1) {
                    this.f11652f -= (long) bArr;
                }
                if (this.f11648b != 0) {
                    this.f11648b.onBytesTransferred(this, bArr);
                }
                return bArr;
            } else if (this.f11652f == -1) {
                return -1;
            } else {
                throw new ContentDataSourceException(new EOFException());
            }
        } catch (byte[] bArr2) {
            throw new ContentDataSourceException(bArr2);
        }
    }

    public Uri getUri() {
        return this.f11649c;
    }

    public void close() throws ContentDataSourceException {
        this.f11649c = null;
        try {
            if (this.f11651e != null) {
                this.f11651e.close();
            }
            this.f11651e = null;
            try {
                if (this.f11650d != null) {
                    this.f11650d.close();
                }
                this.f11650d = null;
                if (this.f11653g) {
                    this.f11653g = false;
                    if (this.f11648b != null) {
                        this.f11648b.onTransferEnd(this);
                    }
                }
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            } catch (Throwable th) {
                this.f11650d = null;
                if (this.f11653g) {
                    this.f11653g = false;
                    if (this.f11648b != null) {
                        this.f11648b.onTransferEnd(this);
                    }
                }
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        } catch (Throwable th2) {
            this.f11651e = null;
            try {
                if (this.f11650d != null) {
                    this.f11650d.close();
                }
                this.f11650d = null;
                if (this.f11653g) {
                    this.f11653g = false;
                    if (this.f11648b != null) {
                        this.f11648b.onTransferEnd(this);
                    }
                }
            } catch (IOException e22) {
                throw new ContentDataSourceException(e22);
            } catch (Throwable th3) {
                this.f11650d = null;
                if (this.f11653g) {
                    this.f11653g = false;
                    if (this.f11648b != null) {
                        this.f11648b.onTransferEnd(this);
                    }
                }
            }
        }
    }
}
