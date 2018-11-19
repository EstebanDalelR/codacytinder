package com.tinder.chat.view.action;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AlertDialog.Builder;
import com.tinder.R;
import com.tinder.chat.analytics.C10531g;
import com.tinder.chat.analytics.C10531g.C8428a;
import com.tinder.chat.analytics.C10533j;
import com.tinder.chat.analytics.C10533j.C8430a;
import com.tinder.chat.analytics.C10536o;
import com.tinder.chat.analytics.C10536o.C8433a;
import com.tinder.chat.analytics.C10537q;
import com.tinder.chat.analytics.C10537q.C8434a;
import com.tinder.chat.analytics.C10542z;
import com.tinder.chat.analytics.C10542z.C8439a;
import com.tinder.chat.view.action.C8467y.C8466a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.C8455a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J+\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050*2\u0006\u0010'\u001a\u00020(2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/tinder/chat/view/action/ChatContextualMenuAction;", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "activityContext", "Landroid/content/Context;", "matchId", "", "copyToClipboardAction", "Lcom/tinder/chat/view/action/MessageTextCopyToClipboardAction;", "likingAction", "Lcom/tinder/chat/view/action/MessageLikingAction;", "retryAction", "Lcom/tinder/chat/view/action/MessageRetryAction;", "deleteAction", "Lcom/tinder/chat/view/action/MessageDeleteAction;", "chatDeleteMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatDeleteMessageEventDispatcher;", "chatCancelSendErrorOptionEventDispatcher", "Lcom/tinder/chat/analytics/ChatCancelSendErrorOptionEventDispatcher;", "chatLongPressMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatLongPressMessageEventDispatcher;", "chatLongPressOptionEventDispatcher", "Lcom/tinder/chat/analytics/ChatLongPressOptionEventDispatcher;", "chatSelectSendErrorOptionsEventDispatcher", "Lcom/tinder/chat/analytics/ChatSelectSendErrorOptionsEventDispatcher;", "(Landroid/content/Context;Ljava/lang/String;Lcom/tinder/chat/view/action/MessageTextCopyToClipboardAction;Lcom/tinder/chat/view/action/MessageLikingAction;Lcom/tinder/chat/view/action/MessageRetryAction;Lcom/tinder/chat/view/action/MessageDeleteAction;Lcom/tinder/chat/analytics/ChatDeleteMessageEventDispatcher;Lcom/tinder/chat/analytics/ChatCancelSendErrorOptionEventDispatcher;Lcom/tinder/chat/analytics/ChatLongPressMessageEventDispatcher;Lcom/tinder/chat/analytics/ChatLongPressOptionEventDispatcher;Lcom/tinder/chat/analytics/ChatSelectSendErrorOptionsEventDispatcher;)V", "menuItemCopy", "menuItemCopyUrl", "menuItemDelete", "menuItemLike", "menuItemRetry", "dispatchErrorOptionsSelectEvent", "", "info", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction$MenuContextualInfo;", "position", "", "button", "resolveAnalyticsMessageType", "", "type", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction$Type;", "resolveMenuItems", "", "isFailed", "", "isLiked", "(Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction$Type;ZZ)[Ljava/lang/String;", "showMenu", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.h */
public final class C10584h implements ChatContextualMenuDisplayAction {
    /* renamed from: a */
    private final String f34375a;
    /* renamed from: b */
    private final String f34376b;
    /* renamed from: c */
    private final String f34377c;
    /* renamed from: d */
    private final String f34378d;
    /* renamed from: e */
    private final String f34379e;
    /* renamed from: f */
    private final Context f34380f;
    /* renamed from: g */
    private final String f34381g;
    /* renamed from: h */
    private final aa f34382h;
    /* renamed from: i */
    private final C8465w f34383i;
    /* renamed from: j */
    private final C8467y f34384j;
    /* renamed from: k */
    private final C8464u f34385k;
    /* renamed from: l */
    private final C10533j f34386l;
    /* renamed from: m */
    private final C10531g f34387m;
    /* renamed from: n */
    private final C10536o f34388n;
    /* renamed from: o */
    private final C10537q f34389o;
    /* renamed from: p */
    private final C10542z f34390p;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.h$a */
    static final class C8461a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C10584h f30120a;
        /* renamed from: b */
        final /* synthetic */ String[] f30121b;
        /* renamed from: c */
        final /* synthetic */ C8455a f30122c;

