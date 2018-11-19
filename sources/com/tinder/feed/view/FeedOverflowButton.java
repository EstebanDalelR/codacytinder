package com.tinder.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.feed.analytics.InteractType;
import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import com.tinder.feed.view.model.C9541g;
import com.tinder.overflow.OverflowButton;
import com.tinder.overflow.actionitem.C10020a;
import com.tinder.overflow.actionitem.C12227d;
import com.tinder.overflow.actionitem.C12229f;
import com.tinder.overflow.actionitem.C12229f.C10021a;
import com.tinder.overflow.actionitem.C12231g;
import com.tinder.overflow.actionitem.C12234k;
import com.tinder.overflow.actionitem.C12237m;
import com.tinder.overflow.actionitem.C12237m.C10023a;
import com.tinder.overflow.model.OverflowSource;
import com.tinder.profile.model.C14420c;
import java.util.LinkedHashSet;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000e\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/feed/view/FeedOverflowButton;", "Lcom/tinder/overflow/OverflowButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionItems", "Ljava/util/LinkedHashSet;", "Lcom/tinder/overflow/actionitem/ActionItem;", "Lkotlin/collections/LinkedHashSet;", "getActionItems", "()Ljava/util/LinkedHashSet;", "immutableFeedOverflowListener", "com/tinder/feed/view/FeedOverflowButton$immutableFeedOverflowListener$1", "Lcom/tinder/feed/view/FeedOverflowButton$immutableFeedOverflowListener$1;", "messageActionItem", "Lcom/tinder/overflow/actionitem/MessageActionItem;", "mutableFeedOverflowListener", "Lcom/tinder/feed/view/FeedOverflowListener;", "openProfileActionItem", "Lcom/tinder/overflow/actionitem/OpenProfileActionItem;", "recommendProfileActionItem", "Lcom/tinder/overflow/actionitem/RecommendProfileActionItem;", "reportProfileActionItem", "Lcom/tinder/overflow/actionitem/ReportProfileActionItem;", "unMatchActionItem", "Lcom/tinder/overflow/actionitem/UnMatchActionItem;", "bind", "", "overflowData", "Lcom/tinder/feed/view/FeedOverflowButton$OverflowData;", "feedOverflowListener", "OverflowData", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedOverflowButton extends OverflowButton {
    /* renamed from: a */
    private final C11709b f38220a = new C11709b(this);
    /* renamed from: b */
    private final C12237m f38221b;
    /* renamed from: c */
    private final C12234k f38222c;
    /* renamed from: d */
    private final C12231g f38223d;
    /* renamed from: e */
    private final C12227d f38224e;
    /* renamed from: f */
    private final C12229f f38225f;
    /* renamed from: g */
    private FeedOverflowListener f38226g;
    @NotNull
    /* renamed from: h */
    private final LinkedHashSet<C10020a> f38227h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/tinder/feed/view/FeedOverflowButton$OverflowData;", "", "userId", "", "matchId", "matchName", "contentId", "attribution", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;)V", "getAttribution", "()Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "getContentId", "()Ljava/lang/String;", "getMatchId", "getMatchName", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedOverflowButton$a */
    public static final class C9475a {
        @NotNull
        /* renamed from: a */
        private final String f31777a;
        @NotNull
        /* renamed from: b */
        private final String f31778b;
        @NotNull
        /* renamed from: c */
        private final String f31779c;
        @NotNull
        /* renamed from: d */
        private final String f31780d;
        @NotNull
        /* renamed from: e */
        private final Attribution f31781e;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9475a) {
                    C9475a c9475a = (C9475a) obj;
                    if (C2668g.a(this.f31777a, c9475a.f31777a) && C2668g.a(this.f31778b, c9475a.f31778b) && C2668g.a(this.f31779c, c9475a.f31779c) && C2668g.a(this.f31780d, c9475a.f31780d) && C2668g.a(this.f31781e, c9475a.f31781e)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f31777a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f31778b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f31779c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f31780d;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Attribution attribution = this.f31781e;
            if (attribution != null) {
                i = attribution.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OverflowData(userId=");
            stringBuilder.append(this.f31777a);
            stringBuilder.append(", matchId=");
            stringBuilder.append(this.f31778b);
            stringBuilder.append(", matchName=");
            stringBuilder.append(this.f31779c);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f31780d);
            stringBuilder.append(", attribution=");
            stringBuilder.append(this.f31781e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9475a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Attribution attribution) {
            C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
            C2668g.b(str2, "matchId");
            C2668g.b(str3, "matchName");
            C2668g.b(str4, "contentId");
            C2668g.b(attribution, "attribution");
            this.f31777a = str;
            this.f31778b = str2;
            this.f31779c = str3;
            this.f31780d = str4;
            this.f31781e = attribution;
        }

        @NotNull
        /* renamed from: a */
        public final String m39633a() {
            return this.f31777a;
        }

        @NotNull
        /* renamed from: b */
        public final String m39634b() {
            return this.f31778b;
        }

        @NotNull
        /* renamed from: c */
        public final String m39635c() {
            return this.f31779c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/tinder/feed/view/FeedOverflowButton$immutableFeedOverflowListener$1", "Lcom/tinder/feed/view/FeedOverflowListener;", "(Lcom/tinder/feed/view/FeedOverflowButton;)V", "onFeedbackProvided", "", "feedbackInfo", "Lcom/tinder/feed/view/model/FeedbackInfo;", "onItemSelected", "interactType", "Lcom/tinder/feed/analytics/InteractType;", "onOverflowButtonClicked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.FeedOverflowButton$b */
    public static final class C11709b implements FeedOverflowListener {
        /* renamed from: a */
        final /* synthetic */ FeedOverflowButton f38219a;

        C11709b(FeedOverflowButton feedOverflowButton) {
            this.f38219a = feedOverflowButton;
        }

        public void onOverflowButtonClicked() {
            FeedOverflowButton.m47535a(this.f38219a).onOverflowButtonClicked();
        }

        public void onItemSelected(@NotNull InteractType interactType) {
            C2668g.b(interactType, "interactType");
            FeedOverflowButton.m47535a(this.f38219a).onItemSelected(interactType);
        }

        public void onFeedbackProvided(@NotNull C9541g c9541g) {
            C2668g.b(c9541g, "feedbackInfo");
            FeedOverflowButton.m47535a(this.f38219a).onFeedbackProvided(c9541g);
        }
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ FeedOverflowListener m47535a(FeedOverflowButton feedOverflowButton) {
        feedOverflowButton = feedOverflowButton.f38226g;
        if (feedOverflowButton == null) {
            C2668g.b("mutableFeedOverflowListener");
        }
        return feedOverflowButton;
    }

    public FeedOverflowButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f38221b = new C12237m(context, new FeedOverflowButton$unMatchActionItem$1(this), new FeedOverflowButton$unMatchActionItem$2(this));
        String string = getResources().getString(R.string.report);
        C2668g.a(string, "resources.getString(R.string.report)");
        this.f38222c = new C12234k(context, string, new FeedOverflowButton$reportProfileActionItem$1(this), new FeedOverflowButton$reportProfileActionItem$2(this));
        string = getResources().getString(R.string.share_profile);
        C2668g.a(string, "resources.getString(R.string.share_profile)");
        this.f38223d = new C12231g(context, string, FeedOverflowButton$recommendProfileActionItem$1.f44168a);
        string = getResources().getString(R.string.open_chat);
        C2668g.a(string, "resources.getString(R.string.open_chat)");
        this.f38224e = new C12227d(context, string, new FeedOverflowButton$messageActionItem$1(this));
        string = getResources().getString(R.string.open_profile_regular_case);
        C2668g.a(string, "resources.getString(R.st…pen_profile_regular_case)");
        this.f38225f = new C12229f(context, string, new FeedOverflowButton$openProfileActionItem$1(this));
        this.f38227h = ak.c(new C10020a[]{(C10020a) this.f38221b, (C10020a) this.f38222c, (C10020a) this.f38223d, (C10020a) this.f38224e, (C10020a) this.f38225f});
        setOnClick((Function0) new Function0<C15813i>() {
            public /* synthetic */ Object invoke() {
                m53537a();
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m53537a() {
                this.f38220a.onOverflowButtonClicked();
            }
        });
    }

    @NotNull
    protected LinkedHashSet<C10020a> getActionItems() {
        return this.f38227h;
    }

    /* renamed from: a */
    public final void m47537a(@NotNull C9475a c9475a, @NotNull FeedOverflowListener feedOverflowListener) {
        C2668g.b(c9475a, "overflowData");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C12237m c12237m = this.f38221b;
        String b = c9475a.m39634b();
        String string = getResources().getString(R.string.unmatch, new Object[]{c9475a.m39635c()});
        C2668g.a(string, "resources.getString(R.st…, overflowData.matchName)");
        c12237m.m48425a(new C10023a(b, string));
        this.f38224e.m48389b(c9475a.m39634b());
        this.f38225f.m48392a(new C10021a(c9475a.m39633a(), c9475a.m39634b()));
        this.f38222c.m48415b(c9475a.m39634b());
        this.f38223d.m48401a(new C14420c(c9475a.m39633a(), c9475a.m39635c()), OverflowSource.FEED);
        this.f38226g = feedOverflowListener;
    }
}
