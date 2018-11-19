package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.Tutorials;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/Tutorials;", "it", "", "Lcom/tinder/domain/profile/model/Tutorial;", "apply"}, k = 3, mv = {1, 1, 10})
final class CheckTutorialViewed$execute$2<T, R> implements Function<T, R> {
    public static final CheckTutorialViewed$execute$2 INSTANCE = new CheckTutorialViewed$execute$2();

    CheckTutorialViewed$execute$2() {
    }

    @NotNull
    public final Tutorials apply(@NotNull List<? extends Tutorial> list) {
        C2668g.b(list, "it");
        return new Tutorials(list);
    }
}
