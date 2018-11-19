package com.tinder.auth.interactor;

import com.tinder.auth.model.AuthState;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.model.C8288b;
import com.tinder.auth.model.C8290e;
import com.tinder.auth.observer.LoginObserver;
import com.tinder.auth.p167b.C8272a;
import com.tinder.auth.p168c.C8273d;
import com.tinder.data.profile.C10935e;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.meta.model.CoreUser;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.model.auth.network.AuthRequest;
import com.tinder.model.auth.network.AuthRequestFactory;
import com.tinder.smsauth.entity.C14976d;
import com.tinder.smsauth.entity.C16747a;
import com.tinder.smsauth.entity.C16748b;
import com.tinder.smsauth.entity.C16749e;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Observable$Transformer;
import rx.Single;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BB\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\r¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/auth/interactor/LoginInteractor;", "", "authRequestFactory", "Lcom/tinder/model/auth/network/AuthRequestFactory;", "mAuthInteractor", "Lcom/tinder/auth/interactor/AuthInteractor2;", "fetchUserProfile", "Lcom/tinder/data/profile/FetchUserProfile;", "validationStateProvider", "Lcom/tinder/auth/provider/ValidationStateProvider;", "persistLoginCredentials", "Lcom/tinder/auth/usecase/PersistLoginCredentials;", "loginObservers", "", "Lcom/tinder/auth/observer/LoginObserver;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Lcom/tinder/model/auth/network/AuthRequestFactory;Lcom/tinder/auth/interactor/AuthInteractor2;Lcom/tinder/data/profile/FetchUserProfile;Lcom/tinder/auth/provider/ValidationStateProvider;Lcom/tinder/auth/usecase/PersistLoginCredentials;Ljava/util/Set;)V", "userVerificationTransformer", "Lrx/Observable$Transformer;", "Lcom/tinder/auth/model/AuthResult;", "authenticate", "Lrx/Observable;", "authType", "Lcom/tinder/auth/model/AuthType;", "credentials", "Lcom/tinder/smsauth/entity/LoginCredentials;", "login", "request", "Lcom/tinder/auth/model/LoginRequest;", "verifyUser", "authResult", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.interactor.q */
public final class C8283q {
    /* renamed from: a */
    private final Observable$Transformer<C8288b, C8288b> f29540a = ((Observable$Transformer) new C13618d(this));
    /* renamed from: b */
    private final AuthRequestFactory f29541b;
    /* renamed from: c */
    private final C8279j f29542c;
    /* renamed from: d */
    private final C10935e f29543d;
    /* renamed from: e */
    private final C8272a f29544e;
    /* renamed from: f */
    private final C8273d f29545f;
    /* renamed from: g */
    private final Set<LoginObserver> f29546g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/model/auth/network/AuthRequest;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.q$a */
    static final class C8282a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C8283q f29538a;
        /* renamed from: b */
        final /* synthetic */ AuthType f29539b;

        C8282a(C8283q c8283q, AuthType authType) {
            this.f29538a = c8283q;
            this.f29539b = authType;
        }

        public /* synthetic */ Object call() {
            return m35348a();
        }