        C8461a(C10584h c10584h, String[] strArr, C8455a c8455a) {
            this.f30120a = c10584h;
            this.f30121b = strArr;
            this.f30122c = c8455a;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String[] strArr = this.f30121b;
            Collection arrayList = new ArrayList(strArr.length);
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                arrayList.add(C15811g.a(Integer.valueOf(i3), strArr[i2]));
                i2++;
                i3 = i4;
            }
            Pair pair = (Pair) ((List) arrayList).get(i);
            int intValue = ((Number) pair.c()).intValue();
            String str = (String) pair.d();
            if (!C2668g.a(str, this.f30120a.f34375a)) {
                if (!C2668g.a(str, this.f30120a.f34376b)) {
                    if (C2668g.a(str, this.f30120a.f34377c)) {
                        this.f30120a.f34383i.m36212a(this.f30122c.m36182a(), this.f30120a.f34381g, this.f30120a.m42660a(this.f30122c.m36184c()), this.f30122c.m36183b(), this.f30122c.m36187f(), this.f30122c.m36186e(), this.f30122c.m36189h(), this.f30122c.m36190i());
                    } else if (C2668g.a(str, this.f30120a.f34378d)) {
                        this.f30120a.f34384j.m36223a(new C8466a(this.f30122c.m36182a(), this.f30120a.f34381g, this.f30122c.m36183b(), this.f30120a.m42660a(this.f30122c.m36184c()), this.f30122c.m36187f(), "error options", this.f30122c.m36189h(), this.f30122c.m36190i()));
                        if (this.f30122c.m36185d()) {
                            this.f30120a.m42663a(this.f30122c, (Number) Integer.valueOf(intValue), "resend");
                        }
                    } else if (C2668g.a(str, this.f30120a.f34379e)) {
                        C10533j j = this.f30120a.f34386l;
                        String f = this.f30120a.f34381g;
                        i3 = this.f30120a.m42660a(this.f30122c.m36184c());
                        String a = this.f30122c.m36182a();
                        j.m42618a(new C8430a(f, i3, this.f30122c.m36183b(), this.f30122c.m36186e(), a, this.f30122c.m36189h(), this.f30122c.m36190i()));
                        this.f30120a.f34385k.m36207a(this.f30122c.m36182a());
                        if (this.f30122c.m36185d()) {
                            this.f30120a.m42663a(this.f30122c, (Number) Integer.valueOf(intValue), "delete");
                        }
                    }
                    this.f30120a.f34389o.m42626a(new C8434a(this.f30120a.f34381g, this.f30120a.m42660a(this.f30122c.m36184c()), this.f30122c.m36183b(), this.f30122c.m36187f(), this.f30122c.m36186e(), this.f30121b[i], this.f30122c.m36189h(), this.f30122c.m36190i()));
                    dialogInterface.dismiss();
                }
            }
            this.f30120a.f34382h.m36197a(this.f30122c.m36183b());
            if (this.f30122c.m36185d()) {
                this.f30120a.m42663a(this.f30122c, (Number) Integer.valueOf(intValue), "copy");
            }
            this.f30120a.f34389o.m42626a(new C8434a(this.f30120a.f34381g, this.f30120a.m42660a(this.f30122c.m36184c()), this.f30122c.m36183b(), this.f30122c.m36187f(), this.f30122c.m36186e(), this.f30121b[i], this.f30122c.m36189h(), this.f30122c.m36190i()));
            dialogInterface.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.h$b */
    static final class C8462b implements OnCancelListener {
        /* renamed from: a */
        final /* synthetic */ C10584h f30123a;
        /* renamed from: b */
        final /* synthetic */ C8455a f30124b;

        C8462b(C10584h c10584h, C8455a c8455a) {
            this.f30123a = c10584h;
            this.f30124b = c8455a;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            if (this.f30124b.m36185d() != null) {
                this.f30123a.f34387m.m42614a(new C8428a(this.f30123a.f34381g, this.f30124b.m36186e(), "background"));
                this.f30123a.m42663a(this.f30124b, null, "background");
            }
        }
    }

