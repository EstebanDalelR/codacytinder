package com.tinder.places.settings.p317a;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tinder.R;
import com.tinder.places.settings.view.PlaceCountListener;
import com.tinder.places.viewmodel.C14353d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u001c\u0010\u0017\u001a\u00020\u00102\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/tinder/places/settings/adapter/PlacesSettingsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tinder/places/settings/adapter/PlacesSettingsAdapter$PlaceCheckViewHolder;", "()V", "data", "", "Lcom/tinder/places/viewmodel/PlaceSettingViewModel;", "getData", "()Ljava/util/List;", "placeCountListener", "Lcom/tinder/places/settings/view/PlaceCountListener;", "getPlaceCountListener", "()Lcom/tinder/places/settings/view/PlaceCountListener;", "setPlaceCountListener", "(Lcom/tinder/places/settings/view/PlaceCountListener;)V", "add", "", "placeVM", "getItemCount", "", "getSelectedItemIDs", "", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "remove", "placeId", "PlaceCheckViewHolder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.settings.a.a */
public final class C12448a extends Adapter<C12447a> {
    @NotNull
    /* renamed from: a */
    private final List<C14353d> f40147a = new ArrayList();
    @Nullable
    /* renamed from: b */
    private PlaceCountListener f40148b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/tinder/places/settings/adapter/PlacesSettingsAdapter$PlaceCheckViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tinder/places/settings/adapter/PlacesSettingsAdapter;Landroid/view/View;)V", "bind", "", "placeVm", "Lcom/tinder/places/viewmodel/PlaceSettingViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.a.a$a */
    public final class C12447a extends ViewHolder {
        /* renamed from: a */
        final /* synthetic */ C12448a f40146a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.settings.a.a$a$a */
        static final class C10288a implements OnCheckedChangeListener {
            /* renamed from: a */
            final /* synthetic */ C12447a f33427a;

            C10288a(C12447a c12447a) {
                this.f33427a = c12447a;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C14353d c14353d = (C14353d) this.f33427a.f40146a.m48936a().get(this.f33427a.getAdapterPosition());
                c14353d.a(z);
                z = this.f33427a.f40146a.m48941b();
                if (z) {
                    z.placeTapped(c14353d.a());
                }
                compoundButton = this.f33427a.f40146a.m48941b();
                if (compoundButton != null) {
                    Collection arrayList = new ArrayList();
                    for (Object next : this.f33427a.f40146a.m48936a()) {
                        if (((C14353d) next).c()) {
                            arrayList.add(next);
                        }
                    }
                    compoundButton.updatePlaceCount(((List) arrayList).size());
                }
            }
        }

        public C12447a(C12448a c12448a, @Nullable View view) {
            this.f40146a = c12448a;
            super(view);
        }

        /* renamed from: a */
        public final void m48934a(@NotNull C14353d c14353d) {
            C2668g.b(c14353d, "placeVm");
            View view = this.itemView;
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.CheckBox");
            }
            CheckBox checkBox = (CheckBox) view;
            checkBox.setText(c14353d.b());
            checkBox.setEnabled(null);
            ((CheckBox) this.itemView).setOnCheckedChangeListener(new C10288a(this));
        }
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m48937a((C12447a) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m48935a(viewGroup, i);
    }

    @NotNull
    /* renamed from: a */
    public final List<C14353d> m48936a() {
        return this.f40147a;
    }

    /* renamed from: a */
    public final void m48938a(@Nullable PlaceCountListener placeCountListener) {
        this.f40148b = placeCountListener;
    }

    @Nullable
    /* renamed from: b */
    public final PlaceCountListener m48941b() {
        return this.f40148b;
    }

    /* renamed from: a */
    public void m48937a(@NotNull C12447a c12447a, int i) {
        C2668g.b(c12447a, "holder");
        c12447a.m48934a((C14353d) this.f40147a.get(i));
    }

    @NotNull
    /* renamed from: a */
    public C12447a m48935a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        return new C12447a(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_setting_item, viewGroup, false));
    }

    public int getItemCount() {
        return this.f40147a.size();
    }

    @NotNull
    /* renamed from: c */
    public final List<String> m48942c() {
        Collection arrayList = new ArrayList();
        for (Object next : this.f40147a) {
            if (((C14353d) next).c()) {
                arrayList.add(next);
            }
        }
        Iterable<C14353d> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(C19301m.a(iterable, 10));
        for (C14353d a : iterable) {
            arrayList2.add(a.a());
        }
        return (List) arrayList2;
    }

    /* renamed from: a */
    public final void m48939a(@NotNull C14353d c14353d) {
        C2668g.b(c14353d, "placeVM");
        this.f40147a.add(c14353d);
        notifyItemInserted(this.f40147a.size() - 1);
    }

    /* renamed from: a */
    public final void m48940a(@NotNull String str) {
        C2668g.b(str, "placeId");
        int i = 0;
        for (C14353d a : this.f40147a) {
            if (C2668g.a(a.a(), str)) {
                break;
            }
            i++;
        }
        i = -1;
        this.f40147a.remove(i);
        notifyItemRemoved(i);
    }
}
