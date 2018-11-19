package com.tinder.fastmatch.viewmodel;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\b\u0018\u00002\u00020\u0001:\u0002*+BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bJ\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u0006,"}, d2 = {"Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel;", "", "count", "", "isCountRange", "", "countPosition", "Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel$CountPosition;", "imageByteArray", "", "imageByteArrayCacheKey", "", "shouldPixelateImageView", "previewState", "Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel$PreviewState;", "(IZLcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel$CountPosition;[BLjava/lang/String;ZLcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel$PreviewState;)V", "getCount", "()I", "getCountPosition", "()Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel$CountPosition;", "getImageByteArray", "()[B", "getImageByteArrayCacheKey", "()Ljava/lang/String;", "()Z", "getPreviewState", "()Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel$PreviewState;", "getShouldPixelateImageView", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "formatCountString", "stringToFormat", "hashCode", "toString", "CountPosition", "PreviewState", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchPreviewViewModel {
    /* renamed from: a */
    private final int f31561a;
    /* renamed from: b */
    private final boolean f31562b;
    @NotNull
    /* renamed from: c */
    private final CountPosition f31563c;
    @Nullable
    /* renamed from: d */
    private final byte[] f31564d;
    @NotNull
    /* renamed from: e */
    private final String f31565e;
    /* renamed from: f */
    private final boolean f31566f;
    @NotNull
    /* renamed from: g */
    private final PreviewState f31567g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel$CountPosition;", "", "(Ljava/lang/String;I)V", "AVATAR", "TITLE", "NONE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum CountPosition {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel$PreviewState;", "", "(Ljava/lang/String;I)V", "HAS_LIKES", "NO_LIKES", "LOADING", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum PreviewState {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FastMatchPreviewViewModel) {
            FastMatchPreviewViewModel fastMatchPreviewViewModel = (FastMatchPreviewViewModel) obj;
            if ((this.f31561a == fastMatchPreviewViewModel.f31561a ? 1 : null) != null) {
                if ((this.f31562b == fastMatchPreviewViewModel.f31562b ? 1 : null) != null && C2668g.a(this.f31563c, fastMatchPreviewViewModel.f31563c) && C2668g.a(this.f31564d, fastMatchPreviewViewModel.f31564d) && C2668g.a(this.f31565e, fastMatchPreviewViewModel.f31565e)) {
                    return (this.f31566f == fastMatchPreviewViewModel.f31566f ? 1 : null) != null && C2668g.a(this.f31567g, fastMatchPreviewViewModel.f31567g);
                }
            }
        }
    }

    public int hashCode() {
        int i = this.f31561a * 31;
        int i2 = this.f31562b;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        CountPosition countPosition = this.f31563c;
        int i3 = 0;
        i = (i + (countPosition != null ? countPosition.hashCode() : 0)) * 31;
        byte[] bArr = this.f31564d;
        i = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        String str = this.f31565e;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        i2 = this.f31566f;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        PreviewState previewState = this.f31567g;
        if (previewState != null) {
            i3 = previewState.hashCode();
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchPreviewViewModel(count=");
        stringBuilder.append(this.f31561a);
        stringBuilder.append(", isCountRange=");
        stringBuilder.append(this.f31562b);
        stringBuilder.append(", countPosition=");
        stringBuilder.append(this.f31563c);
        stringBuilder.append(", imageByteArray=");
        stringBuilder.append(Arrays.toString(this.f31564d));
        stringBuilder.append(", imageByteArrayCacheKey=");
        stringBuilder.append(this.f31565e);
        stringBuilder.append(", shouldPixelateImageView=");
        stringBuilder.append(this.f31566f);
        stringBuilder.append(", previewState=");
        stringBuilder.append(this.f31567g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FastMatchPreviewViewModel(int i, boolean z, @NotNull CountPosition countPosition, @Nullable byte[] bArr, @NotNull String str, boolean z2, @NotNull PreviewState previewState) {
        C2668g.b(countPosition, "countPosition");
        C2668g.b(str, "imageByteArrayCacheKey");
        C2668g.b(previewState, "previewState");
        this.f31561a = i;
        this.f31562b = z;
        this.f31563c = countPosition;
        this.f31564d = bArr;
        this.f31565e = str;
        this.f31566f = z2;
        this.f31567g = previewState;
    }

    /* renamed from: a */
    public final int m39380a() {
        return this.f31561a;
    }

    /* renamed from: b */
    public final boolean m39382b() {
        return this.f31562b;
    }

    @NotNull
    /* renamed from: c */
    public final CountPosition m39383c() {
        return this.f31563c;
    }

    @Nullable
    /* renamed from: d */
    public final byte[] m39384d() {
        return this.f31564d;
    }

    @NotNull
    /* renamed from: e */
    public final String m39385e() {
        return this.f31565e;
    }

    /* renamed from: f */
    public final boolean m39386f() {
        return this.f31566f;
    }

    @NotNull
    /* renamed from: g */
    public final PreviewState m39387g() {
        return this.f31567g;
    }

    @NotNull
    /* renamed from: a */
    public final String m39381a(@NotNull String str) {
        C2668g.b(str, "stringToFormat");
        boolean z = this.f31562b;
        if (z) {
            Object[] objArr = new Object[]{Integer.valueOf(this.f31561a)};
            str = String.format(str, Arrays.copyOf(objArr, objArr.length));
            C2668g.a(str, "java.lang.String.format(this, *args)");
            return str;
        } else if (!z) {
            return String.valueOf(this.f31561a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
