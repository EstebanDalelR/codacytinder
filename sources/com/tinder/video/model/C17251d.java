package com.tinder.video.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/tinder/video/model/VideoViewModel;", "Lcom/tinder/video/model/MediaViewModel;", "width", "", "height", "url", "", "name", "(IILjava/lang/String;Ljava/lang/String;)V", "getHeight", "()I", "getName", "()Ljava/lang/String;", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "video_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.video.model.d */
public final class C17251d extends C15415b {
    /* renamed from: a */
    private final int f52869a;
    /* renamed from: b */
    private final int f52870b;
    @NotNull
    /* renamed from: c */
    private final String f52871c;
    @NotNull
    /* renamed from: d */
    private final String f52872d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17251d) {
            C17251d c17251d = (C17251d) obj;
            if ((this.f52869a == c17251d.f52869a ? 1 : null) != null) {
                return (this.f52870b == c17251d.f52870b ? 1 : null) != null && C2668g.a(this.f52871c, c17251d.f52871c) && C2668g.a(this.f52872d, c17251d.f52872d);
            }
        }
    }

    public int hashCode() {
        int i = ((this.f52869a * 31) + this.f52870b) * 31;
        String str = this.f52871c;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f52872d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VideoViewModel(width=");
        stringBuilder.append(this.f52869a);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f52870b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f52871c);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f52872d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final int m63164a() {
        return this.f52869a;
    }

    /* renamed from: b */
    public final int m63165b() {
        return this.f52870b;
    }

    @NotNull
    /* renamed from: c */
    public final String m63166c() {
        return this.f52871c;
    }

    public C17251d(int i, int i2, @NotNull String str, @NotNull String str2) {
        C2668g.b(str, "url");
        C2668g.b(str2, "name");
        super();
        this.f52869a = i;
        this.f52870b = i2;
        this.f52871c = str;
        this.f52872d = str2;
    }
}
