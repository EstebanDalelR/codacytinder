package com.tinder.settingsemail.email.p410c;

import com.tinder.domain.auth.usecase.RegexEmailValidator;
import com.tinder.domain.settings.email.model.EmailDisplaySettings;
import com.tinder.domain.settings.email.model.EmailSettingOption;
import com.tinder.domain.settings.email.model.EmailSettingType;
import com.tinder.domain.settings.email.model.EmailSettings;
import com.tinder.domain.settings.email.usecase.SaveEmailSettings;
import com.tinder.settingsemail.email.p408a.C14922a;
import com.tinder.settingsemail.email.shadowrepository.C14929a;
import com.tinder.settingsemail.email.target.EmailSettingsTarget;
import com.tinder.settingsemail.email.viewmodel.C14936e;
import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel;
import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel.C14934a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\b\u001a\u00020\u0014H\u0002J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0014J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/settingsemail/email/presenter/EmailSettingsPresenter;", "", "shadowRepository", "Lcom/tinder/settingsemail/email/shadowrepository/EmailDisplaySettingsShadowRepository;", "emailSettingsRowViewModelFactory", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel$Factory;", "emailSettingsInteractor", "Lcom/tinder/settingsemail/email/interactor/EmailSettingsInteractor;", "saveEmailSettings", "Lcom/tinder/domain/settings/email/usecase/SaveEmailSettings;", "regexEmailValidator", "Lcom/tinder/domain/auth/usecase/RegexEmailValidator;", "(Lcom/tinder/settingsemail/email/shadowrepository/EmailDisplaySettingsShadowRepository;Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel$Factory;Lcom/tinder/settingsemail/email/interactor/EmailSettingsInteractor;Lcom/tinder/domain/settings/email/usecase/SaveEmailSettings;Lcom/tinder/domain/auth/usecase/RegexEmailValidator;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "hasCheckedOptions", "", "target", "Lcom/tinder/settingsemail/email/target/EmailSettingsTarget;", "dropTarget", "", "observeEmailSettings", "onEmailAddressChanged", "emailAddress", "", "onEmailSettingChanged", "emailSettingOption", "Lcom/tinder/domain/settings/email/model/EmailSettingOption;", "takeTarget", "toggleAllEmailOptions", "updateEmailSettings", "emailSettings", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settingsemail.email.c.a */
public final class C14927a {
    /* renamed from: a */
    private boolean f46619a = true;
    /* renamed from: b */
    private EmailSettingsTarget f46620b;
    /* renamed from: c */
    private Disposable f46621c;
    /* renamed from: d */
    private final C14929a f46622d;
    /* renamed from: e */
    private final C14934a f46623e;
    /* renamed from: f */
    private final C14922a f46624f;
    /* renamed from: g */
    private final SaveEmailSettings f46625g;
    /* renamed from: h */
    private final RegexEmailValidator f46626h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "it", "Lcom/tinder/domain/settings/email/model/EmailDisplaySettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settingsemail.email.c.a$a */
    static final class C16698a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14927a f51673a;

