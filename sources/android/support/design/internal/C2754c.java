package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.StyleRes;
import android.support.design.C0181a.C0173d;
import android.support.design.C0181a.C0177h;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.design.internal.c */
public class C2754c implements MenuPresenter {
    /* renamed from: a */
    LinearLayout f8669a;
    /* renamed from: b */
    MenuBuilder f8670b;
    /* renamed from: c */
    C2749b f8671c;
    /* renamed from: d */
    LayoutInflater f8672d;
    /* renamed from: e */
    int f8673e;
    /* renamed from: f */
    boolean f8674f;
    /* renamed from: g */
    ColorStateList f8675g;
    /* renamed from: h */
    ColorStateList f8676h;
    /* renamed from: i */
    Drawable f8677i;
    /* renamed from: j */
    int f8678j;
    /* renamed from: k */
    final OnClickListener f8679k;
    /* renamed from: l */
    private NavigationMenuView f8680l;
    /* renamed from: m */
    private Callback f8681m;
    /* renamed from: n */
    private int f8682n;

    /* renamed from: android.support.design.internal.c$d */
    private interface C0184d {
    }

    /* renamed from: android.support.design.internal.c$b */
    private class C2749b extends Adapter<C2753j> {
        /* renamed from: a */
        final /* synthetic */ C2754c f8661a;
        /* renamed from: b */
        private final ArrayList<C0184d> f8662b = new ArrayList();
        /* renamed from: c */
        private MenuItemImpl f8663c;
        /* renamed from: d */
        private boolean f8664d;

        public long getItemId(int i) {
            return (long) i;
        }

        public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            m10689a((C2753j) viewHolder, i);
        }

