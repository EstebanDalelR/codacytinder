package com.tinder.places.settings.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import com.tinder.R;
import com.tinder.places.injection.PlacesSettingsComponentProvider;
import com.tinder.places.settings.p317a.C12448a;
import com.tinder.places.viewmodel.C14353d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ab;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/places/settings/view/EditablePlacesRecyclerView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "listAdapter", "Lcom/tinder/places/settings/adapter/PlacesSettingsAdapter;", "add", "", "fromPlace", "Lcom/tinder/places/viewmodel/PlaceSettingViewModel;", "getSelectedItemIDs", "", "", "remove", "id", "setEditable", "editable", "", "setPlaceCountListener", "listener", "Lcom/tinder/places/settings/view/PlaceCountListener;", "EditablePlacesRecyclerViewLayoutManager", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class EditablePlacesRecyclerView extends RecyclerView {
    /* renamed from: a */
    private final C12448a f57836a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/settings/view/EditablePlacesRecyclerView$EditablePlacesRecyclerViewLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.EditablePlacesRecyclerView$a */
    private static final class C17735a extends LinearLayoutManager {
        public C17735a(@NotNull Context context) {
            C2668g.b(context, "context");
            super(context);
        }
    }

    public EditablePlacesRecyclerView(@NotNull Context context) {
        C2668g.b(context, "context");
        this(context, null);
    }

    public EditablePlacesRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f57836a = new C12448a();
        attributeSet = getContext();
        C2668g.a(attributeSet, "context");
        setLayoutManager((LayoutManager) new C17735a(attributeSet));
        context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.places.injection.PlacesSettingsComponentProvider");
        }
        ((PlacesSettingsComponentProvider) context).getPlacesSettingsComponent().inject(this);
        setAdapter((Adapter) this.f57836a);
        setNestedScrollingEnabled(null);
    }

    /* renamed from: a */
    public final void m67033a(@NotNull C14353d c14353d) {
        C2668g.b(c14353d, "fromPlace");
        this.f57836a.a(c14353d);
    }

    /* renamed from: a */
    public final void m67034a(@NotNull String str) {
        C2668g.b(str, "id");
        this.f57836a.a(str);
    }

    @NotNull
    public final List<String> getSelectedItemIDs() {
        return this.f57836a.c();
    }

    public final void setEditable(boolean z) {
        Iterator it = C18464j.m66925b(0, getChildCount()).iterator();
        while (it.hasNext()) {
            View childAt = getChildAt(((ab) it).mo13805b());
            if (childAt == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.CheckBox");
            }
            Drawable drawable;
            CheckBox checkBox = (CheckBox) childAt;
            checkBox.setEnabled(z);
            if (z) {
                Context context = getContext();
                C2668g.a(context, "context");
                drawable = context.getResources().getDrawable(R.drawable.selector_tinder_red_checkmark);
            } else {
                drawable = null;
            }
            checkBox.setButtonDrawable(drawable);
        }
    }

    public final void setPlaceCountListener(@NotNull PlaceCountListener placeCountListener) {
        C2668g.b(placeCountListener, "listener");
        this.f57836a.a(placeCountListener);
    }
}
