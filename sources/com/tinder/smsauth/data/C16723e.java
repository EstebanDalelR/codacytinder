package com.tinder.smsauth.data;

import com.tinder.smsauth.entity.C14976d;
import com.tinder.smsauth.entity.C14977f;
import com.tinder.smsauth.entity.C14980h;
import com.tinder.smsauth.entity.C14982j;
import com.tinder.smsauth.entity.SmsAuthRepository;
import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/smsauth/data/TinderSmsAuthDataRepository;", "Lcom/tinder/smsauth/entity/SmsAuthRepository;", "smsAuthApiClient", "Lcom/tinder/smsauth/data/SmsAuthApiClient;", "(Lcom/tinder/smsauth/data/SmsAuthApiClient;)V", "requestOneTimePasswordViaSms", "Lio/reactivex/Single;", "Lcom/tinder/smsauth/entity/OneTimePasswordInfo;", "phoneNumber", "Lcom/tinder/smsauth/entity/PhoneNumber;", "verifyOneTimePassword", "Lcom/tinder/smsauth/entity/LoginCredentials;", "request", "Lcom/tinder/smsauth/entity/VerifyOneTimePasswordRequest;", "data"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.data.e */
public final class C16723e implements SmsAuthRepository {
    /* renamed from: a */
    private final C14969b f51711a;

    @Inject
    public C16723e(@NotNull C14969b c14969b) {
        C2668g.b(c14969b, "smsAuthApiClient");
        this.f51711a = c14969b;
    }

    @NotNull
    public C3960g<C14977f> requestOneTimePasswordViaSms(@NotNull C14980h c14980h) {
        C2668g.b(c14980h, "phoneNumber");
        return this.f51711a.m56558a(c14980h);
    }

    @NotNull
    public C3960g<C14976d> verifyOneTimePassword(@NotNull C14982j c14982j) {
        C2668g.b(c14982j, "request");
        return this.f51711a.m56559a(c14982j);
    }
}
