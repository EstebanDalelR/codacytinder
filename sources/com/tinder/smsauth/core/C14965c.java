package com.tinder.smsauth.core;

import com.tinder.common.statemachine.C8561a;
import com.tinder.smsauth.entity.C14980h;
import com.tinder.smsauth.entity.C14981i;
import com.tinder.smsauth.entity.Flow.C14972a;
import com.tinder.smsauth.entity.Flow.C14973b;
import com.tinder.smsauth.entity.Flow.C14974c;
import com.tinder.smsauth.entity.Flow.C14974c.C16740b;
import com.tinder.smsauth.entity.OneTimePasswordFormatValidator;
import com.tinder.smsauth.entity.PhoneNumberFormatValidator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bJ \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\tJ\b\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/smsauth/core/SmsAuthFlowStateMachineFactory;", "", "phoneNumberFormatValidator", "Lcom/tinder/smsauth/entity/PhoneNumberFormatValidator;", "oneTimePasswordFormatValidator", "Lcom/tinder/smsauth/entity/OneTimePasswordFormatValidator;", "(Lcom/tinder/smsauth/entity/PhoneNumberFormatValidator;Lcom/tinder/smsauth/entity/OneTimePasswordFormatValidator;)V", "create", "Lcom/tinder/common/statemachine/StateMachine;", "Lcom/tinder/smsauth/entity/Flow$State;", "Lcom/tinder/smsauth/entity/Flow$Event;", "Lcom/tinder/smsauth/entity/Flow$SideEffect;", "initialState", "initialPhoneNumberStatus", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "core"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.core.c */
public final class C14965c {
    /* renamed from: a */
    private final PhoneNumberFormatValidator f46727a;
    /* renamed from: b */
    private final OneTimePasswordFormatValidator f46728b;

    @Inject
    public C14965c(@NotNull PhoneNumberFormatValidator phoneNumberFormatValidator, @NotNull OneTimePasswordFormatValidator oneTimePasswordFormatValidator) {
        C2668g.b(phoneNumberFormatValidator, "phoneNumberFormatValidator");
        C2668g.b(oneTimePasswordFormatValidator, "oneTimePasswordFormatValidator");
        this.f46727a = phoneNumberFormatValidator;
        this.f46728b = oneTimePasswordFormatValidator;
    }

    @NotNull
    /* renamed from: a */
    public final C8561a<C14974c, C14972a, C14973b> m56544a() {
        return m56545a((C14974c) new C16740b(m56543b()));
    }

    @NotNull
    /* renamed from: a */
    public final C8561a<C14974c, C14972a, C14973b> m56545a(@NotNull C14974c c14974c) {
        C2668g.b(c14974c, "initialState");
        return C8561a.f30307a.a(new SmsAuthFlowStateMachineFactory$create$1(this, c14974c));
    }

    /* renamed from: b */
    private final C14981i m56543b() {
        return this.f46727a.validate(C14980h.f46747a.m56571a());
    }
}
