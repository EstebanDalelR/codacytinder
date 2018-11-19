package com.tinder.smsauth.ui.viewmodel;

import android.arch.core.util.Function;
import android.arch.lifecycle.C0028m;
import android.arch.lifecycle.C0029n;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveDataReactiveStreams;
import com.tinder.smsauth.domain.usecase.C18098g;
import com.tinder.smsauth.domain.usecase.C18100i;
import com.tinder.smsauth.domain.usecase.C18104n;
import com.tinder.smsauth.domain.usecase.C18112v;
import com.tinder.smsauth.entity.Flow.C14974c;
import com.tinder.smsauth.entity.Flow.C14974c.C16740b;
import io.reactivex.functions.Predicate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/tinder/smsauth/ui/viewmodel/PhoneNumberCollectionViewModel;", "Landroid/arch/lifecycle/ViewModel;", "requestCountryCodeList", "Lcom/tinder/smsauth/domain/usecase/RequestCountryCodeList;", "updatePhoneNumberText", "Lcom/tinder/smsauth/domain/usecase/UpdatePhoneNumberText;", "proceedToNextStep", "Lcom/tinder/smsauth/domain/usecase/ProceedToNextStep;", "observeStateUpdates", "Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;", "(Lcom/tinder/smsauth/domain/usecase/RequestCountryCodeList;Lcom/tinder/smsauth/domain/usecase/UpdatePhoneNumberText;Lcom/tinder/smsauth/domain/usecase/ProceedToNextStep;Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;)V", "getProceedToNextStep", "()Lcom/tinder/smsauth/domain/usecase/ProceedToNextStep;", "getRequestCountryCodeList", "()Lcom/tinder/smsauth/domain/usecase/RequestCountryCodeList;", "shouldRequestPhoneNumberHint", "Landroid/arch/lifecycle/LiveData;", "", "getShouldRequestPhoneNumberHint", "()Landroid/arch/lifecycle/LiveData;", "stateUpdates", "Lcom/tinder/smsauth/entity/Flow$State$CollectingPhoneNumber;", "getStateUpdates", "getUpdatePhoneNumberText", "()Lcom/tinder/smsauth/domain/usecase/UpdatePhoneNumberText;", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class PhoneNumberCollectionViewModel extends C0029n {
    @NotNull
    /* renamed from: a */
    private final LiveData<C16740b> f51872a;
    @NotNull
    /* renamed from: b */
    private final LiveData<Boolean> f51873b;
    @NotNull
    /* renamed from: c */
    private final C18104n f51874c;
    @NotNull
    /* renamed from: d */
    private final C18112v f51875d;
    @NotNull
    /* renamed from: e */
    private final C18100i f51876e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/entity/Flow$State$CollectingPhoneNumber;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.viewmodel.PhoneNumberCollectionViewModel$a */
    static final class C16816a<I, O> implements Function<X, Y> {
        /* renamed from: a */
        public static final C16816a f51870a = new C16816a();

        C16816a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m62365a((C16740b) obj));
        }

        /* renamed from: a */
        public final boolean m62365a(C16740b c16740b) {
            return ((CharSequence) c16740b.mo12366a().m56580a().m56577c()).length() == null ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/smsauth/entity/Flow$State;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.viewmodel.PhoneNumberCollectionViewModel$b */
    static final class C16817b<T> implements Predicate<C14974c> {
        /* renamed from: a */
        public static final C16817b f51871a = new C16817b();

        C16817b() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62366a((C14974c) obj);
        }

        /* renamed from: a */
        public final boolean m62366a(@NotNull C14974c c14974c) {
            C2668g.b(c14974c, "it");
            return c14974c instanceof C16740b;
        }
    }

    @NotNull
    /* renamed from: d */
    public final C18104n m62369d() {
        return this.f51874c;
    }

    @NotNull
    /* renamed from: e */
    public final C18112v m62370e() {
        return this.f51875d;
    }

    @NotNull
    /* renamed from: f */
    public final C18100i m62371f() {
        return this.f51876e;
    }

    @Inject
    public PhoneNumberCollectionViewModel(@NotNull C18104n c18104n, @NotNull C18112v c18112v, @NotNull C18100i c18100i, @NotNull C18098g c18098g) {
        C2668g.b(c18104n, "requestCountryCodeList");
        C2668g.b(c18112v, "updatePhoneNumberText");
        C2668g.b(c18100i, "proceedToNextStep");
        C2668g.b(c18098g, "observeStateUpdates");
        this.f51874c = c18104n;
        this.f51875d = c18112v;
        this.f51876e = c18100i;
        c18104n = LiveDataReactiveStreams.a(c18098g.m65698a().a((Predicate) C16817b.f51871a).a(C16740b.class));
        C2668g.a(c18104n, "LiveDataReactiveStreams.…er::class.java)\n        )");
        this.f51872a = c18104n;
        c18104n = C0028m.a(this.f51872a, (Function) C16816a.f51870a);
        C2668g.a(c18104n, "Transformations.map(stat…alNumber.isEmpty()\n    })");
        this.f51873b = c18104n;
    }

    @NotNull
    /* renamed from: b */
    public final LiveData<C16740b> m62367b() {
        return this.f51872a;
    }

    @NotNull
    /* renamed from: c */
    public final LiveData<Boolean> m62368c() {
        return this.f51873b;
    }
}
