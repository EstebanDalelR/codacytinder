package com.tinder.data.profile.adapter;

import com.tinder.api.model.profile.EmailSettings.Options;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.settings.email.model.EmailSettingOption;
import com.tinder.domain.settings.email.model.EmailSettingType;
import com.tinder.domain.settings.email.model.EmailSettings;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/tinder/data/profile/adapter/EmailSettingsAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "Lcom/tinder/api/model/profile/EmailSettings;", "()V", "fromApi", "apiModel", "toApi", "request", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.adapter.i */
public final class C10916i extends C2646o<EmailSettings, com.tinder.api.model.profile.EmailSettings> {
    @Nullable
    /* renamed from: a */
    public EmailSettings m43503a(@NotNull com.tinder.api.model.profile.EmailSettings emailSettings) {
        Boolean newMatches;
        boolean booleanValue;
        EmailSettingType emailSettingType;
        C2668g.b(emailSettings, "apiModel");
        String email = emailSettings.getEmail();
        EmailSettingOption[] emailSettingOptionArr = new EmailSettingOption[3];
        EmailSettingType emailSettingType2 = EmailSettingType.NEW_MATCHES;
        Options emailSettingOptions = emailSettings.getEmailSettingOptions();
        boolean z = true;
        if (emailSettingOptions != null) {
            newMatches = emailSettingOptions.getNewMatches();
            if (newMatches != null) {
                booleanValue = newMatches.booleanValue();
                emailSettingOptionArr[0] = new EmailSettingOption(emailSettingType2, booleanValue);
                emailSettingType2 = EmailSettingType.NEW_MESSAGES;
                emailSettingOptions = emailSettings.getEmailSettingOptions();
                if (emailSettingOptions != null) {
                    newMatches = emailSettingOptions.getMessages();
                    if (newMatches != null) {
                        booleanValue = newMatches.booleanValue();
                        emailSettingOptionArr[1] = new EmailSettingOption(emailSettingType2, booleanValue);
                        emailSettingType = EmailSettingType.PROMOTIONS;
                        emailSettings = emailSettings.getEmailSettingOptions();
                        if (emailSettings != null) {
                            emailSettings = emailSettings.getPromotions();
                            if (emailSettings != null) {
                                z = emailSettings.booleanValue();
                            }
                        }
                        emailSettingOptionArr[2] = new EmailSettingOption(emailSettingType, z);
                        return new EmailSettings(email, ak.a(emailSettingOptionArr));
                    }
                }
                booleanValue = true;
                emailSettingOptionArr[1] = new EmailSettingOption(emailSettingType2, booleanValue);
                emailSettingType = EmailSettingType.PROMOTIONS;
                emailSettings = emailSettings.getEmailSettingOptions();
                if (emailSettings != null) {
                    emailSettings = emailSettings.getPromotions();
                    if (emailSettings != null) {
                        z = emailSettings.booleanValue();
                    }
                }
                emailSettingOptionArr[2] = new EmailSettingOption(emailSettingType, z);
                return new EmailSettings(email, ak.a(emailSettingOptionArr));
            }
        }
        booleanValue = true;
        emailSettingOptionArr[0] = new EmailSettingOption(emailSettingType2, booleanValue);
        emailSettingType2 = EmailSettingType.NEW_MESSAGES;
        emailSettingOptions = emailSettings.getEmailSettingOptions();
        if (emailSettingOptions != null) {
            newMatches = emailSettingOptions.getMessages();
            if (newMatches != null) {
                booleanValue = newMatches.booleanValue();
                emailSettingOptionArr[1] = new EmailSettingOption(emailSettingType2, booleanValue);
                emailSettingType = EmailSettingType.PROMOTIONS;
                emailSettings = emailSettings.getEmailSettingOptions();
                if (emailSettings != null) {
                    emailSettings = emailSettings.getPromotions();
                    if (emailSettings != null) {
                        z = emailSettings.booleanValue();
                    }
                }
                emailSettingOptionArr[2] = new EmailSettingOption(emailSettingType, z);
                return new EmailSettings(email, ak.a(emailSettingOptionArr));
            }
        }
        booleanValue = true;
        emailSettingOptionArr[1] = new EmailSettingOption(emailSettingType2, booleanValue);
        emailSettingType = EmailSettingType.PROMOTIONS;
        emailSettings = emailSettings.getEmailSettingOptions();
        if (emailSettings != null) {
            emailSettings = emailSettings.getPromotions();
            if (emailSettings != null) {
                z = emailSettings.booleanValue();
            }
        }
        emailSettingOptionArr[2] = new EmailSettingOption(emailSettingType, z);
        return new EmailSettings(email, ak.a(emailSettingOptionArr));
    }

    @NotNull
    /* renamed from: a */
    public final com.tinder.api.model.profile.EmailSettings m43502a(@NotNull EmailSettings emailSettings) {
        C2668g.b(emailSettings, "request");
        return new com.tinder.api.model.profile.EmailSettings(emailSettings.getEmailAddress(), new Options(Boolean.valueOf(emailSettings.getOption(EmailSettingType.NEW_MATCHES).getEnabled()), Boolean.valueOf(emailSettings.getOption(EmailSettingType.NEW_MESSAGES).getEnabled()), Boolean.valueOf(emailSettings.getOption(EmailSettingType.PROMOTIONS).getEnabled())));
    }
}
