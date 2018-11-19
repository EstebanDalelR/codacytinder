package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface AudioProcessor {
    /* renamed from: a */
    public static final ByteBuffer f5497a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledFormatException extends Exception {
        public UnhandledFormatException(int i, int i2, int i3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unhandled format: ");
            stringBuilder.append(i);
            stringBuilder.append(" Hz, ");
            stringBuilder.append(i2);
            stringBuilder.append(" channels in encoding ");
            stringBuilder.append(i3);
            super(stringBuilder.toString());
        }
    }

    boolean configure(int i, int i2, int i3) throws UnhandledFormatException;

    void flush();

    ByteBuffer getOutput();

    int getOutputChannelCount();

    int getOutputEncoding();

    int getOutputSampleRateHz();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
