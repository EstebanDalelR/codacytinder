package com.tinder.settingsemail.email.component;

import com.tinder.common.logger.Logger;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import com.tinder.domain.settings.email.usecase.LoadEmailDisplaySettings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tinder/settingsemail/email/component/EmailSettingsComponent$Parent;", "", "profileLocalRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "profileRemoteRepository", "Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;", "provideLoadEmailDisplaySettings", "Lcom/tinder/domain/settings/email/usecase/LoadEmailDisplaySettings;", "provideLogger", "Lcom/tinder/common/logger/Logger;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
public interface EmailSettingsComponent$Parent {
    @NotNull
    ProfileLocalRepository profileLocalRepository();

    @NotNull
    ProfileRemoteRepository profileRemoteRepository();

    @NotNull
    LoadEmailDisplaySettings provideLoadEmailDisplaySettings();

    @NotNull
    Logger provideLogger();
}
