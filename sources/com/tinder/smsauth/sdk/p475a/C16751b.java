package com.tinder.smsauth.sdk.p475a;

import com.tinder.smsauth.entity.C14977f;
import com.tinder.smsauth.entity.C14978g;
import com.tinder.smsauth.entity.OneTimePasswordFormatValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/smsauth/sdk/validator/LengthBasedOneTimePasswordFormatValidator;", "Lcom/tinder/smsauth/entity/OneTimePasswordFormatValidator;", "()V", "validate", "Lcom/tinder/smsauth/entity/OneTimePasswordStatus;", "oneTimePasswordInfo", "Lcom/tinder/smsauth/entity/OneTimePasswordInfo;", "sdk_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.sdk.a.b */
public final class C16751b implements OneTimePasswordFormatValidator {
    @NotNull
    public C14978g validate(@NotNull C14977f c14977f) {
        C2668g.b(c14977f, "oneTimePasswordInfo");
        String b = c14977f.m56568b();
        boolean z = false;
        if (b != null && b.length() == c14977f.m56566a()) {
            z = true;
        }
        return new C14978g(c14977f, z);
    }
}
