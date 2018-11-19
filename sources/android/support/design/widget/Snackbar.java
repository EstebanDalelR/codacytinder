package android.support.design.widget;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.StringRes;
import android.support.design.C0181a.C0177h;
import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.BaseTransientBottomBar.BaseCallback;
import android.support.design.widget.BaseTransientBottomBar.C0196d;
import android.support.design.widget.BaseTransientBottomBar.ContentViewCallback;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends C0196d {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            i = getChildCount();
            i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < i; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    /* renamed from: android.support.design.widget.Snackbar$a */
    public static class C2768a extends BaseCallback<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public void onDismissed(Snackbar snackbar, int i) {
        }

        public void onShown(Snackbar snackbar) {
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        super(viewGroup, view, contentViewCallback);
    }

    @NonNull
    /* renamed from: a */
    public static Snackbar m10757a(@NonNull View view, @NonNull CharSequence charSequence, int i) {
        view = m10758a(view);
        if (view == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(view.getContext()).inflate(C0177h.design_layout_snackbar_include, view, false);
        Snackbar snackbar = new Snackbar(view, snackbarContentLayout, snackbarContentLayout);
        snackbar.m10760a(charSequence);
        snackbar.m643a(i);
        return snackbar;
    }

    @NonNull
    /* renamed from: a */
    public static Snackbar m10756a(@NonNull View view, @StringRes int i, int i2) {
        return m10757a(view, view.getResources().getText(i), i2);
    }

    /* renamed from: a */
    private static ViewGroup m10758a(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                view = view.getParent();
                if (view instanceof View) {
                    view = view;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @NonNull
    /* renamed from: a */
    public Snackbar m10760a(@NonNull CharSequence charSequence) {
        ((SnackbarContentLayout) this.b.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @NonNull
    /* renamed from: a */
    public Snackbar m10759a(@StringRes int i, OnClickListener onClickListener) {
        return m10761a(m642a().getText(i), onClickListener);
    }

    @NonNull
    /* renamed from: a */
    public Snackbar m10761a(CharSequence charSequence, final OnClickListener onClickListener) {
        TextView actionView = ((SnackbarContentLayout) this.b.getChildAt(0)).getActionView();
        if (!TextUtils.isEmpty(charSequence)) {
            if (onClickListener != null) {
                actionView.setVisibility(0);
                actionView.setText(charSequence);
                actionView.setOnClickListener(new OnClickListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ Snackbar f705b;

                    public void onClick(View view) {
                        onClickListener.onClick(view);
                        this.f705b.m647b(1);
                    }
                });
                return this;
            }
        }
        actionView.setVisibility(8);
        actionView.setOnClickListener(null);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public Snackbar mo254e(@ColorInt int i) {
        ((SnackbarContentLayout) this.b.getChildAt(0)).getActionView().setTextColor(i);
        return this;
    }
}
