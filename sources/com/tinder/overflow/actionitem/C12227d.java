package com.tinder.overflow.actionitem;

import android.content.Context;
import com.tinder.analytics.chat.Origin;
import com.tinder.chat.activity.C8406b;
import com.tinder.managers.ManagerApp;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005J\b\u0010\u0012\u001a\u00020\bH\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/overflow/actionitem/MessageActionItem;", "Lcom/tinder/overflow/actionitem/ActionItem;", "context", "Landroid/content/Context;", "menuItemText", "", "onItemSelected", "Lkotlin/Function0;", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "chatIntentFactory", "Lcom/tinder/chat/activity/ChatIntentFactory;", "getChatIntentFactory", "()Lcom/tinder/chat/activity/ChatIntentFactory;", "setChatIntentFactory", "(Lcom/tinder/chat/activity/ChatIntentFactory;)V", "matchId", "bind", "onSelectedStrategy", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.actionitem.d */
public final class C12227d extends C10020a {
    @Inject
    @NotNull
    /* renamed from: a */
    public C8406b f39585a;
    /* renamed from: b */
    private String f39586b;

    public C12227d(@NotNull Context context, @NotNull String str, @NotNull Function0<C15813i> function0) {
        C2668g.b(context, "context");
        C2668g.b(str, "menuItemText");
        C2668g.b(function0, "onItemSelected");
        super(context, str, function0);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
    }

    /* renamed from: b */
    public void mo10690b() {
        Context e = m41056e();
        C8406b c8406b = this.f39585a;
        if (c8406b == null) {
            C2668g.b("chatIntentFactory");
        }
        Context e2 = m41056e();
        Origin origin = Origin.FEED;
        String str = this.f39586b;
        if (str == null) {
            C2668g.b("matchId");
        }
        e.startActivity(c8406b.m35881a(e2, origin, str));
    }

    /* renamed from: b */
    public final void m48389b(@NotNull String str) {
        C2668g.b(str, "matchId");
        this.f39586b = str;
    }
}
