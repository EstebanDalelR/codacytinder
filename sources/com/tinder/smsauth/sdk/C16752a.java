package com.tinder.smsauth.sdk;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.p194f.C8532a;
import com.tinder.smsauth.entity.C14975c;
import com.tinder.smsauth.entity.CountryCodeRepository;
import io.reactivex.C3960g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.p458a.C15798b;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/smsauth/sdk/GoogleI18NCountryCodeRepository;", "Lcom/tinder/smsauth/entity/CountryCodeRepository;", "phoneNumberUtil", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;", "defaultLocaleProvider", "Lcom/tinder/common/locale/DefaultLocaleProvider;", "(Lcom/google/i18n/phonenumbers/PhoneNumberUtil;Lcom/tinder/common/locale/DefaultLocaleProvider;)V", "cache", "Lcom/tinder/smsauth/sdk/GoogleI18NCountryCodeRepository$CachedCountries;", "allCountries", "", "Lcom/tinder/smsauth/entity/Country;", "loadCountries", "Lio/reactivex/Single;", "query", "", "loadCountriesInLocale", "locale", "Ljava/util/Locale;", "CachedCountries", "sdk_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.sdk.a */
public final class C16752a implements CountryCodeRepository {
    /* renamed from: a */
    private C14983a f51758a;
    /* renamed from: b */
    private final PhoneNumberUtil f51759b;
    /* renamed from: c */
    private final C8532a f51760c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/smsauth/sdk/GoogleI18NCountryCodeRepository$CachedCountries;", "", "locale", "Ljava/util/Locale;", "countries", "", "Lcom/tinder/smsauth/entity/Country;", "(Ljava/util/Locale;Ljava/util/List;)V", "getCountries", "()Ljava/util/List;", "getLocale", "()Ljava/util/Locale;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.sdk.a$a */
    private static final class C14983a {
        @NotNull
        /* renamed from: a */
        private final Locale f46758a;
        @NotNull
        /* renamed from: b */
        private final List<C14975c> f46759b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14983a) {
                    C14983a c14983a = (C14983a) obj;
                    if (C2668g.a(this.f46758a, c14983a.f46758a) && C2668g.a(this.f46759b, c14983a.f46759b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Locale locale = this.f46758a;
            int i = 0;
            int hashCode = (locale != null ? locale.hashCode() : 0) * 31;
            List list = this.f46759b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CachedCountries(locale=");
            stringBuilder.append(this.f46758a);
            stringBuilder.append(", countries=");
            stringBuilder.append(this.f46759b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14983a(@NotNull Locale locale, @NotNull List<C14975c> list) {
            C2668g.b(locale, ManagerWebServices.PARAM_LOCALE);
            C2668g.b(list, "countries");
            this.f46758a = locale;
            this.f46759b = list;
        }

        @NotNull
        /* renamed from: a */
        public final Locale m56584a() {
            return this.f46758a;
        }

        @NotNull
        /* renamed from: b */
        public final List<C14975c> m56585b() {
            return this.f46759b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/tinder/smsauth/entity/Country;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.sdk.a$b */
    static final class C14984b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C16752a f46760a;
        /* renamed from: b */
        final /* synthetic */ String f46761b;

        C14984b(C16752a c16752a, String str) {
            this.f46760a = c16752a;
            this.f46761b = str;
        }

        public /* synthetic */ Object call() {
            return m56586a();
        }

        @NotNull
        /* renamed from: a */
        public final List<C14975c> m56586a() {
            Collection arrayList = new ArrayList();
            for (Object next : this.f46760a.m62267a()) {
                C14975c c14975c = (C14975c) next;
                Object obj = null;
                if ((((CharSequence) this.f46761b).length() == 0 ? 1 : null) != null || C19298r.m68785b((CharSequence) c14975c.m56563c(), (CharSequence) this.f46761b, true) || C19298r.m68785b((CharSequence) c14975c.m56562b(), (CharSequence) this.f46761b, true) || C19298r.m68785b((CharSequence) String.valueOf(c14975c.m56561a()), (CharSequence) this.f46761b, true)) {
                    obj = 1;
                }
                if (obj != null) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.sdk.a$c */
    public static final class C14985c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C15798b.m59813a(((C14975c) t).m56563c(), ((C14975c) t2).m56563c());
        }
    }

    public C16752a(@NotNull PhoneNumberUtil phoneNumberUtil, @NotNull C8532a c8532a) {
        C2668g.b(phoneNumberUtil, "phoneNumberUtil");
        C2668g.b(c8532a, "defaultLocaleProvider");
        this.f51759b = phoneNumberUtil;
        this.f51760c = c8532a;
    }

    @NotNull
    public C3960g<List<C14975c>> loadCountries(@NotNull String str) {
        C2668g.b(str, "query");
        str = C3960g.c(new C14984b(this, str));
        C2668g.a(str, "Single.fromCallable {\n  …)\n            }\n        }");
        return str;
    }

    /* renamed from: a */
    private final List<C14975c> m62267a() {
        List<C14975c> b;
        Locale a = this.f51760c.a();
        synchronized (this) {
            C14983a c14983a = this.f51758a;
            if (c14983a != null) {
                b = C2668g.a(c14983a.m56584a(), a) ? c14983a.m56585b() : null;
                if (b != null) {
                }
            }
            C14983a a2 = m62266a(a);
            this.f51758a = a2;
            b = a2.m56585b();
        }
        return b;
    }

    /* renamed from: a */
    private final C14983a m62266a(Locale locale) {
        Set a = this.f51759b.a();
        C2668g.a(a, "phoneNumberUtil.supportedRegions");
        Iterable<String> iterable = a;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (String str : iterable) {
            int c = this.f51759b.c(str);
            C2668g.a(str, "regionCode");
            String displayCountry = new Locale(locale.getLanguage(), str).getDisplayCountry();
            C2668g.a(displayCountry, "Locale(locale.language, regionCode).displayCountry");
            arrayList.add(new C14975c(c, str, displayCountry));
        }
        return new C14983a(locale, C19299w.m68799a((Iterable) (List) arrayList, (Comparator) new C14985c()));
    }
}
