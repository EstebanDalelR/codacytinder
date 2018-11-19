package com.tinder.cardstack.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tinder.cardstack.cardstack.CardStackLayoutManager;
import com.tinder.cardstack.cardstack.CardStackSwipeHelper;
import com.tinder.cardstack.cardstack.CardStackSwipeHelper.OnPreSwipeListener;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.model.SwipeDirection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p001a.C0001a;

public class CardStackLayout extends CardCollectionLayout {
    @NonNull
    /* renamed from: a */
    private final CardStackSwipeHelper f45115a;
    @NonNull
    /* renamed from: b */
    private final CardStackLayoutManager f45116b;
    @Nullable
    /* renamed from: c */
    private OnCardPresentedListener f45117c;
    @NonNull
    /* renamed from: d */
    private CopyOnWriteArrayList<OnDispatchTouchEventListener> f45118d;

    public interface CardRewindAnimationStateListener {
        void onRewindAnimationEnded(View view);

        void onRewindAnimationProgress(View view, float f);

        void onRewindAnimationStarted(View view);
    }

    public interface OnCardPairStateChangeListener {
        void onPairCreated(View view, View view2);

        void onPairDestroyed(View view, View view2);
    }

    public interface OnCardPresentedListener {
        void onCardPresented(@NonNull C8395a c8395a, @NonNull View view);
    }

    public interface OnDispatchTouchEventListener {
        boolean onDispatchTouchEvent(MotionEvent motionEvent);
    }

    public interface OnTopCardMovedListener {
        void onTopCardMoveEnded(boolean z);

        void onTopCardMoveStarted();

        void onTopCardMoved(float f, float f2, float f3, View view, SwipeDirection swipeDirection, boolean z);
    }

    /* renamed from: com.tinder.cardstack.view.CardStackLayout$a */
    private class C10506a implements com.tinder.cardstack.cardstack.CardStackLayoutManager.OnCardPresentedListener {
        /* renamed from: a */
        final /* synthetic */ CardStackLayout f34163a;

        private C10506a(CardStackLayout cardStackLayout) {
            this.f34163a = cardStackLayout;
        }

        public void onCardPresented(@NonNull View view) {
            int adapterPosition = this.f34163a.getChildViewHolder(view).getAdapterPosition();
            if (this.f34163a.f45117c != null) {
                this.f34163a.f45117c.onCardPresented(this.f34163a.getAdapter().m42467a(adapterPosition), view);
            }
        }
    }

    public CardStackLayout(Context context) {
        this(context, null);
    }

    public CardStackLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45118d = new CopyOnWriteArrayList();
        setClipChildren(null);
        setItemAnimator(null);
        this.f45116b = new CardStackLayoutManager(this);
        this.f45116b.m42378a(new C10506a());
        setLayoutManager(this.f45116b);
        this.f45115a = new CardStackSwipeHelper(this);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f45116b.m42377a(i, i2, i3, i4);
    }

    public void setOnPreSwipeListener(@NonNull final OnPreSwipeListener onPreSwipeListener) {
        this.f45115a.m35766a(new OnPreSwipeListener(this) {
            /* renamed from: b */
            final /* synthetic */ CardStackLayout f34162b;

            public boolean onPreSwipe(int i, @NonNull SwipeDirection swipeDirection) {
                if (i < 0) {
                    swipeDirection = new StringBuilder();
                    swipeDirection.append("Invalid adapter position:");
                    swipeDirection.append(i);
                    C0001a.d(swipeDirection.toString(), new Object[0]);
                    return false;
                }
                return onPreSwipeListener.onPreSwipe(this.f34162b.getAdapter().m42467a(i), swipeDirection);
            }
        });
    }

    public void setOnCardPresentedListener(@Nullable OnCardPresentedListener onCardPresentedListener) {
        this.f45117c = onCardPresentedListener;
    }

    /* renamed from: a */
    public void m54033a(@NonNull OnTopCardMovedListener onTopCardMovedListener) {
        this.f45115a.m35769a(onTopCardMovedListener);
    }

    /* renamed from: a */
    public void mo11330a(@NonNull View view, @NonNull CardDecorationListener cardDecorationListener) {
        this.f45115a.m35765a(view, cardDecorationListener);
    }

    /* renamed from: b */
    public void mo11331b(@NonNull View view, @NonNull CardDecorationListener cardDecorationListener) {
        this.f45115a.m35772b(view, cardDecorationListener);
    }

    /* renamed from: a */
    public void m54034a(@NonNull OnChildAttachStateChangePostLayoutListeners onChildAttachStateChangePostLayoutListeners) {
        this.f45116b.m42379a(onChildAttachStateChangePostLayoutListeners);
    }

    /* renamed from: a */
    public void m54032a(@NonNull OnCardPairStateChangeListener onCardPairStateChangeListener) {
        this.f45115a.m35768a(onCardPairStateChangeListener);
    }

    /* renamed from: b */
    public void m54037b(@NonNull OnCardPairStateChangeListener onCardPairStateChangeListener) {
        this.f45115a.m35773b(onCardPairStateChangeListener);
    }

    public void setCardRewindAnimationStateListener(@NonNull CardRewindAnimationStateListener cardRewindAnimationStateListener) {
        this.f45115a.m35767a(cardRewindAnimationStateListener);
    }

    /* renamed from: a */
    public void m54029a() {
        this.f45115a.m35764a();
    }

    public void setLayoutManager(@NonNull LayoutManager layoutManager) {
        if (layoutManager instanceof CardStackLayoutManager) {
            super.setLayoutManager(layoutManager);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LayoutManager must extend from ");
        stringBuilder.append(CardStackLayoutManager.class);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: b */
    public void m54035b() {
        this.f45115a.m35771b();
    }

    /* renamed from: c */
    public boolean m54038c() {
        return this.f45115a.m35776e();
    }

    /* renamed from: g */
    public void m54039g() {
        this.f45115a.m35775d();
    }

    /* renamed from: h */
    public void m54040h() {
        this.f45115a.m35774c();
    }

    /* renamed from: a */
    protected void mo11333a(int i, int i2) {
        if (this.f45115a.m35770a(i, i2) != 0) {
            m54039g();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator it = this.f45118d.iterator();
        while (it.hasNext()) {
            if (((OnDispatchTouchEventListener) it.next()).onDispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
