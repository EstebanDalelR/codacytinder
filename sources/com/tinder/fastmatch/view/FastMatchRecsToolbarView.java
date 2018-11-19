package com.tinder.fastmatch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.fastmatch.FastMatchRecsActivityComponentProvider;
import com.tinder.fastmatch.presenter.C9395n;
import com.tinder.fastmatch.target.FastMatchToolbarTarget;
import com.tinder.fastmatch.viewmodel.C9421b;
import com.tinder.profile.p365d.C14398a;
import java.text.NumberFormat;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchRecsToolbarView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/fastmatch/target/FastMatchToolbarTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "presenter", "Lcom/tinder/fastmatch/presenter/FastMatchToolbarPresenter;", "getPresenter", "()Lcom/tinder/fastmatch/presenter/FastMatchToolbarPresenter;", "setPresenter", "(Lcom/tinder/fastmatch/presenter/FastMatchToolbarPresenter;)V", "toolbarTextView", "Landroid/widget/TextView;", "getToolbarTextView$Tinder_release", "()Landroid/widget/TextView;", "setToolbarTextView$Tinder_release", "(Landroid/widget/TextView;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "onFinishInflate", "showToolbar", "viewModel", "Lcom/tinder/fastmatch/viewmodel/FastMatchToolbarViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchRecsToolbarView extends LinearLayout implements FastMatchToolbarTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9395n f38143a;
    @NotNull
    @BindView(2131362483)
    public TextView toolbarTextView;

    public FastMatchRecsToolbarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        LinearLayout.inflate(context, R.layout.view_fast_match_toolbar_content, this);
    }

    @NotNull
    public final TextView getToolbarTextView$Tinder_release() {
        TextView textView = this.toolbarTextView;
        if (textView == null) {
            C2668g.b("toolbarTextView");
        }
        return textView;
    }

    public final void setToolbarTextView$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.toolbarTextView = textView;
    }

    @NotNull
    public final C9395n getPresenter() {
        C9395n c9395n = this.f38143a;
        if (c9395n == null) {
            C2668g.b("presenter");
        }
        return c9395n;
    }

    public final void setPresenter(@NotNull C9395n c9395n) {
        C2668g.b(c9395n, "<set-?>");
        this.f38143a = c9395n;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        Context a = C14398a.a(getContext());
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.fastmatch.FastMatchRecsActivityComponentProvider");
        }
        ((FastMatchRecsActivityComponentProvider) a).getFastMatchRecsActivityComponent().inject(this);
        ButterKnife.a(this);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9395n c9395n = this.f38143a;
        if (c9395n == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c9395n);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void showToolbar(@NotNull C9421b c9421b) {
        C2668g.b(c9421b, "viewModel");
        String format = NumberFormat.getInstance().format(Integer.valueOf(c9421b.m39390a()));
        if (c9421b.m39391b() != null) {
            c9421b = new StringBuilder();
            c9421b.append("");
            c9421b.append(format);
            c9421b.append('+');
            format = c9421b.toString();
        }
        c9421b = this.toolbarTextView;
        if (c9421b == null) {
            C2668g.b("toolbarTextView");
        }
        c9421b.setText(getResources().getString(R.string.number_of_likes, new Object[]{format}));
    }
}
