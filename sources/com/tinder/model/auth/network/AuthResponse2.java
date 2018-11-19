package com.tinder.model.auth.network;

import com.tinder.model.network.DataResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/tinder/model/auth/network/AuthResponse2;", "Lcom/tinder/model/network/DataResponse;", "Lcom/tinder/model/auth/network/Data;", "()V", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AuthResponse2 extends DataResponse<Data> {
    @NotNull
    public String toString() {
        return ((Data) getData()).toString();
    }
}
