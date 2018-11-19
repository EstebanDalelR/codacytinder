package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.design.C0181a.C0173d;
import android.support.design.C0181a.C0174e;
import android.support.design.C0181a.C0175f;
import android.support.design.C0181a.C0177h;
import android.support.v4.content.C0432b;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.view.C0601j;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView.ItemView;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.ads.AdError;

@RestrictTo({Scope.LIBRARY_GROUP})
public class BottomNavigationItemView extends FrameLayout implements ItemView {
    /* renamed from: a */
    private static final int[] f8617a = new int[]{16842912};
    /* renamed from: b */
    private final int f8618b;
    /* renamed from: c */
    private final int f8619c;
    /* renamed from: d */
    private final float f8620d;
    /* renamed from: e */
    private final float f8621e;
    /* renamed from: f */
    private boolean f8622f;
    /* renamed from: g */
    private ImageView f8623g;
    /* renamed from: h */
    private final TextView f8624h;
    /* renamed from: i */
    private final TextView f8625i;
    /* renamed from: j */
    private int f8626j;
    /* renamed from: k */
    private MenuItemImpl f8627k;
    /* renamed from: l */
    private ColorStateList f8628l;

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    public boolean showsIcon() {
        return true;
    }

    public BottomNavigationItemView(@NonNull Context context) {
        this(context, null);
    }

    public BottomNavigationItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8626j = -1;
        attributeSet = getResources();
        i = attributeSet.getDimensionPixelSize(C0173d.design_bottom_navigation_text_size);
        int dimensionPixelSize = attributeSet.getDimensionPixelSize(C0173d.design_bottom_navigation_active_text_size);
        this.f8618b = attributeSet.getDimensionPixelSize(C0173d.design_bottom_navigation_margin);
        this.f8619c = i - dimensionPixelSize;
        attributeSet = (float) dimensionPixelSize;
        i = (float) i;
        this.f8620d = (attributeSet * 1.0f) / i;
        this.f8621e = (i * 1065353216) / attributeSet;
        LayoutInflater.from(context).inflate(C0177h.design_bottom_navigation_item, this, 1);
        setBackgroundResource(C0174e.design_bottom_navigation_item_background);
        this.f8623g = (ImageView) findViewById(C0175f.icon);
        this.f8624h = (TextView) findViewById(C0175f.smallLabel);
        this.f8625i = (TextView) findViewById(C0175f.largeLabel);
    }

    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.f8627k = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
    }

    public void setItemPosition(int i) {
        this.f8626j = i;
    }

    public int getItemPosition() {
        return this.f8626j;
    }

    public void setShiftingMode(boolean z) {
        this.f8622f = z;
    }

    public MenuItemImpl getItemData() {
        return this.f8627k;
    }

    public void setTitle(CharSequence charSequence) {
        this.f8624h.setText(charSequence);
        this.f8625i.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        this.f8625i.setPivotX((float) (this.f8625i.getWidth() / 2));
        this.f8625i.setPivotY((float) this.f8625i.getBaseline());
        this.f8624h.setPivotX((float) (this.f8624h.getWidth() / 2));
        this.f8624h.setPivotY((float) this.f8624h.getBaseline());
        LayoutParams layoutParams;
        if (this.f8622f) {
            if (z) {
                layoutParams = (LayoutParams) this.f8623g.getLayoutParams();
                layoutParams.gravity = 49;
                layoutParams.topMargin = this.f8618b;
                this.f8623g.setLayoutParams(layoutParams);
                this.f8625i.setVisibility(0);
                this.f8625i.setScaleX(1.0f);
                this.f8625i.setScaleY(1.0f);
            } else {
                layoutParams = (LayoutParams) this.f8623g.getLayoutParams();
                layoutParams.gravity = 17;
                layoutParams.topMargin = this.f8618b;
                this.f8623g.setLayoutParams(layoutParams);
                this.f8625i.setVisibility(4);
                this.f8625i.setScaleX(0.5f);
                this.f8625i.setScaleY(0.5f);
            }
            this.f8624h.setVisibility(4);
        } else if (z) {
            layoutParams = (LayoutParams) this.f8623g.getLayoutParams();
            layoutParams.gravity = 49;
            layoutParams.topMargin = this.f8618b + this.f8619c;
            this.f8623g.setLayoutParams(layoutParams);
            this.f8625i.setVisibility(0);
            this.f8624h.setVisibility(4);
            this.f8625i.setScaleX(1.0f);
            this.f8625i.setScaleY(1.0f);
            this.f8624h.setScaleX(this.f8620d);
            this.f8624h.setScaleY(this.f8620d);
        } else {
            layoutParams = (LayoutParams) this.f8623g.getLayoutParams();
            layoutParams.gravity = 49;
            layoutParams.topMargin = this.f8618b;
            this.f8623g.setLayoutParams(layoutParams);
            this.f8625i.setVisibility(4);
            this.f8624h.setVisibility(0);
            this.f8625i.setScaleX(this.f8621e);
            this.f8625i.setScaleY(this.f8621e);
            this.f8624h.setScaleX(1.0f);
            this.f8624h.setScaleY(1.0f);
        }
        refreshDrawableState();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f8624h.setEnabled(z);
        this.f8625i.setEnabled(z);
        this.f8623g.setEnabled(z);
        if (z) {
            ViewCompat.m2187a((View) this, C0601j.m2350a(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE));
        } else {
            ViewCompat.m2187a((View) this, (C0601j) false);
        }
    }

    public int[] onCreateDrawableState(int i) {
        i = super.onCreateDrawableState(i + 1);
        if (this.f8627k != null && this.f8627k.isCheckable() && this.f8627k.isChecked()) {
            mergeDrawableStates(i, f8617a);
        }
        return i;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C0450a.m1730g(drawable).mutate();
            C0450a.m1719a(drawable, this.f8628l);
        }
        this.f8623g.setImageDrawable(drawable);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f8628l = colorStateList;
        if (this.f8627k != null) {
            setIcon(this.f8627k.getIcon());
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f8624h.setTextColor(colorStateList);
        this.f8625i.setTextColor(colorStateList);
    }

    public void setItemBackground(int i) {
        ViewCompat.m2183a((View) this, i == 0 ? 0 : C0432b.m1640a(getContext(), i));
    }
}
