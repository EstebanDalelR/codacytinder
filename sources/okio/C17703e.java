package okio;

import java.io.IOException;

/* renamed from: okio.e */
public abstract class C17703e implements Sink {
    /* renamed from: a */
    private final Sink f55103a;

    public C17703e(Sink sink) {
        if (sink == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f55103a = sink;
    }

    public void write(C18549c c18549c, long j) throws IOException {
        this.f55103a.write(c18549c, j);
    }

    public void flush() throws IOException {
        this.f55103a.flush();
    }

    public C15982q timeout() {
        return this.f55103a.timeout();
    }

    public void close() throws IOException {
        this.f55103a.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.f55103a.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
