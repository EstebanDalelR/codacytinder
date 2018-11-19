package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.v4.content.C0432b;
import android.support.v4.graphics.C0443a;
import android.support.v4.graphics.drawable.C0450a;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.accountkit.C1196d.C1189b;
import com.facebook.accountkit.C1196d.C1190c;
import com.facebook.accountkit.C1196d.C1191d;
import com.facebook.accountkit.ui.SkinManager.Skin;

final class ag {
    /* renamed from: a */
    static void m4602a(Context context, UIManager uIManager, View view) {
        if (context != null) {
            if (view != null) {
                if (view instanceof Button) {
                    m4603a(context, uIManager, (Button) view);
                } else if (view instanceof EditText) {
                    m4604a(context, uIManager, (EditText) view);
                } else if (view instanceof ProgressBar) {
                    m4605a(context, uIManager, (ProgressBar) view);
                } else if (view instanceof C4341i) {
                    m4607a(context, uIManager, (C4341i) view);
                } else if (view instanceof TextView) {
                    m4606a(context, uIManager, (TextView) view);
                } else if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m4602a(context, uIManager, viewGroup.getChildAt(i));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    static void m4615b(Context context, UIManager uIManager, View view) {
        if (context != null) {
            if (view != null) {
                if (uIManager instanceof SkinManager) {
                    m4601a(context, (SkinManager) uIManager, view);
                } else {
                    m4614b(context, view);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m4601a(Context context, SkinManager skinManager, View view) {
        Drawable a;
        if (skinManager.hasBackgroundImage()) {
            a = m4597a(context.getResources(), skinManager.getBackgroundImageResId());
        } else {
            a = new ColorDrawable(C0432b.m1647c(context, C1190c.com_accountkit_default_skin_background));
        }
        if (skinManager.hasBackgroundImage()) {
            if (view instanceof AspectFrameLayout) {
                AspectFrameLayout aspectFrameLayout = (AspectFrameLayout) view;
                aspectFrameLayout.setAspectWidth(a.getIntrinsicWidth());
                aspectFrameLayout.setAspectHeight(a.getIntrinsicHeight());
            }
            a.setColorFilter(skinManager.getTintColor(), Mode.SRC_ATOP);
        }
        m4609a(view, a);
    }

    /* renamed from: a */
    private static Drawable m4596a(Context context, View view) {
        Drawable colorDrawable;
        Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(C1189b.com_accountkit_background, typedValue, true);
        if (typedValue.resourceId == 0) {
            colorDrawable = new ColorDrawable(m4592a(context, C1189b.com_accountkit_background_color, -1));
        } else {
            colorDrawable = m4597a(context.getResources(), typedValue.resourceId);
        }
        if (typedValue.resourceId > 0) {
            if (view instanceof AspectFrameLayout) {
                AspectFrameLayout aspectFrameLayout = (AspectFrameLayout) view;
                aspectFrameLayout.setAspectWidth(colorDrawable.getIntrinsicWidth());
                aspectFrameLayout.setAspectHeight(colorDrawable.getIntrinsicHeight());
            }
            m4599a(context, colorDrawable, m4592a(context, C1189b.com_accountkit_background_color, -1));
        }
        return colorDrawable;
    }

    /* renamed from: b */
    private static void m4614b(Context context, View view) {
        m4609a(view, m4596a(context, view));
    }

    /* renamed from: a */
    static void m4599a(Context context, Drawable drawable, @ColorInt int i) {
        if (context != null) {
            if (drawable != null) {
                drawable.setColorFilter(i, Mode.SRC_ATOP);
            }
        }
    }

    /* renamed from: a */
    static void m4600a(Context context, ImageView imageView, @ColorInt int i) {
        if (context != null) {
            if (imageView != null) {
                imageView.setColorFilter(i, Mode.SRC_ATOP);
            }
        }
    }

    /* renamed from: a */
    static int m4591a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    static boolean m4610a(Context context) {
        Object obj = (context.getResources().getConfiguration().screenLayout & 15) == 4 ? 1 : null;
        context = (context.getResources().getConfiguration().screenLayout & 15) == 3 ? true : null;
        if (obj == null && context == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static void m4608a(View view) {
        if (view != null) {
            if (view.getContext() != null) {
                if (view.requestFocus()) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
                }
            }
        }
    }

    /* renamed from: a */
    static void m4598a(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        if (findViewById != null) {
            View findFocus = findViewById.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(findViewById.getWindowToken(), 1);
        }
    }

    /* renamed from: a */
    static boolean m4611a(UIManager uIManager) {
        return (uIManager instanceof SkinManager) == null ? true : null;
    }

    /* renamed from: a */
    static boolean m4612a(UIManager uIManager, Skin skin) {
        return ((uIManager instanceof SkinManager) && ((SkinManager) uIManager).getSkin() == skin) ? true : null;
    }

    /* renamed from: a */
    private static void m4603a(Context context, UIManager uIManager, Button button) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int i;
        int c;
        if (m4611a(uIManager)) {
            c = m4617c(context, uIManager);
            a = m4592a(context, C1189b.com_accountkit_button_border_color, c);
            a2 = m4592a(context, C1189b.com_accountkit_button_pressed_background_color, -3355444);
            a3 = m4592a(context, C1189b.com_accountkit_button_pressed_border_color, a2);
            a4 = m4592a(context, C1189b.com_accountkit_button_disabled_background_color, -3355444);
            a5 = m4592a(context, C1189b.com_accountkit_button_disabled_border_color, a4);
            i = a4;
            a4 = a2;
            a2 = a;
            a = c;
        } else {
            c = m4619d(context, uIManager);
            a = ((SkinManager) uIManager).getDisabledColor(c);
            a2 = m4612a(uIManager, Skin.TRANSLUCENT) ? 0 : c;
            a4 = m4612a(uIManager, Skin.TRANSLUCENT) ? 0 : a;
            if (m4612a(uIManager, Skin.TRANSLUCENT)) {
                a = c;
            }
            a3 = c;
            a5 = a;
            i = a4;
            a = a3;
            a4 = a2;
            a2 = a;
        }
        m4609a((View) button, m4595a(context, a, a2, a4, a3, i, a5));
        ColorStateList e = m4620e(context, uIManager);
        button.setTextColor(e);
        Drawable[] compoundDrawables = button.getCompoundDrawables();
        if (compoundDrawables.length >= 4) {
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    C0450a.m1719a(C0450a.m1730g(drawable), e);
                }
            }
        }
    }

    /* renamed from: a */
    private static Drawable m4595a(Context context, int i, int i2, int i3, int i4, int i5, int i6) {
        Drawable stateListDrawable = new StateListDrawable();
        if (VERSION.SDK_INT >= 21) {
            stateListDrawable.addState(new int[]{-16842910}, new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{i}), new ColorDrawable(i5), null));
            stateListDrawable.addState(new int[0], new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{i5}), new ColorDrawable(i), null));
        } else {
            stateListDrawable.addState(new int[]{-16842910}, m4613b(context, i5, i6));
            stateListDrawable.addState(new int[]{16842919}, m4613b(context, i3, i4));
            stateListDrawable.addState(new int[0], m4613b(context, i, i2));
        }
        return stateListDrawable;
    }

    @ColorInt
    /* renamed from: a */
    static int m4593a(Context context, UIManager uIManager) {
        if (m4611a(uIManager)) {
            return m4592a(context, C1189b.com_accountkit_button_text_color, -16777216);
        }
        return ((SkinManager) uIManager).getTextColor();
    }

    /* renamed from: e */
    private static ColorStateList m4620e(Context context, UIManager uIManager) {
        r1 = new int[3][];
        r1[0] = new int[]{-16842910};
        r1[1] = new int[]{16842919};
        r1[2] = new int[0];
        if (m4611a(uIManager)) {
            uIManager = new int[]{m4592a(context, C1189b.com_accountkit_button_disabled_text_color, -3355444), m4592a(context, C1189b.com_accountkit_button_pressed_text_color, -12303292), m4592a(context, C1189b.com_accountkit_button_text_color, -16777216)};
        } else {
            context = ((SkinManager) uIManager).getTextColor();
            uIManager = new int[]{context, context, context};
        }
        return new ColorStateList(r1, uIManager);
    }

    /* renamed from: a */
    private static void m4606a(Context context, UIManager uIManager, TextView textView) {
        if (m4611a(uIManager)) {
            context = m4592a(context, C1189b.com_accountkit_text_color, C0432b.m1647c(context, 17170433));
        } else {
            context = ((SkinManager) uIManager).getTextColor();
        }
        textView.setTextColor(context);
        textView.setLinkTextColor(context);
    }

    /* renamed from: b */
    static boolean m4616b(Context context, UIManager uIManager) {
        Theme newTheme;
        if (uIManager.getThemeId() != -1) {
            newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.applyStyle(uIManager.getThemeId(), true);
        } else {
            newTheme = context.getTheme();
        }
        if (m4611a(uIManager)) {
            context = m4594a(newTheme, C1189b.com_accountkit_text_color, C0432b.m1647c(context, 17170433));
        } else {
            context = ((SkinManager) uIManager).getTextColor();
        }
        if (m4611a(uIManager)) {
            uIManager = m4594a(newTheme, C1189b.com_accountkit_background_color, -1);
        } else {
            uIManager = ((SkinManager) uIManager).getTintColor();
        }
        if (C0443a.m1687b(context | -16777216, uIManager | -16777216) >= 1.5d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m4604a(Context context, UIManager uIManager, EditText editText) {
        if (!m4611a(uIManager)) {
            editText.setTextColor(((SkinManager) uIManager).getTextColor());
        }
        if (m4612a(uIManager, Skin.CONTEMPORARY)) {
            int d = m4619d(context, uIManager);
            Drawable mutate = C0450a.m1730g(editText.getBackground()).mutate();
            C0450a.m1717a(mutate, d);
            m4609a((View) editText, mutate);
            editText.setTextColor(((SkinManager) uIManager).getTextColor());
            return;
        }
        m4618c(context, uIManager, editText);
    }

    /* renamed from: c */
    private static void m4618c(Context context, UIManager uIManager, View view) {
        int a;
        if (m4611a(uIManager)) {
            a = m4592a(context, C1189b.com_accountkit_input_background_color, -3355444);
            m4609a(view, m4613b(context, a, m4592a(context, C1189b.com_accountkit_input_border_color, a)));
        } else if (m4612a(uIManager, Skin.TRANSLUCENT)) {
            m4609a(view, m4613b(context, 0, m4619d(context, uIManager)));
        } else {
            a = ((SkinManager) uIManager).getDisabledColor(m4619d(context, uIManager));
            m4609a(view, m4613b(context, a, a));
        }
    }

    /* renamed from: a */
    private static void m4605a(Context context, UIManager uIManager, ProgressBar progressBar) {
        int a;
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (m4611a(uIManager)) {
            a = m4592a(context, C1189b.com_accountkit_icon_color, -16777216);
        } else {
            a = m4619d(context, uIManager);
        }
        m4599a(context, indeterminateDrawable, a);
    }

    /* renamed from: a */
    private static void m4607a(Context context, UIManager uIManager, C4341i c4341i) {
        ViewGroup viewGroup = (ViewGroup) c4341i.getParent();
        ImageView imageView = (ImageView) viewGroup.getChildAt(1);
        View childAt = viewGroup.getChildAt(2);
        Drawable mutate = C0450a.m1730g(imageView.getDrawable()).mutate();
        if (m4612a(uIManager, Skin.CONTEMPORARY)) {
            childAt.setVisibility(null);
            m4609a(childAt, new ColorDrawable(m4619d(context, uIManager)));
            C0450a.m1717a(mutate, m4619d(context, uIManager));
            return;
        }
        if (!m4612a(uIManager, Skin.TRANSLUCENT)) {
            if (!m4612a(uIManager, Skin.CLASSIC)) {
                childAt.setVisibility(8);
                C0450a.m1717a(mutate, m4592a(context, C1189b.com_accountkit_input_accent_color, -16777216));
                m4618c(context, uIManager, viewGroup);
                return;
            }
        }
        childAt.setVisibility(8);
        C0450a.m1717a(mutate, ((SkinManager) uIManager).getTextColor());
        m4618c(context, uIManager, viewGroup);
    }

    @ColorInt
    /* renamed from: c */
    static int m4617c(Context context, UIManager uIManager) {
        if (uIManager instanceof SkinManager) {
            return ((SkinManager) uIManager).getPrimaryColor();
        }
        return m4592a(context, C1189b.com_accountkit_button_background_color, -3355444);
    }

    @ColorInt
    /* renamed from: d */
    static int m4619d(Context context, UIManager uIManager) {
        if (uIManager instanceof SkinManager) {
            return ((SkinManager) uIManager).getPrimaryColor();
        }
        return m4592a(context, C1189b.com_accountkit_primary_color, -3355444);
    }

    @ColorInt
    /* renamed from: a */
    static int m4592a(Context context, @AttrRes int i, int i2) {
        return m4594a(context.getTheme(), i, i2);
    }

    @ColorInt
    /* renamed from: a */
    static int m4594a(Theme theme, @AttrRes int i, int i2) {
        TypedValue typedValue = new TypedValue();
        return theme.resolveAttribute(i, typedValue, true) != null ? typedValue.data : i2;
    }

    /* renamed from: a */
    private static Drawable m4597a(Resources resources, int i) {
        if (VERSION.SDK_INT < 22) {
            return resources.getDrawable(i);
        }
        return resources.getDrawable(i, null);
    }

    /* renamed from: b */
    private static Drawable m4613b(Context context, @ColorInt int i, @ColorInt int i2) {
        Drawable gradientDrawable = new GradientDrawable();
        context = context.getResources();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(context.getDimension(C1191d.com_accountkit_input_corner_radius));
        gradientDrawable.setStroke(context.getDimensionPixelSize(C1191d.com_accountkit_input_border), i2);
        return gradientDrawable;
    }

    /* renamed from: a */
    static void m4609a(View view, Drawable drawable) {
        if (VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }
}
