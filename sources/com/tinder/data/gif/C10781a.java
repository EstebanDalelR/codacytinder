package com.tinder.data.gif;

import com.tinder.domain.message.Gif;
import com.tinder.domain.message.GifProviderExperimentUtility;
import dagger.Lazy;
import io.reactivex.C3960g;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016R\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/data/gif/ExperimentAwareGifApiClient;", "Lcom/tinder/data/gif/GifApiClient;", "gifProviderExperimentUtility", "Lcom/tinder/domain/message/GifProviderExperimentUtility;", "giphyApiClient", "Ldagger/Lazy;", "Lcom/tinder/data/gif/GiphyApiClient;", "tinderGiphyApiClient", "Lcom/tinder/data/gif/TinderGiphyApiClient;", "(Lcom/tinder/domain/message/GifProviderExperimentUtility;Ldagger/Lazy;Ldagger/Lazy;)V", "internalGifApiClient", "kotlin.jvm.PlatformType", "search", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/message/Gif;", "query", "", "trending", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.gif.a */
public final class C10781a implements GifApiClient {
    /* renamed from: a */
    private final GifApiClient f35210a;

    @Inject
    public C10781a(@NotNull GifProviderExperimentUtility gifProviderExperimentUtility, @NotNull Lazy<C10782d> lazy, @NotNull Lazy<C10784g> lazy2) {
        C2668g.b(gifProviderExperimentUtility, "gifProviderExperimentUtility");
        C2668g.b(lazy, "giphyApiClient");
        C2668g.b(lazy2, "tinderGiphyApiClient");
        switch (C8668b.f30522a[gifProviderExperimentUtility.getGifProvider().ordinal()]) {
            case 1:
                gifProviderExperimentUtility = (GifApiClient) lazy.get();
                break;
            case 2:
                gifProviderExperimentUtility = (GifApiClient) lazy2.get();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f35210a = gifProviderExperimentUtility;
    }

    @NotNull
    public C3960g<List<Gif>> search(@NotNull String str) {
        C2668g.b(str, "query");
        return this.f35210a.search(str);
    }

    @NotNull
    public C3960g<List<Gif>> trending() {
        return this.f35210a.trending();
    }
}
