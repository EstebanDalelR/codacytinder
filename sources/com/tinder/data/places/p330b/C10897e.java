package com.tinder.data.places.p330b;

import com.tinder.data.profile.persistence.ProfileDataStore;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.profile.model.ProfileOption.Places;
import com.tinder.domain.profile.model.settings.PlacesSettings;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/places/usecase/SetPlacesEnabledInProfileDataStore;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "", "profileDataStore", "Lcom/tinder/data/profile/persistence/ProfileDataStore;", "(Lcom/tinder/data/profile/persistence/ProfileDataStore;)V", "execute", "Lio/reactivex/Completable;", "enabled", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.b.e */
public final class C10897e implements CompletableUseCase<Boolean> {
    /* renamed from: a */
    private final ProfileDataStore f35591a;

    @Inject
    public C10897e(@NotNull ProfileDataStore profileDataStore) {
        C2668g.b(profileDataStore, "profileDataStore");
        this.f35591a = profileDataStore;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m43443a(((Boolean) obj).booleanValue());
    }

    @NotNull
    /* renamed from: a */
    public C3956a m43443a(boolean z) {
        return this.f35591a.save(Places.INSTANCE, new PlacesSettings(z));
    }
}
