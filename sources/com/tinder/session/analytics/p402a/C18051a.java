package com.tinder.session.analytics.p402a;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.auth.usecase.MaskEmail;
import com.tinder.domain.settings.email.model.EmailSettingType;
import com.tinder.domain.settings.email.model.EmailSettings;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0011\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/session/analytics/settingsemail/CreateEmailSettingsAnalyticsPayload;", "Lkotlin/Function1;", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "Lcom/tinder/session/analytics/settingsemail/EmailSettingsAnalyticsPayload;", "maskEmail", "Lcom/tinder/domain/auth/usecase/MaskEmail;", "(Lcom/tinder/domain/auth/usecase/MaskEmail;)V", "createEmailSettingOptionsPayload", "", "", "", "emailSettings", "invoke", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.session.analytics.a.a */
public final class C18051a implements Function1<EmailSettings, C14832c> {
    @Deprecated
    /* renamed from: a */
    public static final C14831a f56058a = new C14831a();
    /* renamed from: b */
    private final MaskEmail f56059b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/session/analytics/settingsemail/CreateEmailSettingsAnalyticsPayload$Companion;", "", "()V", "FIELD_EMAIL_SETTINGS_MESSAGES", "", "FIELD_EMAIL_SETTINGS_NEW_MATCHES", "FIELD_EMAIL_SETTINGS_PROMOTIONS", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.analytics.a.a$a */
    private static final class C14831a {
        private C14831a() {
        }
    }

    @Inject
    public C18051a(@NotNull MaskEmail maskEmail) {
        C2668g.b(maskEmail, "maskEmail");
        this.f56059b = maskEmail;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m65529a((EmailSettings) obj);
    }

    @NotNull
    /* renamed from: a */
    public C14832c m65529a(@NotNull EmailSettings emailSettings) {
        C2668g.b(emailSettings, "emailSettings");
        return new C14832c(this.f56059b.invoke(emailSettings.getEmailAddress()), emailSettings.getEmailAddress() != null ? m65528b(emailSettings) : null);
    }

    /* renamed from: b */
    private final Map<String, Boolean> m65528b(EmailSettings emailSettings) {
        return ah.m66889a(C15811g.m59834a("new_matches", Boolean.valueOf(emailSettings.getOption(EmailSettingType.NEW_MATCHES).getEnabled())), C15811g.m59834a(ManagerWebServices.PARAM_MESSAGES, Boolean.valueOf(emailSettings.getOption(EmailSettingType.NEW_MESSAGES).getEnabled())), C15811g.m59834a("promotions", Boolean.valueOf(emailSettings.getOption(EmailSettingType.PROMOTIONS).getEnabled())));
    }
}
