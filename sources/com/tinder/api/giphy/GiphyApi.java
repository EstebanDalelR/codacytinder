package com.tinder.api.giphy;

import com.squareup.moshi.C5987p;
import com.tinder.api.ManagerWebServices;
import io.reactivex.C3960g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0003J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/giphy/GiphyApi;", "", "apiKey", "", "rating", "Lcom/tinder/api/giphy/GiphyApi$Rating;", "lang", "Lkotlin/Function0;", "moshi", "Lcom/squareup/moshi/Moshi;", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "(Ljava/lang/String;Lcom/tinder/api/giphy/GiphyApi$Rating;Lkotlin/jvm/functions/Function0;Lcom/squareup/moshi/Moshi;Lretrofit2/Retrofit$Builder;)V", "giphyRetrofitService", "Lcom/tinder/api/giphy/GiphyRetrofitService;", "kotlin.jvm.PlatformType", "search", "Lio/reactivex/Single;", "Lcom/tinder/api/giphy/GiphyApiResponse;", "query", "trending", "Rating", "api_release"}, k = 1, mv = {1, 1, 10})
public final class GiphyApi {
    private final String apiKey;
    private final GiphyRetrofitService giphyRetrofitService;
    private final Function0<String> lang;
    private final Rating rating;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/api/giphy/GiphyApi$Rating;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Y", "G", "PG", "PG_13", "R", "api_release"}, k = 1, mv = {1, 1, 10})
    public enum Rating {
        ;
        
        @NotNull
        private final String value;

        protected Rating(String str) {
            C2668g.b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public GiphyApi(@NotNull String str, @NotNull Rating rating, @NotNull Function0<String> function0, @NotNull C5987p c5987p, @NotNull Builder builder) {
        C2668g.b(str, "apiKey");
        C2668g.b(rating, ManagerWebServices.PARAM_RATING);
        C2668g.b(function0, "lang");
        C2668g.b(c5987p, "moshi");
        C2668g.b(builder, "retrofitBuilder");
        this.apiKey = str;
        this.rating = rating;
        this.lang = function0;
        this.giphyRetrofitService = (GiphyRetrofitService) builder.addConverterFactory(MoshiConverterFactory.create(c5987p)).build().create(GiphyRetrofitService.class);
    }

    @NotNull
    public final C3960g<GiphyApiResponse> search(@NotNull String str) {
        C2668g.b(str, "query");
        str = this.giphyRetrofitService.search(str, this.rating.getValue(), this.apiKey, (String) this.lang.invoke());
        C2668g.a(str, "giphyRetrofitService.sea…ng.value, apiKey, lang())");
        return str;
    }

    @NotNull
    public final C3960g<GiphyApiResponse> trending() {
        C3960g<GiphyApiResponse> trending = this.giphyRetrofitService.trending(this.rating.getValue(), this.apiKey, (String) this.lang.invoke());
        C2668g.a(trending, "giphyRetrofitService.tre…ng.value, apiKey, lang())");
        return trending;
    }
}
