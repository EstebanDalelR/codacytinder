package com.tinder.data.profile;

import com.tinder.domain.profile.model.DataNotAvailableException;
import io.reactivex.C3959e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "T", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/domain/profile/model/DataNotAvailableException;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ProfileLocalDataRepository$getProfileOption$1 extends Lambda implements Function1<DataNotAvailableException, C3959e<T>> {
    /* renamed from: a */
    public static final ProfileLocalDataRepository$getProfileOption$1 f43962a = new ProfileLocalDataRepository$getProfileOption$1();

    ProfileLocalDataRepository$getProfileOption$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53412a((DataNotAvailableException) obj);
    }

    /* renamed from: a */
    public final C3959e<T> m53412a(@NotNull DataNotAvailableException dataNotAvailableException) {
        C2668g.b(dataNotAvailableException, "it");
        dataNotAvailableException = C3959e.empty();
        C2668g.a(dataNotAvailableException, "Observable.empty()");
        return dataNotAvailableException;
    }
}
