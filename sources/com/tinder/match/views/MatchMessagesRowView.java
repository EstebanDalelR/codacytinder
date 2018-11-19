package com.tinder.match.views;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.analytics.chat.Origin;
import com.tinder.chat.activity.C8406b;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.match.presenter.C9868e;
import com.tinder.match.target.MatchMessageRowTarget;
import com.tinder.match.viewmodel.C12099h;
import com.tinder.module.MatchesListComponentProvider;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.views.AvatarView;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010D\u001a\u00020E2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GH\u0002J\u0010\u0010I\u001a\u00020E2\u0006\u0010J\u001a\u00020KH\u0002J\u000e\u0010L\u001a\u00020E2\u0006\u0010M\u001a\u00020NJ\u0012\u0010O\u001a\u00020E2\b\b\u0001\u0010P\u001a\u00020\u0019H\u0002J\b\u0010Q\u001a\u00020EH\u0002J\u0010\u0010R\u001a\u00020E2\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u00020EH\u0014J\b\u0010V\u001a\u00020EH\u0014J\u0010\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020KH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u00198\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\u001e\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u00020$8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\u001e\u00102\u001a\u0002038\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u00020*8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001e\u0010;\u001a\u00020<8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u00020*8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010,\"\u0004\bC\u0010.¨\u0006Y"}, d2 = {"Lcom/tinder/match/views/MatchMessagesRowView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/match/target/MatchMessageRowTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "avatarView", "Lcom/tinder/views/AvatarView;", "getAvatarView$Tinder_release", "()Lcom/tinder/views/AvatarView;", "setAvatarView$Tinder_release", "(Lcom/tinder/views/AvatarView;)V", "chatIntentFactory", "Lcom/tinder/chat/activity/ChatIntentFactory;", "getChatIntentFactory$Tinder_release", "()Lcom/tinder/chat/activity/ChatIntentFactory;", "setChatIntentFactory$Tinder_release", "(Lcom/tinder/chat/activity/ChatIntentFactory;)V", "goldAttributionBackground", "Landroid/widget/ImageView;", "getGoldAttributionBackground$Tinder_release", "()Landroid/widget/ImageView;", "setGoldAttributionBackground$Tinder_release", "(Landroid/widget/ImageView;)V", "leftMargin", "", "matchAttributionIcon", "getMatchAttributionIcon$Tinder_release", "setMatchAttributionIcon$Tinder_release", "matchRowView", "Landroid/widget/RelativeLayout;", "getMatchRowView$Tinder_release", "()Landroid/widget/RelativeLayout;", "setMatchRowView$Tinder_release", "(Landroid/widget/RelativeLayout;)V", "message", "Landroid/widget/TextView;", "getMessage$Tinder_release", "()Landroid/widget/TextView;", "setMessage$Tinder_release", "(Landroid/widget/TextView;)V", "mutedIcon", "Landroid/view/View;", "getMutedIcon$Tinder_release", "()Landroid/view/View;", "setMutedIcon$Tinder_release", "(Landroid/view/View;)V", "name", "getName$Tinder_release", "setName$Tinder_release", "presenter", "Lcom/tinder/match/presenter/MatchMessageRowPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/match/presenter/MatchMessageRowPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/match/presenter/MatchMessageRowPresenter;)V", "replyArrow", "getReplyArrow$Tinder_release", "setReplyArrow$Tinder_release", "shimmerFrameLayout", "Lcom/tinder/shimmy/ShimmerFrameLayout;", "getShimmerFrameLayout$Tinder_release", "()Lcom/tinder/shimmy/ShimmerFrameLayout;", "setShimmerFrameLayout$Tinder_release", "(Lcom/tinder/shimmy/ShimmerFrameLayout;)V", "unviewedIndicator", "getUnviewedIndicator$Tinder_release", "setUnviewedIndicator$Tinder_release", "bindAvatarView", "", "imageUrls", "", "", "bindMatchAttribution", "matchAttribution", "Lcom/tinder/domain/match/model/Match$Attribution;", "bindView", "matchViewModel", "Lcom/tinder/match/viewmodel/MatchMessageViewModel;", "displayMatchAttribution", "resource", "hideMatchAttribution", "navigateToChat", "match", "Lcom/tinder/domain/match/model/Match;", "onAttachedToWindow", "onDetachedFromWindow", "shouldShimmer", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class MatchMessagesRowView extends FrameLayout implements MatchMessageRowTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9868e f39261a;
    @NotNull
    @BindView(2131361910)
    public AvatarView avatarView;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8406b f39262b;
    @NotNull
    @BindView(2131362904)
    public ImageView goldAttributionBackground;
    @BindDimen(2131166204)
    @JvmField
    public int leftMargin;
    @NotNull
    @BindView(2131362902)
    public ImageView matchAttributionIcon;
    @NotNull
    @BindView(2131362918)
    public RelativeLayout matchRowView;
    @NotNull
    @BindView(2131363712)
    public TextView message;
    @NotNull
    @BindView(2131362977)
    public View mutedIcon;
    @NotNull
    @BindView(2131362981)
    public TextView name;
    @NotNull
    @BindView(2131363455)
    public View replyArrow;
    @NotNull
    @BindView(2131363564)
    public ShimmerFrameLayout shimmerFrameLayout;
    @NotNull
    @BindView(2131363917)
    public View unviewedIndicator;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.views.MatchMessagesRowView$a */
    static final class C9892a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MatchMessagesRowView f32733a;
        /* renamed from: b */
        final /* synthetic */ C12099h f32734b;

        C9892a(MatchMessagesRowView matchMessagesRowView, C12099h c12099h) {
            this.f32733a = matchMessagesRowView;
            this.f32734b = c12099h;
        }

        public final void onClick(View view) {
            this.f32733a.getPresenter$Tinder_release().m40605a(this.f32734b.mo11197f() ^ 1);
            this.f32733a.getPresenter$Tinder_release().m40603a(this.f32734b.mo11196e());
        }
    }

    public MatchMessagesRowView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        ((MatchesListComponentProvider) context).provideMatchesListComponent().inject(this);
        View.inflate(context, R.layout.match_with_message_row, this);
        ButterKnife.a(this);
    }

    @NotNull
    public final C9868e getPresenter$Tinder_release() {
        C9868e c9868e = this.f39261a;
        if (c9868e == null) {
            C2668g.b("presenter");
        }
        return c9868e;
    }

    public final void setPresenter$Tinder_release(@NotNull C9868e c9868e) {
        C2668g.b(c9868e, "<set-?>");
        this.f39261a = c9868e;
    }

    @NotNull
    public final C8406b getChatIntentFactory$Tinder_release() {
        C8406b c8406b = this.f39262b;
        if (c8406b == null) {
            C2668g.b("chatIntentFactory");
        }
        return c8406b;
    }

    public final void setChatIntentFactory$Tinder_release(@NotNull C8406b c8406b) {
        C2668g.b(c8406b, "<set-?>");
        this.f39262b = c8406b;
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
    public final ImageView getGoldAttributionBackground$Tinder_release() {
        ImageView imageView = this.goldAttributionBackground;
        if (imageView == null) {
            C2668g.b("goldAttributionBackground");
        }
        return imageView;
    }

    public final void setGoldAttributionBackground$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.goldAttributionBackground = imageView;
    }

    @NotNull
    public final View getReplyArrow$Tinder_release() {
        View view = this.replyArrow;
        if (view == null) {
            C2668g.b("replyArrow");
        }
        return view;
    }

    public final void setReplyArrow$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.replyArrow = view;
    }

    @NotNull
    public final View getMutedIcon$Tinder_release() {
        View view = this.mutedIcon;
        if (view == null) {
            C2668g.b("mutedIcon");
        }
        return view;
    }

    public final void setMutedIcon$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.mutedIcon = view;
    }

    @NotNull
    public final TextView getMessage$Tinder_release() {
        TextView textView = this.message;
        if (textView == null) {
            C2668g.b("message");
        }
        return textView;
    }

    public final void setMessage$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.message = textView;
    }

    @NotNull
    public final RelativeLayout getMatchRowView$Tinder_release() {
        RelativeLayout relativeLayout = this.matchRowView;
        if (relativeLayout == null) {
            C2668g.b("matchRowView");
        }
        return relativeLayout;
    }

    public final void setMatchRowView$Tinder_release(@NotNull RelativeLayout relativeLayout) {
        C2668g.b(relativeLayout, "<set-?>");
        this.matchRowView = relativeLayout;
    }

    /* renamed from: a */
    public final void m48223a(@NotNull C12099h c12099h) {
        C2668g.b(c12099h, "matchViewModel");
        Attribution c = c12099h.mo11194c();
        C2668g.a(c, "matchViewModel.matchAttribution()");
        m48220a(c);
        List d = c12099h.mo11195d();
        C2668g.a(d, "matchViewModel.imageUrls()");
        m48221a(d);
        TextView textView = this.name;
        if (textView == null) {
            C2668g.b("name");
        }
        textView.setText(c12099h.mo11193b());
        textView = this.message;
        if (textView == null) {
            C2668g.b("message");
        }
        textView.setText(c12099h.mo11200i());
        View view = this.replyArrow;
        if (view == null) {
            C2668g.b("replyArrow");
        }
        int i = 0;
        view.setVisibility(c12099h.mo11199h() ? 8 : 0);
        view = this.mutedIcon;
        if (view == null) {
            C2668g.b("mutedIcon");
        }
        view.setVisibility(c12099h.mo11198g() ? 0 : 8);
        view = this.unviewedIndicator;
        if (view == null) {
            C2668g.b("unviewedIndicator");
        }
        if (c12099h.mo11197f()) {
            i = 8;
        }
        view.setVisibility(i);
        C9868e c9868e = this.f39261a;
        if (c9868e == null) {
            C2668g.b("presenter");
        }
        c9868e.m40606b(c12099h.mo11196e());
        RelativeLayout relativeLayout = this.matchRowView;
        if (relativeLayout == null) {
            C2668g.b("matchRowView");
        }
        relativeLayout.setOnClickListener(new C9892a(this, c12099h));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9868e c9868e = this.f39261a;
        if (c9868e == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c9868e);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void navigateToChat(@NotNull Match match) {
        C2668g.b(match, "match");
        C8406b c8406b = this.f39262b;
        if (c8406b == null) {
            C2668g.b("chatIntentFactory");
        }
        Context context = getContext();
        C2668g.a(context, "context");
        getContext().startActivity(c8406b.m35880a(context, Origin.MESSAGES, match));
    }

    /* renamed from: a */
    private final void m48220a(Attribution attribution) {
        ImageView imageView;
        m48218a();
        C9868e c9868e;
        switch (C9894f.f32737a[attribution.ordinal()]) {
            case 1:
                m48219a((int) R.drawable.ic_boost_matchmessage_attribution);
                break;
            case 2:
            case 3:
                m48219a((int) R.drawable.ic_superlike_matchmessage_attribution);
                break;
            case 4:
                c9868e = this.f39261a;
                if (c9868e == null) {
                    C2668g.b("presenter");
                }
                if (c9868e.m40607b()) {
                    imageView = this.goldAttributionBackground;
                    if (imageView == null) {
                        C2668g.b("goldAttributionBackground");
                    }
                    imageView.setImageResource(R.drawable.ic_fastmatch_background);
                    m48219a((int) R.drawable.ic_fastmatch_foreground);
                    break;
                }
                break;
            case 5:
                c9868e = this.f39261a;
                if (c9868e == null) {
                    C2668g.b("presenter");
                }
                if (c9868e.m40608c()) {
                    imageView = this.goldAttributionBackground;
                    if (imageView == null) {
                        C2668g.b("goldAttributionBackground");
                    }
                    imageView.setImageResource(R.drawable.ic_top_picks_small_background);
                    m48219a((int) R.drawable.ic_top_picks_small_foreground);
                    break;
                }
                break;
            case 6:
                m48219a((int) R.drawable.ic_sponsored_message_attribution);
                break;
            case 7:
                m48219a((int) R.drawable.ic_places_icon);
                break;
            default:
                break;
        }
        attribution = m48222b(attribution);
        ShimmerFrameLayout shimmerFrameLayout = this.shimmerFrameLayout;
        if (shimmerFrameLayout == null) {
            C2668g.b("shimmerFrameLayout");
        }
        shimmerFrameLayout.setEnabled(attribution);
        imageView = this.goldAttributionBackground;
        if (imageView == null) {
            C2668g.b("goldAttributionBackground");
        }
        imageView.setVisibility(attribution != null ? null : 8);
    }

    /* renamed from: b */
    private final boolean m48222b(Attribution attribution) {
        switch (C9894f.f32738b[attribution.ordinal()]) {
            case 1:
            case 2:
                return true;
            default:
                return null;
        }
    }

    /* renamed from: a */
    private final void m48219a(@DrawableRes int i) {
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
    private final void m48218a() {
        ImageView imageView = this.matchAttributionIcon;
        if (imageView == null) {
            C2668g.b("matchAttributionIcon");
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    private final void m48221a(List<String> list) {
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
