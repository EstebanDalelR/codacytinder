package com.tinder.feed.view.feed;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.common.p191d.C8529a;
import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.footer.FeedFooterDescriptionView;
import com.tinder.feed.view.footer.FeedFooterView;
import com.tinder.feed.view.info.FeedInfoView;
import com.tinder.feed.view.media.C9517i;
import com.tinder.feed.view.message.FeedCommentView;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C13286o;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C9542a;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0003H\u0016J\u0010\u0010A\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0003H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8@X\u0002¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020'8@X\u0002¢\u0006\f\n\u0004\b*\u0010\f\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b,\u0010$R\u0014\u0010.\u001a\u00020/X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/tinder/feed/view/feed/ProfileChangeSchoolFeedView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/feed/view/feed/BindableFeedItemView;", "Lcom/tinder/feed/view/model/ProfileChangeSchoolFeedViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "constraintHelper", "Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;", "getConstraintHelper", "()Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;", "constraintHelper$delegate", "Lkotlin/Lazy;", "feedCommentContainer", "Lcom/tinder/feed/view/message/FeedCommentView;", "getFeedCommentContainer", "()Lcom/tinder/feed/view/message/FeedCommentView;", "feedCommentContainer$delegate", "feedComposerProvider", "Lcom/tinder/feed/view/provider/FeedComposerProvider;", "getFeedComposerProvider$Tinder_release", "()Lcom/tinder/feed/view/provider/FeedComposerProvider;", "setFeedComposerProvider$Tinder_release", "(Lcom/tinder/feed/view/provider/FeedComposerProvider;)V", "feedDescriptionView", "Lcom/tinder/feed/view/footer/FeedFooterDescriptionView;", "getFeedDescriptionView$Tinder_release", "()Lcom/tinder/feed/view/footer/FeedFooterDescriptionView;", "feedFooterContainer", "Lcom/tinder/feed/view/footer/FeedFooterView;", "getFeedFooterContainer$Tinder_release", "()Lcom/tinder/feed/view/footer/FeedFooterView;", "feedFooterContainer$delegate", "feedFooterDescriptionContainer", "Landroid/view/ViewGroup;", "getFeedFooterDescriptionContainer", "()Landroid/view/ViewGroup;", "feedFooterDescriptionContainer$delegate", "feedInfoContainer", "Lcom/tinder/feed/view/info/FeedInfoView;", "getFeedInfoContainer$Tinder_release", "()Lcom/tinder/feed/view/info/FeedInfoView;", "feedInfoContainer$delegate", "feedMediaContainer", "getFeedMediaContainer", "feedMediaContainer$delegate", "feedMediaView", "Lcom/tinder/feed/view/media/FeedProfileChangeSchoolMediaView;", "getFeedMediaView$Tinder_release", "()Lcom/tinder/feed/view/media/FeedProfileChangeSchoolMediaView;", "overflowListenerFactory", "Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;", "getOverflowListenerFactory$Tinder_release", "()Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;", "setOverflowListenerFactory$Tinder_release", "(Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;)V", "presenter", "Lcom/tinder/feed/presenter/FeedItemPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/feed/presenter/FeedItemPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/feed/presenter/FeedItemPresenter;)V", "bind", "", "feedItem", "bindComments", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.feed.u */
public final class C11746u extends ConstraintLayout implements BindableFeedItemView<C13286o> {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38369a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C11746u.class), "feedInfoContainer", "getFeedInfoContainer$Tinder_release()Lcom/tinder/feed/view/info/FeedInfoView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11746u.class), "feedFooterContainer", "getFeedFooterContainer$Tinder_release()Lcom/tinder/feed/view/footer/FeedFooterView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11746u.class), "feedMediaContainer", "getFeedMediaContainer()Landroid/view/ViewGroup;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11746u.class), "feedCommentContainer", "getFeedCommentContainer()Lcom/tinder/feed/view/message/FeedCommentView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11746u.class), "constraintHelper", "getConstraintHelper()Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11746u.class), "feedFooterDescriptionContainer", "getFeedFooterDescriptionContainer()Landroid/view/ViewGroup;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9467d f38370b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C9486b f38371c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C9542a f38372d;
    @NotNull
    /* renamed from: e */
    private final Lazy f38373e = C18451c.a(LazyThreadSafetyMode.NONE, new ProfileChangeSchoolFeedView$$special$$inlined$bindView$1(this, R.id.feedInfoContainer));
    @NotNull
    /* renamed from: f */
    private final Lazy f38374f = C18451c.a(LazyThreadSafetyMode.NONE, new ProfileChangeSchoolFeedView$$special$$inlined$bindView$2(this, R.id.feedFooterContainer));
    @NotNull
    /* renamed from: g */
    private final C9517i f38375g;
    /* renamed from: h */
    private final Lazy f38376h;
    /* renamed from: i */
    private final Lazy f38377i;
    /* renamed from: j */
    private final Lazy f38378j;
    /* renamed from: k */
    private final Lazy f38379k;
    @NotNull
    /* renamed from: l */
    private final FeedFooterDescriptionView f38380l;

    private final C9495g getConstraintHelper() {
        Lazy lazy = this.f38378j;
        KProperty kProperty = f38369a[4];
        return (C9495g) lazy.getValue();
    }

    private final FeedCommentView getFeedCommentContainer() {
        Lazy lazy = this.f38377i;
        KProperty kProperty = f38369a[3];
        return (FeedCommentView) lazy.getValue();
    }

    private final ViewGroup getFeedFooterDescriptionContainer() {
        Lazy lazy = this.f38379k;
        KProperty kProperty = f38369a[5];
        return (ViewGroup) lazy.getValue();
    }

    private final ViewGroup getFeedMediaContainer() {
        Lazy lazy = this.f38376h;
        KProperty kProperty = f38369a[2];
        return (ViewGroup) lazy.getValue();
    }

    @NotNull
    public final FeedFooterView getFeedFooterContainer$Tinder_release() {
        Lazy lazy = this.f38374f;
        KProperty kProperty = f38369a[1];
        return (FeedFooterView) lazy.getValue();
    }

    @NotNull
    public final FeedInfoView getFeedInfoContainer$Tinder_release() {
        Lazy lazy = this.f38373e;
        KProperty kProperty = f38369a[0];
        return (FeedInfoView) lazy.getValue();
    }

    public /* synthetic */ void bind(FeedItem feedItem) {
        m47611a((C13286o) feedItem);
    }

    public /* synthetic */ void bindComments(FeedItem feedItem) {
        m47612b((C13286o) feedItem);
    }

    public C11746u(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        this.f38375g = new C9517i(context);
        this.f38376h = C18451c.a(LazyThreadSafetyMode.NONE, new ProfileChangeSchoolFeedView$$special$$inlined$bindView$3(this, R.id.feedMediaContainer));
        this.f38377i = C18451c.a(LazyThreadSafetyMode.NONE, new ProfileChangeSchoolFeedView$$special$$inlined$bindView$4(this, R.id.feedCommentContainer));
        this.f38378j = C18451c.a(new ProfileChangeSchoolFeedView$constraintHelper$2(this));
        this.f38379k = C18451c.a(LazyThreadSafetyMode.NONE, new ProfileChangeSchoolFeedView$$special$$inlined$bindView$5(this, R.id.feedFooterDescriptionContainer));
        this.f38380l = new FeedFooterDescriptionView(context, null, 2, null);
        if (!isInEditMode()) {
            Context a = C14398a.a(context);
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) a).provideFeedViewComponent().inject(this);
        }
        ConstraintLayout.inflate(context, R.layout.feed_item_view, this);
        setLayoutParams(C8529a.f30276a.m36494b());
        getFeedMediaContainer().addView(this.f38375g);
        getFeedFooterDescriptionContainer().addView(this.f38380l);
        setClipChildren(null);
    }

    @NotNull
    public final C9517i getFeedMediaView$Tinder_release() {
        return this.f38375g;
    }

    @NotNull
    public final FeedFooterDescriptionView getFeedDescriptionView$Tinder_release() {
        return this.f38380l;
    }

    @NotNull
    public final C9467d getPresenter$Tinder_release() {
        C9467d c9467d = this.f38370b;
        if (c9467d == null) {
            C2668g.b("presenter");
        }
        return c9467d;
    }

    public final void setPresenter$Tinder_release(@NotNull C9467d c9467d) {
        C2668g.b(c9467d, "<set-?>");
        this.f38370b = c9467d;
    }

    @NotNull
    public final C9486b getOverflowListenerFactory$Tinder_release() {
        C9486b c9486b = this.f38371c;
        if (c9486b == null) {
            C2668g.b("overflowListenerFactory");
        }
        return c9486b;
    }

    public final void setOverflowListenerFactory$Tinder_release(@NotNull C9486b c9486b) {
        C2668g.b(c9486b, "<set-?>");
        this.f38371c = c9486b;
    }

    @NotNull
    public final C9542a getFeedComposerProvider$Tinder_release() {
        C9542a c9542a = this.f38372d;
        if (c9542a == null) {
            C2668g.b("feedComposerProvider");
        }
        return c9542a;
    }

    public final void setFeedComposerProvider$Tinder_release(@NotNull C9542a c9542a) {
        C2668g.b(c9542a, "<set-?>");
        this.f38372d = c9542a;
    }

    /* renamed from: a */
    public void m47611a(@NotNull C13286o c13286o) {
        C2668g.b(c13286o, "feedItem");
        C9486b c9486b = this.f38371c;
        if (c9486b == null) {
            C2668g.b("overflowListenerFactory");
        }
        C9467d c9467d = this.f38370b;
        if (c9467d == null) {
            C2668g.b("presenter");
        }
        C9494f.m39715a(this, c13286o, c9486b.m39665a(c9467d, c13286o), (Function0) new ProfileChangeSchoolFeedView$bind$1(this, c13286o));
        C9492d.m39692a(this, c13286o);
        m47612b(c13286o);
        C9493e.m39704a(this, c13286o);
    }

    /* renamed from: b */
    public void m47612b(@NotNull C13286o c13286o) {
        C2668g.b(c13286o, "feedItem");
        getFeedCommentContainer().m47666a((ActivityFeedViewModel) c13286o);
        getConstraintHelper().m39718a(c13286o.mo11144f() != null ? true : null);
    }
}
