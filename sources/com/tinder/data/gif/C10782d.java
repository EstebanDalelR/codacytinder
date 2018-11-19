package com.tinder.data.gif;

import com.tinder.api.giphy.GiphyApi;
import com.tinder.api.giphy.GiphyApiResponse;
import com.tinder.data.message.p225a.C10809a;
import com.tinder.domain.message.Gif;
import io.reactivex.C3960g;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/data/gif/GiphyApiClient;", "Lcom/tinder/data/gif/GifApiClient;", "giphyApi", "Lcom/tinder/api/giphy/GiphyApi;", "giphyDomainAdapter", "Lcom/tinder/data/message/gif/GiphyDomainAdapter;", "(Lcom/tinder/api/giphy/GiphyApi;Lcom/tinder/data/message/gif/GiphyDomainAdapter;)V", "search", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/message/Gif;", "query", "", "toGifs", "apiResponse", "Lcom/tinder/api/giphy/GiphyApiResponse;", "trending", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.gif.d */
public final class C10782d implements GifApiClient {
    /* renamed from: a */
    private final GiphyApi f35211a;
    /* renamed from: b */
    private final C10809a f35212b;

    @Inject
    public C10782d(@NotNull GiphyApi giphyApi, @NotNull C10809a c10809a) {
        C2668g.b(giphyApi, "giphyApi");
        C2668g.b(c10809a, "giphyDomainAdapter");
        this.f35211a = giphyApi;
        this.f35212b = c10809a;
    }

    @NotNull
    public C3960g<List<Gif>> search(@NotNull String str) {
        C2668g.b(str, "query");
        str = this.f35211a.search(str).e(new C10783e(new GiphyApiClient$search$1(this)));
        C2668g.a(str, "giphyApi.search(query).map(::toGifs)");
        return str;
    }

    @NotNull
    public C3960g<List<Gif>> trending() {
        C3960g<List<Gif>> e = this.f35211a.trending().e(new C10783e(new GiphyApiClient$trending$1(this)));
        C2668g.a(e, "giphyApi.trending().map(::toGifs)");
        return e;
    }

    /* renamed from: a */
    private final List<Gif> m43235a(GiphyApiResponse giphyApiResponse) {
        giphyApiResponse = giphyApiResponse.data();
        giphyApiResponse = giphyApiResponse != null ? this.f35212b.a(giphyApiResponse) : null;
        return giphyApiResponse != null ? giphyApiResponse : C19301m.a();
    }
}
