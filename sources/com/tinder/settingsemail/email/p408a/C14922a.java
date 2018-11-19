package com.tinder.settingsemail.email.p408a;

import com.tinder.domain.settings.email.model.EmailSettingOption;
import com.tinder.domain.settings.email.model.EmailSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/tinder/settingsemail/email/interactor/EmailSettingsInteractor;", "", "()V", "updateEmailSettingOptions", "", "Lcom/tinder/domain/settings/email/model/EmailSettingOption;", "emailSettings", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "emailSettingOption", "settings-email_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settingsemail.email.a.a */
public final class C14922a {
    @NotNull
    /* renamed from: a */
    public final Set<EmailSettingOption> m56386a(@NotNull EmailSettings emailSettings, @NotNull EmailSettingOption emailSettingOption) {
        C2668g.b(emailSettings, "emailSettings");
        C2668g.b(emailSettingOption, "emailSettingOption");
        Collection arrayList = new ArrayList();
        for (Object next : emailSettings.getOptions()) {
            if ((((EmailSettingOption) next).getType() != emailSettingOption.getType() ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        emailSettings = C19299w.m68845q((List) arrayList);
        emailSettings.add(emailSettingOption);
        return emailSettings;
    }
}
