package com.tinder.auth.model;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/tinder/auth/model/AuthType;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "ACCOUNTKIT", "FACEBOOK", "TINDER_SMS", "Companion", "domain"}, k = 1, mv = {1, 1, 10})
public enum AuthType {
    ;
    
    public static final AuthType$a Companion = null;
    @NotNull
    private final String key;

    @JvmStatic
    @Nullable
    public static final AuthType fromValue(@Nullable String str) {
        return Companion.a(str);
    }

    protected AuthType(String str) {
        C2668g.m10309b(str, "key");
        this.key = str;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    static {
        Companion = new AuthType$a(null);
    }
}
