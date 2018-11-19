package com.tinder.typingindicator.api;

import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator;
import com.tinder.typingindicator.p440f.C18250c;
import com.tinder.typingindicator.p440f.C18256j;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/typingindicator/api/TypingIndicatorApiClient;", "", "keepAliveScarletApi", "Lcom/tinder/api/keepalive/KeepAliveScarletApi;", "keepAliveTypingIndicatorToTypingIndicator", "Lcom/tinder/typingindicator/mapperfunctions/KeepAliveTypingIndicatorToTypingIndicator;", "typingIndicatorToKeepAliveTypingIndicator", "Lcom/tinder/typingindicator/mapperfunctions/TypingIndicatorToKeepAliveTypingIndicator;", "(Lcom/tinder/api/keepalive/KeepAliveScarletApi;Lcom/tinder/typingindicator/mapperfunctions/KeepAliveTypingIndicatorToTypingIndicator;Lcom/tinder/typingindicator/mapperfunctions/TypingIndicatorToKeepAliveTypingIndicator;)V", "observeTypingIndicator", "Lio/reactivex/Flowable;", "Lcom/tinder/typingindicator/model/TypingIndicator;", "sendTypingIndicator", "Lio/reactivex/Completable;", "typingIndicator", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.api.a */
public final class C15314a {
    /* renamed from: a */
    private final KeepAliveScarletApi f47526a;
    /* renamed from: b */
    private final C18250c f47527b;
    /* renamed from: c */
    private final C18256j f47528c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "keepAliveTypingIndicator", "Lcom/tinder/proto/keepalive/KeepAliveTypingIndicator$TypingIndicator;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.api.a$a */
    static final class C17158a<T, R> implements Function<TypingIndicator, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C15314a f52686a;

        C17158a(C15314a c15314a) {
            this.f52686a = c15314a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63033a((TypingIndicator) obj);
        }

        /* renamed from: a */
        public final C3956a m63033a(@NotNull final TypingIndicator typingIndicator) {
            C2668g.b(typingIndicator, "keepAliveTypingIndicator");
            return C3956a.a(new Action() {
                public final void run() {
                    KeepAliveScarletApi a = this.f52686a.f47526a;
                    TypingIndicator typingIndicator = typingIndicator;
                    C2668g.a(typingIndicator, "keepAliveTypingIndicator");
                    a.sendTypingIndicator(typingIndicator);
                }
            });
        }
    }

    @Inject
    public C15314a(@NotNull KeepAliveScarletApi keepAliveScarletApi, @NotNull C18250c c18250c, @NotNull C18256j c18256j) {
        C2668g.b(keepAliveScarletApi, "keepAliveScarletApi");
        C2668g.b(c18250c, "keepAliveTypingIndicatorToTypingIndicator");
        C2668g.b(c18256j, "typingIndicatorToKeepAliveTypingIndicator");
        this.f47526a = keepAliveScarletApi;
        this.f47527b = c18250c;
        this.f47528c = c18256j;
    }

    @NotNull
    /* renamed from: a */
    public final C3957b<com.tinder.typingindicator.model.TypingIndicator> m57495a() {
        C3957b<com.tinder.typingindicator.model.TypingIndicator> f = this.f47526a.observeTypingIndicator().f(new C17159b(new TypingIndicatorApiClient$observeTypingIndicator$1(this.f47527b)));
        C2668g.a(f, "keepAliveScarletApi\n    …oTypingIndicator::invoke)");
        return f;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m57494a(@NotNull com.tinder.typingindicator.model.TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "typingIndicator");
        typingIndicator = C3960g.a(typingIndicator).e(new C17159b(new TypingIndicatorApiClient$sendTypingIndicator$1(this.f47528c))).d(new C17158a(this));
        C2668g.a(typingIndicator, "Single.just(typingIndica…          }\n            }");
        return typingIndicator;
    }
}
