package com.tinder.data.gif;

import com.tinder.api.TinderApi;
import com.tinder.api.giphy.GiphyApiResponse;
import com.tinder.common.p194f.C8532a;
import com.tinder.data.message.p225a.C10809a;
import com.tinder.domain.message.Gif;
import io.reactivex.C3960g;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/gif/TinderGiphyApiClient;", "Lcom/tinder/data/gif/GifApiClient;", "defaultLocaleProvider", "Lcom/tinder/common/locale/DefaultLocaleProvider;", "tinderApi", "Lcom/tinder/api/TinderApi;", "giphyDomainAdapter", "Lcom/tinder/data/message/gif/GiphyDomainAdapter;", "(Lcom/tinder/common/locale/DefaultLocaleProvider;Lcom/tinder/api/TinderApi;Lcom/tinder/data/message/gif/GiphyDomainAdapter;)V", "lang", "Lkotlin/Function0;", "", "search", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/message/Gif;", "query", "toGifs", "apiResponse", "Lcom/tinder/api/giphy/GiphyApiResponse;", "trending", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.gif.g */
public final class C10784g implements GifApiClient {
    /* renamed from: a */
    private final Function0<String> f35214a;
    /* renamed from: b */
    private final TinderApi f35215b;
    /* renamed from: c */
    private final C10809a f35216c;

    @Inject
    public C10784g(@NotNull C8532a c8532a, @NotNull TinderApi tinderApi, @NotNull C10809a c10809a) {
        C2668g.b(c8532a, "defaultLocaleProvider");
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c10809a, "giphyDomainAdapter");
        this.f35215b = tinderApi;
        this.f35216c = c10809a;
        this.f35214a = (Function0) new TinderGiphyApiClient$lang$1(c8532a);
    }

    @NotNull
    public C3960g<List<Gif>> search(@NotNull String str) {
        C2668g.b(str, "query");
        str = this.f35215b.searchGifs(str, (String) this.f35214a.invoke()).e(new C10785h(new TinderGiphyApiClient$search$1(this)));
        C2668g.a(str, "tinderApi.searchGifs(query, lang()).map(::toGifs)");
        return str;
    }

    @NotNull
    public C3960g<List<Gif>> trending() {
        C3960g<List<Gif>> e = this.f35215b.trendingGifs((String) this.f35214a.invoke()).e(new C10785h(new TinderGiphyApiClient$trending$1(this)));
        C2668g.a(e, "tinderApi.trendingGifs(lang()).map(::toGifs)");
        return e;
    }

    /* renamed from: a */
    private final List<Gif> m43237a(GiphyApiResponse giphyApiResponse) {
        C10809a c10809a = this.f35216c;
        giphyApiResponse = giphyApiResponse.data();
        if (giphyApiResponse == null) {
            giphyApiResponse = C19301m.a();
        }
        giphyApiResponse = c10809a.a(giphyApiResponse);
        C2668g.a(giphyApiResponse, "giphyDomainAdapter.fromA…esponse.data().orEmpty())");
        return giphyApiResponse;
    }
}
