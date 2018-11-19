package com.tinder.places.recs.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.deadshot.Deadshot;
import com.tinder.places.recs.presenter.C10279f;
import com.tinder.places.recs.target.PlacesUserRecCardTarget;
import com.tinder.places.viewmodel.PlaceColor;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.view.UserRecCardHeadLineView;
import com.tinder.recs.view.UserRecCardHeadLineView.HeadLineViewModel;
import com.tinder.views.grid.GridInjector;
import com.tinder.views.grid.GridUserRecCardView;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u001aH\u0014J\b\u0010+\u001a\u00020\u001aH\u0014J\b\u0010,\u001a\u00020\u001aH\u0014J\u000e\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u00060"}, d2 = {"Lcom/tinder/places/recs/view/PlacesUserRecCardView;", "Lcom/tinder/views/grid/GridUserRecCardView;", "Lcom/tinder/places/recs/target/PlacesUserRecCardTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "headlineView", "Lcom/tinder/recs/view/UserRecCardHeadLineView;", "presenter", "Lcom/tinder/places/recs/presenter/PlacesUserRecCardPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/places/recs/presenter/PlacesUserRecCardPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/places/recs/presenter/PlacesUserRecCardPresenter;)V", "teaserView1", "Landroid/widget/TextView;", "teaserView2", "teaserViews", "", "getTeaserViews", "()Ljava/util/List;", "teaserViews$delegate", "Lkotlin/Lazy;", "bindHeadLineViews", "", "userRecCard", "Lcom/tinder/recs/card/UserRecCard;", "bindInfo", "bindTeaser", "index", "", "teaser", "", "findGridInjector", "Lcom/tinder/views/grid/GridInjector;", "view", "Landroid/view/View;", "injectGrid", "parentViewGroup", "Landroid/view/ViewGroup;", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "setColor", "color", "Lcom/tinder/places/viewmodel/PlaceColor;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesUserRecCardView extends GridUserRecCardView implements PlacesUserRecCardTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f45089a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PlacesUserRecCardView.class), "teaserViews", "getTeaserViews()Ljava/util/List;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C10279f f45090b;
    /* renamed from: f */
    private TextView f45091f;
    /* renamed from: g */
    private TextView f45092g;
    /* renamed from: h */
    private UserRecCardHeadLineView f45093h;
    /* renamed from: i */
    private final Lazy f45094i = C18451c.a(LazyThreadSafetyMode.NONE, (Function0) new PlacesUserRecCardView$teaserViews$2(this));
    /* renamed from: j */
    private HashMap f45095j;

    private final List<TextView> getTeaserViews() {
        Lazy lazy = this.f45094i;
        KProperty kProperty = f45089a[0];
        return (List) lazy.getValue();
    }

    public void _$_clearFindViewByIdCache() {
        if (this.f45095j != null) {
            this.f45095j.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f45095j == null) {
            this.f45095j = new HashMap();
        }
        View view = (View) this.f45095j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45095j.put(Integer.valueOf(i), view);
        return view;
    }

    public final void setColor(@NotNull PlaceColor placeColor) {
        C2668g.b(placeColor, ManagerWebServices.PARAM_BADGE_COLOR);
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ TextView m53995a(PlacesUserRecCardView placesUserRecCardView) {
        placesUserRecCardView = placesUserRecCardView.f45091f;
        if (placesUserRecCardView == null) {
            C2668g.b("teaserView1");
        }
        return placesUserRecCardView;
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ TextView m53997b(PlacesUserRecCardView placesUserRecCardView) {
        placesUserRecCardView = placesUserRecCardView.f45092g;
        if (placesUserRecCardView == null) {
            C2668g.b("teaserView2");
        }
        return placesUserRecCardView;
    }

    public PlacesUserRecCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
    }

    @NotNull
    public final C10279f getPresenter$Tinder_release() {
        C10279f c10279f = this.f45090b;
        if (c10279f == null) {
            C2668g.b("presenter");
        }
        return c10279f;
    }

    public final void setPresenter$Tinder_release(@NotNull C10279f c10279f) {
        C2668g.b(c10279f, "<set-?>");
        this.f45090b = c10279f;
    }

    /* renamed from: a */
    public final void m53998a(@NotNull ViewGroup viewGroup) {
        C2668g.b(viewGroup, "parentViewGroup");
        m53996a((View) viewGroup).inject(this);
    }

    /* renamed from: a */
    private final GridInjector m53996a(View view) {
        GridInjector gridInjector = (GridInjector) (!(view instanceof GridInjector) ? null : view);
        if (gridInjector != null) {
            return gridInjector;
        }
        view = view.getParent();
        if (view != null) {
            return m53996a(view);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.recs_card_places_headline_stub, this, false);
        getUserInfoViewContainer$Tinder_release().addView(inflate);
        View findViewById = inflate.findViewById(R.id.recs_card_user_teaser_1);
        C2668g.a(findViewById, "infoView.findViewById(R.….recs_card_user_teaser_1)");
        this.f45091f = (TextView) findViewById;
        findViewById = inflate.findViewById(R.id.recs_card_user_teaser_2);
        C2668g.a(findViewById, "infoView.findViewById(R.….recs_card_user_teaser_2)");
        this.f45092g = (TextView) findViewById;
        inflate = inflate.findViewById(R.id.recs_card_user_headline);
        C2668g.a(inflate, "infoView.findViewById(R.….recs_card_user_headline)");
        this.f45093h = (UserRecCardHeadLineView) inflate;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10279f c10279f = this.f45090b;
        if (c10279f == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10279f);
    }

    protected void onDetachedFromWindow() {
        Deadshot.drop(this);
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public void m53999a(@NotNull UserRecCard userRecCard) {
        C2668g.b(userRecCard, "userRecCard");
        C10279f c10279f = this.f45090b;
        if (c10279f == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10279f);
        for (TextView visibility : getTeaserViews()) {
            visibility.setVisibility(8);
        }
        c10279f = this.f45090b;
        if (c10279f == null) {
            C2668g.b("presenter");
        }
        c10279f.m41674a(userRecCard);
    }

    public void bindHeadLineViews(@NotNull UserRecCard userRecCard) {
        C2668g.b(userRecCard, "userRecCard");
        boolean showAge = userRecCard.showAge();
        String name = userRecCard.name();
        C2668g.a(name, "userRecCard.name()");
        String age = userRecCard.age();
        C2668g.a(age, "userRecCard.age()");
        HeadLineViewModel headLineViewModel = new HeadLineViewModel(showAge, name, age, userRecCard.isVerified(), userRecCard.userRec().isSuperLike(), userRecCard.userRec().isBoost());
        userRecCard = this.f45093h;
        if (userRecCard == null) {
            C2668g.b("headlineView");
        }
        userRecCard.bind(headLineViewModel);
    }

    public void bindTeaser(int i, @NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEASER);
        TextView textView = (TextView) getTeaserViews().get(i);
        textView.setVisibility(0);
        textView.setText(str);
    }
}
