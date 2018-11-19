package com.tinder.account.photos.photogrid;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tinder/account/photos/photogrid/Photo;", "Lcom/tinder/account/photos/photogrid/PhotoGridEntry;", "label", "", "uri", "isTopPhoto", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getLabel", "()Ljava/lang/String;", "getUri", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "account_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.photos.photogrid.c */
public final class C3914c extends C2626d {
    @NotNull
    /* renamed from: a */
    private final String f12199a;
    @NotNull
    /* renamed from: b */
    private final String f12200b;
    /* renamed from: c */
    private final boolean f12201c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3914c) {
            C3914c c3914c = (C3914c) obj;
            if (C2668g.m10308a(this.f12199a, c3914c.f12199a) && C2668g.m10308a(this.f12200b, c3914c.f12200b)) {
                if ((this.f12201c == c3914c.f12201c ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12199a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12200b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.f12201c;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Photo(label=");
        stringBuilder.append(this.f12199a);
        stringBuilder.append(", uri=");
        stringBuilder.append(this.f12200b);
        stringBuilder.append(", isTopPhoto=");
        stringBuilder.append(this.f12201c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C3914c(@NotNull String str, @NotNull String str2, boolean z) {
        C2668g.m10309b(str, "label");
        C2668g.m10309b(str2, ManagerWebServices.PARAM_SPOTIFY_URI);
        super(str);
        this.f12199a = str;
        this.f12200b = str2;
        this.f12201c = z;
    }

    @NotNull
    /* renamed from: a */
    public final String m14674a() {
        return this.f12199a;
    }

    @NotNull
    /* renamed from: b */
    public final String m14675b() {
        return this.f12200b;
    }

    /* renamed from: c */
    public final boolean m14676c() {
        return this.f12201c;
    }
}
