package com.tinder.data.message.p225a;

import com.tinder.data.gif.GifApiClient;
import com.tinder.domain.message.Gif;
import com.tinder.domain.message.GifRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/data/message/gif/GiphyGifRepository;", "Lcom/tinder/domain/message/GifRepository;", "gifApiClient", "Lcom/tinder/data/gif/GifApiClient;", "(Lcom/tinder/data/gif/GifApiClient;)V", "store", "Lcom/tinder/data/message/gif/GiphyGifRepository$InMemoryStore;", "loadTrending", "Lrx/Single;", "", "Lcom/tinder/domain/message/Gif;", "search", "query", "", "InMemoryStore", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.a.c */
public final class C10810c implements GifRepository {
    /* renamed from: a */
    private final C8682a f35255a = new C8682a();
    /* renamed from: b */
    private final GifApiClient f35256b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tinder/data/message/gif/GiphyGifRepository$InMemoryStore;", "", "()V", "trending", "", "Lcom/tinder/domain/message/Gif;", "getTrending", "()Ljava/util/List;", "setTrending", "(Ljava/util/List;)V", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.a.c$a */
    public static final class C8682a {
        @NotNull
        /* renamed from: a */
        private List<Gif> f30562a = C19301m.a();

        @NotNull
        /* renamed from: a */
        public final List<Gif> m37003a() {
            return this.f30562a;
        }

        /* renamed from: a */
        public final void m37004a(@NotNull List<Gif> list) {
            C2668g.b(list, "<set-?>");
            this.f30562a = list;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/domain/message/Gif;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.a.c$b */
    static final class C13834b<T> implements Action1<List<? extends Gif>> {
        /* renamed from: a */
        final /* synthetic */ C10810c f43883a;

        C13834b(C10810c c10810c) {
            this.f43883a = c10810c;
        }

        public /* synthetic */ void call(Object obj) {
            m53397a((List) obj);
        }

        /* renamed from: a */
        public final void m53397a(List<Gif> list) {
            C8682a a = this.f43883a.f35255a;
            C2668g.a(list, "it");
            a.m37004a(list);
        }
    }

    @Inject
    public C10810c(@NotNull GifApiClient gifApiClient) {
        C2668g.b(gifApiClient, "gifApiClient");
        this.f35256b = gifApiClient;
    }

    @NotNull
    public Single<List<Gif>> loadTrending() {
        List a = this.f35255a.m37003a();
        if (a.isEmpty()) {
            Single<List<Gif>> d = RxJavaInteropExtKt.toV1Single(this.f35256b.trending()).d(new C13834b(this));
            C2668g.a(d, "gifApiClient.trending()\n…s { store.trending = it }");
            return d;
        }
        d = Single.a(a);
        C2668g.a(d, "Single.just(cachedTrending)");
        return d;
    }

    @NotNull
    public Single<List<Gif>> search(@NotNull String str) {
        C2668g.b(str, "query");
        return RxJavaInteropExtKt.toV1Single(this.f35256b.search(str));
    }
}
