package android.support.design.internal;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.SubMenuBuilder;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.design.internal.d */
public class C4309d extends SubMenuBuilder {
    public C4309d(Context context, C3991b c3991b, MenuItemImpl menuItemImpl) {
        super(context, c3991b, menuItemImpl);
    }

    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((MenuBuilder) getParentMenu()).onItemsChanged(z);
    }
}
