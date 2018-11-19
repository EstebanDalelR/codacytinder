package com.tinder.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/tinder/utils/NetworkClass;", "", "niceName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getNiceName", "()Ljava/lang/String;", "NOT_CONNECTED", "WIFI", "NET_2G", "NET_3G", "NET_4G", "UNKNOWN", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public enum NetworkClass {
    ;
    
    @NotNull
    private final String niceName;

    protected NetworkClass(String str) {
        C2668g.b(str, "niceName");
        this.niceName = str;
    }

    @NotNull
    public final String getNiceName() {
        return this.niceName;
    }
}
