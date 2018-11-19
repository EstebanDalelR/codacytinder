package com.esotericsoftware.kryo.io;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.minlog.Log;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.OutputStream;

public class OutputChunked extends Output {
    public OutputChunked() {
        super((int) ItemAnimator.FLAG_MOVED);
    }

    public OutputChunked(int i) {
        super(i);
    }

    public OutputChunked(OutputStream outputStream) {
        super(outputStream, (int) ItemAnimator.FLAG_MOVED);
    }

    public OutputChunked(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public void flush() throws KryoException {
        if (position() > 0) {
            try {
                writeChunkSize();
                super.flush();
            } catch (Throwable e) {
                throw new KryoException(e);
            }
        }
        super.flush();
    }

    private void writeChunkSize() throws IOException {
        int position = position();
        if (Log.TRACE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Write chunk: ");
            stringBuilder.append(position);
            Log.trace("kryo", stringBuilder.toString());
        }
        OutputStream outputStream = getOutputStream();
        if ((position & -128) == 0) {
            outputStream.write(position);
            return;
        }
        outputStream.write((position & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        position >>>= 7;
        if ((position & -128) == 0) {
            outputStream.write(position);
            return;
        }
        outputStream.write((position & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        position >>>= 7;
        if ((position & -128) == 0) {
            outputStream.write(position);
            return;
        }
        outputStream.write((position & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        position >>>= 7;
        if ((position & -128) == 0) {
            outputStream.write(position);
            return;
        }
        outputStream.write((position & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        outputStream.write(position >>> 7);
    }

    public void endChunks() {
        flush();
        if (Log.TRACE) {
            Log.trace("kryo", "End chunks.");
        }
        try {
            getOutputStream().write(0);
        } catch (Throwable e) {
            throw new KryoException(e);
        }
    }
}
