package com.tinder.recs.view.superlike;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.recs.presenter.GridSuperLikeButtonPresenter;
import com.tinder.recs.target.GridSuperLikeButtonTarget;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u001c\u001a\u00020\u0012H\u0014J\b\u0010\u001d\u001a\u00020\u0012H\u0014J\u0014\u0010\u001e\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/tinder/recs/view/superlike/GridSuperLikeButtonView;", "Landroid/support/design/widget/FloatingActionButton;", "Lcom/tinder/recs/target/GridSuperLikeButtonTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "disabledDrawable", "Landroid/graphics/drawable/Drawable;", "enabledDrawable", "presenter", "Lcom/tinder/recs/presenter/GridSuperLikeButtonPresenter;", "getPresenter", "()Lcom/tinder/recs/presenter/GridSuperLikeButtonPresenter;", "setPresenter", "(Lcom/tinder/recs/presenter/GridSuperLikeButtonPresenter;)V", "disableSuperLike", "", "enableSuperLike", "findInjector", "Lcom/tinder/recs/view/superlike/GridSuperLikeButtonInjector;", "view", "Landroid/view/View;", "handleSuperLikeClick", "action", "Lkotlin/Function0;", "injectSuperLike", "onAttachedToWindow", "onDetachedFromWindow", "setSuperLikeOnClickListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GridSuperLikeButtonView extends FloatingActionButton implements GridSuperLikeButtonTarget {
    private HashMap _$_findViewCache;
    private Drawable disabledDrawable;
    private Drawable enabledDrawable;
    @Inject
    @NotNull
    public GridSuperLikeButtonPresenter presenter;

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ GridSuperLikeButtonView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public GridSuperLikeButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.enabledDrawable = C0432b.a(context, R.drawable.superlike_gradient);
        this.disabledDrawable = C0432b.a(context, R.drawable.superlike_gradient_disabled);
    }

    @NotNull
    public final GridSuperLikeButtonPresenter getPresenter() {
        GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter = this.presenter;
        if (gridSuperLikeButtonPresenter == null) {
            C2668g.b("presenter");
        }
        return gridSuperLikeButtonPresenter;
    }

    public final void setPresenter(@NotNull GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter) {
        C2668g.b(gridSuperLikeButtonPresenter, "<set-?>");
        this.presenter = gridSuperLikeButtonPresenter;
    }

    public final void injectSuperLike(@NotNull View view) {
        C2668g.b(view, "view");
        findInjector(view).inject(this);
    }

    public void enableSuperLike() {
        setEnabled(true);
        setImageDrawable(this.enabledDrawable);
    }

    public void disableSuperLike() {
        setEnabled(false);
        setImageDrawable(this.disabledDrawable);
    }

    public final void setSuperLikeOnClickListener(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "action");
        setOnClickListener(new GridSuperLikeButtonView$setSuperLikeOnClickListener$1(this, function0));
    }

    private final void handleSuperLikeClick(Function0<C15813i> function0) {
        GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter = this.presenter;
        if (gridSuperLikeButtonPresenter == null) {
            C2668g.b("presenter");
        }
        gridSuperLikeButtonPresenter.handleOnClick(function0);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter = this.presenter;
        if (gridSuperLikeButtonPresenter == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, gridSuperLikeButtonPresenter);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    private final GridSuperLikeButtonInjector findInjector(View view) {
        GridSuperLikeButtonInjector gridSuperLikeButtonInjector = (GridSuperLikeButtonInjector) (!(view instanceof GridSuperLikeButtonInjector) ? null : view);
        if (gridSuperLikeButtonInjector != null) {
            return gridSuperLikeButtonInjector;
        }
        view = view.getParent();
        if (view != null) {
            return findInjector(view);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }
}
