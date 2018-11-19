package com.tinder.utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

public class RecyclerItemClickListener implements OnItemTouchListener {
    /* renamed from: a */
    private OnItemClickListener f52810a;
    /* renamed from: b */
    private boolean f52811b = true;
    /* renamed from: c */
    private GestureDetector f52812c;

    /* renamed from: com.tinder.utils.RecyclerItemClickListener$1 */
    class C153531 extends SimpleOnGestureListener {
        /* renamed from: a */
        long f47611a = -1;
        /* renamed from: b */
        long f47612b = -1;
        /* renamed from: c */
        final /* synthetic */ RecyclerItemClickListener f47613c;

        C153531(RecyclerItemClickListener recyclerItemClickListener) {
            this.f47613c = recyclerItemClickListener;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            long eventTime = motionEvent.getEventTime();
            if (this.f47612b <= -1 || eventTime - this.f47612b >= 700) {
                motionEvent = new StringBuilder();
                motionEvent.append("Fling Ended: ");
                motionEvent.append(this.f47612b);
                motionEvent.append(", tap time: ");
                motionEvent.append(eventTime);
                motionEvent.append(", diff: ");
                motionEvent.append(eventTime - this.f47612b);
                motionEvent.append(", return: true");
                ad.a(motionEvent.toString());
                return true;
            }
            motionEvent = new StringBuilder();
            motionEvent.append("Fling Ended: ");
            motionEvent.append(this.f47612b);
            motionEvent.append(", tap time: ");
            motionEvent.append(eventTime);
            motionEvent.append(", diff: ");
            motionEvent.append(eventTime - this.f47612b);
            motionEvent.append(", return: false");
            ad.a(motionEvent.toString());
            return null;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent != null) {
                this.f47611a = motionEvent.getEventTime();
            }
            if (motionEvent2 != null) {
                this.f47612b = motionEvent2.getEventTime();
            }
            motionEvent = new StringBuilder();
            motionEvent.append("Fling detected: ");
            motionEvent.append(this.f47611a);
            motionEvent.append(", end: ");
            motionEvent.append(this.f47612b);
            ad.a(motionEvent.toString());
            return null;
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int i);
    }

    public RecyclerItemClickListener(Context context, OnItemClickListener onItemClickListener) {
        this.f52810a = onItemClickListener;
        this.f52812c = new GestureDetector(context, new C153531(this));
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.f52811b) {
            return false;
        }
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (!(findChildViewUnder == null || this.f52810a == null || this.f52812c.onTouchEvent(motionEvent) == null)) {
            recyclerView = recyclerView.getChildAdapterPosition(findChildViewUnder);
            if (recyclerView != -1) {
                this.f52810a.onItemClick(findChildViewUnder, recyclerView);
                return true;
            }
        }
        return false;
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        recyclerView = motionEvent.getActionMasked();
        this.f52812c.onTouchEvent(motionEvent);
        if (recyclerView != 3) {
            switch (recyclerView) {
                case null:
                    this.f52811b = true;
                    return;
                case 1:
                    this.f52811b = false;
                    return;
                default:
                    return;
            }
        }
        this.f52811b = false;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
        this.f52811b = z ^ 1;
    }
}
