package com.esotericsoftware.kryo.io;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.minlog.Log;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.InputStream;

public class InputChunked extends Input {
    private int chunkSize = -1;

    public InputChunked() {
        super((int) ItemAnimator.FLAG_MOVED);
    }

    public InputChunked(int i) {
        super(i);
    }

    public InputChunked(InputStream inputStream) {
        super(inputStream, ItemAnimator.FLAG_MOVED);
    }

    public InputChunked(InputStream inputStream, int i) {
        super(inputStream, i);
    }

    public void setInputStream(InputStream inputStream) {
        super.setInputStream(inputStream);
        this.chunkSize = -1;
    }

    public void setBuffer(byte[] bArr, int i, int i2) {
        super.setBuffer(bArr, i, i2);
        this.chunkSize = -1;
    }

    public void rewind() {
        super.rewind();
        this.chunkSize = -1;
    }

    protected int fill(byte[] bArr, int i, int i2) throws KryoException {
        if (this.chunkSize == -1) {
            readChunkSize();
        } else if (this.chunkSize == 0) {
            return -1;
        }
        bArr = super.fill(bArr, i, Math.min(this.chunkSize, i2));
        this.chunkSize -= bArr;
        if (this.chunkSize == 0) {
            readChunkSize();
        }
        return bArr;
    }

    private void readChunkSize() {
        try {
            InputStream inputStream = getInputStream();
            int i = 0;
            for (int i2 = 0; i2 < 32; i2 += 7) {
                int read = inputStream.read();
                if (read == -1) {
                    throw new KryoException("Buffer underflow.");
                }
                i |= (read & 127) << i2;
                if ((read & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                    this.chunkSize = i;
                    if (Log.TRACE) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Read chunk: ");
                        stringBuilder.append(this.chunkSize);
                        Log.trace("kryo", stringBuilder.toString());
                        return;
                    }
                    return;
                }
            }
            throw new KryoException("Malformed integer.");
        } catch (Throwable e) {
            throw new KryoException(e);
        }
    }

    public void nextChunks() {
        if (this.chunkSize == -1) {
            readChunkSize();
        }
        while (this.chunkSize > 0) {
            skip(this.chunkSize);
        }
        this.chunkSize = -1;
        if (Log.TRACE) {
            Log.trace("kryo", "Next chunks.");
        }
    }
}