        C16698a(C14927a c14927a) {
            this.f51673a = c14927a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62196a((EmailDisplaySettings) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<EmailSettingsRowViewModel> m62196a(@NotNull EmailDisplaySettings emailDisplaySettings) {
            C2668g.b(emailDisplaySettings, "it");
            this.f51673a.f46619a = emailDisplaySettings.getEmailSettings().getAreOptionsEnabled();
            return this.f51673a.f46623e.m56413a(emailDisplaySettings.getEmailSettings(), this.f51673a.f46626h.isValid(emailDisplaySettings.getEmailSettings().getEmailAddress()), emailDisplaySettings.getCanEditEmail());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsViewModel;", "it", "", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settingsemail.email.c.a$b */
    static final class C16699b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14927a f51674a;

        C16699b(C14927a c14927a) {
            this.f51674a = c14927a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62197a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C14936e m62197a(@NotNull List<? extends EmailSettingsRowViewModel> list) {
            C2668g.b(list, "it");
            return new C14936e(list, this.f51674a.f46619a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsViewModel;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settingsemail.email.c.a$c */
    static final class C16700c<T> implements Consumer<C14936e> {
        /* renamed from: a */
        final /* synthetic */ C14927a f51675a;

        C16700c(C14927a c14927a) {
            this.f51675a = c14927a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62198a((C14936e) obj);
        }

        /* renamed from: a */
        public final void m62198a(C14936e c14936e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Email settings are: ");
            stringBuilder.append(c14936e.m56414a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
            EmailSettingsTarget d = this.f51675a.f46620b;
            if (d != null) {
                C2668g.a(c14936e, "it");
                d.bind(c14936e);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settingsemail.email.c.a$d */
    static final class C16701d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16701d f51676a = new C16701d();

        C16701d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62199a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62199a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error observing email settings from shadow provider with error: ");
            stringBuilder.append(th);
            C0001a.e(stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C14927a(@NotNull C14929a c14929a, @NotNull C14934a c14934a, @NotNull C14922a c14922a, @NotNull SaveEmailSettings saveEmailSettings, @NotNull RegexEmailValidator regexEmailValidator) {
        C2668g.b(c14929a, "shadowRepository");
        C2668g.b(c14934a, "emailSettingsRowViewModelFactory");
        C2668g.b(c14922a, "emailSettingsInteractor");
        C2668g.b(saveEmailSettings, "saveEmailSettings");
        C2668g.b(regexEmailValidator, "regexEmailValidator");
        this.f46622d = c14929a;
        this.f46623e = c14934a;
        this.f46624f = c14922a;
        this.f46625g = saveEmailSettings;
        this.f46626h = regexEmailValidator;
    }

    /* renamed from: a */
    public final void m56400a(@NotNull EmailSettingsTarget emailSettingsTarget) {
        C2668g.b(emailSettingsTarget, "target");
        this.f46620b = emailSettingsTarget;
        m56397d();
    }

    /* renamed from: a */
    public final void m56398a() {
        m56395c();
        this.f46620b = (EmailSettingsTarget) null;
        Disposable disposable = this.f46621c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: b */
    public final void m56402b() {
        EmailDisplaySettings a = this.f46622d.m56403a();
        if (a == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Set a2;
        String emailAddress = a.getEmailSettings().getEmailAddress();
        if (this.f46619a) {
            a2 = am.m64178a((Object[]) new EmailSettingOption[]{new EmailSettingOption(EmailSettingType.NEW_MATCHES, false), new EmailSettingOption(EmailSettingType.NEW_MESSAGES, false), new EmailSettingOption(EmailSettingType.PROMOTIONS, false)});
        } else {
            a2 = am.m64178a((Object[]) new EmailSettingOption[]{new EmailSettingOption(EmailSettingType.NEW_MATCHES, true), new EmailSettingOption(EmailSettingType.NEW_MESSAGES, true), new EmailSettingOption(EmailSettingType.PROMOTIONS, true)});
        }
        m56390a(new EmailSettings(emailAddress, a2));
    }

    /* renamed from: a */
    public final void m56399a(@NotNull EmailSettingOption emailSettingOption) {
        C2668g.b(emailSettingOption, "emailSettingOption");
        EmailDisplaySettings a = this.f46622d.m56403a();
        if (a == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        m56390a(new EmailSettings(a.getEmailSettings().getEmailAddress(), this.f46624f.m56386a(a.getEmailSettings(), emailSettingOption)));
    }

    /* renamed from: a */
    public final void m56401a(@NotNull String str) {
        C2668g.b(str, "emailAddress");
        m56390a(new EmailSettings(str, this.f46622d.m56403a().getEmailSettings().getOptions()));
    }

    /* renamed from: c */
    private final void m56395c() {
        EmailDisplaySettings a = this.f46622d.m56403a();
        if (this.f46626h.isValid(a.getEmailSettings().getEmailAddress())) {
            this.f46625g.execute(a.getEmailSettings());
        }
    }

    /* renamed from: d */
    private final void m56397d() {
        this.f46621c = this.f46622d.m56405b().map(new C16698a(this)).map(new C16699b(this)).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C16700c(this), C16701d.f51676a);
    }

    /* renamed from: a */
    private final void m56390a(EmailSettings emailSettings) {
        this.f46622d.m56404a(emailSettings);
    }
}
