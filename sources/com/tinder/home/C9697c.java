package com.tinder.home;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.widget.LinearLayout.LayoutParams;
import com.tinder.R;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.home.p342a.C11862a;
import com.tinder.main.Badgeable$Trigger;
import com.tinder.main.C11991a;
import com.tinder.main.model.C9832a;
import com.tinder.main.model.MainPage;
import com.tinder.main.p287c.C11993b;
import com.tinder.main.p287c.C13389a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0002J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0003R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/home/MainTabIconViewFactory;", "", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "matchesTabBadgeTrigger", "Lcom/tinder/main/MatchesTabBadgeTrigger;", "profileTabBadgeTrigger", "Lcom/tinder/home/ProfileTabBadgeTrigger;", "feedTabBadgeTrigger", "Lcom/tinder/home/feed/FeedTabBadgeTrigger;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/main/MatchesTabBadgeTrigger;Lcom/tinder/home/ProfileTabBadgeTrigger;Lcom/tinder/home/feed/FeedTabBadgeTrigger;)V", "create", "Lcom/tinder/main/model/MainTabViewModel;", "homePage", "Lcom/tinder/main/model/MainPage;", "createHomeTabIcon", "Lcom/tinder/main/view/MainTabIconView;", "context", "Landroid/content/Context;", "homeTab", "createViewForTab", "getContentDescForTab", "", "getDefaultStatus", "", "getIconForTab", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.home.c */
public final class C9697c {
    /* renamed from: a */
    private final SubscriptionProvider f32271a;
    /* renamed from: b */
    private final C11991a f32272b;
    /* renamed from: c */
    private final C11865f f32273c;
    /* renamed from: d */
    private final C11862a f32274d;

    @Inject
    public C9697c(@NotNull SubscriptionProvider subscriptionProvider, @NotNull C11991a c11991a, @NotNull C11865f c11865f, @NotNull C11862a c11862a) {
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(c11991a, "matchesTabBadgeTrigger");
        C2668g.b(c11865f, "profileTabBadgeTrigger");
        C2668g.b(c11862a, "feedTabBadgeTrigger");
        this.f32271a = subscriptionProvider;
        this.f32272b = c11991a;
        this.f32273c = c11865f;
        this.f32274d = c11862a;
    }

    @NotNull
    /* renamed from: a */
    public final C9832a m40158a(@NotNull MainPage mainPage) {
        C2668g.b(mainPage, "homePage");
        return new C9832a(mainPage, m40156d(mainPage), m40154b(mainPage), m40155c(mainPage));
    }

    @NotNull
    /* renamed from: a */
    public final C11993b m40157a(@NotNull C9832a c9832a, @NotNull Context context) {
        C2668g.b(c9832a, "homeTab");
        C2668g.b(context, "context");
        context = m40153a(context, c9832a);
        LayoutParams layoutParams = new LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        switch (C9698d.f32275a[c9832a.m40441a().ordinal()]) {
            case 1:
                context.addTrigger((Badgeable$Trigger) this.f32273c);
                break;
            case 2:
                context.addTrigger((Badgeable$Trigger) this.f32272b);
                break;
            case 3:
                break;
            case 4:
                context.addTrigger((Badgeable$Trigger) this.f32274d);
                break;
            case 5:
                throw ((Throwable) new IllegalArgumentException("Discovery does not support HomeTabIconView"));
            default:
                break;
        }
        context.setLayoutParams(layoutParams);
        return context;
    }

    @DrawableRes
    /* renamed from: b */
    private final int m40154b(MainPage mainPage) {
        switch (C9698d.f32276b[mainPage.ordinal()]) {
            case 1:
                return R.drawable.main_tab_ic_profile;
            case 2:
                return R.drawable.main_tab_ic_recs;
            case 3:
                return R.drawable.main_tab_ic_matches;
            case 4:
                return R.drawable.main_tab_ic_feed;
            case 5:
                throw ((Throwable) new IllegalArgumentException("Discovery does not support HomeTabIconView"));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @StringRes
    /* renamed from: c */
    private final int m40155c(MainPage mainPage) {
        switch (C9698d.f32277c[mainPage.ordinal()]) {
            case 1:
                return R.string.relative_settings_header;
            case 2:
                return R.string.btn_main_menu;
            case 3:
                return R.string.btn_main_matches;
            case 4:
                return R.string.btn_main_feed;
            case 5:
                throw ((Throwable) new IllegalArgumentException("Discovery does not support HomeTabIconView"));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    private final boolean m40156d(MainPage mainPage) {
        return mainPage == MainPage.RECS ? true : null;
    }

    /* renamed from: a */
    private final C11993b m40153a(Context context, C9832a c9832a) {
        if (c9832a.m40441a() == MainPage.RECS) {
            return new C13327h(context, c9832a.m40442b(), new C9701j(this.f32271a));
        }
        return new C13389a(context, c9832a);
    }
}
