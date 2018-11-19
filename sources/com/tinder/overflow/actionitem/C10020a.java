package com.tinder.overflow.actionitem;

import android.content.Context;
import com.tinder.overflow.C10019a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH&J\b\u0010\u0016\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/overflow/actionitem/ActionItem;", "", "context", "Landroid/content/Context;", "menuItemName", "", "onItemSelected", "Lkotlin/Function0;", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getContext", "()Landroid/content/Context;", "menuItem", "Lcom/tinder/overflow/MenuItem;", "getMenuItem", "()Lcom/tinder/overflow/MenuItem;", "getMenuItemName", "()Ljava/lang/String;", "setMenuItemName", "(Ljava/lang/String;)V", "drop", "onSelectedStrategy", "take", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.actionitem.a */
public abstract class C10020a {
    @NotNull
    /* renamed from: a */
    private final Context f32887a;
    @Nullable
    /* renamed from: b */
    private String f32888b;
    /* renamed from: c */
    private final Function0<C15813i> f32889c;

    /* renamed from: b */
    public abstract void mo10690b();

    /* renamed from: c */
    public void mo10691c() {
    }

    /* renamed from: d */
    public void mo10692d() {
    }

    public C10020a(@NotNull Context context, @Nullable String str, @NotNull Function0<C15813i> function0) {
        C2668g.b(context, "context");
        C2668g.b(function0, "onItemSelected");
        this.f32887a = context;
        this.f32888b = str;
        this.f32889c = function0;
    }

    @NotNull
    /* renamed from: e */
    protected final Context m41056e() {
        return this.f32887a;
    }

    public /* synthetic */ C10020a(Context context, String str, Function0 function0, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            str = null;
        }
        this(context, str, function0);
    }

    /* renamed from: a */
    protected final void m41052a(@Nullable String str) {
        this.f32888b = str;
    }

    @NotNull
    /* renamed from: a */
    public final C10019a m41051a() {
        String str = this.f32888b;
        if (str != null) {
            return new C10019a(str, C19301m.c(new Function0[]{new ActionItem$menuItem$$inlined$let$lambda$1(this), this.f32889c}));
        }
        throw new IllegalStateException("No menuItemName has been set yet");
    }
}
