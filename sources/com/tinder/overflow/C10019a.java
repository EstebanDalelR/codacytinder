package com.tinder.overflow;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tinder/overflow/MenuItem;", "", "text", "", "menuItemSelectedListeners", "", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/util/List;)V", "getMenuItemSelectedListeners", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.a */
public final class C10019a {
    @NotNull
    /* renamed from: a */
    private final String f32885a;
    @NotNull
    /* renamed from: b */
    private final List<Function0<C15813i>> f32886b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10019a) {
                C10019a c10019a = (C10019a) obj;
                if (C2668g.a(this.f32885a, c10019a.f32885a) && C2668g.a(this.f32886b, c10019a.f32886b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f32885a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f32886b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MenuItem(text=");
        stringBuilder.append(this.f32885a);
        stringBuilder.append(", menuItemSelectedListeners=");
        stringBuilder.append(this.f32886b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10019a(@NotNull String str, @NotNull List<Function0<C15813i>> list) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        C2668g.b(list, "menuItemSelectedListeners");
        this.f32885a = str;
        this.f32886b = list;
    }

    @NotNull
    /* renamed from: a */
    public final String m41049a() {
        return this.f32885a;
    }

    @NotNull
    /* renamed from: b */
    public final List<Function0<C15813i>> m41050b() {
        return this.f32886b;
    }
}
