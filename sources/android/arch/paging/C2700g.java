package android.arch.paging;

import android.arch.paging.C0039a.C0038a;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil.ItemCallback;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;

/* renamed from: android.arch.paging.g */
public abstract class C2700g<T, VH extends ViewHolder> extends Adapter<VH> {
    /* renamed from: a */
    private final C0039a<T> f8532a;
    /* renamed from: b */
    private final C0038a<T> f8533b = new C26991(this);

    /* renamed from: android.arch.paging.g$1 */
    class C26991 implements C0038a<T> {
        /* renamed from: a */
        final /* synthetic */ C2700g f8531a;

        C26991(C2700g c2700g) {
            this.f8531a = c2700g;
        }

        /* renamed from: a */
        public void mo60a(@Nullable C0054f<T> c0054f) {
            this.f8531a.m10518b(c0054f);
        }
    }

    /* renamed from: b */
    public void m10518b(@Nullable C0054f<T> c0054f) {
    }

    protected C2700g(@NonNull ItemCallback<T> itemCallback) {
        this.f8532a = new C0039a(this, itemCallback);
        this.f8532a.f80b = this.f8533b;
    }

    /* renamed from: a */
    public void m10517a(C0054f<T> c0054f) {
        this.f8532a.m154a((C0054f) c0054f);
    }

    @Nullable
    /* renamed from: a */
    protected T m10516a(int i) {
        return this.f8532a.m153a(i);
    }

    public int getItemCount() {
        return this.f8532a.m152a();
    }
}
