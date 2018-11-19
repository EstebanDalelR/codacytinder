package com.tinder.settingsemail.email.shadowrepository;

import com.tinder.domain.settings.email.model.EmailDisplaySettings;
import com.tinder.domain.settings.email.model.EmailSettings;
import com.tinder.domain.settings.email.usecase.LoadEmailDisplaySettings;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/settingsemail/email/shadowrepository/EmailDisplaySettingsShadowRepository;", "", "loadEmailDisplaySettings", "Lcom/tinder/domain/settings/email/usecase/LoadEmailDisplaySettings;", "(Lcom/tinder/domain/settings/email/usecase/LoadEmailDisplaySettings;)V", "behaviorSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/domain/settings/email/model/EmailDisplaySettings;", "kotlin.jvm.PlatformType", "get", "observe", "Lio/reactivex/Observable;", "update", "", "newEmailSettings", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settingsemail.email.shadowrepository.a */
public final class C14929a {
    /* renamed from: a */
    private final C19040a<EmailDisplaySettings> f46627a = C19040a.m67694a();
    /* renamed from: b */
    private final LoadEmailDisplaySettings f46628b;

    @Inject
    public C14929a(@NotNull LoadEmailDisplaySettings loadEmailDisplaySettings) {
        C2668g.b(loadEmailDisplaySettings, "loadEmailDisplaySettings");
        this.f46628b = loadEmailDisplaySettings;
    }

    @NotNull
    /* renamed from: a */
    public final EmailDisplaySettings m56403a() {
        C19040a c19040a = this.f46627a;
        C2668g.a(c19040a, "behaviorSubject");
        Object b = c19040a.m67697b();
        if (b != null) {
            return (EmailDisplaySettings) b;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final void m56404a(@NotNull EmailSettings emailSettings) {
        C2668g.b(emailSettings, "newEmailSettings");
        if ((C2668g.a(emailSettings, m56403a().getEmailSettings()) ^ 1) != 0) {
            this.f46627a.onNext(new EmailDisplaySettings(emailSettings, m56403a().getCanEditEmail()));
        }
    }

    @NotNull
    /* renamed from: b */
    public final C3959e<EmailDisplaySettings> m56405b() {
        C3959e<EmailDisplaySettings> distinctUntilChanged = this.f46628b.execute().doOnNext(new C16704b(new EmailDisplaySettingsShadowRepository$observe$1(this.f46627a))).mergeWith(this.f46627a).distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "loadEmailDisplaySettings…  .distinctUntilChanged()");
        return distinctUntilChanged;
    }
}
