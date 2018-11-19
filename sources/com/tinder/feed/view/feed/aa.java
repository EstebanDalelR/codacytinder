package com.tinder.feed.view.feed;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tinder.R;
import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.view.footer.FeedFooterView;
import com.tinder.feed.view.info.FeedInfoView;
import com.tinder.feed.view.media.C9521l;
import com.tinder.feed.view.message.FeedCommentView;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C13288q;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0003H\u0016J\u0010\u0010:\u001a\u0002082\u0006\u00109\u001a\u00020\u0003H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198@X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8@X\u0002¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020(X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/tinder/feed/view/feed/SpotifyNewTopArtistFeedView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/feed/view/feed/BindableFeedItemView;", "Lcom/tinder/feed/view/model/ProfileSpotifyArtistFeedViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "constraintHelper", "Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;", "getConstraintHelper", "()Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;", "constraintHelper$delegate", "Lkotlin/Lazy;", "feedCommentContainer", "Lcom/tinder/feed/view/message/FeedCommentView;", "getFeedCommentContainer", "()Lcom/tinder/feed/view/message/FeedCommentView;", "feedCommentContainer$delegate", "feedComposerProvider", "Lcom/tinder/feed/view/provider/FeedComposerProvider;", "getFeedComposerProvider$Tinder_release", "()Lcom/tinder/feed/view/provider/FeedComposerProvider;", "setFeedComposerProvider$Tinder_release", "(Lcom/tinder/feed/view/provider/FeedComposerProvider;)V", "feedFooterContainer", "Lcom/tinder/feed/view/footer/FeedFooterView;", "getFeedFooterContainer$Tinder_release", "()Lcom/tinder/feed/view/footer/FeedFooterView;", "feedFooterContainer$delegate", "feedInfoContainer", "Lcom/tinder/feed/view/info/FeedInfoView;", "getFeedInfoContainer$Tinder_release", "()Lcom/tinder/feed/view/info/FeedInfoView;", "feedInfoContainer$delegate", "feedMediaContainer", "Landroid/view/ViewGroup;", "getFeedMediaContainer", "()Landroid/view/ViewGroup;", "feedMediaContainer$delegate", "feedMediaView", "Lcom/tinder/feed/view/media/FeedSpotifyTopArtistMediaView;", "getFeedMediaView$Tinder_release", "()Lcom/tinder/feed/view/media/FeedSpotifyTopArtistMediaView;", "overflowListenerFactory", "Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;", "getOverflowListenerFactory$Tinder_release", "()Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;", "setOverflowListenerFactory$Tinder_release", "(Lcom/tinder/feed/view/factory/FeedOverflowListenerFactory;)V", "presenter", "Lcom/tinder/feed/presenter/FeedItemPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/feed/presenter/FeedItemPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/feed/presenter/FeedItemPresenter;)V", "bind", "", "feedItem", "bindComments", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class aa extends ConstraintLayout implements BindableFeedItemView<C13288q> {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38269a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(aa.class), "feedInfoContainer", "getFeedInfoContainer$Tinder_release()Lcom/tinder/feed/view/info/FeedInfoView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(aa.class), "feedFooterContainer", "getFeedFooterContainer$Tinder_release()Lcom/tinder/feed/view/footer/FeedFooterView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(aa.class), "feedMediaContainer", "getFeedMediaContainer()Landroid/view/ViewGroup;")), C15825i.a(new PropertyReference1Impl(C15825i.a(aa.class), "feedCommentContainer", "getFeedCommentContainer()Lcom/tinder/feed/view/message/FeedCommentView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(aa.class), "constraintHelper", "getConstraintHelper()Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9467d f38270b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C9486b f38271c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C9542a f38272d;
    @NotNull
    /* renamed from: e */
    private final Lazy f38273e = C18451c.a(LazyThreadSafetyMode.NONE, new SpotifyNewTopArtistFeedView$$special$$inlined$bindView$1(this, R.id.feedInfoContainer));
    @NotNull
    /* renamed from: f */
    private final Lazy f38274f = C18451c.a(LazyThreadSafetyMode.NONE, new SpotifyNewTopArtistFeedView$$special$$inlined$bindView$2(this, R.id.feedFooterContainer));
    @NotNull
    /* renamed from: g */
    private final C9521l f38275g;
    /* renamed from: h */
    private final Lazy f38276h;
    /* renamed from: i */
    private final Lazy f38277i;
    /* renamed from: j */
    private final Lazy f38278j;

    private final C9495g getConstraintHelper() {
        Lazy lazy = this.f38278j;
        KProperty kProperty = f38269a[4];
        return (C9495g) lazy.getValue();
    }

    private final FeedCommentView getFeedCommentContainer() {
        Lazy lazy = this.f38277i;
        KProperty kProperty = f38269a[3];
        return (FeedCommentView) lazy.getValue();
    }

    private final ViewGroup getFeedMediaContainer() {
        Lazy lazy = this.f38276h;
        KProperty kProperty = f38269a[2];
        return (ViewGroup) lazy.getValue();
    }

    @NotNull
    public final FeedFooterView getFeedFooterContainer$Tinder_release() {
        Lazy lazy = this.f38274f;
        KProperty kProperty = f38269a[1];
        return (FeedFooterView) lazy.getValue();
    }

    @NotNull
    public final FeedInfoView getFeedInfoContainer$Tinder_release() {
        Lazy lazy = this.f38273e;
        KProperty kProperty = f38269a[0];
        return (FeedInfoView) lazy.getValue();
    }

    public /* synthetic */ void bind(FeedItem feedItem) {
        m47569a((C13288q) feedItem);
    }

    public /* synthetic */ void bindComments(FeedItem feedItem) {
        m47570b((C13288q) feedItem);
    }

    public aa(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        this.f38275g = new C9521l(context);
        this.f38276h = C18451c.a(LazyThreadSafetyMode.NONE, new SpotifyNewTopArtistFeedView$$special$$inlined$bindView$3(this, R.id.feedMediaContainer));
        this.f38277i = C18451c.a(LazyThreadSafetyMode.NONE, new SpotifyNewTopArtistFeedView$$special$$inlined$bindView$4(this, R.id.feedCommentContainer));
        this.f38278j = C18451c.a(new SpotifyNewTopArtistFeedView$constraintHelper$2(this));
        if (!isInEditMode()) {
            Context a = C14398a.a(context);
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) a).provideFeedViewComponent().inject(this);
        }
        ConstraintLayout.inflate(context, R.layout.feed_item_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        getFeedMediaContainer().addView(this.f38275g);
        setClipChildren(null);
    }

    @NotNull
    public final C9521l getFeedMediaView$Tinder_release() {
        return this.f38275g;
    }

    @NotNull
    public final C9467d getPresenter$Tinder_release() {
        C9467d c9467d = this.f38270b;
        if (c9467d == null) {
            C2668g.b("presenter");
        }
        return c9467d;
    }

    public final void setPresenter$Tinder_release(@NotNull C9467d c9467d) {
        C2668g.b(c9467d, "<set-?>");
        this.f38270b = c9467d;
    }

    @NotNull
    public final C9486b getOverflowListenerFactory$Tinder_release() {
        C9486b c9486b = this.f38271c;
        if (c9486b == null) {
            C2668g.b("overflowListenerFactory");
        }
        return c9486b;
    }

    public final void setOverflowListenerFactory$Tinder_release(@NotNull C9486b c9486b) {
        C2668g.b(c9486b, "<set-?>");
        this.f38271c = c9486b;
    }

    @NotNull
    public final C9542a getFeedComposerProvider$Tinder_release() {
        C9542a c9542a = this.f38272d;
        if (c9542a == null) {
            C2668g.b("feedComposerProvider");
        }
        return c9542a;
    }

    public final void setFeedComposerProvider$Tinder_release(@NotNull C9542a c9542a) {
        C2668g.b(c9542a, "<set-?>");
        this.f38272d = c9542a;
    }

    /* renamed from: a */
    public void m47569a(@NotNull C13288q c13288q) {
        C2668g.b(c13288q, "feedItem");
        C9486b c9486b = this.f38271c;
        if (c9486b == null) {
            C2668g.b("overflowListenerFactory");
        }
        C9467d c9467d = this.f38270b;
        if (c9467d == null) {
            C2668g.b("presenter");
        }
        C9494f.m39709a(this, c13288q, c9486b.m39665a(c9467d, c13288q), (Function0) new SpotifyNewTopArtistFeedView$bind$1(this, c13288q));
        C9492d.m39686a(this, c13288q);
        C9493e.m39698a(this, c13288q);
        m47570b(c13288q);
    }

    /* renamed from: b */
    public void m47570b(@NotNull C13288q c13288q) {
        C2668g.b(c13288q, "feedItem");
        getFeedCommentContainer().m47666a((ActivityFeedViewModel) c13288q);
        getConstraintHelper().m39718a(c13288q.mo11144f() != null ? true : null);
    }
}
