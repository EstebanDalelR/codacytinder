package com.tinder.loops.ui.p286c;

import android.arch.paging.C3981d;
import android.arch.paging.C3981d.C0042a;
import android.arch.paging.C3981d.C0043e;
import android.arch.paging.C3981d.C0044f;
import android.arch.paging.C3981d.C2698c;
import com.facebook.ads.AdError;
import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.loops.engine.extraction.VideoFrameExtractor;
import com.tinder.loops.engine.extraction.p281c.C9794b;
import com.tinder.loops.engine.extraction.p281c.C9796d;
import com.tinder.loops.engine.extraction.p281c.C9798f;
import com.tinder.loops.engine.extraction.retriever.VideoMetaExtractor;
import com.tinder.p258h.C9694a;
import io.reactivex.C3960g;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0016J$\u0010\u001a\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0016J$\u0010\u001b\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/tinder/loops/ui/paging/FrameDataSource;", "Landroid/arch/paging/ItemKeyedDataSource;", "", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "videoFrameExtractor", "Lcom/tinder/loops/engine/extraction/VideoFrameExtractor;", "videoMetaExtractor", "Lcom/tinder/loops/engine/extraction/retriever/VideoMetaExtractor;", "url", "", "maxDimension", "", "(Lcom/tinder/loops/engine/extraction/VideoFrameExtractor;Lcom/tinder/loops/engine/extraction/retriever/VideoMetaExtractor;Ljava/lang/String;I)V", "createExtractRequest", "Lcom/tinder/loops/engine/extraction/model/FrameExtractionRequest;", "startPosition", "pageSize", "getKey", "item", "(Lcom/tinder/loops/engine/common/model/VideoFrame;)Ljava/lang/Long;", "loadAfter", "", "params", "Landroid/arch/paging/ItemKeyedDataSource$LoadParams;", "callback", "Landroid/arch/paging/ItemKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroid/arch/paging/ItemKeyedDataSource$LoadInitialParams;", "Landroid/arch/paging/ItemKeyedDataSource$LoadInitialCallback;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.ui.c.a */
public final class C14047a extends C3981d<Long, C9770a> {
    /* renamed from: a */
    private final VideoFrameExtractor f44514a;
    /* renamed from: b */
    private final VideoMetaExtractor f44515b;
    /* renamed from: c */
    private final String f44516c;
    /* renamed from: d */
    private final int f44517d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/loops/engine/extraction/model/VideoMeta;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.c.a$d */
    static final class C9806d<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C14047a f32499a;

        C9806d(C14047a c14047a) {
            this.f32499a = c14047a;
        }

        public /* synthetic */ Object call() {
            return m40427a();
        }

