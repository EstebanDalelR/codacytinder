package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.C0582a;
import android.support.v4.view.accessibility.C0586b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class RecyclerViewAccessibilityDelegate extends C0582a {
    final C0582a mItemDelegate = new ItemDelegate(this);
    final RecyclerView mRecyclerView;

    public static class ItemDelegate extends C0582a {
        final RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;

        public ItemDelegate(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.mRecyclerViewDelegate = recyclerViewAccessibilityDelegate;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
            super.onInitializeAccessibilityNodeInfo(view, c0586b);
            if (!this.mRecyclerViewDelegate.shouldIgnore() && this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() != null) {
                this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c0586b);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) ? null : this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle) != null) {
            return true;
        }
        return (shouldIgnore() != null || this.mRecyclerView.getLayoutManager() == null) ? null : this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
        super.onInitializeAccessibilityNodeInfo(view, c0586b);
        c0586b.m2264b(RecyclerView.class.getName());
        if (shouldIgnore() == null && this.mRecyclerView.getLayoutManager() != null) {
            this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c0586b);
        }
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !shouldIgnore()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    public C0582a getItemDelegate() {
        return this.mItemDelegate;
    }
}
