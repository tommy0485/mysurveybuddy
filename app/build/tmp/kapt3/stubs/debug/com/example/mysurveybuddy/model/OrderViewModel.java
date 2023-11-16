package com.example.mysurveybuddy.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0018J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0018J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\tH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/example/mysurveybuddy/model/OrderViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_product", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/mysurveybuddy/model/SurveyItem;", "_recommend", "_rep", "_total", "", "kotlin.jvm.PlatformType", "previousProductScore", "previousRecommendScore", "previousRepScore", "product", "Landroidx/lifecycle/LiveData;", "getProduct", "()Landroidx/lifecycle/LiveData;", "recommend", "getRecommend", "rep", "getRep", "surveyItems", "", "", "getSurveyItems", "()Ljava/util/Map;", "total", "getTotal", "resetSurvey", "", "setProduct", "setRecommend", "setRep", "updateTotal", "itemPrice", "app_debug"})
public final class OrderViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, com.example.mysurveybuddy.model.SurveyItem> surveyItems = null;
    private double previousRepScore = 0.0;
    private double previousProductScore = 0.0;
    private double previousRecommendScore = 0.0;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.mysurveybuddy.model.SurveyItem> _rep = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> rep = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.mysurveybuddy.model.SurveyItem> _product = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> product = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.mysurveybuddy.model.SurveyItem> _recommend = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> recommend = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _total = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> total = null;
    
    public OrderViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, com.example.mysurveybuddy.model.SurveyItem> getSurveyItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> getRep() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> getProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> getRecommend() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getTotal() {
        return null;
    }
    
    /**
     * Set the set the rep value for the order.
     */
    public final void setRep(@org.jetbrains.annotations.NotNull
    java.lang.String rep) {
    }
    
    /**
     * Set the product value for the survey.
     */
    public final void setProduct(@org.jetbrains.annotations.NotNull
    java.lang.String product) {
    }
    
    /**
     * Set the recommend value for the survey.
     */
    public final void setRecommend(@org.jetbrains.annotations.NotNull
    java.lang.String recommend) {
    }
    
    /**
     * Update total value.
     */
    private final void updateTotal(double itemPrice) {
    }
    
    /**
     * Reset all values pertaining to the survey.
     */
    public final void resetSurvey() {
    }
}