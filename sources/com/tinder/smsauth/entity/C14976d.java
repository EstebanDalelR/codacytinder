package com.tinder.smsauth.entity;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/smsauth/entity/LoginCredentials;", "", "longLivedToken", "", "(Ljava/lang/String;)V", "getLongLivedToken", "()Ljava/lang/String;", "Lcom/tinder/smsauth/entity/AuthorizationTokenCredentials;", "Lcom/tinder/smsauth/entity/OnboardingCredentials;", "Lcom/tinder/smsauth/entity/AccessTokenCredentials;", "entity"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.entity.d */
public abstract class C14976d {
    @NotNull
    /* renamed from: a */
    private final String f46742a;

    private C14976d(String str) {
        this.f46742a = str;
    }

    @NotNull
    /* renamed from: b */
    public final String m56564b() {
        return this.f46742a;
    }
}
