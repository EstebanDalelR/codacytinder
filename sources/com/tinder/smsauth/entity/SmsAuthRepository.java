package com.tinder.smsauth.entity;

import io.reactivex.C3960g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/tinder/smsauth/entity/SmsAuthRepository;", "", "requestOneTimePasswordViaSms", "Lio/reactivex/Single;", "Lcom/tinder/smsauth/entity/OneTimePasswordInfo;", "phoneNumber", "Lcom/tinder/smsauth/entity/PhoneNumber;", "verifyOneTimePassword", "Lcom/tinder/smsauth/entity/LoginCredentials;", "request", "Lcom/tinder/smsauth/entity/VerifyOneTimePasswordRequest;", "entity"}, k = 1, mv = {1, 1, 10})
public interface SmsAuthRepository {
    @NotNull
    C3960g<C14977f> requestOneTimePasswordViaSms(@NotNull C14980h c14980h);

    @NotNull
    C3960g<C14976d> verifyOneTimePassword(@NotNull C14982j c14982j);
}
