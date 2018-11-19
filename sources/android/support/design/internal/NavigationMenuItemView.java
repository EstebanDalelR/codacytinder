package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.design.C0181a.C0173d;
import android.support.design.C0181a.C0174e;
import android.support.design.C0181a.C0175f;
import android.support.design.C0181a.C0177h;
import android.support.v4.content.res.C0441a;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.view.C0582a;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.C0586b;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.appcompat.C0667R;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView.ItemView;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

@RestrictTo({Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements ItemView {
    /* renamed from: d */
    private static final int[] f12671d = new int[]{16842912};
    /* renamed from: c */
    boolean f12672c;
    /* renamed from: e */
    private final int f12673e;
    /* renamed from: f */
    private boolean f12674f;
    /* renamed from: g */
    private final CheckedTextView f12675g;
    /* renamed from: h */
    private FrameLayout f12676h;
    /* renamed from: i */
    private MenuItemImpl f12677i;
    /* renamed from: j */
    private ColorStateList f12678j;
    /* renamed from: k */
    private boolean f12679k;
    /* renamed from: l */
    private Drawable f12680l;
    /* renamed from: m */
    private final C0582a f12681m;

    /* renamed from: android.support.design.internal.NavigationMenuItemView$1 */
    class C27471 extends C0582a {
        /* renamed from: a */
        final /* synthetic */ NavigationMenuItemView f8639a;

        C27471(NavigationMenuItemView navigationMenuItemView) {
            this.f8639a = navigationMenuItemView;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
            super.onInitializeAccessibilityNodeInfo(view, c0586b);
            c0586b.m2260a(this.f8639a.f12672c);
        }
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12681m = new C27471(this);
        setOrientation(null);
        LayoutInflater.from(context).inflate(C0177h.design_navigation_menu_item, this, true);
        this.f12673e = context.getResources().getDimensionPixelSize(C0173d.design_navigation_icon_size);
        this.f12675g = (CheckedTextView) findViewById(C0175f.design_menu_item_text);
        this.f12675g.setDuplicateParentStateEnabled(true);
        ViewCompat.m2185a(this.f12675g, this.f12681m);
    }

    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.f12677i = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() != 0 ? 0 : 8);
        if (getBackground() == 0) {
            ViewCompat.m2183a((View) this, m15607d());
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        m15606c();
    }

    /* renamed from: b */
    private boolean m15605b() {
        return this.f12677i.getTitle() == null && this.f12677i.getIcon() == null && this.f12677i.getActionView() != null;
    }

    /* renamed from: c */
    private void m15606c() {
        if (m15605b()) {
            this.f12675g.setVisibility(8);
            if (this.f12676h != null) {
                LayoutParams layoutParams = (LayoutParams) this.f12676h.getLayoutParams();
                layoutParams.width = -1;
                this.f12676h.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f12675g.setVisibility(0);
        if (this.f12676h != null) {
            layoutParams = (LayoutParams) this.f12676h.getLayoutParams();
            layoutParams.width = -2;
            this.f12676h.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public void m15608a() {
        if (this.f12676h != null) {
            this.f12676h.removeAllViews();
        }
        this.f12675g.setCompoundDrawables(null, null, null, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f12676h == null) {
                this.f12676h = (FrameLayout) ((ViewStub) findViewById(C0175f.design_menu_item_action_area_stub)).inflate();
            }
            this.f12676h.removeAllViews();
            this.f12676h.addView(view);
        }
    }

    /* renamed from: d */
    private StateListDrawable m15607d() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0667R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f12671d, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public MenuItemImpl getItemData() {
        return this.f12677i;
    }

    public void setTitle(CharSequence charSequence) {
        this.f12675g.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f12672c != z) {
            this.f12672c = z;
            this.f12681m.sendAccessibilityEvent(this.f12675g, ItemAnimator.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f12675g.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f12679k) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0450a.m1730g(drawable).mutate();
                C0450a.m1719a(drawable, this.f12678j);
            }
            drawable.setBounds(0, 0, this.f12673e, this.f12673e);
        } else if (this.f12674f) {
            if (this.f12680l == null) {
                this.f12680l = C0441a.m1669a(getResources(), C0174e.navigation_empty_icon, getContext().getTheme());
                if (this.f12680l != null) {
                    this.f12680l.setBounds(0, 0, this.f12673e, this.f12673e);
                }
            }
            drawable = this.f12680l;
        }
        TextViewCompat.m2518a(this.f12675g, drawable, null, null, null);
    }

    protected int[] onCreateDrawableState(int i) {
        i = super.onCreateDrawableState(i + 1);
        if (this.f12677i != null && this.f12677i.isCheckable() && this.f12677i.isChecked()) {
            mergeDrawableStates(i, f12671d);
        }
        return i;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f12678j = colorStateList;
        this.f12679k = this.f12678j != null ? true : null;
        if (this.f12677i != null) {
            setIcon(this.f12677i.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        TextViewCompat.m2517a(this.f12675g, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f12675g.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f12674f = z;
    }
}
