package com.tinder.settingsemail.email.component;

import android.app.Activity;
import android.content.res.Resources;
import com.tinder.common.logger.Logger;
import com.tinder.domain.auth.usecase.RegexEmailValidator;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import com.tinder.domain.settings.email.usecase.LoadEmailDisplaySettings;
import com.tinder.domain.settings.email.usecase.SaveEmailSettings;
import com.tinder.settingsemail.email.adapter.EmailSettingsAdapter;
import com.tinder.settingsemail.email.component.EmailSettingsComponent.Builder;
import com.tinder.settingsemail.email.p408a.C14922a;
import com.tinder.settingsemail.email.p409b.C14926a;
import com.tinder.settingsemail.email.p409b.C18081b;
import com.tinder.settingsemail.email.p410c.C14927a;
import com.tinder.settingsemail.email.shadowrepository.C14929a;
import com.tinder.settingsemail.email.view.C16708a;
import com.tinder.settingsemail.email.view.C16709b;
import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel.C14934a;
import dagger.internal.C15521i;

/* renamed from: com.tinder.settingsemail.email.component.a */
public final class C16703a implements EmailSettingsComponent {
    /* renamed from: a */
    private EmailSettingsComponent$Parent f51680a;
    /* renamed from: b */
    private C14926a f51681b;
    /* renamed from: c */
    private Activity f51682c;

    /* renamed from: com.tinder.settingsemail.email.component.a$a */
    private static final class C16702a implements Builder {
        /* renamed from: a */
        private C14926a f51677a;
        /* renamed from: b */
        private EmailSettingsComponent$Parent f51678b;
        /* renamed from: c */
        private Activity f51679c;

        private C16702a() {
        }

        public /* synthetic */ Builder activity(Activity activity) {
            return m62203a(activity);
        }

        public /* synthetic */ Builder parent(EmailSettingsComponent$Parent emailSettingsComponent$Parent) {
            return m62204a(emailSettingsComponent$Parent);
        }

        public EmailSettingsComponent build() {
            if (this.f51677a == null) {
                this.f51677a = new C14926a();
            }
            StringBuilder stringBuilder;
            if (this.f51678b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(EmailSettingsComponent$Parent.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f51679c != null) {
                return new C16703a();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Activity.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        public C16702a m62204a(EmailSettingsComponent$Parent emailSettingsComponent$Parent) {
            this.f51678b = (EmailSettingsComponent$Parent) C15521i.m58000a(emailSettingsComponent$Parent);
            return this;
        }

        /* renamed from: a */
        public C16702a m62203a(Activity activity) {
            this.f51679c = (Activity) C15521i.m58000a(activity);
            return this;
        }
    }

    private C16703a(C16702a c16702a) {
        m62207a(c16702a);
    }

    /* renamed from: a */
    public static Builder m62205a() {
        return new C16702a();
    }

    /* renamed from: b */
    private C14929a m62208b() {
        return new C14929a((LoadEmailDisplaySettings) C15521i.m58001a(this.f51680a.provideLoadEmailDisplaySettings(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: c */
    private Resources m62209c() {
        return C18081b.m65659a(this.f51681b, this.f51682c);
    }

    /* renamed from: d */
    private C14934a m62210d() {
        return new C14934a(m62209c());
    }

    /* renamed from: e */
    private SaveEmailSettings m62211e() {
        return new SaveEmailSettings((ProfileRemoteRepository) C15521i.m58001a(this.f51680a.profileRemoteRepository(), "Cannot return null from a non-@Nullable component method"), (Logger) C15521i.m58001a(this.f51680a.provideLogger(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: f */
    private C14927a m62212f() {
        return new C14927a(m62208b(), m62210d(), new C14922a(), m62211e(), new RegexEmailValidator());
    }

    /* renamed from: a */
    private void m62207a(C16702a c16702a) {
        this.f51680a = c16702a.f51678b;
        this.f51681b = c16702a.f51677a;
        this.f51682c = c16702a.f51679c;
    }

    public void inject(C16708a c16708a) {
        m62206a(c16708a);
    }

    /* renamed from: a */
    private C16708a m62206a(C16708a c16708a) {
        C16709b.m62216a(c16708a, m62212f());
        C16709b.m62215a(c16708a, new EmailSettingsAdapter());
        return c16708a;
    }
}
