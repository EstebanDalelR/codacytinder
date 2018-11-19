package android.support.v7.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

class ResourcesFlusher {
    private static final String TAG = "ResourcesFlusher";
    private static Field sDrawableCacheField;
    private static boolean sDrawableCacheFieldFetched;
    private static Field sResourcesImplField;
    private static boolean sResourcesImplFieldFetched;
    private static Class sThemedResourceCacheClazz;
    private static boolean sThemedResourceCacheClazzFetched;
    private static Field sThemedResourceCache_mUnthemedEntriesField;
    private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;

    ResourcesFlusher() {
    }

    static boolean flush(@NonNull Resources resources) {
        if (VERSION.SDK_INT >= 24) {
            return flushNougats(resources);
        }
        if (VERSION.SDK_INT >= 23) {
            return flushMarshmallows(resources);
        }
        return VERSION.SDK_INT >= 21 ? flushLollipops(resources) : null;
    }

    @RequiresApi(21)
    private static boolean flushLollipops(@NonNull Resources resources) {
        if (!sDrawableCacheFieldFetched) {
            try {
                sDrawableCacheField = Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField.setAccessible(true);
            } catch (Throwable e) {
                Log.e(TAG, "Could not retrieve Resources#mDrawableCache field", e);
            }
            sDrawableCacheFieldFetched = true;
        }
        if (sDrawableCacheField != null) {
            try {
                resources = (Map) sDrawableCacheField.get(resources);
            } catch (Resources resources2) {
                Log.e(TAG, "Could not retrieve value from Resources#mDrawableCache", resources2);
                resources2 = null;
            }
            if (resources2 != null) {
                resources2.clear();
                return true;
            }
        }
        return null;
    }

    @RequiresApi(23)
    private static boolean flushMarshmallows(@NonNull Resources resources) {
        boolean z;
        if (!sDrawableCacheFieldFetched) {
            try {
                sDrawableCacheField = Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField.setAccessible(true);
            } catch (Throwable e) {
                Log.e(TAG, "Could not retrieve Resources#mDrawableCache field", e);
            }
            sDrawableCacheFieldFetched = true;
        }
        if (sDrawableCacheField != null) {
            try {
                resources = sDrawableCacheField.get(resources);
            } catch (Resources resources2) {
                Log.e(TAG, "Could not retrieve value from Resources#mDrawableCache", resources2);
            }
            z = false;
            if (resources2 == null) {
                return false;
            }
            if (!(resources2 == null || flushThemedResourcesCache(resources2) == null)) {
                z = true;
            }
            return z;
        }
        resources2 = null;
        z = false;
        if (resources2 == null) {
            return false;
        }
        z = true;
        return z;
    }

    @RequiresApi(24)
    private static boolean flushNougats(@NonNull Resources resources) {
        boolean z = true;
        if (!sResourcesImplFieldFetched) {
            try {
                sResourcesImplField = Resources.class.getDeclaredField("mResourcesImpl");
                sResourcesImplField.setAccessible(true);
            } catch (Throwable e) {
                Log.e(TAG, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            sResourcesImplFieldFetched = true;
        }
        if (sResourcesImplField == null) {
            return false;
        }
        try {
            resources = sResourcesImplField.get(resources);
        } catch (Resources resources2) {
            Log.e(TAG, "Could not retrieve value from Resources#mResourcesImpl", resources2);
            resources2 = null;
        }
        if (resources2 == null) {
            return false;
        }
        if (!sDrawableCacheFieldFetched) {
            try {
                sDrawableCacheField = resources2.getClass().getDeclaredField("mDrawableCache");
                sDrawableCacheField.setAccessible(true);
            } catch (Throwable e2) {
                Log.e(TAG, "Could not retrieve ResourcesImpl#mDrawableCache field", e2);
            }
            sDrawableCacheFieldFetched = true;
        }
        if (sDrawableCacheField != null) {
            try {
                resources2 = sDrawableCacheField.get(resources2);
            } catch (Resources resources22) {
                Log.e(TAG, "Could not retrieve value from ResourcesImpl#mDrawableCache", resources22);
            }
            if (resources22 != null || flushThemedResourcesCache(resources22) == null) {
                z = false;
            }
            return z;
        }
        resources22 = null;
        if (resources22 != null) {
        }
        z = false;
        return z;
    }

    @RequiresApi(16)
    private static boolean flushThemedResourcesCache(@NonNull Object obj) {
        if (!sThemedResourceCacheClazzFetched) {
            try {
                sThemedResourceCacheClazz = Class.forName("android.content.res.ThemedResourceCache");
            } catch (Throwable e) {
                Log.e(TAG, "Could not find ThemedResourceCache class", e);
            }
            sThemedResourceCacheClazzFetched = true;
        }
        if (sThemedResourceCacheClazz == null) {
            return false;
        }
        if (!sThemedResourceCache_mUnthemedEntriesFieldFetched) {
            try {
                sThemedResourceCache_mUnthemedEntriesField = sThemedResourceCacheClazz.getDeclaredField("mUnthemedEntries");
                sThemedResourceCache_mUnthemedEntriesField.setAccessible(true);
            } catch (Throwable e2) {
                Log.e(TAG, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
        }
        if (sThemedResourceCache_mUnthemedEntriesField == null) {
            return false;
        }
        try {
            obj = (LongSparseArray) sThemedResourceCache_mUnthemedEntriesField.get(obj);
        } catch (Object obj2) {
            Log.e(TAG, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", obj2);
            obj2 = null;
        }
        if (obj2 == null) {
            return false;
        }
        obj2.clear();
        return true;
    }
}
