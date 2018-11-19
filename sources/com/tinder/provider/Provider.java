package com.tinder.provider;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/provider/Provider;", "T", "", "provide", "()Ljava/lang/Object;", "base_release"}, k = 1, mv = {1, 1, 10})
public interface Provider<T> {
    T provide();
}
