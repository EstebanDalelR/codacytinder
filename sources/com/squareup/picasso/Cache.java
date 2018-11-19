package com.squareup.picasso;

import android.graphics.Bitmap;

public interface Cache {
    /* renamed from: a */
    public static final Cache f22294a = new C72491();

    /* renamed from: com.squareup.picasso.Cache$1 */
    static class C72491 implements Cache {
        public void clear() {
        }

        public void clearKeyUri(String str) {
        }

        public Bitmap get(String str) {
            return null;
        }

        public int maxSize() {
            return 0;
        }

        public void set(String str, Bitmap bitmap) {
        }

        public int size() {
            return 0;
        }

        C72491() {
        }
    }

    void clear();

    void clearKeyUri(String str);

    Bitmap get(String str);

    int maxSize();

    void set(String str, Bitmap bitmap);

    int size();
}
