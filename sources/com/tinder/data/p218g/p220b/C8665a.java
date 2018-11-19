package com.tinder.data.p218g.p220b;

import com.google.android.gms.iid.C2553a;
import io.reactivex.C3960g;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tinder/data/settings/notifications/GCMTokenProvider;", "", "instanceId", "Lcom/google/android/gms/iid/InstanceID;", "(Lcom/google/android/gms/iid/InstanceID;)V", "token", "Lio/reactivex/Single;", "", "getToken", "()Lio/reactivex/Single;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.g.b.a */
public final class C8665a {
    @NotNull
    /* renamed from: a */
    private final C3960g<String> f30517a;
    /* renamed from: b */
    private final C2553a f30518b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.g.b.a$a */
    static final class C8664a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C8665a f30516a;

        C8664a(C8665a c8665a) {
            this.f30516a = c8665a;
        }

        public /* synthetic */ Object call() {
            return m36935a();
        }

        /* renamed from: a */
        public final String m36935a() {
            return this.f30516a.f30518b.b("465293127427", "GCM", null);
        }
    }

    @Inject
    public C8665a(@NotNull C2553a c2553a) {
        C2668g.b(c2553a, "instanceId");
        this.f30518b = c2553a;
        c2553a = C3960g.c((Callable) new C8664a(this));
        C2668g.a(c2553a, "Single.fromCallable {\n  …ID_SCOPE, null)\n        }");
        this.f30517a = c2553a;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<String> m36937a() {
        return this.f30517a;
    }
}
