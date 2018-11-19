package com.tinder.overflow.actionitem;

import android.app.Activity;
import android.content.Context;
import com.tinder.app.dagger.component.C12453a;
import com.tinder.app.dagger.component.MessageAdSettingsViewComponent;
import com.tinder.messageads.p295b.C13471a;
import com.tinder.messageads.p297d.C9907a;
import com.tinder.profile.p365d.C14398a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/tinder/overflow/actionitem/AdMessagePreferenceActionItem;", "Lcom/tinder/overflow/actionitem/ActionItem;", "context", "Landroid/content/Context;", "menuItemText", "", "onItemSelected", "Lkotlin/Function0;", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onSelectedStrategy", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.actionitem.b */
public final class C12225b extends C10020a {
    public /* synthetic */ C12225b(Context context, String str, Function0 function0, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            function0 = AdMessagePreferenceActionItem$1.f44808a;
        }
        this(context, str, function0);
    }

    public C12225b(@NotNull Context context, @NotNull String str, @NotNull Function0<C15813i> function0) {
        C2668g.b(context, "context");
        C2668g.b(str, "menuItemText");
        C2668g.b(function0, "onItemSelected");
        super(context, str, function0);
    }

    /* renamed from: b */
    public void mo10690b() {
        Context a = C14398a.a(m41056e());
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        } else if (!((Activity) a).isFinishing()) {
            Context e = m41056e();
            MessageAdSettingsViewComponent a2 = C12453a.m48946a().m35138a(new C9907a(m41056e().getApplicationContext())).m35137a();
            C2668g.a(a2, "DaggerMessageAdSettingsV…                 .build()");
            new C13471a(e, a2).show();
        }
    }
}
