package com.tinder.domain.message;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tinder/domain/message/Image;", "", "source", "", "url", "width", "", "height", "(Ljava/lang/String;Ljava/lang/String;II)V", "getHeight", "()I", "getSource", "()Ljava/lang/String;", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Image {
    private final int height;
    @NotNull
    private final String source;
    @NotNull
    private final String url;
    private final int width;

    @NotNull
    public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = image.source;
        }
        if ((i3 & 2) != 0) {
            str2 = image.url;
        }
        if ((i3 & 4) != 0) {
            i = image.width;
        }
        if ((i3 & 8) != 0) {
            i2 = image.height;
        }
        return image.copy(str, str2, i, i2);
    }

    @NotNull
    public final String component1() {
        return this.source;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    @NotNull
    public final Image copy(@NotNull String str, @NotNull String str2, int i, int i2) {
        C2668g.b(str, "source");
        C2668g.b(str2, "url");
        return new Image(str, str2, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Image) {
            Image image = (Image) obj;
            if (C2668g.a(this.source, image.source) && C2668g.a(this.url, image.url)) {
                if ((this.width == image.width ? 1 : null) != null) {
                    if ((this.height == image.height ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.source;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Image(source=");
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

    public Image(@NotNull String str, @NotNull String str2, int i, int i2) {
        C2668g.b(str, "source");
        C2668g.b(str2, "url");
        this.source = str;
        this.url = str2;
        this.width = i;
        this.height = i2;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }
}
