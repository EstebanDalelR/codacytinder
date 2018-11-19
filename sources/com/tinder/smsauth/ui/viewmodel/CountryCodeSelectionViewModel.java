package com.tinder.smsauth.ui.viewmodel;

import android.arch.core.util.Function;
import android.arch.lifecycle.C0028m;
import android.arch.lifecycle.C0029n;
import android.arch.lifecycle.C2686i;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveDataReactiveStreams;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.logger.Logger;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.smsauth.domain.usecase.C18094c;
import com.tinder.smsauth.domain.usecase.C18108r;
import com.tinder.smsauth.entity.C14975c;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/smsauth/ui/viewmodel/CountryCodeSelectionViewModel;", "Landroid/arch/lifecycle/ViewModel;", "updateCountryCode", "Lcom/tinder/smsauth/domain/usecase/UpdateCountryCode;", "loadCountries", "Lcom/tinder/smsauth/domain/usecase/LoadCountries;", "schedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/smsauth/domain/usecase/UpdateCountryCode;Lcom/tinder/smsauth/domain/usecase/LoadCountries;Lcom/tinder/common/reactivex/schedulers/Schedulers;Lcom/tinder/common/logger/Logger;)V", "countries", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/tinder/smsauth/entity/Country;", "getCountries", "()Landroid/arch/lifecycle/LiveData;", "query", "Landroid/arch/lifecycle/MutableLiveData;", "", "getQuery", "()Landroid/arch/lifecycle/MutableLiveData;", "onCountrySelected", "", "country", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class CountryCodeSelectionViewModel extends C0029n {
    @NotNull
    /* renamed from: a */
    private final C2686i<String> f51850a = new C2686i();
    @NotNull
    /* renamed from: b */
    private final LiveData<List<C14975c>> f51851b;
    /* renamed from: c */
    private final C18108r f51852c;
    /* renamed from: d */
    private final C18094c f51853d;
    /* renamed from: e */
    private final Schedulers f51854e;
    /* renamed from: f */
    private final Logger f51855f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/tinder/smsauth/entity/Country;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.viewmodel.CountryCodeSelectionViewModel$a */
    static final class C16809a<I, O> implements Function<X, LiveData<Y>> {
        /* renamed from: a */
        final /* synthetic */ CountryCodeSelectionViewModel f51849a;

        C16809a(CountryCodeSelectionViewModel countryCodeSelectionViewModel) {
            this.f51849a = countryCodeSelectionViewModel;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62344a((String) obj);
        }

        @NotNull
        /* renamed from: a */
        public final LiveData<List<C14975c>> m62344a(String str) {
            C18094c a = this.f51849a.f51853d;
            C2668g.a(str, "it");
            return LiveDataReactiveStreams.a(a.m65690a(str).d().b(this.f51849a.f51854e.io()).a(this.f51849a.f51854e.mainThread()).g(new io.reactivex.functions.Function<Throwable, List<? extends C14975c>>() {
                public /* synthetic */ Object apply(Object obj) {
                    return m62343a((Throwable) obj);
                }

                @NotNull
                /* renamed from: a */
                public final List<C14975c> m62343a(@NotNull Throwable th) {
                    C2668g.b(th, "it");
                    this.f51849a.f51855f.error(th, "Error loading country codes");
                    return C17554o.m64195a();
                }
            }));
        }
    }

    @Inject
    public CountryCodeSelectionViewModel(@NotNull C18108r c18108r, @NotNull C18094c c18094c, @NotNull Schedulers schedulers, @NotNull Logger logger) {
        C2668g.b(c18108r, "updateCountryCode");
        C2668g.b(c18094c, "loadCountries");
        C2668g.b(schedulers, "schedulers");
        C2668g.b(logger, "logger");
        this.f51852c = c18108r;
        this.f51853d = c18094c;
        this.f51854e = schedulers;
        this.f51855f = logger;
        c18108r = C0028m.b((LiveData) this.f51850a, (Function) new C16809a(this));
        C2668g.a(c18108r, "Transformations.switchMa…t()\n            })\n    })");
        this.f51851b = c18108r;
    }

    @NotNull
    /* renamed from: b */
    public final C2686i<String> m62349b() {
        return this.f51850a;
    }

    @NotNull
    /* renamed from: c */
    public final LiveData<List<C14975c>> m62350c() {
        return this.f51851b;
    }

    /* renamed from: a */
    public final void m62348a(@NotNull C14975c c14975c) {
        C2668g.b(c14975c, ManagerWebServices.PARAM_COUNTRY);
        this.f51852c.m65720a(c14975c.m56562b());
    }
}
