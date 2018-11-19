package com.tinder.typingindicator.repository;

import com.tinder.data.p222i.C8669a;
import com.tinder.domain.typingindicator.TypingIndicatorConfig;
import com.tinder.typingindicator.api.C15314a;
import com.tinder.typingindicator.model.TypingIndicator;
import com.tinder.typingindicator.p441g.C15321a;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.processors.C18430a;
import io.reactivex.processors.PublishProcessor;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\u0006\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u001eR\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/typingindicator/repository/TypingIndicatorDataRepository;", "Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;", "typingIndicatorConfigDataStore", "Lcom/tinder/data/typingindicator/TypingIndicatorConfigDataStore;", "typingIndicatorApiClient", "Lcom/tinder/typingindicator/api/TypingIndicatorApiClient;", "typingIndicatorDataStore", "Lcom/tinder/typingindicator/store/TypingIndicatorDataStore;", "(Lcom/tinder/data/typingindicator/TypingIndicatorConfigDataStore;Lcom/tinder/typingindicator/api/TypingIndicatorApiClient;Lcom/tinder/typingindicator/store/TypingIndicatorDataStore;)V", "interruptionProcessor", "Lio/reactivex/processors/FlowableProcessor;", "", "kotlin.jvm.PlatformType", "addTypingIndicator", "Lio/reactivex/Completable;", "typingIndicator", "Lcom/tinder/typingindicator/model/TypingIndicator;", "interruptTypingIndicatorForMatchId", "", "matchId", "observeConfig", "Lio/reactivex/Flowable;", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig;", "observeTypingIndicatorForMatchId", "observeTypingIndicatorInterruptionForMatchId", "observeTypingIndicatorInterruptionForMatchId$data_release", "observeTypingIndicatorsFromApiClient", "observeTypingIndicatorsFromApiClient$data_release", "updateTypingIndicator", "newTypingIndicator", "updateTypingIndicator$data_release", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.repository.c */
public final class C17168c implements TypingIndicatorRepository {
    /* renamed from: a */
    private final C18430a<String> f52700a = PublishProcessor.m67663q().m66603u();
    /* renamed from: b */
    private final C8669a f52701b;
    /* renamed from: c */
    private final C15314a f52702c;
    /* renamed from: d */
    private final C15321a f52703d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.repository.c$a */
    static final class C17166a<T> implements Predicate<String> {
        /* renamed from: a */
        final /* synthetic */ String f52698a;

        C17166a(String str) {
            this.f52698a = str;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m63037a((String) obj);
        }

        /* renamed from: a */
        public final boolean m63037a(@NotNull String str) {
            C2668g.b(str, "it");
            return C2668g.a(str, this.f52698a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.repository.c$b */
    static final class C17167b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17167b f52699a = new C17167b();

        C17167b() {
        }

        /* renamed from: a */
        public final void m63038a(@NotNull String str) {
            C2668g.b(str, "it");
        }

        public /* synthetic */ Object apply(Object obj) {
            m63038a((String) obj);
            return C15813i.f49016a;
        }
    }

    @Inject
    public C17168c(@NotNull C8669a c8669a, @NotNull C15314a c15314a, @NotNull C15321a c15321a) {
        C2668g.b(c8669a, "typingIndicatorConfigDataStore");
        C2668g.b(c15314a, "typingIndicatorApiClient");
        C2668g.b(c15321a, "typingIndicatorDataStore");
        this.f52701b = c8669a;
        this.f52702c = c15314a;
        this.f52703d = c15321a;
    }

    @NotNull
    public C3957b<TypingIndicatorConfig> observeConfig() {
        return this.f52701b.a();
    }

    @NotNull
    public C3957b<TypingIndicator> observeTypingIndicatorForMatchId(@NotNull String str) {
        C2668g.b(str, "matchId");
        return this.f52703d.m57499a(str);
    }

    @NotNull
    public C3956a addTypingIndicator(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "typingIndicator");
        return this.f52702c.m57494a(typingIndicator);
    }

    public void interruptTypingIndicatorForMatchId(@NotNull String str) {
        C2668g.b(str, "matchId");
        this.f52700a.onNext(str);
    }

    @NotNull
    /* renamed from: a */
    public final C3957b<C15813i> m63040a(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = this.f52700a.a(new C17166a(str)).f(C17167b.f52699a).g();
        C2668g.a(str, "interruptionProcessor\n  …nit }\n            .hide()");
        return str;
    }

    /* renamed from: a */
    public final void m63041a(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "newTypingIndicator");
        this.f52703d.m57500a(typingIndicator);
    }

    @NotNull
    /* renamed from: a */
    public final C3957b<TypingIndicator> m63039a() {
        return this.f52702c.m57495a();
    }
}
