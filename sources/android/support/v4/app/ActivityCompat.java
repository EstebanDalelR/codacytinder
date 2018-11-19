package android.support.v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.content.C0432b;
import android.view.View;
import java.util.List;
import java.util.Map;

public class ActivityCompat extends C0432b {
    /* renamed from: a */
    private static PermissionCompatDelegate f8902a;

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    public interface PermissionCompatDelegate {
        boolean onActivityResult(@NonNull Activity activity, @IntRange(from = 0) int i, int i2, @Nullable Intent intent);

        boolean requestPermissions(@NonNull Activity activity, @NonNull String[] strArr, @IntRange(from = 0) int i);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.app.ActivityCompat$a */
    private static class C0364a extends SharedElementCallback {
        /* renamed from: a */
        protected SharedElementCallback f1211a;

        C0364a(SharedElementCallback sharedElementCallback) {
            this.f1211a = sharedElementCallback;
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f1211a.m1437a((List) list, (List) list2, (List) list3);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f1211a.m1439b(list, list2, list3);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f1211a.m1435a((List) list);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f1211a.m1438a((List) list, (Map) map);
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f1211a.m1433a(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f1211a.m1434a(context, parcelable);
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.app.ActivityCompat$b */
    private static class C2813b extends C0364a {
        C2813b(SharedElementCallback sharedElementCallback) {
            super(sharedElementCallback);
        }

        public void onSharedElementsArrived(List<String> list, List<View> list2, final OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.a.m1436a((List) list, (List) list2, new SharedElementCallback.OnSharedElementsReadyListener(this) {
                /* renamed from: b */
                final /* synthetic */ C2813b f8901b;

                public void onSharedElementsReady() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            });
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static PermissionCompatDelegate m10972a() {
        return f8902a;
    }

    /* renamed from: a */
    public static void m10974a(@NonNull Activity activity, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m10975a(@NonNull Activity activity, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws SendIntentException {
        if (VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m10973a(@NonNull Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: b */
    public static void m10979b(@NonNull Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m10976a(@NonNull Activity activity, @Nullable SharedElementCallback sharedElementCallback) {
        SharedElementCallback sharedElementCallback2 = null;
        if (VERSION.SDK_INT >= 23) {
            if (sharedElementCallback != null) {
                sharedElementCallback2 = new C2813b(sharedElementCallback);
            }
            activity.setEnterSharedElementCallback(sharedElementCallback2);
        } else if (VERSION.SDK_INT >= 21) {
            if (sharedElementCallback != null) {
                sharedElementCallback2 = new C0364a(sharedElementCallback);
            }
            activity.setEnterSharedElementCallback(sharedElementCallback2);
        }
    }

    /* renamed from: b */
    public static void m10980b(@NonNull Activity activity, @Nullable SharedElementCallback sharedElementCallback) {
        SharedElementCallback sharedElementCallback2 = null;
        if (VERSION.SDK_INT >= 23) {
            if (sharedElementCallback != null) {
                sharedElementCallback2 = new C2813b(sharedElementCallback);
            }
            activity.setExitSharedElementCallback(sharedElementCallback2);
        } else if (VERSION.SDK_INT >= 21) {
            if (sharedElementCallback != null) {
                sharedElementCallback2 = new C0364a(sharedElementCallback);
            }
            activity.setExitSharedElementCallback(sharedElementCallback2);
        }
    }

    /* renamed from: c */
    public static void m10981c(@NonNull Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    /* renamed from: d */
    public static void m10982d(@NonNull Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: a */
    public static void m10977a(@NonNull final Activity activity, @NonNull final String[] strArr, @IntRange(from = 0) final int i) {
        if (f8902a == null || !f8902a.requestPermissions(activity, strArr, i)) {
            if (VERSION.SDK_INT >= 23) {
                if (activity instanceof RequestPermissionsRequestCodeValidator) {
                    ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof OnRequestPermissionsResultCallback) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        int[] iArr = new int[strArr.length];
                        PackageManager packageManager = activity.getPackageManager();
                        String packageName = activity.getPackageName();
                        int length = strArr.length;
                        for (int i = 0; i < length; i++) {
                            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                        }
                        ((OnRequestPermissionsResultCallback) activity).onRequestPermissionsResult(i, strArr, iArr);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static boolean m10978a(@NonNull Activity activity, @NonNull String str) {
        return VERSION.SDK_INT >= 23 ? activity.shouldShowRequestPermissionRationale(str) : null;
    }
}
