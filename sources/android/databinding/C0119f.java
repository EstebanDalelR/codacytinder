package android.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.databinding.f */
public class C0119f {
    /* renamed from: a */
    private static C0118d f269a = new C2729e();
    /* renamed from: b */
    private static DataBindingComponent f270b;

    @Nullable
    /* renamed from: a */
    public static DataBindingComponent m356a() {
        return f270b;
    }

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m360a(@NonNull LayoutInflater layoutInflater, int i, @Nullable ViewGroup viewGroup, boolean z) {
        return C0119f.m361a(layoutInflater, i, viewGroup, z, f270b);
    }

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m361a(@NonNull LayoutInflater layoutInflater, int i, @Nullable ViewGroup viewGroup, boolean z, @Nullable DataBindingComponent dataBindingComponent) {
        int i2 = 0;
        Object obj = (viewGroup == null || !z) ? null : 1;
        if (obj != null) {
            i2 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (obj != null) {
            return C0119f.m358a(dataBindingComponent, viewGroup, i2, i);
        }
        return C0119f.m357a(dataBindingComponent, inflate, i);
    }

    /* renamed from: a */
    static <T extends ViewDataBinding> T m359a(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        return f269a.mo141a(dataBindingComponent, viewArr, i);
    }

    /* renamed from: a */
    static <T extends ViewDataBinding> T m357a(DataBindingComponent dataBindingComponent, View view, int i) {
        return f269a.mo140a(dataBindingComponent, view, i);
    }

    /* renamed from: a */
    private static <T extends ViewDataBinding> T m358a(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return C0119f.m357a(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return C0119f.m359a(dataBindingComponent, viewArr, i2);
    }
}
