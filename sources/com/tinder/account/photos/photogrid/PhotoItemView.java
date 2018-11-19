package com.tinder.account.photos.photogrid;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tinder.account.C2612a.C2604a;
import com.tinder.account.C2612a.C2606c;
import com.tinder.account.C2612a.C2607d;
import com.tinder.account.C2612a.C2608e;
import com.tinder.base.view.ProgressImageView;
import com.tinder.model.analytics.AnalyticsConstants;
import com.tinder.utils.au;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J0\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020/H\u0002J<\u00100\u001a\u00020)2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020)08J*\u00109\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001022\f\u00107\u001a\b\u0012\u0004\u0012\u00020)08H\u0002J\u0012\u0010:\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u000102H\u0002J$\u0010;\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00106\u001a\u00020/H\u0002J\b\u0010<\u001a\u00020)H\u0002J\b\u0010=\u001a\u00020)H\u0014J\u0006\u0010>\u001a\u00020)J\u0006\u0010?\u001a\u00020)J\u0018\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u0002052\u0006\u0010B\u001a\u000205H\u0014J\u0012\u0010C\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0010\u0010D\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u000102R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0010\u0010\nR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b'\u0010\f\u001a\u0004\b&\u0010#¨\u0006E"}, d2 = {"Lcom/tinder/account/photos/photogrid/PhotoItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "button", "Landroid/support/v7/widget/CardView;", "getButton", "()Landroid/support/v7/widget/CardView;", "button$delegate", "Lkotlin/Lazy;", "buttonElevation", "", "cardView", "getCardView", "cardView$delegate", "elevationAnimatorSet", "Landroid/animation/AnimatorSet;", "progressImageView", "Lcom/tinder/base/view/ProgressImageView;", "getProgressImageView", "()Lcom/tinder/base/view/ProgressImageView;", "progressImageView$delegate", "progressbar", "Landroid/widget/ProgressBar;", "getProgressbar", "()Landroid/widget/ProgressBar;", "progressbar$delegate", "restingElevation", "selectedElevation", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView$delegate", "topPhotoBanner", "getTopPhotoBanner", "topPhotoBanner$delegate", "animate", "", "fromElevation", "toElevation", "buttonFromElevation", "buttonToElevation", "isButtonVisible", "", "bind", "uri", "", "text", "itemViewType", "", "isTopPhoto", "onButtonClick", "Lkotlin/Function0;", "bindEmpty", "bindLoading", "bindPhoto", "cancelAnimation", "onDetachedFromWindow", "onItemCleared", "onItemSelected", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setImageUri", "setLabel", "account_release"}, k = 1, mv = {1, 1, 10})
public final class PhotoItemView extends FrameLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f8169a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PhotoItemView.class), "cardView", "getCardView()Landroid/support/v7/widget/CardView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(PhotoItemView.class), "progressImageView", "getProgressImageView()Lcom/tinder/base/view/ProgressImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(PhotoItemView.class), "textView", "getTextView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(PhotoItemView.class), AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON, "getButton()Landroid/support/v7/widget/CardView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(PhotoItemView.class), "topPhotoBanner", "getTopPhotoBanner()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(PhotoItemView.class), "progressbar", "getProgressbar()Landroid/widget/ProgressBar;"))};
    /* renamed from: b */
    private final Lazy f8170b = C18451c.a(LazyThreadSafetyMode.NONE, new PhotoItemView$$special$$inlined$bindView$1(this, C2608e.photo_item_card_view));
    /* renamed from: c */
    private final Lazy f8171c = C18451c.a(LazyThreadSafetyMode.NONE, new PhotoItemView$$special$$inlined$bindView$2(this, C2608e.photo_item_view_image));
    /* renamed from: d */
    private final Lazy f8172d = C18451c.a(LazyThreadSafetyMode.NONE, new PhotoItemView$$special$$inlined$bindView$3(this, C2608e.photo_item_view_photo_number_text));
    /* renamed from: e */
    private final Lazy f8173e = C18451c.a(LazyThreadSafetyMode.NONE, new PhotoItemView$$special$$inlined$bindView$4(this, C2608e.photo_item_view_image_change_button));
    /* renamed from: f */
    private final Lazy f8174f = C18451c.a(LazyThreadSafetyMode.NONE, new PhotoItemView$$special$$inlined$bindView$5(this, C2608e.top_photo_banner));
    /* renamed from: g */
    private final Lazy f8175g = C18451c.a(LazyThreadSafetyMode.NONE, new PhotoItemView$$special$$inlined$bindView$6(this, C2608e.photo_item_progress_bar));
    /* renamed from: h */
    private final float f8176h = au.a(this, C2606c.photo_item_view_selected_elevation);
    /* renamed from: i */
    private final float f8177i = au.a(this, C2606c.photo_item_view_resting_elevation);
    /* renamed from: j */
    private final float f8178j = au.a(this, C2606c.photo_item_view_change_image_button_elevation);
    /* renamed from: k */
    private AnimatorSet f8179k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.PhotoItemView$a */
    static final class C2622a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Function0 f8167a;

        C2622a(Function0 function0) {
            this.f8167a = function0;
        }

        public final void onClick(View view) {
            this.f8167a.invoke();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.photogrid.PhotoItemView$b */
    static final class C2623b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Function0 f8168a;

        C2623b(Function0 function0) {
            this.f8168a = function0;
        }

        public final void onClick(View view) {
            this.f8168a.invoke();
        }
    }

    private final CardView getButton() {
        Lazy lazy = this.f8173e;
        KProperty kProperty = f8169a[3];
        return (CardView) lazy.getValue();
    }

    private final CardView getCardView() {
        Lazy lazy = this.f8170b;
        KProperty kProperty = f8169a[0];
        return (CardView) lazy.getValue();
    }

    private final ProgressImageView getProgressImageView() {
        Lazy lazy = this.f8171c;
        KProperty kProperty = f8169a[1];
        return (ProgressImageView) lazy.getValue();
    }

    private final ProgressBar getProgressbar() {
        Lazy lazy = this.f8175g;
        KProperty kProperty = f8169a[5];
        return (ProgressBar) lazy.getValue();
    }

    private final TextView getTextView() {
        Lazy lazy = this.f8172d;
        KProperty kProperty = f8169a[2];
        return (TextView) lazy.getValue();
    }

    private final TextView getTopPhotoBanner() {
        Lazy lazy = this.f8174f;
        KProperty kProperty = f8169a[4];
        return (TextView) lazy.getValue();
    }

    public PhotoItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        C2668g.m10309b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, MeasureSpec.makeMeasureSpec((int) (((double) MeasureSpec.getSize(i)) * 1.4285714285714286d), 1073741824));
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9805c();
    }

    /* renamed from: a */
    public static /* synthetic */ void m9801a(PhotoItemView photoItemView, String str, String str2, int i, boolean z, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != null) {
            str = null;
        }
        String str3 = str;
        if ((i2 & 2) != null) {
            str2 = null;
        }
        photoItemView.m9807a(str3, str2, i, z, function0);
    }

    /* renamed from: a */
    public final void m9807a(@Nullable String str, @Nullable String str2, int i, boolean z, @NotNull Function0<C15813i> function0) {
        C2668g.m10309b(function0, "onButtonClick");
        switch (i) {
            case 1:
                m9804a(str, str2, z);
                break;
            case 2:
                m9803a(str, str2, (Function0) function0);
                break;
            case 3:
                m9802a(str2);
                break;
            default:
                break;
        }
        getButton().setOnClickListener((OnClickListener) new C2622a(function0));
    }

    public final void setLabel(@Nullable String str) {
        getTextView().setText(str);
    }

    /* renamed from: a */
    public final void m9806a() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), C2604a.scale));
        m9800a(this.f8177i, this.f8176h, this.f8177i + this.f8178j, this.f8176h + this.f8178j, false);
    }

    /* renamed from: b */
    public final void m9808b() {
        m9800a(this.f8176h, this.f8177i, this.f8178j + this.f8176h, this.f8178j + this.f8177i, true);
    }

    /* renamed from: a */
    private final void m9804a(String str, String str2, boolean z) {
        setImageUri(str);
        setLabel(str2);
        getButton().setBackgroundResource(C2607d.remove_image);
        getProgressbar().setVisibility(4);
        if (z) {
            getTopPhotoBanner().setVisibility(null);
            getTextView().setVisibility(8);
        }
    }

    /* renamed from: a */
    private final void m9803a(String str, String str2, Function0<C15813i> function0) {
        setImageUri(str);
        setLabel(str2);
        getProgressImageView().setImage(au.b(this, C2607d.empty_photo_border_drawable));
        getButton().setBackgroundResource(C2607d.add_image);
        getCardView().setOnClickListener((OnClickListener) new C2623b(function0));
        getProgressbar().setVisibility(4);
    }

    /* renamed from: a */
    private final void m9802a(String str) {
        setLabel(str);
        getProgressbar().setVisibility(0);
    }

    private final void setImageUri(String str) {
        if (str != null) {
            getProgressImageView().setImage(str);
        } else {
            getProgressImageView().c();
        }
    }

    /* renamed from: c */
    private final void m9805c() {
        AnimatorSet animatorSet = this.f8179k;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        getCardView().setElevation(this.f8177i);
        getButton().setScaleX(1.0f);
        getButton().setScaleY(1.0f);
        getButton().setElevation(this.f8178j);
    }

    /* renamed from: a */
    private final void m9800a(float f, float f2, float f3, float f4, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        CardView button = getButton();
        if (z) {
            z = false;
        } else if (z) {
            throw new NoWhenBranchMatchedException();
        } else {
            z = true;
        }
        button.setVisibility(z);
        r1 = new Animator[2];
        r1[0] = ObjectAnimator.ofFloat(getCardView(), "elevation", new float[]{f, f2});
        r1[1] = ObjectAnimator.ofFloat(getButton(), "elevation", new float[]{f3, f4});
        animatorSet.playTogether(r1);
        animatorSet.setDuration(2.8E-43f);
        animatorSet.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
        f = this.f8179k;
        if (f != null) {
            f.cancel();
        }
        animatorSet.start();
        this.f8179k = animatorSet;
    }
}
