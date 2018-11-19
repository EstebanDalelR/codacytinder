package com.tinder.notifications;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/notifications/PushCopy;", "", "title", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.notifications.e */
public final class C9944e {
    @NotNull
    /* renamed from: a */
    private final String f32779a;
    @NotNull
    /* renamed from: b */
    private final String f32780b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9944e) {
                C9944e c9944e = (C9944e) obj;
                if (C2668g.a(this.f32779a, c9944e.f32779a) && C2668g.a(this.f32780b, c9944e.f32780b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f32779a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32780b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PushCopy(title=");
        stringBuilder.append(this.f32779a);
        stringBuilder.append(", description=");
        stringBuilder.append(this.f32780b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9944e(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(str2, ManagerWebServices.PARAM_BADGE_DESC);
        this.f32779a = str;
        this.f32780b = str2;
    }

    @NotNull
    /* renamed from: a */
    public final String m40916a() {
        return this.f32779a;
    }

    @NotNull
    /* renamed from: b */
    public final String m40917b() {
        return this.f32780b;
    }
}
