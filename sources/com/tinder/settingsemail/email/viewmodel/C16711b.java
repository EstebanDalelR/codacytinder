package com.tinder.settingsemail.email.viewmodel;

import com.tinder.domain.settings.email.model.EmailSettingOption;
import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsOptionRowViewModel;", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "emailSettingOptions", "", "Lcom/tinder/domain/settings/email/model/EmailSettingOption;", "canToggleOptions", "", "(Ljava/util/List;Z)V", "getCanToggleOptions", "()Z", "getEmailSettingOptions", "()Ljava/util/List;", "getType", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel$Type;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settingsemail.email.viewmodel.b */
public final class C16711b implements EmailSettingsRowViewModel {
    @NotNull
    /* renamed from: a */
    private final List<EmailSettingOption> f51697a;
    /* renamed from: b */
    private final boolean f51698b;

    public C16711b(@NotNull List<EmailSettingOption> list, boolean z) {
        C2668g.b(list, "emailSettingOptions");
        this.f51697a = list;
        this.f51698b = z;
    }

    @NotNull
    /* renamed from: a */
    public final List<EmailSettingOption> m62221a() {
        return this.f51697a;
    }

    /* renamed from: b */
    public final boolean m62222b() {
        return this.f51698b;
    }

    @NotNull
    public Type getType() {
        return Type.SETTING_OPTIONS;
    }
}
