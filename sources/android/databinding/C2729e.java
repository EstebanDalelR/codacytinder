package android.databinding;

import android.view.View;
import com.tinder.R;
import com.tinder.p361b.C13626a;
import com.tinder.p361b.C13627b;
import com.tinder.p361b.C13628c;
import com.tinder.p361b.C13629d;
import com.tinder.p361b.C13630e;
import com.tinder.p361b.C13631f;

/* renamed from: android.databinding.e */
class C2729e extends C0118d {
    /* renamed from: a */
    public ViewDataBinding mo140a(DataBindingComponent dataBindingComponent, View view, int i) {
        switch (i) {
            case R.layout.dialog_overflow_menu:
                i = view.getTag();
                if (i == 0) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/dialog_overflow_menu_0".equals(i)) {
                    return new C13626a(dataBindingComponent, view);
                } else {
                    view = new StringBuilder();
                    view.append("The tag for dialog_overflow_menu is invalid. Received: ");
                    view.append(i);
                    throw new IllegalArgumentException(view.toString());
                }
            case R.layout.row_view_feed_sharing_option_item:
                i = view.getTag();
                if (i == 0) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/row_view_feed_sharing_option_item_0".equals(i)) {
                    return new C13627b(dataBindingComponent, view);
                } else {
                    view = new StringBuilder();
                    view.append("The tag for row_view_feed_sharing_option_item is invalid. Received: ");
                    view.append(i);
                    throw new IllegalArgumentException(view.toString());
                }
            case R.layout.view_feed_setting_item:
                i = view.getTag();
                if (i == 0) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/view_feed_setting_item_0".equals(i)) {
                    return new C13628c(dataBindingComponent, new View[]{view});
                } else {
                    view = new StringBuilder();
                    view.append("The tag for view_feed_setting_item is invalid. Received: ");
                    view.append(i);
                    throw new IllegalArgumentException(view.toString());
                }
            case R.layout.view_feed_settings:
                i = view.getTag();
                if (i == 0) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/view_feed_settings_0".equals(i)) {
                    return new C13629d(dataBindingComponent, new View[]{view});
                } else {
                    view = new StringBuilder();
                    view.append("The tag for view_feed_settings is invalid. Received: ");
                    view.append(i);
                    throw new IllegalArgumentException(view.toString());
                }
            case R.layout.view_overflow_menu_item:
                i = view.getTag();
                if (i == 0) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/view_overflow_menu_item_0".equals(i)) {
                    return new C13630e(dataBindingComponent, view);
                } else {
                    view = new StringBuilder();
                    view.append("The tag for view_overflow_menu_item is invalid. Received: ");
                    view.append(i);
                    throw new IllegalArgumentException(view.toString());
                }
            case R.layout.view_switch_row:
                i = view.getTag();
                if (i == 0) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/view_switch_row_0".equals(i)) {
                    return new C13631f(dataBindingComponent, new View[]{view});
                } else {
                    view = new StringBuilder();
                    view.append("The tag for view_switch_row is invalid. Received: ");
                    view.append(i);
                    throw new IllegalArgumentException(view.toString());
                }
            default:
                return null;
        }
    }

    /* renamed from: a */
    public ViewDataBinding mo141a(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (i == R.layout.view_switch_row) {
            return new C13631f(dataBindingComponent, viewArr);
        }
        switch (i) {
            case R.layout.view_feed_setting_item:
                return new C13628c(dataBindingComponent, viewArr);
            case R.layout.view_feed_settings:
                return new C13629d(dataBindingComponent, viewArr);
            default:
                return null;
        }
    }
}