        @NotNull
        /* renamed from: a */
        public final C9798f m40427a() {
            return this.f32499a.f44515b.extractVideoInfo(this.f32499a.f44516c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.c.a$a */
    static final class C11954a implements Action {
        /* renamed from: a */
        final /* synthetic */ C14047a f38886a;

        C11954a(C14047a c14047a) {
            this.f38886a = c14047a;
        }

        public final void run() {
            this.f38886a.f44514a.release();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.c.a$b */
    static final class C11955b<T> implements Consumer<C9794b> {
        /* renamed from: a */
        final /* synthetic */ C0042a f38887a;

        C11955b(C0042a c0042a) {
            this.f38887a = c0042a;
        }

        public /* synthetic */ void accept(Object obj) {
            m47989a((C9794b) obj);
        }

        /* renamed from: a */
        public final void m47989a(C9794b c9794b) {
            this.f38887a.a(c9794b.m40380a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.c.a$c */
    static final class C11956c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11956c f38888a = new C11956c();

        C11956c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47990a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47990a(Throwable th) {
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "videoInfo", "Lcom/tinder/loops/engine/extraction/model/VideoMeta;", "videoContext", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.c.a$e */
    static final class C11957e<T1, T2, R> implements BiFunction<C9798f, C9794b, Pair<? extends Long, ? extends List<? extends C9770a>>> {
        /* renamed from: a */
        public static final C11957e f38889a = new C11957e();

        C11957e() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m47991a((C9798f) obj, (C9794b) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<Long, List<C9770a>> m47991a(@NotNull C9798f c9798f, @NotNull C9794b c9794b) {
            C2668g.b(c9798f, "videoInfo");
            C2668g.b(c9794b, "videoContext");
            return new Pair(Long.valueOf(TimeUnit.SECONDS.convert(c9798f.m40393c(), TimeUnit.MILLISECONDS)), c9794b.m40380a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.c.a$f */
    static final class C11958f implements Action {
        /* renamed from: a */
        final /* synthetic */ C14047a f38890a;

        C11958f(C14047a c14047a) {
            this.f38890a = c14047a;
        }

        public final void run() {
            this.f38890a.f44514a.release();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.c.a$g */
    static final class C11959g<T> implements Consumer<Pair<? extends Long, ? extends List<? extends C9770a>>> {
        /* renamed from: a */
        final /* synthetic */ C2698c f38891a;

        C11959g(C2698c c2698c) {
            this.f38891a = c2698c;
        }

        public /* synthetic */ void accept(Object obj) {
            m47992a((Pair) obj);
        }

        /* renamed from: a */
        public final void m47992a(Pair<Long, ? extends List<C9770a>> pair) {
            this.f38891a.a((List) pair.b(), 0, Math.max((int) ((Number) pair.a()).longValue(), ((List) pair.b()).size()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.c.a$h */
    static final class C11960h<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11960h f38892a = new C11960h();

        C11960h() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47993a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47993a(Throwable th) {
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    /* renamed from: b */
    public void m53757b(@NotNull C0044f<Long> c0044f, @NotNull C0042a<C9770a> c0042a) {
        C2668g.b(c0044f, "params");
        C2668g.b(c0042a, "callback");
    }

    public C14047a(@NotNull VideoFrameExtractor videoFrameExtractor, @NotNull VideoMetaExtractor videoMetaExtractor, @NotNull String str, int i) {
        C2668g.b(videoFrameExtractor, "videoFrameExtractor");
        C2668g.b(videoMetaExtractor, "videoMetaExtractor");
        C2668g.b(str, "url");
        this.f44514a = videoFrameExtractor;
        this.f44515b = videoMetaExtractor;
        this.f44516c = str;
        this.f44517d = i;
    }

    /* renamed from: a */
    public void m53755a(@NotNull C0043e<Long> c0043e, @NotNull C2698c<C9770a> c2698c) {
        C2668g.b(c0043e, "params");
        C2668g.b(c2698c, "callback");
        C3960g.c(new C9806d(this)).a(this.f44514a.observeExtractedFrameContext(m53749a(0, (long) c0043e.f95b)), C11957e.f38889a).b(new C11958f(this)).a(new C11959g(c2698c), (Consumer) C11960h.f38892a);
    }

    /* renamed from: a */
    public void m53756a(@NotNull C0044f<Long> c0044f, @NotNull C0042a<C9770a> c0042a) {
        C2668g.b(c0044f, "params");
        C2668g.b(c0042a, "callback");
        this.f44514a.observeExtractedFrameContext(m53749a(((Number) c0044f.f97a).longValue() + ((long) 1000), (long) c0044f.f98b)).b(new C11954a(this)).a(new C11955b(c0042a), (Consumer) C11956c.f38888a);
    }

    @NotNull
    /* renamed from: a */
    public Long m53753a(@NotNull C9770a c9770a) {
        C2668g.b(c9770a, "item");
        return Long.valueOf(TimeUnit.MILLISECONDS.convert(c9770a.m40315b(), TimeUnit.MICROSECONDS));
    }

    /* renamed from: a */
    private final C9796d m53749a(long j, long j2) {
        return new C9796d(j, AdError.NETWORK_ERROR_CODE, j2, this.f44517d, this.f44516c);
    }
}
