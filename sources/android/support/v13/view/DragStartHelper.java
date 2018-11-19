package android.support.v13.view;

import android.view.View;

public class DragStartHelper {

    public interface OnDragStartListener {
        boolean onDragStart(View view, DragStartHelper dragStartHelper);
    }
}
