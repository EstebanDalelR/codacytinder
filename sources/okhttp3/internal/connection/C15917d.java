package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.C15969u;

/* renamed from: okhttp3.internal.connection.d */
public final class C15917d {
    /* renamed from: a */
    private final Set<C15969u> f49323a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void m60224a(C15969u c15969u) {
        this.f49323a.add(c15969u);
    }

    /* renamed from: b */
    public synchronized void m60225b(C15969u c15969u) {
        this.f49323a.remove(c15969u);
    }

    /* renamed from: c */
    public synchronized boolean m60226c(C15969u c15969u) {
        return this.f49323a.contains(c15969u);
    }
}
