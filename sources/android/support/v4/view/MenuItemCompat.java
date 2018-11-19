package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.annotation.RequiresApi;
import android.support.v4.internal.view.SupportMenuItem;
import android.util.Log;
import android.view.MenuItem;

public final class MenuItemCompat {
    /* renamed from: a */
    static final C0566c f1750a;

    @Deprecated
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    /* renamed from: android.support.v4.view.MenuItemCompat$c */
    interface C0566c {
        /* renamed from: a */
        void mo582a(MenuItem menuItem, char c, int i);

        /* renamed from: a */
        void mo583a(MenuItem menuItem, ColorStateList colorStateList);

        /* renamed from: a */
        void mo584a(MenuItem menuItem, Mode mode);

        /* renamed from: a */
        void mo585a(MenuItem menuItem, CharSequence charSequence);

        /* renamed from: b */
        void mo586b(MenuItem menuItem, char c, int i);

        /* renamed from: b */
        void mo587b(MenuItem menuItem, CharSequence charSequence);
    }

    /* renamed from: android.support.v4.view.MenuItemCompat$b */
    static class C2883b implements C0566c {
        /* renamed from: a */
        public void mo582a(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: a */
        public void mo583a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        /* renamed from: a */
        public void mo584a(MenuItem menuItem, Mode mode) {
        }

        /* renamed from: a */
        public void mo585a(MenuItem menuItem, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo586b(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: b */
        public void mo587b(MenuItem menuItem, CharSequence charSequence) {
        }

        C2883b() {
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.view.MenuItemCompat$a */
    static class C4029a extends C2883b {
        C4029a() {
        }

        /* renamed from: a */
        public void mo585a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        /* renamed from: b */
        public void mo587b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }

        /* renamed from: a */
        public void mo582a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: b */
        public void mo586b(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: a */
        public void mo583a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo584a(MenuItem menuItem, Mode mode) {
            menuItem.setIconTintMode(mode);
        }
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1750a = new C4029a();
        } else {
            f1750a = new C2883b();
        }
    }

    /* renamed from: a */
    public static MenuItem m2106a(MenuItem menuItem, ActionProvider actionProvider) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).setSupportActionProvider(actionProvider);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m2110a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else {
            f1750a.mo585a(menuItem, charSequence);
        }
    }

    /* renamed from: b */
    public static void m2112b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setTooltipText(charSequence);
        } else {
            f1750a.mo587b(menuItem, charSequence);
        }
    }

    /* renamed from: a */
    public static void m2107a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setNumericShortcut(c, i);
        } else {
            f1750a.mo586b(menuItem, c, i);
        }
    }

    /* renamed from: b */
    public static void m2111b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setAlphabeticShortcut(c, i);
        } else {
            f1750a.mo582a(menuItem, c, i);
        }
    }

    /* renamed from: a */
    public static void m2108a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
        } else {
            f1750a.mo583a(menuItem, colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2109a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintMode(mode);
        } else {
            f1750a.mo584a(menuItem, mode);
        }
    }
}
