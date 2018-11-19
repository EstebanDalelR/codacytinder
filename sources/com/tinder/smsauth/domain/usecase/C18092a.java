package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/smsauth/domain/usecase/GoBackToPreviousStep;", "Lkotlin/Function0;", "", "coordinator", "Lcom/tinder/smsauth/core/SmsAuthFlowCoordinator;", "(Lcom/tinder/smsauth/core/SmsAuthFlowCoordinator;)V", "invoke", "domain"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.domain.usecase.a */
public final class C18092a implements Function0<C15813i> {
    /* renamed from: a */
    private final C14964a f56187a;

    @Inject
    public C18092a(@NotNull C14964a c14964a) {
        C2668g.b(c14964a, "coordinator");
        this.f56187a = c14964a;
    }

    public /* synthetic */ Object invoke() {
        m65686a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public void m65686a() {
        this.f56187a.m56540f();
    }
}
