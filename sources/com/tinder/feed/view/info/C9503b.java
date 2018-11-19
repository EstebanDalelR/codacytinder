package com.tinder.feed.view.info;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.feed.view.FeedOverflowButton.C9475a;
import com.tinder.feed.view.FeedOverflowListener;
import com.tinder.feed.view.action.FeedInfoAvatarClickingActionHandler;
import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00010\tj\u0002`\nH\u0002\u001a$\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00010\tj\u0002`\n\u001a\u0012\u0010\r\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000f\u001a\u001a\u0010\u0015\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019¨\u0006\u001a"}, d2 = {"bind", "", "avatarView", "Lcom/tinder/feed/view/info/FeedAvatarImageView;", "viewModel", "Lcom/tinder/feed/view/info/FeedInfoModel;", "actionHandler", "Lcom/tinder/feed/view/action/FeedInfoAvatarClickingActionHandler;", "feedInfoOpenProfileListener", "Lkotlin/Function0;", "Lcom/tinder/feed/view/action/FeedInfoOpenProfileListener;", "bindAvatarView", "Lcom/tinder/feed/view/info/FeedInfoView;", "bindInfoDetail", "infoDetail", "", "bindMatchAttributionIndicator", "attribution", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "bindMatchName", "matchName", "bindOverflow", "overflowData", "Lcom/tinder/feed/view/FeedOverflowButton$OverflowData;", "feedOverflowListener", "Lcom/tinder/feed/view/FeedOverflowListener;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.info.b */
public final class C9503b {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.info.b$a */
    static final class C9502a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FeedInfoAvatarClickingActionHandler f31839a;
        /* renamed from: b */
        final /* synthetic */ C9501a f31840b;
        /* renamed from: c */
        final /* synthetic */ Function0 f31841c;

        C9502a(FeedInfoAvatarClickingActionHandler feedInfoAvatarClickingActionHandler, C9501a c9501a, Function0 function0) {
            this.f31839a = feedInfoAvatarClickingActionHandler;
            this.f31840b = c9501a;
            this.f31841c = function0;
        }

        public final void onClick(View view) {
            this.f31839a.onAvatarClicked(this.f31840b.m39745b(), this.f31840b.m39746c(), this.f31841c);
        }
    }

    /* renamed from: a */
    public static final void m39753a(@NotNull FeedInfoView feedInfoView, @NotNull C9501a c9501a, @NotNull Function0<C15813i> function0) {
        C2668g.b(feedInfoView, "$receiver");
        C2668g.b(c9501a, "viewModel");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        C9503b.m39751a(feedInfoView.getInfoAvatarView$Tinder_release(), c9501a, feedInfoView.getActionHandler$Tinder_release(), function0);
    }

    /* renamed from: a */
    public static final void m39755a(@NotNull FeedInfoView feedInfoView, @NotNull String str) {
        C2668g.b(feedInfoView, "$receiver");
        C2668g.b(str, "infoDetail");
        feedInfoView.getInfoDetailView$Tinder_release().setText(str);
    }

    /* renamed from: b */
    public static final void m39756b(@NotNull FeedInfoView feedInfoView, @NotNull String str) {
        C2668g.b(feedInfoView, "$receiver");
        C2668g.b(str, "matchName");
        feedInfoView.getInfoMatchNameView$Tinder_release().setText(str);
    }

    /* renamed from: a */
    public static final void m39752a(@NotNull FeedInfoView feedInfoView, @NotNull C9475a c9475a, @NotNull FeedOverflowListener feedOverflowListener) {
        C2668g.b(feedInfoView, "$receiver");
        C2668g.b(c9475a, "overflowData");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        feedInfoView.getInfoOverflow$Tinder_release().m47537a(c9475a, feedOverflowListener);
    }

    /* renamed from: a */
    public static final void m39754a(@NotNull FeedInfoView feedInfoView, @NotNull Attribution attribution) {
        C2668g.b(feedInfoView, "$receiver");
        C2668g.b(attribution, "attribution");
        feedInfoView.getInfoMatchAttributionIcon$Tinder_release().m42976a(attribution);
    }

    /* renamed from: a */
    private static final void m39751a(FeedAvatarImageView feedAvatarImageView, C9501a c9501a, FeedInfoAvatarClickingActionHandler feedInfoAvatarClickingActionHandler, Function0<C15813i> function0) {
        feedAvatarImageView.m39743a(c9501a.m39748e());
        feedAvatarImageView.setOnClickListener(new C9502a(feedInfoAvatarClickingActionHandler, c9501a, function0));
    }
}
