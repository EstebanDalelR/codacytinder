package com.tinder.toppicks.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.Target;
import com.tinder.R;
import com.tinder.base.view.IdViewAnimator;
import com.tinder.base.view.TouchBlockingFrameLayout;
import com.tinder.common.view.C8579a;
import com.tinder.common.view.Container;
import com.tinder.common.view.ContainerRegistrar;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.recs.model.TopPickTeaserRec;
import com.tinder.toppicks.TopPicksComponentProvider;
import com.tinder.toppicks.exhausted.C15264a;
import com.tinder.toppicks.exhausted.C15267e;
import com.tinder.toppicks.exhausted.TopPicksExhaustedView;
import com.tinder.toppicks.intromodal.C15274b;
import com.tinder.toppicks.intromodal.C18232a;
import com.tinder.toppicks.presenter.C15292m;
import com.tinder.toppicks.target.TopPicksTarget;
import com.tinder.toppicks.teasers.TopPicksTeasersView;
import com.tinder.utils.C15365p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001CB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0016\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\u0010\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020)H\u0014J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020)H\u0014J\b\u00104\u001a\u00020)H\u0007J\b\u00105\u001a\u00020)H\u0007J\b\u00106\u001a\u00020)H\u0002J\b\u00107\u001a\u00020)H\u0002J\b\u00108\u001a\u00020)H\u0016J\b\u00109\u001a\u00020)H\u0016J\u0016\u00109\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020:0+H\u0016J\b\u0010;\u001a\u00020)H\u0016J\u0010\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u00020)H\u0016J\b\u0010@\u001a\u00020)H\u0016J\b\u0010A\u001a\u00020)H\u0016J\b\u0010B\u001a\u00020)H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksView;", "Lcom/tinder/base/view/TouchBlockingFrameLayout;", "Lcom/tinder/toppicks/target/TopPicksTarget;", "Lcom/tinder/common/view/Container;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "container", "Lcom/tinder/base/view/IdViewAnimator;", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "getLifecycle", "()Landroid/arch/lifecycle/Lifecycle;", "setLifecycle", "(Landroid/arch/lifecycle/Lifecycle;)V", "padding", "", "presenter", "Lcom/tinder/toppicks/presenter/TopPicksPresenter;", "getPresenter", "()Lcom/tinder/toppicks/presenter/TopPicksPresenter;", "setPresenter", "(Lcom/tinder/toppicks/presenter/TopPicksPresenter;)V", "spanCount", "", "topPicksExhaustedView", "Lcom/tinder/toppicks/exhausted/TopPicksExhaustedView;", "topPicksGoldView", "Lcom/tinder/toppicks/view/TopPicksGoldView;", "topPicksTeaserExhaustedViewModelFactory", "Lcom/tinder/toppicks/exhausted/TopPicksTeaserExhaustedViewModelFactory;", "getTopPicksTeaserExhaustedViewModelFactory", "()Lcom/tinder/toppicks/exhausted/TopPicksTeaserExhaustedViewModelFactory;", "setTopPicksTeaserExhaustedViewModelFactory", "(Lcom/tinder/toppicks/exhausted/TopPicksTeaserExhaustedViewModelFactory;)V", "topPicksTeasersView", "Lcom/tinder/toppicks/teasers/TopPicksTeasersView;", "internalShowTopPicksExhausted", "", "teasers", "", "Lcom/tinder/toppicks/exhausted/TopPickTeaserExhaustedViewModel;", "launchIntroModal", "viewModel", "Lcom/tinder/toppicks/intromodal/TopPicksIntroModalViewModel;", "onAttachedToWindow", "onBackPressed", "", "onDetachedFromWindow", "onPause", "onResume", "removeGoldGrid", "removeTeasersGrid", "showEmpty", "showGoldExhausted", "Lcom/tinder/domain/recs/model/TopPickTeaserRec;", "showGoldGrid", "showIntroModal", "url", "", "showNonGoldGrid", "showRecsNotLoaded", "showTeasersNotLoaded", "showTutorial", "TopPicksDestination", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksView extends TouchBlockingFrameLayout implements LifecycleObserver, Container, TopPicksTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C15292m f14078a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C15267e f14079b;
    @Inject
    @NotNull
    /* renamed from: c */
    public Lifecycle f14080c;
    /* renamed from: d */
    private final float f14081d;
    /* renamed from: e */
    private final int f14082e;
    /* renamed from: f */
    private final IdViewAnimator f14083f;
    /* renamed from: g */
    private TopPicksGoldView f14084g;
    /* renamed from: h */
    private final TopPicksExhaustedView f14085h;
    /* renamed from: i */
    private TopPicksTeasersView f14086i;

    public /* synthetic */ TopPicksView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        this.f14081d = context.getResources().getDimension(R.dimen.space_s);
        this.f14082e = context.getResources().getInteger(R.integer.grid_recs_span_count);
        attributeSet = C15365p.b(context);
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.toppicks.TopPicksComponentProvider");
        }
        ((TopPicksComponentProvider) attributeSet).provideTopPicksComponent().inject(this);
        FrameLayout.inflate(context, R.layout.top_picks_view, this);
        setId(R.id.touch_blocking_container);
        Object findViewById = findViewById(R.id.top_picks_container);
        C2668g.m10305a(findViewById, "findViewById(R.id.top_picks_container)");
        this.f14083f = (IdViewAnimator) findViewById;
        findViewById = findViewById(R.id.top_picks_exhausted_view);
        C2668g.m10305a(findViewById, "findViewById(R.id.top_picks_exhausted_view)");
        this.f14085h = (TopPicksExhaustedView) findViewById;
    }

    @NotNull
    public final C15292m getPresenter() {
        C15292m c15292m = this.f14078a;
        if (c15292m == null) {
            C2668g.m10310b("presenter");
        }
        return c15292m;
    }

    public final void setPresenter(@NotNull C15292m c15292m) {
        C2668g.m10309b(c15292m, "<set-?>");
        this.f14078a = c15292m;
    }

    @NotNull
    public final C15267e getTopPicksTeaserExhaustedViewModelFactory() {
        C15267e c15267e = this.f14079b;
        if (c15267e == null) {
            C2668g.m10310b("topPicksTeaserExhaustedViewModelFactory");
        }
        return c15267e;
    }

    public final void setTopPicksTeaserExhaustedViewModelFactory(@NotNull C15267e c15267e) {
        C2668g.m10309b(c15267e, "<set-?>");
        this.f14079b = c15267e;
    }

    @NotNull
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f14080c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        return lifecycle;
    }

    public final void setLifecycle(@NotNull Lifecycle lifecycle) {
        C2668g.m10309b(lifecycle, "<set-?>");
        this.f14080c = lifecycle;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Lifecycle lifecycle = this.f14080c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo36a(this);
        ContainerRegistrar a = C8579a.a(this);
        if (a != null) {
            a.setContainer(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Lifecycle lifecycle = this.f14080c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo37b(this);
        Deadshot.drop(this);
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        C15292m c15292m = this.f14078a;
        if (c15292m == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c15292m);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        Deadshot.drop(this);
    }

    public void showRecsNotLoaded() {
        showGoldGrid();
    }

    public void showGoldGrid() {
        TopPicksGoldView topPicksGoldView;
        m17384b();
        if (this.f14084g == null) {
            Object context = getContext();
            C2668g.m10305a(context, "context");
            this.f14084g = new TopPicksGoldView(context, null, 2, null);
            topPicksGoldView = this.f14084g;
            if (topPicksGoldView != null) {
                topPicksGoldView.setId(R.id.top_picks_gold_view);
            }
            this.f14083f.addView(this.f14084g);
        }
        topPicksGoldView = this.f14084g;
        if (topPicksGoldView != null) {
            this.f14083f.setDisplayedChildId(topPicksGoldView.getId());
        }
    }

    public void showTeasersNotLoaded() {
        showNonGoldGrid();
        TopPicksTeasersView topPicksTeasersView = this.f14086i;
        if (topPicksTeasersView != null) {
            topPicksTeasersView.syncTeasers();
        }
    }

    public void showNonGoldGrid() {
        TopPicksTeasersView topPicksTeasersView;
        if (this.f14086i == null) {
            Object context = getContext();
            C2668g.m10305a(context, "context");
            this.f14086i = new TopPicksTeasersView(context, null, 2, null);
            topPicksTeasersView = this.f14086i;
            if (topPicksTeasersView != null) {
                topPicksTeasersView.setId(R.id.top_picks_teasers_view);
            }
            this.f14083f.addView(this.f14086i);
        }
        topPicksTeasersView = this.f14086i;
        if (topPicksTeasersView != null) {
            this.f14083f.setDisplayedChildId(topPicksTeasersView.getId());
        }
    }

    public void showGoldExhausted() {
        List arrayList = new ArrayList();
        TopPicksGoldView topPicksGoldView = this.f14084g;
        if (topPicksGoldView != null) {
            arrayList.addAll(topPicksGoldView.getTeasers());
        }
        if ((arrayList.isEmpty() ^ 1) != 0) {
            m17383a(arrayList);
            return;
        }
        C15292m c15292m = this.f14078a;
        if (c15292m == null) {
            C2668g.m10310b("presenter");
        }
        c15292m.i();
    }

    public void showGoldExhausted(@NotNull List<TopPickTeaserRec> list) {
        C2668g.m10309b(list, "teasers");
        float width = ((float) getWidth()) / ((float) this.f14082e);
        Iterable<TopPickTeaserRec> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        int i = 0;
        for (TopPickTeaserRec topPickTeaserRec : iterable) {
            int i2 = i + 1;
            C15267e c15267e = this.f14079b;
            if (c15267e == null) {
                C2668g.m10310b("topPicksTeaserExhaustedViewModelFactory");
            }
            arrayList.add(c15267e.a(i, topPickTeaserRec, (int) width, new PointF(width, this.f14081d)));
            i = i2;
        }
        m17383a((List) arrayList);
    }

    public void showEmpty() {
        m17380a();
        this.f14083f.setDisplayedChildId(R.id.top_picks_empty_view);
    }

    public boolean onBackPressed() {
        int displayedChildId = this.f14083f.getDisplayedChildId();
        TopPicksGoldView topPicksGoldView = this.f14084g;
        boolean z = false;
        if (topPicksGoldView == null || displayedChildId != topPicksGoldView.getId()) {
            return false;
        }
        TopPicksGoldView topPicksGoldView2 = this.f14084g;
        if (topPicksGoldView2 != null) {
            z = topPicksGoldView2.onBackPressed();
        }
        return z;
    }

    public void showIntroModal(@NotNull String str) {
        C2668g.m10309b(str, "url");
        C0994i.m3486b(getContext()).m11774a(str).m15924l().m11794a(DiskCacheStrategy.SOURCE).m3435b((Target) new TopPicksView$b(this));
    }

    public void showTutorial() {
        TopPicksGoldView topPicksGoldView = this.f14084g;
        if (topPicksGoldView != null) {
            topPicksGoldView.showTutorial();
        }
    }

    /* renamed from: a */
    private final void m17380a() {
        TopPicksGoldView topPicksGoldView = this.f14084g;
        if (topPicksGoldView != null) {
            this.f14083f.removeView(topPicksGoldView);
        }
        this.f14084g = (TopPicksGoldView) null;
    }

    /* renamed from: b */
    private final void m17384b() {
        TopPicksTeasersView topPicksTeasersView = this.f14086i;
        if (topPicksTeasersView != null) {
            this.f14083f.removeView(topPicksTeasersView);
        }
        this.f14086i = (TopPicksTeasersView) null;
    }

    /* renamed from: a */
    private final void m17383a(List<C15264a> list) {
        float width = ((float) getWidth()) / 2.0f;
        this.f14085h.a(list);
        this.f14083f.setDisplayedChildId(R.id.top_picks_exhausted_view);
        this.f14085h.a(width);
        m17380a();
    }

    /* renamed from: a */
    private final void m17381a(C15274b c15274b) {
        Object context = getContext();
        C2668g.m10305a(context, "context");
        C18232a c18232a = new C18232a(context, c15274b);
        c18232a.setOnDismissListener((OnDismissListener) new TopPicksView$a(this));
        c18232a.show();
    }
}
