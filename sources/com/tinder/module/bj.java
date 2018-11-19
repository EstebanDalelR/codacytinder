package com.tinder.module;

import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.settings.email.usecase.LoadEmailDisplaySettings;
import com.tinder.managers.UserMetaManager;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/module/EmailSettingsEmailEditableModule;", "", "()V", "provideLoadEmailDisplaySettings", "Lcom/tinder/domain/settings/email/usecase/LoadEmailDisplaySettings;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "userMetaManager", "Lcom/tinder/managers/UserMetaManager;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class bj {
    @NotNull
    @Provides
    /* renamed from: a */
    public final LoadEmailDisplaySettings m40792a(@NotNull LoadProfileOptionData loadProfileOptionData, @NotNull UserMetaManager userMetaManager) {
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(userMetaManager, "userMetaManager");
        return new LoadEmailDisplaySettings(loadProfileOptionData, new C14086x4e34f1a6(userMetaManager));
    }
}
