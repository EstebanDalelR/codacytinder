package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.entity.C14975c;
import com.tinder.smsauth.entity.CountryCodeRepository;
import io.reactivex.C3960g;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/smsauth/domain/usecase/LoadCountries;", "Lkotlin/Function1;", "", "Lio/reactivex/Single;", "", "Lcom/tinder/smsauth/entity/Country;", "countryCodeRepository", "Lcom/tinder/smsauth/entity/CountryCodeRepository;", "(Lcom/tinder/smsauth/entity/CountryCodeRepository;)V", "invoke", "query", "domain"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.domain.usecase.c */
public final class C18094c implements Function1<String, C3960g<List<? extends C14975c>>> {
    /* renamed from: a */
    private final CountryCodeRepository f56189a;

    @Inject
    public C18094c(@NotNull CountryCodeRepository countryCodeRepository) {
        C2668g.b(countryCodeRepository, "countryCodeRepository");
        this.f56189a = countryCodeRepository;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m65690a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3960g<List<C14975c>> m65690a(@NotNull String str) {
        C2668g.b(str, "query");
        return this.f56189a.loadCountries(str);
    }
}
