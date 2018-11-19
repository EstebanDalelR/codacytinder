package com.tinder.api.model.common;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/api/model/common/NetworkError;", "Ljava/io/IOException;", "code", "", "text", "", "(ILjava/lang/String;)V", "getCode", "()I", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class NetworkError extends IOException {
    private final int code;
    @Nullable
    private final String text;

    @NotNull
    public static /* synthetic */ NetworkError copy$default(NetworkError networkError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = networkError.code;
        }
        if ((i2 & 2) != 0) {
            str = networkError.text;
        }
        return networkError.copy(i, str);
    }

    public final int component1() {
        return this.code;
    }

    @Nullable
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final NetworkError copy(int i, @Nullable String str) {
        return new NetworkError(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NetworkError) {
            NetworkError networkError = (NetworkError) obj;
            return (this.code == networkError.code ? 1 : null) != null && C2668g.a(this.text, networkError.text);
        }
    }

    public int hashCode() {
        int i = this.code * 31;
        String str = this.text;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetworkError(code=");
        stringBuilder.append(this.code);
        stringBuilder.append(", text=");
        stringBuilder.append(this.text);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public NetworkError(int i, @Nullable String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Network error code: ");
        stringBuilder.append(i);
        stringBuilder.append(", message: ");
        stringBuilder.append(str);
        super(stringBuilder.toString());
        this.code = i;
        this.text = str;
    }
}
