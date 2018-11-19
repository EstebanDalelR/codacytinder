package com.tinder.smsauth.sdk.di;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.tinder.common.logger.Logger;
import com.tinder.common.p194f.C8532a;
import com.tinder.common.reactivex.p319a.p320a.C10696a;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.smsauth.entity.CountryCodeRepository;
import com.tinder.smsauth.entity.OneTimePasswordFormatValidator;
import com.tinder.smsauth.entity.PhoneNumberFormatValidator;
import com.tinder.smsauth.sdk.C16752a;
import com.tinder.smsauth.sdk.p475a.C16750a;
import com.tinder.smsauth.sdk.p475a.C16751b;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nH\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/smsauth/sdk/di/SmsAuthModule;", "", "()V", "provideCountryCodeRepository", "Lcom/tinder/smsauth/entity/CountryCodeRepository;", "phoneNumberUtil", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;", "defaultLocaleProvider", "Lcom/tinder/common/locale/DefaultLocaleProvider;", "provideLogger", "Lcom/tinder/common/logger/Logger;", "provideOneTimePasswordValidator", "Lcom/tinder/smsauth/entity/OneTimePasswordFormatValidator;", "providePhoneNumberUtil", "providePhoneValidator", "Lcom/tinder/smsauth/entity/PhoneNumberFormatValidator;", "logger", "provideSchedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "sdk_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.smsauth.sdk.di.k */
public final class C14996k {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"com/tinder/smsauth/sdk/di/SmsAuthModule$provideLogger$1", "Lcom/tinder/common/logger/Logger;", "()V", "debug", "", "message", "", "error", "throwable", "", "info", "verbose", "warn", "sdk_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.sdk.di.k$a */
    public static final class C16763a implements Logger {
        C16763a() {
        }

        public void verbose(@NotNull String str) {
            C2668g.b(str, "message");
            C0001a.a(str, new Object[0]);
        }

        public void debug(@NotNull String str) {
            C2668g.b(str, "message");
            C0001a.b(str, new Object[0]);
        }

        public void info(@NotNull String str) {
            C2668g.b(str, "message");
            C0001a.c(str, new Object[0]);
        }

        public void warn(@NotNull String str) {
            C2668g.b(str, "message");
            C0001a.d(str, new Object[0]);
        }

        public void warn(@NotNull Throwable th) {
            C2668g.b(th, "throwable");
            C0001a.b(th);
        }

        public void warn(@NotNull Throwable th, @NotNull String str) {
            C2668g.b(th, "throwable");
            C2668g.b(str, "message");
            C0001a.b(th, str, new Object[0]);
        }

        public void error(@NotNull String str) {
            C2668g.b(str, "message");
            C0001a.e(str, new Object[0]);
        }

        public void error(@NotNull Throwable th) {
            C2668g.b(th, "throwable");
            C0001a.c(th);
        }

        public void error(@NotNull Throwable th, @NotNull String str) {
            C2668g.b(th, "throwable");
            C2668g.b(str, "message");
            C0001a.c(th, str, new Object[0]);
        }
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final PhoneNumberFormatValidator m56602a(@NotNull PhoneNumberUtil phoneNumberUtil, @NotNull C8532a c8532a, @NotNull Logger logger) {
        C2668g.b(phoneNumberUtil, "phoneNumberUtil");
        C2668g.b(c8532a, "defaultLocaleProvider");
        C2668g.b(logger, "logger");
        return new C16750a(phoneNumberUtil, c8532a, logger);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final CountryCodeRepository m56601a(@NotNull PhoneNumberUtil phoneNumberUtil, @NotNull C8532a c8532a) {
        C2668g.b(phoneNumberUtil, "phoneNumberUtil");
        C2668g.b(c8532a, "defaultLocaleProvider");
        return new C16752a(phoneNumberUtil, c8532a);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final PhoneNumberUtil m56600a() {
        PhoneNumberUtil b = PhoneNumberUtil.b();
        C2668g.a(b, "PhoneNumberUtil.getInstance()");
        return b;
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final OneTimePasswordFormatValidator m56603b() {
        return new C16751b();
    }

    @NotNull
    @Provides
    /* renamed from: c */
    public final Schedulers m56604c() {
        return C10696a.f35038a;
    }

    @NotNull
    @Provides
    /* renamed from: d */
    public final Logger m56605d() {
        return new C16763a();
    }
}
