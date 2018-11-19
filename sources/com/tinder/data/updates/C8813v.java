package com.tinder.data.updates;

import com.tinder.api.TinderApi;
import com.tinder.api.model.updates.Updates;
import com.tinder.api.model.updates.UpdatesRequestBody;
import com.tinder.domain.boost.repository.BoostCursorRepository;
import com.tinder.domain.boost.repository.BoostStatusRepository;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import com.tinder.domain.updates.model.UpdateSignal;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/data/updates/UpdatesRequestConfigurator;", "", "lastActivityDateRepository", "Lcom/tinder/domain/common/repository/LastActivityDateRepository;", "boostStatusRepository", "Lcom/tinder/domain/boost/repository/BoostStatusRepository;", "boostCursorRepository", "Lcom/tinder/domain/boost/repository/BoostCursorRepository;", "api", "Lcom/tinder/api/TinderApi;", "(Lcom/tinder/domain/common/repository/LastActivityDateRepository;Lcom/tinder/domain/boost/repository/BoostStatusRepository;Lcom/tinder/domain/boost/repository/BoostCursorRepository;Lcom/tinder/api/TinderApi;)V", "apiUpdates", "Lio/reactivex/Single;", "Lcom/tinder/api/model/updates/Updates;", "updatesRequestBody", "Lcom/tinder/api/model/updates/UpdatesRequestBody;", "createUpdatesRequestBody", "lastActivityDate", "Lorg/joda/time/DateTime;", "updateSignal", "Lcom/tinder/domain/updates/model/UpdateSignal;", "requestUpdates", "Lcom/tinder/data/updates/UpdatesRequestContext;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.v */
public final class C8813v {
    /* renamed from: a */
    private final LastActivityDateRepository f30909a;
    /* renamed from: b */
    private final BoostStatusRepository f30910b;
    /* renamed from: c */
    private final BoostCursorRepository f30911c;
    /* renamed from: d */
    private final TinderApi f30912d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/api/model/updates/UpdatesRequestBody;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.v$d */
    static final class C8812d<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C8813v f30907a;
        /* renamed from: b */
        final /* synthetic */ UpdateSignal f30908b;

        C8812d(C8813v c8813v, UpdateSignal updateSignal) {
            this.f30907a = c8813v;
            this.f30908b = updateSignal;
        }

        public /* synthetic */ Object call() {
            return m37508a();
        }

