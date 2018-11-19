package com.tinder.domain.places;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/places/PlaceNotFoundException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "caller", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceNotFoundException extends RuntimeException {
    public PlaceNotFoundException(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "caller");
        C2668g.b(str2, "id");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(str);
        stringBuilder.append(" could not find ");
        stringBuilder.append(str2);
        super(stringBuilder.toString());
    }
}