    public C10584h(@NotNull Context context, @NotNull String str, @NotNull aa aaVar, @NotNull C8465w c8465w, @NotNull C8467y c8467y, @NotNull C8464u c8464u, @NotNull C10533j c10533j, @NotNull C10531g c10531g, @NotNull C10536o c10536o, @NotNull C10537q c10537q, @NotNull C10542z c10542z) {
        C2668g.b(context, "activityContext");
        C2668g.b(str, "matchId");
        C2668g.b(aaVar, "copyToClipboardAction");
        C2668g.b(c8465w, "likingAction");
        C2668g.b(c8467y, "retryAction");
        C2668g.b(c8464u, "deleteAction");
        C2668g.b(c10533j, "chatDeleteMessageEventDispatcher");
        C2668g.b(c10531g, "chatCancelSendErrorOptionEventDispatcher");
        C2668g.b(c10536o, "chatLongPressMessageEventDispatcher");
        C2668g.b(c10537q, "chatLongPressOptionEventDispatcher");
        C2668g.b(c10542z, "chatSelectSendErrorOptionsEventDispatcher");
        this.f34380f = context;
        this.f34381g = str;
        this.f34382h = aaVar;
        this.f34383i = c8465w;
        this.f34384j = c8467y;
        this.f34385k = c8464u;
        this.f34386l = c10533j;
        this.f34387m = c10531g;
        this.f34388n = c10536o;
        this.f34389o = c10537q;
        this.f34390p = c10542z;
        context = this.f34380f.getResources().getString(17039361);
        C2668g.a(context, "activityContext.resource…ng(android.R.string.copy)");
        this.f34375a = context;
        context = this.f34380f.getResources().getString(17039362);
        C2668g.a(context, "activityContext.resource…android.R.string.copyUrl)");
        this.f34376b = context;
        context = this.f34380f.getResources().getString(R.string.like);
        C2668g.a(context, "activityContext.resources.getString(R.string.like)");
        this.f34377c = context;
        context = this.f34380f.getResources().getString(R.string.retry);
        C2668g.a(context, "activityContext.resource…getString(R.string.retry)");
        this.f34378d = context;
        context = this.f34380f.getResources().getString(R.string.delete);
        C2668g.a(context, "activityContext.resource…etString(R.string.delete)");
        this.f34379e = context;
    }

    public void showMenu(@NotNull C8455a c8455a) {
        C2668g.b(c8455a, "info");
        String[] a = m42665a(c8455a.m36184c(), c8455a.m36185d(), c8455a.m36188g());
        if ((a.length == 0 ? 1 : null) == null) {
            new Builder(this.f34380f).setItems((CharSequence[]) a, new C8461a(this, a, c8455a)).setOnCancelListener(new C8462b(this, c8455a)).show();
            this.f34388n.m42624a(new C8433a(this.f34381g, m42660a(c8455a.m36184c()), c8455a.m36183b(), c8455a.m36187f(), c8455a.m36186e(), c8455a.m36189h(), c8455a.m36190i()));
        }
    }

    /* renamed from: a */
    private final void m42663a(C8455a c8455a, Number number, String str) {
        this.f34390p.m42636a(new C8439a(this.f34381g, m42660a(c8455a.m36184c()), c8455a.m36183b(), c8455a.m36186e(), c8455a.m36187f(), number, str, false));
    }

    /* renamed from: a */
    private final int m42660a(Type type) {
        switch (C8463i.f30125a[type.ordinal()]) {
            case 1:
            case 2:
                return null;
            case 3:
            case 4:
                return 1;
            case 5:
            case 6:
                return 2;
            case 7:
            case 8:
                return 3;
            case 9:
            case 10:
                return 4;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final String[] m42665a(Type type, boolean z, boolean z2) {
        switch (C8463i.f30126b[type.ordinal()]) {
            case 1:
                if (z2) {
                    return new String[]{this.f34375a};
                }
                return new String[]{this.f34375a, this.f34377c};
            case 2:
                if (z) {
                    return new String[]{this.f34375a, this.f34378d, this.f34379e};
                }
                return new String[]{this.f34375a};
            case 3:
                if (z2) {
                    return new String[]{this.f34376b};
                }
                return new String[]{this.f34376b, this.f34377c};
            case 4:
                if (z) {
                    return new String[]{this.f34376b, this.f34378d, this.f34379e};
                }
                return new String[]{this.f34376b};
            case 5:
                if (z2) {
                    return new String[0];
                }
                return new String[]{this.f34377c};
            case 6:
                if (!z) {
                    return new String[0];
                }
                return new String[]{this.f34378d, this.f34379e};
            case 7:
                if (z) {
                    return new String[0];
                }
                return new String[]{this.f34375a};
            case 8:
                if (z) {
                    return new String[]{this.f34375a, this.f34379e};
                }
                return new String[]{this.f34375a};
            case 9:
                if (z2) {
                    return new String[]{this.f34376b};
                }
                return new String[]{this.f34376b, this.f34377c};
            case 10:
                if (z) {
                    return new String[]{this.f34376b, this.f34378d, this.f34379e};
                }
                return new String[]{this.f34376b};
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
