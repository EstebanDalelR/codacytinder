package com.tinder.profile.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v4.content.C0432b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C1812g;
import com.facebook.rebound.C3442e;
import com.facebook.rebound.C3443i;
import com.tinder.R;
import com.tinder.base.p173c.C8304b;
import com.tinder.base.view.listener.OnPhotoPageChangeListener;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.feed.view.model.C9541g;
import com.tinder.overflow.OverflowReportFeedbackListener;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.Adornment;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.profile.presenter.C14422a;
import com.tinder.profile.view.tappy.TappyProfilePhotosView;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.card.CardSize;
import com.tinder.recs.card.CardSizeProvider;
import com.tinder.recs.view.PagedPhotoViewer.PagedPhotoViewerModel;
import com.tinder.recs.view.PagedPhotoViewer.PhotoDecorator;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.toppicks.view.C18244a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0006­\u0001®\u0001¯\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0001\u001a\u00030\u0001J\n\u0010\u0001\u001a\u00030\u0001H\u0002J4\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0012\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\u001e\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\b2\t\u0010\u0001\u001a\u0004\u0018\u00010>H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J5\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020>0\u00012\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0012\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\n\u0010\u0001\u001a\u00030\u0001H\u0014J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010 \u0001\u001a\u00030\u0001H\u0002J\u0013\u0010¡\u0001\u001a\u00030\u00012\t\u0010¢\u0001\u001a\u0004\u0018\u00010MJ\u0014\u0010£\u0001\u001a\u00030\u00012\n\u0010¢\u0001\u001a\u0005\u0018\u00010¤\u0001J\u0012\u0010¥\u0001\u001a\u00030\u00012\b\u0010¢\u0001\u001a\u00030¦\u0001J\u0014\u0010§\u0001\u001a\u00030\u00012\b\u0010¨\u0001\u001a\u00030\u0001H\u0002J\u001f\u0010©\u0001\u001a\u00030\u00012\u0007\u0010ª\u0001\u001a\u0002012\n\b\u0001\u0010«\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010¬\u0001\u001a\u00030\u00012\u0007\u0010¨\u0001\u001a\u00020&H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0016\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010\fR$\u00102\u001a\u0002012\u0006\u00100\u001a\u000201@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u00106\u001a\u000201X\u000e¢\u0006\u0002\n\u0000R\u001e\u00107\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\n\"\u0004\b9\u0010\fR\u001e\u0010:\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\n\"\u0004\b<\u0010\fR\u001c\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010C\u001a\u00020D8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\n\"\u0004\bK\u0010\fR\u0010\u0010L\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010N\u001a\u00020O8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010T\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\"\"\u0004\bV\u0010$R\u001e\u0010W\u001a\u00020X8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010]\u001a\u00020&2\u0006\u00100\u001a\u00020&@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001e\u0010b\u001a\u00020c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001e\u0010h\u001a\u00020i8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001e\u0010n\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\n\"\u0004\bp\u0010\fR\u001e\u0010q\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010\n\"\u0004\bs\u0010\fR\u001e\u0010t\u001a\u00020u8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0010\u0010z\u001a\u0004\u0018\u00010{X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010|\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0010\"\u0004\b~\u0010\u0012R#\u0010\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u000f\u0010\u0001\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000¨\u0006°\u0001"}, d2 = {"Lcom/tinder/profile/view/BasicInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ageText", "Landroid/widget/TextView;", "getAgeText", "()Landroid/widget/TextView;", "setAgeText", "(Landroid/widget/TextView;)V", "attributionIcon", "Landroid/widget/ImageView;", "getAttributionIcon", "()Landroid/widget/ImageView;", "setAttributionIcon", "(Landroid/widget/ImageView;)V", "badgeImage", "getBadgeImage", "setBadgeImage", "badgeText", "getBadgeText", "setBadgeText", "cardSizeProvider", "Lcom/tinder/recs/card/CardSizeProvider;", "getCardSizeProvider", "()Lcom/tinder/recs/card/CardSizeProvider;", "setCardSizeProvider", "(Lcom/tinder/recs/card/CardSizeProvider;)V", "downArrowBtn", "Landroid/view/View;", "getDownArrowBtn", "()Landroid/view/View;", "setDownArrowBtn", "(Landroid/view/View;)V", "dragYStartPosition", "", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "getFastMatchConfigProvider", "()Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "setFastMatchConfigProvider", "(Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;)V", "genderText", "getGenderText", "setGenderText", "<set-?>", "", "isProfilePhotoViewPagerManuallyScalingDown", "()Z", "setProfilePhotoViewPagerManuallyScalingDown", "(Z)V", "isProfilePhotoViewPagerSizeReseting", "jobText", "getJobText", "setJobText", "locationText", "getLocationText", "setLocationText", "matchId", "", "getMatchId", "()Ljava/lang/String;", "setMatchId", "(Ljava/lang/String;)V", "matchOverflowButton", "Lcom/tinder/profile/view/MatchOverflowButton;", "getMatchOverflowButton", "()Lcom/tinder/profile/view/MatchOverflowButton;", "setMatchOverflowButton", "(Lcom/tinder/profile/view/MatchOverflowButton;)V", "nameText", "getNameText", "setNameText", "onExitClickListener", "Lcom/tinder/profile/view/BasicInfoView$OnExitClickListener;", "photoUrlFactory", "Lcom/tinder/recs/RecsPhotoUrlFactory;", "getPhotoUrlFactory", "()Lcom/tinder/recs/RecsPhotoUrlFactory;", "setPhotoUrlFactory", "(Lcom/tinder/recs/RecsPhotoUrlFactory;)V", "photoViewerContainer", "getPhotoViewerContainer", "setPhotoViewerContainer", "photosView", "Lcom/tinder/profile/view/tappy/TappyProfilePhotosView;", "getPhotosView", "()Lcom/tinder/profile/view/tappy/TappyProfilePhotosView;", "setPhotosView", "(Lcom/tinder/profile/view/tappy/TappyProfilePhotosView;)V", "pixelsToIncreaseViewPagerBy", "getPixelsToIncreaseViewPagerBy", "()F", "setPixelsToIncreaseViewPagerBy", "(F)V", "presenter", "Lcom/tinder/profile/presenter/BasicInfoPresenter;", "getPresenter", "()Lcom/tinder/profile/presenter/BasicInfoPresenter;", "setPresenter", "(Lcom/tinder/profile/presenter/BasicInfoPresenter;)V", "recOverflowButton", "Lcom/tinder/profile/view/RecOverflowButton;", "getRecOverflowButton", "()Lcom/tinder/profile/view/RecOverflowButton;", "setRecOverflowButton", "(Lcom/tinder/profile/view/RecOverflowButton;)V", "school1Text", "getSchool1Text", "setSchool1Text", "school2Text", "getSchool2Text", "setSchool2Text", "shimmerFrameLayout", "Lcom/tinder/shimmy/ShimmerFrameLayout;", "getShimmerFrameLayout", "()Lcom/tinder/shimmy/ShimmerFrameLayout;", "setShimmerFrameLayout", "(Lcom/tinder/shimmy/ShimmerFrameLayout;)V", "spring", "Lcom/facebook/rebound/Spring;", "superLikeImage", "getSuperLikeImage", "setSuperLikeImage", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "getTopPicksConfig", "()Lcom/tinder/domain/config/TopPicksConfig;", "setTopPicksConfig", "(Lcom/tinder/domain/config/TopPicksConfig;)V", "viewPagerCurrentSize", "viewPagerStartSize", "animateArrowDownButton", "", "bindFastMatchAttribution", "bindPhotos", "profile", "Lcom/tinder/profile/model/Profile;", "photoDecorator", "Lcom/tinder/recs/view/PagedPhotoViewer$PhotoDecorator;", "width", "", "height", "bindProfile", "bindTextToView", "textView", "text", "bindTopPicksAttribution", "collectPhotoUrls", "", "photos", "Lcom/tinder/domain/common/model/Photo;", "handleTouchToScaleProfilePhotoViewPager", "ev", "Landroid/view/MotionEvent;", "onDetachedFromWindow", "performArrowDownSpringAnimation", "resetProfilePhotoViewPagerSize", "setOnExitClickListener", "listener", "setOnPhotoPageChangeListener", "Lcom/tinder/base/view/listener/OnPhotoPageChangeListener;", "setOnScrollStateChangedListener", "Lcom/tinder/profile/view/BasicInfoView$OnScrollStateChangeListener;", "setPhotoViewerSize", "newSize", "showGoldAttributionIcon", "shouldShow", "icon", "updateViewPagerSize", "OnExitClickListener", "OnScrollStateChangeListener", "TaggedUserPhotoDecorator", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class BasicInfoView extends LinearLayout {
    @Inject
    @NotNull
    /* renamed from: a */
    public CardSizeProvider f45743a;
    @NotNull
    @BindView(2131363331)
    public TextView ageText;
    @NotNull
    @BindView(2131361898)
    public ImageView attributionIcon;
    @Inject
    @NotNull
    /* renamed from: b */
    public RecsPhotoUrlFactory f45744b;
    @NotNull
    @BindView(2131363943)
    public ImageView badgeImage;
    @NotNull
    @BindView(2131363282)
    public TextView badgeText;
    @Inject
    @NotNull
    /* renamed from: c */
    public FastMatchConfigProvider f45745c;
    @Inject
    @NotNull
    /* renamed from: d */
    public TopPicksConfig f45746d;
    @NotNull
    @BindView(2131363300)
    public View downArrowBtn;
    @Inject
    @NotNull
    /* renamed from: e */
    public C14422a f45747e;
    /* renamed from: f */
    private float f45748f;
    /* renamed from: g */
    private float f45749g;
    @NotNull
    @BindView(2131363293)
    public TextView genderText;
    /* renamed from: h */
    private float f45750h;
    /* renamed from: i */
    private float f45751i;
    /* renamed from: j */
    private boolean f45752j;
    @NotNull
    @BindView(2131363307)
    public TextView jobText;
    /* renamed from: k */
    private boolean f45753k;
    @Nullable
    /* renamed from: l */
    private String f45754l;
    @NotNull
    @BindView(2131363332)
    public TextView locationText;
    /* renamed from: m */
    private OnExitClickListener f45755m;
    @NotNull
    @BindView(2131363747)
    public MatchOverflowButton matchOverflowButton;
    /* renamed from: n */
    private C1811f f45756n;
    @NotNull
    @BindView(2131363333)
    public TextView nameText;
    @NotNull
    @BindView(2131363193)
    public View photoViewerContainer;
    @NotNull
    @BindView(2131363192)
    public TappyProfilePhotosView photosView;
    @NotNull
    @BindView(2131363746)
    public RecOverflowButton recOverflowButton;
    @NotNull
    @BindView(2131363314)
    public TextView school1Text;
    @NotNull
    @BindView(2131363315)
    public TextView school2Text;
    @NotNull
    @BindView(2131363564)
    public ShimmerFrameLayout shimmerFrameLayout;
    @NotNull
    @BindView(2131362710)
    public ImageView superLikeImage;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/profile/view/BasicInfoView$OnExitClickListener;", "", "onExitViewClick", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface OnExitClickListener {
        void onExitViewClick();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/profile/view/BasicInfoView$OnScrollStateChangeListener;", "", "onScrollStateChanged", "", "isScrolling", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface OnScrollStateChangeListener {
        void onScrollStateChanged(boolean z);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/base/extension/ViewExtKt$doWhenViewHasSize$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "onPreDraw", "", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.BasicInfoView$a */
    public static final class C14436a implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ View f45735a;
        /* renamed from: b */
        final /* synthetic */ BasicInfoView f45736b;

        public C14436a(View view, BasicInfoView basicInfoView) {
            this.f45735a = view;
            this.f45736b = basicInfoView;
        }

        public boolean onPreDraw() {
            if (!C8304b.b(this.f45735a)) {
                return true;
            }
            this.f45735a.getViewTreeObserver().removeOnPreDrawListener(this);
            View view = this.f45735a;
            this.f45736b.f45750h = (float) this.f45736b.getPhotosView().getHeight();
            return false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.BasicInfoView$c */
    static final class C14437c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ BasicInfoView f45737a;

        C14437c(BasicInfoView basicInfoView) {
            this.f45737a = basicInfoView;
        }

        public final void run() {
            this.f45737a.m55126c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/profile/view/BasicInfoView$bindProfile$3", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/tinder/profile/view/BasicInfoView;Lcom/tinder/profile/model/Profile;Lcom/tinder/recs/view/PagedPhotoViewer$PhotoDecorator;)V", "onGlobalLayout", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.BasicInfoView$d */
    public static final class C14438d implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ BasicInfoView f45738a;
        /* renamed from: b */
        final /* synthetic */ Profile f45739b;
        /* renamed from: c */
        final /* synthetic */ PhotoDecorator f45740c;

        C14438d(BasicInfoView basicInfoView, Profile profile, PhotoDecorator photoDecorator) {
            this.f45738a = basicInfoView;
            this.f45739b = profile;
            this.f45740c = photoDecorator;
        }

        public void onGlobalLayout() {
            this.f45738a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View rootView = this.f45738a.getRootView();
            C2668g.a(rootView, "rootView");
            int width = rootView.getWidth() * 2;
            this.f45738a.m55117a(this.f45739b, this.f45740c, width, width);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.BasicInfoView$h */
    static final class C14439h implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ BasicInfoView f45741a;

        C14439h(BasicInfoView basicInfoView) {
            this.f45741a = basicInfoView;
        }

        public final void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
            C2668g.b(valueAnimator, "animation");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            this.f45741a.setPhotoViewerSize(((Integer) valueAnimator).intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/profile/view/BasicInfoView$resetProfilePhotoViewPagerSize$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/profile/view/BasicInfoView;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.BasicInfoView$i */
    public static final class C14440i extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ BasicInfoView f45742a;

        C14440i(BasicInfoView basicInfoView) {
            this.f45742a = basicInfoView;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            super.onAnimationEnd(animator);
            this.f45742a.f45752j = false;
            this.f45742a.f45753k = false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/profile/view/BasicInfoView$TaggedUserPhotoDecorator;", "Lcom/tinder/recs/view/PagedPhotoViewer$PhotoDecorator;", "(Lcom/tinder/profile/view/BasicInfoView;)V", "transformer", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "context", "Landroid/content/Context;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.BasicInfoView$b */
    private final class C16134b implements PhotoDecorator {
        /* renamed from: a */
        final /* synthetic */ BasicInfoView f50200a;

        public C16134b(BasicInfoView basicInfoView) {
            this.f50200a = basicInfoView;
        }

        @NotNull
        public C3082c transformer(@NotNull Context context) {
            C2668g.b(context, "context");
            return new C18244a(context);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/profile/view/BasicInfoView$bindProfile$4", "Lcom/tinder/overflow/OverflowReportFeedbackListener;", "(Lcom/tinder/profile/view/BasicInfoView;Ljava/lang/String;)V", "onReportFeedbackProvided", "", "feedbackInfo", "Lcom/tinder/feed/view/model/FeedbackInfo;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.BasicInfoView$e */
    public static final class C16135e implements OverflowReportFeedbackListener {
        /* renamed from: a */
        final /* synthetic */ BasicInfoView f50201a;
        /* renamed from: b */
        final /* synthetic */ String f50202b;

        C16135e(BasicInfoView basicInfoView, String str) {
            this.f50201a = basicInfoView;
            this.f50202b = str;
        }

        public void onReportFeedbackProvided(@NotNull C9541g c9541g) {
            C2668g.b(c9541g, "feedbackInfo");
            this.f50201a.getPresenter().m54971a(this.f50202b, (String) null, c9541g);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/profile/view/BasicInfoView$bindProfile$5", "Lcom/tinder/overflow/OverflowReportFeedbackListener;", "(Lcom/tinder/profile/view/BasicInfoView;Lcom/tinder/profile/model/Profile;)V", "onReportFeedbackProvided", "", "feedbackInfo", "Lcom/tinder/feed/view/model/FeedbackInfo;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.BasicInfoView$f */
    public static final class C16136f implements OverflowReportFeedbackListener {
        /* renamed from: a */
        final /* synthetic */ BasicInfoView f50203a;
        /* renamed from: b */
        final /* synthetic */ Profile f50204b;

        C16136f(BasicInfoView basicInfoView, Profile profile) {
            this.f50203a = basicInfoView;
            this.f50204b = profile;
        }

        public void onReportFeedbackProvided(@NotNull C9541g c9541g) {
            C2668g.b(c9541g, "feedbackInfo");
            this.f50203a.getPresenter().m54971a((String) null, this.f50204b.mo11651a(), c9541g);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/tinder/profile/view/BasicInfoView$performArrowDownSpringAnimation$1$1", "Lcom/facebook/rebound/SimpleSpringListener;", "(Lcom/tinder/profile/view/BasicInfoView$performArrowDownSpringAnimation$1;)V", "onSpringAtRest", "", "spring", "Lcom/facebook/rebound/Spring;", "onSpringUpdate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.BasicInfoView$g */
    public static final class C17769g extends C3442e {
        /* renamed from: a */
        final /* synthetic */ BasicInfoView f55450a;
        /* renamed from: b */
        final /* synthetic */ C1812g f55451b;

        C17769g(BasicInfoView basicInfoView, C1812g c1812g) {
            this.f55450a = basicInfoView;
            this.f55451b = c1812g;
        }

        public void onSpringUpdate(@NotNull C1811f c1811f) {
            C2668g.b(c1811f, "spring");
            this.f55450a.getDownArrowBtn().setTranslationY((float) c1811f.c());
        }

        public void onSpringAtRest(@NotNull C1811f c1811f) {
            C2668g.b(c1811f, "spring");
            super.onSpringAtRest(c1811f);
            c1811f.a();
            this.f55450a.getDownArrowBtn().setTranslationY(0.0f);
        }
    }

    public BasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (isInEditMode() == null) {
            attributeSet = C14398a.m54830a(context);
            if (attributeSet == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.profile.module.ProfileComponentProvider");
            }
            ((ProfileComponentProvider) attributeSet).provideComponent().inject(this);
        }
        View.inflate(context, R.layout.view_basic_info, this);
        setOrientation(1);
        ButterKnife.a(this);
        context = this.photosView;
        if (context == null) {
            C2668g.b("photosView");
        }
        if (context == null) {
            throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
        }
        if (C8304b.b(this) != null) {
            this.f45750h = (float) getPhotosView().getHeight();
        } else {
            getViewTreeObserver().addOnPreDrawListener((OnPreDrawListener) new C14436a(this, this));
        }
        context = this.downArrowBtn;
        if (context == null) {
            C2668g.b("downArrowBtn");
        }
        context.setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                if (this.f45755m == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                view = this.f45755m;
                if (view != null) {
                    view.onExitViewClick();
                }
            }
        });
    }

    @NotNull
    public final CardSizeProvider getCardSizeProvider() {
        CardSizeProvider cardSizeProvider = this.f45743a;
        if (cardSizeProvider == null) {
            C2668g.b("cardSizeProvider");
        }
        return cardSizeProvider;
    }

    public final void setCardSizeProvider(@NotNull CardSizeProvider cardSizeProvider) {
        C2668g.b(cardSizeProvider, "<set-?>");
        this.f45743a = cardSizeProvider;
    }

    @NotNull
    public final RecsPhotoUrlFactory getPhotoUrlFactory() {
        RecsPhotoUrlFactory recsPhotoUrlFactory = this.f45744b;
        if (recsPhotoUrlFactory == null) {
            C2668g.b("photoUrlFactory");
        }
        return recsPhotoUrlFactory;
    }

    public final void setPhotoUrlFactory(@NotNull RecsPhotoUrlFactory recsPhotoUrlFactory) {
        C2668g.b(recsPhotoUrlFactory, "<set-?>");
        this.f45744b = recsPhotoUrlFactory;
    }

    @NotNull
    public final FastMatchConfigProvider getFastMatchConfigProvider() {
        FastMatchConfigProvider fastMatchConfigProvider = this.f45745c;
        if (fastMatchConfigProvider == null) {
            C2668g.b("fastMatchConfigProvider");
        }
        return fastMatchConfigProvider;
    }

    public final void setFastMatchConfigProvider(@NotNull FastMatchConfigProvider fastMatchConfigProvider) {
        C2668g.b(fastMatchConfigProvider, "<set-?>");
        this.f45745c = fastMatchConfigProvider;
    }

    @NotNull
    public final TopPicksConfig getTopPicksConfig() {
        TopPicksConfig topPicksConfig = this.f45746d;
        if (topPicksConfig == null) {
            C2668g.b("topPicksConfig");
        }
        return topPicksConfig;
    }

    public final void setTopPicksConfig(@NotNull TopPicksConfig topPicksConfig) {
        C2668g.b(topPicksConfig, "<set-?>");
        this.f45746d = topPicksConfig;
    }

    @NotNull
    public final C14422a getPresenter() {
        C14422a c14422a = this.f45747e;
        if (c14422a == null) {
            C2668g.b("presenter");
        }
        return c14422a;
    }

    public final void setPresenter(@NotNull C14422a c14422a) {
        C2668g.b(c14422a, "<set-?>");
        this.f45747e = c14422a;
    }

    @NotNull
    public final ImageView getSuperLikeImage() {
        ImageView imageView = this.superLikeImage;
        if (imageView == null) {
            C2668g.b("superLikeImage");
        }
        return imageView;
    }

    public final void setSuperLikeImage(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.superLikeImage = imageView;
    }

    @NotNull
    public final TextView getNameText() {
        TextView textView = this.nameText;
        if (textView == null) {
            C2668g.b("nameText");
        }
        return textView;
    }

    public final void setNameText(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.nameText = textView;
    }

    @NotNull
    public final TextView getAgeText() {
        TextView textView = this.ageText;
        if (textView == null) {
            C2668g.b("ageText");
        }
        return textView;
    }

    public final void setAgeText(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.ageText = textView;
    }

    @NotNull
    public final ImageView getBadgeImage() {
        ImageView imageView = this.badgeImage;
        if (imageView == null) {
            C2668g.b("badgeImage");
        }
        return imageView;
    }

    public final void setBadgeImage(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.badgeImage = imageView;
    }

    @NotNull
    public final ShimmerFrameLayout getShimmerFrameLayout() {
        ShimmerFrameLayout shimmerFrameLayout = this.shimmerFrameLayout;
        if (shimmerFrameLayout == null) {
            C2668g.b("shimmerFrameLayout");
        }
        return shimmerFrameLayout;
    }

    public final void setShimmerFrameLayout(@NotNull ShimmerFrameLayout shimmerFrameLayout) {
        C2668g.b(shimmerFrameLayout, "<set-?>");
        this.shimmerFrameLayout = shimmerFrameLayout;
    }

    @NotNull
    public final ImageView getAttributionIcon() {
        ImageView imageView = this.attributionIcon;
        if (imageView == null) {
            C2668g.b("attributionIcon");
        }
        return imageView;
    }

    public final void setAttributionIcon(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.attributionIcon = imageView;
    }

    @NotNull
    public final TextView getBadgeText() {
        TextView textView = this.badgeText;
        if (textView == null) {
            C2668g.b("badgeText");
        }
        return textView;
    }

    public final void setBadgeText(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.badgeText = textView;
    }

    @NotNull
    public final TextView getJobText() {
        TextView textView = this.jobText;
        if (textView == null) {
            C2668g.b("jobText");
        }
        return textView;
    }

    public final void setJobText(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.jobText = textView;
    }

    @NotNull
    public final TextView getSchool1Text() {
        TextView textView = this.school1Text;
        if (textView == null) {
            C2668g.b("school1Text");
        }
        return textView;
    }

    public final void setSchool1Text(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.school1Text = textView;
    }

    @NotNull
    public final TextView getSchool2Text() {
        TextView textView = this.school2Text;
        if (textView == null) {
            C2668g.b("school2Text");
        }
        return textView;
    }

    public final void setSchool2Text(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.school2Text = textView;
    }

    @NotNull
    public final TextView getGenderText() {
        TextView textView = this.genderText;
        if (textView == null) {
            C2668g.b("genderText");
        }
        return textView;
    }

    public final void setGenderText(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.genderText = textView;
    }

    @NotNull
    public final TextView getLocationText() {
        TextView textView = this.locationText;
        if (textView == null) {
            C2668g.b("locationText");
        }
        return textView;
    }

    public final void setLocationText(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.locationText = textView;
    }

    @NotNull
    public final View getPhotoViewerContainer() {
        View view = this.photoViewerContainer;
        if (view == null) {
            C2668g.b("photoViewerContainer");
        }
        return view;
    }

    public final void setPhotoViewerContainer(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.photoViewerContainer = view;
    }

    @NotNull
    public final TappyProfilePhotosView getPhotosView() {
        TappyProfilePhotosView tappyProfilePhotosView = this.photosView;
        if (tappyProfilePhotosView == null) {
            C2668g.b("photosView");
        }
        return tappyProfilePhotosView;
    }

    public final void setPhotosView(@NotNull TappyProfilePhotosView tappyProfilePhotosView) {
        C2668g.b(tappyProfilePhotosView, "<set-?>");
        this.photosView = tappyProfilePhotosView;
    }

    @NotNull
    public final RecOverflowButton getRecOverflowButton() {
        RecOverflowButton recOverflowButton = this.recOverflowButton;
        if (recOverflowButton == null) {
            C2668g.b("recOverflowButton");
        }
        return recOverflowButton;
    }

    public final void setRecOverflowButton(@NotNull RecOverflowButton recOverflowButton) {
        C2668g.b(recOverflowButton, "<set-?>");
        this.recOverflowButton = recOverflowButton;
    }

    @NotNull
    public final MatchOverflowButton getMatchOverflowButton() {
        MatchOverflowButton matchOverflowButton = this.matchOverflowButton;
        if (matchOverflowButton == null) {
            C2668g.b("matchOverflowButton");
        }
        return matchOverflowButton;
    }

    public final void setMatchOverflowButton(@NotNull MatchOverflowButton matchOverflowButton) {
        C2668g.b(matchOverflowButton, "<set-?>");
        this.matchOverflowButton = matchOverflowButton;
    }

    @NotNull
    public final View getDownArrowBtn() {
        View view = this.downArrowBtn;
        if (view == null) {
            C2668g.b("downArrowBtn");
        }
        return view;
    }

    public final void setDownArrowBtn(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.downArrowBtn = view;
    }

    private final void setPixelsToIncreaseViewPagerBy(float f) {
        this.f45751i = f;
    }

    public final float getPixelsToIncreaseViewPagerBy() {
        return this.f45751i;
    }

    private final void setProfilePhotoViewPagerManuallyScalingDown(boolean z) {
        this.f45753k = z;
    }

    /* renamed from: a */
    public final boolean m55132a() {
        return this.f45753k;
    }

    @Nullable
    public final String getMatchId() {
        return this.f45754l;
    }

    public final void setMatchId(@Nullable String str) {
        this.f45754l = str;
    }

    /* renamed from: a */
    public final void m55131a(@NotNull Profile profile) {
        MatchOverflowButton matchOverflowButton;
        RecOverflowButton recOverflowButton;
        String str;
        MatchOverflowButton matchOverflowButton2;
        C2668g.b(profile, "profile");
        TextView textView = this.nameText;
        if (textView == null) {
            C2668g.b("nameText");
        }
        m55116a(textView, profile.mo11652b());
        textView = this.ageText;
        if (textView == null) {
            C2668g.b("ageText");
        }
        m55116a(textView, profile.mo11663m());
        textView = this.badgeText;
        if (textView == null) {
            C2668g.b("badgeText");
        }
        m55116a(textView, profile.mo11658h());
        textView = this.jobText;
        if (textView == null) {
            C2668g.b("jobText");
        }
        m55116a(textView, profile.mo11666p());
        textView = this.school1Text;
        if (textView == null) {
            C2668g.b("school1Text");
        }
        m55116a(textView, profile.mo11667q());
        textView = this.school2Text;
        if (textView == null) {
            C2668g.b("school2Text");
        }
        m55116a(textView, profile.mo11668r());
        textView = this.genderText;
        if (textView == null) {
            C2668g.b("genderText");
        }
        m55116a(textView, profile.mo11655e());
        textView = this.locationText;
        if (textView == null) {
            C2668g.b("locationText");
        }
        m55116a(textView, profile.mo11664n());
        boolean contains = profile.mo11661k().contains(Adornment.TOP_PICKS);
        boolean contains2 = profile.mo11661k().contains(Adornment.FAST_MATCH);
        if (contains) {
            m55129f();
        } else if (profile.mo11647B()) {
            ImageView imageView;
            imageView = this.superLikeImage;
            if (imageView == null) {
                C2668g.b("superLikeImage");
            }
            imageView.setVisibility(0);
        } else if (contains2) {
            m55128e();
        }
        Integer i = profile.mo11659i();
        if (i != null) {
            ImageView imageView2 = this.badgeImage;
            if (imageView2 == null) {
                C2668g.b("badgeImage");
            }
            Context context = getContext();
            C2668g.a(i, "it");
            imageView2.setImageDrawable(C0432b.a(context, i.intValue()));
        } else {
            imageView = this.badgeImage;
            if (imageView == null) {
                C2668g.b("badgeImage");
            }
            imageView.setVisibility(8);
        }
        PhotoDecorator c16134b = C2668g.a(profile.mo11648C(), Boolean.valueOf(true)) ? new C16134b(this) : null;
        CardSizeProvider cardSizeProvider = this.f45743a;
        if (cardSizeProvider == null) {
            C2668g.b("cardSizeProvider");
        }
        CardSize cardSize = cardSizeProvider.cardSize();
        if (cardSize != null) {
            if (!profile.mo11661k().contains(Adornment.GROUP)) {
                m55117a(profile, c16134b, cardSize.getWidth(), cardSize.getHeight());
                if (C14449b.f45793a[profile.mo11660j().ordinal()] == 1) {
                    matchOverflowButton = this.matchOverflowButton;
                    if (matchOverflowButton == null) {
                        C2668g.b("matchOverflowButton");
                    }
                    matchOverflowButton.setVisibility(8);
                    recOverflowButton = this.recOverflowButton;
                    if (recOverflowButton == null) {
                        C2668g.b("recOverflowButton");
                    }
                    recOverflowButton.setVisibility(0);
                    recOverflowButton = this.recOverflowButton;
                    if (recOverflowButton == null) {
                        C2668g.b("recOverflowButton");
                    }
                    recOverflowButton.m61048a(profile, new C16136f(this, profile));
                } else {
                    recOverflowButton = this.recOverflowButton;
                    if (recOverflowButton == null) {
                        C2668g.b("recOverflowButton");
                    }
                    recOverflowButton.setVisibility(8);
                    matchOverflowButton = this.matchOverflowButton;
                    if (matchOverflowButton == null) {
                        C2668g.b("matchOverflowButton");
                    }
                    matchOverflowButton.setVisibility(0);
                    str = this.f45754l != null ? "" : this.f45754l;
                    matchOverflowButton2 = this.matchOverflowButton;
                    if (matchOverflowButton2 == null) {
                        C2668g.b("matchOverflowButton");
                    }
                    if (str == null) {
                        C2668g.a();
                    }
                    matchOverflowButton2.m61014a(profile, str, new C16135e(this, str));
                }
                if (profile.mo11646A() == null) {
                    profile = this.recOverflowButton;
                    if (profile == null) {
                        C2668g.b("recOverflowButton");
                    }
                    profile.setVisibility(8);
                }
            }
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new C14438d(this, profile, c16134b));
        if (C14449b.f45793a[profile.mo11660j().ordinal()] == 1) {
            recOverflowButton = this.recOverflowButton;
            if (recOverflowButton == null) {
                C2668g.b("recOverflowButton");
            }
            recOverflowButton.setVisibility(8);
            matchOverflowButton = this.matchOverflowButton;
            if (matchOverflowButton == null) {
                C2668g.b("matchOverflowButton");
            }
            matchOverflowButton.setVisibility(0);
            if (this.f45754l != null) {
            }
            matchOverflowButton2 = this.matchOverflowButton;
            if (matchOverflowButton2 == null) {
                C2668g.b("matchOverflowButton");
            }
            if (str == null) {
                C2668g.a();
            }
            matchOverflowButton2.m61014a(profile, str, new C16135e(this, str));
        } else {
            matchOverflowButton = this.matchOverflowButton;
            if (matchOverflowButton == null) {
                C2668g.b("matchOverflowButton");
            }
            matchOverflowButton.setVisibility(8);
            recOverflowButton = this.recOverflowButton;
            if (recOverflowButton == null) {
                C2668g.b("recOverflowButton");
            }
            recOverflowButton.setVisibility(0);
            recOverflowButton = this.recOverflowButton;
            if (recOverflowButton == null) {
                C2668g.b("recOverflowButton");
            }
            recOverflowButton.m61048a(profile, new C16136f(this, profile));
        }
        if (profile.mo11646A() == null) {
            profile = this.recOverflowButton;
            if (profile == null) {
                C2668g.b("recOverflowButton");
            }
            profile.setVisibility(8);
        }
    }

    /* renamed from: a */
    private final void m55117a(Profile profile, PhotoDecorator photoDecorator, int i, int i2) {
        String a = profile.mo11651a();
        List f = profile.mo11656f();
        C2668g.a(f, "profile.photos()");
        PagedPhotoViewerModel pagedPhotoViewerModel = new PagedPhotoViewerModel(a, m55114a(f, i, i2), profile.mo11657g(), photoDecorator);
        profile = this.photosView;
        if (profile == null) {
            C2668g.b("photosView");
        }
        profile.bind(pagedPhotoViewerModel);
    }

    public final void setOnScrollStateChangedListener(@NotNull OnScrollStateChangeListener onScrollStateChangeListener) {
        C2668g.b(onScrollStateChangeListener, "listener");
        TappyProfilePhotosView tappyProfilePhotosView = this.photosView;
        if (tappyProfilePhotosView == null) {
            C2668g.b("photosView");
        }
        tappyProfilePhotosView.setOnScrollStateChangeListener(onScrollStateChangeListener);
    }

    public final void setOnPhotoPageChangeListener(@Nullable OnPhotoPageChangeListener onPhotoPageChangeListener) {
        TappyProfilePhotosView tappyProfilePhotosView = this.photosView;
        if (tappyProfilePhotosView == null) {
            C2668g.b("photosView");
        }
        tappyProfilePhotosView.setOnPhotoPageChangeListener(onPhotoPageChangeListener);
    }

    public final void setOnExitClickListener(@Nullable OnExitClickListener onExitClickListener) {
        this.f45755m = onExitClickListener;
    }

    /* renamed from: a */
    private final List<String> m55114a(List<? extends Photo> list, int i, int i2) {
        Iterable<Photo> d = C19299w.m68820d((Iterable) list, 6);
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) d, 10));
        for (Photo photo : d) {
            RecsPhotoUrlFactory recsPhotoUrlFactory = this.f45744b;
            if (recsPhotoUrlFactory == null) {
                C2668g.b("photoUrlFactory");
            }
            arrayList.add(recsPhotoUrlFactory.createUrl(photo, i, i2));
        }
        return C19299w.m68840l((List) arrayList);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m55115a(this.f45750h);
        C1811f c1811f = this.f45756n;
        if (c1811f != null) {
            c1811f.a();
            this.f45756n = (C1811f) null;
        }
    }

    /* renamed from: a */
    public final void m55130a(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "ev");
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f45752j) {
            if (actionMasked == 0) {
                this.f45749g = motionEvent.getRawY();
            }
            if (actionMasked == 2) {
                this.f45751i = (motionEvent.getRawY() - this.f45749g) / ((float) 3);
                if (this.f45751i >= ((float) null)) {
                    this.f45748f = this.f45750h + this.f45751i;
                    m55115a(this.f45748f);
                } else {
                    this.f45753k = false;
                }
            }
            if (actionMasked == 1 && motionEvent.getRawY() - this.f45749g > ((float) null)) {
                m55127d();
            }
        }
    }

    /* renamed from: b */
    public final void m55133b() {
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.profile_view_transition_button_animator);
        if (loadAnimator == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.animation.AnimatorSet");
        }
        AnimatorSet animatorSet = (AnimatorSet) loadAnimator;
        View view = this.downArrowBtn;
        if (view == null) {
            C2668g.b("downArrowBtn");
        }
        animatorSet.setTarget(view);
        animatorSet.start();
        View view2 = this.downArrowBtn;
        if (view2 == null) {
            C2668g.b("downArrowBtn");
        }
        view2.postDelayed(new C14437c(this), 100);
    }

    /* renamed from: c */
    private final void m55126c() {
        C3443i c = C3443i.c();
        C1812g a = C1812g.a(60.0d, 5.0d);
        C1811f b = c.b();
        C2668g.a(b, "it");
        b.a(a);
        View view = this.downArrowBtn;
        if (view == null) {
            C2668g.b("downArrowBtn");
        }
        b.a((double) ((float) (view.getHeight() / 2)));
        b.b(0.0d);
        b.a(new C17769g(this, a));
        this.f45756n = b;
    }

    /* renamed from: a */
    private final void m55115a(float f) {
        TappyProfilePhotosView tappyProfilePhotosView = this.photosView;
        if (tappyProfilePhotosView == null) {
            C2668g.b("photosView");
        }
        this.f45753k = f < ((float) tappyProfilePhotosView.getHeight());
        setPhotoViewerSize((int) f);
    }

    /* renamed from: d */
    private final void m55127d() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) this.f45748f, (int) this.f45750h});
        C2668g.a(ofInt, "animator");
        ofInt.setDuration((long) 100);
        ofInt.addUpdateListener(new C14439h(this));
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addListener(new C14440i(this));
        this.f45752j = true;
        ofInt.start();
    }

    /* renamed from: a */
    private final void m55116a(TextView textView, String str) {
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }

    private final void setPhotoViewerSize(int i) {
        TappyProfilePhotosView tappyProfilePhotosView = this.photosView;
        if (tappyProfilePhotosView == null) {
            C2668g.b("photosView");
        }
        LayoutParams layoutParams = tappyProfilePhotosView.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i;
        i = this.photosView;
        if (i == 0) {
            C2668g.b("photosView");
        }
        i.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    private final void m55128e() {
        FastMatchConfigProvider fastMatchConfigProvider = this.f45745c;
        if (fastMatchConfigProvider == null) {
            C2668g.b("fastMatchConfigProvider");
        }
        m55123a(fastMatchConfigProvider.get().isEnabled(), (int) R.drawable.ic_fastmatch_foreground);
    }

    /* renamed from: f */
    private final void m55129f() {
        TopPicksConfig topPicksConfig = this.f45746d;
        if (topPicksConfig == null) {
            C2668g.b("topPicksConfig");
        }
        m55123a(topPicksConfig.isEnabled(), (int) R.drawable.ic_top_picks_small_foreground);
    }

    /* renamed from: a */
    private final void m55123a(boolean z, @DrawableRes int i) {
        if (z) {
            z = this.shimmerFrameLayout;
            if (!z) {
                C2668g.b("shimmerFrameLayout");
            }
            z.setVisibility(0);
            z = this.attributionIcon;
            if (!z) {
                C2668g.b("attributionIcon");
            }
            z.setVisibility(0);
            z = this.attributionIcon;
            if (!z) {
                C2668g.b("attributionIcon");
            }
            z.setImageDrawable(C0432b.a(getContext(), i));
            return;
        }
        z = this.shimmerFrameLayout;
        if (!z) {
            C2668g.b("shimmerFrameLayout");
        }
        z.setVisibility(8);
        z = this.attributionIcon;
        if (!z) {
            C2668g.b("attributionIcon");
        }
        z.setVisibility(8);
    }
}
