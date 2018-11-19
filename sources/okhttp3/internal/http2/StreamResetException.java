package okhttp3.internal.http2;

import java.io.IOException;

public final class StreamResetException extends IOException {
    /* renamed from: a */
    public final ErrorCode f49358a;

    public StreamResetException(ErrorCode errorCode) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("stream was reset: ");
        stringBuilder.append(errorCode);
        super(stringBuilder.toString());
        this.f49358a = errorCode;
    }
}
