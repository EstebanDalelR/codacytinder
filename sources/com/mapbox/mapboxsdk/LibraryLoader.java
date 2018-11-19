package com.mapbox.mapboxsdk;

import p000a.p001a.C0001a;

public abstract class LibraryLoader {
    private static final LibraryLoader DEFAULT = new C70951();
    private static volatile LibraryLoader loader = DEFAULT;

    /* renamed from: com.mapbox.mapboxsdk.LibraryLoader$1 */
    static class C70951 extends LibraryLoader {
        C70951() {
        }

        public void load(String str) {
            System.loadLibrary(str);
        }
    }

    public abstract void load(String str);

    public static void setLibraryLoader(LibraryLoader libraryLoader) {
        loader = libraryLoader;
    }

    public static void load() {
        try {
            loader.load("mapbox-gl");
        } catch (Throwable e) {
            C0001a.c(e, "Failed to load native shared library.", new Object[0]);
        }
    }
}
