package com.foursquare.api.types;

import java.util.ArrayList;

public class NotificationConfig implements FoursquareType {
    private String frequencySetting;
    private boolean includeOtherVenues = false;
    private boolean notifyAtHome = true;
    private boolean notifyAtWork = true;
    private boolean notifyOnExit = false;
    private boolean sendVenuesForHome = false;
    private boolean sendVenuesForWork = false;
    private String speedSetting;
    private ArrayList<NotificationTrigger> triggers;

    public static final class NotificationTrigger implements FoursquareType {
        private ArrayList<String> categoryIds;
        private ArrayList<String> chainIds;
        private String minConfidence;
        private String name;
        private ArrayList<String> venueIds;

        public ArrayList<String> getVenueIds() {
            return this.venueIds;
        }

        public ArrayList<String> getCategoryIds() {
            return this.categoryIds;
        }

        public ArrayList<String> getChainIds() {
            return this.chainIds;
        }

        public String getMinConfidence() {
            return this.minConfidence;
        }
    }

    public boolean shouldNotifyOnExit() {
        return this.notifyOnExit;
    }

    public boolean shouldNotifyAtHome() {
        return this.notifyAtHome;
    }

    public boolean shouldNotifyAtWork() {
        return this.notifyAtWork;
    }

    public boolean shouldSendVenuesForHome() {
        return this.sendVenuesForHome;
    }

    public boolean shouldSendVenuesForWork() {
        return this.sendVenuesForWork;
    }

    public ArrayList<NotificationTrigger> getTriggers() {
        return this.triggers;
    }
}
