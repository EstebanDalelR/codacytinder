package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.C0667R;
import android.support.v7.view.menu.MenuView.ItemView;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ListMenuItemView extends LinearLayout implements ItemView {
    private static final String TAG = "ListMenuItemView";
    private Drawable mBackground;
    private CheckBox mCheckBox;
    private boolean mForceShowIcon;
    private ImageView mIconView;
    private LayoutInflater mInflater;
    private MenuItemImpl mItemData;
    private int mMenuType;
    private boolean mPreserveIconSpacing;
    private RadioButton mRadioButton;
    private TextView mShortcutView;
    private Drawable mSubMenuArrow;
    private ImageView mSubMenuArrowView;
    private int mTextAppearance;
    private Context mTextAppearanceContext;
    private TextView mTitleView;

    public boolean prefersCondensedTitle() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0667R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        attributeSet = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, C0667R.styleable.MenuView, i, 0);
        this.mBackground = attributeSet.getDrawable(C0667R.styleable.MenuView_android_itemBackground);
        this.mTextAppearance = attributeSet.getResourceId(C0667R.styleable.MenuView_android_itemTextAppearance, -1);
        this.mPreserveIconSpacing = attributeSet.getBoolean(C0667R.styleable.MenuView_preserveIconSpacing, false);
        this.mTextAppearanceContext = context;
        this.mSubMenuArrow = attributeSet.getDrawable(C0667R.styleable.MenuView_subMenuArrow);
        attributeSet.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.m2183a((View) this, this.mBackground);
        this.mTitleView = (TextView) findViewById(C0667R.id.title);
        if (this.mTextAppearance != -1) {
            this.mTitleView.setTextAppearance(this.mTextAppearanceContext, this.mTextAppearance);
        }
        this.mShortcutView = (TextView) findViewById(C0667R.id.shortcut);
        this.mSubMenuArrowView = (ImageView) findViewById(C0667R.id.submenuarrow);
        if (this.mSubMenuArrowView != null) {
            this.mSubMenuArrowView.setImageDrawable(this.mSubMenuArrow);
        }
    }

    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.mItemData = menuItemImpl;
        this.mMenuType = i;
        setVisibility(menuItemImpl.isVisible() != 0 ? 0 : 8);
        setTitle(menuItemImpl.getTitleForItemView(this));
        setCheckable(menuItemImpl.isCheckable());
        setShortcut(menuItemImpl.shouldShowShortcut(), menuItemImpl.getShortcut());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
        this.mPreserveIconSpacing = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.mTitleView.setText(charSequence);
            if (this.mTitleView.getVisibility() != null) {
                this.mTitleView.setVisibility(0);
            }
        } else if (this.mTitleView.getVisibility() != 8) {
            this.mTitleView.setVisibility(8);
        }
    }

    public MenuItemImpl getItemData() {
        return this.mItemData;
    }

    public void setCheckable(boolean z) {
        if (z || this.mRadioButton != null || this.mCheckBox != null) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.mItemData.isExclusiveCheckable()) {
                if (this.mRadioButton == null) {
                    insertRadioButton();
                }
                compoundButton = this.mRadioButton;
                compoundButton2 = this.mCheckBox;
            } else {
                if (this.mCheckBox == null) {
                    insertCheckBox();
                }
                compoundButton = this.mCheckBox;
                compoundButton2 = this.mRadioButton;
            }
            if (z) {
                compoundButton.setChecked(this.mItemData.isChecked());
                z = z ? false : true;
                if (compoundButton.getVisibility() != z) {
                    compoundButton.setVisibility(z);
                }
                if (!(compoundButton2 == null || compoundButton2.getVisibility())) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                if (this.mCheckBox) {
                    this.mCheckBox.setVisibility(8);
                }
                if (this.mRadioButton) {
                    this.mRadioButton.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.mItemData.isExclusiveCheckable()) {
            if (this.mRadioButton == null) {
                insertRadioButton();
            }
            compoundButton = this.mRadioButton;
        } else {
            if (this.mCheckBox == null) {
                insertCheckBox();
            }
            compoundButton = this.mCheckBox;
        }
        compoundButton.setChecked(z);
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.mSubMenuArrowView != null) {
            this.mSubMenuArrowView.setVisibility(z ? false : true);
        }
    }

    public void setShortcut(boolean z, char c) {
        z = (z && this.mItemData.shouldShowShortcut()) ? false : true;
        if (!z) {
            this.mShortcutView.setText(this.mItemData.getShortcutLabel());
        }
        if (this.mShortcutView.getVisibility() != z) {
            this.mShortcutView.setVisibility(z);
        }
    }

    public void setIcon(Drawable drawable) {
        Object obj;
        ImageView imageView;
        if (!this.mItemData.shouldShowIcon()) {
            if (!this.mForceShowIcon) {
                obj = null;
                if (obj != null && !this.mPreserveIconSpacing) {
                    return;
                }
                if (this.mIconView == null || drawable != null || this.mPreserveIconSpacing) {
                    if (this.mIconView == null) {
                        insertIconView();
                    }
                    if (drawable == null) {
                        if (this.mPreserveIconSpacing) {
                            this.mIconView.setVisibility(8);
                        }
                    }
                    imageView = this.mIconView;
                    if (obj != null) {
                        drawable = null;
                    }
                    imageView.setImageDrawable(drawable);
                    if (this.mIconView.getVisibility() != null) {
                        this.mIconView.setVisibility(0);
                    }
                }
                return;
            }
        }
        obj = 1;
        if (obj != null) {
        }
        if (this.mIconView == null) {
        }
        if (this.mIconView == null) {
            insertIconView();
        }
        if (drawable == null) {
            if (this.mPreserveIconSpacing) {
                this.mIconView.setVisibility(8);
            }
        }
        imageView = this.mIconView;
        if (obj != null) {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        if (this.mIconView.getVisibility() != null) {
            this.mIconView.setVisibility(0);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.mIconView != null && this.mPreserveIconSpacing) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mIconView.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private void insertIconView() {
        this.mIconView = (ImageView) getInflater().inflate(C0667R.layout.abc_list_menu_item_icon, this, false);
        addView(this.mIconView, 0);
    }

    private void insertRadioButton() {
        this.mRadioButton = (RadioButton) getInflater().inflate(C0667R.layout.abc_list_menu_item_radio, this, false);
        addView(this.mRadioButton);
    }

    private void insertCheckBox() {
        this.mCheckBox = (CheckBox) getInflater().inflate(C0667R.layout.abc_list_menu_item_checkbox, this, false);
        addView(this.mCheckBox);
    }

    public boolean showsIcon() {
        return this.mForceShowIcon;
    }

    private LayoutInflater getInflater() {
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getContext());
        }
        return this.mInflater;
    }
}
