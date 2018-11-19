package com.tinder.data.gif;

import com.tinder.api.giphy.GiphyApiResponse;
import com.tinder.domain.message.Gif;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/message/Gif;", "p1", "Lcom/tinder/api/giphy/GiphyApiResponse;", "Lkotlin/ParameterName;", "name", "apiResponse", "invoke"}, k = 3, mv = {1, 1, 10})
final class GiphyApiClient$trending$1 extends FunctionReference implements Function1<GiphyApiResponse, List<? extends Gif>> {
    GiphyApiClient$trending$1(C10782d c10782d) {
        super(1, c10782d);
    }

    public final String getName() {
        return "toGifs";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10782d.class);
    }

    public final String getSignature() {
        return "toGifs(Lcom/tinder/api/giphy/GiphyApiResponse;)Ljava/util/List;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54330a((GiphyApiResponse) obj);
    }

    @NotNull
    /* renamed from: a */
    public final List<Gif> m54330a(@NotNull GiphyApiResponse giphyApiResponse) {
        C2668g.b(giphyApiResponse, "p1");
        return ((C10782d) this.receiver).m43235a(giphyApiResponse);
    }
}
