package com.tinder.data.superlikeable;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository.SkipRequestPendingException;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import java.util.concurrent.Callable;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameDataRepository;", "Lcom/tinder/domain/superlikeable/SuperLikeableGameRepository;", "dataStore", "Lcom/tinder/data/superlikeable/SuperLikeableGameDataStore;", "apiClient", "Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient;", "(Lcom/tinder/data/superlikeable/SuperLikeableGameDataStore;Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient;)V", "load", "Lrx/Single;", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "loadFromCache", "loadFromNetworkAndSave", "markGameAsSkipPending", "", "skipGame", "Lrx/Completable;", "superLikeOnRec", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.superlikeable.a */
public final class C11000a implements SuperLikeableGameRepository {
    /* renamed from: a */
    private final C8794b f35734a;
    /* renamed from: b */
    private final SuperLikeableGameApiClient f35735b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$c */
    static final class C8791c<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C11000a f30863a;

        C8791c(C11000a c11000a) {
            this.f30863a = c11000a;
        }

        public /* synthetic */ Object call() {
            return m37418a();
        }

        @NotNull
        /* renamed from: a */
        public final Optional<SuperLikeableGame> m37418a() {
            return this.f30863a.f35734a.m37424a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$g */
    static final class C8792g<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C11000a f30864a;

        C8792g(C11000a c11000a) {
            this.f30864a = c11000a;
        }

        public /* synthetic */ Object call() {
            return m37419a();
        }

        @NotNull
        /* renamed from: a */
        public final String m37419a() {
            return this.f30864a.f35734a.m37428c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$j */
    static final class C8793j<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C11000a f30865a;

        C8793j(C11000a c11000a) {
            this.f30865a = c11000a;
        }

        public /* synthetic */ Object call() {
            return m37420a();
        }

        @NotNull
        /* renamed from: a */
        public final String m37420a() {
            Optional a = this.f30865a.f35734a.m37424a();
            if (a.c()) {
                return ((SuperLikeableGame) a.b()).getTokenId();
            }
            throw new IllegalStateException("There should be a Game in cache".toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$a */
    static final class C13107a<T, R> implements Func1<Optional<SuperLikeableGame>, Boolean> {
        /* renamed from: a */
        public static final C13107a f41731a = new C13107a();

        C13107a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50966a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m50966a(Optional<SuperLikeableGame> optional) {
            C2668g.a(optional, "it");
            return optional.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "gameOptional", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$b */
    static final class C13108b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13108b f41732a = new C13108b();

        C13108b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50967a((Optional) obj);
        }

        /* renamed from: a */
        public final Optional<SuperLikeableGame> m50967a(Optional<SuperLikeableGame> optional) {
            C2668g.a(optional, "gameOptional");
            return (optional.c() && ((SuperLikeableGame) optional.b()).isPlayable()) ? optional : Optional.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "it", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$f */
    static final class C13109f<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C11000a f41733a;

        C13109f(C11000a c11000a) {
            this.f41733a = c11000a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50968a((SuperLikeableGame) obj);
        }

        /* renamed from: a */
        public final Optional<SuperLikeableGame> m50968a(SuperLikeableGame superLikeableGame) {
            C8794b b = this.f41733a.f35734a;
            C2668g.a(superLikeableGame, "it");
            b.m37425a(superLikeableGame);
            return Optional.a(superLikeableGame);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "token", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$h */
    static final class C13110h<T, R> implements Func1<String, Completable> {
        /* renamed from: a */
        final /* synthetic */ C11000a f41734a;

        C13110h(C11000a c11000a) {
            this.f41734a = c11000a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50969a((String) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m50969a(String str) {
            SuperLikeableGameApiClient a = this.f41734a.f35735b;
            C2668g.a(str, ManagerWebServices.PARAM_TOKEN);
            return a.m37415a(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "token", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$k */
    static final class C13111k<T, R> implements Func1<String, Completable> {
        /* renamed from: a */
        final /* synthetic */ C11000a f41735a;
        /* renamed from: b */
        final /* synthetic */ UserRec f41736b;

        C13111k(C11000a c11000a, UserRec userRec) {
            this.f41735a = c11000a;
            this.f41736b = userRec;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50970a((String) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m50970a(String str) {
            SuperLikeableGameApiClient a = this.f41735a.f35735b;
            C2668g.a(str, ManagerWebServices.PARAM_TOKEN);
            return a.m37416a(str, this.f41736b.getId(), String.valueOf(this.f41736b.getSNumber()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$d */
    static final class C13888d<T> implements Action1<Optional<SuperLikeableGame>> {
        /* renamed from: a */
        public static final C13888d f44015a = new C13888d();

        C13888d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53435a((Optional) obj);
        }

        /* renamed from: a */
        public final void m53435a(Optional<SuperLikeableGame> optional) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("loadFromCache() emitted ");
            stringBuilder.append(optional);
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$e */
    static final class C13889e<T> implements Action1<SuperLikeableGame> {
        /* renamed from: a */
        final /* synthetic */ C11000a f44016a;

        C13889e(C11000a c11000a) {
            this.f44016a = c11000a;
        }

        public /* synthetic */ void call(Object obj) {
            m53436a((SuperLikeableGame) obj);
        }

        /* renamed from: a */
        public final void m53436a(SuperLikeableGame superLikeableGame) {
            if (this.f44016a.f35734a.m37426a(superLikeableGame.getTokenId()) != null) {
                throw ((Throwable) new SkipRequestPendingException());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.a$i */
    static final class C13890i implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C11000a f44017a;

        C13890i(C11000a c11000a) {
            this.f44017a = c11000a;
        }

        public final void call() {
            this.f44017a.f35734a.m37427b();
        }
    }

    public C11000a(@NotNull C8794b c8794b, @NotNull SuperLikeableGameApiClient superLikeableGameApiClient) {
        C2668g.b(c8794b, "dataStore");
        C2668g.b(superLikeableGameApiClient, "apiClient");
        this.f35734a = c8794b;
        this.f35735b = superLikeableGameApiClient;
    }

    @NotNull
    public Single<Optional<SuperLikeableGame>> load() {
        Single<Optional<SuperLikeableGame>> a = Single.a(m43645a(), m43647b()).g(C13107a.f41731a).k(C13108b.f41732a).a();
        C2668g.a(a, "Single.concat(loadFromCa…              .toSingle()");
        return a;
    }

    @NotNull
    public Completable skipGame() {
        Completable b = m43648c().c(new C13110h(this)).b(new C13890i(this));
        C2668g.a(b, "markGameAsSkipPending()\n…esetSkipPendingStatus() }");
        return b;
    }

    @NotNull
    public Completable superLikeOnRec(@NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        userRec = Single.a(new C8793j(this)).c(new C13111k(this, userRec));
        C2668g.a(userRec, "Single.fromCallable {\n  …ber.toString())\n        }");
        return userRec;
    }

    /* renamed from: a */
    private final Single<Optional<SuperLikeableGame>> m43645a() {
        Single<Optional<SuperLikeableGame>> d = Single.a(new C8791c(this)).d(C13888d.f44015a);
        C2668g.a(d, "Single.fromCallable { da…omCache() emitted $it\") }");
        return d;
    }

    /* renamed from: b */
    private final Single<Optional<SuperLikeableGame>> m43647b() {
        Single<Optional<SuperLikeableGame>> d = this.f35735b.m37417a().d(new C13889e(this)).d(new C13109f(this));
        C2668g.a(d, "apiClient.load()\n       ….of(it)\n                }");
        return d;
    }

    /* renamed from: c */
    private final Single<String> m43648c() {
        Single<String> a = Single.a(new C8792g(this));
        C2668g.a(a, "Single.fromCallable {\n  …AsSkipPending()\n        }");
        return a;
    }
}
