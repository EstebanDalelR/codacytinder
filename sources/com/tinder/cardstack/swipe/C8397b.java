package com.tinder.cardstack.swipe;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.tinder.cardstack.swipe.CardAnimation.AnimationType;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.cardstack.swipe.b */
public class C8397b {
    /* renamed from: a */
    private static final String f29812a = "b";

    /* renamed from: a */
    public static boolean m35824a(View view, float f, float f2, float f3, float f4) {
        return (f < f3 || f > f3 + ((float) view.getWidth()) || f2 < f4 || f2 > f4 + ((float) view.getHeight())) ? null : true;
    }

    @Nullable
    /* renamed from: a */
    protected ViewHolder m35825a(MotionEvent motionEvent, RecyclerView recyclerView, CardAnimator cardAnimator) {
        float x = motionEvent.getX();
        motionEvent = motionEvent.getY();
        int childCount = recyclerView.getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = recyclerView.getChildAt(childCount);
            ViewHolder findContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
            CardAnimation a = cardAnimator.m35812a(childAt);
            if (a != null) {
                if (C8397b.m35824a(childAt, x, motionEvent, a.m35795g(), a.m35796h())) {
                    if (a.m35797i() == AnimationType.SWIPE_OUT) {
                        return null;
                    }
                    return findContainingViewHolder;
                } else if (a.m35797i() != AnimationType.SWIPE_OUT) {
                    return null;
                } else {
                    childCount--;
                }
            } else if (C8397b.m35824a(childAt, x, motionEvent, childAt.getX(), childAt.getY()) != null) {
                return findContainingViewHolder;
            } else {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    protected boolean m35826a(ViewHolder viewHolder, RecyclerView recyclerView, CardAnimator cardAnimator) {
        int a = m35823a(viewHolder.itemView, recyclerView);
        if (a < 0) {
            recyclerView = new StringBuilder();
            recyclerView.append("isReadyToAcceptSwipes for index <0 ");
            recyclerView.append(viewHolder);
            C0001a.d(recyclerView.toString(), new Object[0]);
            return false;
        } else if (a < 0) {
            return false;
        } else {
            viewHolder = recyclerView.getChildCount() - 1;
            while (viewHolder >= a) {
                CardAnimation a2 = cardAnimator.m35812a(recyclerView.getChildAt(viewHolder));
                if (a2 != null) {
                    if (a2.m35797i() == AnimationType.SWIPE_OUT) {
                        viewHolder--;
                    }
                } else if (viewHolder == a) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    boolean m35827a(C8402e c8402e, VelocityTracker velocityTracker, C8401d c8401d) {
        c8402e.m35864e();
        velocityTracker.computeCurrentVelocity(c8401d.m35852b());
        return c8401d.m35851a(c8402e.m35862c(), c8402e.m35863d(), velocityTracker.getXVelocity(), velocityTracker.getYVelocity());
    }

    /* renamed from: a */
    boolean m35828a(C8402e c8402e, C8401d c8401d) {
        return c8401d.m35854b(c8402e.m35862c(), c8402e.m35863d());
    }

    /* renamed from: a */
    private int m35823a(View view, RecyclerView recyclerView) {
        recyclerView = recyclerView.indexOfChild(view);
        if (recyclerView < null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getChildViewIndex::for:index=");
            stringBuilder.append(recyclerView);
            stringBuilder.append(" for view: ");
            stringBuilder.append(view);
            C0001a.d(stringBuilder.toString(), new Object[0]);
        }
        return recyclerView;
    }
}
