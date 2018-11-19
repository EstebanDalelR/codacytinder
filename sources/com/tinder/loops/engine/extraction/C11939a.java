package com.tinder.loops.engine.extraction;

import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.loops.engine.extraction.decoder.VideoDecoder;
import com.tinder.loops.engine.extraction.decoder.filter.DecodedFrameFilter;
import com.tinder.loops.engine.extraction.p281c.C9792a;
import com.tinder.loops.engine.extraction.p281c.C9794b;
import com.tinder.loops.engine.extraction.p281c.C9795c;
import com.tinder.loops.engine.extraction.p281c.C9796d;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/loops/engine/extraction/VideoFrameExtractionEngine;", "Lcom/tinder/loops/engine/extraction/VideoFrameExtractor;", "videoDecoder", "Lcom/tinder/loops/engine/extraction/decoder/VideoDecoder;", "frameFilter", "Lcom/tinder/loops/engine/extraction/decoder/filter/DecodedFrameFilter;", "(Lcom/tinder/loops/engine/extraction/decoder/VideoDecoder;Lcom/tinder/loops/engine/extraction/decoder/filter/DecodedFrameFilter;)V", "extractFramesObservable", "Lio/reactivex/Flowable;", "Lcom/tinder/loops/engine/extraction/model/DecodedFrameInfo;", "getExtractFramesObservable", "()Lio/reactivex/Flowable;", "extractFramesObservable$delegate", "Lkotlin/Lazy;", "getExtractedFrameInfo", "Lio/reactivex/Single;", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;", "observeExtractedFrameContext", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "frameExtractionRequest", "Lcom/tinder/loops/engine/extraction/model/FrameExtractionRequest;", "release", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.a */
public final class C11939a implements VideoFrameExtractor {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38853a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C11939a.class), "extractFramesObservable", "getExtractFramesObservable()Lio/reactivex/Flowable;"))};
    /* renamed from: b */
    private final Lazy f38854b = C18451c.a((Function0) new VideoFrameExtractionEngine$extractFramesObservable$2(this));
    /* renamed from: c */
    private final VideoDecoder f38855c;
    /* renamed from: d */
    private final DecodedFrameFilter f38856d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "it", "Lcom/tinder/loops/engine/extraction/model/DecodedFrameInfo;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.extraction.a$a */
    static final class C11937a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C11939a f38851a;

        C11937a(C11939a c11939a) {
            this.f38851a = c11939a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47954a((C9792a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C9770a m47954a(@NotNull C9792a c9792a) {
            C2668g.b(c9792a, "it");
            return new C9770a(this.f38851a.f38855c.copyCurrentDecodedFrame(), c9792a.m40377a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "frames", "", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "kotlin.jvm.PlatformType", "", "videoFramesInfo", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.extraction.a$b */
    static final class C11938b<T1, T2, R> implements BiFunction<List<C9770a>, C9795c, C9794b> {
        /* renamed from: a */
        public static final C11938b f38852a = new C11938b();

        C11938b() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m47955a((List) obj, (C9795c) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C9794b m47955a(@NotNull List<C9770a> list, @NotNull C9795c c9795c) {
            C2668g.b(list, "frames");
            C2668g.b(c9795c, "videoFramesInfo");
            return new C9794b(list, c9795c);
        }
    }

    /* renamed from: a */
    private final C3957b<C9792a> m47957a() {
        Lazy lazy = this.f38854b;
        KProperty kProperty = f38853a[0];
        return (C3957b) lazy.getValue();
    }

    @Inject
    public C11939a(@NotNull VideoDecoder videoDecoder, @NotNull DecodedFrameFilter decodedFrameFilter) {
        C2668g.b(videoDecoder, "videoDecoder");
        C2668g.b(decodedFrameFilter, "frameFilter");
        this.f38855c = videoDecoder;
        this.f38856d = decodedFrameFilter;
    }

    public void release() {
        this.f38855c.release();
    }

    @NotNull
    public C3960g<C9794b> observeExtractedFrameContext(@NotNull C9796d c9796d) {
        C2668g.b(c9796d, "frameExtractionRequest");
        this.f38856d.bindExtractionParameters(c9796d);
        this.f38855c.bindFrameExtractionParameters(c9796d);
        c9796d = m47957a().a(this.f38856d).f(new C11937a(this)).o().a(m47958b(), C11938b.f38852a);
        C2668g.a(c9796d, "extractFramesObservable\n…        ) }\n            )");
        return c9796d;
    }

    /* renamed from: b */
    private final C3960g<C9795c> m47958b() {
        return this.f38855c.observeExtractedFrameInfo();
    }
}
