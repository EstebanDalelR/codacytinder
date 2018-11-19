package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/smsauth/domain/usecase/UpdateOneTimePasswordCodeText;", "Lkotlin/Function2;", "", "", "", "coordinator", "Lcom/tinder/smsauth/core/SmsAuthFlowCoordinator;", "(Lcom/tinder/smsauth/core/SmsAuthFlowCoordinator;)V", "invoke", "oneTimePasswordCodeText", "isAutoPopulated", "domain"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.domain.usecase.t */
public final class C18110t implements Function2<String, Boolean, C15813i> {
    /* renamed from: a */
    private final C14964a f56205a;

    @Inject
    public C18110t(@NotNull C14964a c14964a) {
        C2668g.b(c14964a, "coordinator");
        this.f56205a = c14964a;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        m65724a((String) obj, ((Boolean) obj2).booleanValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public void m65724a(@NotNull String str, boolean z) {
        C2668g.b(str, "oneTimePasswordCodeText");
        this.f56205a.m56536b(str, z);
    }
}
