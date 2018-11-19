package com.tinder.chat.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindArray;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.analytics.C10540v;
import com.tinder.chat.analytics.C10540v.C8437a;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.presenter.an;
import com.tinder.chat.target.EmptyChatViewTarget;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.match.model.Match;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.utils.as;
import com.tinder.utils.au;
import com.tinder.views.AvatarView;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010o\u001a\u00020pH\u0016J\b\u0010q\u001a\u00020pH\u0016J\b\u0010r\u001a\u00020pH\u0014J\b\u0010s\u001a\u00020pH\u0014J\u001e\u0010t\u001a\u00020p2\u0006\u0010u\u001a\u00020v2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020-0xH\u0016J\u0010\u0010y\u001a\u00020p2\u0006\u0010z\u001a\u00020-H\u0016J\b\u0010{\u001a\u00020pH\u0002J\u0010\u0010|\u001a\u00020p2\u0006\u0010z\u001a\u00020-H\u0016J\u0010\u0010}\u001a\u00020p2\u0006\u0010z\u001a\u00020-H\u0016J\u0010\u0010~\u001a\u00020p2\u0006\u0010z\u001a\u00020-H\u0016J\u0011\u0010\u001a\u00020p2\u0007\u0010\u0001\u001a\u00020-H\u0016J\u0011\u0010\u0001\u001a\u00020p2\u0006\u0010z\u001a\u00020-H\u0016J\t\u0010\u0001\u001a\u00020pH\u0016J\t\u0010\u0001\u001a\u00020pH\u0016J\t\u0010\u0001\u001a\u00020pH\u0002J\u0012\u0010\u0001\u001a\u00020p2\u0007\u0010\u0001\u001a\u00020-H\u0016J\u0011\u0010\u0001\u001a\u00020p2\u0006\u0010z\u001a\u00020-H\u0016J\u0013\u0010\u0001\u001a\u00020p2\b\u0010\u0001\u001a\u00030\u0001H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u00020-8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u001e\u00105\u001a\u00020-8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\u001e\u00108\u001a\u00020-8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010/\"\u0004\b:\u00101R\u001e\u0010;\u001a\u00020<8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0017\"\u0004\bC\u0010\u0019R\u001e\u0010D\u001a\u00020-8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010/\"\u0004\bF\u00101R\u001e\u0010G\u001a\u00020H8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010M\u001a\u00020H8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR\u001e\u0010P\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0017\"\u0004\bR\u0010\u0019R\u001e\u0010S\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0017\"\u0004\bU\u0010\u0019R\u001e\u0010V\u001a\u00020W8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R&\u0010\\\u001a\b\u0012\u0004\u0012\u00020-0]8\u0000@\u0000X.¢\u0006\u0010\n\u0002\u0010b\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001e\u0010c\u001a\u00020'8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010)\"\u0004\be\u0010+R\u001e\u0010f\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0017\"\u0004\bh\u0010\u0019R\u001e\u0010i\u001a\u00020-8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010/\"\u0004\bk\u00101R\u001e\u0010l\u001a\u00020'8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010)\"\u0004\bn\u0010+¨\u0006\u0001"}, d2 = {"Lcom/tinder/chat/view/EmptyChatViewContainer;", "Landroid/widget/LinearLayout;", "Lcom/tinder/chat/target/EmptyChatViewTarget;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "avatar", "Lcom/tinder/views/AvatarView;", "getAvatar$Tinder_release", "()Lcom/tinder/views/AvatarView;", "setAvatar$Tinder_release", "(Lcom/tinder/views/AvatarView;)V", "avatarBackground", "Landroid/view/View;", "getAvatarBackground$Tinder_release", "()Landroid/view/View;", "setAvatarBackground$Tinder_release", "(Landroid/view/View;)V", "boostCircleOverlay", "Landroid/graphics/drawable/Drawable;", "getBoostCircleOverlay$Tinder_release", "()Landroid/graphics/drawable/Drawable;", "setBoostCircleOverlay$Tinder_release", "(Landroid/graphics/drawable/Drawable;)V", "chatAvatarIntentFactory", "Lcom/tinder/chat/view/ChatAvatarIntentFactory;", "getChatAvatarIntentFactory$Tinder_release", "()Lcom/tinder/chat/view/ChatAvatarIntentFactory;", "setChatAvatarIntentFactory$Tinder_release", "(Lcom/tinder/chat/view/ChatAvatarIntentFactory;)V", "chatOpenProfileEventDispatcher", "Lcom/tinder/chat/analytics/ChatOpenProfileEventDispatcher;", "getChatOpenProfileEventDispatcher$Tinder_release", "()Lcom/tinder/chat/analytics/ChatOpenProfileEventDispatcher;", "setChatOpenProfileEventDispatcher$Tinder_release", "(Lcom/tinder/chat/analytics/ChatOpenProfileEventDispatcher;)V", "chatTitle", "Landroid/widget/TextView;", "getChatTitle$Tinder_release", "()Landroid/widget/TextView;", "setChatTitle$Tinder_release", "(Landroid/widget/TextView;)V", "chatTitleBoostCredit", "", "getChatTitleBoostCredit$Tinder_release", "()Ljava/lang/String;", "setChatTitleBoostCredit$Tinder_release", "(Ljava/lang/String;)V", "chatTitleFastMatchCredit", "getChatTitleFastMatchCredit$Tinder_release", "setChatTitleFastMatchCredit$Tinder_release", "chatTitlePrefix", "getChatTitlePrefix$Tinder_release", "setChatTitlePrefix$Tinder_release", "chatTitleTopPicksCredit", "getChatTitleTopPicksCredit$Tinder_release", "setChatTitleTopPicksCredit$Tinder_release", "emptyChatViewPresenter", "Lcom/tinder/chat/presenter/EmptyChatViewPresenter;", "getEmptyChatViewPresenter$Tinder_release", "()Lcom/tinder/chat/presenter/EmptyChatViewPresenter;", "setEmptyChatViewPresenter$Tinder_release", "(Lcom/tinder/chat/presenter/EmptyChatViewPresenter;)V", "goldOverlay", "getGoldOverlay$Tinder_release", "setGoldOverlay$Tinder_release", "iSuperLikeThemText", "getISuperLikeThemText$Tinder_release", "setISuperLikeThemText$Tinder_release", "indicator", "Landroid/widget/ImageView;", "getIndicator$Tinder_release", "()Landroid/widget/ImageView;", "setIndicator$Tinder_release", "(Landroid/widget/ImageView;)V", "indicatorBackground", "getIndicatorBackground$Tinder_release", "setIndicatorBackground$Tinder_release", "placesCircleOverlay", "getPlacesCircleOverlay$Tinder_release", "setPlacesCircleOverlay$Tinder_release", "placesIcon", "getPlacesIcon$Tinder_release", "setPlacesIcon$Tinder_release", "shimmerFrameLayout", "Lcom/tinder/shimmy/ShimmerFrameLayout;", "getShimmerFrameLayout$Tinder_release", "()Lcom/tinder/shimmy/ShimmerFrameLayout;", "setShimmerFrameLayout$Tinder_release", "(Lcom/tinder/shimmy/ShimmerFrameLayout;)V", "suggestionMessages", "", "getSuggestionMessages$Tinder_release", "()[Ljava/lang/String;", "setSuggestionMessages$Tinder_release", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "suggestionText", "getSuggestionText$Tinder_release", "setSuggestionText$Tinder_release", "superlikeCircleOverlay", "getSuperlikeCircleOverlay$Tinder_release", "setSuperlikeCircleOverlay$Tinder_release", "themSuperLikeMeText", "getThemSuperLikeMeText$Tinder_release", "setThemSuperLikeMeText$Tinder_release", "timestamp", "getTimestamp$Tinder_release", "setTimestamp$Tinder_release", "hideSuggestionMessage", "", "hideTimestamp", "onAttachedToWindow", "onDetachedFromWindow", "showAvatar", "match", "Lcom/tinder/domain/match/model/Match;", "urls", "", "showCoreMatchTitle", "name", "showGoldAttribution", "showISuperLikeThem", "showMatchFromBoost", "showMatchFromFastMatch", "showMatchFromPlaces", "placeName", "showMatchFromTopPicks", "showMyGroupTitle", "showSuggestionMessage", "showSuperLikeOverlay", "showTheirGroupTitle", "groupName", "showTheySuperLikeMe", "showTimestamp", "time", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class EmptyChatViewContainer extends LinearLayout implements EmptyChatViewTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public an f34348a;
    @NotNull
    @BindView(2131362392)
    public AvatarView avatar;
    @NotNull
    @BindView(2131362393)
    public View avatarBackground;
    @Inject
    @NotNull
    /* renamed from: b */
    public C8468c f34349b;
    @NotNull
    @BindDrawable(2131231159)
    public Drawable boostCircleOverlay;
    @Inject
    @NotNull
    /* renamed from: c */
    public C10540v f34350c;
    @NotNull
    @BindView(2131362400)
    public TextView chatTitle;
    @BindString(2131822003)
    @NotNull
    public String chatTitleBoostCredit;
    @BindString(2131822004)
    @NotNull
    public String chatTitleFastMatchCredit;
    @BindString(2131821378)
    @NotNull
    public String chatTitlePrefix;
    @BindString(2131822005)
    @NotNull
    public String chatTitleTopPicksCredit;
    @NotNull
    @BindDrawable(2131231155)
    public Drawable goldOverlay;
    @BindString(2131821971)
    @NotNull
    public String iSuperLikeThemText;
    @NotNull
    @BindView(2131362395)
    public ImageView indicator;
    @NotNull
    @BindView(2131362396)
    public ImageView indicatorBackground;
    @NotNull
    @BindDrawable(2131231703)
    public Drawable placesCircleOverlay;
    @NotNull
    @BindDrawable(2131231286)
    public Drawable placesIcon;
    @NotNull
    @BindView(2131362397)
    public ShimmerFrameLayout shimmerFrameLayout;
    @NotNull
    @BindArray(2130903044)
    public String[] suggestionMessages;
    @NotNull
    @BindView(2131362398)
    public TextView suggestionText;
    @NotNull
    @BindDrawable(2131231163)
    public Drawable superlikeCircleOverlay;
    @BindString(2131821972)
    @NotNull
    public String themSuperLikeMeText;
    @NotNull
    @BindView(2131362399)
    public TextView timestamp;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.EmptyChatViewContainer$a */
    static final class C8451a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ EmptyChatViewContainer f30091a;
        /* renamed from: b */
        final /* synthetic */ Match f30092b;

        C8451a(EmptyChatViewContainer emptyChatViewContainer, Match match) {
            this.f30091a = emptyChatViewContainer;
            this.f30092b = match;
        }

        public final void onClick(View view) {
            view = this.f30091a.getContext();
            C8468c chatAvatarIntentFactory$Tinder_release = this.f30091a.getChatAvatarIntentFactory$Tinder_release();
            Context context = this.f30091a.getContext();
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            view.startActivity(chatAvatarIntentFactory$Tinder_release.m36226a((Activity) context, this.f30092b));
            this.f30091a.getChatOpenProfileEventDispatcher$Tinder_release().m42632a(new C8437a(this.f30092b.getId(), "empty chat"));
        }
    }

    public EmptyChatViewContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        View.inflate(context, R.layout.chat_view_empty_container, this);
        ButterKnife.a(this);
        if (isInEditMode() == null) {
            ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        }
    }

    @NotNull
    public final TextView getChatTitle$Tinder_release() {
        TextView textView = this.chatTitle;
        if (textView == null) {
            C2668g.b("chatTitle");
        }
        return textView;
    }

    public final void setChatTitle$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.chatTitle = textView;
    }

    @NotNull
    public final TextView getTimestamp$Tinder_release() {
        TextView textView = this.timestamp;
        if (textView == null) {
            C2668g.b("timestamp");
        }
        return textView;
    }

    public final void setTimestamp$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.timestamp = textView;
    }

    @NotNull
    public final AvatarView getAvatar$Tinder_release() {
        AvatarView avatarView = this.avatar;
        if (avatarView == null) {
            C2668g.b("avatar");
        }
        return avatarView;
    }

    public final void setAvatar$Tinder_release(@NotNull AvatarView avatarView) {
        C2668g.b(avatarView, "<set-?>");
        this.avatar = avatarView;
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
    public final ImageView getIndicatorBackground$Tinder_release() {
        ImageView imageView = this.indicatorBackground;
        if (imageView == null) {
            C2668g.b("indicatorBackground");
        }
        return imageView;
    }

    public final void setIndicatorBackground$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.indicatorBackground = imageView;
    }

    @NotNull
    public final ImageView getIndicator$Tinder_release() {
        ImageView imageView = this.indicator;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        return imageView;
    }

    public final void setIndicator$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.indicator = imageView;
    }

    @NotNull
    public final TextView getSuggestionText$Tinder_release() {
        TextView textView = this.suggestionText;
        if (textView == null) {
            C2668g.b("suggestionText");
        }
        return textView;
    }

    public final void setSuggestionText$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.suggestionText = textView;
    }

    @NotNull
    public final View getAvatarBackground$Tinder_release() {
        View view = this.avatarBackground;
        if (view == null) {
            C2668g.b("avatarBackground");
        }
        return view;
    }

    public final void setAvatarBackground$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.avatarBackground = view;
    }

    @NotNull
    public final String[] getSuggestionMessages$Tinder_release() {
        String[] strArr = this.suggestionMessages;
        if (strArr == null) {
            C2668g.b("suggestionMessages");
        }
        return strArr;
    }

    public final void setSuggestionMessages$Tinder_release(@NotNull String[] strArr) {
        C2668g.b(strArr, "<set-?>");
        this.suggestionMessages = strArr;
    }

    @NotNull
    public final Drawable getBoostCircleOverlay$Tinder_release() {
        Drawable drawable = this.boostCircleOverlay;
        if (drawable == null) {
            C2668g.b("boostCircleOverlay");
        }
        return drawable;
    }

    public final void setBoostCircleOverlay$Tinder_release(@NotNull Drawable drawable) {
        C2668g.b(drawable, "<set-?>");
        this.boostCircleOverlay = drawable;
    }

    @NotNull
    public final Drawable getGoldOverlay$Tinder_release() {
        Drawable drawable = this.goldOverlay;
        if (drawable == null) {
            C2668g.b("goldOverlay");
        }
        return drawable;
    }

    public final void setGoldOverlay$Tinder_release(@NotNull Drawable drawable) {
        C2668g.b(drawable, "<set-?>");
        this.goldOverlay = drawable;
    }

    @NotNull
    public final Drawable getSuperlikeCircleOverlay$Tinder_release() {
        Drawable drawable = this.superlikeCircleOverlay;
        if (drawable == null) {
            C2668g.b("superlikeCircleOverlay");
        }
        return drawable;
    }

    public final void setSuperlikeCircleOverlay$Tinder_release(@NotNull Drawable drawable) {
        C2668g.b(drawable, "<set-?>");
        this.superlikeCircleOverlay = drawable;
    }

    @NotNull
    public final Drawable getPlacesCircleOverlay$Tinder_release() {
        Drawable drawable = this.placesCircleOverlay;
        if (drawable == null) {
            C2668g.b("placesCircleOverlay");
        }
        return drawable;
    }

    public final void setPlacesCircleOverlay$Tinder_release(@NotNull Drawable drawable) {
        C2668g.b(drawable, "<set-?>");
        this.placesCircleOverlay = drawable;
    }

    @NotNull
    public final Drawable getPlacesIcon$Tinder_release() {
        Drawable drawable = this.placesIcon;
        if (drawable == null) {
            C2668g.b("placesIcon");
        }
        return drawable;
    }

    public final void setPlacesIcon$Tinder_release(@NotNull Drawable drawable) {
        C2668g.b(drawable, "<set-?>");
        this.placesIcon = drawable;
    }

    @NotNull
    public final String getChatTitlePrefix$Tinder_release() {
        String str = this.chatTitlePrefix;
        if (str == null) {
            C2668g.b("chatTitlePrefix");
        }
        return str;
    }

    public final void setChatTitlePrefix$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.chatTitlePrefix = str;
    }

    @NotNull
    public final String getISuperLikeThemText$Tinder_release() {
        String str = this.iSuperLikeThemText;
        if (str == null) {
            C2668g.b("iSuperLikeThemText");
        }
        return str;
    }

    public final void setISuperLikeThemText$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.iSuperLikeThemText = str;
    }

    @NotNull
    public final String getThemSuperLikeMeText$Tinder_release() {
        String str = this.themSuperLikeMeText;
        if (str == null) {
            C2668g.b("themSuperLikeMeText");
        }
        return str;
    }

    public final void setThemSuperLikeMeText$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.themSuperLikeMeText = str;
    }

    @NotNull
    public final String getChatTitleBoostCredit$Tinder_release() {
        String str = this.chatTitleBoostCredit;
        if (str == null) {
            C2668g.b("chatTitleBoostCredit");
        }
        return str;
    }

    public final void setChatTitleBoostCredit$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.chatTitleBoostCredit = str;
    }

    @NotNull
    public final String getChatTitleFastMatchCredit$Tinder_release() {
        String str = this.chatTitleFastMatchCredit;
        if (str == null) {
            C2668g.b("chatTitleFastMatchCredit");
        }
        return str;
    }

    public final void setChatTitleFastMatchCredit$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.chatTitleFastMatchCredit = str;
    }

    @NotNull
    public final String getChatTitleTopPicksCredit$Tinder_release() {
        String str = this.chatTitleTopPicksCredit;
        if (str == null) {
            C2668g.b("chatTitleTopPicksCredit");
        }
        return str;
    }

    public final void setChatTitleTopPicksCredit$Tinder_release(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.chatTitleTopPicksCredit = str;
    }

    @NotNull
    public final an getEmptyChatViewPresenter$Tinder_release() {
        an anVar = this.f34348a;
        if (anVar == null) {
            C2668g.b("emptyChatViewPresenter");
        }
        return anVar;
    }

    public final void setEmptyChatViewPresenter$Tinder_release(@NotNull an anVar) {
        C2668g.b(anVar, "<set-?>");
        this.f34348a = anVar;
    }

    @NotNull
    public final C8468c getChatAvatarIntentFactory$Tinder_release() {
        C8468c c8468c = this.f34349b;
        if (c8468c == null) {
            C2668g.b("chatAvatarIntentFactory");
        }
        return c8468c;
    }

    public final void setChatAvatarIntentFactory$Tinder_release(@NotNull C8468c c8468c) {
        C2668g.b(c8468c, "<set-?>");
        this.f34349b = c8468c;
    }

    @NotNull
    public final C10540v getChatOpenProfileEventDispatcher$Tinder_release() {
        C10540v c10540v = this.f34350c;
        if (c10540v == null) {
            C2668g.b("chatOpenProfileEventDispatcher");
        }
        return c10540v;
    }

    public final void setChatOpenProfileEventDispatcher$Tinder_release(@NotNull C10540v c10540v) {
        C2668g.b(c10540v, "<set-?>");
        this.f34350c = c10540v;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        an anVar = this.f34348a;
        if (anVar == null) {
            C2668g.b("emptyChatViewPresenter");
        }
        Deadshot.take(this, anVar);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void showCoreMatchTitle(@NotNull String str) {
        C2668g.b(str, "name");
        TextView textView = this.chatTitle;
        if (textView == null) {
            C2668g.b("chatTitle");
        }
        C15828l c15828l = C15828l.f49033a;
        String str2 = this.chatTitlePrefix;
        if (str2 == null) {
            C2668g.b("chatTitlePrefix");
        }
        Object[] objArr = new Object[]{str};
        str2 = String.format(str2, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str2, "java.lang.String.format(format, *args)");
        as.a(textView, str2, str);
    }

    public void showMyGroupTitle() {
        TextView textView = this.chatTitle;
        if (textView == null) {
            C2668g.b("chatTitle");
        }
        textView.setText(R.string.your_group_chat);
    }

    public void showTheirGroupTitle(@NotNull String str) {
        C2668g.b(str, "groupName");
        TextView textView = this.chatTitle;
        if (textView == null) {
            C2668g.b("chatTitle");
        }
        C15828l c15828l = C15828l.f49033a;
        String str2 = this.chatTitlePrefix;
        if (str2 == null) {
            C2668g.b("chatTitlePrefix");
        }
        Object[] objArr = new Object[]{str};
        str = String.format(str2, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str, "java.lang.String.format(format, *args)");
        textView.setText(str);
    }

    public void showTimestamp(long j) {
        TextView textView = this.timestamp;
        if (textView == null) {
            C2668g.b("timestamp");
        }
        textView.setText(DateUtils.getRelativeTimeSpanString(j));
    }

    public void hideTimestamp() {
        TextView textView = this.timestamp;
        if (textView == null) {
            C2668g.b("timestamp");
        }
        textView.setVisibility(8);
    }

    public void showAvatar(@NotNull Match match, @NotNull List<String> list) {
        C2668g.b(match, "match");
        C2668g.b(list, "urls");
        AvatarView avatarView = this.avatar;
        if (avatarView == null) {
            C2668g.b("avatar");
        }
        avatarView.setAvatars(list);
        list = this.avatar;
        if (list == null) {
            C2668g.b("avatar");
        }
        list.setOnClickListener(new C8451a(this, match));
    }

    public void showSuggestionMessage() {
        String[] strArr = this.suggestionMessages;
        if (strArr == null) {
            C2668g.b("suggestionMessages");
        }
        double random = Math.random();
        String[] strArr2 = this.suggestionMessages;
        if (strArr2 == null) {
            C2668g.b("suggestionMessages");
        }
        String str = strArr[(int) Math.floor(random * ((double) strArr2.length))];
        TextView textView = this.suggestionText;
        if (textView == null) {
            C2668g.b("suggestionText");
        }
        textView.setText(str);
    }

    public void hideSuggestionMessage() {
        TextView textView = this.suggestionText;
        if (textView == null) {
            C2668g.b("suggestionText");
        }
        textView.setVisibility(4);
    }

    public void showMatchFromBoost(@NotNull String str) {
        C2668g.b(str, "name");
        ShimmerFrameLayout shimmerFrameLayout = this.shimmerFrameLayout;
        if (shimmerFrameLayout == null) {
            C2668g.b("shimmerFrameLayout");
        }
        shimmerFrameLayout.setEnabled(false);
        View view = this.avatarBackground;
        if (view == null) {
            C2668g.b("avatarBackground");
        }
        Drawable drawable = this.boostCircleOverlay;
        if (drawable == null) {
            C2668g.b("boostCircleOverlay");
        }
        view.setBackground(drawable);
        ImageView imageView = this.indicator;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setVisibility(0);
        imageView = this.indicator;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setImageResource(R.drawable.ic_boost_empty_chat);
        imageView = this.indicatorBackground;
        if (imageView == null) {
            C2668g.b("indicatorBackground");
        }
        imageView.setVisibility(8);
        TextView textView = this.chatTitle;
        if (textView == null) {
            C2668g.b("chatTitle");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        TextView textView2 = this.chatTitle;
        if (textView2 == null) {
            C2668g.b("chatTitle");
        }
        stringBuilder.append(textView2.getText());
        stringBuilder.append("");
        String str2 = this.chatTitleBoostCredit;
        if (str2 == null) {
            C2668g.b("chatTitleBoostCredit");
        }
        stringBuilder.append(str2);
        as.a(textView, stringBuilder.toString(), str);
    }

    public void showMatchFromFastMatch(@NotNull String str) {
        C2668g.b(str, "name");
        m42658a();
        ImageView imageView = this.indicator;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setImageResource(R.drawable.ic_fastmatch_empty_convo_foreground);
        imageView = this.indicatorBackground;
        if (imageView == null) {
            C2668g.b("indicatorBackground");
        }
        imageView.setImageResource(R.drawable.ic_fastmatch_empty_convo_background);
        TextView textView = this.chatTitle;
        if (textView == null) {
            C2668g.b("chatTitle");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        TextView textView2 = this.chatTitle;
        if (textView2 == null) {
            C2668g.b("chatTitle");
        }
        stringBuilder.append(textView2.getText());
        stringBuilder.append("");
        String str2 = this.chatTitleFastMatchCredit;
        if (str2 == null) {
            C2668g.b("chatTitleFastMatchCredit");
        }
        stringBuilder.append(str2);
        as.a(textView, stringBuilder.toString(), str);
    }

    public void showMatchFromTopPicks(@NotNull String str) {
        C2668g.b(str, "name");
        m42658a();
        ImageView imageView = this.indicator;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setImageResource(R.drawable.ic_top_picks_medium_foreground);
        imageView = this.indicatorBackground;
        if (imageView == null) {
            C2668g.b("indicatorBackground");
        }
        imageView.setImageResource(R.drawable.ic_top_picks_medium_background);
        TextView textView = this.chatTitle;
        if (textView == null) {
            C2668g.b("chatTitle");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        TextView textView2 = this.chatTitle;
        if (textView2 == null) {
            C2668g.b("chatTitle");
        }
        stringBuilder.append(textView2.getText());
        stringBuilder.append("");
        String str2 = this.chatTitleTopPicksCredit;
        if (str2 == null) {
            C2668g.b("chatTitleTopPicksCredit");
        }
        stringBuilder.append(str2);
        as.a(textView, stringBuilder.toString(), str);
    }

    public void showISuperLikeThem(@NotNull String str) {
        C2668g.b(str, "name");
        TextView textView = this.chatTitle;
        if (textView == null) {
            C2668g.b("chatTitle");
        }
        C15828l c15828l = C15828l.f49033a;
        String str2 = this.iSuperLikeThemText;
        if (str2 == null) {
            C2668g.b("iSuperLikeThemText");
        }
        Object[] objArr = new Object[]{str};
        str2 = String.format(str2, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str2, "java.lang.String.format(format, *args)");
        as.a(textView, str2, str);
        m42659b();
    }

    public void showTheySuperLikeMe(@NotNull String str) {
        C2668g.b(str, "name");
        TextView textView = this.chatTitle;
        if (textView == null) {
            C2668g.b("chatTitle");
        }
        C15828l c15828l = C15828l.f49033a;
        String str2 = this.themSuperLikeMeText;
        if (str2 == null) {
            C2668g.b("themSuperLikeMeText");
        }
        Object[] objArr = new Object[]{str};
        str2 = String.format(str2, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(str2, "java.lang.String.format(format, *args)");
        as.a(textView, str2, str);
        m42659b();
    }

    public void showMatchFromPlaces(@NotNull String str) {
        C2668g.b(str, "placeName");
        ShimmerFrameLayout shimmerFrameLayout = this.shimmerFrameLayout;
        if (shimmerFrameLayout == null) {
            C2668g.b("shimmerFrameLayout");
        }
        shimmerFrameLayout.setEnabled(false);
        View view = this.avatarBackground;
        if (view == null) {
            C2668g.b("avatarBackground");
        }
        Drawable drawable = this.placesCircleOverlay;
        if (drawable == null) {
            C2668g.b("placesCircleOverlay");
        }
        view.setBackground(drawable);
        ImageView imageView = this.indicator;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setVisibility(0);
        imageView = this.indicator;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        drawable = this.placesIcon;
        if (drawable == null) {
            C2668g.b("placesIcon");
        }
        imageView.setImageDrawable(drawable);
        imageView = this.indicatorBackground;
        if (imageView == null) {
            C2668g.b("indicatorBackground");
        }
        imageView.setVisibility(8);
        String a = au.a(this, R.string.places_liked_message, new String[]{str});
        TextView textView = this.chatTitle;
        if (textView == null) {
            C2668g.b("chatTitle");
        }
        as.a(textView, a, str);
    }

    /* renamed from: a */
    private final void m42658a() {
        ImageView imageView = this.indicator;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setVisibility(0);
        ShimmerFrameLayout shimmerFrameLayout = this.shimmerFrameLayout;
        if (shimmerFrameLayout == null) {
            C2668g.b("shimmerFrameLayout");
        }
        shimmerFrameLayout.setEnabled(true);
        View view = this.avatarBackground;
        if (view == null) {
            C2668g.b("avatarBackground");
        }
        Drawable drawable = this.goldOverlay;
        if (drawable == null) {
            C2668g.b("goldOverlay");
        }
        view.setBackground(drawable);
        imageView = this.indicatorBackground;
        if (imageView == null) {
            C2668g.b("indicatorBackground");
        }
        imageView.setVisibility(0);
    }

    /* renamed from: b */
    private final void m42659b() {
        ShimmerFrameLayout shimmerFrameLayout = this.shimmerFrameLayout;
        if (shimmerFrameLayout == null) {
            C2668g.b("shimmerFrameLayout");
        }
        shimmerFrameLayout.setEnabled(false);
        View view = this.avatarBackground;
        if (view == null) {
            C2668g.b("avatarBackground");
        }
        Drawable drawable = this.superlikeCircleOverlay;
        if (drawable == null) {
            C2668g.b("superlikeCircleOverlay");
        }
        view.setBackground(drawable);
        ImageView imageView = this.indicator;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setVisibility(0);
        imageView = this.indicator;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setImageResource(R.drawable.new_match_star);
        imageView = this.indicatorBackground;
        if (imageView == null) {
            C2668g.b("indicatorBackground");
        }
        imageView.setVisibility(8);
    }
}
