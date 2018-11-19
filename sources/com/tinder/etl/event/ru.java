package com.tinder.etl.event;

import java.util.List;

class ru implements EtlField<List<?>> {
    public String description() {
        return "Array representing the order of the element previews presented on the card stack, left to right. Values are chosen from: identity, bio, anthem, instagram, top_artists, mutual_top_artists, e.g. if a user has 3 slots available for profile element previews, and we choose to surface bio on the first slot, identity on the second slot, and instagram on the third slot, then the value of this field would be: [bio, identity, instagram]";
    }

    public String name() {
        return "profileElementOrder";
    }

    ru() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
