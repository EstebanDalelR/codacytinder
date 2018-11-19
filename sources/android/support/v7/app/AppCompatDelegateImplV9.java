package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.C0420r;
import android.support.v4.view.C0595d;
import android.support.v4.view.C0609n;
import android.support.v4.view.C0610p;
import android.support.v4.view.C2899o;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.C0667R;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.OnAttachListener;
import android.support.v7.widget.DecorContentParent;
import android.support.v7.widget.FitWindowsViewGroup;
import android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.support.v7.widget.ViewUtils;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.tinder.domain.config.model.ProfileEditingConfig;
import org.xmlpull.v1.XmlPullParser;

@RequiresApi(14)
class AppCompatDelegateImplV9 extends AppCompatDelegateImplBase implements Callback, Factory2 {
    private static final boolean IS_PRE_LOLLIPOP = (VERSION.SDK_INT < 21);
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private AppCompatViewInflater mAppCompatViewInflater;
    private boolean mClosingActionMenu;
    private DecorContentParent mDecorContentParent;
    private boolean mEnableDefaultActionBarUp;
    C0609n mFadeAnim = null;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    int mInvalidatePanelMenuFeatures;
    boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable = new C06631();
    private boolean mLongPressBackDown;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    private ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private TextView mTitleView;

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$1 */
    class C06631 implements Runnable {
        C06631() {
        }

        public void run() {
            if ((AppCompatDelegateImplV9.this.mInvalidatePanelMenuFeatures & 1) != 0) {
                AppCompatDelegateImplV9.this.doInvalidatePanelMenu(0);
            }
            if ((AppCompatDelegateImplV9.this.mInvalidatePanelMenuFeatures & 4096) != 0) {
                AppCompatDelegateImplV9.this.doInvalidatePanelMenu(108);
            }
            AppCompatDelegateImplV9.this.mInvalidatePanelMenuPosted = false;
            AppCompatDelegateImplV9.this.mInvalidatePanelMenuFeatures = 0;
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$5 */
    class C06645 implements Runnable {

        /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$5$1 */
        class C40401 extends C2899o {
            C40401() {
            }

            public void onAnimationStart(View view) {
                AppCompatDelegateImplV9.this.mActionModeView.setVisibility(0);
            }

            public void onAnimationEnd(View view) {
                AppCompatDelegateImplV9.this.mActionModeView.setAlpha(1.0f);
                AppCompatDelegateImplV9.this.mFadeAnim.m2379a(null);
                AppCompatDelegateImplV9.this.mFadeAnim = null;
            }
        }

        C06645() {
        }

        public void run() {
            AppCompatDelegateImplV9.this.mActionModePopup.showAtLocation(AppCompatDelegateImplV9.this.mActionModeView, 55, 0, 0);
            AppCompatDelegateImplV9.this.endOnGoingFadeAnimation();
            if (AppCompatDelegateImplV9.this.shouldAnimateActionModeView()) {
                AppCompatDelegateImplV9.this.mActionModeView.setAlpha(0.0f);
                AppCompatDelegateImplV9.this.mFadeAnim = ViewCompat.m2221m(AppCompatDelegateImplV9.this.mActionModeView).m2377a(1.0f);
                AppCompatDelegateImplV9.this.mFadeAnim.m2379a(new C40401());
                return;
            }
            AppCompatDelegateImplV9.this.mActionModeView.setAlpha(1.0f);
            AppCompatDelegateImplV9.this.mActionModeView.setVisibility(0);
        }
    }

    protected static final class PanelFeatureState {
        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView = false;
        boolean refreshMenuContent;
        View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;
        /* renamed from: x */
        int f2014x;
        /* renamed from: y */
        int f2015y;

        private static class SavedState implements Parcelable {
            public static final Creator<SavedState> CREATOR = new C06651();
            int featureId;
            boolean isOpen;
            Bundle menuState;

            /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$PanelFeatureState$SavedState$1 */
            static class C06651 implements ClassLoaderCreator<SavedState> {
                C06651() {
                }

                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.readFromParcel(parcel, classLoader);
                }

                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.readFromParcel(parcel, null);
                }

                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.featureId);
                parcel.writeInt(this.isOpen);
                if (this.isOpen != 0) {
                    parcel.writeBundle(this.menuState);
                }
            }

            static SavedState readFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.featureId = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.isOpen = z;
                if (savedState.isOpen) {
                    savedState.menuState = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }

        PanelFeatureState(int i) {
            this.featureId = i;
        }

        public boolean hasPanelItems() {
            boolean z = false;
            if (this.shownPanelView == null) {
                return false;
            }
            if (this.createdPanelView != null) {
                return true;
            }
            if (this.listMenuPresenter.getAdapter().getCount() > 0) {
                z = true;
            }
            return z;
        }

        public void clearMenuPresenters() {
            if (this.menu != null) {
                this.menu.removeMenuPresenter(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }

        void setStyle(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0667R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0667R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C0667R.style.Theme_AppCompat_CompactMenu, true);
            }
            Context contextThemeWrapper = new ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.listPresenterContext = contextThemeWrapper;
            context = contextThemeWrapper.obtainStyledAttributes(C0667R.styleable.AppCompatTheme);
            this.background = context.getResourceId(C0667R.styleable.AppCompatTheme_panelBackground, 0);
            this.windowAnimations = context.getResourceId(C0667R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            context.recycle();
        }

        void setMenu(MenuBuilder menuBuilder) {
            if (menuBuilder != this.menu) {
                if (this.menu != null) {
                    this.menu.removeMenuPresenter(this.listMenuPresenter);
                }
                this.menu = menuBuilder;
                if (!(menuBuilder == null || this.listMenuPresenter == null)) {
                    menuBuilder.addMenuPresenter(this.listMenuPresenter);
                }
            }
        }

        MenuView getListMenuView(MenuPresenter.Callback callback) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                this.listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, C0667R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter.setCallback(callback);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }

        Parcelable onSaveInstanceState() {
            Parcelable savedState = new SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                savedState.menuState = new Bundle();
                this.menu.savePresenterStates(savedState.menuState);
            }
            return savedState;
        }

        void onRestoreInstanceState(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }

