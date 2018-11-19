package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0031p;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback;
import android.support.v4.app.ActivityCompat.PermissionCompatDelegate;
import android.support.v4.app.ActivityCompat.RequestPermissionsRequestCodeValidator;
import android.support.v4.util.C0563n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends C4311e implements ViewModelStoreOwner, OnRequestPermissionsResultCallback, RequestPermissionsRequestCodeValidator {
    static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
    static final String FRAGMENTS_TAG = "android:support:fragments";
    static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
    static final int MSG_REALLY_STOPPED = 1;
    static final int MSG_RESUME_PENDING = 2;
    static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
    static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
    private static final String TAG = "FragmentActivity";
    boolean mCreated;
    final C0392i mFragments = C0392i.m1458a(new C4013a(this));
    final Handler mHandler = new C03701(this);
    LoaderManager mLoaderManager;
    int mNextCandidateRequestIndex;
    C0563n<String> mPendingFragmentActivityResults;
    boolean mReallyStopped = true;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped = true;
    private C0031p mViewModelStore;

    /* renamed from: android.support.v4.app.FragmentActivity$1 */
    class C03701 extends Handler {
        /* renamed from: a */
        final /* synthetic */ FragmentActivity f1232a;

        C03701(FragmentActivity fragmentActivity) {
            this.f1232a = fragmentActivity;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (this.f1232a.mStopped != null) {
                        this.f1232a.doReallyStop(false);
                        return;
                    }
                    return;
                case 2:
                    this.f1232a.onResumeFragments();
                    this.f1232a.mFragments.m1484n();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    /* renamed from: android.support.v4.app.FragmentActivity$b */
    static final class C0371b {
        /* renamed from: a */
        Object f1233a;
        /* renamed from: b */
        C0031p f1234b;
        /* renamed from: c */
        C0404l f1235c;

        C0371b() {
        }
    }

    /* renamed from: android.support.v4.app.FragmentActivity$a */
    class C4013a extends C2827j<FragmentActivity> {
        /* renamed from: a */
        final /* synthetic */ FragmentActivity f12765a;

        /* renamed from: g */
        public /* synthetic */ Object mo3030g() {
            return m15736c();
        }

        public C4013a(FragmentActivity fragmentActivity) {
            this.f12765a = fragmentActivity;
            super(fragmentActivity);
        }

        /* renamed from: a */
        public void mo3022a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            this.f12765a.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo3023a(Fragment fragment) {
            return this.f12765a.isFinishing() ^ 1;
        }

        /* renamed from: b */
        public LayoutInflater mo3025b() {
            return this.f12765a.getLayoutInflater().cloneInContext(this.f12765a);
        }

        /* renamed from: c */
        public FragmentActivity m15736c() {
            return this.f12765a;
        }

        /* renamed from: d */
        public void mo3027d() {
            this.f12765a.supportInvalidateOptionsMenu();
        }

        /* renamed from: a */
        public void mo3019a(Fragment fragment, Intent intent, int i, @Nullable Bundle bundle) {
            this.f12765a.startActivityFromFragment(fragment, intent, i, bundle);
        }

        /* renamed from: a */
        public void mo3020a(Fragment fragment, IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
            this.f12765a.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        /* renamed from: a */
        public void mo3021a(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
            this.f12765a.requestPermissionsFromFragment(fragment, strArr, i);
        }

        /* renamed from: a */
        public boolean mo3024a(@NonNull String str) {
            return ActivityCompat.m10978a(this.f12765a, str);
        }

        /* renamed from: e */
        public boolean mo3028e() {
            return this.f12765a.getWindow() != null;
        }

        /* renamed from: f */
        public int mo3029f() {
            Window window = this.f12765a.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        /* renamed from: b */
        public void mo3026b(Fragment fragment) {
            this.f12765a.onAttachFragment(fragment);
        }

        @Nullable
        /* renamed from: a */
        public View mo380a(int i) {
            return this.f12765a.findViewById(i);
        }

        /* renamed from: a */
        public boolean mo381a() {
            Window window = this.f12765a.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @RequiresApi(16)
    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4) throws SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @RequiresApi(16)
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m1469b();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            String str = (String) this.mPendingFragmentActivityResults.m2080a(i3);
            this.mPendingFragmentActivityResults.m2086c(i3);
            if (str == null) {
                Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.mFragments.m1459a(str);
            if (a == null) {
                i = TAG;
                i2 = new StringBuilder();
                i2.append("Activity result no fragment exists for who: ");
                i2.append(str);
                Log.w(i, i2.toString());
            } else {
                a.onActivityResult(i & 65535, i2, intent);
            }
            return;
        }
        PermissionCompatDelegate a2 = ActivityCompat.m10972a();
        if (a2 == null || !a2.onActivityResult(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        FragmentManager a = this.mFragments.m1460a();
        boolean g = a.mo441g();
        if (!g || VERSION.SDK_INT > 25) {
            if (g || !a.mo437c()) {
                super.onBackPressed();
            }
        }
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.m10979b(this);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.m10976a((Activity) this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.m10980b(this, sharedElementCallback);
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.m10981c(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.m10982d(this);
    }

    @CallSuper
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.m1465a(z);
    }

    @CallSuper
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.m1471b(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.m1469b();
        this.mFragments.m1462a(configuration);
    }

    @NonNull
    public C0031p getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.mViewModelStore == null) {
            this.mViewModelStore = new C0031p();
        }
        return this.mViewModelStore;
    }

    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    protected void onCreate(@Nullable Bundle bundle) {
        C0404l c0404l = null;
        this.mFragments.m1464a(null);
        super.onCreate(bundle);
        C0371b c0371b = (C0371b) getLastNonConfigurationInstance();
        if (c0371b != null) {
            this.mViewModelStore = c0371b.f1234b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable(FRAGMENTS_TAG);
            C0392i c0392i = this.mFragments;
            if (c0371b != null) {
                c0404l = c0371b.f1235c;
            }
            c0392i.m1463a(parcelable, c0404l);
            if (bundle.containsKey(NEXT_CANDIDATE_REQUEST_INDEX_TAG)) {
                this.mNextCandidateRequestIndex = bundle.getInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG);
                int[] intArray = bundle.getIntArray(ALLOCATED_REQUEST_INDICIES_TAG);
                bundle = bundle.getStringArray(REQUEST_FRAGMENT_WHO_TAG);
                if (!(intArray == null || bundle == null)) {
                    if (intArray.length == bundle.length) {
                        this.mPendingFragmentActivityResults = new C0563n(intArray.length);
                        for (int i = 0; i < intArray.length; i++) {
                            this.mPendingFragmentActivityResults.m2084b(intArray[i], bundle[i]);
                        }
                    }
                }
                Log.w(TAG, "Invalid requestCode mapping in savedInstanceState.");
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C0563n();
            this.mNextCandidateRequestIndex = 0;
        }
        this.mFragments.m1475e();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.m1467a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.m1461a(view, str, context, attributeSet);
    }

    protected void onDestroy() {
        super.onDestroy();
        doReallyStop(false);
        if (!(this.mViewModelStore == null || this.mRetaining)) {
            this.mViewModelStore.m132a();
        }
        this.mFragments.m1482l();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.m1483m();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.m1468a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.m1472b(menuItem);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.m1470b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        if (this.mHandler.hasMessages(2)) {
            this.mHandler.removeMessages(2);
            onResumeFragments();
        }
        this.mFragments.m1479i();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.m1469b();
    }

    public void onStateNotSaved() {
        this.mFragments.m1469b();
    }

    protected void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.m1484n();
    }

    protected void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        onResumeFragments();
        this.mFragments.m1484n();
    }

    protected void onResumeFragments() {
        this.mFragments.m1478h();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return onPrepareOptionsPanel(view, menu) | this.mFragments.m1466a(menu);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.mStopped) {
            doReallyStop(true);
        }
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0404l d = this.mFragments.m1474d();
        if (d == null && this.mViewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0371b c0371b = new C0371b();
        c0371b.f1233a = onRetainCustomNonConfigurationInstance;
        c0371b.f1234b = this.mViewModelStore;
        c0371b.f1235c = d;
        return c0371b;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        Parcelable c = this.mFragments.m1473c();
        if (c != null) {
            bundle.putParcelable(FRAGMENTS_TAG, c);
        }
        if (this.mPendingFragmentActivityResults.m2082b() > 0) {
            bundle.putInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG, this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.m2082b()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.m2082b()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.m2082b(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.m2088d(i);
                strArr[i] = (String) this.mPendingFragmentActivityResults.m2089e(i);
            }
            bundle.putIntArray(ALLOCATED_REQUEST_INDICIES_TAG, iArr);
            bundle.putStringArray(REQUEST_FRAGMENT_WHO_TAG, strArr);
        }
    }

    protected void onStart() {
        super.onStart();
        this.mStopped = false;
        this.mReallyStopped = false;
        this.mHandler.removeMessages(1);
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m1476f();
        }
        this.mFragments.m1469b();
        this.mFragments.m1484n();
        this.mFragments.m1477g();
    }

    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mHandler.sendEmptyMessage(1);
        this.mFragments.m1480j();
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0371b c0371b = (C0371b) getLastNonConfigurationInstance();
        return c0371b != null ? c0371b.f1233a : null;
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("  ");
        String stringBuilder2 = stringBuilder.toString();
        printWriter.print(stringBuilder2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print("mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.mReallyStopped);
        if (this.mLoaderManager != null) {
            this.mLoaderManager.mo394a(stringBuilder2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m1460a().mo435a(str, fileDescriptor, printWriter, strArr);
    }

    void doReallyStop(boolean z) {
        if (!this.mReallyStopped) {
            this.mReallyStopped = true;
            this.mRetaining = z;
            this.mHandler.removeMessages(1);
            onReallyStop();
        }
    }

    void onReallyStop() {
        this.mFragments.m1481k();
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.m1460a();
    }

    public LoaderManager getSupportLoaderManager() {
        if (this.mLoaderManager != null) {
            return this.mLoaderManager;
        }
        this.mLoaderManager = new LoaderManagerImpl(this, getViewModelStore());
        return this.mLoaderManager;
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.mStartedActivityFromFragment || i == -1)) {
            C4016d.checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            C4016d.checkForValidRequestCode(i);
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.m1469b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            i2--;
            String str = (String) this.mPendingFragmentActivityResults.m2080a(i2);
            this.mPendingFragmentActivityResults.m2086c(i2);
            if (str == null) {
                Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.mFragments.m1459a(str);
            if (a == null) {
                i = TAG;
                strArr = new StringBuilder();
                strArr.append("Activity result no fragment exists for who: ");
                strArr.append(str);
                Log.w(i, strArr.toString());
            } else {
                a.onRequestPermissionsResult(i & 65535, strArr, iArr);
            }
        }
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, @Nullable Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                ActivityCompat.m10974a(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            C4016d.checkForValidRequestCode(i);
            ActivityCompat.m10974a(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        int i5 = i;
        this.mStartedIntentSenderFromFragment = true;
        if (i5 == -1) {
            try {
                ActivityCompat.m10975a(r9, intentSender, i5, intent, i2, i3, i4, bundle);
                r9.mStartedIntentSenderFromFragment = false;
            } catch (Throwable th) {
                Throwable th2 = th;
                r9.mStartedIntentSenderFromFragment = false;
            }
        } else {
            C4016d.checkForValidRequestCode(i5);
            ActivityCompat.m10975a(r9, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (65535 & i5), intent, i2, i3, i4, bundle);
            r9.mStartedIntentSenderFromFragment = false;
        }
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.m2082b() >= MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.mPendingFragmentActivityResults.m2090f(this.mNextCandidateRequestIndex) >= 0) {
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
        }
        int i = this.mNextCandidateRequestIndex;
        this.mPendingFragmentActivityResults.m2084b(i, fragment.mWho);
        this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
        return i;
    }

    void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            ActivityCompat.m10977a(this, strArr, i);
            return;
        }
        C4016d.checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            ActivityCompat.m10977a(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.mRequestedPermissionsFromFragment = false;
        }
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), State.CREATED));
    }

    private static boolean markState(FragmentManager fragmentManager, State state) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.mo439e()) {
            if (fragment != null) {
                if (fragment.getLifecycle().mo35a().isAtLeast(State.STARTED)) {
                    fragment.mLifecycleRegistry.m10470a(state);
                    z = true;
                }
                FragmentManager peekChildFragmentManager = fragment.peekChildFragmentManager();
                if (peekChildFragmentManager != null) {
                    z |= markState(peekChildFragmentManager, state);
                }
            }
        }
        return z;
    }
}
