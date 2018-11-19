package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import javax.annotation.Nullable;

public abstract class EventListener {
    /* renamed from: a */
    public static final EventListener f49064a = new C176431();

    public interface Factory {
        EventListener create(Call call);
    }

    /* renamed from: okhttp3.EventListener$1 */
    class C176431 extends EventListener {
        C176431() {
        }
    }

    /* renamed from: okhttp3.EventListener$2 */
    class C176442 implements Factory {
        /* renamed from: a */
        final /* synthetic */ EventListener f54832a;

        C176442(EventListener eventListener) {
            this.f54832a = eventListener;
        }

        public EventListener create(Call call) {
            return this.f54832a;
        }
    }

    /* renamed from: a */
    public void m59943a(Call call) {
    }

    /* renamed from: a */
    public void m59944a(Call call, long j) {
    }

    /* renamed from: a */
    public void m59945a(Call call, IOException iOException) {
    }

    /* renamed from: a */
    public void m59946a(Call call, String str) {
    }

    /* renamed from: a */
    public void m59947a(Call call, String str, List<InetAddress> list) {
    }

    /* renamed from: a */
    public void m59948a(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    /* renamed from: a */
    public void m59949a(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol) {
    }

    /* renamed from: a */
    public void m59950a(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol, IOException iOException) {
    }

    /* renamed from: a */
    public void m59951a(Call call, Connection connection) {
    }

    /* renamed from: a */
    public void m59952a(Call call, @Nullable C15955k c15955k) {
    }

    /* renamed from: a */
    public void m59953a(Call call, C15963q c15963q) {
    }

    /* renamed from: a */
    public void m59954a(Call call, C15966s c15966s) {
    }

    /* renamed from: b */
    public void m59955b(Call call) {
    }

    /* renamed from: b */
    public void m59956b(Call call, long j) {
    }

    /* renamed from: b */
    public void m59957b(Call call, Connection connection) {
    }

    /* renamed from: c */
    public void m59958c(Call call) {
    }

    /* renamed from: d */
    public void m59959d(Call call) {
    }

    /* renamed from: e */
    public void m59960e(Call call) {
    }

    /* renamed from: f */
    public void m59961f(Call call) {
    }

    /* renamed from: g */
    public void m59962g(Call call) {
    }

    /* renamed from: a */
    static Factory m59942a(EventListener eventListener) {
        return new C176442(eventListener);
    }
}
