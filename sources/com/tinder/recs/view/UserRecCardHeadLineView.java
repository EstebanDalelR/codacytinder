package com.tinder.recs.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.ads.source.dfp.DfpCustomTargetingValuesKt;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.recs.component.RecsViewComponentProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.ab;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0016\u0018\u00002\u00020\u0001:\u0001NB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0002J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000209H\u0002J\u0006\u0010;\u001a\u000202J\u0006\u0010<\u001a\u000202J\u0006\u0010=\u001a\u000202J\u0006\u0010>\u001a\u000202J\u0006\u0010?\u001a\u000202J\u0010\u0010@\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\b\u0010A\u001a\u000202H\u0014J\u0018\u0010B\u001a\u0002022\u0006\u0010C\u001a\u0002062\u0006\u0010D\u001a\u000206H\u0002J\b\u0010E\u001a\u000202H\u0014J\u0018\u0010F\u001a\u0002022\u0006\u0010G\u001a\u0002062\u0006\u0010H\u001a\u000206H\u0014J\u0006\u0010I\u001a\u000202J\u0006\u0010J\u001a\u000202J\u0006\u0010K\u001a\u000202J\u0006\u0010L\u001a\u000202J\u0006\u0010M\u001a\u000202R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001e\u0010\"\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001e\u0010%\u001a\u00020&8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\u001e\u0010.\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0010\"\u0004\b0\u0010\u0012¨\u0006O"}, d2 = {"Lcom/tinder/recs/view/UserRecCardHeadLineView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ageView", "Landroid/widget/TextView;", "getAgeView$Tinder_release", "()Landroid/widget/TextView;", "setAgeView$Tinder_release", "(Landroid/widget/TextView;)V", "boostIconView", "Landroid/widget/ImageView;", "getBoostIconView$Tinder_release", "()Landroid/widget/ImageView;", "setBoostIconView$Tinder_release", "(Landroid/widget/ImageView;)V", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "getFastMatchConfigProvider$Tinder_release", "()Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "setFastMatchConfigProvider$Tinder_release", "(Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;)V", "fastMatchIconView", "Landroid/view/View;", "getFastMatchIconView$Tinder_release", "()Landroid/view/View;", "setFastMatchIconView$Tinder_release", "(Landroid/view/View;)V", "nameView", "getNameView$Tinder_release", "setNameView$Tinder_release", "superLikeIconView", "getSuperLikeIconView$Tinder_release", "setSuperLikeIconView$Tinder_release", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "getTopPicksConfig$Tinder_release", "()Lcom/tinder/domain/config/TopPicksConfig;", "setTopPicksConfig$Tinder_release", "(Lcom/tinder/domain/config/TopPicksConfig;)V", "topPicksIconView", "getTopPicksIconView$Tinder_release", "setTopPicksIconView$Tinder_release", "verifiedBadgeView", "getVerifiedBadgeView$Tinder_release", "setVerifiedBadgeView$Tinder_release", "bind", "", "viewModel", "Lcom/tinder/recs/view/UserRecCardHeadLineView$HeadLineViewModel;", "calculateSpaceLeftForNameView", "", "parentWidth", "canShowFastMatchAttribution", "", "canShowTopPicksAttribution", "hideBoostIcon", "hideFastMatchIcon", "hideSuperlikeIcon", "hideTopPicksIcon", "hideVerifiedBadge", "inflateView", "injectComponents", "measureChildViews", "parentWidthSpec", "parentHeightSpec", "onAttachedToWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "showBoostIcon", "showFastMatchIcon", "showSuperlikeIcon", "showTopPicksIcon", "showVerifiedBadge", "HeadLineViewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public class UserRecCardHeadLineView extends LinearLayout {
    private HashMap _$_findViewCache;
    @NotNull
    @BindView(2131363415)
    public TextView ageView;
    @NotNull
    @BindView(2131363416)
    public ImageView boostIconView;
    @Inject
    @NotNull
    public FastMatchConfigProvider fastMatchConfigProvider;
    @NotNull
    @BindView(2131363417)
    public View fastMatchIconView;
    @NotNull
    @BindView(2131363418)
    public TextView nameView;
    @NotNull
    @BindView(2131363419)
    public ImageView superLikeIconView;
    @Inject
    @NotNull
    public TopPicksConfig topPicksConfig;
    @NotNull
    @BindView(2131363420)
    public View topPicksIconView;
    @NotNull
    @BindView(2131363421)
    public ImageView verifiedBadgeView;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/tinder/recs/view/UserRecCardHeadLineView$HeadLineViewModel;", "", "showAge", "", "name", "", "age", "isVerified", "isSuperLike", "isBoost", "(ZLjava/lang/String;Ljava/lang/String;ZZZ)V", "getAge", "()Ljava/lang/String;", "()Z", "getName", "getShowAge", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class HeadLineViewModel {
        @NotNull
        private final String age;
        private final boolean isBoost;
        private final boolean isSuperLike;
        private final boolean isVerified;
        @NotNull
        private final String name;
        private final boolean showAge;

        @NotNull
        public static /* synthetic */ HeadLineViewModel copy$default(HeadLineViewModel headLineViewModel, boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = headLineViewModel.showAge;
            }
            if ((i & 2) != 0) {
                str = headLineViewModel.name;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = headLineViewModel.age;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                z2 = headLineViewModel.isVerified;
            }
            boolean z5 = z2;
            if ((i & 16) != 0) {
                z3 = headLineViewModel.isSuperLike;
            }
            boolean z6 = z3;
            if ((i & 32) != 0) {
                z4 = headLineViewModel.isBoost;
            }
            return headLineViewModel.copy(z, str3, str4, z5, z6, z4);
        }

        public final boolean component1() {
            return this.showAge;
        }

        @NotNull
        public final String component2() {
            return this.name;
        }

        @NotNull
        public final String component3() {
            return this.age;
        }

        public final boolean component4() {
            return this.isVerified;
        }

        public final boolean component5() {
            return this.isSuperLike;
        }

        public final boolean component6() {
            return this.isBoost;
        }

        @NotNull
        public final HeadLineViewModel copy(boolean z, @NotNull String str, @NotNull String str2, boolean z2, boolean z3, boolean z4) {
            C2668g.b(str, "name");
            C2668g.b(str2, DfpCustomTargetingValuesKt.ADS_TARGETING_AGE);
            return new HeadLineViewModel(z, str, str2, z2, z3, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof HeadLineViewModel) {
                HeadLineViewModel headLineViewModel = (HeadLineViewModel) obj;
                if ((this.showAge == headLineViewModel.showAge ? 1 : null) != null && C2668g.a(this.name, headLineViewModel.name) && C2668g.a(this.age, headLineViewModel.age)) {
                    if ((this.isVerified == headLineViewModel.isVerified ? 1 : null) != null) {
                        if ((this.isSuperLike == headLineViewModel.isSuperLike ? 1 : null) != null) {
                            if ((this.isBoost == headLineViewModel.isBoost ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.showAge;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            String str = this.name;
            int i3 = 0;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            str = this.age;
            if (str != null) {
                i3 = str.hashCode();
            }
            i = (i + i3) * 31;
            int i4 = this.isVerified;
            if (i4 != 0) {
                i4 = 1;
            }
            i = (i + i4) * 31;
            i4 = this.isSuperLike;
            if (i4 != 0) {
                i4 = 1;
            }
            i = (i + i4) * 31;
            boolean z = this.isBoost;
            if (!z) {
                i2 = z;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HeadLineViewModel(showAge=");
            stringBuilder.append(this.showAge);
            stringBuilder.append(", name=");
            stringBuilder.append(this.name);
            stringBuilder.append(", age=");
            stringBuilder.append(this.age);
            stringBuilder.append(", isVerified=");
            stringBuilder.append(this.isVerified);
            stringBuilder.append(", isSuperLike=");
            stringBuilder.append(this.isSuperLike);
            stringBuilder.append(", isBoost=");
            stringBuilder.append(this.isBoost);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public HeadLineViewModel(boolean z, @NotNull String str, @NotNull String str2, boolean z2, boolean z3, boolean z4) {
            C2668g.b(str, "name");
            C2668g.b(str2, DfpCustomTargetingValuesKt.ADS_TARGETING_AGE);
            this.showAge = z;
            this.name = str;
            this.age = str2;
            this.isVerified = z2;
            this.isSuperLike = z3;
            this.isBoost = z4;
        }

        public final boolean getShowAge() {
            return this.showAge;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getAge() {
            return this.age;
        }

        public final boolean isVerified() {
            return this.isVerified;
        }

        public final boolean isSuperLike() {
            return this.isSuperLike;
        }

        public final boolean isBoost() {
            return this.isBoost;
        }
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public UserRecCardHeadLineView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        setOrientation(null);
        inflateView(context);
        ButterKnife.a(this);
    }

    @NotNull
    public final TextView getNameView$Tinder_release() {
        TextView textView = this.nameView;
        if (textView == null) {
            C2668g.b("nameView");
        }
        return textView;
    }

    public final void setNameView$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.nameView = textView;
    }

    @NotNull
    public final TextView getAgeView$Tinder_release() {
        TextView textView = this.ageView;
        if (textView == null) {
            C2668g.b("ageView");
        }
        return textView;
    }

    public final void setAgeView$Tinder_release(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.ageView = textView;
    }

    @NotNull
    public final ImageView getVerifiedBadgeView$Tinder_release() {
        ImageView imageView = this.verifiedBadgeView;
        if (imageView == null) {
            C2668g.b("verifiedBadgeView");
        }
        return imageView;
    }

    public final void setVerifiedBadgeView$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.verifiedBadgeView = imageView;
    }

    @NotNull
    public final ImageView getSuperLikeIconView$Tinder_release() {
        ImageView imageView = this.superLikeIconView;
        if (imageView == null) {
            C2668g.b("superLikeIconView");
        }
        return imageView;
    }

    public final void setSuperLikeIconView$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.superLikeIconView = imageView;
    }

    @NotNull
    public final ImageView getBoostIconView$Tinder_release() {
        ImageView imageView = this.boostIconView;
        if (imageView == null) {
            C2668g.b("boostIconView");
        }
        return imageView;
    }

    public final void setBoostIconView$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.boostIconView = imageView;
    }

    @NotNull
    public final View getFastMatchIconView$Tinder_release() {
        View view = this.fastMatchIconView;
        if (view == null) {
            C2668g.b("fastMatchIconView");
        }
        return view;
    }

    public final void setFastMatchIconView$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.fastMatchIconView = view;
    }

    @NotNull
    public final View getTopPicksIconView$Tinder_release() {
        View view = this.topPicksIconView;
        if (view == null) {
            C2668g.b("topPicksIconView");
        }
        return view;
    }

    public final void setTopPicksIconView$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.topPicksIconView = view;
    }

    @NotNull
    public final FastMatchConfigProvider getFastMatchConfigProvider$Tinder_release() {
        FastMatchConfigProvider fastMatchConfigProvider = this.fastMatchConfigProvider;
        if (fastMatchConfigProvider == null) {
            C2668g.b("fastMatchConfigProvider");
        }
        return fastMatchConfigProvider;
    }

    public final void setFastMatchConfigProvider$Tinder_release(@NotNull FastMatchConfigProvider fastMatchConfigProvider) {
        C2668g.b(fastMatchConfigProvider, "<set-?>");
        this.fastMatchConfigProvider = fastMatchConfigProvider;
    }

    @NotNull
    public final TopPicksConfig getTopPicksConfig$Tinder_release() {
        TopPicksConfig topPicksConfig = this.topPicksConfig;
        if (topPicksConfig == null) {
            C2668g.b("topPicksConfig");
        }
        return topPicksConfig;
    }

    public final void setTopPicksConfig$Tinder_release(@NotNull TopPicksConfig topPicksConfig) {
        C2668g.b(topPicksConfig, "<set-?>");
        this.topPicksConfig = topPicksConfig;
    }

    protected void onAttachedToWindow() {
        injectComponents();
        super.onAttachedToWindow();
    }

    protected void inflateView(@NotNull Context context) {
        C2668g.b(context, "context");
        View.inflate(context, R.layout.recs_card_user_headline, this);
    }

    protected void injectComponents() {
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.component.RecsViewComponentProvider");
        }
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
    }

    public final void bind(@NotNull HeadLineViewModel headLineViewModel) {
        C2668g.b(headLineViewModel, "viewModel");
        TextView textView;
        if (headLineViewModel.getShowAge()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(headLineViewModel.getName());
            stringBuilder.append(',');
            String stringBuilder2 = stringBuilder.toString();
            TextView textView2 = this.nameView;
            if (textView2 == null) {
                C2668g.b("nameView");
            }
            textView2.setText(stringBuilder2);
            textView = this.ageView;
            if (textView == null) {
                C2668g.b("ageView");
            }
            textView.setText(headLineViewModel.getAge());
            textView = this.ageView;
            if (textView == null) {
                C2668g.b("ageView");
            }
            textView.setVisibility(0);
        } else {
            textView = this.nameView;
            if (textView == null) {
                C2668g.b("nameView");
            }
            textView.setText(headLineViewModel.getName());
            textView = this.ageView;
            if (textView == null) {
                C2668g.b("ageView");
            }
            textView.setVisibility(8);
        }
        if (headLineViewModel.isVerified()) {
            showVerifiedBadge();
        } else {
            hideVerifiedBadge();
        }
        if (headLineViewModel.isSuperLike()) {
            showSuperlikeIcon();
            hideBoostIcon();
        } else if (headLineViewModel.isBoost() != null) {
            hideSuperlikeIcon();
            showBoostIcon();
        } else {
            hideSuperlikeIcon();
            hideBoostIcon();
        }
    }

    public final void showVerifiedBadge() {
        ImageView imageView = this.verifiedBadgeView;
        if (imageView == null) {
            C2668g.b("verifiedBadgeView");
        }
        imageView.setVisibility(0);
    }

    public final void hideVerifiedBadge() {
        ImageView imageView = this.verifiedBadgeView;
        if (imageView == null) {
            C2668g.b("verifiedBadgeView");
        }
        imageView.setVisibility(8);
    }

    public final void showSuperlikeIcon() {
        ImageView imageView = this.superLikeIconView;
        if (imageView == null) {
            C2668g.b("superLikeIconView");
        }
        imageView.setVisibility(0);
    }

    public final void hideSuperlikeIcon() {
        ImageView imageView = this.superLikeIconView;
        if (imageView == null) {
            C2668g.b("superLikeIconView");
        }
        imageView.setVisibility(8);
    }

    public final void showBoostIcon() {
        ImageView imageView = this.boostIconView;
        if (imageView == null) {
            C2668g.b("boostIconView");
        }
        imageView.setVisibility(0);
    }

    public final void hideBoostIcon() {
        ImageView imageView = this.boostIconView;
        if (imageView == null) {
            C2668g.b("boostIconView");
        }
        imageView.setVisibility(8);
    }

    public final void showFastMatchIcon() {
        if (!canShowFastMatchAttribution()) {
            hideFastMatchIcon();
        }
        View view = this.fastMatchIconView;
        if (view == null) {
            C2668g.b("fastMatchIconView");
        }
        view.setVisibility(0);
    }

    public final void showTopPicksIcon() {
        if (!canShowTopPicksAttribution()) {
            hideTopPicksIcon();
        }
        View view = this.topPicksIconView;
        if (view == null) {
            C2668g.b("topPicksIconView");
        }
        view.setVisibility(0);
    }

    public final void hideFastMatchIcon() {
        View view = this.fastMatchIconView;
        if (view == null) {
            C2668g.b("fastMatchIconView");
        }
        view.setVisibility(8);
    }

    public final void hideTopPicksIcon() {
        View view = this.topPicksIconView;
        if (view == null) {
            C2668g.b("topPicksIconView");
        }
        view.setVisibility(8);
    }

    private final boolean canShowFastMatchAttribution() {
        FastMatchConfigProvider fastMatchConfigProvider = this.fastMatchConfigProvider;
        if (fastMatchConfigProvider == null) {
            C2668g.b("fastMatchConfigProvider");
        }
        return fastMatchConfigProvider.get().isEnabled();
    }

    private final boolean canShowTopPicksAttribution() {
        TopPicksConfig topPicksConfig = this.topPicksConfig;
        if (topPicksConfig == null) {
            C2668g.b("topPicksConfig");
        }
        return topPicksConfig.isEnabled();
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        measureChildViews(i, i2);
        TextView textView = this.nameView;
        if (textView == null) {
            C2668g.b("nameView");
        }
        LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        TextView textView2 = this.nameView;
        if (textView2 == null) {
            C2668g.b("nameView");
        }
        int measuredWidth = (textView2.getMeasuredWidth() + layoutParams2.rightMargin) + layoutParams2.leftMargin;
        size = calculateSpaceLeftForNameView(size);
        measuredWidth--;
        if (1 <= size) {
            if (measuredWidth >= size) {
                textView = this.nameView;
                if (textView == null) {
                    C2668g.b("nameView");
                }
                textView.setWidth(size);
            }
        }
        super.onMeasure(i, i2);
    }

    private final void measureChildViews(int i, int i2) {
        Iterable c18461c = new C18461c(0, getChildCount() - 1);
        Collection arrayList = new ArrayList(C18457p.m66906a(c18461c, 10));
        Iterator it = c18461c.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((ab) it).mo13805b()));
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : (List) arrayList) {
            View view = (View) next;
            C2668g.a(view, "it");
            if ((view.getVisibility() == 0 ? 1 : null) != null) {
                arrayList2.add(next);
            }
        }
        for (View measureChildWithMargins : (List) arrayList2) {
            measureChildWithMargins(measureChildWithMargins, i, 0, i2, 0);
        }
    }

    private final int calculateSpaceLeftForNameView(int i) {
        TextView textView = this.nameView;
        if (textView == null) {
            C2668g.b("nameView");
        }
        LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        TextView textView2 = this.nameView;
        if (textView2 == null) {
            C2668g.b("nameView");
        }
        int measuredWidth = (textView2.getMeasuredWidth() + layoutParams2.rightMargin) + layoutParams2.leftMargin;
        int childCount = getChildCount() - 1;
        int i2 = 0;
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                View childAt = getChildAt(i2);
                C2668g.a(childAt, "view");
                if (childAt.getVisibility() == 0) {
                    LayoutParams layoutParams3 = childAt.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    i3 += (childAt.getMeasuredWidth() + layoutParams4.leftMargin) + layoutParams4.rightMargin;
                }
                if (i2 == childCount) {
                    break;
                }
                i2++;
            }
            i2 = i3;
        }
        return i - (i2 - measuredWidth);
    }
}
