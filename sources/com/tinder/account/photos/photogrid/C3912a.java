package com.tinder.account.photos.photogrid;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/account/photos/photogrid/EmptyPhoto;", "Lcom/tinder/account/photos/photogrid/PhotoGridEntry;", "label", "", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "account_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.photos.photogrid.a */
public final class C3912a extends C2626d {
    @NotNull
    /* renamed from: a */
    private final String f12196a;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3912a) {
                if (C2668g.m10308a(this.f12196a, ((C3912a) obj).f12196a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f12196a;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EmptyPhoto(label=");
        stringBuilder.append(this.f12196a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C3912a(@NotNull String str) {
        C2668g.m10309b(str, "label");
        super(str);
        this.f12196a = str;
    }

    @NotNull
    /* renamed from: a */
    public final String m14671a() {
        return this.f12196a;
    }
}
