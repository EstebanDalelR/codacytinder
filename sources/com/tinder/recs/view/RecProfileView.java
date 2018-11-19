package com.tinder.recs.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import butterknife.BindView;
import com.tinder.R;
import com.tinder.enums.SwipeType;
import com.tinder.profile.target.ProfileGamepadTarget;
import com.tinder.profile.view.ProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderImageView;
import com.tinder.recs.animation.RecProfileAnimationDecorator;
import com.tinder.recs.animation.RecProfileAnimationDecorator.EndListener;
import com.tinder.recs.animation.RecProfileAnimationDecorator.State;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b*\u0001#\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003RSTB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u00103\u001a\u0002042\u0006\u00105\u001a\u00028\u0000H&¢\u0006\u0002\u00106J\u0010\u00107\u001a\u0002042\u0006\u00108\u001a\u000209H\u0004J\u0010\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020<H\u0002J\u000e\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020?J\u0016\u0010@\u001a\u0002042\u0006\u0010>\u001a\u00020?2\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u000204J\u000e\u0010D\u001a\u0002042\u0006\u0010E\u001a\u00020BJ\b\u0010F\u001a\u0004\u0018\u00010\u0010J\u0006\u0010G\u001a\u000204J\b\u0010H\u001a\u000204H\u0014J\b\u0010I\u001a\u000204H\u0014J\u0018\u0010J\u001a\u0002042\u0006\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020MH\u0014J\b\u0010N\u001a\u000204H\u0002J\b\u0010O\u001a\u000204H\u0002J\u0016\u0010P\u001a\u0002042\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001fJ\u0014\u0010Q\u001a\u0002042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000!R\u0012\u0010\u0006\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#X\u0004¢\u0006\u0004\n\u0002\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006U"}, d2 = {"Lcom/tinder/recs/view/RecProfileView;", "DATA", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "boundData", "getBoundData", "()Ljava/lang/Object;", "enterAnimationDecorator", "Lcom/tinder/recs/animation/RecProfileAnimationDecorator;", "getEnterAnimationDecorator", "()Lcom/tinder/recs/animation/RecProfileAnimationDecorator;", "setEnterAnimationDecorator", "(Lcom/tinder/recs/animation/RecProfileAnimationDecorator;)V", "entranceBackground", "Landroid/view/View;", "getEntranceBackground", "()Landroid/view/View;", "setEntranceBackground", "(Landroid/view/View;)V", "exitAnimationDecorator", "getExitAnimationDecorator", "setExitAnimationDecorator", "gamePadButtons", "Lcom/tinder/profile/target/ProfileGamepadTarget;", "getGamePadButtons", "()Lcom/tinder/profile/target/ProfileGamepadTarget;", "setGamePadButtons", "(Lcom/tinder/profile/target/ProfileGamepadTarget;)V", "listener", "Lcom/tinder/recs/view/RecProfileView$Listener;", "onRecProfileExitClickedListener", "Lcom/tinder/recs/view/RecProfileView$OnRecProfileExitClickedListener;", "pageChangeListener", "com/tinder/recs/view/RecProfileView$pageChangeListener$1", "Lcom/tinder/recs/view/RecProfileView$pageChangeListener$1;", "placeholderImageView", "Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderImageView;", "getPlaceholderImageView", "()Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderImageView;", "setPlaceholderImageView", "(Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderImageView;)V", "profileScrollAnimation", "Landroid/animation/ValueAnimator;", "profileView", "Lcom/tinder/profile/view/ProfileView;", "getProfileView", "()Lcom/tinder/profile/view/ProfileView;", "setProfileView", "(Lcom/tinder/profile/view/ProfileView;)V", "bindData", "", "data", "(Ljava/lang/Object;)V", "bindGamepadButtonStates", "gamepadButtonStates", "Lcom/tinder/recs/view/RecProfileView$GamepadButtonStates;", "dispatchGamepadButtonClick", "swipeType", "Lcom/tinder/enums/SwipeType;", "enter", "rootView", "Landroid/view/ViewGroup;", "enterWithGamepadEntranceAnimationDisabled", "gamepadEntranceAnimationDisabled", "", "exit", "exitWithGamepadExitAnimationDisabled", "gamepadExitAnimationDisabled", "getGamepadView", "hideGamepad", "onAttachedToWindow", "onDetachedFromWindow", "onVisibilityChanged", "changedView", "visibility", "", "removeGamepadClickListeners", "setGamepadClickListeners", "setListener", "setRecProfileExitClickedListener", "GamepadButtonStates", "Listener", "OnRecProfileExitClickedListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class RecProfileView<DATA> extends FrameLayout {
    private HashMap _$_findViewCache;
    @Nullable
    private RecProfileAnimationDecorator enterAnimationDecorator;
    @NotNull
    @BindView(2131363931)
    public View entranceBackground;
    @Nullable
    private RecProfileAnimationDecorator exitAnimationDecorator;
    @NotNull
    @BindView(2131363932)
    public ProfileGamepadTarget gamePadButtons;
    private Listener<? super DATA> listener;
    private OnRecProfileExitClickedListener<? super DATA> onRecProfileExitClickedListener;
    private final RecProfileView$pageChangeListener$1 pageChangeListener = new RecProfileView$pageChangeListener$1(this);
    @NotNull
    @BindView(2131363933)
    public PlaceholderImageView placeholderImageView;
    private ValueAnimator profileScrollAnimation;
    @NotNull
    @BindView(2131363930)
    public ProfileView profileView;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/tinder/recs/view/RecProfileView$GamepadButtonStates;", "", "isLikeButtonEnabled", "", "isSuperLikeButtonEnabled", "isPassButtonEnabled", "isSuperLikeButtonVisible", "(ZZZZ)V", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class GamepadButtonStates {
        private final boolean isLikeButtonEnabled;
        private final boolean isPassButtonEnabled;
        private final boolean isSuperLikeButtonEnabled;
        private final boolean isSuperLikeButtonVisible;

        @JvmOverloads
        public GamepadButtonStates() {
            this(false, false, false, false, 15, null);
        }

        @JvmOverloads
        public GamepadButtonStates(boolean z) {
            this(z, false, false, false, 14, null);
        }

        @JvmOverloads
        public GamepadButtonStates(boolean z, boolean z2) {
            this(z, z2, false, false, 12, null);
        }

        @JvmOverloads
        public GamepadButtonStates(boolean z, boolean z2, boolean z3) {
            this(z, z2, z3, false, 8, null);
        }

        @NotNull
        public static /* synthetic */ GamepadButtonStates copy$default(GamepadButtonStates gamepadButtonStates, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = gamepadButtonStates.isLikeButtonEnabled;
            }
            if ((i & 2) != 0) {
                z2 = gamepadButtonStates.isSuperLikeButtonEnabled;
            }
            if ((i & 4) != 0) {
                z3 = gamepadButtonStates.isPassButtonEnabled;
            }
            if ((i & 8) != 0) {
                z4 = gamepadButtonStates.isSuperLikeButtonVisible;
            }
            return gamepadButtonStates.copy(z, z2, z3, z4);
        }

        public final boolean component1() {
            return this.isLikeButtonEnabled;
        }

        public final boolean component2() {
            return this.isSuperLikeButtonEnabled;
        }

        public final boolean component3() {
            return this.isPassButtonEnabled;
        }

        public final boolean component4() {
            return this.isSuperLikeButtonVisible;
        }

        @NotNull
        public final GamepadButtonStates copy(boolean z, boolean z2, boolean z3, boolean z4) {
            return new GamepadButtonStates(z, z2, z3, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof GamepadButtonStates) {
                GamepadButtonStates gamepadButtonStates = (GamepadButtonStates) obj;
                if ((this.isLikeButtonEnabled == gamepadButtonStates.isLikeButtonEnabled ? 1 : null) != null) {
                    if ((this.isSuperLikeButtonEnabled == gamepadButtonStates.isSuperLikeButtonEnabled ? 1 : null) != null) {
                        if ((this.isPassButtonEnabled == gamepadButtonStates.isPassButtonEnabled ? 1 : null) != null) {
                            if ((this.isSuperLikeButtonVisible == gamepadButtonStates.isSuperLikeButtonVisible ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.isLikeButtonEnabled;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            int i3 = this.isSuperLikeButtonEnabled;
            if (i3 != 0) {
                i3 = 1;
            }
            i = (i + i3) * 31;
            i3 = this.isPassButtonEnabled;
            if (i3 != 0) {
                i3 = 1;
            }
            i = (i + i3) * 31;
            boolean z = this.isSuperLikeButtonVisible;
            if (!z) {
                i2 = z;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GamepadButtonStates(isLikeButtonEnabled=");
            stringBuilder.append(this.isLikeButtonEnabled);
            stringBuilder.append(", isSuperLikeButtonEnabled=");
            stringBuilder.append(this.isSuperLikeButtonEnabled);
            stringBuilder.append(", isPassButtonEnabled=");
            stringBuilder.append(this.isPassButtonEnabled);
            stringBuilder.append(", isSuperLikeButtonVisible=");
            stringBuilder.append(this.isSuperLikeButtonVisible);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @JvmOverloads
        public GamepadButtonStates(boolean z, boolean z2, boolean z3, boolean z4) {
            this.isLikeButtonEnabled = z;
            this.isSuperLikeButtonEnabled = z2;
            this.isPassButtonEnabled = z3;
            this.isSuperLikeButtonVisible = z4;
        }

        public final boolean isLikeButtonEnabled() {
            return this.isLikeButtonEnabled;
        }

        public final boolean isSuperLikeButtonEnabled() {
            return this.isSuperLikeButtonEnabled;
        }

        public final boolean isPassButtonEnabled() {
            return this.isPassButtonEnabled;
        }

        @JvmOverloads
        public /* synthetic */ GamepadButtonStates(boolean z, boolean z2, boolean z3, boolean z4, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                z = true;
            }
            if ((i & 2) != null) {
                z2 = true;
            }
            if ((i & 4) != null) {
                z3 = true;
            }
            if ((i & 8) != 0) {
                z4 = true;
            }
            this(z, z2, z3, z4);
        }

        public final boolean isSuperLikeButtonVisible() {
            return this.isSuperLikeButtonVisible;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tinder/recs/view/RecProfileView$Listener;", "DATA", "", "onGamepadButtonClick", "", "swipeType", "Lcom/tinder/enums/SwipeType;", "data", "(Lcom/tinder/enums/SwipeType;Ljava/lang/Object;)V", "onPhotoChanged", "index", "", "totalCount", "(IILjava/lang/Object;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener<DATA> {
        void onGamepadButtonClick(@NotNull SwipeType swipeType, DATA data);

        void onPhotoChanged(int i, int i2, DATA data);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/view/RecProfileView$OnRecProfileExitClickedListener;", "DATA", "", "onRecProfileExitClicked", "", "data", "(Ljava/lang/Object;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface OnRecProfileExitClickedListener<DATA> {
        void onRecProfileExitClicked(DATA data);
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

    public abstract void bindData(DATA data);

    public abstract DATA getBoundData();

    public RecProfileView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
    }

    @NotNull
    public final ProfileGamepadTarget getGamePadButtons() {
        ProfileGamepadTarget profileGamepadTarget = this.gamePadButtons;
        if (profileGamepadTarget == null) {
            C2668g.b("gamePadButtons");
        }
        return profileGamepadTarget;
    }

    public final void setGamePadButtons(@NotNull ProfileGamepadTarget profileGamepadTarget) {
        C2668g.b(profileGamepadTarget, "<set-?>");
        this.gamePadButtons = profileGamepadTarget;
    }

    @NotNull
    public final PlaceholderImageView getPlaceholderImageView() {
        PlaceholderImageView placeholderImageView = this.placeholderImageView;
        if (placeholderImageView == null) {
            C2668g.b("placeholderImageView");
        }
        return placeholderImageView;
    }

    public final void setPlaceholderImageView(@NotNull PlaceholderImageView placeholderImageView) {
        C2668g.b(placeholderImageView, "<set-?>");
        this.placeholderImageView = placeholderImageView;
    }

    @NotNull
    public final ProfileView getProfileView() {
        ProfileView profileView = this.profileView;
        if (profileView == null) {
            C2668g.b("profileView");
        }
        return profileView;
    }

    public final void setProfileView(@NotNull ProfileView profileView) {
        C2668g.b(profileView, "<set-?>");
        this.profileView = profileView;
    }

    @NotNull
    public final View getEntranceBackground() {
        View view = this.entranceBackground;
        if (view == null) {
            C2668g.b("entranceBackground");
        }
        return view;
    }

    public final void setEntranceBackground(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.entranceBackground = view;
    }

    @Nullable
    public final RecProfileAnimationDecorator getEnterAnimationDecorator() {
        return this.enterAnimationDecorator;
    }

    public final void setEnterAnimationDecorator(@Nullable RecProfileAnimationDecorator recProfileAnimationDecorator) {
        this.enterAnimationDecorator = recProfileAnimationDecorator;
    }

    @Nullable
    public final RecProfileAnimationDecorator getExitAnimationDecorator() {
        return this.exitAnimationDecorator;
    }

    public final void setExitAnimationDecorator(@Nullable RecProfileAnimationDecorator recProfileAnimationDecorator) {
        this.exitAnimationDecorator = recProfileAnimationDecorator;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileView profileView = this.profileView;
        if (profileView == null) {
            C2668g.b("profileView");
        }
        profileView.getViewTreeObserver().addOnGlobalLayoutListener(new RecProfileView$onAttachedToWindow$1(this));
    }

    protected void onVisibilityChanged(@NotNull View view, int i) {
        C2668g.b(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            bindData(getBoundData());
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.profileScrollAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setListener(@Nullable Listener<? super DATA> listener) {
        this.listener = listener;
    }

    public final void setRecProfileExitClickedListener(@NotNull OnRecProfileExitClickedListener<? super DATA> onRecProfileExitClickedListener) {
        C2668g.b(onRecProfileExitClickedListener, "listener");
        this.onRecProfileExitClickedListener = onRecProfileExitClickedListener;
    }

    public final void enter(@NotNull ViewGroup viewGroup) {
        C2668g.b(viewGroup, "rootView");
        enterWithGamepadEntranceAnimationDisabled(viewGroup, false);
    }

    public final void enterWithGamepadEntranceAnimationDisabled(@NotNull ViewGroup viewGroup, boolean z) {
        C2668g.b(viewGroup, "rootView");
        viewGroup.addView(this, new LayoutParams(-1, -1));
        if (z) {
            viewGroup = this.gamePadButtons;
            if (viewGroup == null) {
                C2668g.b("gamePadButtons");
            }
            viewGroup.enterWithoutAnimation();
        } else {
            viewGroup = this.gamePadButtons;
            if (viewGroup == null) {
                C2668g.b("gamePadButtons");
            }
            viewGroup.enterWithAnimation();
        }
        viewGroup = this.enterAnimationDecorator;
        if (viewGroup == null) {
            C2668g.a();
        }
        viewGroup.addEndListener((EndListener) new C16417xb5dbd997(this));
        viewGroup.animate();
    }

    public final void exit() {
        exitWithGamepadExitAnimationDisabled(false);
    }

    public final void exitWithGamepadExitAnimationDisabled(boolean z) {
        if (this.profileScrollAnimation == null) {
            if (isAttachedToWindow()) {
                ProfileView profileView = this.profileView;
                if (profileView == null) {
                    C2668g.b("profileView");
                }
                profileView.exit();
                profileView = this.profileView;
                if (profileView == null) {
                    C2668g.b("profileView");
                }
                profileView.setOnExitClickListener(null);
                profileView = this.profileView;
                if (profileView == null) {
                    C2668g.b("profileView");
                }
                profileView.setOnPhotoPageChangeListener(null);
                profileView = this.profileView;
                if (profileView == null) {
                    C2668g.b("profileView");
                }
                profileView.a(false);
                profileView = this.profileView;
                if (profileView == null) {
                    C2668g.b("profileView");
                }
                ScrollView scrollableContainer = profileView.getScrollableContainer();
                C2668g.a(scrollableContainer, "profileContainer");
                if (scrollableContainer.getScrollY() > 0) {
                    long max = (long) Math.max(RecProfileViewKt.MIN_PROFILE_SCROLL_ANIM_DURATION_MS, Math.min(RecProfileViewKt.MAX_PROFILE_SCROLL_ANIM_DURATION_MS, scrollableContainer.getScrollY() / 5));
                    z = ValueAnimator.ofInt(new int[]{scrollableContainer.getScrollY(), null});
                    z.setDuration(max);
                    z.addUpdateListener(new C14717xd85dfbce(this, max, scrollableContainer));
                    z.addListener(new C14718xd85dfbcf(this, max, scrollableContainer));
                    z.start();
                    this.profileScrollAnimation = z;
                    return;
                }
                removeGamepadClickListeners();
                if (z) {
                    z = this.gamePadButtons;
                    if (!z) {
                        C2668g.b("gamePadButtons");
                    }
                    z.exitWithoutAnimation();
                } else {
                    z = this.gamePadButtons;
                    if (!z) {
                        C2668g.b("gamePadButtons");
                    }
                    z.exitWithAnimation();
                }
                z = this.exitAnimationDecorator;
                if (z && z.getState() != State.RUNNING) {
                    z.animate();
                }
            }
        }
    }

    public final void hideGamepad() {
        ProfileGamepadTarget profileGamepadTarget = this.gamePadButtons;
        if (profileGamepadTarget == null) {
            C2668g.b("gamePadButtons");
        }
        profileGamepadTarget.hide();
    }

    @Nullable
    public final View getGamepadView() {
        return findViewById(R.id.user_rec_profile_gamepad);
    }

    protected final void bindGamepadButtonStates(@NotNull GamepadButtonStates gamepadButtonStates) {
        C2668g.b(gamepadButtonStates, "gamepadButtonStates");
        ProfileGamepadTarget profileGamepadTarget = this.gamePadButtons;
        if (profileGamepadTarget == null) {
            C2668g.b("gamePadButtons");
        }
        profileGamepadTarget.setLikeButtonEnabled(gamepadButtonStates.isLikeButtonEnabled());
        profileGamepadTarget.setSuperlikeButtonEnabled(gamepadButtonStates.isSuperLikeButtonEnabled());
        profileGamepadTarget.setPassButtonEnabled(gamepadButtonStates.isPassButtonEnabled());
        profileGamepadTarget.setSuperLikeButtonVisible(gamepadButtonStates.isSuperLikeButtonVisible());
    }

    private final void setGamepadClickListeners() {
        ProfileGamepadTarget profileGamepadTarget = this.gamePadButtons;
        if (profileGamepadTarget == null) {
            C2668g.b("gamePadButtons");
        }
        profileGamepadTarget.setLikeClickListener(new RecProfileView$setGamepadClickListeners$$inlined$apply$lambda$1(this));
        profileGamepadTarget.setPassClickListener(new RecProfileView$setGamepadClickListeners$$inlined$apply$lambda$2(this));
        profileGamepadTarget.setSuperlikeClickListener(new RecProfileView$setGamepadClickListeners$$inlined$apply$lambda$3(this));
        profileGamepadTarget.setEnabled(true);
    }

    private final void dispatchGamepadButtonClick(SwipeType swipeType) {
        RecProfileAnimationDecorator recProfileAnimationDecorator = this.exitAnimationDecorator;
        if (recProfileAnimationDecorator != null) {
            recProfileAnimationDecorator.addEndListener(new RecProfileView$dispatchGamepadButtonClick$$inlined$let$lambda$1(this, swipeType));
            exit();
        }
    }

    private final void removeGamepadClickListeners() {
        ProfileGamepadTarget profileGamepadTarget = this.gamePadButtons;
        if (profileGamepadTarget == null) {
            C2668g.b("gamePadButtons");
        }
        profileGamepadTarget.setEnabled(false);
        profileGamepadTarget.setLikeClickListener(null);
        profileGamepadTarget.setPassClickListener(null);
        profileGamepadTarget.setSuperlikeClickListener(null);
    }
}
