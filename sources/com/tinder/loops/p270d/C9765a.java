package com.tinder.loops.p270d;

import android.content.Context;
import android.support.v4.content.C0432b;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.jakewharton.rxbinding2.p140b.C5716a;
import com.tinder.loops.C9753a.C9746a;
import com.tinder.loops.C9753a.C9747b;
import com.tinder.loops.C9753a.C9751f;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import tinder.com.tooltip.OverlayTooltipView;
import tinder.com.tooltip.OverlayTooltipView.C19458a;
import tinder.com.tooltip.OverlayTooltipView.OnTooltipViewShownListener;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.TooltipView;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/loops/tooltip/MediaSelectorTooltip;", "", "anchorView", "Landroid/view/View;", "parentContainer", "Landroid/view/ViewGroup;", "onClickAction", "Lkotlin/Function0;", "", "(Landroid/view/View;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "getAnchorView", "()Landroid/view/View;", "animator", "Lcom/tinder/loops/tooltip/MediaSelectorTooltipAnimator;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getOnClickAction", "()Lkotlin/jvm/functions/Function0;", "getParentContainer", "()Landroid/view/ViewGroup;", "tooltipView", "buildAndShowTooltip", "Ltinder/com/tooltip/OverlayTooltipView;", "dismissTooltip", "stopAnimation", "loops_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.d.a */
public final class C9765a {
    /* renamed from: a */
    private final C9766b f32400a = new C9766b();
    /* renamed from: b */
    private View f32401b;
    /* renamed from: c */
    private final C17356a f32402c = new C17356a();
    @NotNull
    /* renamed from: d */
    private final View f32403d;
    @NotNull
    /* renamed from: e */
    private final ViewGroup f32404e;
    @NotNull
    /* renamed from: f */
    private final Function0<C15813i> f32405f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.d.a$2 */
    static final class C119272<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C119272 f38825a = new C119272();

        C119272() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47930a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47930a(Throwable th) {
            C0001a.c(th, "Error observing layout changes for feed list", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/loops/tooltip/MediaSelectorTooltip$buildAndShowTooltip$1", "Ltinder/com/tooltip/OverlayTooltipView$OnTooltipViewShownListener;", "(Lcom/tinder/loops/tooltip/MediaSelectorTooltip;)V", "onTooltipViewShown", "", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "overlayView", "Landroid/view/View;", "loops_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.d.a$a */
    public static final class C11928a implements OnTooltipViewShownListener {
        /* renamed from: a */
        final /* synthetic */ C9765a f38826a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.loops.d.a$a$a */
        static final class C9764a implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C11928a f32399a;

            C9764a(C11928a c11928a) {
                this.f32399a = c11928a;
            }

            public final void onClick(View view) {
                this.f32399a.f38826a.m40302b();
                this.f32399a.f38826a.m40304d().invoke();
            }
        }

        C11928a(C9765a c9765a) {
            this.f38826a = c9765a;
        }

        public void onTooltipViewShown(@NotNull TooltipView tooltipView, @NotNull View view) {
            C2668g.b(tooltipView, "tooltipView");
            C2668g.b(view, "overlayView");
            this.f38826a.f32400a.m40307a(tooltipView);
            tooltipView.setOnClickListener((OnClickListener) new C9764a(this));
        }
    }

    public C9765a(@NotNull View view, @NotNull ViewGroup viewGroup, @NotNull Function0<C15813i> function0) {
        C2668g.b(view, "anchorView");
        C2668g.b(viewGroup, "parentContainer");
        C2668g.b(function0, "onClickAction");
        this.f32403d = view;
        this.f32404e = viewGroup;
        this.f32405f = function0;
        this.f32402c.add(C5716a.c(this.f32403d).take(1).subscribe((Consumer) new Consumer<Object>() {
            public final void accept(Object obj) {
                this.f32401b = this.m40300e();
                this.m40303c().addView(this.f32401b);
            }
        }, (Consumer) C119272.f38825a));
    }

    @NotNull
    /* renamed from: c */
    public final ViewGroup m40303c() {
        return this.f32404e;
    }

    @NotNull
    /* renamed from: d */
    public final Function0<C15813i> m40304d() {
        return this.f32405f;
    }

    /* renamed from: a */
    public final void m40301a() {
        this.f32400a.m40306a();
        this.f32402c.a();
    }

    /* renamed from: b */
    public final void m40302b() {
        m40301a();
        this.f32404e.removeView(this.f32401b);
    }

    /* renamed from: e */
    private final OverlayTooltipView m40300e() {
        Context context = this.f32403d.getContext();
        int[] iArr = new int[]{C0432b.c(context, C9746a.gradient_red), C0432b.c(context, C9746a.gradient_orange)};
        C2668g.a(context, "context");
        C19458a a = new C19458a(context, AnchorGravity.TOP).a(this.f32403d);
        String string = context.getString(C9751f.find_videos);
        C2668g.a(string, "context.getString(R.string.find_videos)");
        OverlayTooltipView a2 = a.a(string).a(C0432b.c(context, C9746a.transparent)).a(iArr).b(-1).c(context.getResources().getDimensionPixelSize(C9747b.tooltip_text_size)).a(new C11928a(this)).a();
        a2.a();
        return a2;
    }
}