        @NotNull
        /* renamed from: a */
        public final AuthRequest m35348a() {
            return this.f29538a.f29541b.create(this.f29539b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/auth/model/AuthResult;", "it", "Lcom/tinder/model/auth/network/AuthRequest;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.q$b */
    static final class C12587b<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C8283q f40662a;

        C12587b(C8283q c8283q) {
            this.f40662a = c8283q;
        }

        public /* synthetic */ Object call(Object obj) {
            return m49742a((AuthRequest) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Observable<C8288b> m49742a(AuthRequest authRequest) {
            C8279j c = this.f40662a.f29542c;
            C2668g.a(authRequest, "it");
            return c.m35342a(authRequest);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/auth/model/AuthResult;", "coreUser", "Lcom/tinder/domain/meta/model/CoreUser;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.q$e */
    static final class C12589e<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8283q f40664a;
        /* renamed from: b */
        final /* synthetic */ C8288b f40665b;

        C12589e(C8283q c8283q, C8288b c8288b) {
            this.f40664a = c8283q;
            this.f40665b = c8288b;
        }

        public /* synthetic */ Object call(Object obj) {
            return m49744a((CoreUser) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8288b m49744a(CoreUser coreUser) {
            boolean z = coreUser.birthDate() == null;
            boolean a = C2668g.a(coreUser.gender(), Gender.create(Value.UNKNOWN));
            if (!z) {
                if (!a) {
                    return this.f40665b;
                }
            }
            this.f40664a.f29544e.m35321b(a);
            this.f40664a.f29544e.m35322c(z);
            return C8288b.m35365a(this.f40665b, false, null, false, z, a, AuthState.VALIDATION_REQUIRED, null, null, 199, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/auth/model/AuthResult;", "kotlin.jvm.PlatformType", "throwable", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.q$f */
    static final class C12590f<T, R> implements Func1<Throwable, Single<? extends C8288b>> {
        /* renamed from: a */
        final /* synthetic */ C8288b f40666a;

        C12590f(C8288b c8288b) {
            this.f40666a = c8288b;
        }

        public /* synthetic */ Object call(Object obj) {
            return m49745a((Throwable) obj);
        }

        /* renamed from: a */
        public final Single<C8288b> m49745a(Throwable th) {
            C0001a.b(th, "Error fetching user profile during auth process", new Object[0]);
            return Single.a(this.f40666a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "authResult", "Lcom/tinder/auth/model/AuthResult;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.q$c */
    static final class C13617c<T> implements Action1<C8288b> {
        /* renamed from: a */
        final /* synthetic */ C8283q f43393a;

        C13617c(C8283q c8283q) {
            this.f43393a = c8283q;
        }

        public /* synthetic */ void call(Object obj) {
            m53103a((C8288b) obj);
        }

        /* renamed from: a */
        public final void m53103a(C8288b c8288b) {
            for (LoginObserver loginObserver : this.f43393a.f29546g) {
                if (c8288b.m35367a()) {
                    C2668g.a(c8288b, "authResult");
                    loginObserver.onLoggedIn(c8288b);
                } else {
                    loginObserver.onVerificationRequired();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012*\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/auth/model/AuthResult;", "kotlin.jvm.PlatformType", "source", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.q$d */
    static final class C13618d<T, R> implements Observable$Transformer<C8288b, C8288b> {
        /* renamed from: a */
        final /* synthetic */ C8283q f43394a;

        C13618d(C8283q c8283q) {
            this.f43394a = c8283q;
        }

        public /* synthetic */ Object call(Object obj) {
            return m53104a((Observable) obj);
        }

        /* renamed from: a */
        public final Observable<C8288b> m53104a(Observable<C8288b> observable) {
            return observable.h(new Func1<T, Observable<? extends R>>() {
                public /* synthetic */ Object call(Object obj) {
                    return m49743a((C8288b) obj);
                }

                /* renamed from: a */
                public final Observable<C8288b> m49743a(C8288b c8288b) {
                    if (c8288b.m35374h() == null) {
                        return Observable.a(c8288b);
                    }
                    C8283q c8283q = this.f43394a;
                    C2668g.a(c8288b, "authResult");
                    return c8283q.m35353a(c8288b);
                }
            });
        }
    }

    @Inject
    public C8283q(@NotNull AuthRequestFactory authRequestFactory, @NotNull C8279j c8279j, @NotNull C10935e c10935e, @NotNull C8272a c8272a, @NotNull C8273d c8273d, @NotNull Set<LoginObserver> set) {
        C2668g.b(authRequestFactory, "authRequestFactory");
        C2668g.b(c8279j, "mAuthInteractor");
        C2668g.b(c10935e, "fetchUserProfile");
        C2668g.b(c8272a, "validationStateProvider");
        C2668g.b(c8273d, "persistLoginCredentials");
        C2668g.b(set, "loginObservers");
        this.f29541b = authRequestFactory;
        this.f29542c = c8279j;
        this.f29543d = c10935e;
        this.f29544e = c8272a;
        this.f29545f = c8273d;
        this.f29546g = set;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C8288b> m35357a(@NotNull C8290e c8290e) {
        C2668g.b(c8290e, "request");
        if (c8290e.m35379b() != null) {
            c8290e = RxJavaInteropExtKt.toV1Completable(this.f29545f.m35324a(c8290e.m35379b())).b(m35352a(c8290e.m35378a(), c8290e.m35379b()));
        } else {
            c8290e = m35351a(c8290e.m35378a());
        }
        c8290e = c8290e.b(new C13617c(this));
        C2668g.a(c8290e, "if (request.loginCredent…}\n            }\n        }");
        return c8290e;
    }

    /* renamed from: a */
    private final Observable<C8288b> m35351a(AuthType authType) {
        authType = Observable.a(new C8282a(this, authType)).h(new C12587b(this)).a(this.f29540a);
        C2668g.a(authType, "Observable.fromCallable …rVerificationTransformer)");
        return authType;
    }

    /* renamed from: a */
    private final Observable<C8288b> m35352a(AuthType authType, C14976d c14976d) {
        if (c14976d instanceof C16749e) {
            authType = Observable.a(C8288b.f29551a.m35363a(authType));
            C2668g.a(authType, "Observable.just(AuthResu…ardingRequired(authType))");
            return authType;
        } else if (c14976d instanceof C16748b) {
            return m35351a(authType);
        } else {
            if (c14976d instanceof C16747a) {
                authType = Observable.a(C8288b.f29551a.m35364a(authType, ((C16747a) c14976d).a()));
                C2668g.a(authType, "Observable.just(\n       …          )\n            )");
                return authType;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final Observable<C8288b> m35353a(C8288b c8288b) {
        c8288b = this.f29543d.execute().d(new C12589e(this, c8288b)).f(new C12590f(c8288b)).a();
        C2668g.a(c8288b, "fetchUserProfile\n       …          .toObservable()");
        return c8288b;
    }
}
