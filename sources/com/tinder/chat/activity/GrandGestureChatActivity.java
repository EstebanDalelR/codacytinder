package com.tinder.chat.activity;

import android.view.View;
import com.tinder.R;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"Lcom/tinder/chat/activity/GrandGestureChatActivity;", "Lcom/tinder/chat/activity/ChatActivity;", "()V", "getLayoutResId", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GrandGestureChatActivity extends ChatActivity {
    /* renamed from: e */
    private HashMap f45464e;

    /* renamed from: b */
    public View mo11519b(int i) {
        if (this.f45464e == null) {
            this.f45464e = new HashMap();
        }
        View view = (View) this.f45464e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45464e.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: d */
    protected int mo11520d() {
        return R.layout.activity_chat_grand_gestures;
    }
}
