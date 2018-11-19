package android.support.v4.widget;

import android.support.annotation.NonNull;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.j */
public class C2913j extends C0630a {
    /* renamed from: f */
    private final ListView f9197f;

    /* renamed from: e */
    public boolean mo641e(int i) {
        return false;
    }

    public C2913j(@NonNull ListView listView) {
        super(listView);
        this.f9197f = listView;
    }

    /* renamed from: a */
    public void mo640a(int i, int i2) {
        C0644k.m2585a(this.f9197f, i2);
    }

    /* renamed from: f */
    public boolean mo642f(int i) {
        ListView listView = this.f9197f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                return true;
            }
            return false;
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0) {
                return true;
            }
            return false;
        }
        return true;
    }
}