        @NotNull
        /* renamed from: a */
        public final UpdatesRequestBody m37508a() {
            return this.f30907a.m37511a(null, this.f30908b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/api/model/updates/Updates;", "kotlin.jvm.PlatformType", "isBoosting", "", "boostCursor", "", "apply", "(Ljava/lang/Boolean;Ljava/lang/String;)Lio/reactivex/Single;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.v$a */
    static final class C11070a<T1, T2, R> implements BiFunction<Boolean, String, C3960g<Updates>> {
        /* renamed from: a */
        final /* synthetic */ C8813v f35843a;
        /* renamed from: b */
        final /* synthetic */ UpdatesRequestBody f35844b;

        C11070a(C8813v c8813v, UpdatesRequestBody updatesRequestBody) {
            this.f35843a = c8813v;
            this.f35844b = updatesRequestBody;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m43745a((Boolean) obj, (String) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<Updates> m43745a(@NotNull Boolean bool, @NotNull String str) {
            C2668g.b(bool, "isBoosting");
            C2668g.b(str, "boostCursor");
            bool = this.f35843a.f30912d.getUpdates(this.f35844b, bool.booleanValue(), str);
            C2668g.a(bool, "api.getUpdates(updatesRe… isBoosting, boostCursor)");
            return RxJavaInteropExtKt.toV2Single(bool);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/api/model/updates/Updates;", "updatesSingle", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.v$b */
    static final class C11071b<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        public static final C11071b f35845a = new C11071b();

        C11071b() {
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<Updates> m43746a(@NotNull C3960g<Updates> c3960g) {
            C2668g.b(c3960g, "updatesSingle");
            return c3960g;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43746a((C3960g) obj);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/api/model/updates/UpdatesRequestBody;", "it", "Lorg/joda/time/DateTime;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.v$c */
    static final class C11072c<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8813v f35846a;
        /* renamed from: b */
        final /* synthetic */ UpdateSignal f35847b;

        C11072c(C8813v c8813v, UpdateSignal updateSignal) {
            this.f35846a = c8813v;
            this.f35847b = updateSignal;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43747a((DateTime) obj);
        }

        @NotNull
        /* renamed from: a */
        public final UpdatesRequestBody m43747a(@NotNull DateTime dateTime) {
            C2668g.b(dateTime, "it");
            return this.f35846a.m37511a(dateTime, this.f35847b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/data/updates/UpdatesRequestContext;", "kotlin.jvm.PlatformType", "updatesRequestBody", "Lcom/tinder/api/model/updates/UpdatesRequestBody;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.v$e */
    static final class C11074e<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C8813v f35849a;

        C11074e(C8813v c8813v) {
            this.f35849a = c8813v;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43749a((UpdatesRequestBody) obj);
        }

        /* renamed from: a */
        public final C3960g<C8815y> m43749a(@NotNull final UpdatesRequestBody updatesRequestBody) {
            C2668g.b(updatesRequestBody, "updatesRequestBody");
            return this.f35849a.m37512a(updatesRequestBody).e(new Function<T, R>() {
                public /* synthetic */ Object apply(Object obj) {
                    return m43748a((Updates) obj);
                }

                @NotNull
                /* renamed from: a */
                public final C8815y m43748a(@NotNull Updates updates) {
                    C2668g.b(updates, "updates");
                    UpdatesRequestBody updatesRequestBody = updatesRequestBody;
                    C2668g.a(updatesRequestBody, "updatesRequestBody");
                    return new C8815y(updates, updatesRequestBody);
                }
            });
        }
    }

    @Inject
    public C8813v(@NotNull LastActivityDateRepository lastActivityDateRepository, @NotNull BoostStatusRepository boostStatusRepository, @NotNull BoostCursorRepository boostCursorRepository, @NotNull TinderApi tinderApi) {
        C2668g.b(lastActivityDateRepository, "lastActivityDateRepository");
        C2668g.b(boostStatusRepository, "boostStatusRepository");
        C2668g.b(boostCursorRepository, "boostCursorRepository");
        C2668g.b(tinderApi, "api");
        this.f30909a = lastActivityDateRepository;
        this.f30910b = boostStatusRepository;
        this.f30911c = boostCursorRepository;
        this.f30912d = tinderApi;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<C8815y> m37514a(@NotNull UpdateSignal updateSignal) {
        C2668g.b(updateSignal, "updateSignal");
        updateSignal = this.f30909a.getLastActivityDate().f(new C11072c(this, updateSignal)).a(C3960g.c(new C8812d(this, updateSignal))).a(new C11074e(this));
        C2668g.a(updateSignal, "lastActivityDateReposito…      }\n                }");
        return updateSignal;
    }

    /* renamed from: a */
    private final C3960g<Updates> m37512a(UpdatesRequestBody updatesRequestBody) {
        updatesRequestBody = C3960g.a(this.f30910b.isBoosting(), this.f30911c.getBoostCursor(), new C11070a(this, updatesRequestBody)).a(C11071b.f35845a);
        C2668g.a(updatesRequestBody, "Single.zip(\n            …Single -> updatesSingle }");
        return updatesRequestBody;
    }

    /* renamed from: a */
    private final UpdatesRequestBody m37511a(DateTime dateTime, UpdateSignal updateSignal) {
        String str = null;
        updateSignal = updateSignal.isFromNudge() != null ? Boolean.valueOf(true) : null;
        if (dateTime != null) {
            dateTime = dateTime.a(C8814w.f30913a);
            if (dateTime != null) {
                str = dateTime.toString();
            }
        }
        return new UpdatesRequestBody(updateSignal, str);
    }
}