        void applyFrozenState() {
            if (this.menu != null && this.frozenMenuState != null) {
                this.menu.restorePresenterStates(this.frozenMenuState);
                this.frozenMenuState = null;
            }
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$2 */
    class C29162 implements OnApplyWindowInsetsListener {
        C29162() {
        }

        public C0610p onApplyWindowInsets(View view, C0610p c0610p) {
            int b = c0610p.m2390b();
            int updateStatusGuard = AppCompatDelegateImplV9.this.updateStatusGuard(b);
            if (b != updateStatusGuard) {
                c0610p = c0610p.m2389a(c0610p.m2388a(), updateStatusGuard, c0610p.m2391c(), c0610p.m2392d());
            }
            return ViewCompat.m2174a(view, c0610p);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$3 */
    class C29173 implements OnFitSystemWindowsListener {
        C29173() {
        }

        public void onFitSystemWindows(Rect rect) {
            rect.top = AppCompatDelegateImplV9.this.updateStatusGuard(rect.top);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$4 */
    class C29184 implements OnAttachListener {
        public void onAttachedFromWindow() {
        }

        C29184() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImplV9.this.dismissPopups();
        }
    }

    private final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback windowCallback = AppCompatDelegateImplV9.this.getWindowCallback();
            if (windowCallback != null) {
                windowCallback.onMenuOpened(108, menuBuilder);
            }
            return true;
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImplV9.this.checkCloseActionMenu(menuBuilder);
        }
    }

    class ActionModeCallbackWrapperV9 implements ActionMode.Callback {
        private ActionMode.Callback mWrapped;

        /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$ActionModeCallbackWrapperV9$1 */
        class C40421 extends C2899o {
            C40421() {
            }

            public void onAnimationEnd(View view) {
                AppCompatDelegateImplV9.this.mActionModeView.setVisibility(8);
                if (AppCompatDelegateImplV9.this.mActionModePopup != null) {
                    AppCompatDelegateImplV9.this.mActionModePopup.dismiss();
                } else if ((AppCompatDelegateImplV9.this.mActionModeView.getParent() instanceof View) != null) {
                    ViewCompat.m2226r((View) AppCompatDelegateImplV9.this.mActionModeView.getParent());
                }
                AppCompatDelegateImplV9.this.mActionModeView.removeAllViews();
                AppCompatDelegateImplV9.this.mFadeAnim.m2379a(null);
                AppCompatDelegateImplV9.this.mFadeAnim = null;
            }
        }

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.mWrapped = callback;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            if (AppCompatDelegateImplV9.this.mActionModePopup != null) {
                AppCompatDelegateImplV9.this.mWindow.getDecorView().removeCallbacks(AppCompatDelegateImplV9.this.mShowActionModePopup);
            }
            if (AppCompatDelegateImplV9.this.mActionModeView != null) {
                AppCompatDelegateImplV9.this.endOnGoingFadeAnimation();
                AppCompatDelegateImplV9.this.mFadeAnim = ViewCompat.m2221m(AppCompatDelegateImplV9.this.mActionModeView).m2377a(0.0f);
                AppCompatDelegateImplV9.this.mFadeAnim.m2379a(new C40421());
            }
            if (AppCompatDelegateImplV9.this.mAppCompatCallback != null) {
                AppCompatDelegateImplV9.this.mAppCompatCallback.onSupportActionModeFinished(AppCompatDelegateImplV9.this.mActionMode);
            }
            AppCompatDelegateImplV9.this.mActionMode = null;
        }
    }

    private class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!AppCompatDelegateImplV9.this.dispatchKeyEvent(keyEvent)) {
                if (super.dispatchKeyEvent(keyEvent) == null) {
                    return null;
                }
            }
            return true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImplV9.this.closePanel(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i));
        }

        private boolean isOutOfBounds(int i, int i2) {
            if (i >= -5 && i2 >= -5 && i <= getWidth() + 5) {
                if (i2 <= getHeight() + 5) {
                    return false;
                }
            }
            return true;
        }
    }

    private final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        PanelMenuPresenterCallback() {
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            Object obj = rootMenu != menuBuilder ? 1 : null;
            AppCompatDelegateImplV9 appCompatDelegateImplV9 = AppCompatDelegateImplV9.this;
            if (obj != null) {
                menuBuilder = rootMenu;
            }
            menuBuilder = appCompatDelegateImplV9.findMenuPanel(menuBuilder);
            if (menuBuilder == null) {
                return;
            }
            if (obj != null) {
                AppCompatDelegateImplV9.this.callOnPanelClosed(menuBuilder.featureId, menuBuilder, rootMenu);
                AppCompatDelegateImplV9.this.closePanel(menuBuilder, true);
                return;
            }
            AppCompatDelegateImplV9.this.closePanel(menuBuilder, z);
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            if (menuBuilder == null && AppCompatDelegateImplV9.this.mHasActionBar) {
                Window.Callback windowCallback = AppCompatDelegateImplV9.this.getWindowCallback();
                if (!(windowCallback == null || AppCompatDelegateImplV9.this.isDestroyed())) {
                    windowCallback.onMenuOpened(108, menuBuilder);
                }
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$6 */
    class C40416 extends C2899o {
        C40416() {
        }

        public void onAnimationStart(View view) {
            AppCompatDelegateImplV9.this.mActionModeView.setVisibility(0);
            AppCompatDelegateImplV9.this.mActionModeView.sendAccessibilityEvent(32);
            if ((AppCompatDelegateImplV9.this.mActionModeView.getParent() instanceof View) != null) {
                ViewCompat.m2226r((View) AppCompatDelegateImplV9.this.mActionModeView.getParent());
            }
        }

        public void onAnimationEnd(View view) {
            AppCompatDelegateImplV9.this.mActionModeView.setAlpha(1.0f);
            AppCompatDelegateImplV9.this.mFadeAnim.m2379a(null);
            AppCompatDelegateImplV9.this.mFadeAnim = null;
        }
    }

    void onSubDecorInstalled(ViewGroup viewGroup) {
    }

    AppCompatDelegateImplV9(Context context, Window window, AppCompatCallback appCompatCallback) {
        super(context, window, appCompatCallback);
    }

    public void onCreate(Bundle bundle) {
        if ((this.mOriginalWindowCallback instanceof Activity) != null && C0420r.m1569b((Activity) this.mOriginalWindowCallback) != null) {
            bundle = peekSupportActionBar();
            if (bundle == null) {
                this.mEnableDefaultActionBarUp = true;
            } else {
                bundle.setDefaultDisplayHomeAsUpEnabled(true);
            }
        }
    }

    public void onPostCreate(Bundle bundle) {
        ensureSubDecor();
    }

    public void initWindowDecorActionBar() {
        ensureSubDecor();
        if (this.mHasActionBar) {
            if (this.mActionBar == null) {
                if (this.mOriginalWindowCallback instanceof Activity) {
                    this.mActionBar = new WindowDecorActionBar((Activity) this.mOriginalWindowCallback, this.mOverlayActionBar);
                } else if (this.mOriginalWindowCallback instanceof Dialog) {
                    this.mActionBar = new WindowDecorActionBar((Dialog) this.mOriginalWindowCallback);
                }
                if (this.mActionBar != null) {
                    this.mActionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
                }
            }
        }
    }

    public void setSupportActionBar(Toolbar toolbar) {
        if (this.mOriginalWindowCallback instanceof Activity) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar instanceof WindowDecorActionBar) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.mMenuInflater = null;
            if (supportActionBar != null) {
                supportActionBar.onDestroy();
            }
            if (toolbar != null) {
                supportActionBar = new ToolbarActionBar(toolbar, ((Activity) this.mOriginalWindowCallback).getTitle(), this.mAppCompatWindowCallback);
                this.mActionBar = supportActionBar;
                this.mWindow.setCallback(supportActionBar.getWrappedWindowCallback());
            } else {
                this.mActionBar = null;
                this.mWindow.setCallback(this.mAppCompatWindowCallback);
            }
            invalidateOptionsMenu();
        }
    }

    @Nullable
    public <T extends View> T findViewById(@IdRes int i) {
        ensureSubDecor();
        return this.mWindow.findViewById(i);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.mHasActionBar && this.mSubDecorInstalled) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.onConfigurationChanged(configuration);
            }
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.mContext);
        applyDayNight();
    }

    public void onStop() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    public void onPostResume() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    public void setContentView(View view) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mOriginalWindowCallback.onContentChanged();
    }

    public void setContentView(int i) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(i, viewGroup);
        this.mOriginalWindowCallback.onContentChanged();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mOriginalWindowCallback.onContentChanged();
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        ensureSubDecor();
        ((ViewGroup) this.mSubDecor.findViewById(16908290)).addView(view, layoutParams);
        this.mOriginalWindowCallback.onContentChanged();
    }

    public void onDestroy() {
        if (this.mInvalidatePanelMenuPosted) {
            this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
        }
        super.onDestroy();
        if (this.mActionBar != null) {
            this.mActionBar.onDestroy();
        }
    }

    private void ensureSubDecor() {
        if (!this.mSubDecorInstalled) {
            this.mSubDecor = createSubDecor();
            CharSequence title = getTitle();
            if (!TextUtils.isEmpty(title)) {
                onTitleChanged(title);
            }
            applyFixedSizeWindow();
            onSubDecorInstalled(this.mSubDecor);
            this.mSubDecorInstalled = true;
            PanelFeatureState panelState = getPanelState(0, false);
            if (!isDestroyed()) {
                if (panelState == null || panelState.menu == null) {
                    invalidatePanelMenu(108);
                }
            }
        }
    }

    private ViewGroup createSubDecor() {
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(C0667R.styleable.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0667R.styleable.AppCompatTheme_windowActionBar)) {
            View view;
            if (obtainStyledAttributes.getBoolean(C0667R.styleable.AppCompatTheme_windowNoTitle, false)) {
                requestWindowFeature(1);
            } else if (obtainStyledAttributes.getBoolean(C0667R.styleable.AppCompatTheme_windowActionBar, false)) {
                requestWindowFeature(108);
            }
            if (obtainStyledAttributes.getBoolean(C0667R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                requestWindowFeature(109);
            }
            if (obtainStyledAttributes.getBoolean(C0667R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                requestWindowFeature(10);
            }
            this.mIsFloating = obtainStyledAttributes.getBoolean(C0667R.styleable.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.mWindow.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.mContext);
            if (this.mWindowNoTitle) {
                if (this.mOverlayActionMode) {
                    view = (ViewGroup) from.inflate(C0667R.layout.abc_screen_simple_overlay_action_mode, null);
                } else {
                    view = (ViewGroup) from.inflate(C0667R.layout.abc_screen_simple, null);
                }
                if (VERSION.SDK_INT >= 21) {
                    ViewCompat.m2184a(view, new C29162());
                } else {
                    ((FitWindowsViewGroup) view).setOnFitSystemWindowsListener(new C29173());
                }
            } else if (this.mIsFloating) {
                view = (ViewGroup) from.inflate(C0667R.layout.abc_dialog_title_material, null);
                this.mOverlayActionBar = false;
                this.mHasActionBar = false;
            } else if (this.mHasActionBar) {
                Context contextThemeWrapper;
                TypedValue typedValue = new TypedValue();
                this.mContext.getTheme().resolveAttribute(C0667R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    contextThemeWrapper = new ContextThemeWrapper(this.mContext, typedValue.resourceId);
                } else {
                    contextThemeWrapper = this.mContext;
                }
                view = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(C0667R.layout.abc_screen_toolbar, null);
                this.mDecorContentParent = (DecorContentParent) view.findViewById(C0667R.id.decor_content_parent);
                this.mDecorContentParent.setWindowCallback(getWindowCallback());
                if (this.mOverlayActionBar) {
                    this.mDecorContentParent.initFeature(109);
                }
                if (this.mFeatureProgress) {
                    this.mDecorContentParent.initFeature(2);
                }
                if (this.mFeatureIndeterminateProgress) {
                    this.mDecorContentParent.initFeature(5);
                }
            } else {
                view = null;
            }
            if (view == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AppCompat does not support the current theme features: { windowActionBar: ");
                stringBuilder.append(this.mHasActionBar);
                stringBuilder.append(", windowActionBarOverlay: ");
                stringBuilder.append(this.mOverlayActionBar);
                stringBuilder.append(", android:windowIsFloating: ");
                stringBuilder.append(this.mIsFloating);
                stringBuilder.append(", windowActionModeOverlay: ");
                stringBuilder.append(this.mOverlayActionMode);
                stringBuilder.append(", windowNoTitle: ");
                stringBuilder.append(this.mWindowNoTitle);
                stringBuilder.append(" }");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (this.mDecorContentParent == null) {
                this.mTitleView = (TextView) view.findViewById(C0667R.id.title);
            }
            ViewUtils.makeOptionalFitsSystemWindows(view);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view.findViewById(C0667R.id.action_bar_activity_content);
            ViewGroup viewGroup = (ViewGroup) this.mWindow.findViewById(16908290);
            if (viewGroup != null) {
                while (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    viewGroup.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup instanceof FrameLayout) {
                    ((FrameLayout) viewGroup).setForeground(null);
                }
            }
            this.mWindow.setContentView(view);
            contentFrameLayout.setAttachListener(new C29184());
            return view;
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void applyFixedSizeWindow() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.mSubDecor.findViewById(16908290);
        View decorView = this.mWindow.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(C0667R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(C0667R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0667R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0667R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0667R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0667R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0667R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0667R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0667R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0667R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0667R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public boolean requestWindowFeature(int i) {
        i = sanitizeWindowFeatureId(i);
        if (this.mWindowNoTitle && i == 108) {
            return false;
        }
        if (this.mHasActionBar && i == 1) {
            this.mHasActionBar = false;
        }
        switch (i) {
            case 1:
                throwFeatureRequestIfSubDecorInstalled();
                this.mWindowNoTitle = true;
                return true;
            case 2:
                throwFeatureRequestIfSubDecorInstalled();
                this.mFeatureProgress = true;
                return true;
            case 5:
                throwFeatureRequestIfSubDecorInstalled();
                this.mFeatureIndeterminateProgress = true;
                return true;
            case 10:
                throwFeatureRequestIfSubDecorInstalled();
                this.mOverlayActionMode = true;
                return true;
            case 108:
                throwFeatureRequestIfSubDecorInstalled();
                this.mHasActionBar = true;
                return true;
            case 109:
                throwFeatureRequestIfSubDecorInstalled();
                this.mOverlayActionBar = true;
                return true;
            default:
                return this.mWindow.requestFeature(i);
        }
    }

    public boolean hasWindowFeature(int i) {
        switch (sanitizeWindowFeatureId(i)) {
            case 1:
                return this.mWindowNoTitle;
            case 2:
                return this.mFeatureProgress;
            case 5:
                return this.mFeatureIndeterminateProgress;
            case 10:
                return this.mOverlayActionMode;
            case 108:
                return this.mHasActionBar;
            case 109:
                return this.mOverlayActionBar;
            default:
                return false;
        }
    }

    void onTitleChanged(CharSequence charSequence) {
        if (this.mDecorContentParent != null) {
            this.mDecorContentParent.setWindowTitle(charSequence);
        } else if (peekSupportActionBar() != null) {
            peekSupportActionBar().setWindowTitle(charSequence);
        } else if (this.mTitleView != null) {
            this.mTitleView.setText(charSequence);
        }
    }

    void onPanelClosed(int i, Menu menu) {
        if (i == 108) {
            i = getSupportActionBar();
            if (i != 0) {
                i.dispatchMenuVisibilityChanged(false);
            }
        } else if (i == 0) {
            i = getPanelState(i, true);
            if (i.isOpen) {
                closePanel(i, false);
            }
        }
    }

    boolean onMenuOpened(int i, Menu menu) {
        if (i != 108) {
            return false;
        }
        i = getSupportActionBar();
        if (i != 0) {
            i.dispatchMenuVisibilityChanged(true);
        }
        return true;
    }

    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        Window.Callback windowCallback = getWindowCallback();
        if (!(windowCallback == null || isDestroyed())) {
            menuBuilder = findMenuPanel(menuBuilder.getRootMenu());
            if (menuBuilder != null) {
                return windowCallback.onMenuItemSelected(menuBuilder.featureId, menuItem);
            }
        }
        return null;
    }

    public void onMenuModeChange(MenuBuilder menuBuilder) {
        reopenMenu(menuBuilder, true);
    }

    public ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        ActionMode.Callback actionModeCallbackWrapperV9 = new ActionModeCallbackWrapperV9(callback);
        callback = getSupportActionBar();
        if (callback != null) {
            this.mActionMode = callback.startActionMode(actionModeCallbackWrapperV9);
            if (!(this.mActionMode == null || this.mAppCompatCallback == null)) {
                this.mAppCompatCallback.onSupportActionModeStarted(this.mActionMode);
            }
        }
        if (this.mActionMode == null) {
            this.mActionMode = startSupportActionModeFromWindow(actionModeCallbackWrapperV9);
        }
        return this.mActionMode;
    }

    public void invalidateOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.invalidateOptionsMenu()) {
            invalidatePanelMenu(0);
        }
    }

    android.support.v7.view.ActionMode startSupportActionModeFromWindow(@android.support.annotation.NonNull android.support.v7.view.ActionMode.Callback r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r7 = this;
        r7.endOnGoingFadeAnimation();
        r0 = r7.mActionMode;
        if (r0 == 0) goto L_0x000c;
    L_0x0007:
        r0 = r7.mActionMode;
        r0.finish();
    L_0x000c:
        r0 = r8 instanceof android.support.v7.app.AppCompatDelegateImplV9.ActionModeCallbackWrapperV9;
        if (r0 != 0) goto L_0x0016;
    L_0x0010:
        r0 = new android.support.v7.app.AppCompatDelegateImplV9$ActionModeCallbackWrapperV9;
        r0.<init>(r8);
        r8 = r0;
    L_0x0016:
        r0 = r7.mAppCompatCallback;
        r1 = 0;
        if (r0 == 0) goto L_0x0028;
    L_0x001b:
        r0 = r7.isDestroyed();
        if (r0 != 0) goto L_0x0028;
    L_0x0021:
        r0 = r7.mAppCompatCallback;	 Catch:{ AbstractMethodError -> 0x0028 }
        r0 = r0.onWindowStartingSupportActionMode(r8);	 Catch:{ AbstractMethodError -> 0x0028 }
        goto L_0x0029;
    L_0x0028:
        r0 = r1;
    L_0x0029:
        if (r0 == 0) goto L_0x002f;
    L_0x002b:
        r7.mActionMode = r0;
        goto L_0x016c;
    L_0x002f:
        r0 = r7.mActionModeView;
        r2 = 0;
        r3 = 1;
        if (r0 != 0) goto L_0x00dc;
    L_0x0035:
        r0 = r7.mIsFloating;
        if (r0 == 0) goto L_0x00bd;
    L_0x0039:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r4 = r7.mContext;
        r4 = r4.getTheme();
        r5 = android.support.v7.appcompat.C0667R.attr.actionBarTheme;
        r4.resolveAttribute(r5, r0, r3);
        r5 = r0.resourceId;
        if (r5 == 0) goto L_0x006e;
    L_0x004d:
        r5 = r7.mContext;
        r5 = r5.getResources();
        r5 = r5.newTheme();
        r5.setTo(r4);
        r4 = r0.resourceId;
        r5.applyStyle(r4, r3);
        r4 = new android.support.v7.view.ContextThemeWrapper;
        r6 = r7.mContext;
        r4.<init>(r6, r2);
        r6 = r4.getTheme();
        r6.setTo(r5);
        goto L_0x0070;
    L_0x006e:
        r4 = r7.mContext;
    L_0x0070:
        r5 = new android.support.v7.widget.ActionBarContextView;
        r5.<init>(r4);
        r7.mActionModeView = r5;
        r5 = new android.widget.PopupWindow;
        r6 = android.support.v7.appcompat.C0667R.attr.actionModePopupWindowStyle;
        r5.<init>(r4, r1, r6);
        r7.mActionModePopup = r5;
        r5 = r7.mActionModePopup;
        r6 = 2;
        android.support.v4.widget.C0646l.m2590a(r5, r6);
        r5 = r7.mActionModePopup;
        r6 = r7.mActionModeView;
        r5.setContentView(r6);
        r5 = r7.mActionModePopup;
        r6 = -1;
        r5.setWidth(r6);
        r5 = r4.getTheme();
        r6 = android.support.v7.appcompat.C0667R.attr.actionBarSize;
        r5.resolveAttribute(r6, r0, r3);
        r0 = r0.data;
        r4 = r4.getResources();
        r4 = r4.getDisplayMetrics();
        r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4);
        r4 = r7.mActionModeView;
        r4.setContentHeight(r0);
        r0 = r7.mActionModePopup;
        r4 = -2;
        r0.setHeight(r4);
        r0 = new android.support.v7.app.AppCompatDelegateImplV9$5;
        r0.<init>();
        r7.mShowActionModePopup = r0;
        goto L_0x00dc;
    L_0x00bd:
        r0 = r7.mSubDecor;
        r4 = android.support.v7.appcompat.C0667R.id.action_mode_bar_stub;
        r0 = r0.findViewById(r4);
        r0 = (android.support.v7.widget.ViewStubCompat) r0;
        if (r0 == 0) goto L_0x00dc;
    L_0x00c9:
        r4 = r7.getActionBarThemedContext();
        r4 = android.view.LayoutInflater.from(r4);
        r0.setLayoutInflater(r4);
        r0 = r0.inflate();
        r0 = (android.support.v7.widget.ActionBarContextView) r0;
        r7.mActionModeView = r0;
    L_0x00dc:
        r0 = r7.mActionModeView;
        if (r0 == 0) goto L_0x016c;
    L_0x00e0:
        r7.endOnGoingFadeAnimation();
        r0 = r7.mActionModeView;
        r0.killMode();
        r0 = new android.support.v7.view.StandaloneActionMode;
        r4 = r7.mActionModeView;
        r4 = r4.getContext();
        r5 = r7.mActionModeView;
        r6 = r7.mActionModePopup;
        if (r6 != 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x00f8;
    L_0x00f7:
        r3 = 0;
    L_0x00f8:
        r0.<init>(r4, r5, r8, r3);
        r3 = r0.getMenu();
        r8 = r8.onCreateActionMode(r0, r3);
        if (r8 == 0) goto L_0x016a;
    L_0x0105:
        r0.invalidate();
        r8 = r7.mActionModeView;
        r8.initForMode(r0);
        r7.mActionMode = r0;
        r8 = r7.shouldAnimateActionModeView();
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r8 == 0) goto L_0x0134;
    L_0x0117:
        r8 = r7.mActionModeView;
        r1 = 0;
        r8.setAlpha(r1);
        r8 = r7.mActionModeView;
        r8 = android.support.v4.view.ViewCompat.m2221m(r8);
        r8 = r8.m2377a(r0);
        r7.mFadeAnim = r8;
        r8 = r7.mFadeAnim;
        r0 = new android.support.v7.app.AppCompatDelegateImplV9$6;
        r0.<init>();
        r8.m2379a(r0);
        goto L_0x015a;
    L_0x0134:
        r8 = r7.mActionModeView;
        r8.setAlpha(r0);
        r8 = r7.mActionModeView;
        r8.setVisibility(r2);
        r8 = r7.mActionModeView;
        r0 = 32;
        r8.sendAccessibilityEvent(r0);
        r8 = r7.mActionModeView;
        r8 = r8.getParent();
        r8 = r8 instanceof android.view.View;
        if (r8 == 0) goto L_0x015a;
    L_0x014f:
        r8 = r7.mActionModeView;
        r8 = r8.getParent();
        r8 = (android.view.View) r8;
        android.support.v4.view.ViewCompat.m2226r(r8);
    L_0x015a:
        r8 = r7.mActionModePopup;
        if (r8 == 0) goto L_0x016c;
    L_0x015e:
        r8 = r7.mWindow;
        r8 = r8.getDecorView();
        r0 = r7.mShowActionModePopup;
        r8.post(r0);
        goto L_0x016c;
    L_0x016a:
        r7.mActionMode = r1;
    L_0x016c:
        r8 = r7.mActionMode;
        if (r8 == 0) goto L_0x017b;
    L_0x0170:
        r8 = r7.mAppCompatCallback;
        if (r8 == 0) goto L_0x017b;
    L_0x0174:
        r8 = r7.mAppCompatCallback;
        r0 = r7.mActionMode;
        r8.onSupportActionModeStarted(r0);
    L_0x017b:
        r8 = r7.mActionMode;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.startSupportActionModeFromWindow(android.support.v7.view.ActionMode$Callback):android.support.v7.view.ActionMode");
    }

    final boolean shouldAnimateActionModeView() {
        return this.mSubDecorInstalled && this.mSubDecor != null && ViewCompat.m2234z(this.mSubDecor);
    }

    void endOnGoingFadeAnimation() {
        if (this.mFadeAnim != null) {
            this.mFadeAnim.m2384b();
        }
    }

    boolean onBackPressed() {
        if (this.mActionMode != null) {
            this.mActionMode.finish();
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.collapseActionView()) {
            return false;
        }
        return true;
    }

    boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i, keyEvent) != 0) {
            return true;
        }
        if (this.mPreparedPanel == 0 || performPanelShortcut(this.mPreparedPanel, keyEvent.getKeyCode(), keyEvent, 1) == 0) {
            if (this.mPreparedPanel == 0) {
                i = getPanelState(0, true);
                preparePanel(i, keyEvent);
                keyEvent = performPanelShortcut(i, keyEvent.getKeyCode(), keyEvent, 1);
                i.isPrepared = false;
                if (keyEvent != null) {
                    return true;
                }
            }
            return false;
        }
        if (this.mPreparedPanel != 0) {
            this.mPreparedPanel.isHandled = true;
        }
        return true;
    }

    boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.mOriginalWindowCallback.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
    }

    boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            i = this.mLongPressBackDown;
            this.mLongPressBackDown = false;
            keyEvent = getPanelState(0, false);
            if (keyEvent != null && keyEvent.isOpen) {
                if (i == 0) {
                    closePanel(keyEvent, true);
                }
                return true;
            } else if (onBackPressed() != 0) {
                return true;
            }
        } else if (i == 82) {
            onKeyUpPanel(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                z = false;
            }
            this.mLongPressBackDown = z;
        } else if (i == 82) {
            onKeyDownPanel(0, keyEvent);
            return true;
        }
        return false;
    }

    public View createView(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.mAppCompatViewInflater == null) {
            String string = this.mContext.obtainStyledAttributes(C0667R.styleable.AppCompatTheme).getString(C0667R.styleable.AppCompatTheme_viewInflaterClass);
            if (string != null) {
                if (!AppCompatViewInflater.class.getName().equals(string)) {
                    try {
                        this.mAppCompatViewInflater = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Throwable th) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to instantiate custom view inflater ");
                        stringBuilder.append(string);
                        stringBuilder.append(". Falling back to default.");
                        Log.i("AppCompatDelegate", stringBuilder.toString(), th);
                        this.mAppCompatViewInflater = new AppCompatViewInflater();
                    }
                }
            }
            this.mAppCompatViewInflater = new AppCompatViewInflater();
        }
        if (IS_PRE_LOLLIPOP) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = shouldInheritContext((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.mAppCompatViewInflater.createView(view, str, context, attributeSet, z, IS_PRE_LOLLIPOP, true, VectorEnabledTintResources.shouldBeUsed());
    }

    private boolean shouldInheritContext(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        ViewParent decorView = this.mWindow.getDecorView();
        while (viewParent != null) {
            if (viewParent != decorView && (viewParent instanceof View)) {
                if (!ViewCompat.m2171C((View) viewParent)) {
                    viewParent = viewParent.getParent();
                }
            }
            return false;
        }
        return true;
    }

    public void installViewFactory() {
        LayoutInflater from = LayoutInflater.from(this.mContext);
        if (from.getFactory() == null) {
            C0595d.m2317b(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImplV9)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View callActivityOnCreateView = callActivityOnCreateView(view, str, context, attributeSet);
        if (callActivityOnCreateView != null) {
            return callActivityOnCreateView;
        }
        return createView(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    View callActivityOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ((this.mOriginalWindowCallback instanceof Factory) != null) {
            view = ((Factory) this.mOriginalWindowCallback).onCreateView(str, context, attributeSet);
            if (view != null) {
                return view;
            }
        }
        return null;
    }

    private void openPanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (!panelFeatureState.isOpen) {
            if (!isDestroyed()) {
                if (panelFeatureState.featureId == 0) {
                    if (((this.mContext.getResources().getConfiguration().screenLayout & 15) == 4 ? 1 : null) != null) {
                        return;
                    }
                }
                Window.Callback windowCallback = getWindowCallback();
                if (windowCallback == null || windowCallback.onMenuOpened(panelFeatureState.featureId, panelFeatureState.menu)) {
                    WindowManager windowManager = (WindowManager) this.mContext.getSystemService("window");
                    if (windowManager != null && preparePanel(panelFeatureState, keyEvent) != null) {
                        int i;
                        KeyEvent layoutParams;
                        if (panelFeatureState.decorView != null) {
                            if (panelFeatureState.refreshDecorView == null) {
                                if (panelFeatureState.createdPanelView != null) {
                                    keyEvent = panelFeatureState.createdPanelView.getLayoutParams();
                                    if (keyEvent != null && keyEvent.width == -1) {
                                        i = -1;
                                        panelFeatureState.isHandled = false;
                                        layoutParams = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2014x, panelFeatureState.f2015y, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
                                        layoutParams.gravity = panelFeatureState.gravity;
                                        layoutParams.windowAnimations = panelFeatureState.windowAnimations;
                                        windowManager.addView(panelFeatureState.decorView, layoutParams);
                                        panelFeatureState.isOpen = true;
                                        return;
                                    }
                                }
                                i = -2;
                                panelFeatureState.isHandled = false;
                                layoutParams = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2014x, panelFeatureState.f2015y, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
                                layoutParams.gravity = panelFeatureState.gravity;
                                layoutParams.windowAnimations = panelFeatureState.windowAnimations;
                                windowManager.addView(panelFeatureState.decorView, layoutParams);
                                panelFeatureState.isOpen = true;
                                return;
                            }
                        }
                        if (panelFeatureState.decorView == null) {
                            if (initializePanelDecor(panelFeatureState) == null || panelFeatureState.decorView == null) {
                                return;
                            }
                        } else if (panelFeatureState.refreshDecorView != null && panelFeatureState.decorView.getChildCount() > null) {
                            panelFeatureState.decorView.removeAllViews();
                        }
                        if (initializePanelContent(panelFeatureState) != null) {
                            if (panelFeatureState.hasPanelItems() != null) {
                                keyEvent = panelFeatureState.shownPanelView.getLayoutParams();
                                if (keyEvent == null) {
                                    keyEvent = new LayoutParams(-2, -2);
                                }
                                panelFeatureState.decorView.setBackgroundResource(panelFeatureState.background);
                                ViewParent parent = panelFeatureState.shownPanelView.getParent();
                                if (parent != null && (parent instanceof ViewGroup)) {
                                    ((ViewGroup) parent).removeView(panelFeatureState.shownPanelView);
                                }
                                panelFeatureState.decorView.addView(panelFeatureState.shownPanelView, keyEvent);
                                if (panelFeatureState.shownPanelView.hasFocus() == null) {
                                    panelFeatureState.shownPanelView.requestFocus();
                                }
                                i = -2;
                                panelFeatureState.isHandled = false;
                                layoutParams = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2014x, panelFeatureState.f2015y, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
                                layoutParams.gravity = panelFeatureState.gravity;
                                layoutParams.windowAnimations = panelFeatureState.windowAnimations;
                                windowManager.addView(panelFeatureState.decorView, layoutParams);
                                panelFeatureState.isOpen = true;
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                closePanel(panelFeatureState, true);
            }
        }
    }

    private boolean initializePanelDecor(PanelFeatureState panelFeatureState) {
        panelFeatureState.setStyle(getActionBarThemedContext());
        panelFeatureState.decorView = new ListMenuDecorView(panelFeatureState.listPresenterContext);
        panelFeatureState.gravity = 81;
        return true;
    }

    private void reopenMenu(MenuBuilder menuBuilder, boolean z) {
        if (this.mDecorContentParent == null || this.mDecorContentParent.canShowOverflowMenu() == null || (ViewConfiguration.get(this.mContext).hasPermanentMenuKey() != null && this.mDecorContentParent.isOverflowMenuShowPending() == null)) {
            menuBuilder = getPanelState(0, true);
            menuBuilder.refreshDecorView = true;
            closePanel(menuBuilder, false);
            openPanel(menuBuilder, false);
            return;
        }
        menuBuilder = getWindowCallback();
        if (this.mDecorContentParent.isOverflowMenuShowing()) {
            if (z) {
                this.mDecorContentParent.hideOverflowMenu();
                if (!isDestroyed()) {
                    menuBuilder.onPanelClosed(108, getPanelState(0, true).menu);
                }
            }
        }
        if (!(menuBuilder == null || isDestroyed())) {
            if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & true)) {
                this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
                this.mInvalidatePanelMenuRunnable.run();
            }
            z = getPanelState(0, true);
            if (!(z.menu == null || z.refreshMenuContent || !menuBuilder.onPreparePanel(0, z.createdPanelView, z.menu))) {
                menuBuilder.onMenuOpened(108, z.menu);
                this.mDecorContentParent.showOverflowMenu();
            }
        }
    }

    private boolean initializePanelMenu(PanelFeatureState panelFeatureState) {
        Context context = this.mContext;
        if ((panelFeatureState.featureId == 0 || panelFeatureState.featureId == 108) && this.mDecorContentParent != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C0667R.attr.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0667R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0667R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                Context contextThemeWrapper = new ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(theme2);
                context = contextThemeWrapper;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.setCallback(this);
        panelFeatureState.setMenu(menuBuilder);
        return true;
    }

    private boolean initializePanelContent(PanelFeatureState panelFeatureState) {
        boolean z = true;
        if (panelFeatureState.createdPanelView != null) {
            panelFeatureState.shownPanelView = panelFeatureState.createdPanelView;
            return true;
        } else if (panelFeatureState.menu == null) {
            return false;
        } else {
            if (this.mPanelMenuPresenterCallback == null) {
                this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
            }
            panelFeatureState.shownPanelView = (View) panelFeatureState.getListMenuView(this.mPanelMenuPresenterCallback);
            if (panelFeatureState.shownPanelView == null) {
                z = false;
            }
            return z;
        }
    }

    private boolean preparePanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        if (panelFeatureState.isPrepared) {
            return true;
        }
        Object obj;
        if (!(this.mPreparedPanel == null || this.mPreparedPanel == panelFeatureState)) {
            closePanel(this.mPreparedPanel, false);
        }
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null) {
            panelFeatureState.createdPanelView = windowCallback.onCreatePanelView(panelFeatureState.featureId);
        }
        if (panelFeatureState.featureId != 0) {
            if (panelFeatureState.featureId != 108) {
                obj = null;
                if (!(obj == null || this.mDecorContentParent == null)) {
                    this.mDecorContentParent.setMenuPrepared();
                }
                if (panelFeatureState.createdPanelView == null && (obj == null || !(peekSupportActionBar() instanceof ToolbarActionBar))) {
                    if (panelFeatureState.menu == null || panelFeatureState.refreshMenuContent) {
                        if (panelFeatureState.menu != null && (!initializePanelMenu(panelFeatureState) || panelFeatureState.menu == null)) {
                            return false;
                        }
                        if (!(obj == null || this.mDecorContentParent == null)) {
                            if (this.mActionMenuPresenterCallback == null) {
                                this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
                            }
                            this.mDecorContentParent.setMenu(panelFeatureState.menu, this.mActionMenuPresenterCallback);
                        }
                        panelFeatureState.menu.stopDispatchingItemsChanged();
                        if (windowCallback.onCreatePanelMenu(panelFeatureState.featureId, panelFeatureState.menu)) {
                            panelFeatureState.setMenu(null);
                            if (!(obj == null || this.mDecorContentParent == null)) {
                                this.mDecorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                            }
                            return false;
                        }
                        panelFeatureState.refreshMenuContent = false;
                    }
                    panelFeatureState.menu.stopDispatchingItemsChanged();
                    if (panelFeatureState.frozenActionViewState != null) {
                        panelFeatureState.menu.restoreActionViewStates(panelFeatureState.frozenActionViewState);
                        panelFeatureState.frozenActionViewState = null;
                    }
                    if (windowCallback.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                        if (!(obj == null || this.mDecorContentParent == null)) {
                            this.mDecorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                        }
                        panelFeatureState.menu.startDispatchingItemsChanged();
                        return false;
                    }
                    panelFeatureState.qwertyMode = KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1 ? true : null;
                    panelFeatureState.menu.setQwertyMode(panelFeatureState.qwertyMode);
                    panelFeatureState.menu.startDispatchingItemsChanged();
                }
                panelFeatureState.isPrepared = true;
                panelFeatureState.isHandled = false;
                this.mPreparedPanel = panelFeatureState;
                return true;
            }
        }
        obj = 1;
        this.mDecorContentParent.setMenuPrepared();
        if (panelFeatureState.menu != null) {
        }
        if (this.mActionMenuPresenterCallback == null) {
            this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
        }
        this.mDecorContentParent.setMenu(panelFeatureState.menu, this.mActionMenuPresenterCallback);
        panelFeatureState.menu.stopDispatchingItemsChanged();
        if (windowCallback.onCreatePanelMenu(panelFeatureState.featureId, panelFeatureState.menu)) {
            panelFeatureState.refreshMenuContent = false;
            panelFeatureState.menu.stopDispatchingItemsChanged();
            if (panelFeatureState.frozenActionViewState != null) {
                panelFeatureState.menu.restoreActionViewStates(panelFeatureState.frozenActionViewState);
                panelFeatureState.frozenActionViewState = null;
            }
            if (windowCallback.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                if (keyEvent == null) {
                }
                if (KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                }
                panelFeatureState.qwertyMode = KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1 ? true : null;
                panelFeatureState.menu.setQwertyMode(panelFeatureState.qwertyMode);
                panelFeatureState.menu.startDispatchingItemsChanged();
                panelFeatureState.isPrepared = true;
                panelFeatureState.isHandled = false;
                this.mPreparedPanel = panelFeatureState;
                return true;
            }
            this.mDecorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
            panelFeatureState.menu.startDispatchingItemsChanged();
            return false;
        }
        panelFeatureState.setMenu(null);
        this.mDecorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
        return false;
    }

    void checkCloseActionMenu(MenuBuilder menuBuilder) {
        if (!this.mClosingActionMenu) {
            this.mClosingActionMenu = true;
            this.mDecorContentParent.dismissPopups();
            Window.Callback windowCallback = getWindowCallback();
            if (!(windowCallback == null || isDestroyed())) {
                windowCallback.onPanelClosed(108, menuBuilder);
            }
            this.mClosingActionMenu = null;
        }
    }

    void closePanel(int i) {
        closePanel(getPanelState(i, true), true);
    }

    void closePanel(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.featureId == 0 && this.mDecorContentParent != null && this.mDecorContentParent.isOverflowMenuShowing()) {
            checkCloseActionMenu(panelFeatureState.menu);
            return;
        }
        WindowManager windowManager = (WindowManager) this.mContext.getSystemService("window");
        if (!(windowManager == null || !panelFeatureState.isOpen || panelFeatureState.decorView == null)) {
            windowManager.removeView(panelFeatureState.decorView);
            if (z) {
                callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
            }
        }
        panelFeatureState.isPrepared = false;
        panelFeatureState.isHandled = false;
        panelFeatureState.isOpen = false;
        panelFeatureState.shownPanelView = null;
        panelFeatureState.refreshDecorView = true;
        if (this.mPreparedPanel == panelFeatureState) {
            this.mPreparedPanel = null;
        }
    }

    private boolean onKeyDownPanel(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            i = getPanelState(i, true);
            if (!i.isOpen) {
                return preparePanel(i, keyEvent);
            }
        }
        return false;
    }

    private boolean onKeyUpPanel(int i, KeyEvent keyEvent) {
        if (this.mActionMode != null) {
            return false;
        }
        PanelFeatureState panelState = getPanelState(i, true);
        AudioManager audioManager;
        if (i != 0 || this.mDecorContentParent == 0 || this.mDecorContentParent.canShowOverflowMenu() == 0 || ViewConfiguration.get(this.mContext).hasPermanentMenuKey() != 0) {
            if (panelState.isOpen == 0) {
                if (panelState.isHandled == 0) {
                    if (panelState.isPrepared != 0) {
                        if (panelState.refreshMenuContent != 0) {
                            panelState.isPrepared = false;
                            i = preparePanel(panelState, keyEvent);
                        } else {
                            i = 1;
                        }
                        if (i != 0) {
                            openPanel(panelState, keyEvent);
                            i = 1;
                            if (i != 0) {
                                audioManager = (AudioManager) this.mContext.getSystemService("audio");
                                if (audioManager == null) {
                                    audioManager.playSoundEffect(0);
                                } else {
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                }
                            }
                            return i;
                        }
                    }
                }
            }
            i = panelState.isOpen;
            closePanel(panelState, true);
            if (i != 0) {
                audioManager = (AudioManager) this.mContext.getSystemService("audio");
                if (audioManager == null) {
                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                } else {
                    audioManager.playSoundEffect(0);
                }
            }
            return i;
        }
        if (this.mDecorContentParent.isOverflowMenuShowing() != 0) {
            i = this.mDecorContentParent.hideOverflowMenu();
        } else if (isDestroyed() == 0 && preparePanel(panelState, keyEvent) != 0) {
            i = this.mDecorContentParent.showOverflowMenu();
        }
        if (i != 0) {
            audioManager = (AudioManager) this.mContext.getSystemService("audio");
            if (audioManager == null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return i;
        i = 0;
        if (i != 0) {
            audioManager = (AudioManager) this.mContext.getSystemService("audio");
            if (audioManager == null) {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            } else {
                audioManager.playSoundEffect(0);
            }
        }
        return i;
    }

    void callOnPanelClosed(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.mPanels.length) {
                panelFeatureState = this.mPanels[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.menu;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.isOpen != null) && isDestroyed() == null) {
            this.mOriginalWindowCallback.onPanelClosed(i, menu);
        }
    }

    PanelFeatureState findMenuPanel(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        int i = 0;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        while (i < length) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.menu == menu) {
                return panelFeatureState;
            }
            i++;
        }
        return null;
    }

    protected PanelFeatureState getPanelState(int i, boolean z) {
        z = this.mPanels;
        if (!z || z.length <= i) {
            Object obj = new PanelFeatureState[(i + 1)];
            if (z) {
                System.arraycopy(z, 0, obj, 0, z.length);
            }
            this.mPanels = obj;
            z = obj;
        }
        PanelFeatureState panelFeatureState = z[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        panelFeatureState = new PanelFeatureState(i);
        z[i] = panelFeatureState;
        return panelFeatureState;
    }

    private boolean performPanelShortcut(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.isPrepared || preparePanel(panelFeatureState, keyEvent)) && panelFeatureState.menu != null) {
            z = panelFeatureState.menu.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == null && this.mDecorContentParent == null) {
            closePanel(panelFeatureState, 1);
        }
        return z;
    }

    private void invalidatePanelMenu(int i) {
        this.mInvalidatePanelMenuFeatures = (1 << i) | this.mInvalidatePanelMenuFeatures;
        if (this.mInvalidatePanelMenuPosted == 0) {
            ViewCompat.m2188a(this.mWindow.getDecorView(), this.mInvalidatePanelMenuRunnable);
            this.mInvalidatePanelMenuPosted = true;
        }
    }

    void doInvalidatePanelMenu(int i) {
        PanelFeatureState panelState = getPanelState(i, true);
        if (panelState.menu != null) {
            Bundle bundle = new Bundle();
            panelState.menu.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelState.frozenActionViewState = bundle;
            }
            panelState.menu.stopDispatchingItemsChanged();
            panelState.menu.clear();
        }
        panelState.refreshMenuContent = true;
        panelState.refreshDecorView = true;
        if ((i == 108 || i == 0) && this.mDecorContentParent != 0) {
            PanelFeatureState panelState2 = getPanelState(0, false);
            if (panelState2 != null) {
                panelState2.isPrepared = false;
                preparePanel(panelState2, 0);
            }
        }
    }

    int updateStatusGuard(int i) {
        Object obj;
        int i2 = 0;
        if (this.mActionModeView == null || !(this.mActionModeView.getLayoutParams() instanceof MarginLayoutParams)) {
            obj = null;
        } else {
            Object obj2;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mActionModeView.getLayoutParams();
            obj = 1;
            if (this.mActionModeView.isShown()) {
                if (this.mTempRect1 == null) {
                    this.mTempRect1 = new Rect();
                    this.mTempRect2 = new Rect();
                }
                Rect rect = this.mTempRect1;
                Rect rect2 = this.mTempRect2;
                rect.set(0, i, 0, 0);
                ViewUtils.computeFitSystemWindows(this.mSubDecor, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.mStatusGuard == null) {
                        this.mStatusGuard = new View(this.mContext);
                        this.mStatusGuard.setBackgroundColor(this.mContext.getResources().getColor(C0667R.color.abc_input_method_navigation_guard));
                        this.mSubDecor.addView(this.mStatusGuard, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = this.mStatusGuard.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.mStatusGuard.setLayoutParams(layoutParams);
                        }
                    }
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (this.mStatusGuard == null) {
                    obj = null;
                }
                if (!(this.mOverlayActionMode || r3 == null)) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = null;
            }
            if (obj2 != null) {
                this.mActionModeView.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.mStatusGuard != null) {
            View view = this.mStatusGuard;
            if (obj == null) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int sanitizeWindowFeatureId(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    ViewGroup getSubDecor() {
        return this.mSubDecor;
    }

    void dismissPopups() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.mDecorContentParent;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r2.mDecorContentParent;
        r0.dismissPopups();
    L_0x0009:
        r0 = r2.mActionModePopup;
        if (r0 == 0) goto L_0x0028;
    L_0x000d:
        r0 = r2.mWindow;
        r0 = r0.getDecorView();
        r1 = r2.mShowActionModePopup;
        r0.removeCallbacks(r1);
        r0 = r2.mActionModePopup;
        r0 = r0.isShowing();
        if (r0 == 0) goto L_0x0025;
    L_0x0020:
        r0 = r2.mActionModePopup;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r0.dismiss();	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0025:
        r0 = 0;
        r2.mActionModePopup = r0;
    L_0x0028:
        r2.endOnGoingFadeAnimation();
        r0 = 0;
        r0 = r2.getPanelState(r0, r0);
        if (r0 == 0) goto L_0x003b;
    L_0x0032:
        r1 = r0.menu;
        if (r1 == 0) goto L_0x003b;
    L_0x0036:
        r0 = r0.menu;
        r0.close();
    L_0x003b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.dismissPopups():void");
    }
}
