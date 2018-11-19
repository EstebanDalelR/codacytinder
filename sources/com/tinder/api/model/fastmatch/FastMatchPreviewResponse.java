package com.tinder.api.model.fastmatch;

import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tinder/api/model/fastmatch/FastMatchPreviewResponse;", "", "imageBytes", "", "isRange", "", "count", "", "([BZI)V", "getCount", "()I", "getImageBytes", "()[B", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchPreviewResponse {
    private final int count;
    @Nullable
    private final byte[] imageBytes;
    private final boolean isRange;

    @NotNull
    public static /* synthetic */ FastMatchPreviewResponse copy$default(FastMatchPreviewResponse fastMatchPreviewResponse, byte[] bArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr = fastMatchPreviewResponse.imageBytes;
        }
        if ((i2 & 2) != 0) {
            z = fastMatchPreviewResponse.isRange;
        }
        if ((i2 & 4) != 0) {
            i = fastMatchPreviewResponse.count;
        }
        return fastMatchPreviewResponse.copy(bArr, z, i);
    }

    @Nullable
    public final byte[] component1() {
        return this.imageBytes;
    }

    public final boolean component2() {
        return this.isRange;
    }

    public final int component3() {
        return this.count;
    }

    @NotNull
    public final FastMatchPreviewResponse copy(@Nullable byte[] bArr, boolean z, int i) {
        return new FastMatchPreviewResponse(bArr, z, i);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchPreviewResponse(imageBytes=");
        stringBuilder.append(Arrays.toString(this.imageBytes));
        stringBuilder.append(", isRange=");
        stringBuilder.append(this.isRange);
        stringBuilder.append(", count=");
        stringBuilder.append(this.count);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FastMatchPreviewResponse(@Nullable byte[] bArr, boolean z, int i) {
        this.imageBytes = bArr;
        this.isRange = z;
        this.count = i;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final byte[] getImageBytes() {
        return this.imageBytes;
    }

    public final boolean isRange() {
        return this.isRange;
    }

    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
