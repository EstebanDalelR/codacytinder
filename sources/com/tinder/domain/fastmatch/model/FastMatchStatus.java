package com.tinder.domain.fastmatch.model;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u0000 !2\u00020\u0001:\u0002!\"B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "", "count", "", "isRange", "", "previewImageBytes", "", "previewImageTimestamp", "", "source", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus$Source;", "(IZ[BJLcom/tinder/domain/fastmatch/model/FastMatchStatus$Source;)V", "getCount", "()I", "()Z", "getPreviewImageBytes", "()[B", "getPreviewImageTimestamp", "()J", "getSource", "()Lcom/tinder/domain/fastmatch/model/FastMatchStatus$Source;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "Source", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchStatus {
    public static final Companion Companion = new Companion();
    private final int count;
    private final boolean isRange;
    @Nullable
    private final byte[] previewImageBytes;
    private final long previewImageTimestamp;
    @NotNull
    private final Source source;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/fastmatch/model/FastMatchStatus$Companion;", "", "()V", "emptyState", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "getEmptyState", "()Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final FastMatchStatus getEmptyState() {
            return new FastMatchStatus(0, false, null, 0, null, 30, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/fastmatch/model/FastMatchStatus$Source;", "", "(Ljava/lang/String;I)V", "COUNT", "DECREMENT", "PREVIEW", "UPDATE", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum Source {
    }

    public FastMatchStatus() {
        this(0, false, null, 0, null, 31, null);
    }

    @NotNull
    public static /* synthetic */ FastMatchStatus copy$default(FastMatchStatus fastMatchStatus, int i, boolean z, byte[] bArr, long j, Source source, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fastMatchStatus.count;
        }
        if ((i2 & 2) != 0) {
            z = fastMatchStatus.isRange;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            bArr = fastMatchStatus.previewImageBytes;
        }
        byte[] bArr2 = bArr;
        if ((i2 & 8) != 0) {
            j = fastMatchStatus.previewImageTimestamp;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            source = fastMatchStatus.source;
        }
        return fastMatchStatus.copy(i, z2, bArr2, j2, source);
    }

    public final int component1() {
        return this.count;
    }

    public final boolean component2() {
        return this.isRange;
    }

    @Nullable
    public final byte[] component3() {
        return this.previewImageBytes;
    }

    public final long component4() {
        return this.previewImageTimestamp;
    }

    @NotNull
    public final Source component5() {
        return this.source;
    }

    @NotNull
    public final FastMatchStatus copy(int i, boolean z, @Nullable byte[] bArr, long j, @NotNull Source source) {
        C2668g.b(source, "source");
        return new FastMatchStatus(i, z, bArr, j, source);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchStatus(count=");
        stringBuilder.append(this.count);
        stringBuilder.append(", isRange=");
        stringBuilder.append(this.isRange);
        stringBuilder.append(", previewImageBytes=");
        stringBuilder.append(Arrays.toString(this.previewImageBytes));
        stringBuilder.append(", previewImageTimestamp=");
        stringBuilder.append(this.previewImageTimestamp);
        stringBuilder.append(", source=");
        stringBuilder.append(this.source);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FastMatchStatus(int i, boolean z, @Nullable byte[] bArr, long j, @NotNull Source source) {
        C2668g.b(source, "source");
        this.count = i;
        this.isRange = z;
        this.previewImageBytes = bArr;
        this.previewImageTimestamp = j;
        this.source = source;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean isRange() {
        return this.isRange;
    }

    public /* synthetic */ FastMatchStatus(int i, boolean z, byte[] bArr, long j, Source source, int i2, C15823e c15823e) {
        boolean z2 = false;
        c15823e = (i2 & 1) != null ? null : i;
        if ((i2 & 2) == 0) {
            z2 = z;
        }
        if ((i2 & 4) != 0) {
            bArr = DefaultFastMatchValues.INSTANCE.getPREVIEW_IMAGE_BYTES();
        }
        byte[] bArr2 = bArr;
        if ((i2 & 8) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            source = DefaultFastMatchValues.INSTANCE.getSOURCE();
        }
        this(c15823e, z2, bArr2, j2, source);
    }

    @Nullable
    public final byte[] getPreviewImageBytes() {
        return this.previewImageBytes;
    }

    public final long getPreviewImageTimestamp() {
        return this.previewImageTimestamp;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
