package com.tinder.bitmoji.presenter;

import com.tinder.bitmoji.BitmojiAuthStatus;
import com.tinder.bitmoji.C10376d;
import com.tinder.bitmoji.C10380k;
import com.tinder.bitmoji.repository.BitmojiImageUrlRepository;
import com.tinder.bitmoji.target.BitmojiIconTarget;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0006\u0010\u0013\u001a\u00020\u0011J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/bitmoji/presenter/BitmojiIconPresenter;", "", "bitmojiImageUrlRepository", "Lcom/tinder/bitmoji/repository/BitmojiImageUrlRepository;", "observeBitmojiAuthStatus", "Lcom/tinder/bitmoji/ObserveBitmojiAuthStatus;", "checkBitmojiConnected", "Lcom/tinder/bitmoji/CheckBitmojiConnected;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "(Lcom/tinder/bitmoji/repository/BitmojiImageUrlRepository;Lcom/tinder/bitmoji/ObserveBitmojiAuthStatus;Lcom/tinder/bitmoji/CheckBitmojiConnected;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/bitmoji/target/BitmojiIconTarget;", "dropTarget", "", "observeBitmojiimageUrl", "onViewVisible", "setInitialIcon", "syncBitmojiImageUrl", "takeTarget", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.presenter.a */
public final class C8329a {
    /* renamed from: a */
    private BitmojiIconTarget f29610a;
    /* renamed from: b */
    private final C17356a f29611b = new C17356a();
    /* renamed from: c */
    private final BitmojiImageUrlRepository f29612c;
    /* renamed from: d */
    private final C10380k f29613d;
    /* renamed from: e */
    private final C10376d f29614e;
    /* renamed from: f */
    private final C15679f f29615f;
    /* renamed from: g */
    private final C15679f f29616g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "imageUrlOptional", "Ljava8/util/Optional;", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.presenter.a$a */
    static final class C10381a<T> implements Consumer<Optional<String>> {
        /* renamed from: a */
        final /* synthetic */ C8329a f33865a;

        C10381a(C8329a c8329a) {
            this.f33865a = c8329a;
        }

        public /* synthetic */ void accept(Object obj) {
            m42207a((Optional) obj);
        }

        /* renamed from: a */
        public final void m42207a(Optional<String> optional) {
            C2668g.a(optional, "imageUrlOptional");
            if (optional.c()) {
                BitmojiIconTarget b = this.f33865a.f29610a;
                if (b != null) {
                    optional = optional.b();
                    C2668g.a(optional, "imageUrlOptional.get()");
                    b.showBitmojiIcon((String) optional);
                    return;
                }
                return;
            }
            optional = this.f33865a.f29610a;
            if (optional != null) {
                optional.showDefaultBitmojiIcon();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.presenter.a$b */
    static final class C10382b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C8329a f33866a;

        C10382b(C8329a c8329a) {
            this.f33866a = c8329a;
        }

        public /* synthetic */ void accept(Object obj) {
            m42208a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42208a(Throwable th) {
            BitmojiIconTarget b = this.f33866a.f29610a;
            if (b != null) {
                b.showDefaultBitmojiIcon();
            }
            C0001a.b(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.presenter.a$c */
    static final class C10383c implements Action {
        /* renamed from: a */
        public static final C10383c f33867a = new C10383c();

        C10383c() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "bitmojiAuthStatus", "Lcom/tinder/bitmoji/BitmojiAuthStatus;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.presenter.a$d */
    static final class C10384d<T, R> implements Function<BitmojiAuthStatus, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C8329a f33868a;

        C10384d(C8329a c8329a) {
            this.f33868a = c8329a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m42209a((BitmojiAuthStatus) obj);
        }

        /* renamed from: a */
        public final CompletableSource m42209a(@NotNull BitmojiAuthStatus bitmojiAuthStatus) {
            C2668g.b(bitmojiAuthStatus, "bitmojiAuthStatus");
            if (bitmojiAuthStatus == BitmojiAuthStatus.CONNECTED) {
                return this.f33868a.f29612c.syncImageUrl();
            }
            return C3956a.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.presenter.a$e */
    static final class C10385e implements Action {
        /* renamed from: a */
        public static final C10385e f33869a = new C10385e();

        C10385e() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.presenter.a$f */
    static final class C10386f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C8329a f33870a;

        C10386f(C8329a c8329a) {
            this.f33870a = c8329a;
        }

        public /* synthetic */ void accept(Object obj) {
            m42210a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42210a(Throwable th) {
            BitmojiIconTarget b = this.f33870a.f29610a;
            if (b != null) {
                b.showDefaultBitmojiIcon();
            }
            C0001a.b(th);
        }
    }

    @Inject
    public C8329a(@NotNull BitmojiImageUrlRepository bitmojiImageUrlRepository, @NotNull C10380k c10380k, @NotNull C10376d c10376d, @NotNull @IoScheduler C15679f c15679f, @NotNull @MainThreadScheduler C15679f c15679f2) {
        C2668g.b(bitmojiImageUrlRepository, "bitmojiImageUrlRepository");
        C2668g.b(c10380k, "observeBitmojiAuthStatus");
        C2668g.b(c10376d, "checkBitmojiConnected");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(c15679f2, "mainThreadScheduler");
        this.f29612c = bitmojiImageUrlRepository;
        this.f29613d = c10380k;
        this.f29614e = c10376d;
        this.f29615f = c15679f;
        this.f29616g = c15679f2;
    }

    /* renamed from: a */
    public final void m35443a(@NotNull BitmojiIconTarget bitmojiIconTarget) {
        C2668g.b(bitmojiIconTarget, "target");
        this.f29610a = bitmojiIconTarget;
        m35440d();
        m35439c();
        m35441e();
    }

    /* renamed from: a */
    public final void m35442a() {
        this.f29610a = (BitmojiIconTarget) null;
        this.f29611b.dispose();
    }

    /* renamed from: b */
    public final void m35444b() {
        m35441e();
    }

    /* renamed from: c */
    private final void m35439c() {
        this.f29611b.add(this.f29613d.execute().flatMapCompletable(new C10384d(this)).b(this.f29615f).a(this.f29616g).a(C10385e.f33869a, new C10386f(this)));
    }

    /* renamed from: d */
    private final void m35440d() {
        this.f29611b.add(this.f29612c.observeImageUrl().distinctUntilChanged().subscribeOn(this.f29615f).observeOn(this.f29616g).subscribe(new C10381a(this), new C10382b(this)));
    }

    /* renamed from: e */
    private final void m35441e() {
        if (this.f29614e.m42204a().booleanValue()) {
            C3956a b = this.f29612c.syncImageUrl().b(this.f29615f);
            Action action = C10383c.f33867a;
            Function1 function1 = BitmojiIconPresenter$setInitialIcon$2.f45099a;
            if (function1 != null) {
                function1 = new C10387b(function1);
            }
            this.f29611b.add(b.a(action, (Consumer) function1));
            return;
        }
        BitmojiIconTarget bitmojiIconTarget = this.f29610a;
        if (bitmojiIconTarget != null) {
            bitmojiIconTarget.showDefaultBitmojiIcon();
        }
    }
}
