package android.support.design.internal;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.SubMenu;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.design.internal.b */
public class C3991b extends MenuBuilder {
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i, i2, i3, charSequence);
        i2 = new C4309d(getContext(), this, menuItemImpl);
        menuItemImpl.setSubMenu(i2);
        return i2;
    }
}
