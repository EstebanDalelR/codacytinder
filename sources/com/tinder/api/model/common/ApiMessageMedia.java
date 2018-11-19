package com.tinder.api.model.common;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/tinder/api/model/common/ApiMessageMedia;", "", "source", "", "url", "width", "", "height", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSource", "()Ljava/lang/String;", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/tinder/api/model/common/ApiMessageMedia;", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiMessageMedia {
    @Nullable
    private final Integer height;
    @Nullable
    private final String source;
    @Nullable
    private final String url;
    @Nullable
    private final Integer width;

    @NotNull
    public static /* synthetic */ ApiMessageMedia copy$default(ApiMessageMedia apiMessageMedia, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiMessageMedia.source;
        }
        if ((i & 2) != 0) {
            str2 = apiMessageMedia.url;
        }
        if ((i & 4) != 0) {
            num = apiMessageMedia.width;
        }
        if ((i & 8) != 0) {
            num2 = apiMessageMedia.height;
        }
        return apiMessageMedia.copy(str, str2, num, num2);
    }

    @Nullable
    public final String component1() {
        return this.source;
    }

    @Nullable
    public final String component2() {
        return this.url;
    }

    @Nullable
    public final Integer component3() {
        return this.width;
    }

    @Nullable
    public final Integer component4() {
        return this.height;
    }

    @NotNull
    public final ApiMessageMedia copy(@Nullable @Json(name = "source") String str, @Nullable @Json(name = "url") String str2, @Nullable @Json(name = "width") Integer num, @Nullable @Json(name = "height") Integer num2) {
        return new ApiMessageMedia(str, str2, num, num2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiMessageMedia) {
                ApiMessageMedia apiMessageMedia = (ApiMessageMedia) obj;
                if (C2668g.a(this.source, apiMessageMedia.source) && C2668g.a(this.url, apiMessageMedia.url) && C2668g.a(this.width, apiMessageMedia.width) && C2668g.a(this.height, apiMessageMedia.height)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.source;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.width;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        num = this.height;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiMessageMedia(source=");
        stringBuilder.append(this.source);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", width=");
        stringBuilder.append(this.width);
        stringBuilder.append(", height=");
        stringBuilder.append(this.height);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiMessageMedia(@Nullable @Json(name = "source") String str, @Nullable @Json(name = "url") String str2, @Nullable @Json(name = "width") Integer num, @Nullable @Json(name = "height") Integer num2) {
        this.source = str;
        this.url = str2;
        this.width = num;
        this.height = num2;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }
}
