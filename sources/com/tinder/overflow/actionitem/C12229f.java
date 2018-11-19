package com.tinder.overflow.actionitem;

import android.content.Context;
import com.tinder.api.ManagerWebServices;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.activities.MatchProfileActivity;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/overflow/actionitem/OpenProfileActionItem;", "Lcom/tinder/overflow/actionitem/ActionItem;", "context", "Landroid/content/Context;", "menuItemText", "", "onItemSelected", "Lkotlin/Function0;", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "model", "Lcom/tinder/overflow/actionitem/OpenProfileActionItem$Model;", "bind", "onSelectedStrategy", "Model", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.actionitem.f */
public final class C12229f extends C10020a {
    /* renamed from: a */
    private C10021a f39588a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/overflow/actionitem/OpenProfileActionItem$Model;", "", "userId", "", "matchId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.actionitem.f$a */
    public static final class C10021a {
        @NotNull
        /* renamed from: a */
        private final String f32890a;
        @NotNull
        /* renamed from: b */
        private final String f32891b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10021a) {
                    C10021a c10021a = (C10021a) obj;
                    if (C2668g.a(this.f32890a, c10021a.f32890a) && C2668g.a(this.f32891b, c10021a.f32891b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f32890a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f32891b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Model(userId=");
            stringBuilder.append(this.f32890a);
            stringBuilder.append(", matchId=");
            stringBuilder.append(this.f32891b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10021a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
            C2668g.b(str2, "matchId");
            this.f32890a = str;
            this.f32891b = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m41057a() {
            return this.f32890a;
        }

        @NotNull
        /* renamed from: b */
        public final String m41058b() {
            return this.f32891b;
        }
    }

    public C12229f(@NotNull Context context, @NotNull String str, @NotNull Function0<C15813i> function0) {
        C2668g.b(context, "context");
        C2668g.b(str, "menuItemText");
        C2668g.b(function0, "onItemSelected");
        super(context, str, function0);
    }

    /* renamed from: b */
    public void mo10690b() {
        Context e = m41056e();
        Context e2 = m41056e();
        C10021a c10021a = this.f39588a;
        if (c10021a == null) {
            C2668g.b("model");
        }
        String a = c10021a.m41057a();
        C10021a c10021a2 = this.f39588a;
        if (c10021a2 == null) {
            C2668g.b("model");
        }
        e.startActivity(MatchProfileActivity.a(e2, a, c10021a2.m41058b(), ProfileScreenSource.FEED));
    }

    /* renamed from: a */
    public final void m48392a(@NotNull C10021a c10021a) {
        C2668g.b(c10021a, "model");
        this.f39588a = c10021a;
    }
}
