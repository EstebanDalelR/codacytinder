package com.tinder.reactions.chat.p387b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.annotation.ColorRes;
import android.support.annotation.StringRes;
import android.support.v4.content.res.C0441a;
import android.view.View;
import com.tinder.R;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import tinder.com.tooltip.Tooltip;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.Tooltip.C19463a;
import tinder.com.tooltip.Tooltip.OnClickListener;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0005H\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0005H\u0002J\u001a\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nJ\u001a\u0010\u0014\u001a\u00020\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/reactions/chat/tooltip/ChatInputReactionTooltip;", "", "anchorView", "Landroid/view/View;", "resId", "", "(Landroid/view/View;I)V", "tooltipBuilder", "Ltinder/com/tooltip/Tooltip$Builder;", "tooltipDismissListener", "Lkotlin/Function1;", "", "getColor", "context", "Landroid/content/Context;", "id", "getString", "", "onClickListener", "listener", "onDismissListener", "show", "Ltinder/com/tooltip/Tooltip;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.chat.b.a */
public final class C14601a {
    /* renamed from: a */
    private final C19463a f46078a;
    /* renamed from: b */
    private Function1<Object, C15813i> f46079b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.b.a$b */
    static final class C14600b implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ C14601a f46077a;

        C14600b(C14601a c14601a) {
            this.f46077a = c14601a;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            dialogInterface = this.f46077a.f46079b;
            if (dialogInterface != null) {
                C15813i c15813i = (C15813i) dialogInterface.invoke(new Object());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/reactions/chat/tooltip/ChatInputReactionTooltip$onClickListener$1", "Ltinder/com/tooltip/Tooltip$OnClickListener;", "(Lkotlin/jvm/functions/Function1;)V", "onClick", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.chat.b.a$a */
    public static final class C16291a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Function1 f50715a;

        C16291a(Function1 function1) {
            this.f50715a = function1;
        }

        public void onClick() {
            this.f50715a.invoke(C15813i.f49016a);
        }
    }

    public C14601a(@NotNull View view, @StringRes int i) {
        C2668g.b(view, "anchorView");
        int[] iArr = new int[2];
        Context context = view.getContext();
        C2668g.a(context, "anchorView.context");
        iArr[0] = m55697a(context, R.color.gradient_red);
        context = view.getContext();
        C2668g.a(context, "anchorView.context");
        iArr[1] = m55697a(context, R.color.gradient_orange);
        Context context2 = view.getContext();
        C2668g.a(context2, "anchorView.context");
        C19463a a = new C19463a(context2, view).a(true).a(AnchorGravity.TOP).a(iArr);
        view = view.getContext();
        C2668g.a(view, "anchorView.context");
        this.f46078a = a.a(m55699b(view, i)).b(true);
    }

    @NotNull
    /* renamed from: a */
    public final C14601a m55700a(@NotNull Function1<Object, C15813i> function1) {
        C2668g.b(function1, "listener");
        this.f46078a.a(new C16291a(function1));
        return this;
    }

    @NotNull
    /* renamed from: b */
    public final C14601a m55702b(@NotNull Function1<Object, C15813i> function1) {
        C2668g.b(function1, "listener");
        this.f46079b = function1;
        return this;
    }

    @NotNull
    /* renamed from: a */
    public final Tooltip m55701a() {
        Tooltip a = this.f46078a.a();
        a.setOnDismissListener(new C14600b(this));
        a.show();
        return a;
    }

    /* renamed from: a */
    private final int m55697a(Context context, @ColorRes int i) {
        return C0441a.b(context.getResources(), i, null);
    }

    /* renamed from: b */
    private final String m55699b(Context context, @StringRes int i) {
        context = context.getString(i);
        C2668g.a(context, "context.getString(id)");
        return context;
    }
}
