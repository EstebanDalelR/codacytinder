package com.tinder.ads;

import com.tinder.ads.AdSource.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/ads/FillException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "adSourceType", "Lcom/tinder/ads/AdSource$Type;", "(Lcom/tinder/ads/AdSource$Type;)V", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class FillException extends Exception {
    private final Type adSourceType;

    public FillException(@NotNull Type type) {
        C2668g.b(type, "adSourceType");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No Fill available for source ");
        stringBuilder.append(type);
        super(stringBuilder.toString());
        this.adSourceType = type;
    }
}
