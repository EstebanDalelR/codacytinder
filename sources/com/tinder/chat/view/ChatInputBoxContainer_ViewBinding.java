package com.tinder.chat.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.bitmoji.view.BitmojiIconView;
import com.tinder.bitmoji.view.BitmojiPickerView;
import com.tinder.reactions.drawer.view.ChatInputEditText;

public class ChatInputBoxContainer_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ChatInputBoxContainer f34333b;
    /* renamed from: c */
    private View f34334c;
    /* renamed from: d */
    private View f34335d;

    @UiThread
    public ChatInputBoxContainer_ViewBinding(final ChatInputBoxContainer chatInputBoxContainer, View view) {
        this.f34333b = chatInputBoxContainer;
        chatInputBoxContainer.inputSwitcher = (ViewSwitcher) C0761c.b(view, R.id.chat_input_switcher, "field 'inputSwitcher'", ViewSwitcher.class);
        View a = C0761c.a(view, R.id.chat_control_gif_switcher, "field 'gifSwitcher' and method 'onGifSwitchClicked'");
        chatInputBoxContainer.gifSwitcher = (ImageSwitcher) C0761c.c(a, R.id.chat_control_gif_switcher, "field 'gifSwitcher'", ImageSwitcher.class);
        this.f34334c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ChatInputBoxContainer_ViewBinding f34330b;

            public void doClick(View view) {
                chatInputBoxContainer.onGifSwitchClicked();
            }
        });
        chatInputBoxContainer.reactionControl = (ImageView) C0761c.b(view, R.id.chat_control_reaction, "field 'reactionControl'", ImageView.class);
        chatInputBoxContainer.gifControl = (ImageView) C0761c.b(view, R.id.chat_control_gif, "field 'gifControl'", ImageView.class);
        chatInputBoxContainer.textMessageEditText = (ChatInputEditText) C0761c.b(view, R.id.chat_input_text, "field 'textMessageEditText'", ChatInputEditText.class);
        chatInputBoxContainer.gifSearchEditText = (ChatInputEditText) C0761c.b(view, R.id.chat_input_gif_search, "field 'gifSearchEditText'", ChatInputEditText.class);
        chatInputBoxContainer.sendButton = (ImageButton) C0761c.b(view, R.id.chat_input_send, "field 'sendButton'", ImageButton.class);
        chatInputBoxContainer.gifSelector = (GifSelector) C0761c.b(view, R.id.gif_selector, "field 'gifSelector'", GifSelector.class);
        chatInputBoxContainer.bitmojiIcon = (BitmojiIconView) C0761c.b(view, R.id.bitmoji_icon_view, "field 'bitmojiIcon'", BitmojiIconView.class);
        chatInputBoxContainer.bitmojiPickerView = (BitmojiPickerView) C0761c.b(view, R.id.bitmoji_picker_view, "field 'bitmojiPickerView'", BitmojiPickerView.class);
        a = C0761c.a(view, R.id.chat_input_clear, "method 'onClearClicked'");
        this.f34335d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ChatInputBoxContainer_ViewBinding f34332b;

            public void doClick(View view) {
                chatInputBoxContainer.onClearClicked();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        chatInputBoxContainer.tooltipGradientRed = C0432b.c(view, R.color.gradient_red);
        chatInputBoxContainer.tooltipGradientOrange = C0432b.c(view, R.color.gradient_orange);
        chatInputBoxContainer.gifSelectorHeight = resources.getDimensionPixelSize(R.dimen.chat_input_gif_selector_height);
        chatInputBoxContainer.bitmojiPickerHeight = resources.getDimensionPixelSize(R.dimen.bitmoji_picker_height);
        chatInputBoxContainer.bitmojiSearchViewHeight = resources.getDimensionPixelSize(R.dimen.bitmoji_search_view_height);
        chatInputBoxContainer.bitmojiTagViewHeight = resources.getDimensionPixelSize(R.dimen.bitmoji_tag_view_height);
        chatInputBoxContainer.bitmojiContainerDefaultHeight = resources.getDimensionPixelSize(R.dimen.bitmoji_default_container_height);
        chatInputBoxContainer.bitmojiTooltipTextWithMatchName = resources.getString(R.string.bitmoji_tooltip_text_with_match_name);
        chatInputBoxContainer.bitmojiTooltipTextNoMatchName = resources.getString(R.string.bitmoji_tooltip_text_no_match_name);
        chatInputBoxContainer.imageMessageFallbackImage = resources.getString(R.string.bitmoji_fallback_message);
    }

    @CallSuper
    public void unbind() {
        ChatInputBoxContainer chatInputBoxContainer = this.f34333b;
        if (chatInputBoxContainer == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34333b = null;
        chatInputBoxContainer.inputSwitcher = null;
        chatInputBoxContainer.gifSwitcher = null;
        chatInputBoxContainer.reactionControl = null;
        chatInputBoxContainer.gifControl = null;
        chatInputBoxContainer.textMessageEditText = null;
        chatInputBoxContainer.gifSearchEditText = null;
        chatInputBoxContainer.sendButton = null;
        chatInputBoxContainer.gifSelector = null;
        chatInputBoxContainer.bitmojiIcon = null;
        chatInputBoxContainer.bitmojiPickerView = null;
        this.f34334c.setOnClickListener(null);
        this.f34334c = null;
        this.f34335d.setOnClickListener(null);
        this.f34335d = null;
    }
}
