package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0031p;
import android.arch.lifecycle.C2684e;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.StringRes;
import android.support.v4.util.C0548d;
import android.support.v4.util.C0562m;
import android.support.v4.view.C0595d;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Fragment implements LifecycleOwner, ViewModelStoreOwner, ComponentCallbacks, OnCreateContextMenuListener {
    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 5;
    static final int STARTED = 4;
    static final int STOPPED = 3;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    private static final C0562m<String, Class<?>> sClassMap = new C0562m();
    boolean mAdded;
    C0368a mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    C2832k mChildFragmentManager;
    C0404l mChildNonConfig;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    C2832k mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    C2827j mHost;
    boolean mInLayout;
    int mIndex = -1;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    LayoutInflater mLayoutInflater;
    C2684e mLifecycleRegistry = new C2684e(this);
    LoaderManagerImpl mLoaderManager;
    boolean mMenuVisible = true;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    @Nullable
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState = 0;
    String mTag;
    Fragment mTarget;
    int mTargetIndex = -1;
    int mTargetRequestCode;
    boolean mUserVisibleHint = true;
    View mView;
    C0031p mViewModelStore;
    String mWho;

    /* renamed from: android.support.v4.app.Fragment$1 */
    class C03661 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Fragment f1212a;

        C03661(Fragment fragment) {
            this.f1212a = fragment;
        }

        public void run() {
            this.f1212a.callStartTransitionListener();
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exception) {
            super(str, exception);
        }
    }

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C03671();
        final Bundle mState;

        /* renamed from: android.support.v4.app.Fragment$SavedState$1 */
        static class C03671 implements Creator<SavedState> {
            C03671() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1314a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1315a(i);
            }

            /* renamed from: a */
            public SavedState m1314a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m1315a(int i) {
                return new SavedState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        SavedState(Bundle bundle) {
            this.mState = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.mState = parcel.readBundle();
            if (classLoader != null && this.mState != null) {
                this.mState.setClassLoader(classLoader);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.mState);
        }
    }

    /* renamed from: android.support.v4.app.Fragment$a */
    static class C0368a {
        /* renamed from: a */
        View f1213a;
        /* renamed from: b */
        Animator f1214b;
        /* renamed from: c */
        int f1215c;
        /* renamed from: d */
        int f1216d;
        /* renamed from: e */
        int f1217e;
        /* renamed from: f */
        int f1218f;
        /* renamed from: g */
        SharedElementCallback f1219g = null;
        /* renamed from: h */
        SharedElementCallback f1220h = null;
        /* renamed from: i */
        boolean f1221i;
        /* renamed from: j */
        C0369b f1222j;
        /* renamed from: k */
        boolean f1223k;
        /* renamed from: l */
        private Object f1224l = null;
        /* renamed from: m */
        private Object f1225m = Fragment.USE_DEFAULT_TRANSITION;
        /* renamed from: n */
        private Object f1226n = null;
        /* renamed from: o */
        private Object f1227o = Fragment.USE_DEFAULT_TRANSITION;
        /* renamed from: p */
        private Object f1228p = null;
        /* renamed from: q */
        private Object f1229q = Fragment.USE_DEFAULT_TRANSITION;
        /* renamed from: r */
        private Boolean f1230r;
        /* renamed from: s */
        private Boolean f1231s;

        C0368a() {
        }
    }

    /* renamed from: android.support.v4.app.Fragment$b */
    interface C0369b {
        /* renamed from: a */
        void mo423a();

        /* renamed from: b */
        void mo424b();
    }

    /* renamed from: android.support.v4.app.Fragment$2 */
    class C28142 extends C0391h {
        /* renamed from: a */
        final /* synthetic */ Fragment f8903a;

        C28142(Fragment fragment) {
            this.f8903a = fragment;
        }

        @Nullable
        /* renamed from: a */
        public View mo380a(int i) {
            if (this.f8903a.mView != null) {
                return this.f8903a.mView.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        /* renamed from: a */
        public boolean mo381a() {
            return this.f8903a.mView != null;
        }

        /* renamed from: a */
        public Fragment mo379a(Context context, String str, Bundle bundle) {
            return this.f8903a.mHost.mo379a(context, str, bundle);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    public C0031p getViewModelStore() {
        if (getContext() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mViewModelStore == null) {
            this.mViewModelStore = new C0031p();
        }
        return this.mViewModelStore;
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public static Fragment instantiate(Context context, String str, @Nullable Bundle bundle) {
        StringBuilder stringBuilder;
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (Context context2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new InstantiationException(stringBuilder.toString(), context2);
        } catch (Context context22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new InstantiationException(stringBuilder.toString(), context22);
        } catch (Context context222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new InstantiationException(stringBuilder.toString(), context222);
        } catch (Context context2222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": could not find Fragment constructor");
            throw new InstantiationException(stringBuilder.toString(), context2222);
        } catch (Context context22222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": calling Fragment constructor caused an exception");
            throw new InstantiationException(stringBuilder.toString(), context22222);
        }
    }

    static boolean isSupportFragmentClass(android.content.Context r1, java.lang.String r2) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = sClassMap;	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = r0.get(r2);	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = (java.lang.Class) r0;	 Catch:{ ClassNotFoundException -> 0x001e }
        if (r0 != 0) goto L_0x0017;	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x000a:
        r1 = r1.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = sClassMap;	 Catch:{ ClassNotFoundException -> 0x001e }
        r1.put(r2, r0);	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x0017:
        r1 = android.support.v4.app.Fragment.class;	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = r1.isAssignableFrom(r0);	 Catch:{ ClassNotFoundException -> 0x001e }
        return r1;
    L_0x001e:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.isSupportFragmentClass(android.content.Context, java.lang.String):boolean");
    }

    final void restoreViewState(Bundle bundle) {
        if (this.mSavedViewState != null) {
            this.mInnerView.restoreHierarchyState(this.mSavedViewState);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onViewStateRestored()");
            throw new SuperNotCalledException(stringBuilder.toString());
        }
    }

    final void setIndex(int i, Fragment fragment) {
        this.mIndex = i;
        if (fragment != null) {
            i = new StringBuilder();
            i.append(fragment.mWho);
            i.append(":");
            i.append(this.mIndex);
            this.mWho = i.toString();
            return;
        }
        i = new StringBuilder();
        i.append("android:fragment:");
        i.append(this.mIndex);
        this.mWho = i.toString();
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        C0548d.m2021a(this, stringBuilder);
        if (this.mIndex >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.mTag);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mIndex < 0 || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final boolean isStateSaved() {
        if (this.mFragmentManager == null) {
            return false;
        }
        return this.mFragmentManager.mo441g();
    }

    public void setInitialSavedState(@Nullable SavedState savedState) {
        if (this.mIndex >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        savedState = (savedState == null || savedState.mState == null) ? null : savedState.mState;
        this.mSavedFragmentState = savedState;
    }

    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentManager fragmentManager2 = fragment != null ? fragment.getFragmentManager() : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
                if (fragment2 == this) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Setting ");
                    stringBuilder.append(fragment);
                    stringBuilder.append(" as the target of ");
                    stringBuilder.append(this);
                    stringBuilder.append(" would create a target cycle");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.mTarget = fragment;
            this.mTargetRequestCode = i;
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(fragment);
        stringBuilder.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Nullable
    public final Fragment getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    @Nullable
    public Context getContext() {
        return this.mHost == null ? null : this.mHost.m11070i();
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to a context.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Nullable
    public final FragmentActivity getActivity() {
        return this.mHost == null ? null : (FragmentActivity) this.mHost.m11069h();
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to an activity.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Nullable
    public final Object getHost() {
        return this.mHost == null ? null : this.mHost.mo3030g();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to a host.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @NonNull
    public final CharSequence getText(@StringRes int i) {
        return getResources().getText(i);
    }

    @NonNull
    public final String getString(@StringRes int i) {
        return getResources().getString(i);
    }

    @NonNull
    public final String getString(@StringRes int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @Nullable
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @NonNull
    public final FragmentManager requireFragmentManager() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not associated with a fragment manager.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            if (this.mState >= 5) {
                this.mChildFragmentManager.m11195s();
            } else if (this.mState >= 4) {
                this.mChildFragmentManager.m11194r();
            } else if (this.mState >= 2) {
                this.mChildFragmentManager.m11193q();
            } else if (this.mState >= 1) {
                this.mChildFragmentManager.m11191p();
            }
        }
        return this.mChildFragmentManager;
    }

    @Nullable
    FragmentManager peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mState >= 5;
    }

    public final boolean isVisible() {
        return (!isAdded() || isHidden() || this.mView == null || this.mView.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo3027d();
            }
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo3027d();
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 4 && this.mFragmentManager != null && isAdded()) {
            this.mFragmentManager.m11145b(this);
        }
        this.mUserVisibleHint = z;
        z = this.mState < 4 && !z;
        this.mDeferStart = z;
        if (this.mSavedFragmentState) {
            this.mSavedUserVisibleHint = Boolean.valueOf(this.mUserVisibleHint);
        }
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public LoaderManager getLoaderManager() {
        if (this.mLoaderManager != null) {
            return this.mLoaderManager;
        }
        this.mLoaderManager = new LoaderManagerImpl(this, getViewModelStore());
        return this.mLoaderManager;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, @Nullable Bundle bundle) {
        if (this.mHost == null) {
            bundle = new StringBuilder();
            bundle.append("Fragment ");
            bundle.append(this);
            bundle.append(" not attached to Activity");
            throw new IllegalStateException(bundle.toString());
        }
        this.mHost.mo3019a(this, intent, -1, bundle);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        if (this.mHost == null) {
            i = new StringBuilder();
            i.append("Fragment ");
            i.append(this);
            i.append(" not attached to Activity");
            throw new IllegalStateException(i.toString());
        }
        this.mHost.mo3019a(this, intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (this.mHost == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(r9);
            stringBuilder.append(" not attached to Activity");
            throw new IllegalStateException(stringBuilder.toString());
        }
        r9.mHost.mo3020a(r9, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void requestPermissions(@NonNull String[] strArr, int i) {
        if (this.mHost == null) {
            i = new StringBuilder();
            i.append("Fragment ");
            i.append(this);
            i.append(" not attached to Activity");
            throw new IllegalStateException(i.toString());
        }
        this.mHost.mo3021a(this, strArr, i);
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        return this.mHost != null ? this.mHost.mo3024a(str) : null;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public final LayoutInflater getLayoutInflater() {
        if (this.mLayoutInflater == null) {
            return performGetLayoutInflater(null);
        }
        return this.mLayoutInflater;
    }

    @NonNull
    LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Deprecated
    @NonNull
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        bundle = this.mHost.mo3025b();
        getChildFragmentManager();
        C0595d.m2317b(bundle, this.mChildFragmentManager.m11114A());
        return bundle;
    }

    @CallSuper
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        Activity h = this.mHost == null ? null : this.mHost.m11069h();
        if (h != null) {
            this.mCalled = false;
            onInflate(h, attributeSet, bundle);
        }
    }

    @Deprecated
    @CallSuper
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @CallSuper
    public void onAttach(Context context) {
        this.mCalled = true;
        Activity h = this.mHost == null ? null : this.mHost.m11069h();
        if (h != null) {
            this.mCalled = false;
            onAttach(h);
        }
    }

    @Deprecated
    @CallSuper
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager != null && this.mChildFragmentManager.m11154b(1) == null) {
            this.mChildFragmentManager.m11191p();
        }
    }

    void restoreChildFragmentState(@Nullable Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.mChildFragmentManager == null) {
                    instantiateChildFragmentManager();
                }
                this.mChildFragmentManager.m11127a(parcelable, this.mChildNonConfig);
                this.mChildNonConfig = null;
                this.mChildFragmentManager.m11191p();
            }
        }
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @CallSuper
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @CallSuper
    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @CallSuper
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    public void onResume() {
        this.mCalled = true;
    }

    @CallSuper
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    @CallSuper
    public void onPause() {
        this.mCalled = true;
    }

    @CallSuper
    public void onStop() {
        this.mCalled = true;
    }

    @CallSuper
    public void onLowMemory() {
        this.mCalled = true;
    }

    @CallSuper
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    public void onDestroy() {
        this.mCalled = true;
        if (this.mViewModelStore != null && !this.mHost.f8957d.f8998s) {
            this.mViewModelStore.m132a();
        }
    }

    void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
    }

    @CallSuper
    public void onDetach() {
        this.mCalled = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().f1219g = sharedElementCallback;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().f1220h = sharedElementCallback;
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1224l = obj;
    }

    @Nullable
    public Object getEnterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1224l;
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1225m = obj;
    }

    @Nullable
    public Object getReturnTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        Object enterTransition;
        if (this.mAnimationInfo.f1225m == USE_DEFAULT_TRANSITION) {
            enterTransition = getEnterTransition();
        } else {
            enterTransition = this.mAnimationInfo.f1225m;
        }
        return enterTransition;
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1226n = obj;
    }

    @Nullable
    public Object getExitTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1226n;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1227o = obj;
    }

    public Object getReenterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        Object exitTransition;
        if (this.mAnimationInfo.f1227o == USE_DEFAULT_TRANSITION) {
            exitTransition = getExitTransition();
        } else {
            exitTransition = this.mAnimationInfo.f1227o;
        }
        return exitTransition;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1228p = obj;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1228p;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1229q = obj;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        Object sharedElementEnterTransition;
        if (this.mAnimationInfo.f1229q == USE_DEFAULT_TRANSITION) {
            sharedElementEnterTransition = getSharedElementEnterTransition();
        } else {
            sharedElementEnterTransition = this.mAnimationInfo.f1229q;
        }
        return sharedElementEnterTransition;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f1231s = Boolean.valueOf(z);
    }

    public boolean getAllowEnterTransitionOverlap() {
        if (this.mAnimationInfo != null) {
            if (this.mAnimationInfo.f1231s != null) {
                return this.mAnimationInfo.f1231s.booleanValue();
            }
        }
        return true;
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f1230r = Boolean.valueOf(z);
    }

    public boolean getAllowReturnTransitionOverlap() {
        if (this.mAnimationInfo != null) {
            if (this.mAnimationInfo.f1230r != null) {
                return this.mAnimationInfo.f1230r.booleanValue();
            }
        }
        return true;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f1221i = true;
    }

    public void startPostponedEnterTransition() {
        if (this.mFragmentManager != null) {
            if (this.mFragmentManager.f8993m != null) {
                if (Looper.myLooper() != this.mFragmentManager.f8993m.m11071j().getLooper()) {
                    this.mFragmentManager.f8993m.m11071j().postAtFrontOfQueue(new C03661(this));
                    return;
                } else {
                    callStartTransitionListener();
                    return;
                }
            }
        }
        ensureAnimationInfo().f1221i = false;
    }

    private void callStartTransitionListener() {
        C0369b c0369b;
        if (this.mAnimationInfo == null) {
            c0369b = null;
        } else {
            this.mAnimationInfo.f1221i = false;
            c0369b = this.mAnimationInfo.f1222j;
            this.mAnimationInfo.f1222j = null;
        }
        if (c0369b != null) {
            c0369b.mo423a();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (this.mLoaderManager != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            LoaderManagerImpl loaderManagerImpl = this.mLoaderManager;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            loaderManagerImpl.mo394a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Child ");
            stringBuilder2.append(this.mChildFragmentManager);
            stringBuilder2.append(":");
            printWriter.println(stringBuilder2.toString());
            C2832k c2832k = this.mChildFragmentManager;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            c2832k.mo435a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager != null ? this.mChildFragmentManager.m11144b(str) : null;
    }

    void instantiateChildFragmentManager() {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.mChildFragmentManager = new C2832k();
        this.mChildFragmentManager.m11135a(this.mHost, new C28142(this), this);
    }

    void performCreate(Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11190o();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onCreate()");
            throw new SuperNotCalledException(stringBuilder.toString());
        }
        this.mLifecycleRegistry.m10469a(Event.ON_CREATE);
    }

    View performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11190o();
        }
        this.mPerformedCreateView = true;
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    void performActivityCreated(Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11190o();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onActivityCreated()");
            throw new SuperNotCalledException(stringBuilder.toString());
        } else if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11193q();
        }
    }

    void performStart() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11190o();
            this.mChildFragmentManager.m11178i();
        }
        this.mState = 4;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.m11194r();
            }
            this.mLifecycleRegistry.m10469a(Event.ON_START);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onStart()");
        throw new SuperNotCalledException(stringBuilder.toString());
    }

    void performResume() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11190o();
            this.mChildFragmentManager.m11178i();
        }
        this.mState = 5;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.m11195s();
                this.mChildFragmentManager.m11178i();
            }
            this.mLifecycleRegistry.m10469a(Event.ON_RESUME);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onResume()");
        throw new SuperNotCalledException(stringBuilder.toString());
    }

    void noteStateNotSaved() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11190o();
        }
    }

    void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11139a(z);
        }
    }

    void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11152b(z);
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11125a(configuration);
        }
    }

    void performLowMemory() {
        onLowMemory();
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11201y();
        }
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return this.mChildFragmentManager != null ? z | this.mChildFragmentManager.m11141a(menu, menuInflater) : z;
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return this.mChildFragmentManager != null ? z | this.mChildFragmentManager.m11140a(menu) : z;
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            if (!(this.mChildFragmentManager == null || this.mChildFragmentManager.m11142a(menuItem) == null)) {
                return true;
            }
        }
        return null;
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            if (!(this.mChildFragmentManager == null || this.mChildFragmentManager.m11155b(menuItem) == null)) {
                return true;
            }
        }
        return null;
    }

    void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.m11151b(menu);
            }
        }
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        if (this.mChildFragmentManager != null) {
            Parcelable n = this.mChildFragmentManager.m11187n();
            if (n != null) {
                bundle.putParcelable("android:support:fragments", n);
            }
        }
    }

    void performPause() {
        this.mLifecycleRegistry.m10469a(Event.ON_PAUSE);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11196t();
        }
        this.mState = 4;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onPause()");
            throw new SuperNotCalledException(stringBuilder.toString());
        }
    }

    void performStop() {
        this.mLifecycleRegistry.m10469a(Event.ON_STOP);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11197u();
        }
        this.mState = 3;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onStop()");
            throw new SuperNotCalledException(stringBuilder.toString());
        }
    }

    void performReallyStop() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11198v();
        }
        this.mState = 2;
    }

    void performDestroyView() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11199w();
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            if (this.mLoaderManager != null) {
                this.mLoaderManager.m11009a();
            }
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroyView()");
        throw new SuperNotCalledException(stringBuilder.toString());
    }

    void performDestroy() {
        this.mLifecycleRegistry.m10469a(Event.ON_DESTROY);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m11200x();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroy()");
        throw new SuperNotCalledException(stringBuilder.toString());
    }

    void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        StringBuilder stringBuilder;
        if (!this.mCalled) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onDetach()");
            throw new SuperNotCalledException(stringBuilder.toString());
        } else if (this.mChildFragmentManager == null) {
        } else {
            if (this.mRetaining) {
                this.mChildFragmentManager.m11200x();
                this.mChildFragmentManager = null;
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Child FragmentManager of ");
            stringBuilder.append(this);
            stringBuilder.append(" was not ");
            stringBuilder.append(" destroyed and this fragment is not retaining instance");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    void setOnStartEnterTransitionListener(C0369b c0369b) {
        ensureAnimationInfo();
        if (c0369b != this.mAnimationInfo.f1222j) {
            if (c0369b == null || this.mAnimationInfo.f1222j == null) {
                if (this.mAnimationInfo.f1221i) {
                    this.mAnimationInfo.f1222j = c0369b;
                }
                if (c0369b != null) {
                    c0369b.mo424b();
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to set a replacement startPostponedEnterTransition on ");
            stringBuilder.append(this);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private C0368a ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0368a();
        }
        return this.mAnimationInfo;
    }

    int getNextAnim() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f1216d;
    }

    void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f1216d = i;
        }
    }

    int getNextTransition() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f1217e;
    }

    void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f1217e = i;
            this.mAnimationInfo.f1218f = i2;
        }
    }

    int getNextTransitionStyle() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f1218f;
    }

    SharedElementCallback getEnterTransitionCallback() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1219g;
    }

    SharedElementCallback getExitTransitionCallback() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1220h;
    }

    View getAnimatingAway() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1213a;
    }

    void setAnimatingAway(View view) {
        ensureAnimationInfo().f1213a = view;
    }

    void setAnimator(Animator animator) {
        ensureAnimationInfo().f1214b = animator;
    }

    Animator getAnimator() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1214b;
    }

    int getStateAfterAnimating() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f1215c;
    }

    void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f1215c = i;
    }

    boolean isPostponed() {
        if (this.mAnimationInfo == null) {
            return false;
        }
        return this.mAnimationInfo.f1221i;
    }

    boolean isHideReplaced() {
        if (this.mAnimationInfo == null) {
            return false;
        }
        return this.mAnimationInfo.f1223k;
    }

    void setHideReplaced(boolean z) {
        ensureAnimationInfo().f1223k = z;
    }
}
