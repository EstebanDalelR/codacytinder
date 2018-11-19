package okio;

import java.io.IOException;

/* renamed from: okio.f */
public abstract class C17704f implements Source {
    private final Source delegate;

    public C17704f(Source source) {
        if (source == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = source;
    }

    public final Source delegate() {
        return this.delegate;
    }

    public long read(C18549c c18549c, long j) throws IOException {
        return this.delegate.read(c18549c, j);
    }

    public C15982q timeout() {
        return this.delegate.timeout();
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.delegate.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
