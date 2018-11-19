package com.snapchat.kit.sdk.bitmoji.ui.viewholder;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5881b;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5882c;
import com.snapchat.kit.sdk.bitmoji.models.Sticker;
import com.snapchat.kit.sdk.bitmoji.ui.p147c.C5912a;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class StickerViewHolder extends ViewHolder {
    /* renamed from: a */
    private final Picasso f25858a;
    /* renamed from: b */
    private final OnStickerLoadListener f25859b;
    /* renamed from: c */
    private final View f25860c;
    /* renamed from: d */
    private final ImageView f25861d;
    /* renamed from: e */
    private final ObjectAnimator f25862e;
    /* renamed from: f */
    private Sticker f25863f = null;
    /* renamed from: g */
    private boolean f25864g = false;
    /* renamed from: h */
    private boolean f25865h = false;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.viewholder.StickerViewHolder$2 */
    class C59292 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ StickerViewHolder f21696a;

        C59292(StickerViewHolder stickerViewHolder) {
            this.f21696a = stickerViewHolder;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            view = motionEvent.getAction();
            if (view != 3) {
                switch (view) {
                    case null:
                        this.f21696a.f25862e.start();
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
            this.f21696a.f25862e.reverse();
            return null;
        }
    }

    public interface OnStickerClickListener {
        void onStickerClick(StickerViewHolder stickerViewHolder, Sticker sticker);
    }

    public interface OnStickerLoadListener {
        void onStickerLoadFailure(StickerViewHolder stickerViewHolder, Sticker sticker);

        void onStickerLoadSuccess(StickerViewHolder stickerViewHolder, Sticker sticker);
    }

    public StickerViewHolder(View view, Picasso picasso, final OnStickerClickListener onStickerClickListener, OnStickerLoadListener onStickerLoadListener) {
        super(view);
        this.f25858a = picasso;
        this.f25859b = onStickerLoadListener;
        this.f25860c = view.findViewById(C5882c.snap_connect_bitmoji_sticker_placeholder);
        this.f25861d = (ImageView) view.findViewById(C5882c.snap_connect_bitmoji_sticker_view);
        this.f25862e = C5912a.m25500a(this.f25861d);
        this.f25861d.setOnClickListener(new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ StickerViewHolder f21695b;

            public void onClick(View view) {
                if (this.f21695b.f25864g == null) {
                    if (this.f21695b.f25863f != null) {
                        onStickerClickListener.onStickerClick(this.f21695b, this.f21695b.f25863f);
                    }
                }
            }
        });
        this.f25861d.setOnTouchListener(new C59292(this));
    }

    /* renamed from: a */
    public void m30775a(@NonNull final Sticker sticker) {
        final Context context = this.f25861d.getContext();
        this.f25864g = true;
        this.f25861d.setImageDrawable(null);
        this.f25861d.setVisibility(4);
        this.f25860c.setVisibility(0);
        this.f25863f = sticker;
        this.f25858a.m26429a(sticker.getImageUrl()).m26530a(this.f25861d, new Callback(this) {
            /* renamed from: c */
            final /* synthetic */ StickerViewHolder f25857c;

            public void onSuccess() {
                this.f25857c.m30770d();
                this.f25857c.f25859b.onStickerLoadSuccess(this.f25857c, sticker);
                this.f25857c.f25865h = true;
            }

            public void onError() {
                this.f25857c.m30770d();
                this.f25857c.f25859b.onStickerLoadFailure(this.f25857c, sticker);
                this.f25857c.f25861d.setImageDrawable(context.getResources().getDrawable(C5881b.snap_connect_bitmoji_retry));
            }
        });
    }

    /* renamed from: a */
    public void m30774a() {
        if (!this.f25865h) {
            if (this.f25863f != null) {
                m30775a(this.f25863f);
            }
        }
    }

    /* renamed from: b */
    public void m30776b() {
        this.f25865h = false;
        this.f25864g = false;
        this.f25861d.setVisibility(4);
        Picasso.m26423a(this.f25861d.getContext()).m26431a(this.f25861d);
    }

    /* renamed from: d */
    private void m30770d() {
        this.f25860c.setVisibility(8);
        this.f25861d.setVisibility(0);
        this.f25864g = false;
    }

    /* renamed from: c */
    public boolean m30777c() {
        return this.f25865h;
    }
}
