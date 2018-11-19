package com.tinder.fastmatch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.domain.recs.model.UserRec.Teaser;
import com.tinder.fastmatch.presenter.C9397p;
import com.tinder.profile.p365d.C14398a;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.view.UserRecCardHeadLineView;
import com.tinder.recs.view.UserRecCardHeadLineView.HeadLineViewModel;
import com.tinder.views.grid.GridInjector;
import com.tinder.views.grid.GridUserRecCardView;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0014R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/fastmatch/view/FastMatchUserRecCardView;", "Lcom/tinder/views/grid/GridUserRecCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "headlineView", "Lcom/tinder/recs/view/UserRecCardHeadLineView;", "presenter", "Lcom/tinder/fastmatch/presenter/FastMatchUserRecCardPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/fastmatch/presenter/FastMatchUserRecCardPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/fastmatch/presenter/FastMatchUserRecCardPresenter;)V", "teaserView", "Landroid/widget/TextView;", "bindHeadLineViews", "", "userRecCard", "Lcom/tinder/recs/card/UserRecCard;", "bindInfo", "bindTeasers", "teasers", "", "Lcom/tinder/domain/recs/model/UserRec$Teaser;", "onFinishInflate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchUserRecCardView extends GridUserRecCardView {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9397p f44072a;
    /* renamed from: b */
    private TextView f44073b;
    /* renamed from: f */
    private UserRecCardHeadLineView f44074f;
    /* renamed from: g */
    private HashMap f44075g;

    public void _$_clearFindViewByIdCache() {
        if (this.f44075g != null) {
            this.f44075g.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f44075g == null) {
            this.f44075g = new HashMap();
        }
        View view = (View) this.f44075g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f44075g.put(Integer.valueOf(i), view);
        return view;
    }

    public FastMatchUserRecCardView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        context = C14398a.a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.views.grid.GridInjector");
        }
        ((GridInjector) context).inject(this);
    }

    @NotNull
    public final C9397p getPresenter$Tinder_release() {
        C9397p c9397p = this.f44072a;
        if (c9397p == null) {
            C2668g.b("presenter");
        }
        return c9397p;
    }

    public final void setPresenter$Tinder_release(@NotNull C9397p c9397p) {
        C2668g.b(c9397p, "<set-?>");
        this.f44072a = c9397p;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.recs_card_fast_match_headline_stub, this, false);
        getUserInfoViewContainer$Tinder_release().addView(inflate);
        View findViewById = inflate.findViewById(R.id.recs_card_user_teaser_1);
        C2668g.a(findViewById, "infoView.findViewById(R.….recs_card_user_teaser_1)");
        this.f44073b = (TextView) findViewById;
        inflate = inflate.findViewById(R.id.recs_card_user_headline);
        C2668g.a(inflate, "infoView.findViewById(R.….recs_card_user_headline)");
        this.f44074f = (UserRecCardHeadLineView) inflate;
    }

    /* renamed from: a */
    public void m53471a(@NotNull UserRecCard userRecCard) {
        C2668g.b(userRecCard, "userRecCard");
        m53470d(userRecCard);
        List teasers = userRecCard.teasers();
        C2668g.a(teasers, "userRecCard.teasers()");
        m53469a(teasers);
        C9397p c9397p = this.f44072a;
        if (c9397p == null) {
            C2668g.b("presenter");
        }
        userRecCard = userRecCard.userRec();
        C2668g.a(userRecCard, "userRecCard.userRec()");
        c9397p.m39321a(userRecCard);
    }

    /* renamed from: d */
    private final void m53470d(UserRecCard userRecCard) {
        boolean showAge = userRecCard.showAge();
        String name = userRecCard.name();
        C2668g.a(name, "userRecCard.name()");
        String age = userRecCard.age();
        C2668g.a(age, "userRecCard.age()");
        HeadLineViewModel headLineViewModel = new HeadLineViewModel(showAge, name, age, userRecCard.isVerified(), userRecCard.userRec().isSuperLike(), userRecCard.userRec().isBoost());
        userRecCard = this.f44074f;
        if (userRecCard == null) {
            C2668g.b("headlineView");
        }
        userRecCard.bind(headLineViewModel);
    }

    /* renamed from: a */
    private final void m53469a(List<Teaser> list) {
        list = list.isEmpty() ? null : (Teaser) list.get(0);
        if (list == null) {
            list = this.f44073b;
            if (list == null) {
                C2668g.b("teaserView");
            }
            list.setVisibility(8);
            return;
        }
        TextView textView = this.f44073b;
        if (textView == null) {
            C2668g.b("teaserView");
        }
        textView.setText(list.getValue());
        list = this.f44073b;
        if (list == null) {
            C2668g.b("teaserView");
        }
        list.setVisibility(0);
    }
}
