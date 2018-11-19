package com.leanplum.p069a;

/* renamed from: com.leanplum.a.bd */
public enum bd {
    MCC(new bd$1()),
    MNC(new bd$12()),
    LANGUAGE(new bd$14()),
    REGION(new bd$15()),
    LAYOUT_DIRECTION(new bd$16()),
    SMALLEST_WIDTH(new bd$17()),
    AVAILABLE_WIDTH(new bd$18()),
    AVAILABLE_HEIGHT(new bd$19()),
    SCREEN_SIZE(new bd$20()),
    SCREEN_ASPECT(new bd$2()),
    SCREEN_ORIENTATION(new bd$3()),
    UI_MODE(new bd$4()),
    NIGHT_MODE(new bd$5()),
    SCREEN_PIXEL_DENSITY(new bd$6()),
    TOUCHSCREEN_TYPE(new bd$7()),
    KEYBOARD_AVAILABILITY(new bd$8()),
    PRIMARY_TEXT_INPUTMETHOD(new bd$9()),
    NAVIGATION_KEY_AVAILABILITY(new bd$10()),
    PRIMARY_NON_TOUCH_NAVIGATION_METHOD(new bd$11()),
    PLATFORM_VERSION(new bd$13());
    
    /* renamed from: u */
    private be f8004u;

    private bd(be beVar) {
        this.f8004u = beVar;
    }

    /* renamed from: a */
    public final be m9590a() {
        return this.f8004u;
    }
}
