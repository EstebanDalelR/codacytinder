package com.tinder.views;

import android.content.Context;
import android.support.annotation.FloatRange;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH&J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lcom/tinder/views/TransitionViewPager;", "Landroid/support/v4/view/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewEntering", "", "index", "", "progress", "", "viewExiting", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class TransitionViewPager extends ViewPager {
    /* renamed from: a */
    public abstract void m63193a(int i, @FloatRange(from = 0.0d, to = 1.0d) float f);

    /* renamed from: b */
    public abstract void m63194b(int i, @FloatRange(from = 0.0d, to = 1.0d) float f);

    public TransitionViewPager(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        TransitionViewPager transitionViewPager = this;
        addOnPageChangeListener((OnPageChangeListener) new aa((Function2) new Function2<Integer, Float, C15813i>(transitionViewPager) {
            public final String getName() {
                return "viewEntering";
            }

            public final KDeclarationContainer getOwner() {
                return C15825i.m59860a(TransitionViewPager.class);
            }

            public final String getSignature() {
                return "viewEntering(IF)V";
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                m68170a(((Number) obj).intValue(), ((Number) obj2).floatValue());
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m68170a(int i, float f) {
                ((TransitionViewPager) this.receiver).m63193a(i, f);
            }
        }, new Function2<Integer, Float, C15813i>(transitionViewPager) {
            public final String getName() {
                return "viewExiting";
            }

            public final KDeclarationContainer getOwner() {
                return C15825i.m59860a(TransitionViewPager.class);
            }

            public final String getSignature() {
                return "viewExiting(IF)V";
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                m68171a(((Number) obj).intValue(), ((Number) obj2).floatValue());
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m68171a(int i, float f) {
                ((TransitionViewPager) this.receiver).m63194b(i, f);
            }
        }));
    }
}
