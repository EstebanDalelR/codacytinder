package android.support.v4.app;

import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class LoaderManager {

    public interface LoaderCallbacks<D> {
        @MainThread
        @NonNull
        Loader<D> onCreateLoader(int i, @Nullable Bundle bundle);

        @MainThread
        void onLoadFinished(@NonNull Loader<D> loader, D d);

        @MainThread
        void onLoaderReset(@NonNull Loader<D> loader);
    }

    @MainThread
    @NonNull
    /* renamed from: a */
    public abstract <D> Loader<D> mo392a(int i, @Nullable Bundle bundle, @NonNull LoaderCallbacks<D> loaderCallbacks);

    @MainThread
    /* renamed from: a */
    public abstract void mo393a(int i);

    /* renamed from: a */
    public abstract void mo394a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @Nullable
    /* renamed from: b */
    public abstract <D> Loader<D> mo395b(int i);

    @MainThread
    @NonNull
    /* renamed from: b */
    public abstract <D> Loader<D> mo396b(int i, @Nullable Bundle bundle, @NonNull LoaderCallbacks<D> loaderCallbacks);

    /* renamed from: a */
    public static void m1394a(boolean z) {
        LoaderManagerImpl.f8924a = z;
    }
}
