package com.tinder.domain.profile.usecase;

import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "genderList", "apply"}, k = 3, mv = {1, 1, 10})
final class LoadMoreGenderList$invoke$2<T, R> implements Function<T, R> {
    final /* synthetic */ String $query;

    LoadMoreGenderList$invoke$2(String str) {
        this.$query = str;
    }

    @NotNull
    public final List<String> apply(@NotNull List<String> list) {
        C2668g.b(list, "genderList");
        return C2668g.a((String) C19301m.g(list), this.$query) ? list : C19301m.b(C19301m.a(this.$query), list);
    }
}
