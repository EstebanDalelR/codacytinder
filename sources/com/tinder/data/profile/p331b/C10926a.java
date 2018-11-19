package com.tinder.data.profile.p331b;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.User;
import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.ProfilePhoto;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/profile/usecase/GetCurrentUserProfilePhotos;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "(Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;)V", "execute", "Lio/reactivex/Observable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.b.a */
public final class C10926a implements ObservableResultUseCase<List<? extends ProfilePhoto>> {
    /* renamed from: a */
    private final LoadProfileOptionData f35625a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "user", "Lcom/tinder/domain/common/model/User;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.b.a$a */
    static final class C10925a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10925a f35624a = new C10925a();

        C10925a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43522a((User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<ProfilePhoto> m43522a(@NotNull User user) {
            C2668g.b(user, ManagerWebServices.PARAM_USER);
            return ProfilePhoto.Factory.fromUser(user);
        }
    }

    @Inject
    public C10926a(@NotNull LoadProfileOptionData loadProfileOptionData) {
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        this.f35625a = loadProfileOptionData;
    }

    @NotNull
    public C3959e<List<ProfilePhoto>> execute() {
        C3959e<List<ProfilePhoto>> map = this.f35625a.execute(ProfileOption.User.INSTANCE).map(C10925a.f35624a);
        C2668g.a(map, "loadProfileOptionData.ex….fromUser(user)\n        }");
        return map;
    }
}
