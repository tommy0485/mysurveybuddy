package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 8);
        sViewsWithIds.put(R.id.divider, 9);
        sViewsWithIds.put(R.id.submit_button, 10);
        sViewsWithIds.put(R.id.cancel_button, 11);
        sViewsWithIds.put(R.id.imageView2, 12);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.Button) bindings[11]
            , (android.view.View) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[10]
            , (android.widget.TextView) bindings[7]
            );
        this.accompanimentPrice.setTag(null);
        this.accompanimentSelection.setTag(null);
        this.entreePrice.setTag(null);
        this.entreeSelection.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.sidePrice.setTag(null);
        this.sideSelection.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.checkoutFragment == variableId) {
            setCheckoutFragment((com.example.mysurveybuddy.ui.order.SummaryFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.mysurveybuddy.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckoutFragment(@Nullable com.example.mysurveybuddy.ui.order.SummaryFragment CheckoutFragment) {
        this.mCheckoutFragment = CheckoutFragment;
    }
    public void setViewModel(@Nullable com.example.mysurveybuddy.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRecommend((androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem>) object, fieldId);
            case 1 :
                return onChangeViewModelRep((androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem>) object, fieldId);
            case 2 :
                return onChangeViewModelProduct((androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem>) object, fieldId);
            case 3 :
                return onChangeViewModelTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRecommend(androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> ViewModelRecommend, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRep(androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> ViewModelRep, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProduct(androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> ViewModelProduct, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String totalAndroidStringTotalViewModelTotal = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelRecommendGetValue = null;
        androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> viewModelRecommend = null;
        java.lang.String viewModelRecommendName = null;
        androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> viewModelRep = null;
        androidx.lifecycle.LiveData<com.example.mysurveybuddy.model.SurveyItem> viewModelProduct = null;
        java.lang.String viewModelProductName = null;
        java.lang.String viewModelRepFormattedScore = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelProductGetValue = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelRepGetValue = null;
        java.lang.String viewModelRepName = null;
        java.lang.String viewModelRecommendFormattedScore = null;
        java.lang.String viewModelProductFormattedScore = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTotal = null;
        java.lang.String viewModelTotalGetValue = null;
        com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.recommend
                        viewModelRecommend = viewModel.getRecommend();
                    }
                    updateLiveDataRegistration(0, viewModelRecommend);


                    if (viewModelRecommend != null) {
                        // read viewModel.recommend.getValue()
                        viewModelRecommendGetValue = viewModelRecommend.getValue();
                    }


                    if (viewModelRecommendGetValue != null) {
                        // read viewModel.recommend.getValue().name
                        viewModelRecommendName = viewModelRecommendGetValue.getName();
                        // read viewModel.recommend.getValue().formattedScore
                        viewModelRecommendFormattedScore = viewModelRecommendGetValue.getFormattedScore();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.rep
                        viewModelRep = viewModel.getRep();
                    }
                    updateLiveDataRegistration(1, viewModelRep);


                    if (viewModelRep != null) {
                        // read viewModel.rep.getValue()
                        viewModelRepGetValue = viewModelRep.getValue();
                    }


                    if (viewModelRepGetValue != null) {
                        // read viewModel.rep.getValue().formattedScore
                        viewModelRepFormattedScore = viewModelRepGetValue.getFormattedScore();
                        // read viewModel.rep.getValue().name
                        viewModelRepName = viewModelRepGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.product
                        viewModelProduct = viewModel.getProduct();
                    }
                    updateLiveDataRegistration(2, viewModelProduct);


                    if (viewModelProduct != null) {
                        // read viewModel.product.getValue()
                        viewModelProductGetValue = viewModelProduct.getValue();
                    }


                    if (viewModelProductGetValue != null) {
                        // read viewModel.product.getValue().name
                        viewModelProductName = viewModelProductGetValue.getName();
                        // read viewModel.product.getValue().formattedScore
                        viewModelProductFormattedScore = viewModelProductGetValue.getFormattedScore();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.total
                        viewModelTotal = viewModel.getTotal();
                    }
                    updateLiveDataRegistration(3, viewModelTotal);


                    if (viewModelTotal != null) {
                        // read viewModel.total.getValue()
                        viewModelTotalGetValue = viewModelTotal.getValue();
                    }


                    // read @android:string/total
                    totalAndroidStringTotalViewModelTotal = total.getResources().getString(R.string.total, viewModelTotalGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentPrice, viewModelRecommendFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentSelection, viewModelRecommendName);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreePrice, viewModelRepFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreeSelection, viewModelRepName);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sidePrice, viewModelProductFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sideSelection, viewModelProductName);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, totalAndroidStringTotalViewModelTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.recommend
        flag 1 (0x2L): viewModel.rep
        flag 2 (0x3L): viewModel.product
        flag 3 (0x4L): viewModel.total
        flag 4 (0x5L): checkoutFragment
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}