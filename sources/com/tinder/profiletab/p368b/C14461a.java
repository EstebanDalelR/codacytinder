package com.tinder.profiletab.p368b;

import android.content.Context;
import android.support.v4.content.C0432b;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.R;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import tinder.com.tooltip.OverlayTooltipView;
import tinder.com.tooltip.OverlayTooltipView.C19458a;
import tinder.com.tooltip.OverlayTooltipView.OnTooltipViewShownListener;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.TooltipView;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/profiletab/tooltip/ProfileAddLoopsTooltip;", "", "()V", "animator", "Lcom/tinder/profiletab/tooltip/ProfileTooltipAnimator;", "createOverlayTooltipView", "Ltinder/com/tooltip/OverlayTooltipView;", "anchorView", "Landroid/view/View;", "onClickAction", "Lkotlin/Function0;", "", "endAnimation", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profiletab.b.a */
public final class C14461a {
    /* renamed from: a */
    private final C14462b f45809a = new C14462b();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/profiletab/tooltip/ProfileAddLoopsTooltip$createOverlayTooltipView$2", "Ltinder/com/tooltip/OverlayTooltipView$OnTooltipViewShownListener;", "(Lcom/tinder/profiletab/tooltip/ProfileAddLoopsTooltip;Lkotlin/jvm/functions/Function0;)V", "onTooltipViewShown", "", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "overlayView", "Landroid/view/View;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.b.a$a */
    public static final class C16172a implements OnTooltipViewShownListener {
        /* renamed from: a */
        final /* synthetic */ C14461a f50364a;
        /* renamed from: b */
        final /* synthetic */ Function0 f50365b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.profiletab.b.a$a$a */
        static final class C14460a implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C16172a f45808a;

            C14460a(C16172a c16172a) {
                this.f45808a = c16172a;
            }

            public final void onClick(View view) {
                this.f45808a.f50364a.m55191a();
                this.f45808a.f50365b.invoke();
            }
        }

        C16172a(C14461a c14461a, Function0 function0) {
            this.f50364a = c14461a;
            this.f50365b = function0;
        }

        public void onTooltipViewShown(@NotNull TooltipView tooltipView, @NotNull View view) {
            C2668g.b(tooltipView, "tooltipView");
            C2668g.b(view, "overlayView");
            this.f50364a.f45809a.m55194a(tooltipView);
            tooltipView.setOnClickListener((OnClickListener) new C14460a(this));
        }
    }

    @NotNull
    /* renamed from: a */
    public final OverlayTooltipView m55190a(@NotNull View view, @NotNull Function0<C15813i> function0) {
        C2668g.b(view, "anchorView");
        C2668g.b(function0, "onClickAction");
        Context context = view.getContext();
        int[] iArr = new int[]{C0432b.c(context, R.color.gradient_red), C0432b.c(context, R.color.gradient_orange)};
        C2668g.a(context, "context");
        view = new C19458a(context, AnchorGravity.TOP).a(view);
        String string = context.getString(R.string.tooltip_add_media);
        C2668g.a(string, "context.getString(R.string.tooltip_add_media)");
        view = view.a(string).a(C0432b.c(context, R.color.transparent)).a(iArr).b(-1).c(context.getResources().getDimensionPixelSize(R.dimen.tooltip_text_size)).a(new C16172a(this, function0)).a();
        view.a();
        return view;
    }

    /* renamed from: a */
    public final void m55191a() {
        this.f45809a.m55193a();
    }
}
