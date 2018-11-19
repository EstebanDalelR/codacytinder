package okhttp3.internal;

import java.net.Socket;
import javax.net.ssl.SSLSocket;
import okhttp3.C15885a;
import okhttp3.C15894f;
import okhttp3.C15896g;
import okhttp3.C15957l.C15956a;
import okhttp3.C15963q;
import okhttp3.C15966s.C15965a;
import okhttp3.C15969u;
import okhttp3.C17692o;
import okhttp3.Call;
import okhttp3.internal.connection.C15917d;
import okhttp3.internal.connection.C15921f;
import okhttp3.internal.connection.C17659c;

/* renamed from: okhttp3.internal.a */
public abstract class C15900a {
    /* renamed from: a */
    public static C15900a f49230a;

    /* renamed from: a */
    public abstract int mo13397a(C15965a c15965a);

    /* renamed from: a */
    public abstract Socket mo13398a(C15894f c15894f, C15885a c15885a, C15921f c15921f);

    /* renamed from: a */
    public abstract Call mo13399a(C17692o c17692o, C15963q c15963q);

    /* renamed from: a */
    public abstract C17659c mo13400a(C15894f c15894f, C15885a c15885a, C15921f c15921f, C15969u c15969u);

    /* renamed from: a */
    public abstract C15917d mo13401a(C15894f c15894f);

    /* renamed from: a */
    public abstract C15921f mo13402a(Call call);

    /* renamed from: a */
    public abstract void mo13403a(C15896g c15896g, SSLSocket sSLSocket, boolean z);

    /* renamed from: a */
    public abstract void mo13404a(C15956a c15956a, String str);

    /* renamed from: a */
    public abstract void mo13405a(C15956a c15956a, String str, String str2);

    /* renamed from: a */
    public abstract boolean mo13406a(C15885a c15885a, C15885a c15885a2);

    /* renamed from: a */
    public abstract boolean mo13407a(C15894f c15894f, C17659c c17659c);

    /* renamed from: b */
    public abstract void mo13408b(C15894f c15894f, C17659c c17659c);
}
