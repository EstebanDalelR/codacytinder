package com.tinder.data.profile;

import com.tinder.data.profile.client.C8759d;
import com.tinder.data.profile.persistence.ProfileDataStore;
import com.tinder.domain.profile.model.ProfileOption.WebProfile;
import com.tinder.domain.profile.model.settings.WebProfileSettings;
import com.tinder.domain.profile.repository.WebProfileRepository;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/data/profile/WebProfileDataRepository;", "Lcom/tinder/domain/profile/repository/WebProfileRepository;", "client", "Lcom/tinder/data/profile/client/WebProfileClient;", "profileDataStore", "Lcom/tinder/data/profile/persistence/ProfileDataStore;", "(Lcom/tinder/data/profile/client/WebProfileClient;Lcom/tinder/data/profile/persistence/ProfileDataStore;)V", "createUsername", "Lio/reactivex/Completable;", "username", "", "deleteUsername", "persist", "webProfileSettings", "Lcom/tinder/domain/profile/model/settings/WebProfileSettings;", "updateUsername", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.x */
public final class C10984x implements WebProfileRepository {
    /* renamed from: a */
    private final C8759d f35707a;
    /* renamed from: b */
    private final ProfileDataStore f35708b;

    @Inject
    public C10984x(@NotNull C8759d c8759d, @NotNull ProfileDataStore profileDataStore) {
        C2668g.b(c8759d, "client");
        C2668g.b(profileDataStore, "profileDataStore");
        this.f35707a = c8759d;
        this.f35708b = profileDataStore;
    }

    @NotNull
    public C3956a createUsername(@NotNull String str) {
        C2668g.b(str, "username");
        str = this.f35707a.m37304a(str).b(m43588a(new WebProfileSettings(str)));
        C2668g.a(str, "client.create(username)\n…ofileSettings(username)))");
        return str;
    }

    @NotNull
    public C3956a updateUsername(@NotNull String str) {
        C2668g.b(str, "username");
        str = this.f35707a.m37305b(str).b(m43588a(new WebProfileSettings(str)));
        C2668g.a(str, "client.update(username)\n…ofileSettings(username)))");
        return str;
    }

    @NotNull
    public C3956a deleteUsername() {
        C3956a b = this.f35707a.m37303a().b(m43588a(WebProfileSettings.DEFAULT));
        C2668g.a(b, "client.delete()\n        …ProfileSettings.DEFAULT))");
        return b;
    }

    /* renamed from: a */
    private final C3956a m43588a(WebProfileSettings webProfileSettings) {
        return this.f35708b.save(WebProfile.INSTANCE, webProfileSettings);
    }
}
