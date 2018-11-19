package com.tinder.domain.profile.model.exception;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/domain/profile/model/exception/InstagramAccountAlreadyInUseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class InstagramAccountAlreadyInUseException extends RuntimeException {
    public InstagramAccountAlreadyInUseException() {
        super("Instagram account is already connected to a Tinder profile.");
    }
}
