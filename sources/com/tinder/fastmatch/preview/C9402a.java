package com.tinder.fastmatch.preview;

import com.tinder.data.fastmatch.usecase.C10771d;
import com.tinder.domain.fastmatch.model.FastMatchConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.module.ViewScope;
import com.tinder.utils.RxUtils;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Single;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/fastmatch/preview/FastMatchPreviewFetcher;", "", "fetchFastMatchPreview", "Lcom/tinder/data/fastmatch/usecase/FetchFastMatchPreview;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "(Lcom/tinder/data/fastmatch/usecase/FetchFastMatchPreview;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;)V", "fetchFastMatchPreviewSubscription", "Lrx/Subscription;", "start", "", "startFetchingFastMatchPreview", "Lrx/Observable;", "", "fastMatchConfig", "Lcom/tinder/domain/fastmatch/model/FastMatchConfig;", "stop", "updatePreview", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
/* renamed from: com.tinder.fastmatch.preview.a */
public final class C9402a {
    /* renamed from: a */
    public static final C9401a f31526a = new C9401a();
    /* renamed from: e */
    private static final long f31527e = 0;
    /* renamed from: b */
    private Subscription f31528b;
    /* renamed from: c */
    private final C10771d f31529c;
    /* renamed from: d */
    private final FastMatchConfigProvider f31530d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/fastmatch/preview/FastMatchPreviewFetcher$Companion;", "", "()V", "INITIAL_FETCH_DELAY", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.preview.a$a */
    public static final class C9401a {
        private C9401a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/fastmatch/model/FastMatchConfig;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.preview.a$b */
    static final class C13204b<T, R> implements Func1<FastMatchConfig, Boolean> {
        /* renamed from: a */
        public static final C13204b f41907a = new C13204b();

        C13204b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51186a((FastMatchConfig) obj));
        }

        /* renamed from: a */
        public final boolean m51186a(FastMatchConfig fastMatchConfig) {
            return fastMatchConfig.isEnabled();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "", "kotlin.jvm.PlatformType", "tick", "call", "(Ljava/lang/Long;)Lrx/Single;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.preview.a$d */
    static final class C13205d<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C9402a f41908a;

        C13205d(C9402a c9402a) {
            this.f41908a = c9402a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51187a((Long) obj);
        }

        /* renamed from: a */
        public final Single<Long> m51187a(Long l) {
            return this.f41908a.f31529c.execute().b(l);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.preview.a$c */
    static final class C13942c<T> implements Action1<Object> {
        /* renamed from: a */
        public static final C13942c f44067a = new C13942c();

        C13942c() {
        }

        public final void call(Object obj) {
        }
    }

    @Inject
    public C9402a(@NotNull C10771d c10771d, @NotNull FastMatchConfigProvider fastMatchConfigProvider) {
        C2668g.b(c10771d, "fetchFastMatchPreview");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        this.f31529c = c10771d;
        this.f31530d = fastMatchConfigProvider;
    }

    /* renamed from: a */
    public final void m39350a() {
        if (!RxUtils.a(this.f31528b)) {
            Observable a = this.f31530d.observe().f(C13204b.f41907a).h().h(new C13206c(new FastMatchPreviewFetcher$start$2(this))).a(RxUtils.a());
            Action1 action1 = C13942c.f44067a;
            Function1 function1 = FastMatchPreviewFetcher$start$4.f45317a;
            if (function1 != null) {
                function1 = new C13943b(function1);
            }
            this.f31528b = a.a(action1, (Action1) function1);
        }
    }

    /* renamed from: b */
    public final void m39351b() {
        RxUtils.b(this.f31528b);
    }

    /* renamed from: c */
    public final void m39352c() {
        this.f31529c.execute();
    }

    /* renamed from: a */
    private final Observable<Long> m39348a(FastMatchConfig fastMatchConfig) {
        fastMatchConfig = Observable.a(f31527e, fastMatchConfig.getPreviewMinTimeInMillis(), TimeUnit.MILLISECONDS).j(new C13205d(this));
        C2668g.a(fastMatchConfig, "Observable.interval(INIT…).toSingleDefault(tick) }");
        return fastMatchConfig;
    }
}