        public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m10685a(viewGroup, i);
        }

        public /* synthetic */ void onViewRecycled(ViewHolder viewHolder) {
            m10688a((C2753j) viewHolder);
        }

        C2749b(C2754c c2754c) {
            this.f8661a = c2754c;
            m10684c();
        }

        public int getItemCount() {
            return this.f8662b.size();
        }

        public int getItemViewType(int i) {
            C0184d c0184d = (C0184d) this.f8662b.get(i);
            if (c0184d instanceof C2751e) {
                return 2;
            }
            if (c0184d instanceof C2750c) {
                return 3;
            }
            if (c0184d instanceof C2752f) {
                return ((C2752f) c0184d).m10694a().hasSubMenu() != 0 ? 1 : 0;
            } else {
                throw new RuntimeException("Unknown item type.");
            }
        }

        /* renamed from: a */
        public C2753j m10685a(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new C3993g(this.f8661a.f8672d, viewGroup, this.f8661a.f8679k);
                case 1:
                    return new C3995i(this.f8661a.f8672d, viewGroup);
                case 2:
                    return new C3994h(this.f8661a.f8672d, viewGroup);
                case 3:
                    return new C3992a(this.f8661a.f8669a);
                default:
                    return null;
            }
        }

        /* renamed from: a */
        public void m10689a(C2753j c2753j, int i) {
            switch (getItemViewType(i)) {
                case 0:
                    View view = (NavigationMenuItemView) c2753j.itemView;
                    view.setIconTintList(this.f8661a.f8676h);
                    if (this.f8661a.f8674f) {
                        view.setTextAppearance(this.f8661a.f8673e);
                    }
                    if (this.f8661a.f8675g != null) {
                        view.setTextColor(this.f8661a.f8675g);
                    }
                    ViewCompat.m2183a(view, this.f8661a.f8677i != null ? this.f8661a.f8677i.getConstantState().newDrawable() : null);
                    C2752f c2752f = (C2752f) this.f8662b.get(i);
                    view.setNeedsEmptyIcon(c2752f.f8667a);
                    view.initialize(c2752f.m10694a(), 0);
                    return;
                case 1:
                    ((TextView) c2753j.itemView).setText(((C2752f) this.f8662b.get(i)).m10694a().getTitle());
                    return;
                case 2:
                    C2751e c2751e = (C2751e) this.f8662b.get(i);
                    c2753j.itemView.setPadding(0, c2751e.m10692a(), 0, c2751e.m10693b());
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void m10688a(C2753j c2753j) {
            if (c2753j instanceof C3993g) {
                ((NavigationMenuItemView) c2753j.itemView).m15608a();
            }
        }

        /* renamed from: a */
        public void m10686a() {
            m10684c();
            notifyDataSetChanged();
        }

        /* renamed from: c */
        private void m10684c() {
            if (!this.f8664d) {
                r0.f8664d = true;
                r0.f8662b.clear();
                r0.f8662b.add(new C2750c());
                int size = r0.f8661a.f8670b.getVisibleItems().size();
                int i = -1;
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) r0.f8661a.f8670b.getVisibleItems().get(i3);
                    if (menuItemImpl.isChecked()) {
                        m10690a(menuItemImpl);
                    }
                    if (menuItemImpl.isCheckable()) {
                        menuItemImpl.setExclusiveCheckable(false);
                    }
                    if (menuItemImpl.hasSubMenu()) {
                        SubMenu subMenu = menuItemImpl.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                r0.f8662b.add(new C2751e(r0.f8661a.f8678j, 0));
                            }
                            r0.f8662b.add(new C2752f(menuItemImpl));
                            int size2 = r0.f8662b.size();
                            int size3 = subMenu.size();
                            Object obj = null;
                            for (int i4 = 0; i4 < size3; i4++) {
                                MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i4);
                                if (menuItemImpl2.isVisible()) {
                                    if (obj == null && menuItemImpl2.getIcon() != null) {
                                        obj = 1;
                                    }
                                    if (menuItemImpl2.isCheckable()) {
                                        menuItemImpl2.setExclusiveCheckable(false);
                                    }
                                    if (menuItemImpl.isChecked()) {
                                        m10690a(menuItemImpl);
                                    }
                                    r0.f8662b.add(new C2752f(menuItemImpl2));
                                }
                            }
                            if (obj != null) {
                                m10683a(size2, r0.f8662b.size());
                            }
                        }
                    } else {
                        int groupId = menuItemImpl.getGroupId();
                        if (groupId != i) {
                            i2 = r0.f8662b.size();
                            boolean z2 = menuItemImpl.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                r0.f8662b.add(new C2751e(r0.f8661a.f8678j, r0.f8661a.f8678j));
                            }
                            z = z2;
                        } else if (!(z || menuItemImpl.getIcon() == null)) {
                            m10683a(i2, r0.f8662b.size());
                            z = true;
                        }
                        C2752f c2752f = new C2752f(menuItemImpl);
                        c2752f.f8667a = z;
                        r0.f8662b.add(c2752f);
                        i = groupId;
                    }
                }
                r0.f8664d = false;
            }
        }

        /* renamed from: a */
        private void m10683a(int i, int i2) {
            while (i < i2) {
                ((C2752f) this.f8662b.get(i)).f8667a = true;
                i++;
            }
        }

        /* renamed from: a */
        public void m10690a(MenuItemImpl menuItemImpl) {
            if (this.f8663c != menuItemImpl) {
                if (menuItemImpl.isCheckable()) {
                    if (this.f8663c != null) {
                        this.f8663c.setChecked(false);
                    }
                    this.f8663c = menuItemImpl;
                    menuItemImpl.setChecked(true);
                }
            }
        }

        /* renamed from: b */
        public Bundle m10691b() {
            Bundle bundle = new Bundle();
            if (this.f8663c != null) {
                bundle.putInt("android:menu:checked", this.f8663c.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f8662b.size();
            for (int i = 0; i < size; i++) {
                C0184d c0184d = (C0184d) this.f8662b.get(i);
                if (c0184d instanceof C2752f) {
                    MenuItemImpl a = ((C2752f) c0184d).m10694a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        SparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: a */
        public void m10687a(Bundle bundle) {
            int i = 0;
            int i2 = bundle.getInt("android:menu:checked", 0);
            if (i2 != 0) {
                this.f8664d = true;
                int size = this.f8662b.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0184d c0184d = (C0184d) this.f8662b.get(i3);
                    if (c0184d instanceof C2752f) {
                        MenuItemImpl a = ((C2752f) c0184d).m10694a();
                        if (a != null && a.getItemId() == i2) {
                            m10690a(a);
                            break;
                        }
                    }
                }
                this.f8664d = false;
                m10684c();
            }
            bundle = bundle.getSparseParcelableArray("android:menu:action_views");
            if (bundle != null) {
                i2 = this.f8662b.size();
                while (i < i2) {
                    C0184d c0184d2 = (C0184d) this.f8662b.get(i);
                    if (c0184d2 instanceof C2752f) {
                        MenuItemImpl a2 = ((C2752f) c0184d2).m10694a();
                        if (a2 != null) {
                            View actionView = a2.getActionView();
                            if (actionView != null) {
                                ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray) bundle.get(a2.getItemId());
                                if (parcelableSparseArray != null) {
                                    actionView.restoreHierarchyState(parcelableSparseArray);
                                }
                            }
                        }
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: android.support.design.internal.c$c */
    private static class C2750c implements C0184d {
        C2750c() {
        }
    }

    /* renamed from: android.support.design.internal.c$e */
    private static class C2751e implements C0184d {
        /* renamed from: a */
        private final int f8665a;
        /* renamed from: b */
        private final int f8666b;

        public C2751e(int i, int i2) {
            this.f8665a = i;
            this.f8666b = i2;
        }

        /* renamed from: a */
        public int m10692a() {
            return this.f8665a;
        }

        /* renamed from: b */
        public int m10693b() {
            return this.f8666b;
        }
    }

    /* renamed from: android.support.design.internal.c$f */
    private static class C2752f implements C0184d {
        /* renamed from: a */
        boolean f8667a;
        /* renamed from: b */
        private final MenuItemImpl f8668b;

        C2752f(MenuItemImpl menuItemImpl) {
            this.f8668b = menuItemImpl;
        }

        /* renamed from: a */
        public MenuItemImpl m10694a() {
            return this.f8668b;
        }
    }

    /* renamed from: android.support.design.internal.c$j */
    private static abstract class C2753j extends ViewHolder {
        public C2753j(View view) {
            super(view);
        }
    }

    /* renamed from: android.support.design.internal.c$a */
    private static class C3992a extends C2753j {
        public C3992a(View view) {
            super(view);
        }
    }

    /* renamed from: android.support.design.internal.c$g */
    private static class C3993g extends C2753j {
        public C3993g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(C0177h.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: android.support.design.internal.c$h */
    private static class C3994h extends C2753j {
        public C3994h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0177h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.c$i */
    private static class C3995i extends C2753j {
        public C3995i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0177h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f8672d = LayoutInflater.from(context);
        this.f8670b = menuBuilder;
        this.f8678j = context.getResources().getDimensionPixelOffset(C0173d.design_navigation_separator_vertical_padding);
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f8680l == null) {
            this.f8680l = (NavigationMenuView) this.f8672d.inflate(C0177h.design_navigation_menu, viewGroup, false);
            if (this.f8671c == null) {
                this.f8671c = new C2749b(this);
            }
            this.f8669a = (LinearLayout) this.f8672d.inflate(C0177h.design_navigation_item_header, this.f8680l, false);
            this.f8680l.setAdapter(this.f8671c);
        }
        return this.f8680l;
    }

    public void updateMenuView(boolean z) {
        if (this.f8671c) {
            this.f8671c.m10686a();
        }
    }

    public void setCallback(Callback callback) {
        this.f8681m = callback;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (this.f8681m != null) {
            this.f8681m.onCloseMenu(menuBuilder, z);
        }
    }

    public int getId() {
        return this.f8682n;
    }

    public Parcelable onSaveInstanceState() {
        if (VERSION.SDK_INT < 11) {
            return null;
        }
        Parcelable bundle = new Bundle();
        if (this.f8680l != null) {
            SparseArray sparseArray = new SparseArray();
            this.f8680l.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        if (this.f8671c != null) {
            bundle.putBundle("android:menu:adapter", this.f8671c.m10691b());
        }
        if (this.f8669a != null) {
            sparseArray = new SparseArray();
            this.f8669a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray);
        }
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.f8680l.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f8671c.m10687a(bundle2);
            }
            parcelable = bundle.getSparseParcelableArray("android:menu:header");
            if (parcelable != null) {
                this.f8669a.restoreHierarchyState(parcelable);
            }
        }
    }

    /* renamed from: a */
    public void m10699a(MenuItemImpl menuItemImpl) {
        this.f8671c.m10690a(menuItemImpl);
    }

    /* renamed from: a */
    public int m10695a() {
        return this.f8669a.getChildCount();
    }

    @Nullable
    /* renamed from: b */
    public ColorStateList m10700b() {
        return this.f8676h;
    }

    /* renamed from: a */
    public void m10697a(@Nullable ColorStateList colorStateList) {
        this.f8676h = colorStateList;
        updateMenuView(null);
    }

    @Nullable
    /* renamed from: c */
    public ColorStateList m10702c() {
        return this.f8675g;
    }

    /* renamed from: b */
    public void m10701b(@Nullable ColorStateList colorStateList) {
        this.f8675g = colorStateList;
        updateMenuView(null);
    }

    /* renamed from: a */
    public void m10696a(@StyleRes int i) {
        this.f8673e = i;
        this.f8674f = true;
        updateMenuView(0);
    }

    @Nullable
    /* renamed from: d */
    public Drawable m10703d() {
        return this.f8677i;
    }

    /* renamed from: a */
    public void m10698a(@Nullable Drawable drawable) {
        this.f8677i = drawable;
        updateMenuView(null);
    }
}
