package com.tinder.chat.view.model;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/tinder/chat/view/model/ActivityFeedSchoolViewModel;", "", "name", "", "type", "year", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "getYear", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toSchoolDescription", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.g */
public final class C8495g {
    @NotNull
    /* renamed from: a */
    private final String f30205a;
    @NotNull
    /* renamed from: b */
    private final String f30206b;
    @NotNull
    /* renamed from: c */
    private final String f30207c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8495g) {
                C8495g c8495g = (C8495g) obj;
                if (C2668g.a(this.f30205a, c8495g.f30205a) && C2668g.a(this.f30206b, c8495g.f30206b) && C2668g.a(this.f30207c, c8495g.f30207c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f30205a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30206b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f30207c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedSchoolViewModel(name=");
        stringBuilder.append(this.f30205a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f30206b);
        stringBuilder.append(", year=");
        stringBuilder.append(this.f30207c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8495g(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "name");
        C2668g.b(str2, "type");
        C2668g.b(str3, "year");
        this.f30205a = str;
        this.f30206b = str2;
        this.f30207c = str3;
    }

    @NotNull
    /* renamed from: b */
    public final String m36357b() {
        return this.f30205a;
    }

    @NotNull
    /* renamed from: a */
    public final String m36356a() {
        StringBuilder stringBuilder = new StringBuilder(this.f30205a);
        if ((((CharSequence) this.f30207c).length() > 0 ? 1 : null) != null) {
            stringBuilder.append(" '");
            String str = this.f30207c;
            if (str == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            str = str.substring(2);
            C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
            stringBuilder.append(str);
        }
        String stringBuilder2 = stringBuilder.toString();
        C2668g.a(stringBuilder2, "stringBuilder.toString()");
        return stringBuilder2;
    }
}
