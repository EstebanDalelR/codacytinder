package com.tinder.loops.engine.extraction.decoder.filter;

import com.tinder.loops.engine.extraction.p281c.C9792a;
import com.tinder.loops.engine.extraction.p281c.C9796d;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/loops/engine/extraction/decoder/filter/IntervalFrameFilter;", "Lcom/tinder/loops/engine/extraction/decoder/filter/DecodedFrameFilter;", "()V", "frameExtractionRequest", "Lcom/tinder/loops/engine/extraction/model/FrameExtractionRequest;", "apply", "Lorg/reactivestreams/Publisher;", "Lcom/tinder/loops/engine/extraction/model/DecodedFrameInfo;", "upstream", "Lio/reactivex/Flowable;", "bindExtractionParameters", "", "convertPresentationTimeToFrameNumber", "", "decodedFramePresentationTimeUS", "startExtractionTimeUS", "videoFrameExtractionIntervalUS", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.decoder.filter.a */
public final class C13374a implements DecodedFrameFilter {
    /* renamed from: a */
    private C9796d f42392a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/loops/engine/extraction/model/DecodedFrameInfo;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.extraction.decoder.filter.a$a */
    static final class C11945a<T> implements Predicate<C9792a> {
        /* renamed from: a */
        final /* synthetic */ C13374a f38878a;

        C11945a(C13374a c13374a) {
            this.f38878a = c13374a;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47981a((C9792a) obj);
        }

        /* renamed from: a */
        public final boolean m47981a(@NotNull C9792a c9792a) {
            C2668g.b(c9792a, "it");
            return c9792a.m40377a() >= C13374a.m51726a(this.f38878a).m40384a() ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/loops/engine/extraction/model/DecodedFrameInfo;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.extraction.decoder.filter.a$b */
    static final class C11946b<T, R> implements Function<T, K> {
        /* renamed from: a */
        final /* synthetic */ C13374a f38879a;

        C11946b(C13374a c13374a) {
            this.f38879a = c13374a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(m47982a((C9792a) obj));
        }

        /* renamed from: a */
        public final long m47982a(@NotNull C9792a c9792a) {
            C2668g.b(c9792a, "it");
            return this.f38879a.m51724a(c9792a.m40377a(), C13374a.m51726a(this.f38879a).m40384a(), C13374a.m51726a(this.f38879a).m40385b());
        }
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ C9796d m51726a(C13374a c13374a) {
        c13374a = c13374a.f42392a;
        if (c13374a == null) {
            C2668g.b("frameExtractionRequest");
        }
        return c13374a;
    }

    public void bindExtractionParameters(@NotNull C9796d c9796d) {
        C2668g.b(c9796d, "frameExtractionRequest");
        this.f42392a = c9796d;
        c9796d = (c9796d.m40386c() <= 0 || c9796d.m40385b() <= 0 || c9796d.m40384a() < 0) ? null : true;
        if (c9796d == null) {
            throw new IllegalStateException("Total Frames To Extract and interval must be greater than zero and start time must be positive".toString());
        }
    }

    @NotNull
    public Publisher<C9792a> apply(@NotNull C3957b<C9792a> c3957b) {
        C2668g.b(c3957b, "upstream");
        if ((((C13374a) this).f42392a != null ? 1 : null) == null) {
            throw new IllegalStateException("Extraction Parameters must be bound".toString());
        }
        c3957b = c3957b.a(new C11945a(this)).a(new C11946b(this));
        C9796d c9796d = this.f42392a;
        if (c9796d == null) {
            C2668g.b("frameExtractionRequest");
        }
        c3957b = c3957b.e(c9796d.m40386c());
        C2668g.a(c3957b, "upstream\n            .fi…otalVideoFramesToExtract)");
        return c3957b;
    }

    /* renamed from: a */
    private final long m51724a(long j, long j2, long j3) {
        return (j - j2) / j3;
    }
}
