package com.tinder.settingsemail.email.viewmodel;

import android.content.res.Resources;
import com.tinder.domain.settings.email.model.EmailSettingOption;
import com.tinder.domain.settings.email.model.EmailSettingType;
import com.tinder.domain.settings.email.model.EmailSettings;
import com.tinder.settingsemail.C14921a.C14919e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "", "getType", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel$Type;", "Factory", "Type", "settings-email_release"}, k = 1, mv = {1, 1, 10})
public interface EmailSettingsRowViewModel {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel$Type;", "", "(Ljava/lang/String;I)V", "EMAIL", "SETTING_OPTIONS", "UNSUBSCRIBE", "settings-email_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel$Factory;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "emailSettingsSortOrder", "", "Lcom/tinder/domain/settings/email/model/EmailSettingType;", "create", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "emailSettings", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "isValidEmail", "", "canEditEmail", "sortEmailSettingOptionsInOrder", "Lcom/tinder/domain/settings/email/model/EmailSettingOption;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel$a */
    public static final class C14934a {
        /* renamed from: a */
        private final List<EmailSettingType> f46646a = C17554o.m64199b((Object[]) new EmailSettingType[]{EmailSettingType.NEW_MATCHES, EmailSettingType.NEW_MESSAGES, EmailSettingType.PROMOTIONS});
        /* renamed from: b */
        private final Resources f46647b;

        @Inject
        public C14934a(@NotNull Resources resources) {
            C2668g.b(resources, "resources");
            this.f46647b = resources;
        }

        @NotNull
        /* renamed from: a */
        public final List<EmailSettingsRowViewModel> m56413a(@NotNull EmailSettings emailSettings, boolean z, boolean z2) {
            C2668g.b(emailSettings, "emailSettings");
            List b = C17554o.m64199b((Object[]) new Type[]{Type.EMAIL, Type.SETTING_OPTIONS, Type.UNSUBSCRIBE});
            String emailAddress = emailSettings.getEmailAddress();
            if (emailAddress == null) {
                emailAddress = "";
            }
            Iterable<Type> iterable = b;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (Type ordinal : iterable) {
                Object c16710a;
                switch (C14935c.f46648a[ordinal.ordinal()]) {
                    case 1:
                        c16710a = new C16710a(emailAddress, z ^ 1, z2);
                        break;
                    case 2:
                        c16710a = new C16711b(m56412a(emailSettings), z);
                        break;
                    case 3:
                        int i;
                        if (emailSettings.getAreOptionsEnabled()) {
                            i = C14919e.settings_unsubscribe;
                        } else {
                            i = C14919e.settings_subscribe;
                        }
                        String string = this.f46647b.getString(i);
                        C2668g.a(string, "resources.getString(resId)");
                        c16710a = new C16712d(string, z);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList.add(c16710a);
            }
            return (List) arrayList;
        }

        /* renamed from: a */
        private final List<EmailSettingOption> m56412a(EmailSettings emailSettings) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (EmailSettingType option : this.f46646a) {
                linkedHashSet.add(emailSettings.getOption(option));
            }
            return C19299w.m68823d((Collection) linkedHashSet);
        }
    }

    @NotNull
    Type getType();
}
