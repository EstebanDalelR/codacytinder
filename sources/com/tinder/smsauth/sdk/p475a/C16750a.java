package com.tinder.smsauth.sdk.p475a;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.tinder.common.logger.Logger;
import com.tinder.common.p194f.C8532a;
import com.tinder.smsauth.entity.C14980h;
import com.tinder.smsauth.entity.C14981i;
import com.tinder.smsauth.entity.PhoneNumberFormatValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/smsauth/sdk/validator/GoogleI18nPhoneNumberFormatValidator;", "Lcom/tinder/smsauth/entity/PhoneNumberFormatValidator;", "phoneNumberUtil", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;", "defaultLocaleProvider", "Lcom/tinder/common/locale/DefaultLocaleProvider;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/google/i18n/phonenumbers/PhoneNumberUtil;Lcom/tinder/common/locale/DefaultLocaleProvider;Lcom/tinder/common/logger/Logger;)V", "regionCode", "", "phoneNumber", "Lcom/tinder/smsauth/entity/PhoneNumber;", "regionCodeForDefaultLocale", "validate", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "sdk_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.sdk.a.a */
public final class C16750a implements PhoneNumberFormatValidator {
    /* renamed from: a */
    private final PhoneNumberUtil f51755a;
    /* renamed from: b */
    private final C8532a f51756b;
    /* renamed from: c */
    private final Logger f51757c;

    public C16750a(@NotNull PhoneNumberUtil phoneNumberUtil, @NotNull C8532a c8532a, @NotNull Logger logger) {
        C2668g.b(phoneNumberUtil, "phoneNumberUtil");
        C2668g.b(c8532a, "defaultLocaleProvider");
        C2668g.b(logger, "logger");
        this.f51755a = phoneNumberUtil;
        this.f51756b = c8532a;
        this.f51757c = logger;
    }

    @NotNull
    public C14981i validate(@NotNull C14980h c14980h) {
        String a;
        String str;
        String str2;
        C2668g.b(c14980h, "phoneNumber");
        String c = c14980h.m56577c();
        String d = c14980h.m56578d();
        String e = c14980h.m56579e();
        String a2 = m62265a(c14980h);
        int c2 = this.f51755a.c(a2);
        try {
            c14980h = this.f51755a.b(c14980h.m56577c(), a2);
            a = this.f51755a.a(c14980h, PhoneNumberFormat.NATIONAL);
            C2668g.a(a, "phoneNumberUtil.format(p…oneNumberFormat.NATIONAL)");
            try {
                c = this.f51755a.a(c14980h, PhoneNumberFormat.INTERNATIONAL);
                C2668g.a(c, "phoneNumberUtil.format(p…mberFormat.INTERNATIONAL)");
            } catch (NumberParseException e2) {
                c14980h = e2;
                this.f51757c.error((Throwable) c14980h, "Unable to validate phone number.");
                c14980h = null;
                str = d;
                str2 = e;
                return new C14981i(new C14980h(c2, a2, a, str, str2), c14980h);
            }
            try {
                d = this.f51755a.a(c14980h, PhoneNumberFormat.E164);
                C2668g.a(d, "phoneNumberUtil.format(p…, PhoneNumberFormat.E164)");
                try {
                    c14980h = this.f51755a.b(c14980h);
                    str = c;
                    str2 = d;
                } catch (NumberParseException e3) {
                    c14980h = e3;
                    e = d;
                    d = c;
                    this.f51757c.error((Throwable) c14980h, "Unable to validate phone number.");
                    c14980h = null;
                    str = d;
                    str2 = e;
                    return new C14981i(new C14980h(c2, a2, a, str, str2), c14980h);
                }
            } catch (NumberParseException e4) {
                c14980h = e4;
                d = c;
                this.f51757c.error((Throwable) c14980h, "Unable to validate phone number.");
                c14980h = null;
                str = d;
                str2 = e;
                return new C14981i(new C14980h(c2, a2, a, str, str2), c14980h);
            }
        } catch (NumberParseException e5) {
            c14980h = e5;
            a = c;
            this.f51757c.error((Throwable) c14980h, "Unable to validate phone number.");
            c14980h = null;
            str = d;
            str2 = e;
            return new C14981i(new C14980h(c2, a2, a, str, str2), c14980h);
        }
        return new C14981i(new C14980h(c2, a2, a, str, str2), c14980h);
    }

    /* renamed from: a */
    private final String m62265a(C14980h c14980h) {
        String b = c14980h.m56576b();
        if (b.hashCode() == 0) {
            if (b.equals("")) {
                return m62264a();
            }
        }
        return c14980h.m56576b();
    }

    /* renamed from: a */
    private final String m62264a() {
        String country = this.f51756b.a().getCountry();
        C2668g.a(country, "defaultLocaleProvider.get().country");
        return country;
    }
}
