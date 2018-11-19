package com.tinder.chat.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ViewSwitcher;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.adapter.C10520e;
import com.tinder.chat.view.model.C8498n;
import com.tinder.domain.message.Gif;
import java.util.List;
import rx.Observable;

public class GifSelector extends ViewSwitcher {
    /* renamed from: a */
    private final C10520e f30093a = new C10520e();
    @BindView(2131362633)
    RecyclerView gifRecycler;

    /* renamed from: com.tinder.chat.view.GifSelector$a */
    private static class C12738a extends LinearLayoutManager {
        C12738a(Context context, int i, boolean z) {
            super(context, i, z);
        }
    }

    public GifSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.chat_input_gif, this);
        ButterKnife.a(this);
        this.gifRecycler.setLayoutManager(new C12738a(getContext(), 0, false));
        this.gifRecycler.setAdapter(this.f30093a);
    }

    /* renamed from: a */
    public void m36176a() {
        setDisplayedChild(1);
    }

    /* renamed from: a */
    public void m36177a(List<Gif> list) {
        setDisplayedChild(0);
        this.f30093a.m42500a((List) list);
        this.gifRecycler.smoothScrollToPosition(0);
    }

    /* renamed from: b */
    public Observable<C8498n> m36178b() {
        return this.f30093a.m42501b();
    }

    /* renamed from: c */
    public Observable<C8498n> m36179c() {
        return this.f30093a.m42498a();
    }
}
