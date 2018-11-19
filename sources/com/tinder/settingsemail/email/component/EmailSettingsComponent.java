package com.tinder.settingsemail.email.component;

import android.app.Activity;
import com.tinder.settingsemail.email.p409b.C14926a;
import com.tinder.settingsemail.email.scope.EmailSettingsScope;
import com.tinder.settingsemail.email.view.C16708a;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Component(dependencies = {EmailSettingsComponent$Parent.class}, modules = {C14926a.class})
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/tinder/settingsemail/email/component/EmailSettingsComponent;", "", "inject", "", "emailSettingsView", "Lcom/tinder/settingsemail/email/view/EmailSettingsView;", "Builder", "EmailSettingsComponentParentProvider", "Parent", "settings-email_release"}, k = 1, mv = {1, 1, 10})
@EmailSettingsScope
public interface EmailSettingsComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/settingsemail/email/component/EmailSettingsComponent$Builder;", "", "activity", "Landroid/app/Activity;", "build", "Lcom/tinder/settingsemail/email/component/EmailSettingsComponent;", "parent", "Lcom/tinder/settingsemail/email/component/EmailSettingsComponent$Parent;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
    @dagger.Component.Builder
    public interface Builder {
        @NotNull
        @BindsInstance
        Builder activity(@NotNull Activity activity);

        @NotNull
        EmailSettingsComponent build();

        @NotNull
        Builder parent(@NotNull EmailSettingsComponent$Parent emailSettingsComponent$Parent);
    }

    void inject(@NotNull C16708a c16708a);
}
