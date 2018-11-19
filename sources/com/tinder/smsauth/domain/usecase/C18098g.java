package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import com.tinder.smsauth.entity.Flow.C14974c;
import io.reactivex.C3957b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;", "Lkotlin/Function0;", "Lio/reactivex/Flowable;", "Lcom/tinder/smsauth/entity/Flow$State;", "coordinator", "Lcom/tinder/smsauth/core/SmsAuthFlowCoordinator;", "(Lcom/tinder/smsauth/core/SmsAuthFlowCoordinator;)V", "invoke", "domain"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.domain.usecase.g */
public final class C18098g implements Function0<C3957b<C14974c>> {
    /* renamed from: a */
    private final C14964a f56193a;

    @Inject
    public C18098g(@NotNull C14964a c14964a) {
        C2668g.b(c14964a, "coordinator");
        this.f56193a = c14964a;
    }

    public /* synthetic */ Object invoke() {
        return m65698a();
    }

    @NotNull
    /* renamed from: a */
    public C3957b<C14974c> m65698a() {
        return this.f56193a.m56532a();
    }
}
