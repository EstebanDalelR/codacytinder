package com.tinder.data.feed;

import com.tinder.domain.feed.FeedCarouselItemSelected;
import com.tinder.domain.feed.FeedCarouselItemSelectedRepository;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.functions.Action;
import io.reactivex.subjects.C18432c;
import io.reactivex.subjects.C19040a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\tH\u0002J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\t0\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R4\u0010\u0007\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \n*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t0\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/feed/FeedDataCarouselItemSelectedRepository;", "Lcom/tinder/domain/feed/FeedCarouselItemSelectedRepository;", "()V", "carouselItemSelectedMap", "", "", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "subject", "Lio/reactivex/subjects/Subject;", "", "kotlin.jvm.PlatformType", "clear", "Lio/reactivex/Completable;", "dispatchUpdate", "", "map", "observe", "Lio/reactivex/Observable;", "put", "feedItemId", "feedCarouselItemSelected", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.feed.c */
public final class C10774c implements FeedCarouselItemSelectedRepository {
    /* renamed from: a */
    private final Map<String, FeedCarouselItemSelected> f35184a = new LinkedHashMap();
    /* renamed from: b */
    private final C18432c<Map<String, FeedCarouselItemSelected>> f35185b = C19040a.a().d();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.c$a */
    static final class C10772a implements Action {
        /* renamed from: a */
        final /* synthetic */ C10774c f35180a;

        C10772a(C10774c c10774c) {
            this.f35180a = c10774c;
        }

        public final void run() {
            Map b;
            synchronized (this.f35180a.f35184a) {
                this.f35180a.f35184a.clear();
                b = ae.b(this.f35180a.f35184a);
            }
            this.f35180a.m43185a(b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.c$b */
    static final class C10773b implements Action {
        /* renamed from: a */
        final /* synthetic */ C10774c f35181a;
        /* renamed from: b */
        final /* synthetic */ FeedCarouselItemSelected f35182b;
        /* renamed from: c */
        final /* synthetic */ String f35183c;

        C10773b(C10774c c10774c, FeedCarouselItemSelected feedCarouselItemSelected, String str) {
            this.f35181a = c10774c;
            this.f35182b = feedCarouselItemSelected;
            this.f35183c = str;
        }

        public final void run() {
            Map b;
            synchronized (this.f35181a.f35184a) {
                this.f35181a.f35184a.put(this.f35183c, this.f35182b);
                b = ae.b(this.f35181a.f35184a);
            }
            this.f35181a.m43185a(b);
        }
    }

    @NotNull
    public C3959e<Map<String, FeedCarouselItemSelected>> observe() {
        C3959e<Map<String, FeedCarouselItemSelected>> hide = this.f35185b.hide();
        C2668g.a(hide, "subject.hide()");
        return hide;
    }

    @NotNull
    public C3956a put(@NotNull String str, @NotNull FeedCarouselItemSelected feedCarouselItemSelected) {
        C2668g.b(str, "feedItemId");
        C2668g.b(feedCarouselItemSelected, "feedCarouselItemSelected");
        str = C3956a.a(new C10773b(this, feedCarouselItemSelected, str));
        C2668g.a(str, "Completable.fromAction {…)\n            }\n        }");
        return str;
    }

    @NotNull
    public C3956a clear() {
        C3956a a = C3956a.a(new C10772a(this));
        C2668g.a(a, "Completable.fromAction {…)\n            }\n        }");
        return a;
    }

    /* renamed from: a */
    private final void m43185a(Map<String, FeedCarouselItemSelected> map) {
        this.f35185b.onNext(map);
    }
}
