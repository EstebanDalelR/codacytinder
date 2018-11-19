package com.tinder.domain.profile.usecase;

import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "genderList", "apply"}, k = 3, mv = {1, 1, 10})
final class LoadMoreGenderList$invoke$1<T, R> implements Function<T, R> {
    final /* synthetic */ String $query;

    LoadMoreGenderList$invoke$1(String str) {
        this.$query = str;
    }

    @NotNull
    public final List<String> apply(@NotNull List<String> list) {
        C2668g.b(list, "genderList");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (C19303i.b((String) next, this.$query, true)) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
