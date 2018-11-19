package android.support.v4.app;

import android.arch.lifecycle.C0029n;
import android.arch.lifecycle.C0031p;
import android.arch.lifecycle.C2686i;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProvider.Factory;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.support.v4.content.Loader.OnLoadCompleteListener;
import android.support.v4.util.C0548d;
import android.support.v4.util.C0563n;
import android.util.Log;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl extends LoaderManager {
    /* renamed from: a */
    static boolean f8924a = false;
    @NonNull
    /* renamed from: b */
    private final LifecycleOwner f8925b;
    @NonNull
    /* renamed from: c */
    private final LoaderViewModel f8926c;
    /* renamed from: d */
    private boolean f8927d;

    static class LoaderViewModel extends C0029n {
        /* renamed from: a */
        private static final Factory f8919a = new C28201();
        /* renamed from: b */
        private C0563n<C4014a> f8920b = new C0563n();

        /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel$1 */
        static class C28201 implements Factory {
            C28201() {
            }

            @NonNull
            public <T extends C0029n> T create(@NonNull Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        @NonNull
        /* renamed from: a */
        static LoaderViewModel m10997a(C0031p c0031p) {
            return (LoaderViewModel) new ViewModelProvider(c0031p, f8919a).m76a(LoaderViewModel.class);
        }

        /* renamed from: a */
        void m11000a(int i, @NonNull C4014a c4014a) {
            this.f8920b.m2084b(i, c4014a);
        }

        /* renamed from: a */
        <D> C4014a<D> m10998a(int i) {
            return (C4014a) this.f8920b.m2080a(i);
        }

        /* renamed from: b */
        void m11003b(int i) {
            this.f8920b.m2086c(i);
        }

        /* renamed from: b */
        void m11002b() {
            int b = this.f8920b.m2082b();
            for (int i = 0; i < b; i++) {
                ((C4014a) this.f8920b.m2089e(i)).m15749h();
            }
        }

        /* renamed from: a */
        protected void mo391a() {
            super.mo391a();
            int b = this.f8920b.m2082b();
            for (int i = 0; i < b; i++) {
                ((C4014a) this.f8920b.m2089e(i)).m15742a(true);
            }
            this.f8920b.m2085c();
        }

        /* renamed from: a */
        public void m11001a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f8920b.m2082b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("    ");
                String stringBuilder2 = stringBuilder.toString();
                for (int i = 0; i < this.f8920b.m2082b(); i++) {
                    C4014a c4014a = (C4014a) this.f8920b.m2089e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f8920b.m2088d(i));
                    printWriter.print(": ");
                    printWriter.println(c4014a.toString());
                    c4014a.m15743a(stringBuilder2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    static class C2821b<D> implements Observer<D> {
        @NonNull
        /* renamed from: a */
        private final Loader<D> f8921a;
        @NonNull
        /* renamed from: b */
        private final LoaderCallbacks<D> f8922b;
        /* renamed from: c */
        private boolean f8923c = false;

        C2821b(@NonNull Loader<D> loader, @NonNull LoaderCallbacks<D> loaderCallbacks) {
            this.f8921a = loader;
            this.f8922b = loaderCallbacks;
        }

        public void onChanged(@Nullable D d) {
            if (LoaderManagerImpl.f8924a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  onLoadFinished in ");
                stringBuilder.append(this.f8921a);
                stringBuilder.append(": ");
                stringBuilder.append(this.f8921a.m1604c(d));
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f8922b.onLoadFinished(this.f8921a, d);
            this.f8923c = true;
        }

        /* renamed from: a */
        boolean m11005a() {
            return this.f8923c;
        }

        @MainThread
        /* renamed from: b */
        void m11006b() {
            if (this.f8923c) {
                if (LoaderManagerImpl.f8924a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("  Resetting: ");
                    stringBuilder.append(this.f8921a);
                    Log.v("LoaderManager", stringBuilder.toString());
                }
                this.f8922b.onLoaderReset(this.f8921a);
            }
        }

        public String toString() {
            return this.f8922b.toString();
        }

        /* renamed from: a */
        public void m11004a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f8923c);
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C4014a<D> extends C2686i<D> implements OnLoadCompleteListener<D> {
        /* renamed from: a */
        private final int f12766a;
        @Nullable
        /* renamed from: b */
        private final Bundle f12767b;
        @NonNull
        /* renamed from: c */
        private final Loader<D> f12768c;
        /* renamed from: d */
        private LifecycleOwner f12769d;
        /* renamed from: e */
        private C2821b<D> f12770e;
        /* renamed from: f */
        private Loader<D> f12771f;

        C4014a(int i, @Nullable Bundle bundle, @NonNull Loader<D> loader, @Nullable Loader<D> loader2) {
            this.f12766a = i;
            this.f12767b = bundle;
            this.f12768c = loader;
            this.f12771f = loader2;
            this.f12768c.m1599a(i, this);
        }

        @NonNull
        /* renamed from: g */
        Loader<D> m15748g() {
            return this.f12768c;
        }

        /* renamed from: c */
        protected void mo24c() {
            if (LoaderManagerImpl.f8924a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Starting: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f12768c.m1609k();
        }

        /* renamed from: d */
        protected void mo25d() {
            if (LoaderManagerImpl.f8924a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Stopping: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f12768c.m1613o();
        }

        @MainThread
        @NonNull
        /* renamed from: a */
        Loader<D> m15741a(@NonNull LifecycleOwner lifecycleOwner, @NonNull LoaderCallbacks<D> loaderCallbacks) {
            Object c2821b = new C2821b(this.f12768c, loaderCallbacks);
            m66a(lifecycleOwner, (Observer) c2821b);
            if (this.f12770e != null) {
                mo3031b(this.f12770e);
            }
            this.f12769d = lifecycleOwner;
            this.f12770e = c2821b;
            return this.f12768c;
        }

        /* renamed from: h */
        void m15749h() {
            LifecycleOwner lifecycleOwner = this.f12769d;
            Observer observer = this.f12770e;
            if (lifecycleOwner != null && observer != null) {
                super.mo3031b(observer);
                m66a(lifecycleOwner, observer);
            }
        }

        /* renamed from: b */
        public void mo3031b(@NonNull Observer<D> observer) {
            super.mo3031b((Observer) observer);
            this.f12769d = null;
            this.f12770e = null;
        }

        @MainThread
        /* renamed from: a */
        Loader<D> m15742a(boolean z) {
            if (LoaderManagerImpl.f8924a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Destroying: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f12768c.m1611m();
            this.f12768c.m1615q();
            Observer observer = this.f12770e;
            if (observer != null) {
                mo3031b(observer);
                if (z) {
                    observer.m11006b();
                }
            }
            this.f12768c.m1600a(this);
            if ((observer == null || observer.m11005a()) && !z) {
                return this.f12768c;
            }
            this.f12768c.m1617s();
            return this.f12771f;
        }

        public void onLoadComplete(@NonNull Loader<D> loader, @Nullable D d) {
            if (LoaderManagerImpl.f8924a != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onLoadComplete: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo40b((Object) d);
                return;
            }
            if (LoaderManagerImpl.f8924a != null) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo39a(d);
        }

        /* renamed from: b */
        public void mo40b(D d) {
            super.mo40b(d);
            if (this.f12771f != null) {
                this.f12771f.m1617s();
                this.f12771f = null;
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.f12766a);
            stringBuilder.append(" : ");
            C0548d.m2021a(this.f12768c, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }

        /* renamed from: a */
        public void m15743a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f12766a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f12767b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f12768c);
            Loader loader = this.f12768c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            loader.mo457a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
            if (this.f12770e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f12770e);
                fileDescriptor = this.f12770e;
                strArr = new StringBuilder();
                strArr.append(str);
                strArr.append("  ");
                fileDescriptor.m11004a(strArr.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m15748g().m1604c(m65a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m74e());
        }
    }

    LoaderManagerImpl(@NonNull LifecycleOwner lifecycleOwner, @NonNull C0031p c0031p) {
        this.f8925b = lifecycleOwner;
        this.f8926c = LoaderViewModel.m10997a(c0031p);
    }

    @MainThread
    @NonNull
    /* renamed from: a */
    private <D> Loader<D> m11007a(int i, @Nullable Bundle bundle, @NonNull LoaderCallbacks<D> loaderCallbacks, @Nullable Loader<D> loader) {
        try {
            this.f8927d = true;
            Loader onCreateLoader = loaderCallbacks.onCreateLoader(i, bundle);
            if (!onCreateLoader.getClass().isMemberClass() || Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                C4014a c4014a = new C4014a(i, bundle, onCreateLoader, loader);
                if (f8924a != null) {
                    loader = new StringBuilder();
                    loader.append("  Created new loader ");
                    loader.append(c4014a);
                    Log.v("LoaderManager", loader.toString());
                }
                this.f8926c.m11000a(i, c4014a);
                return c4014a.m15741a(this.f8925b, loaderCallbacks);
            }
            bundle = new StringBuilder();
            bundle.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
            bundle.append(onCreateLoader);
            throw new IllegalArgumentException(bundle.toString());
        } finally {
            this.f8927d = false;
        }
    }

    @MainThread
    @NonNull
    /* renamed from: a */
    public <D> Loader<D> mo392a(int i, @Nullable Bundle bundle, @NonNull LoaderCallbacks<D> loaderCallbacks) {
        if (this.f8927d) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        } else {
            C4014a a = this.f8926c.m10998a(i);
            if (f8924a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("initLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(": args=");
                stringBuilder.append(bundle);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            if (a == null) {
                return m11007a(i, bundle, (LoaderCallbacks) loaderCallbacks, null);
            }
            if (f8924a != 0) {
                bundle = new StringBuilder();
                bundle.append("  Re-using existing loader ");
                bundle.append(a);
                Log.v("LoaderManager", bundle.toString());
            }
            return a.m15741a(this.f8925b, loaderCallbacks);
        }
    }

    @MainThread
    @NonNull
    /* renamed from: b */
    public <D> Loader<D> mo396b(int i, @Nullable Bundle bundle, @NonNull LoaderCallbacks<D> loaderCallbacks) {
        if (this.f8927d) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        } else {
            if (f8924a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("restartLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(": args=");
                stringBuilder.append(bundle);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            C4014a a = this.f8926c.m10998a(i);
            Loader loader = null;
            if (a != null) {
                loader = a.m15742a(false);
            }
            return m11007a(i, bundle, (LoaderCallbacks) loaderCallbacks, loader);
        }
    }

    @MainThread
    /* renamed from: a */
    public void mo393a(int i) {
        if (this.f8927d) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        } else {
            if (f8924a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("destroyLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(" of ");
                stringBuilder.append(i);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            C4014a a = this.f8926c.m10998a(i);
            if (a != null) {
                a.m15742a(true);
                this.f8926c.m11003b(i);
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public <D> Loader<D> mo395b(int i) {
        if (this.f8927d) {
            throw new IllegalStateException("Called while creating a loader");
        }
        i = this.f8926c.m10998a(i);
        return i != 0 ? i.m15748g() : 0;
    }

    /* renamed from: a */
    void m11009a() {
        this.f8926c.m11002b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0548d.m2021a(this.f8925b, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo394a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f8926c.m11001a(str, fileDescriptor, printWriter, strArr);
    }
}
