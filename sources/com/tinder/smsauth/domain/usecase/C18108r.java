package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/smsauth/domain/usecase/UpdateCountryCode;", "Lkotlin/Function1;", "", "", "coordinator", "Lcom/tinder/smsauth/core/SmsAuthFlowCoordinator;", "(Lcom/tinder/smsauth/core/SmsAuthFlowCoordinator;)V", "invoke", "regionCode", "domain"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.domain.usecase.r */
public final class C18108r implements Function1<String, C15813i> {
    /* renamed from: a */
    private final C14964a f56203a;

    @Inject
    public C18108r(@NotNull C14964a c14964a) {
        C2668g.b(c14964a, "coordinator");
        this.f56203a = c14964a;
    }

    public /* synthetic */ Object invoke(Object obj) {
        m65720a((String) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public void m65720a(@NotNull String str) {
        C2668g.b(str, "regionCode");
        this.f56203a.m56533a(str);
    }
}
