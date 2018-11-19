package com.tinder.recs.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.CallSuper;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.recs.C14694R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0002;<B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0015\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010'J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0004J\u0006\u0010(\u001a\u00020%J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020%H\u0002J\b\u0010-\u001a\u00020!H\u0016J\b\u0010.\u001a\u00020%H\u0004J\b\u0010/\u001a\u00020!H\u0004J\u0010\u00100\u001a\u00020%2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020%H\u0016J\u0010\u00104\u001a\u00020%2\u0006\u00101\u001a\u000202H\u0016J\b\u00105\u001a\u00020%H\u0014J\u0012\u00106\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0015\u00107\u001a\u00020%2\u0006\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'J\u0015\u00108\u001a\u00020%2\u0006\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'J\u0010\u00109\u001a\u00020%2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010:\u001a\u00020%2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R(\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R(\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u0014\u0010 \u001a\u00020!XD¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006="}, d2 = {"Lcom/tinder/recs/view/RecCardView;", "T", "Lcom/tinder/cardstack/model/Card;", "Landroid/support/v7/widget/CardView;", "Lcom/tinder/cardstack/view/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardStampsDecoration", "Lcom/tinder/recs/view/RecCardStampsDecoration;", "onTouchEventInterceptedListener", "Lcom/tinder/recs/view/RecCardView$OnTouchEventInterceptedListener;", "onTouchEventListener", "Lcom/tinder/recs/view/RecCardView$OnTouchEventListener;", "<set-?>", "Landroid/view/View;", "stampLike", "getStampLike", "()Landroid/view/View;", "setStampLike", "(Landroid/view/View;)V", "stampOops", "getStampOops", "setStampOops", "stampPass", "getStampPass", "setStampPass", "stampSuperLike", "getStampSuperLike", "setStampSuperLike", "supportsStamps", "", "getSupportsStamps", "()Z", "bind", "", "recCard", "(Lcom/tinder/cardstack/model/Card;)V", "disableStampsDecoration", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "findAllViews", "hasOverlappingRendering", "initializeCardStampsDecoration", "isCardMoving", "onAttachedToCardCollectionLayout", "cardCollectionLayout", "Lcom/tinder/cardstack/view/CardCollectionLayout;", "onCardViewRecycled", "onDetachedFromCardCollectionLayout", "onFinishInflate", "onInterceptTouchEvent", "onMovedToTop", "onRemovedFromTop", "setOnTouchEventInterceptedListener", "setOnTouchEventListener", "OnTouchEventInterceptedListener", "OnTouchEventListener", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public abstract class RecCardView<T extends C8395a<?>> extends CardView implements com.tinder.cardstack.view.CardView<T> {
    private HashMap _$_findViewCache;
    private RecCardStampsDecoration cardStampsDecoration;
    private RecCardView$OnTouchEventInterceptedListener onTouchEventInterceptedListener;
    private RecCardView$OnTouchEventListener onTouchEventListener;
    @Nullable
    private View stampLike;
    @Nullable
    private View stampOops;
    @Nullable
    private View stampPass;
    @Nullable
    private View stampSuperLike;
    private final boolean supportsStamps;

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

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onCardViewRecycled() {
    }

    public void onMovedToTop(@NotNull T t) {
        C2668g.m10309b(t, "recCard");
    }

    public void onRemovedFromTop(@NotNull T t) {
        C2668g.m10309b(t, "recCard");
    }

    public /* synthetic */ RecCardView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public RecCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        this.supportsStamps = true;
        setRadius((float) getResources().getDimensionPixelSize(C14694R.dimen.rec_card_radius));
        if (VERSION.SDK_INT < 21) {
            setPreventCornerOverlap(null);
        }
    }

    private final void setStampPass(View view) {
        this.stampPass = view;
    }

    @Nullable
    public final View getStampPass() {
        return this.stampPass;
    }

    private final void setStampLike(View view) {
        this.stampLike = view;
    }

    @Nullable
    public final View getStampLike() {
        return this.stampLike;
    }

    private final void setStampSuperLike(View view) {
        this.stampSuperLike = view;
    }

    @Nullable
    public final View getStampSuperLike() {
        return this.stampSuperLike;
    }

    private final void setStampOops(View view) {
        this.stampOops = view;
    }

    @Nullable
    public final View getStampOops() {
        return this.stampOops;
    }

    public boolean getSupportsStamps() {
        return this.supportsStamps;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        initializeCardStampsDecoration();
    }

    @CallSuper
    public void bind(@NotNull T t) {
        C2668g.m10309b(t, "recCard");
        RecCardStampsDecoration recCardStampsDecoration = this.cardStampsDecoration;
        if (recCardStampsDecoration != null) {
            recCardStampsDecoration.resetStamps$recs_cards_release();
            recCardStampsDecoration.setShowOopsStamp$recs_cards_release(t.getShowRevertIndicator());
            t.setShowRevertIndicator(false);
        }
    }

    public void onAttachedToCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.m10309b(cardCollectionLayout, "cardCollectionLayout");
        RecCardStampsDecoration recCardStampsDecoration = this.cardStampsDecoration;
        if (recCardStampsDecoration != null) {
            cardCollectionLayout.a(this, recCardStampsDecoration);
        }
    }

    public void onDetachedFromCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.m10309b(cardCollectionLayout, "cardCollectionLayout");
        RecCardStampsDecoration recCardStampsDecoration = this.cardStampsDecoration;
        if (recCardStampsDecoration != null) {
            cardCollectionLayout.b(this, recCardStampsDecoration);
        }
    }

    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        RecCardView$OnTouchEventInterceptedListener recCardView$OnTouchEventInterceptedListener = this.onTouchEventInterceptedListener;
        if (recCardView$OnTouchEventInterceptedListener != null) {
            recCardView$OnTouchEventInterceptedListener.onTouchEventIntercepted(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.m10309b(motionEvent, "ev");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        RecCardView$OnTouchEventListener recCardView$OnTouchEventListener = this.onTouchEventListener;
        if (recCardView$OnTouchEventListener != null) {
            recCardView$OnTouchEventListener.onTouchEvent(motionEvent);
        }
        return dispatchTouchEvent;
    }

    public final void setOnTouchEventListener(@Nullable RecCardView$OnTouchEventListener recCardView$OnTouchEventListener) {
        this.onTouchEventListener = recCardView$OnTouchEventListener;
    }

    public final void setOnTouchEventInterceptedListener(@Nullable RecCardView$OnTouchEventInterceptedListener recCardView$OnTouchEventInterceptedListener) {
        this.onTouchEventInterceptedListener = recCardView$OnTouchEventInterceptedListener;
    }

    public final void disableStampsDecoration() {
        RecCardStampsDecoration recCardStampsDecoration = this.cardStampsDecoration;
        if (recCardStampsDecoration != null) {
            recCardStampsDecoration.setEnabled$recs_cards_release(false);
        }
    }

    protected final boolean isCardMoving() {
        if (getTranslationX() == 0.0f) {
            if (getTranslationY() == 0.0f) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    protected final RecCardStampsDecoration cardStampsDecoration() {
        return this.cardStampsDecoration;
    }

    protected final void initializeCardStampsDecoration() {
        if (getSupportsStamps() && this.cardStampsDecoration == null) {
            findAllViews();
            View view = this.stampPass;
            if (view == null) {
                C2668g.m10304a();
            }
            View view2 = this.stampLike;
            if (view2 == null) {
                C2668g.m10304a();
            }
            View view3 = this.stampSuperLike;
            if (view3 == null) {
                C2668g.m10304a();
            }
            View view4 = this.stampOops;
            if (view4 == null) {
                C2668g.m10304a();
            }
            this.cardStampsDecoration = new RecCardStampsDecoration(view, view2, view3, view4);
        }
    }

    private final void findAllViews() {
        this.stampPass = findViewById(C14694R.id.stamp_pass);
        this.stampLike = findViewById(C14694R.id.stamp_liked);
        this.stampSuperLike = findViewById(C14694R.id.stamp_superlike);
        this.stampOops = findViewById(C14694R.id.stamp_oops);
    }
}
