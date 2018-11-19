package com.tinder.utils;

import android.content.Context;
import android.support.annotation.FontRes;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import com.tinder.C6250b.C6249b;
import com.tinder.R;

public class CustomFont {

    public enum Font {
        LIGHT(R.font.proximanova_light),
        REGULAR(R.font.proximanova_regular),
        MEDIUM(R.font.proximanova_regular),
        SEMI_BOLD(R.font.proximanova_semibold),
        BOLD(R.font.proximanova_bold);
        
        private int mFont;

        private Font(int i) {
            this.mFont = i;
        }

        @FontRes
        public int getFontResource() {
            return this.mFont;
        }
    }

    @FontRes
    /* renamed from: a */
    public static int m57581a(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        context = context.obtainStyledAttributes(attributeSet, C6249b.com_tinder_views_CustomTextView);
        attributeSet = Font.values()[context.getInt(null, 1)].getFontResource();
        context.recycle();
        return attributeSet;
    }
}
