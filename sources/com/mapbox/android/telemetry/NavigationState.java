package com.mapbox.android.telemetry;

public class NavigationState {
    private FeedbackData feedbackData;
    private FeedbackEventData feedbackEventData;
    private NavigationCancelData navigationCancelData;
    private NavigationLocationData navigationLocationData;
    private NavigationMetadata navigationMetadata;
    private NavigationRerouteData navigationRerouteData;
    private NavigationStepMetadata navigationStepMetadata;

    public NavigationState(NavigationMetadata navigationMetadata) {
        this.navigationMetadata = navigationMetadata;
    }

    NavigationMetadata getNavigationMetadata() {
        return this.navigationMetadata;
    }

    NavigationStepMetadata getNavigationStepMetadata() {
        return this.navigationStepMetadata;
    }

    public void setNavigationStepMetadata(NavigationStepMetadata navigationStepMetadata) {
        this.navigationStepMetadata = navigationStepMetadata;
    }

    NavigationCancelData getNavigationCancelData() {
        return this.navigationCancelData;
    }

    public void setNavigationCancelData(NavigationCancelData navigationCancelData) {
        this.navigationCancelData = navigationCancelData;
    }

    NavigationLocationData getNavigationLocationData() {
        return this.navigationLocationData;
    }

    public void setNavigationLocationData(NavigationLocationData navigationLocationData) {
        this.navigationLocationData = navigationLocationData;
    }

    NavigationRerouteData getNavigationRerouteData() {
        return this.navigationRerouteData;
    }

    public void setNavigationRerouteData(NavigationRerouteData navigationRerouteData) {
        this.navigationRerouteData = navigationRerouteData;
    }

    FeedbackEventData getFeedbackEventData() {
        return this.feedbackEventData;
    }

    public void setFeedbackEventData(FeedbackEventData feedbackEventData) {
        this.feedbackEventData = feedbackEventData;
    }

    FeedbackData getFeedbackData() {
        return this.feedbackData;
    }

    public void setFeedbackData(FeedbackData feedbackData) {
        this.feedbackData = feedbackData;
    }
}
