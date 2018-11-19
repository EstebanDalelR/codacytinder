package android.support.v4.view;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

public final class AsyncLayoutInflater {

    public interface OnInflateFinishedListener {
        void onInflateFinished(@NonNull View view, @LayoutRes int i, @Nullable ViewGroup viewGroup);
    }
}
