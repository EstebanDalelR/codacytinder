package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.graphics.drawable.C3999b;
import android.support.graphics.drawable.C4000h;
import android.support.v4.content.C0432b;
import android.support.v4.graphics.C0443a;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.util.C0550f;
import android.support.v4.util.C0551g;
import android.support.v4.util.C0563n;
import android.support.v4.util.C2880a;
import android.support.v7.appcompat.C0667R;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class AppCompatDrawableManager {
    private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = new int[]{C0667R.drawable.abc_popup_background_mtrl_mult, C0667R.drawable.abc_cab_background_internal_bg, C0667R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = new int[]{C0667R.drawable.abc_textfield_activated_mtrl_alpha, C0667R.drawable.abc_textfield_search_activated_mtrl_alpha, C0667R.drawable.abc_cab_background_top_mtrl_alpha, C0667R.drawable.abc_text_cursor_material, C0667R.drawable.abc_text_select_handle_left_mtrl_dark, C0667R.drawable.abc_text_select_handle_middle_mtrl_dark, C0667R.drawable.abc_text_select_handle_right_mtrl_dark, C0667R.drawable.abc_text_select_handle_left_mtrl_light, C0667R.drawable.abc_text_select_handle_middle_mtrl_light, C0667R.drawable.abc_text_select_handle_right_mtrl_light};
    private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = new int[]{C0667R.drawable.abc_textfield_search_default_mtrl_alpha, C0667R.drawable.abc_textfield_default_mtrl_alpha, C0667R.drawable.abc_ab_share_pack_mtrl_alpha};
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final boolean DEBUG = false;
    private static final Mode DEFAULT_MODE = Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "AppCompatDrawableManag";
    private static final int[] TINT_CHECKABLE_BUTTON_LIST = new int[]{C0667R.drawable.abc_btn_check_material, C0667R.drawable.abc_btn_radio_material};
    private static final int[] TINT_COLOR_CONTROL_NORMAL = new int[]{C0667R.drawable.abc_ic_commit_search_api_mtrl_alpha, C0667R.drawable.abc_seekbar_tick_mark_material, C0667R.drawable.abc_ic_menu_share_mtrl_alpha, C0667R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C0667R.drawable.abc_ic_menu_cut_mtrl_alpha, C0667R.drawable.abc_ic_menu_selectall_mtrl_alpha, C0667R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST = new int[]{C0667R.drawable.abc_tab_indicator_material, C0667R.drawable.abc_textfield_search_material};
    private C2880a<String, InflateDelegate> mDelegates;
    private final Object mDrawableCacheLock = new Object();
    private final WeakHashMap<Context, C0550f<WeakReference<ConstantState>>> mDrawableCaches = new WeakHashMap(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private C0563n<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, C0563n<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;

    private interface InflateDelegate {
        Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme);
    }

    @RequiresApi(11)
    private static class AvdcInflateDelegate implements InflateDelegate {
        AvdcInflateDelegate() {
        }

        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
            try {
                return C3999b.m15679a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Context context2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", context2);
                return null;
            }
        }
    }

    private static class ColorFilterLruCache extends C0551g<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i) {
            super(i);
        }

        PorterDuffColorFilter get(int i, Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        PorterDuffColorFilter put(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }

        private static int generateCacheKey(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    private static class VdcInflateDelegate implements InflateDelegate {
        VdcInflateDelegate() {
        }

        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
            try {
                return C4000h.m15689a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Context context2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", context2);
                return null;
            }
        }
    }

    public static AppCompatDrawableManager get() {
        if (INSTANCE == null) {
            INSTANCE = new AppCompatDrawableManager();
            installDefaultInflateDelegates(INSTANCE);
        }
        return INSTANCE;
    }

    private static void installDefaultInflateDelegates(@NonNull AppCompatDrawableManager appCompatDrawableManager) {
        if (VERSION.SDK_INT < 24) {
            appCompatDrawableManager.addDelegate("vector", new VdcInflateDelegate());
            appCompatDrawableManager.addDelegate("animated-vector", new AvdcInflateDelegate());
        }
    }

    public Drawable getDrawable(@NonNull Context context, @DrawableRes int i) {
        return getDrawable(context, i, false);
    }

    Drawable getDrawable(@NonNull Context context, @DrawableRes int i, boolean z) {
        checkVectorDrawableSetup(context);
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = C0432b.m1640a(context, i);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i, z, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }

    public void onConfigurationChanged(@NonNull Context context) {
        synchronized (this.mDrawableCacheLock) {
            C0550f c0550f = (C0550f) this.mDrawableCaches.get(context);
            if (c0550f != null) {
                c0550f.m2034c();
            }
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable createDrawableIfNeeded(@NonNull Context context, @DrawableRes int i) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (i == C0667R.drawable.abc_cab_background_top_material) {
            cachedDrawable = new LayerDrawable(new Drawable[]{getDrawable(context, C0667R.drawable.abc_cab_background_internal_bg), getDrawable(context, C0667R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (cachedDrawable != null) {
            cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, cachedDrawable);
        }
        return cachedDrawable;
    }

    private Drawable tintDrawable(@NonNull Context context, @DrawableRes int i, boolean z, @NonNull Drawable drawable) {
        ColorStateList tintList = getTintList(context, i);
        if (tintList != null) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable) != null) {
                drawable = drawable.mutate();
            }
            drawable = C0450a.m1730g(drawable);
            C0450a.m1719a(drawable, tintList);
            Mode tintMode = getTintMode(i);
            if (tintMode == null) {
                return drawable;
            }
            C0450a.m1722a(drawable, tintMode);
            return drawable;
        } else if (i == C0667R.drawable.abc_seekbar_track_material) {
            r6 = (LayerDrawable) drawable;
            setPorterDuffColorFilter(r6.findDrawableByLayerId(16908288), ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(r6.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(r6.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorControlActivated), DEFAULT_MODE);
            return drawable;
        } else {
            if (!(i == C0667R.drawable.abc_ratingbar_material || i == C0667R.drawable.abc_ratingbar_indicator_material)) {
                if (i != C0667R.drawable.abc_ratingbar_small_material) {
                    if (tintDrawableUsingColorFilter(context, i, drawable) == null && z) {
                        return null;
                    }
                    return drawable;
                }
            }
            r6 = (LayerDrawable) drawable;
            setPorterDuffColorFilter(r6.findDrawableByLayerId(16908288), ThemeUtils.getDisabledThemeAttrColor(context, C0667R.attr.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(r6.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorControlActivated), DEFAULT_MODE);
            setPorterDuffColorFilter(r6.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorControlActivated), DEFAULT_MODE);
            return drawable;
        }
    }

    private Drawable loadDrawableFromDelegates(@NonNull Context context, @DrawableRes int i) {
        if (this.mDelegates == null || this.mDelegates.isEmpty()) {
            return null;
        }
        if (this.mKnownDrawableIdTags != null) {
            String str = (String) this.mKnownDrawableIdTags.m2080a(i);
            if (SKIP_DRAWABLE_TAG.equals(str) || (str != null && this.mDelegates.get(str) == null)) {
                return null;
            }
        }
        this.mKnownDrawableIdTags = new C0563n();
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                int next;
                String name;
                InflateDelegate inflateDelegate;
                XmlPullParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        if (next == 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        name = xml.getName();
                        this.mKnownDrawableIdTags.m2087c(i, name);
                        inflateDelegate = (InflateDelegate) this.mDelegates.get(name);
                        if (inflateDelegate != null) {
                            cachedDrawable = inflateDelegate.createFromXmlInner(context, xml, asAttributeSet, context.getTheme());
                        }
                        if (cachedDrawable != null) {
                            cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                            addDrawableToCache(context, createCacheKey, cachedDrawable);
                        }
                    }
                }
                if (next == 2) {
                    name = xml.getName();
                    this.mKnownDrawableIdTags.m2087c(i, name);
                    inflateDelegate = (InflateDelegate) this.mDelegates.get(name);
                    if (inflateDelegate != null) {
                        cachedDrawable = inflateDelegate.createFromXmlInner(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (cachedDrawable != null) {
                        cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                        addDrawableToCache(context, createCacheKey, cachedDrawable);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Context context2) {
                Log.e(TAG, "Exception while inflating drawable", context2);
            }
        }
        if (cachedDrawable == null) {
            this.mKnownDrawableIdTags.m2087c(i, SKIP_DRAWABLE_TAG);
        }
        return cachedDrawable;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable getCachedDrawable(@android.support.annotation.NonNull android.content.Context r5, long r6) {
        /*
        r4 = this;
        r0 = r4.mDrawableCacheLock;
        monitor-enter(r0);
        r1 = r4.mDrawableCaches;	 Catch:{ all -> 0x002f }
        r1 = r1.get(r5);	 Catch:{ all -> 0x002f }
        r1 = (android.support.v4.util.C0550f) r1;	 Catch:{ all -> 0x002f }
        r2 = 0;
        if (r1 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r2;
    L_0x0010:
        r3 = r1.m2025a(r6);	 Catch:{ all -> 0x002f }
        r3 = (java.lang.ref.WeakReference) r3;	 Catch:{ all -> 0x002f }
        if (r3 == 0) goto L_0x002d;
    L_0x0018:
        r3 = r3.get();	 Catch:{ all -> 0x002f }
        r3 = (android.graphics.drawable.Drawable.ConstantState) r3;	 Catch:{ all -> 0x002f }
        if (r3 == 0) goto L_0x002a;
    L_0x0020:
        r5 = r5.getResources();	 Catch:{ all -> 0x002f }
        r5 = r3.newDrawable(r5);	 Catch:{ all -> 0x002f }
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r5;
    L_0x002a:
        r1.m2031b(r6);	 Catch:{ all -> 0x002f }
    L_0x002d:
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r2;
    L_0x002f:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatDrawableManager.getCachedDrawable(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private boolean addDrawableToCache(@NonNull Context context, long j, @NonNull Drawable drawable) {
        drawable = drawable.getConstantState();
        if (drawable == null) {
            return null;
        }
        synchronized (this.mDrawableCacheLock) {
            C0550f c0550f = (C0550f) this.mDrawableCaches.get(context);
            if (c0550f == null) {
                c0550f = new C0550f();
                this.mDrawableCaches.put(context, c0550f);
            }
            c0550f.m2032b(j, new WeakReference(drawable));
        }
        return true;
    }

    Drawable onDrawableLoadedFromResources(@NonNull Context context, @NonNull VectorEnabledTintResources vectorEnabledTintResources, @DrawableRes int i) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = vectorEnabledTintResources.superGetDrawable(i);
        }
        return loadDrawableFromDelegates != null ? tintDrawable(context, i, null, loadDrawableFromDelegates) : null;
    }

    static boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable) {
        int round;
        Mode mode = DEFAULT_MODE;
        int i2 = 16842801;
        if (arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i)) {
            i2 = C0667R.attr.colorControlNormal;
        } else if (arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i)) {
            i2 = C0667R.attr.colorControlActivated;
        } else if (arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i)) {
            mode = Mode.MULTIPLY;
        } else {
            if (i == C0667R.drawable.abc_list_divider_mtrl_alpha) {
                i2 = 16842800;
                round = Math.round(1109603123);
                i = 1;
            } else if (i != C0667R.drawable.abc_dialog_material_background) {
                i = 0;
                round = -1;
                i2 = 0;
            }
            if (i != 0) {
                return false;
            }
            if (DrawableUtils.canSafelyMutateDrawable(drawable) != 0) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i2), mode));
            if (round != -1) {
                drawable.setAlpha(round);
            }
            return true;
        }
        i = 1;
        round = -1;
        if (i != 0) {
            return false;
        }
        if (DrawableUtils.canSafelyMutateDrawable(drawable) != 0) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i2), mode));
        if (round != -1) {
            drawable.setAlpha(round);
        }
        return true;
    }

    private void addDelegate(@NonNull String str, @NonNull InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new C2880a();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    private void removeDelegate(@NonNull String str, @NonNull InflateDelegate inflateDelegate) {
        if (this.mDelegates != null && this.mDelegates.get(str) == inflateDelegate) {
            this.mDelegates.remove(str);
        }
    }

    private static boolean arrayContains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return 1;
            }
        }
        return false;
    }

    static Mode getTintMode(int i) {
        return i == C0667R.drawable.abc_switch_thumb_material ? Mode.MULTIPLY : 0;
    }

    ColorStateList getTintList(@NonNull Context context, @DrawableRes int i) {
        ColorStateList tintListFromCache = getTintListFromCache(context, i);
        if (tintListFromCache == null) {
            if (i == C0667R.drawable.abc_edit_text_material) {
                tintListFromCache = AppCompatResources.getColorStateList(context, C0667R.color.abc_tint_edittext);
            } else if (i == C0667R.drawable.abc_switch_track_mtrl_alpha) {
                tintListFromCache = AppCompatResources.getColorStateList(context, C0667R.color.abc_tint_switch_track);
            } else if (i == C0667R.drawable.abc_switch_thumb_material) {
                tintListFromCache = createSwitchThumbColorStateList(context);
            } else if (i == C0667R.drawable.abc_btn_default_mtrl_shape) {
                tintListFromCache = createDefaultButtonColorStateList(context);
            } else if (i == C0667R.drawable.abc_btn_borderless_material) {
                tintListFromCache = createBorderlessButtonColorStateList(context);
            } else if (i == C0667R.drawable.abc_btn_colored_material) {
                tintListFromCache = createColoredButtonColorStateList(context);
            } else {
                if (i != C0667R.drawable.abc_spinner_mtrl_am_alpha) {
                    if (i != C0667R.drawable.abc_spinner_textfield_background_material) {
                        if (arrayContains(TINT_COLOR_CONTROL_NORMAL, i)) {
                            tintListFromCache = ThemeUtils.getThemeAttrColorStateList(context, C0667R.attr.colorControlNormal);
                        } else if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i)) {
                            tintListFromCache = AppCompatResources.getColorStateList(context, C0667R.color.abc_tint_default);
                        } else if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, i)) {
                            tintListFromCache = AppCompatResources.getColorStateList(context, C0667R.color.abc_tint_btn_checkable);
                        } else if (i == C0667R.drawable.abc_seekbar_thumb_material) {
                            tintListFromCache = AppCompatResources.getColorStateList(context, C0667R.color.abc_tint_seek_thumb);
                        }
                    }
                }
                tintListFromCache = AppCompatResources.getColorStateList(context, C0667R.color.abc_tint_spinner);
            }
            if (tintListFromCache != null) {
                addTintListToCache(context, i, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    private ColorStateList getTintListFromCache(@NonNull Context context, @DrawableRes int i) {
        ColorStateList colorStateList = null;
        if (this.mTintLists == null) {
            return null;
        }
        C0563n c0563n = (C0563n) this.mTintLists.get(context);
        if (c0563n != null) {
            colorStateList = (ColorStateList) c0563n.m2080a(i);
        }
        return colorStateList;
    }

    private void addTintListToCache(@NonNull Context context, @DrawableRes int i, @NonNull ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap();
        }
        C0563n c0563n = (C0563n) this.mTintLists.get(context);
        if (c0563n == null) {
            c0563n = new C0563n();
            this.mTintLists.put(context, c0563n);
        }
        c0563n.m2087c(i, colorStateList);
    }

    private ColorStateList createDefaultButtonColorStateList(@NonNull Context context) {
        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorButtonNormal));
    }

    private ColorStateList createBorderlessButtonColorStateList(@NonNull Context context) {
        return createButtonColorStateList(context, 0);
    }

    private ColorStateList createColoredButtonColorStateList(@NonNull Context context) {
        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorAccent));
    }

    private ColorStateList createButtonColorStateList(@NonNull Context context, @ColorInt int i) {
        r1 = new int[4][];
        r0 = new int[4];
        int themeAttrColor = ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorControlHighlight);
        context = ThemeUtils.getDisabledThemeAttrColor(context, C0667R.attr.colorButtonNormal);
        r1[0] = ThemeUtils.DISABLED_STATE_SET;
        r0[0] = context;
        r1[1] = ThemeUtils.PRESSED_STATE_SET;
        r0[1] = C0443a.m1681a(themeAttrColor, i);
        r1[2] = ThemeUtils.FOCUSED_STATE_SET;
        r0[2] = C0443a.m1681a(themeAttrColor, i);
        r1[3] = ThemeUtils.EMPTY_STATE_SET;
        r0[3] = i;
        return new ColorStateList(r1, r0);
    }

    private ColorStateList createSwitchThumbColorStateList(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, C0667R.attr.colorSwitchThumbNormal);
        if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, C0667R.attr.colorSwitchThumbNormal);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorSwitchThumbNormal);
        } else {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = themeAttrColorStateList.getColorForState(iArr[0], 0);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, C0667R.attr.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = themeAttrColorStateList.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        if (!DrawableUtils.canSafelyMutateDrawable(drawable) || drawable.mutate() == drawable) {
            if (!tintInfo.mHasTintList) {
                if (!tintInfo.mHasTintMode) {
                    drawable.clearColorFilter();
                    if (VERSION.SDK_INT <= 23) {
                        drawable.invalidateSelf();
                    }
                    return;
                }
            }
            drawable.setColorFilter(createTintFilter(tintInfo.mHasTintList ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d(TAG, "Mutated drawable is not the same instance as the input.");
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList != null) {
            if (mode != null) {
                return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
            }
        }
        return null;
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter = COLOR_FILTER_CACHE.get(i, mode);
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        COLOR_FILTER_CACHE.put(i, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i, Mode mode) {
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = DEFAULT_MODE;
        }
        drawable.setColorFilter(getPorterDuffColorFilter(i, mode));
    }

    private void checkVectorDrawableSetup(@NonNull Context context) {
        if (!this.mHasCheckedVectorDrawableSetup) {
            this.mHasCheckedVectorDrawableSetup = true;
            context = getDrawable(context, C0667R.drawable.abc_vector_test);
            if (context != null) {
                if (isVectorDrawable(context) != null) {
                    return;
                }
            }
            this.mHasCheckedVectorDrawableSetup = null;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static boolean isVectorDrawable(@NonNull Drawable drawable) {
        if (!(drawable instanceof C4000h)) {
            if (PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName()) == null) {
                return null;
            }
        }
        return true;
    }
}
