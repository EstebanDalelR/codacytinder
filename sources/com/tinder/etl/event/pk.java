package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class pk implements EtlField<Number> {
    public String description() {
        return "Tinder Plus:</br>0 = undo, 1 = passport add location, 2 = passport recent location, 3 = rate limiting 50% alert, 4 = super like, 5 = menu, 6 = recs blend, 7 = hide ads, 8 = reserved by ios, 9 = profile setting, 10 = merchandise_features, 11 = merchandise_top_buy_t+, 12 = merchandise_bottom_buy_t+, 13 = discount from app open, 14 = discount from push, 15 discount from auto last hour reminder, 16 = shown from end boost session (boost expired), 17 = shown from deep linking, 18 - from boost paywall, 19 - from boost in progress view, 20 - from super like paywall, 21 = limited time offer discounting dialog, 22 = controlla, 23 = places super like, 25 = no recs screen</br></br>Tinder Gold:</br>0 - Match List Likes You Tile, 1 - Settings screen 'Buy Likes You' button, 2 - Likes You Intro Modal, 3 - Deeplink / push notification, 4 - Controlla screen, 5 - My Tinder Plus settings screen 'Tinder Gold' upsell button, 6 - from top picks footer button in grid view, 7 - from top picks scroll to bottom, 8 - from top picks swipe, 9 - from top picks profile view, 12 - from top picks deeplink, 20 - from places swipe, 21 - from places profile";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    pk() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
