package com.tinder.bitmoji.model;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/bitmoji/model/BitmojiFetchAvatarUrlException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "isNetworkError", "", "statusCode", "", "(ZI)V", "()Z", "getStatusCode", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
public final class BitmojiFetchAvatarUrlException extends RuntimeException {
    /* renamed from: a */
    private final boolean f29608a;
    /* renamed from: b */
    private final int f29609b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BitmojiFetchAvatarUrlException) {
            BitmojiFetchAvatarUrlException bitmojiFetchAvatarUrlException = (BitmojiFetchAvatarUrlException) obj;
            if ((this.f29608a == bitmojiFetchAvatarUrlException.f29608a ? 1 : null) != null) {
                if ((this.f29609b == bitmojiFetchAvatarUrlException.f29609b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f29608a;
        if (i != 0) {
            i = 1;
        }
        return (i * 31) + this.f29609b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BitmojiFetchAvatarUrlException(isNetworkError=");
        stringBuilder.append(this.f29608a);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(this.f29609b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BitmojiFetchAvatarUrlException(boolean z, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error fetching Bitmoji Image Url. ");
        stringBuilder.append("Network error: ");
        stringBuilder.append(z);
        stringBuilder.append(" \tStatus Code: ");
        stringBuilder.append(i);
        super(stringBuilder.toString());
        this.f29608a = z;
        this.f29609b = i;
    }
}
