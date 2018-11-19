package com.tinder.feed.view.info;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.common.badge.view.BadgeAttributionIcon;
import com.tinder.feed.view.FeedOverflowButton;
import com.tinder.feed.view.FeedOverflowButton.C9475a;
import com.tinder.feed.view.FeedOverflowListener;
import com.tinder.feed.view.action.C11723c;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J(\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020&0,j\u0002`-R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8@X\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148@X\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198@X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u00148@X\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001e\u0010\u0016R\u001b\u0010 \u001a\u00020!8@X\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b\"\u0010#¨\u0006."}, d2 = {"Lcom/tinder/feed/view/info/FeedInfoView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionHandler", "Lcom/tinder/feed/view/action/FeedInfoViewActionHandler;", "getActionHandler$Tinder_release", "()Lcom/tinder/feed/view/action/FeedInfoViewActionHandler;", "setActionHandler$Tinder_release", "(Lcom/tinder/feed/view/action/FeedInfoViewActionHandler;)V", "infoAvatarView", "Lcom/tinder/feed/view/info/FeedAvatarImageView;", "getInfoAvatarView$Tinder_release", "()Lcom/tinder/feed/view/info/FeedAvatarImageView;", "infoAvatarView$delegate", "Lkotlin/Lazy;", "infoDetailView", "Landroid/widget/TextView;", "getInfoDetailView$Tinder_release", "()Landroid/widget/TextView;", "infoDetailView$delegate", "infoMatchAttributionIcon", "Lcom/tinder/common/badge/view/BadgeAttributionIcon;", "getInfoMatchAttributionIcon$Tinder_release", "()Lcom/tinder/common/badge/view/BadgeAttributionIcon;", "infoMatchAttributionIcon$delegate", "infoMatchNameView", "getInfoMatchNameView$Tinder_release", "infoMatchNameView$delegate", "infoOverflow", "Lcom/tinder/feed/view/FeedOverflowButton;", "getInfoOverflow$Tinder_release", "()Lcom/tinder/feed/view/FeedOverflowButton;", "infoOverflow$delegate", "bind", "", "feedInfo", "Lcom/tinder/feed/view/info/FeedInfoModel;", "feedOverflowListener", "Lcom/tinder/feed/view/FeedOverflowListener;", "feedInfoOpenProfileListener", "Lkotlin/Function0;", "Lcom/tinder/feed/view/action/FeedInfoOpenProfileListener;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedInfoView extends ConstraintLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38417a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(FeedInfoView.class), "infoAvatarView", "getInfoAvatarView$Tinder_release()Lcom/tinder/feed/view/info/FeedAvatarImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedInfoView.class), "infoMatchNameView", "getInfoMatchNameView$Tinder_release()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedInfoView.class), "infoDetailView", "getInfoDetailView$Tinder_release()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedInfoView.class), "infoOverflow", "getInfoOverflow$Tinder_release()Lcom/tinder/feed/view/FeedOverflowButton;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedInfoView.class), "infoMatchAttributionIcon", "getInfoMatchAttributionIcon$Tinder_release()Lcom/tinder/common/badge/view/BadgeAttributionIcon;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C11723c f38418b;
    @NotNull
    /* renamed from: c */
    private final Lazy f38419c;
    @NotNull
    /* renamed from: d */
    private final Lazy f38420d;
    @NotNull
    /* renamed from: e */
    private final Lazy f38421e;
    @NotNull
    /* renamed from: f */
    private final Lazy f38422f;
    @NotNull
    /* renamed from: g */
    private final Lazy f38423g;

    @NotNull
    public final FeedAvatarImageView getInfoAvatarView$Tinder_release() {
        Lazy lazy = this.f38419c;
        KProperty kProperty = f38417a[0];
        return (FeedAvatarImageView) lazy.getValue();
    }

    @NotNull
    public final TextView getInfoDetailView$Tinder_release() {
        Lazy lazy = this.f38421e;
        KProperty kProperty = f38417a[2];
        return (TextView) lazy.getValue();
    }

    @NotNull
    public final BadgeAttributionIcon getInfoMatchAttributionIcon$Tinder_release() {
        Lazy lazy = this.f38423g;
        KProperty kProperty = f38417a[4];
        return (BadgeAttributionIcon) lazy.getValue();
    }

    @NotNull
    public final TextView getInfoMatchNameView$Tinder_release() {
        Lazy lazy = this.f38420d;
        KProperty kProperty = f38417a[1];
        return (TextView) lazy.getValue();
    }

    @NotNull
    public final FeedOverflowButton getInfoOverflow$Tinder_release() {
        Lazy lazy = this.f38422f;
        KProperty kProperty = f38417a[3];
        return (FeedOverflowButton) lazy.getValue();
    }

    public /* synthetic */ FeedInfoView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public FeedInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f38419c = C18451c.a(LazyThreadSafetyMode.NONE, new FeedInfoView$$special$$inlined$bindView$1(this, R.id.feedInfoThumbAvatar));
        this.f38420d = C18451c.a(LazyThreadSafetyMode.NONE, new FeedInfoView$$special$$inlined$bindView$2(this, R.id.feedInfoMatchName));
        this.f38421e = C18451c.a(LazyThreadSafetyMode.NONE, new FeedInfoView$$special$$inlined$bindView$3(this, R.id.feedInfoDetail));
        this.f38422f = C18451c.a(LazyThreadSafetyMode.NONE, new FeedInfoView$$special$$inlined$bindView$4(this, R.id.feedOverflow));
        this.f38423g = C18451c.a(LazyThreadSafetyMode.NONE, new FeedInfoView$$special$$inlined$bindView$5(this, R.id.feedInfoMatchAttributionIcon));
        if (isInEditMode() == null) {
            context = C14398a.a(context);
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) context).provideFeedViewComponent().inject(this);
        }
    }

    @NotNull
    public final C11723c getActionHandler$Tinder_release() {
        C11723c c11723c = this.f38418b;
        if (c11723c == null) {
            C2668g.b("actionHandler");
        }
        return c11723c;
    }

    public final void setActionHandler$Tinder_release(@NotNull C11723c c11723c) {
        C2668g.b(c11723c, "<set-?>");
        this.f38418b = c11723c;
    }

    /* renamed from: a */
    public final void m47639a(@NotNull C9501a c9501a, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c9501a, "feedInfo");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        C9503b.m39753a(this, c9501a, (Function0) function0);
        C9503b.m39756b(this, c9501a.m39747d());
        C9503b.m39755a(this, c9501a.m39750g());
        C9503b.m39754a(this, c9501a.m39749f());
        C9503b.m39752a(this, new C9475a(c9501a.m39745b(), c9501a.m39746c(), c9501a.m39747d(), c9501a.m39744a(), c9501a.m39749f()), feedOverflowListener);
    }
}
