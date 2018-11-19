package com.tinder.data.p215d;

import com.facebook.ads.AdError;
import com.tinder.domain.auth.AuthStatus;
import com.tinder.domain.auth.AuthStatusRepository;
import com.tinder.scarlet.C14796f;
import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.Lifecycle.C14785a.C16490b;
import com.tinder.scarlet.Lifecycle.C14785a.C16491c.C18034b;
import com.tinder.scarlet.lifecycle.C18043d;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Subscriber;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001H\u0001¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ9\u0010\r\u001a\u00020\f2.\u0010\u000e\u001a*\u0012\u000e\b\u0000\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010 \u0011*\u0014\u0012\u000e\b\u0000\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u000f0\u000fH\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/data/keepalive/LoggedInLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "authStatusRepository", "Lcom/tinder/domain/auth/AuthStatusRepository;", "lifecycleRegistry", "Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;", "(Lcom/tinder/domain/auth/AuthStatusRepository;Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;)V", "combineWith", "others", "", "([Lcom/tinder/scarlet/Lifecycle;)Lcom/tinder/scarlet/Lifecycle;", "start", "", "subscribe", "p0", "Lorg/reactivestreams/Subscriber;", "Lcom/tinder/scarlet/Lifecycle$State;", "kotlin.jvm.PlatformType", "Companion", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.d.a */
public final class C12853a implements Lifecycle {
    /* renamed from: a */
    public static final C8640a f41292a = new C8640a();
    /* renamed from: d */
    private static final C14796f f41293d = new C14796f(AdError.NETWORK_ERROR_CODE, "User is Logged out");
    /* renamed from: b */
    private final AuthStatusRepository f41294b;
    /* renamed from: c */
    private final C18043d f41295c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/keepalive/LoggedInLifecycle$Companion;", "", "()V", "LOGGED_OUT_SHUTDOWN_REASON", "Lcom/tinder/scarlet/ShutdownReason;", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.d.a$a */
    public static final class C8640a {
        private C8640a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/scarlet/Lifecycle$State;", "authStatus", "Lcom/tinder/domain/auth/AuthStatus;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.d.a$b */
    static final class C10763b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10763b f35162a = new C10763b();

        C10763b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43166a((AuthStatus) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C14785a m43166a(@NotNull AuthStatus authStatus) {
            C2668g.b(authStatus, "authStatus");
            switch (C8641b.f30493a[authStatus.ordinal()]) {
                case 1:
                    return (C14785a) C16490b.f51167a;
                case 2:
                    return (C14785a) new C18034b(C12853a.f41293d);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public Lifecycle combineWith(@NotNull Lifecycle... lifecycleArr) {
        C2668g.b(lifecycleArr, "others");
        return this.f41295c.combineWith(lifecycleArr);
    }

    public void subscribe(Subscriber<? super C14785a> subscriber) {
        this.f41295c.subscribe(subscriber);
    }

    public C12853a(@NotNull AuthStatusRepository authStatusRepository, @NotNull C18043d c18043d) {
        C2668g.b(authStatusRepository, "authStatusRepository");
        C2668g.b(c18043d, "lifecycleRegistry");
        this.f41294b = authStatusRepository;
        this.f41295c = c18043d;
    }

    /* renamed from: a */
    public final void m50475a() {
        this.f41294b.observeAuthStatus().f(C10763b.f35162a).subscribe(this.f41295c);
    }
}
