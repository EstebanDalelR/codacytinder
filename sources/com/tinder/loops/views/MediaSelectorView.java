package com.tinder.loops.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tinder.loops.C9753a.C9749d;
import com.tinder.loops.C9753a.C9750e;
import com.tinder.loops.analytics.TutorialAction;
import com.tinder.loops.di.MediaSelectorActivitySubComponentProvider;
import com.tinder.loops.p268b.C9761b;
import com.tinder.loops.p270d.C9765a;
import com.tinder.loops.target.MediaSelectorViewTarget;
import com.tinder.utils.C15365p;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0016R\u001b\u0010\b\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/tinder/loops/views/MediaSelectorView;", "Landroid/widget/RelativeLayout;", "Lcom/tinder/loops/target/MediaSelectorViewTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "container", "getContainer", "()Landroid/widget/RelativeLayout;", "container$delegate", "Lkotlin/Lazy;", "mediaSelectorTooltip", "Lcom/tinder/loops/tooltip/MediaSelectorTooltip;", "presenter", "Lcom/tinder/loops/presenter/MediaSelectorViewPresenter;", "getPresenter", "()Lcom/tinder/loops/presenter/MediaSelectorViewPresenter;", "setPresenter", "(Lcom/tinder/loops/presenter/MediaSelectorViewPresenter;)V", "dismissTooltip", "", "tooltipAction", "Lcom/tinder/loops/analytics/TutorialAction;", "onAttachedToWindow", "onDetachedFromWindow", "showMediaTooltip", "loops_release"}, k = 1, mv = {1, 1, 10})
public final class MediaSelectorView extends RelativeLayout implements MediaSelectorViewTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38924a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(MediaSelectorView.class), "container", "getContainer()Landroid/widget/RelativeLayout;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9761b f38925b;
    /* renamed from: c */
    private final Lazy f38926c;
    /* renamed from: d */
    private C9765a f38927d;
    /* renamed from: e */
    private HashMap f38928e;

    private final RelativeLayout getContainer() {
        Lazy lazy = this.f38926c;
        KProperty kProperty = f38924a[0];
        return (RelativeLayout) lazy.getValue();
    }

    /* renamed from: a */
    public View m48015a(int i) {
        if (this.f38928e == null) {
            this.f38928e = new HashMap();
        }
        View view = (View) this.f38928e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f38928e.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ MediaSelectorView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public MediaSelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f38926c = C18451c.a(LazyThreadSafetyMode.NONE, new MediaSelectorView$$special$$inlined$bindView$1(this, C9749d.mediaSelectorViewContainer));
        if (isInEditMode() == null) {
            attributeSet = C15365p.b(context);
            if (attributeSet == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.loops.di.MediaSelectorActivitySubComponentProvider");
            }
            ((MediaSelectorActivitySubComponentProvider) attributeSet).provideMediaSelectorActivitySubComponent().inject(this);
        }
        RelativeLayout.inflate(context, C9750e.media_selector_view, this);
    }

    @NotNull
    public final C9761b getPresenter() {
        C9761b c9761b = this.f38925b;
        if (c9761b == null) {
            C2668g.b("presenter");
        }
        return c9761b;
    }

    public final void setPresenter(@NotNull C9761b c9761b) {
        C2668g.b(c9761b, "<set-?>");
        this.f38925b = c9761b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9761b c9761b = this.f38925b;
        if (c9761b == null) {
            C2668g.b("presenter");
        }
        c9761b.m40288a((MediaSelectorViewTarget) this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9765a c9765a = this.f38927d;
        if (c9765a != null) {
            c9765a.m40301a();
        }
        C9761b c9761b = this.f38925b;
        if (c9761b == null) {
            C2668g.b("presenter");
        }
        c9761b.m40286a();
    }

    public void showMediaTooltip() {
        MediaTabsView mediaTabsView = (MediaTabsView) m48015a(C9749d.mediaTabsView);
        C2668g.a(mediaTabsView, "mediaTabsView");
        this.f38927d = new C9765a(mediaTabsView, getContainer(), new MediaSelectorView$showMediaTooltip$1(this));
    }

    public void dismissTooltip(@NotNull TutorialAction tutorialAction) {
        C2668g.b(tutorialAction, "tooltipAction");
        C9765a c9765a = this.f38927d;
        c9765a = this.f38927d;
        if (c9765a != null) {
            c9765a.m40302b();
        }
        C9761b c9761b = this.f38925b;
        if (c9761b == null) {
            C2668g.b("presenter");
        }
        c9761b.m40287a(tutorialAction);
    }
}
