package com.tinder.feed.view.feed;

import com.tinder.R;
import com.tinder.common.feed.view.C8538a;
import com.tinder.feed.view.FeedOverflowListener;
import com.tinder.feed.view.info.C9501a;
import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import com.tinder.feed.view.model.C13280h;
import com.tinder.feed.view.model.C13281i;
import com.tinder.feed.view.model.C13282k;
import com.tinder.feed.view.model.C13283l;
import com.tinder.feed.view.model.C13284m;
import com.tinder.feed.view.model.C13285n;
import com.tinder.feed.view.model.C13286o;
import com.tinder.feed.view.model.C13287p;
import com.tinder.feed.view.model.C13288q;
import com.tinder.feed.view.model.C13289r;
import com.tinder.feed.view.model.C9539e;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000v\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\b\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u00152\u0006\u0010\b\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u00172\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u001f2\u0006\u0010\b\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006!"}, d2 = {"highResAvatarURL", "", "Lcom/tinder/feed/view/model/FeedUserInfoViewModel;", "getHighResAvatarURL", "(Lcom/tinder/feed/view/model/FeedUserInfoViewModel;)Ljava/lang/String;", "bindInfoView", "", "Lcom/tinder/feed/view/feed/ConnectedInstagramFeedView;", "viewModel", "Lcom/tinder/feed/view/model/InstagramConnectFeedViewModel;", "feedOverflowListener", "Lcom/tinder/feed/view/FeedOverflowListener;", "feedInfoOpenProfileListener", "Lkotlin/Function0;", "Lcom/tinder/feed/view/action/FeedInfoOpenProfileListener;", "Lcom/tinder/feed/view/feed/InstagramFeedItemView;", "Lcom/tinder/feed/view/model/InstagramMediaFeedViewModel;", "Lcom/tinder/feed/view/feed/NewMatchFeedView;", "Lcom/tinder/feed/view/model/NewMatchFeedViewModel;", "Lcom/tinder/feed/view/feed/ProfileAddLoopFeedView;", "Lcom/tinder/feed/view/model/ProfileAddLoopFeedViewModel;", "Lcom/tinder/feed/view/feed/ProfileAddPhotoFeedView;", "Lcom/tinder/feed/view/model/ProfileAddPhotoFeedViewModel;", "Lcom/tinder/feed/view/feed/ProfileChangeBioFeedView;", "Lcom/tinder/feed/view/model/ProfileChangeBioFeedViewModel;", "Lcom/tinder/feed/view/feed/ProfileChangeSchoolFeedView;", "Lcom/tinder/feed/view/model/ProfileChangeSchoolFeedViewModel;", "Lcom/tinder/feed/view/feed/ProfileChangeWorkFeedView;", "Lcom/tinder/feed/view/model/ProfileChangeWorkFeedViewModel;", "Lcom/tinder/feed/view/feed/SpotifyNewAnthemFeedView;", "Lcom/tinder/feed/view/model/SpotifyNewAnthemFeedViewModel;", "Lcom/tinder/feed/view/feed/SpotifyNewTopArtistFeedView;", "Lcom/tinder/feed/view/model/ProfileSpotifyArtistFeedViewModel;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.feed.f */
public final class C9494f {
    /* renamed from: a */
    public static final void m39710a(@NotNull C11735j c11735j, @NotNull C13281i c13281i, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c11735j, "$receiver");
        C2668g.b(c13281i, "viewModel");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        String id = c13281i.getId();
        String b = c13281i.mo11143e().m39804b();
        String b2 = c13281i.mo11140b();
        String a = c13281i.mo11143e().m39803a();
        String a2 = C9494f.m39707a(c13281i.mo11143e());
        Attribution c = c13281i.mo11141c();
        String string = c11735j.getContext().getString(R.string.feed_info_detail_instagram);
        C2668g.a(string, "context.getString(R.stri…ed_info_detail_instagram)");
        c11735j.getFeedInfoContainer$Tinder_release().m47639a(new C9501a(id, b, b2, a, a2, c, string), feedOverflowListener, function0);
    }

    /* renamed from: a */
    private static final String m39707a(@NotNull C9539e c9539e) {
        return C8538a.m36521d(C9492d.m39684a(c9539e.m39805c()));
    }

    /* renamed from: a */
    public static final void m39717a(@NotNull C11750y c11750y, @NotNull C13289r c13289r, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c11750y, "$receiver");
        C2668g.b(c13289r, "viewModel");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        String id = c13289r.getId();
        String b = c13289r.mo11143e().m39804b();
        String b2 = c13289r.mo11140b();
        String a = c13289r.mo11143e().m39803a();
        String a2 = C9494f.m39707a(c13289r.mo11143e());
        Attribution c = c13289r.mo11141c();
        String string = c11750y.getContext().getString(R.string.feed_info_detail_spotify_new_anthem);
        C2668g.a(string, "context.getString(R.stri…etail_spotify_new_anthem)");
        c11750y.getFeedInfoContainer$Tinder_release().m47639a(new C9501a(id, b, b2, a, a2, c, string), feedOverflowListener, function0);
    }

    /* renamed from: a */
    public static final void m39709a(@NotNull aa aaVar, @NotNull C13288q c13288q, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(aaVar, "$receiver");
        C2668g.b(c13288q, "viewModel");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        String id = c13288q.getId();
        String b = c13288q.mo11143e().m39804b();
        String b2 = c13288q.mo11140b();
        String a = c13288q.mo11143e().m39803a();
        String a2 = C9494f.m39707a(c13288q.mo11143e());
        Attribution c = c13288q.mo11141c();
        String string = aaVar.getContext().getString(R.string.feed_info_detail_spotify_top_artists);
        C2668g.a(string, "context.getString(R.stri…tail_spotify_top_artists)");
        aaVar.getFeedInfoContainer$Tinder_release().m47639a(new C9501a(id, b, b2, a, a2, c, string), feedOverflowListener, function0);
    }

    /* renamed from: a */
    public static final void m39711a(@NotNull C11738m c11738m, @NotNull C13282k c13282k, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c11738m, "$receiver");
        C2668g.b(c13282k, "viewModel");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        String id = c13282k.getId();
        String b = c13282k.mo11143e().m39804b();
        String b2 = c13282k.mo11140b();
        String a = c13282k.mo11143e().m39803a();
        String a2 = C9494f.m39707a(c13282k.mo11143e());
        Attribution c = c13282k.mo11141c();
        String string = c11738m.getContext().getString(R.string.feed_info_detail_new_match);
        C2668g.a(string, "context.getString(R.stri…ed_info_detail_new_match)");
        c11738m.getFeedInfoContainer$Tinder_release().m47639a(new C9501a(id, b, b2, a, a2, c, string), feedOverflowListener, function0);
    }

    /* renamed from: a */
    public static final void m39713a(@NotNull C11742q c11742q, @NotNull C13284m c13284m, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c11742q, "$receiver");
        C2668g.b(c13284m, "viewModel");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        String id = c13284m.getId();
        String b = c13284m.mo11143e().m39804b();
        String b2 = c13284m.mo11140b();
        String a = c13284m.mo11143e().m39803a();
        String a2 = C9494f.m39707a(c13284m.mo11143e());
        Attribution c = c13284m.mo11141c();
        String string = c11742q.getContext().getString(R.string.feed_info_detail_profile_add_photo);
        C2668g.a(string, "context.getString(R.stri…detail_profile_add_photo)");
        c11742q.getFeedInfoContainer$Tinder_release().m47639a(new C9501a(id, b, b2, a, a2, c, string), feedOverflowListener, function0);
    }

    /* renamed from: a */
    public static final void m39712a(@NotNull C11740o c11740o, @NotNull C13283l c13283l, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c11740o, "$receiver");
        C2668g.b(c13283l, "viewModel");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        String id = c13283l.getId();
        String b = c13283l.mo11143e().m39804b();
        String b2 = c13283l.mo11140b();
        String a = c13283l.mo11143e().m39803a();
        String a2 = C9494f.m39707a(c13283l.mo11143e());
        Attribution c = c13283l.mo11141c();
        String string = c11740o.getContext().getString(R.string.feed_info_detail_profile_add_loop);
        C2668g.a(string, "context.getString(R.stri…_detail_profile_add_loop)");
        c11740o.getFeedInfoContainer$Tinder_release().m47639a(new C9501a(id, b, b2, a, a2, c, string), feedOverflowListener, function0);
    }

    /* renamed from: a */
    public static final void m39714a(@NotNull C11744s c11744s, @NotNull C13285n c13285n, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c11744s, "$receiver");
        C2668g.b(c13285n, "viewModel");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        String id = c13285n.getId();
        String b = c13285n.mo11143e().m39804b();
        String b2 = c13285n.mo11140b();
        String a = c13285n.mo11143e().m39803a();
        String a2 = C9494f.m39707a(c13285n.mo11143e());
        Attribution c = c13285n.mo11141c();
        String string = c11744s.getContext().getString(R.string.feed_info_detail_profile_change_bio);
        C2668g.a(string, "context.getString(R.stri…etail_profile_change_bio)");
        c11744s.getFeedInfoContainer$Tinder_release().m47639a(new C9501a(id, b, b2, a, a2, c, string), feedOverflowListener, function0);
    }

    /* renamed from: a */
    public static final void m39716a(@NotNull C11748w c11748w, @NotNull C13287p c13287p, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c11748w, "$receiver");
        C2668g.b(c13287p, "viewModel");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        String id = c13287p.getId();
        String b = c13287p.mo11143e().m39804b();
        String b2 = c13287p.mo11140b();
        String a = c13287p.mo11143e().m39803a();
        String a2 = C9494f.m39707a(c13287p.mo11143e());
        Attribution c = c13287p.mo11141c();
        String string = c11748w.getContext().getString(R.string.feed_info_detail_profile_change_work);
        C2668g.a(string, "context.getString(R.stri…tail_profile_change_work)");
        c11748w.getFeedInfoContainer$Tinder_release().m47639a(new C9501a(id, b, b2, a, a2, c, string), feedOverflowListener, function0);
    }

    /* renamed from: a */
    public static final void m39715a(@NotNull C11746u c11746u, @NotNull C13286o c13286o, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c11746u, "$receiver");
        C2668g.b(c13286o, "viewModel");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        String id = c13286o.getId();
        String b = c13286o.mo11143e().m39804b();
        String b2 = c13286o.mo11140b();
        String a = c13286o.mo11143e().m39803a();
        String a2 = C9494f.m39707a(c13286o.mo11143e());
        Attribution c = c13286o.mo11141c();
        String string = c11746u.getContext().getString(R.string.feed_info_detail_profile_change_school);
        C2668g.a(string, "context.getString(R.stri…il_profile_change_school)");
        c11746u.getFeedInfoContainer$Tinder_release().m47639a(new C9501a(id, b, b2, a, a2, c, string), feedOverflowListener, function0);
    }

    /* renamed from: a */
    public static final void m39708a(@NotNull C11729a c11729a, @NotNull C13280h c13280h, @NotNull FeedOverflowListener feedOverflowListener, @NotNull Function0<C15813i> function0) {
        C2668g.b(c11729a, "$receiver");
        C2668g.b(c13280h, "viewModel");
        C2668g.b(feedOverflowListener, "feedOverflowListener");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        String id = c13280h.getId();
        String b = c13280h.mo11143e().m39804b();
        String b2 = c13280h.mo11140b();
        String a = c13280h.mo11143e().m39803a();
        String a2 = C9494f.m39707a(c13280h.mo11143e());
        Attribution c = c13280h.mo11141c();
        String string = c11729a.getContext().getString(R.string.feed_info_detail_connected_instagram);
        C2668g.a(string, "context.getString(R.stri…tail_connected_instagram)");
        c11729a.getFeedInfoContainer$Tinder_release().m47639a(new C9501a(id, b, b2, a, a2, c, string), feedOverflowListener, function0);
    }
}
