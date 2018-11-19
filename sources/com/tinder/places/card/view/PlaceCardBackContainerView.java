package com.tinder.places.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.views.CustomTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/places/card/view/PlaceCardBackContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "flipListener", "Lcom/tinder/places/card/view/PlaceCardFlipListener;", "onDetachedFromWindow", "", "setFlipListener", "setNames", "name", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceCardBackContainerView extends FrameLayout {
    /* renamed from: a */
    private PlaceCardFlipListener f33146a;
    /* renamed from: b */
    private HashMap f33147b;

    /* renamed from: a */
    public View m41446a(int i) {
        if (this.f33147b == null) {
            this.f33147b = new HashMap();
        }
        View view = (View) this.f33147b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f33147b.put(Integer.valueOf(i), view);
        return view;
    }

    public PlaceCardBackContainerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        context = context.getSystemService("layout_inflater");
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        ((LayoutInflater) context).inflate(R.layout.view_place_card_back_container, this, true);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PlaceCardFlipListener placeCardFlipListener = this.f33146a;
        if (placeCardFlipListener != null) {
            placeCardFlipListener.endFlipAnimation();
        }
    }

    public final void setNames(@NotNull String str) {
        C2668g.b(str, "name");
        PlaceCardBackView placeCardBackView = (PlaceCardBackView) m41446a(C6248a.placeCardBack);
        C2668g.a(placeCardBackView, "placeCardBack");
        CustomTextView customTextView = (CustomTextView) placeCardBackView.m41449a(C6248a.titleTextViewBack);
        C2668g.a(customTextView, "placeCardBack.titleTextViewBack");
        CharSequence charSequence = str;
        customTextView.setText(charSequence);
        PlaceCardRemoveView placeCardRemoveView = (PlaceCardRemoveView) m41446a(C6248a.placeCardRemove);
        C2668g.a(placeCardRemoveView, "placeCardRemove");
        customTextView = (CustomTextView) placeCardRemoveView.m41454a(C6248a.titleTextViewRemove);
        C2668g.a(customTextView, "placeCardRemove.titleTextViewRemove");
        customTextView.setText(charSequence);
    }

    public final void setFlipListener(@NotNull PlaceCardFlipListener placeCardFlipListener) {
        C2668g.b(placeCardFlipListener, "flipListener");
        this.f33146a = placeCardFlipListener;
    }
}
