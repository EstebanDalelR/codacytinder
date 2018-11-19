package com.tinder.toppicks.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.C3018c;
import com.bumptech.glide.load.Transformation;
import com.tinder.api.ManagerWebServices;
import com.tinder.app.dagger.component.TopPicksComponent;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Tag;
import com.tinder.domain.recs.model.TopPickUserRec;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.view.superlike.GridSuperLikeButtonInjector;
import com.tinder.recs.view.superlike.GridSuperLikeButtonView;
import com.tinder.toppicks.TopPicksComponentProvider;
import com.tinder.toppicks.presenter.C15295q;
import com.tinder.toppicks.target.TopPicksUserRecCardTarget;
import com.tinder.utils.C15365p;
import com.tinder.views.grid.C15459f.C15458a;
import com.tinder.views.grid.GridUserRecCardView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C15810e;
import kotlin.C15813i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010#\u001a\u00020\u0019H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0019H\u0002J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0019H\u0014J\b\u0010/\u001a\u00020\u0019H\u0014J\b\u00100\u001a\u00020\u0019H\u0014R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148TX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u000e¢\u0006\u0002\n\u0000R#\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksUserRecCardView;", "Lcom/tinder/views/grid/GridUserRecCardView;", "Lcom/tinder/toppicks/target/TopPicksUserRecCardTarget;", "Lcom/tinder/recs/view/superlike/GridSuperLikeButtonInjector;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardPresenter", "Lcom/tinder/toppicks/presenter/TopPicksUserRecCardPresenter;", "getCardPresenter", "()Lcom/tinder/toppicks/presenter/TopPicksUserRecCardPresenter;", "setCardPresenter", "(Lcom/tinder/toppicks/presenter/TopPicksUserRecCardPresenter;)V", "infoView", "Lcom/tinder/toppicks/view/TopPicksUserRecInfoView;", "rec", "Lcom/tinder/domain/recs/model/Rec;", "shouldShowBottomGradient", "", "getShouldShowBottomGradient", "()Z", "superLikeOnClickListener", "Lkotlin/Function0;", "", "tagView", "Lcom/tinder/toppicks/view/TopPicksTagView;", "kotlin.jvm.PlatformType", "getTagView", "()Lcom/tinder/toppicks/view/TopPicksTagView;", "tagView$delegate", "Lkotlin/Lazy;", "topPicksComponent", "Lcom/tinder/app/dagger/component/TopPicksComponent;", "animateSuperLikeStamp", "bindInfo", "userRecCard", "Lcom/tinder/recs/card/UserRecCard;", "handleSuperLikeClick", "inject", "view", "Lcom/tinder/recs/view/superlike/GridSuperLikeButtonView;", "loadImage", "photo", "Lcom/tinder/views/grid/UserRecPhotoAlbum$Photo;", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksUserRecCardView extends GridUserRecCardView implements GridSuperLikeButtonInjector, TopPicksUserRecCardTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f58707a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TopPicksUserRecCardView.class), "tagView", "getTagView()Lcom/tinder/toppicks/view/TopPicksTagView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C15295q f58708b;
    /* renamed from: f */
    private TopPicksUserRecInfoView f58709f;
    /* renamed from: g */
    private Rec f58710g;
    /* renamed from: h */
    private Function0<C15813i> f58711h = ((Function0) new TopPicksUserRecCardView$superLikeOnClickListener$1(this));
    /* renamed from: i */
    private TopPicksComponent f58712i;
    /* renamed from: j */
    private final Lazy f58713j;
    /* renamed from: k */
    private HashMap f58714k;

    private final TopPicksTagView getTagView() {
        Lazy lazy = this.f58713j;
        KProperty kProperty = f58707a[0];
        return (TopPicksTagView) lazy.getValue();
    }

    public void _$_clearFindViewByIdCache() {
        if (this.f58714k != null) {
            this.f58714k.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f58714k == null) {
            this.f58714k = new HashMap();
        }
        View view = (View) this.f58714k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f58714k.put(Integer.valueOf(i), view);
        return view;
    }

    public TopPicksUserRecCardView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        context = C15365p.m57675b(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.toppicks.TopPicksComponentProvider");
        }
        this.f58712i = ((TopPicksComponentProvider) context).provideTopPicksComponent();
        this.f58713j = C15810e.m59833a((Function0) new TopPicksUserRecCardView$tagView$2(this));
        this.f58712i.inject(this);
    }

    protected boolean getShouldShowBottomGradient() {
        UserRec userRec = getUserRecCard().userRec();
        if (userRec != null) {
            return ((TopPickUserRec) userRec).getTags().isEmpty();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.TopPickUserRec");
    }

    @NotNull
    public final C15295q getCardPresenter() {
        C15295q c15295q = this.f58708b;
        if (c15295q == null) {
            C2668g.b("cardPresenter");
        }
        return c15295q;
    }

    public final void setCardPresenter(@NotNull C15295q c15295q) {
        C2668g.b(c15295q, "<set-?>");
        this.f58708b = c15295q;
    }

    public void inject(@NotNull GridSuperLikeButtonView gridSuperLikeButtonView) {
        C2668g.b(gridSuperLikeButtonView, "view");
        TopPicksComponent topPicksComponent = this.f58712i;
        if (topPicksComponent == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.view.superlike.GridSuperLikeButtonInjector");
        }
        topPicksComponent.inject(gridSuperLikeButtonView);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C15295q c15295q = this.f58708b;
        if (c15295q == null) {
            C2668g.b("cardPresenter");
        }
        Deadshot.take(this, c15295q);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        C2668g.a(context, "context");
        this.f58709f = new TopPicksUserRecInfoView(context, null, 2, null);
        ViewGroup userInfoViewContainer$Tinder_release = getUserInfoViewContainer$Tinder_release();
        TopPicksUserRecInfoView topPicksUserRecInfoView = this.f58709f;
        if (topPicksUserRecInfoView == null) {
            C2668g.b("infoView");
        }
        userInfoViewContainer$Tinder_release.addView(topPicksUserRecInfoView);
        TopPicksUserRecInfoView topPicksUserRecInfoView2 = this.f58709f;
        if (topPicksUserRecInfoView2 == null) {
            C2668g.b("infoView");
        }
        topPicksUserRecInfoView2.m57477a((View) this);
        topPicksUserRecInfoView2 = this.f58709f;
        if (topPicksUserRecInfoView2 == null) {
            C2668g.b("infoView");
        }
        topPicksUserRecInfoView2.setSuperLikeOnClickListener(this.f58711h);
    }

    /* renamed from: a */
    public void mo13980a(@NotNull UserRecCard userRecCard) {
        C2668g.b(userRecCard, "userRecCard");
        UserRec userRec = userRecCard.userRec();
        if (userRec == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.TopPickUserRec");
        }
        TopPickUserRec topPickUserRec = (TopPickUserRec) userRec;
        TopPicksUserRecInfoView topPicksUserRecInfoView;
        if (topPickUserRec.getTags().isEmpty()) {
            topPicksUserRecInfoView = this.f58709f;
            if (topPicksUserRecInfoView == null) {
                C2668g.b("infoView");
            }
            topPicksUserRecInfoView.m57478a(userRecCard);
            getTagView().m57468a();
            topPicksUserRecInfoView = this.f58709f;
            if (topPicksUserRecInfoView == null) {
                C2668g.b("infoView");
            }
            topPicksUserRecInfoView.m57476a();
        } else {
            getTagView().m57469a(((Tag) C19299w.m68829f(topPickUserRec.getTags())).getName());
            topPicksUserRecInfoView = this.f58709f;
            if (topPicksUserRecInfoView == null) {
                C2668g.b("infoView");
            }
            topPicksUserRecInfoView.m57479b();
        }
        UserRec userRec2 = userRecCard.userRec();
        C15295q c15295q = this.f58708b;
        if (c15295q == null) {
            C2668g.b("cardPresenter");
        }
        C2668g.a(userRec2, "this");
        c15295q.m57427a(userRec2);
        this.f58710g = userRec2;
    }

    /* renamed from: a */
    public void mo13981a(@NotNull C15458a c15458a) {
        C2668g.b(c15458a, ManagerWebServices.PARAM_PHOTO);
        UserRec userRec = getUserRecCard().userRec();
        if (userRec == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.TopPickUserRec");
        }
        TopPickUserRec topPickUserRec = (TopPickUserRec) userRec;
        if (topPickUserRec.getTags().isEmpty()) {
            super.mo13981a(c15458a);
            return;
        }
        if ((topPickUserRec.getTags().isEmpty() ^ 1) != 0) {
            C3018c a = m66292a(c15458a.m57952a());
            Transformation[] transformationArr = new Transformation[1];
            Context context = getContext();
            C2668g.a(context, "context");
            transformationArr[0] = new C18244a(context);
            a = a.a(transformationArr).d();
            c15458a = m66297b((String) c15458a.m57953b());
            Transformation[] transformationArr2 = new Transformation[1];
            Context context2 = getContext();
            C2668g.a(context2, "context");
            transformationArr2[0] = new C18244a(context2);
            a.a(c15458a.a(transformationArr2).d()).a(getImageView$Tinder_release());
        }
    }

    public void animateSuperLikeStamp() {
        View stampSuperLike = getStampSuperLike();
        if (stampSuperLike != null) {
            disableStampsDecoration();
            stampSuperLike.animate().setDuration(100).alpha(1.0f);
        }
    }

    /* renamed from: b */
    private final void m67496b() {
        Rec rec = this.f58710g;
        if (rec != null) {
            C15295q c15295q = this.f58708b;
            if (c15295q == null) {
                C2668g.b("cardPresenter");
            }
            c15295q.m57426a(rec);
        }
    }
}
