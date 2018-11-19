package android.arch.paging;

import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.DiffUtil.Callback;
import android.support.v7.util.DiffUtil.DiffResult;
import android.support.v7.util.DiffUtil.ItemCallback;
import android.support.v7.util.ListUpdateCallback;

/* renamed from: android.arch.paging.i */
class C0057i {

    /* renamed from: android.arch.paging.i$a */
    private static class C2702a implements ListUpdateCallback {
        /* renamed from: a */
        private final int f8540a;
        /* renamed from: b */
        private final ListUpdateCallback f8541b;

        private C2702a(int i, ListUpdateCallback listUpdateCallback) {
            this.f8540a = i;
            this.f8541b = listUpdateCallback;
        }

        public void onInserted(int i, int i2) {
            this.f8541b.onInserted(i + this.f8540a, i2);
        }

        public void onRemoved(int i, int i2) {
            this.f8541b.onRemoved(i + this.f8540a, i2);
        }

        public void onMoved(int i, int i2) {
            this.f8541b.onRemoved(i + this.f8540a, i2 + this.f8540a);
        }

        public void onChanged(int i, int i2, Object obj) {
            this.f8541b.onChanged(i + this.f8540a, i2, obj);
        }
    }

    /* renamed from: a */
    static <T> DiffResult m223a(C0056h<T> c0056h, C0056h<T> c0056h2, ItemCallback<T> itemCallback) {
        final int j = c0056h.m219j();
        final int size = (c0056h.size() - j) - c0056h.m220k();
        final int size2 = (c0056h2.size() - c0056h2.m219j()) - c0056h2.m220k();
        final C0056h<T> c0056h3 = c0056h;
        final C0056h<T> c0056h4 = c0056h2;
        final ItemCallback<T> itemCallback2 = itemCallback;
        return DiffUtil.calculateDiff(new Callback() {
            @Nullable
            public Object getChangePayload(int i, int i2) {
                i = c0056h3.get(i + j);
                i2 = c0056h4.get(i2 + c0056h4.m212c());
                if (i != 0) {
                    if (i2 != 0) {
                        return itemCallback2.getChangePayload(i, i2);
                    }
                }
                return 0;
            }

            public int getOldListSize() {
                return size;
            }

            public int getNewListSize() {
                return size2;
            }

            public boolean areItemsTheSame(int i, int i2) {
                i = c0056h3.get(i + j);
                i2 = c0056h4.get(i2 + c0056h4.m212c());
                if (i == i2) {
                    return true;
                }
                if (i != 0) {
                    if (i2 != 0) {
                        return itemCallback2.areItemsTheSame(i, i2);
                    }
                }
                return false;
            }

            public boolean areContentsTheSame(int i, int i2) {
                i = c0056h3.get(i + j);
                i2 = c0056h4.get(i2 + c0056h4.m212c());
                if (i == i2) {
                    return true;
                }
                if (i != 0) {
                    if (i2 != 0) {
                        return itemCallback2.areContentsTheSame(i, i2);
                    }
                }
                return false;
            }
        }, true);
    }

    /* renamed from: a */
    static <T> void m224a(ListUpdateCallback listUpdateCallback, C0056h<T> c0056h, C0056h<T> c0056h2, DiffResult diffResult) {
        int k = c0056h.m220k();
        int k2 = c0056h2.m220k();
        int j = c0056h.m219j();
        c0056h2 = c0056h2.m219j();
        if (k == 0 && k2 == 0 && j == 0 && c0056h2 == null) {
            diffResult.dispatchUpdatesTo(listUpdateCallback);
            return;
        }
        if (k > k2) {
            k -= k2;
            listUpdateCallback.onRemoved(c0056h.size() - k, k);
        } else if (k < k2) {
            listUpdateCallback.onInserted(c0056h.size(), k2 - k);
        }
        if (j > c0056h2) {
            listUpdateCallback.onRemoved(0, j - c0056h2);
        } else if (j < c0056h2) {
            listUpdateCallback.onInserted(0, c0056h2 - j);
        }
        if (c0056h2 != null) {
            diffResult.dispatchUpdatesTo(new C2702a(c0056h2, listUpdateCallback));
        } else {
            diffResult.dispatchUpdatesTo(listUpdateCallback);
        }
    }
}
