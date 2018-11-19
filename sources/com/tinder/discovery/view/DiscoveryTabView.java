package com.tinder.discovery.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import com.tinder.base.p173c.C8304b;
import com.tinder.design.togglenavigationview.ToggleNavigationView;
import com.tinder.design.togglenavigationview.ToggleNavigationView.OnSelectionChangeListener;
import com.tinder.discovery.C8878a.C8873a;
import com.tinder.discovery.C8878a.C8875c;
import com.tinder.discovery.C8878a.C8876d;
import com.tinder.discovery.badge.Badgeable;
import com.tinder.discovery.badge.DiscoveryBadgeOwner;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p235d.C11141b;
import com.tinder.discovery.tooltip.DiscoveryTooltipOwner;
import com.tinder.main.C9830c.C9816a;
import com.tinder.main.C9830c.C9817b;
import com.tinder.main.p287c.p288a.p289a.C9822a;
import com.tinder.main.p287c.p288a.p289a.C9826b;
import com.tinder.main.trigger.Trigger;
import com.tinder.utils.au;
import java.util.List;
import java.util.Set;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import tinder.com.tooltip.OverlayTooltipView.C19458a;
import tinder.com.tooltip.OverlayTooltipView.OnTooltipViewShownListener;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.TooltipView;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u000234B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ.\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J\b\u0010#\u001a\u00020\u001eH\u0014J\b\u0010$\u001a\u00020\u001eH\u0014J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020 J\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)J \u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010-\u001a\u00020.H\u0016J \u0010/\u001a\u00020\u001e2\u0006\u0010+\u001a\u0002002\u0006\u0010\u001f\u001a\u00020 2\u0006\u00101\u001a\u00020\u001bH\u0016J(\u00102\u001a\u00020\u001e2\u0006\u0010+\u001a\u0002002\u0006\u0010\u001f\u001a\u00020 2\u0006\u00101\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/tinder/discovery/view/DiscoveryTabView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipOwner;", "Lcom/tinder/discovery/badge/DiscoveryBadgeOwner;", "context", "Landroid/content/Context;", "adapter", "Lcom/tinder/discovery/view/DiscoveryTabView$Adapter;", "segmentChangeListeners", "", "Lcom/tinder/discovery/view/DiscoveryTabView$OnSegmentChangedListener;", "(Landroid/content/Context;Lcom/tinder/discovery/view/DiscoveryTabView$Adapter;Ljava/util/Set;)V", "overlayFadeInFadeOutAnimator", "Lcom/tinder/main/view/tooltip/animations/OverlayFadeInFadeOutAnimator;", "toggleNavigationView", "Lcom/tinder/design/togglenavigationview/ToggleNavigationView;", "toggleNavigationViewSelectionChangeListener", "com/tinder/discovery/view/DiscoveryTabView$toggleNavigationViewSelectionChangeListener$1", "Lcom/tinder/discovery/view/DiscoveryTabView$toggleNavigationViewSelectionChangeListener$1;", "tooltipAppearingAnimator", "Lcom/tinder/main/view/tooltip/animations/TooltipAppearingAnimator;", "tooltipDialog", "Landroid/app/Dialog;", "createTooltipDialog", "anchorView", "Landroid/view/View;", "message", "", "onDialogDismiss", "Lkotlin/Function0;", "", "discoverySegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "endToolTipAnimations", "getTabViewForSegment", "onAttachedToWindow", "onDetachedFromWindow", "setActiveSegment", "segment", "setupWithDiscoveryContainerView", "discoveryContainerView", "Lcom/tinder/discovery/view/DiscoveryContainerView;", "showBadgeForSegment", "trigger", "Lcom/tinder/main/trigger/Trigger;", "animated", "", "showTooltip", "Lcom/tinder/discovery/trigger/DiscoveryTabTooltipTrigger;", "tooltipText", "showTooltipDialog", "Adapter", "OnSegmentChangedListener", "discovery_release"}, k = 1, mv = {1, 1, 10})
public final class DiscoveryTabView extends FrameLayout implements DiscoveryBadgeOwner, DiscoveryTooltipOwner {
    /* renamed from: a */
    private final ToggleNavigationView f36049a;
    /* renamed from: b */
    private final C9822a f36050b = new C9822a();
    /* renamed from: c */
    private final C9826b f36051c = new C9826b();
    /* renamed from: d */
    private Dialog f36052d;
    /* renamed from: e */
    private final C11148f f36053e = new C11148f(this);
    /* renamed from: f */
    private final Adapter f36054f;
    /* renamed from: g */
    private final Set<OnSegmentChangedListener> f36055g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/tinder/discovery/view/DiscoveryTabView$OnSegmentChangedListener;", "", "onSegmentChanged", "", "nextSegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "prevSegment", "onSegmentClicked", "segment", "discovery_release"}, k = 1, mv = {1, 1, 10})
    public interface OnSegmentChangedListener {
        void onSegmentChanged(@NotNull DiscoverySegment discoverySegment, @Nullable DiscoverySegment discoverySegment2);

        void onSegmentClicked(@NotNull DiscoverySegment discoverySegment);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tinder/discovery/view/DiscoveryTabView$createTooltipDialog$2$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.DiscoveryTabView$a */
    static final class C8893a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ DiscoveryTabView f31125a;

        C8893a(DiscoveryTabView discoveryTabView) {
            this.f31125a = discoveryTabView;
        }

        public final void onClick(View view) {
            view = this.f31125a.f36052d;
            if (view != null) {
                view.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "com/tinder/discovery/view/DiscoveryTabView$createTooltipDialog$3$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.DiscoveryTabView$b */
    static final class C8894b implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ Function0 f31126a;

        C8894b(Function0 function0) {
            this.f31126a = function0;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f31126a.invoke();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/base/extension/ViewExtKt$doWhenViewHasSize$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "onPreDraw", "", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.DiscoveryTabView$e */
    public static final class C8896e implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ View f31128a;
        /* renamed from: b */
        final /* synthetic */ DiscoveryTabView f31129b;
        /* renamed from: c */
        final /* synthetic */ C11141b f31130c;
        /* renamed from: d */
        final /* synthetic */ DiscoverySegment f31131d;
        /* renamed from: e */
        final /* synthetic */ CharSequence f31132e;
        /* renamed from: f */
        final /* synthetic */ View f31133f;

        public C8896e(View view, DiscoveryTabView discoveryTabView, C11141b c11141b, DiscoverySegment discoverySegment, CharSequence charSequence, View view2) {
            this.f31128a = view;
            this.f31129b = discoveryTabView;
            this.f31130c = c11141b;
            this.f31131d = discoverySegment;
            this.f31132e = charSequence;
            this.f31133f = view2;
        }

        public boolean onPreDraw() {
            if (!C8304b.m35397b(this.f31128a)) {
                return true;
            }
            this.f31128a.getViewTreeObserver().removeOnPreDrawListener(this);
            View view = this.f31128a;
            this.f31129b.m43895a(this.f31130c, this.f31131d, this.f31132e, this.f31133f);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/tinder/discovery/view/DiscoveryTabView$Adapter;", "Lcom/tinder/design/togglenavigationview/ToggleNavigationView$Adapter;", "()V", "getDiscoverySegmentAt", "Lcom/tinder/discovery/model/DiscoverySegment;", "index", "", "indexOfDiscoverySegment", "segment", "notifyDiscoverySegmentsUpdated", "", "OnSegmentsUpdatedListener", "discovery_release"}, k = 1, mv = {1, 1, 10})
    public static abstract class Adapter extends com.tinder.design.togglenavigationview.ToggleNavigationView.Adapter {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/discovery/view/DiscoveryTabView$Adapter$OnSegmentsUpdatedListener;", "", "onSegmentsUpdated", "", "newDiscoverySegments", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "discovery_release"}, k = 1, mv = {1, 1, 10})
        public interface OnSegmentsUpdatedListener {
            void onSegmentsUpdated(@NotNull List<? extends DiscoverySegment> list);
        }

        /* renamed from: a */
        public abstract int mo11094a(@NotNull DiscoverySegment discoverySegment);

        @Nullable
        /* renamed from: a */
        public abstract DiscoverySegment mo11096a(int i);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/discovery/view/DiscoveryTabView$createTooltipDialog$1", "Ltinder/com/tooltip/OverlayTooltipView$OnTooltipViewShownListener;", "(Lcom/tinder/discovery/view/DiscoveryTabView;Landroid/view/View;Lcom/tinder/discovery/model/DiscoverySegment;)V", "onTooltipViewShown", "", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "overlayView", "Landroid/view/View;", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.DiscoveryTabView$c */
    public static final class C11146c implements OnTooltipViewShownListener {
        /* renamed from: a */
        final /* synthetic */ DiscoveryTabView f36044a;
        /* renamed from: b */
        final /* synthetic */ View f36045b;
        /* renamed from: c */
        final /* synthetic */ DiscoverySegment f36046c;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.discovery.view.DiscoveryTabView$c$a */
        static final class C8895a implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C11146c f31127a;

            C8895a(C11146c c11146c) {
                this.f31127a = c11146c;
            }

            public final void onClick(View view) {
                this.f31127a.f36044a.setActiveSegment(this.f31127a.f36046c);
            }
        }

        C11146c(DiscoveryTabView discoveryTabView, View view, DiscoverySegment discoverySegment) {
            this.f36044a = discoveryTabView;
            this.f36045b = view;
            this.f36046c = discoverySegment;
        }

        public void onTooltipViewShown(@NotNull TooltipView tooltipView, @NotNull View view) {
            C2668g.b(tooltipView, "tooltipView");
            C2668g.b(view, "overlayView");
            view.setTranslationY((float) this.f36045b.getHeight());
            this.f36044a.f36050b.m40433a(view);
            this.f36044a.f36051c.m40440a(tooltipView, this.f36045b.getHeight());
            tooltipView.setOnClickListener((OnClickListener) new C8895a(this));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/tinder/discovery/view/DiscoveryTabView$setupWithDiscoveryContainerView$1", "Lcom/tinder/design/togglenavigationview/ToggleNavigationView$OnSelectionChangeListener;", "(Lcom/tinder/discovery/view/DiscoveryContainerView;)V", "onSelectionChanged", "", "nextIndex", "", "prevIndex", "onSelectionClicked", "index", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.DiscoveryTabView$d */
    public static final class C11147d implements OnSelectionChangeListener {
        /* renamed from: a */
        final /* synthetic */ DiscoveryContainerView f36047a;

        public void onSelectionClicked(int i) {
        }

        C11147d(DiscoveryContainerView discoveryContainerView) {
            this.f36047a = discoveryContainerView;
        }

        public void onSelectionChanged(int i, int i2) {
            this.f36047a.m37724a(i);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/tinder/discovery/view/DiscoveryTabView$toggleNavigationViewSelectionChangeListener$1", "Lcom/tinder/design/togglenavigationview/ToggleNavigationView$OnSelectionChangeListener;", "(Lcom/tinder/discovery/view/DiscoveryTabView;)V", "onSelectionChanged", "", "nextIndex", "", "prevIndex", "onSelectionClicked", "index", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.DiscoveryTabView$f */
    public static final class C11148f implements OnSelectionChangeListener {
        /* renamed from: a */
        final /* synthetic */ DiscoveryTabView f36048a;

        C11148f(DiscoveryTabView discoveryTabView) {
            this.f36048a = discoveryTabView;
        }

        public void onSelectionClicked(int i) {
            for (OnSegmentChangedListener onSegmentChangedListener : this.f36048a.f36055g) {
                DiscoverySegment a = this.f36048a.f36054f.mo11096a(i);
                if (a != null) {
                    onSegmentChangedListener.onSegmentClicked(a);
                }
            }
        }

        public void onSelectionChanged(int i, int i2) {
            i = this.f36048a.f36054f.mo11096a(i);
            i2 = this.f36048a.f36054f.mo11096a(i2);
            if (i != 0) {
                for (OnSegmentChangedListener onSegmentChanged : this.f36048a.f36055g) {
                    onSegmentChanged.onSegmentChanged(i, i2);
                }
            }
        }
    }

    public DiscoveryTabView(@NotNull Context context, @NotNull Adapter adapter, @NotNull Set<? extends OnSegmentChangedListener> set) {
        C2668g.b(context, "context");
        C2668g.b(adapter, "adapter");
        C2668g.b(set, "segmentChangeListeners");
        super(context);
        this.f36054f = adapter;
        this.f36055g = set;
        View.inflate(context, C8876d.main_discovery_tab_merge, this);
        context = findViewById(C8875c.main_discovery_toggle_navigation);
        C2668g.a(context, "findViewById(R.id.main_d…covery_toggle_navigation)");
        this.f36049a = (ToggleNavigationView) context;
        this.f36049a.setAdapter(this.f36054f);
        this.f36049a.m43795a((OnSelectionChangeListener) this.f36053e);
        setActiveSegment(DiscoverySegment.RECS);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36049a.m43795a((OnSelectionChangeListener) this.f36053e);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m43894a();
        this.f36049a.m43796b((OnSelectionChangeListener) this.f36053e);
    }

    public void showTooltip(@NotNull C11141b c11141b, @NotNull DiscoverySegment discoverySegment, @NotNull CharSequence charSequence) {
        C2668g.b(c11141b, "trigger");
        C2668g.b(discoverySegment, "discoverySegment");
        C2668g.b(charSequence, "tooltipText");
        Dialog dialog = this.f36052d;
        if (dialog != null) {
            dialog.dismiss();
        }
        View childAt = this.f36049a.getChildAt(this.f36054f.mo11094a(discoverySegment));
        if (childAt == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        } else if (C8304b.m35397b(childAt)) {
            m43895a(c11141b, discoverySegment, charSequence, childAt);
        } else {
            childAt.getViewTreeObserver().addOnPreDrawListener(new C8896e(childAt, this, c11141b, discoverySegment, charSequence, childAt));
        }
    }

    public void showBadgeForSegment(@NotNull Trigger trigger, @NotNull DiscoverySegment discoverySegment, boolean z) {
        C2668g.b(trigger, "trigger");
        C2668g.b(discoverySegment, "discoverySegment");
        discoverySegment = m43904a(discoverySegment);
        if (discoverySegment instanceof Badgeable) {
            ((Badgeable) discoverySegment).showBadge(z);
        } else {
            C0001a.d("Trying to show badge on view that is not Badgeable.", new Object[false]);
        }
        trigger.m40461g();
    }

    public final void setActiveSegment(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "segment");
        this.f36049a.setDisplayedIndex(this.f36054f.mo11094a(discoverySegment));
    }

    public final void setupWithDiscoveryContainerView(@NotNull DiscoveryContainerView discoveryContainerView) {
        C2668g.b(discoveryContainerView, "discoveryContainerView");
        if (this.f36049a.getSelectedIndex() != -1) {
            discoveryContainerView.m37724a(this.f36049a.getSelectedIndex());
        }
        this.f36049a.m43795a((OnSelectionChangeListener) new C11147d(discoveryContainerView));
    }

    @NotNull
    /* renamed from: a */
    public final View m43904a(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "discoverySegment");
        discoverySegment = this.f36049a.getChildAt(this.f36054f.mo11094a(discoverySegment));
        C2668g.a(discoverySegment, "toggleNavigationView.get…egment(discoverySegment))");
        return discoverySegment;
    }

    /* renamed from: a */
    private final void m43895a(C11141b c11141b, DiscoverySegment discoverySegment, CharSequence charSequence, View view) {
        this.f36052d = m43893a(view, charSequence, (Function0) new DiscoveryTabView$showTooltipDialog$1(this, c11141b), discoverySegment);
        c11141b = this.f36052d;
        if (c11141b != null) {
            c11141b.show();
        }
    }

    /* renamed from: a */
    private final Dialog m43893a(View view, CharSequence charSequence, Function0<C15813i> function0, DiscoverySegment discoverySegment) {
        Context context = getContext();
        C2668g.a(context, "context");
        view = new C19458a(context, AnchorGravity.BOTTOM).a(view).a(charSequence.toString()).a(au.c(this, C9816a.tooltip_overlay)).a(au.a(this, new int[]{C8873a.gradient_red, C8873a.gradient_orange})).b(-1).c(getResources().getDimensionPixelSize(C9817b.tooltip_text_size)).a(0.2f).a(new C11146c(this, view, discoverySegment)).a();
        view.setOnClickListener((OnClickListener) new C8893a(this));
        view = view.b();
        view.setCanceledOnTouchOutside(true);
        view.a(5000);
        view.setOnDismissListener((OnDismissListener) new C8894b(function0));
        return (Dialog) view;
    }

    /* renamed from: a */
    private final void m43894a() {
        this.f36050b.m40432a();
        this.f36051c.m40439a();
    }
}
