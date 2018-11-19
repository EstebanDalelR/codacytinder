package android.support.design.internal;

import android.content.res.ColorStateList;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.transition.C0355v;
import android.support.transition.C2811x;
import android.support.v4.util.Pools.Pool;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.design.internal.a */
public class C2748a extends ViewGroup implements MenuView {
    /* renamed from: a */
    private final C2811x f8644a;
    /* renamed from: b */
    private final int f8645b;
    /* renamed from: c */
    private final int f8646c;
    /* renamed from: d */
    private final int f8647d;
    /* renamed from: e */
    private final int f8648e;
    /* renamed from: f */
    private final OnClickListener f8649f;
    /* renamed from: g */
    private final Pool<BottomNavigationItemView> f8650g;
    /* renamed from: h */
    private boolean f8651h;
    /* renamed from: i */
    private BottomNavigationItemView[] f8652i;
    /* renamed from: j */
    private int f8653j;
    /* renamed from: k */
    private int f8654k;
    /* renamed from: l */
    private ColorStateList f8655l;
    /* renamed from: m */
    private ColorStateList f8656m;
    /* renamed from: n */
    private int f8657n;
    /* renamed from: o */
    private int[] f8658o;
    /* renamed from: p */
    private BottomNavigationPresenter f8659p;
    /* renamed from: q */
    private MenuBuilder f8660q;

    public int getWindowAnimations() {
        return 0;
    }

    public void initialize(MenuBuilder menuBuilder) {
        this.f8660q = menuBuilder;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        i = MeasureSpec.getSize(i);
        i2 = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f8648e, 1073741824);
        int min;
        if (this.f8651h) {
            i3 = i2 - 1;
            min = Math.min(i - (this.f8646c * i3), this.f8647d);
            i -= min;
            int min2 = Math.min(i / i3, this.f8645b);
            i3 = i - (i3 * min2);
            i = 0;
            while (i < i2) {
                this.f8658o[i] = i == this.f8654k ? min : min2;
                if (i3 > 0) {
                    int[] iArr = this.f8658o;
                    iArr[i] = iArr[i] + 1;
                    i3--;
                }
                i++;
            }
        } else {
            i3 = Math.min(i / (i2 == 0 ? 1 : i2), this.f8647d);
            min = i - (i3 * i2);
            for (i = 0; i < i2; i++) {
                this.f8658o[i] = i3;
                if (min > 0) {
                    int[] iArr2 = this.f8658o;
                    iArr2[i] = iArr2[i] + 1;
                    min--;
                }
            }
        }
        i3 = 0;
        for (i = 0; i < i2; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.f8658o[i], 1073741824), makeMeasureSpec);
                childAt.getLayoutParams().width = childAt.getMeasuredWidth();
                i3 += childAt.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i3, MeasureSpec.makeMeasureSpec(i3, 1073741824), 0), View.resolveSizeAndState(this.f8648e, makeMeasureSpec, 0));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = getChildCount();
        i3 -= i;
        i4 -= i2;
        int i5 = 0;
        for (boolean z2 = false; z2 < z; z2++) {
            View childAt = getChildAt(z2);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.m2208f(this) == 1) {
                    int i6 = i3 - i5;
                    childAt.layout(i6 - childAt.getMeasuredWidth(), 0, i6, i4);
                } else {
                    childAt.layout(i5, 0, childAt.getMeasuredWidth() + i5, i4);
                }
                i5 += childAt.getMeasuredWidth();
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f8655l = colorStateList;
        if (this.f8652i != null) {
            for (BottomNavigationItemView iconTintList : this.f8652i) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.f8655l;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f8656m = colorStateList;
        if (this.f8652i != null) {
            for (BottomNavigationItemView textColor : this.f8652i) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public ColorStateList getItemTextColor() {
        return this.f8656m;
    }

    public void setItemBackgroundRes(int i) {
        this.f8657n = i;
        if (this.f8652i != null) {
            for (BottomNavigationItemView itemBackground : this.f8652i) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public int getItemBackgroundRes() {
        return this.f8657n;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f8659p = bottomNavigationPresenter;
    }

    /* renamed from: a */
    public void m10680a() {
        removeAllViews();
        if (this.f8652i != null) {
            for (Object release : this.f8652i) {
                this.f8650g.release(release);
            }
        }
        if (this.f8660q.size() == 0) {
            this.f8653j = 0;
            this.f8654k = 0;
            this.f8652i = null;
            return;
        }
        this.f8652i = new BottomNavigationItemView[this.f8660q.size()];
        this.f8651h = this.f8660q.size() > 3;
        for (int i = 0; i < this.f8660q.size(); i++) {
            this.f8659p.m10677a(true);
            this.f8660q.getItem(i).setCheckable(true);
            this.f8659p.m10677a(false);
            View newItem = getNewItem();
            this.f8652i[i] = newItem;
            newItem.setIconTintList(this.f8655l);
            newItem.setTextColor(this.f8656m);
            newItem.setItemBackground(this.f8657n);
            newItem.setShiftingMode(this.f8651h);
            newItem.initialize((MenuItemImpl) this.f8660q.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f8649f);
            addView(newItem);
        }
        this.f8654k = Math.min(this.f8660q.size() - 1, this.f8654k);
        this.f8660q.getItem(this.f8654k).setChecked(true);
    }

    /* renamed from: b */
    public void m10682b() {
        int size = this.f8660q.size();
        if (size != this.f8652i.length) {
            m10680a();
            return;
        }
        int i = this.f8653j;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f8660q.getItem(i2);
            if (item.isChecked()) {
                this.f8653j = item.getItemId();
                this.f8654k = i2;
            }
        }
        if (i != this.f8653j) {
            C0355v.m1298a(this, this.f8644a);
        }
        for (i = 0; i < size; i++) {
            this.f8659p.m10677a(true);
            this.f8652i[i].initialize((MenuItemImpl) this.f8660q.getItem(i), 0);
            this.f8659p.m10677a(false);
        }
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) this.f8650g.acquire();
        return bottomNavigationItemView == null ? new BottomNavigationItemView(getContext()) : bottomNavigationItemView;
    }

    public int getSelectedItemId() {
        return this.f8653j;
    }

    /* renamed from: a */
    void m10681a(int i) {
        int size = this.f8660q.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f8660q.getItem(i2);
            if (i == item.getItemId()) {
                this.f8653j = i;
                this.f8654k = i2;
                item.setChecked(1);
                return;
            }
        }
    }
}
