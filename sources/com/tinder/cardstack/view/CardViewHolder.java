package com.tinder.cardstack.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.p180a.C8361a;

public class CardViewHolder<M extends C8395a> extends ViewHolder {
    private CardView<M> cardView;
    private M cardViewModel;
    private boolean isAtTop;

    public interface Factory<VH extends CardViewHolder, T extends C8395a> {
        VH createViewHolder(ViewGroup viewGroup, int i);

        int getViewType(T t);
    }

    public boolean isSwipable() {
        return true;
    }

    public CardViewHolder(View view) {
        super(view);
        if (view instanceof CardView) {
            this.cardView = (CardView) view;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("cardView must implement ");
        stringBuilder.append(CardView.class.getSimpleName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    void bind(M m) {
        this.cardViewModel = m;
        this.cardView.bind(m);
    }

    public void onCardAtTop(boolean z) {
        if (z && !this.isAtTop) {
            this.cardView.onMovedToTop(this.cardViewModel);
        } else if (!z && this.isAtTop) {
            this.cardView.onRemovedFromTop(this.cardViewModel);
        }
        this.isAtTop = z;
    }

    public void onCardViewRecycled() {
        this.cardView.onCardViewRecycled();
    }

    public void onAttachedToCardCollectionLayout(@NonNull CardCollectionLayout cardCollectionLayout) {
        this.cardView.onAttachedToCardCollectionLayout(cardCollectionLayout);
    }

    public void onDetachedFromCardCollectionLayout(@NonNull CardCollectionLayout cardCollectionLayout) {
        this.cardView.onDetachedFromCardCollectionLayout(cardCollectionLayout);
    }

    @Nullable
    public C8361a getAppearingAnimation() {
        return this.cardViewModel.getAppearingAnimation();
    }

    @Nullable
    public C8361a getDisappearingAnimation() {
        return this.cardViewModel.getDisappearingAnimation();
    }
}
