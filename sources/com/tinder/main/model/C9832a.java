package com.tinder.main.model;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/tinder/main/model/MainTabViewModel;", "", "page", "Lcom/tinder/main/model/MainPage;", "isDefault", "", "icon", "", "contentDescription", "(Lcom/tinder/main/model/MainPage;ZII)V", "getContentDescription", "()I", "getIcon", "()Z", "getPage", "()Lcom/tinder/main/model/MainPage;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.model.a */
public final class C9832a {
    @NotNull
    /* renamed from: a */
    private final MainPage f32542a;
    /* renamed from: b */
    private final boolean f32543b;
    /* renamed from: c */
    private final int f32544c;
    /* renamed from: d */
    private final int f32545d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9832a) {
            C9832a c9832a = (C9832a) obj;
            if (C2668g.a(this.f32542a, c9832a.f32542a)) {
                if ((this.f32543b == c9832a.f32543b ? 1 : null) != null) {
                    if ((this.f32544c == c9832a.f32544c ? 1 : null) != null) {
                        if ((this.f32545d == c9832a.f32545d ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        MainPage mainPage = this.f32542a;
        int hashCode = (mainPage != null ? mainPage.hashCode() : 0) * 31;
        int i = this.f32543b;
        if (i != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.f32544c) * 31) + this.f32545d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MainTabViewModel(page=");
        stringBuilder.append(this.f32542a);
        stringBuilder.append(", isDefault=");
        stringBuilder.append(this.f32543b);
        stringBuilder.append(", icon=");
        stringBuilder.append(this.f32544c);
        stringBuilder.append(", contentDescription=");
        stringBuilder.append(this.f32545d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9832a(@NotNull MainPage mainPage, boolean z, @DrawableRes int i, @StringRes int i2) {
        C2668g.b(mainPage, "page");
        this.f32542a = mainPage;
        this.f32543b = z;
        this.f32544c = i;
        this.f32545d = i2;
    }

    @NotNull
    /* renamed from: a */
    public final MainPage m40441a() {
        return this.f32542a;
    }

    /* renamed from: b */
    public final int m40442b() {
        return this.f32544c;
    }

    /* renamed from: c */
    public final int m40443c() {
        return this.f32545d;
    }
}
