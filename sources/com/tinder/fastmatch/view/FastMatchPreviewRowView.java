package com.tinder.fastmatch.view;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.fastmatch.presenter.C9387c;
import com.tinder.fastmatch.target.FastMatchPreviewRowTarget;
import com.tinder.fastmatch.view.FastMatchRecsActivity.C9407a;
import com.tinder.fastmatch.view.FastMatchRecsActivity.Source;
import com.tinder.fastmatch.viewmodel.FastMatchPreviewViewModel;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.paywallflow.C10076o;
import java.text.NumberFormat;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0007J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchPreviewRowView;", "Landroid/widget/RelativeLayout;", "Lcom/tinder/fastmatch/target/FastMatchPreviewRowTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "matchCount", "Landroid/widget/TextView;", "getMatchCount$Tinder_release", "()Landroid/widget/TextView;", "setMatchCount$Tinder_release", "(Landroid/widget/TextView;)V", "presenter", "Lcom/tinder/fastmatch/presenter/FastMatchPreviewRowPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/fastmatch/presenter/FastMatchPreviewRowPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/fastmatch/presenter/FastMatchPreviewRowPresenter;)V", "navigateToCardGrid", "", "source", "Lcom/tinder/fastmatch/view/FastMatchRecsActivity$Source;", "onAttachedToWindow", "onDetachedFromWindow", "onFastMatchPreviewClick", "showPaywall", "showPreview", "viewModel", "Lcom/tinder/fastmatch/viewmodel/FastMatchPreviewViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchPreviewRowView extends RelativeLayout implements FastMatchPreviewRowTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9387c f38123a;
    @NotNull
    @BindView(2131362475)
    public TextView matchCount;

    public FastMatchPreviewRowView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        RelativeLayout.inflate(context, R.layout.view_fast_match_preview_row, this);
        ButterKnife.a(this);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        context = this.matchCount;
        if (context == null) {
            C2668g.b("matchCount");
        }
        context.setText(R.string.likes);
    }

    @NotNull
    public final TextView getMatchCount$Tinder_release() {
        TextView textView = this.matchCount;
        if (textView == null) {
            C2668g.b("matchCount");
        }
        return textView;
    }

    public final void setMatchCount$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.matchCount = textView;
    }

    @NotNull
    public final C9387c getPresenter$Tinder_release() {
        C9387c c9387c = this.f38123a;
        if (c9387c == null) {
            C2668g.b("presenter");
        }
        return c9387c;
    }

    public final void setPresenter$Tinder_release(@NotNull C9387c c9387c) {
        C2668g.b(c9387c, "<set-?>");
        this.f38123a = c9387c;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9387c c9387c = this.f38123a;
        if (c9387c == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c9387c);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void showPreview(@NotNull FastMatchPreviewViewModel fastMatchPreviewViewModel) {
        C2668g.b(fastMatchPreviewViewModel, "viewModel");
        switch (C9417a.f31557a[fastMatchPreviewViewModel.m39383c().ordinal()]) {
            case 1:
                fastMatchPreviewViewModel = this.matchCount;
                if (fastMatchPreviewViewModel == null) {
                    C2668g.b("matchCount");
                }
                fastMatchPreviewViewModel.setText(R.string.likes);
                break;
            case 2:
                fastMatchPreviewViewModel = this.matchCount;
                if (fastMatchPreviewViewModel == null) {
                    C2668g.b("matchCount");
                }
                fastMatchPreviewViewModel.setText(R.string.likes);
                break;
            case 3:
                if (fastMatchPreviewViewModel.m39380a() > 0) {
                    String format = NumberFormat.getInstance().format(Integer.valueOf(fastMatchPreviewViewModel.m39380a()));
                    if (fastMatchPreviewViewModel.m39382b() != null) {
                        fastMatchPreviewViewModel = new StringBuilder();
                        fastMatchPreviewViewModel.append("");
                        fastMatchPreviewViewModel.append(format);
                        fastMatchPreviewViewModel.append('+');
                        format = fastMatchPreviewViewModel.toString();
                    }
                    fastMatchPreviewViewModel = this.matchCount;
                    if (fastMatchPreviewViewModel == null) {
                        C2668g.b("matchCount");
                    }
                    fastMatchPreviewViewModel.setText(getResources().getString(R.string.number_of_likes, new Object[]{format}));
                    break;
                }
                fastMatchPreviewViewModel = this.matchCount;
                if (fastMatchPreviewViewModel == null) {
                    C2668g.b("matchCount");
                }
                fastMatchPreviewViewModel.setText(getResources().getString(R.string.get_likes));
                return;
            default:
                break;
        }
    }

    public void navigateToCardGrid(@NotNull Source source) {
        C2668g.b(source, "source");
        C9407a c9407a = FastMatchRecsActivity.f45362d;
        Context context = getContext();
        C2668g.a(context, "context");
        getContext().startActivity(c9407a.m39355a(context, source));
    }

    public void showPaywall() {
        C10076o.m41167a((PaywallTypeSource) GoldPaywallSource.FASTMATCH_MATCHLIST_PREVIEW).m41175a(getContext());
    }

    @OnClick({2131362991})
    public final void onFastMatchPreviewClick() {
        C9387c c9387c = this.f38123a;
        if (c9387c == null) {
            C2668g.b("presenter");
        }
        c9387c.m39303c();
    }
}
