package com.tinder.match.views;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.analytics.chat.Origin;
import com.tinder.chat.activity.C8406b;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.match.presenter.C9874q;
import com.tinder.match.target.NewMatchRowTarget;
import com.tinder.match.viewmodel.C12102k;
import com.tinder.module.MatchesListComponentProvider;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.views.AvatarView;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u0002092\f\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002J\u0010\u0010@\u001a\u0002092\u0006\u0010A\u001a\u00020BH\u0002J\u0012\u0010C\u001a\u0002092\b\b\u0001\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u000209H\u0002J\u0010\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020?H\u0016J\b\u0010I\u001a\u000209H\u0014J\b\u0010J\u001a\u000209H\u0014J\u0010\u0010K\u001a\u00020L2\u0006\u0010A\u001a\u00020BH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001b\u001a\u00020\u001c8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\u00018\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006M"}, d2 = {"Lcom/tinder/match/views/NewMatchRowView;", "Landroid/widget/RelativeLayout;", "Lcom/tinder/match/target/NewMatchRowTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "avatarView", "Lcom/tinder/views/AvatarView;", "getAvatarView$Tinder_release", "()Lcom/tinder/views/AvatarView;", "setAvatarView$Tinder_release", "(Lcom/tinder/views/AvatarView;)V", "chatIntentFactory", "Lcom/tinder/chat/activity/ChatIntentFactory;", "getChatIntentFactory$Tinder_release", "()Lcom/tinder/chat/activity/ChatIntentFactory;", "setChatIntentFactory$Tinder_release", "(Lcom/tinder/chat/activity/ChatIntentFactory;)V", "goldMatchAttributionBackground", "Landroid/widget/ImageView;", "getGoldMatchAttributionBackground$Tinder_release", "()Landroid/widget/ImageView;", "setGoldMatchAttributionBackground$Tinder_release", "(Landroid/widget/ImageView;)V", "matchAttributionIcon", "getMatchAttributionIcon$Tinder_release", "setMatchAttributionIcon$Tinder_release", "name", "Landroid/widget/TextView;", "getName$Tinder_release", "()Landroid/widget/TextView;", "setName$Tinder_release", "(Landroid/widget/TextView;)V", "newMatchRowContainer", "getNewMatchRowContainer$Tinder_release", "()Landroid/widget/RelativeLayout;", "setNewMatchRowContainer$Tinder_release", "(Landroid/widget/RelativeLayout;)V", "presenter", "Lcom/tinder/match/presenter/NewMatchRowPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/match/presenter/NewMatchRowPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/match/presenter/NewMatchRowPresenter;)V", "shimmerFrameLayout", "Lcom/tinder/shimmy/ShimmerFrameLayout;", "getShimmerFrameLayout$Tinder_release", "()Lcom/tinder/shimmy/ShimmerFrameLayout;", "setShimmerFrameLayout$Tinder_release", "(Lcom/tinder/shimmy/ShimmerFrameLayout;)V", "unviewedIndicator", "Landroid/view/View;", "getUnviewedIndicator$Tinder_release", "()Landroid/view/View;", "setUnviewedIndicator$Tinder_release", "(Landroid/view/View;)V", "bind", "", "newMatchViewModel", "Lcom/tinder/match/viewmodel/NewMatchViewModel;", "bindAvatarView", "imageUrls", "", "", "bindMatchAttribution", "matchAttribution", "Lcom/tinder/domain/match/model/Match$Attribution;", "displayMatchAttribution", "resource", "", "hideMatchAttribution", "navigateToChat", "matchId", "onAttachedToWindow", "onDetachedFromWindow", "shouldShimmer", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NewMatchRowView extends RelativeLayout implements NewMatchRowTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9874q f39267a;
    @NotNull
    @BindView(2131362915)
    public AvatarView avatarView;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8406b f39268b;
    @NotNull
    @BindView(2131362904)
    public ImageView goldMatchAttributionBackground;
    @NotNull
    @BindView(2131362902)
    public ImageView matchAttributionIcon;
    @NotNull
    @BindView(2131362911)
    public TextView name;
    @NotNull
    @BindView(2131362991)
    public RelativeLayout newMatchRowContainer;
    @NotNull
    @BindView(2131363564)
    public ShimmerFrameLayout shimmerFrameLayout;
    @NotNull
    @BindView(2131362707)
    public View unviewedIndicator;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.views.NewMatchRowView$a */
    static final class C9893a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ NewMatchRowView f32735a;
        /* renamed from: b */
        final /* synthetic */ C12102k f32736b;

        C9893a(NewMatchRowView newMatchRowView, C12102k c12102k) {
            this.f32735a = newMatchRowView;
            this.f32736b = c12102k;
        }

        public final void onClick(View view) {
            view = this.f32735a.getPresenter$Tinder_release();
            String a = this.f32736b.mo11192a();
            C2668g.a(a, "newMatchViewModel.id()");
            view.m40630a(a);
        }
    }

    public NewMatchRowView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        ((MatchesListComponentProvider) context).provideMatchesListComponent().inject(this);
        View.inflate(context, R.layout.new_matches_item_view, this);
        ButterKnife.a(this);
    }

    @NotNull
    public final AvatarView getAvatarView$Tinder_release() {
        AvatarView avatarView = this.avatarView;
        if (avatarView == null) {
            C2668g.b("avatarView");
        }
        return avatarView;
    }

    public final void setAvatarView$Tinder_release(@NotNull AvatarView avatarView) {
        C2668g.b(avatarView, "<set-?>");
        this.avatarView = avatarView;
    }

    @NotNull
    public final View getUnviewedIndicator$Tinder_release() {
        View view = this.unviewedIndicator;
        if (view == null) {
            C2668g.b("unviewedIndicator");
        }
        return view;
    }

    public final void setUnviewedIndicator$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.unviewedIndicator = view;
    }

    @NotNull
    public final ShimmerFrameLayout getShimmerFrameLayout$Tinder_release() {
        ShimmerFrameLayout shimmerFrameLayout = this.shimmerFrameLayout;
        if (shimmerFrameLayout == null) {
            C2668g.b("shimmerFrameLayout");
        }
        return shimmerFrameLayout;
    }

    public final void setShimmerFrameLayout$Tinder_release(@NotNull ShimmerFrameLayout shimmerFrameLayout) {
        C2668g.b(shimmerFrameLayout, "<set-?>");
        this.shimmerFrameLayout = shimmerFrameLayout;
    }

    @NotNull
    public final ImageView getMatchAttributionIcon$Tinder_release() {
        ImageView imageView = this.matchAttributionIcon;
        if (imageView == null) {
            C2668g.b("matchAttributionIcon");
        }
        return imageView;
    }

    public final void setMatchAttributionIcon$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.matchAttributionIcon = imageView;
    }

    @NotNull
    public final ImageView getGoldMatchAttributionBackground$Tinder_release() {
        ImageView imageView = this.goldMatchAttributionBackground;
        if (imageView == null) {
            C2668g.b("goldMatchAttributionBackground");
        }
        return imageView;
    }

    public final void setGoldMatchAttributionBackground$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.goldMatchAttributionBackground = imageView;
    }

    @NotNull
    public final TextView getName$Tinder_release() {
        TextView textView = this.name;
        if (textView == null) {
            C2668g.b("name");
        }
        return textView;
    }

    public final void setName$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.name = textView;
    }

    @NotNull
    public final RelativeLayout getNewMatchRowContainer$Tinder_release() {
        RelativeLayout relativeLayout = this.newMatchRowContainer;
        if (relativeLayout == null) {
            C2668g.b("newMatchRowContainer");
        }
        return relativeLayout;
    }

    public final void setNewMatchRowContainer$Tinder_release(@NotNull RelativeLayout relativeLayout) {
        C2668g.b(relativeLayout, "<set-?>");
        this.newMatchRowContainer = relativeLayout;
    }

    @NotNull
    public final C9874q getPresenter$Tinder_release() {
        C9874q c9874q = this.f39267a;
        if (c9874q == null) {
            C2668g.b("presenter");
        }
        return c9874q;
    }

    public final void setPresenter$Tinder_release(@NotNull C9874q c9874q) {
        C2668g.b(c9874q, "<set-?>");
        this.f39267a = c9874q;
    }

    @NotNull
    public final C8406b getChatIntentFactory$Tinder_release() {
        C8406b c8406b = this.f39268b;
        if (c8406b == null) {
            C2668g.b("chatIntentFactory");
        }
        return c8406b;
    }

    public final void setChatIntentFactory$Tinder_release(@NotNull C8406b c8406b) {
        C2668g.b(c8406b, "<set-?>");
        this.f39268b = c8406b;
    }

    /* renamed from: a */
    public final void m48231a(@NotNull C12102k c12102k) {
        C2668g.b(c12102k, "newMatchViewModel");
        Attribution c = c12102k.mo11194c();
        C2668g.a(c, "newMatchViewModel.matchAttribution()");
        m48228a(c);
        List d = c12102k.mo11195d();
        C2668g.a(d, "newMatchViewModel.imageUrls()");
        m48229a(d);
        View view = this.unviewedIndicator;
        if (view == null) {
            C2668g.b("unviewedIndicator");
        }
        view.setVisibility(c12102k.mo11197f() ? 8 : 0);
        TextView textView = this.name;
        if (textView == null) {
            C2668g.b("name");
        }
        textView.setText(c12102k.mo11193b());
        RelativeLayout relativeLayout = this.newMatchRowContainer;
        if (relativeLayout == null) {
            C2668g.b("newMatchRowContainer");
        }
        relativeLayout.setOnClickListener(new C9893a(this, c12102k));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9874q c9874q = this.f39267a;
        if (c9874q == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c9874q);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void navigateToChat(@NotNull String str) {
        C2668g.b(str, "matchId");
        C8406b c8406b = this.f39268b;
        if (c8406b == null) {
            C2668g.b("chatIntentFactory");
        }
        Context context = getContext();
        C2668g.a(context, "context");
        getContext().startActivity(c8406b.m35881a(context, Origin.NEW_MATCHES, str));
    }

    /* renamed from: a */
    private final void m48228a(Attribution attribution) {
        ImageView imageView;
        m48226a();
        C9874q c9874q;
        switch (C9897m.f32741a[attribution.ordinal()]) {
            case 1:
                m48227a((int) R.drawable.ic_boost_matchmessage_attribution);
                break;
            case 2:
            case 3:
                m48227a((int) R.drawable.ic_superlike_matchmessage_attribution);
                break;
            case 4:
                c9874q = this.f39267a;
                if (c9874q == null) {
                    C2668g.b("presenter");
                }
                if (c9874q.m40631a()) {
                    imageView = this.goldMatchAttributionBackground;
                    if (imageView == null) {
                        C2668g.b("goldMatchAttributionBackground");
                    }
                    imageView.setImageResource(R.drawable.ic_fastmatch_background);
                    m48227a((int) R.drawable.ic_fastmatch_foreground);
                    break;
                }
                break;
            case 5:
                c9874q = this.f39267a;
                if (c9874q == null) {
                    C2668g.b("presenter");
                }
                if (c9874q.m40632b()) {
                    imageView = this.goldMatchAttributionBackground;
                    if (imageView == null) {
                        C2668g.b("goldMatchAttributionBackground");
                    }
                    imageView.setImageResource(R.drawable.ic_top_picks_small_background);
                    m48227a((int) R.drawable.ic_top_picks_small_foreground);
                    break;
                }
                break;
            case 6:
                m48227a((int) R.drawable.ic_sponsored_message_attribution);
                break;
            case 7:
                m48227a((int) R.drawable.ic_places_icon);
                break;
            default:
                break;
        }
        attribution = m48230b(attribution);
        ShimmerFrameLayout shimmerFrameLayout = this.shimmerFrameLayout;
        if (shimmerFrameLayout == null) {
            C2668g.b("shimmerFrameLayout");
        }
        shimmerFrameLayout.setEnabled(attribution);
        imageView = this.goldMatchAttributionBackground;
        if (imageView == null) {
            C2668g.b("goldMatchAttributionBackground");
        }
        imageView.setVisibility(attribution != null ? null : 8);
    }

    /* renamed from: b */
    private final boolean m48230b(Attribution attribution) {
        switch (C9897m.f32742b[attribution.ordinal()]) {
            case 1:
            case 2:
                return true;
            default:
                return null;
        }
    }

    /* renamed from: a */
    private final void m48227a(@DrawableRes int i) {
        ImageView imageView = this.matchAttributionIcon;
        if (imageView == null) {
            C2668g.b("matchAttributionIcon");
        }
        imageView.setVisibility(0);
        imageView = this.matchAttributionIcon;
        if (imageView == null) {
            C2668g.b("matchAttributionIcon");
        }
        imageView.setImageResource(i);
    }

    /* renamed from: a */
    private final void m48226a() {
        ImageView imageView = this.matchAttributionIcon;
        if (imageView == null) {
            C2668g.b("matchAttributionIcon");
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    private final void m48229a(List<String> list) {
        if (!list.isEmpty()) {
            if (!TextUtils.isEmpty((CharSequence) list.get(0))) {
                AvatarView avatarView = this.avatarView;
                if (avatarView == null) {
                    C2668g.b("avatarView");
                }
                Collection collection = list;
                if (collection == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
                }
                list = collection.toArray(new String[0]);
                if (list == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) list;
                avatarView.setAvatars((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
        }
        list = this.avatarView;
        if (list == null) {
            C2668g.b("avatarView");
        }
        list.setGroupAvatarsView(new int[]{R.drawable.ic_match_placeholder});
    }
}
