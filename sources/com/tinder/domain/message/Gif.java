package com.tinder.domain.message;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/tinder/domain/message/Gif;", "", "id", "", "provider", "Lcom/tinder/domain/message/Gif$Provider;", "url", "width", "", "height", "(Ljava/lang/String;Lcom/tinder/domain/message/Gif$Provider;Ljava/lang/String;II)V", "getHeight", "()I", "getId", "()Ljava/lang/String;", "getProvider", "()Lcom/tinder/domain/message/Gif$Provider;", "getUrl", "getWidth", "aspectRatio", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Provider", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Gif {
    private final int height;
    @NotNull
    private final String id;
    @NotNull
    private final Provider provider;
    @NotNull
    private final String url;
    private final int width;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/domain/message/Gif$Provider;", "", "(Ljava/lang/String;I)V", "GIPHY", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum Provider {
    }

    @NotNull
    public static /* synthetic */ Gif copy$default(Gif gif, String str, Provider provider, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = gif.id;
        }
        if ((i3 & 2) != 0) {
            provider = gif.provider;
        }
        Provider provider2 = provider;
        if ((i3 & 4) != 0) {
            str2 = gif.url;
        }
        String str3 = str2;
        if ((i3 & 8) != 0) {
            i = gif.width;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = gif.height;
        }
        return gif.copy(str, provider2, str3, i4, i2);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final Provider component2() {
        return this.provider;
    }

    @NotNull
    public final String component3() {
        return this.url;
    }

    public final int component4() {
        return this.width;
    }

    public final int component5() {
        return this.height;
    }

    @NotNull
    public final Gif copy(@NotNull String str, @NotNull Provider provider, @NotNull String str2, int i, int i2) {
        C2668g.b(str, "id");
        C2668g.b(provider, "provider");
        C2668g.b(str2, "url");
        return new Gif(str, provider, str2, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Gif) {
            Gif gif = (Gif) obj;
            if (C2668g.a(this.id, gif.id) && C2668g.a(this.provider, gif.provider) && C2668g.a(this.url, gif.url)) {
                if ((this.width == gif.width ? 1 : null) != null) {
                    if ((this.height == gif.height ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Provider provider = this.provider;
        hashCode = (hashCode + (provider != null ? provider.hashCode() : 0)) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Gif(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", provider=");
        stringBuilder.append(this.provider);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", width=");
        stringBuilder.append(this.width);
        stringBuilder.append(", height=");
        stringBuilder.append(this.height);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Gif(@NotNull String str, @NotNull Provider provider, @NotNull String str2, int i, int i2) {
        C2668g.b(str, "id");
        C2668g.b(provider, "provider");
        C2668g.b(str2, "url");
        this.id = str;
        this.provider = provider;
        this.url = str2;
        this.width = i;
        this.height = i2;
        provider = null;
        if ((this.width > null ? true : null) == null) {
            str = new StringBuilder();
            str.append("width must be positive, was ");
            str.append(this.width);
            throw ((Throwable) new IllegalArgumentException(str.toString().toString()));
        }
        if (this.height > null) {
            provider = true;
        }
        if (provider == null) {
            str = new StringBuilder();
            str.append("height must be positive, was ");
            str.append(this.height);
            throw ((Throwable) new IllegalArgumentException(str.toString().toString()));
        }
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Provider getProvider() {
        return this.provider;
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

    public final float aspectRatio() {
        return ((float) this.width) / ((float) this.height);
    }
}
