package com.tinder.recs.api;

import com.tinder.api.response.RecsResponse;
import com.tinder.data.recs.C8786k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/data/recs/RecsFetchResults;", "p1", "Lcom/tinder/api/response/RecsResponse;", "Lkotlin/ParameterName;", "name", "httpResponse", "invoke"}, k = 3, mv = {1, 1, 10})
final class CardStackRecsApiClient$loadRecs$1 extends FunctionReference implements Function1<RecsResponse, C8786k> {
    CardStackRecsApiClient$loadRecs$1(CardStackRecsApiClient cardStackRecsApiClient) {
        super(1, cardStackRecsApiClient);
    }

    public final String getName() {
        return "handleRecsResponse";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(CardStackRecsApiClient.class);
    }

    public final String getSignature() {
        return "handleRecsResponse(Lcom/tinder/api/response/RecsResponse;)Lcom/tinder/data/recs/RecsFetchResults;";
    }

    @NotNull
    public final C8786k invoke(@NotNull RecsResponse recsResponse) {
        C2668g.b(recsResponse, "p1");
        return CardStackRecsApiClient.access$handleRecsResponse((CardStackRecsApiClient) this.receiver, recsResponse);
    }
}
