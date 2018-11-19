package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.support.v7.recyclerview.C0670R;
import android.support.v7.widget.RecyclerView;
import android.view.View;

class ItemTouchUIUtilImpl {

    static class BaseImpl implements ItemTouchUIUtil {
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        }

        public void onSelected(View view) {
        }

        BaseImpl() {
        }

        public void clearView(View view) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }
    }

    static class Api21Impl extends BaseImpl {
        Api21Impl() {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            if (z && view.getTag(C0670R.id.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(ViewCompat.m2223o(view));
                ViewCompat.m2215i(view, findMaxElevation(recyclerView, view) + 1.0f);
                view.setTag(C0670R.id.item_touch_helper_previous_elevation, valueOf);
            }
            super.onDraw(canvas, recyclerView, view, f, f2, i, z);
        }

        private float findMaxElevation(RecyclerView recyclerView, View view) {
            int childCount = recyclerView.getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float o = ViewCompat.m2223o(childAt);
                    if (o > f) {
                        f = o;
                    }
                }
            }
            return f;
        }

        public void clearView(View view) {
            Object tag = view.getTag(C0670R.id.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                ViewCompat.m2215i(view, ((Float) tag).floatValue());
            }
            view.setTag(C0670R.id.item_touch_helper_previous_elevation, null);
            super.clearView(view);
        }
    }

    ItemTouchUIUtilImpl() {
    }
}
