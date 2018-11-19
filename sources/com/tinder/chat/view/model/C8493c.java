package com.tinder.chat.view.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/chat/view/model/ActivityFeedJobViewModel;", "", "company", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getCompany", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.c */
public final class C8493c {
    @NotNull
    /* renamed from: a */
    private final String f30203a;
    @NotNull
    /* renamed from: b */
    private final String f30204b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8493c) {
                C8493c c8493c = (C8493c) obj;
                if (C2668g.a(this.f30203a, c8493c.f30203a) && C2668g.a(this.f30204b, c8493c.f30204b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f30203a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30204b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedJobViewModel(company=");
        stringBuilder.append(this.f30203a);
        stringBuilder.append(", title=");
        stringBuilder.append(this.f30204b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8493c(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
        /*
        r1 = this;
        r0 = "company";
        kotlin.jvm.internal.C2668g.b(r2, r0);
        r0 = "title";
        kotlin.jvm.internal.C2668g.b(r3, r0);
        r1.<init>();
        r1.f30203a = r2;
        r1.f30204b = r3;
        r2 = r1.f30203a;
        r2 = (java.lang.CharSequence) r2;
        r2 = r2.length();
        r3 = 0;
        r0 = 1;
        if (r2 <= 0) goto L_0x001f;
    L_0x001d:
        r2 = 1;
        goto L_0x0020;
    L_0x001f:
        r2 = 0;
    L_0x0020:
        if (r2 != 0) goto L_0x0031;
    L_0x0022:
        r2 = r1.f30204b;
        r2 = (java.lang.CharSequence) r2;
        r2 = r2.length();
        if (r2 <= 0) goto L_0x002e;
    L_0x002c:
        r2 = 1;
        goto L_0x002f;
    L_0x002e:
        r2 = 0;
    L_0x002f:
        if (r2 == 0) goto L_0x0032;
    L_0x0031:
        r3 = 1;
    L_0x0032:
        if (r3 != 0) goto L_0x0042;
    L_0x0034:
        r2 = "Both Company and Job Title cannot be empty";
        r3 = new java.lang.IllegalArgumentException;
        r2 = r2.toString();
        r3.<init>(r2);
        r3 = (java.lang.Throwable) r3;
        throw r3;
    L_0x0042:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.chat.view.model.c.<init>(java.lang.String, java.lang.String):void");
    }

    @NotNull
    /* renamed from: a */
    public final String m36354a() {
        return this.f30203a;
    }

    @NotNull
    /* renamed from: b */
    public final String m36355b() {
        return this.f30204b;
    }
}
