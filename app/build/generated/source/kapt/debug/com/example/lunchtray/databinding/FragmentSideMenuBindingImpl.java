package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSideMenuBindingImpl extends FragmentSideMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.side_options, 17);
        sViewsWithIds.put(R.id.divider, 18);
        sViewsWithIds.put(R.id.cancel_button, 19);
        sViewsWithIds.put(R.id.next_button, 20);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSideMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentSideMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[19]
            , (android.view.View) bindings[18]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.Button) bindings[20]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RadioGroup) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            );
        this.fairProduct.setTag(null);
        this.fairProductDescription.setTag(null);
        this.fairProductScore.setTag(null);
        this.highlySatisfiedProduct.setTag(null);
        this.highlySatisfiedProductDescription.setTag(null);
        this.highlySatisfiedProductScore.setTag(null);
        this.highlyUnsatisfiedProduct.setTag(null);
        this.highlyUnsatisfiedProductDescription.setTag(null);
        this.highlyUnsatisfiedProductScore.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.satisfiedProduct.setTag(null);
        this.satisfiedProductDescription.setTag(null);
        this.satisfiedProductScore.setTag(null);
        this.subtotal.setTag(null);
        this.unsatisfiedProduct.setTag(null);
        this.unsatisfiedProductDescription.setTag(null);
        this.unsatisfiedProductScore.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback5 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback8 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback4 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.sideMenuFragment == variableId) {
            setSideMenuFragment((com.example.mysurveybuddy.ui.order.SideMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.mysurveybuddy.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSideMenuFragment(@Nullable com.example.mysurveybuddy.ui.order.SideMenuFragment SideMenuFragment) {
        this.mSideMenuFragment = SideMenuFragment;
    }
    public void setViewModel(@Nullable com.example.mysurveybuddy.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String viewModelSurveyItemsHighlyUnsatisfiedProductName = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsFairProduct = null;
        java.lang.String viewModelSurveyItemsHighlyUnsatisfiedProductDescription = null;
        java.lang.String viewModelSurveyItemsHighlyUnsatisfiedProductGetFormattedScore = null;
        java.lang.String viewModelSurveyItemsSatisfiedProductGetFormattedScore = null;
        java.lang.String viewModelSurveyItemsFairProductDescription = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsSatisfiedProduct = null;
        java.lang.String viewModelSurveyItemsHighlySatisfiedProductGetFormattedScore = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsUnsatisfiedProduct = null;
        java.lang.String viewModelSurveyItemsHighlySatisfiedProductName = null;
        java.lang.String viewModelTotalGetValue = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsHighlyUnsatisfiedProduct = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelTotal = null;
        java.lang.String viewModelSurveyItemsUnsatisfiedProductDescription = null;
        java.lang.String viewModelSurveyItemsUnsatisfiedProductGetFormattedScore = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsHighlySatisfiedProduct = null;
        java.lang.String viewModelSurveyItemsUnsatisfiedProductName = null;
        java.lang.String viewModelSurveyItemsSatisfiedProductName = null;
        java.lang.String viewModelSurveyItemsHighlySatisfiedProductDescription = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTotal = null;
        java.lang.String viewModelSurveyItemsFairProductName = null;
        java.lang.String viewModelSurveyItemsSatisfiedProductDescription = null;
        com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelSurveyItemsFairProductGetFormattedScore = null;
        java.util.Map<java.lang.String,com.example.mysurveybuddy.model.SurveyItem> viewModelSurveyItems = null;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.total
                    viewModelTotal = viewModel.getTotal();
                }
                updateLiveDataRegistration(0, viewModelTotal);


                if (viewModelTotal != null) {
                    // read viewModel.total.getValue()
                    viewModelTotalGetValue = viewModelTotal.getValue();
                }


                // read @android:string/subtotal
                subtotalAndroidStringSubtotalViewModelTotal = subtotal.getResources().getString(R.string.subtotal, viewModelTotalGetValue);
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.surveyItems
                        viewModelSurveyItems = viewModel.getSurveyItems();
                    }


                    if (viewModelSurveyItems != null) {
                        // read viewModel.surveyItems["fair_product"]
                        viewModelSurveyItemsFairProduct = viewModelSurveyItems.get("fair_product");
                        // read viewModel.surveyItems["satisfied_product"]
                        viewModelSurveyItemsSatisfiedProduct = viewModelSurveyItems.get("satisfied_product");
                        // read viewModel.surveyItems["unsatisfied_product"]
                        viewModelSurveyItemsUnsatisfiedProduct = viewModelSurveyItems.get("unsatisfied_product");
                        // read viewModel.surveyItems["highly_unsatisfied_product"]
                        viewModelSurveyItemsHighlyUnsatisfiedProduct = viewModelSurveyItems.get("highly_unsatisfied_product");
                        // read viewModel.surveyItems["highly_satisfied_product"]
                        viewModelSurveyItemsHighlySatisfiedProduct = viewModelSurveyItems.get("highly_satisfied_product");
                    }


                    if (viewModelSurveyItemsFairProduct != null) {
                        // read viewModel.surveyItems["fair_product"].description
                        viewModelSurveyItemsFairProductDescription = viewModelSurveyItemsFairProduct.getDescription();
                        // read viewModel.surveyItems["fair_product"].name
                        viewModelSurveyItemsFairProductName = viewModelSurveyItemsFairProduct.getName();
                        // read viewModel.surveyItems["fair_product"].getFormattedScore()
                        viewModelSurveyItemsFairProductGetFormattedScore = viewModelSurveyItemsFairProduct.getFormattedScore();
                    }
                    if (viewModelSurveyItemsSatisfiedProduct != null) {
                        // read viewModel.surveyItems["satisfied_product"].getFormattedScore()
                        viewModelSurveyItemsSatisfiedProductGetFormattedScore = viewModelSurveyItemsSatisfiedProduct.getFormattedScore();
                        // read viewModel.surveyItems["satisfied_product"].name
                        viewModelSurveyItemsSatisfiedProductName = viewModelSurveyItemsSatisfiedProduct.getName();
                        // read viewModel.surveyItems["satisfied_product"].description
                        viewModelSurveyItemsSatisfiedProductDescription = viewModelSurveyItemsSatisfiedProduct.getDescription();
                    }
                    if (viewModelSurveyItemsUnsatisfiedProduct != null) {
                        // read viewModel.surveyItems["unsatisfied_product"].description
                        viewModelSurveyItemsUnsatisfiedProductDescription = viewModelSurveyItemsUnsatisfiedProduct.getDescription();
                        // read viewModel.surveyItems["unsatisfied_product"].getFormattedScore()
                        viewModelSurveyItemsUnsatisfiedProductGetFormattedScore = viewModelSurveyItemsUnsatisfiedProduct.getFormattedScore();
                        // read viewModel.surveyItems["unsatisfied_product"].name
                        viewModelSurveyItemsUnsatisfiedProductName = viewModelSurveyItemsUnsatisfiedProduct.getName();
                    }
                    if (viewModelSurveyItemsHighlyUnsatisfiedProduct != null) {
                        // read viewModel.surveyItems["highly_unsatisfied_product"].name
                        viewModelSurveyItemsHighlyUnsatisfiedProductName = viewModelSurveyItemsHighlyUnsatisfiedProduct.getName();
                        // read viewModel.surveyItems["highly_unsatisfied_product"].description
                        viewModelSurveyItemsHighlyUnsatisfiedProductDescription = viewModelSurveyItemsHighlyUnsatisfiedProduct.getDescription();
                        // read viewModel.surveyItems["highly_unsatisfied_product"].getFormattedScore()
                        viewModelSurveyItemsHighlyUnsatisfiedProductGetFormattedScore = viewModelSurveyItemsHighlyUnsatisfiedProduct.getFormattedScore();
                    }
                    if (viewModelSurveyItemsHighlySatisfiedProduct != null) {
                        // read viewModel.surveyItems["highly_satisfied_product"].getFormattedScore()
                        viewModelSurveyItemsHighlySatisfiedProductGetFormattedScore = viewModelSurveyItemsHighlySatisfiedProduct.getFormattedScore();
                        // read viewModel.surveyItems["highly_satisfied_product"].name
                        viewModelSurveyItemsHighlySatisfiedProductName = viewModelSurveyItemsHighlySatisfiedProduct.getName();
                        // read viewModel.surveyItems["highly_satisfied_product"].description
                        viewModelSurveyItemsHighlySatisfiedProductDescription = viewModelSurveyItemsHighlySatisfiedProduct.getDescription();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fairProduct, viewModelSurveyItemsFairProductName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fairProductDescription, viewModelSurveyItemsFairProductDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fairProductScore, viewModelSurveyItemsFairProductGetFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlySatisfiedProduct, viewModelSurveyItemsHighlySatisfiedProductName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlySatisfiedProductDescription, viewModelSurveyItemsHighlySatisfiedProductDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlySatisfiedProductScore, viewModelSurveyItemsHighlySatisfiedProductGetFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlyUnsatisfiedProduct, viewModelSurveyItemsHighlyUnsatisfiedProductName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlyUnsatisfiedProductDescription, viewModelSurveyItemsHighlyUnsatisfiedProductDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlyUnsatisfiedProductScore, viewModelSurveyItemsHighlyUnsatisfiedProductGetFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.satisfiedProduct, viewModelSurveyItemsSatisfiedProductName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.satisfiedProductDescription, viewModelSurveyItemsSatisfiedProductDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.satisfiedProductScore, viewModelSurveyItemsSatisfiedProductGetFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unsatisfiedProduct, viewModelSurveyItemsUnsatisfiedProductName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unsatisfiedProductDescription, viewModelSurveyItemsUnsatisfiedProductDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unsatisfiedProductScore, viewModelSurveyItemsUnsatisfiedProductGetFormattedScore);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.fairProduct.setOnClickListener(mCallback6);
            this.highlySatisfiedProduct.setOnClickListener(mCallback4);
            this.highlyUnsatisfiedProduct.setOnClickListener(mCallback8);
            this.satisfiedProduct.setOnClickListener(mCallback5);
            this.unsatisfiedProduct.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setProduct("fair_product");
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setProduct("satisfied_product");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setProduct("highly_unsatisfied_product");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setProduct("highly_satisfied_product");
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setProduct("unsatisfied_product");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.total
        flag 1 (0x2L): sideMenuFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}