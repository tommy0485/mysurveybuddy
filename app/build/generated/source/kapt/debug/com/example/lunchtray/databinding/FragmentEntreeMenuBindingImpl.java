package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEntreeMenuBindingImpl extends FragmentEntreeMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.entree_options, 17);
        sViewsWithIds.put(R.id.divider, 18);
        sViewsWithIds.put(R.id.cancel_button, 19);
        sViewsWithIds.put(R.id.next_button, 20);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEntreeMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentEntreeMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[19]
            , (android.view.View) bindings[18]
            , (android.widget.RadioGroup) bindings[17]
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
            , (android.widget.TextView) bindings[16]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            );
        this.fairRep.setTag(null);
        this.fairRepDescription.setTag(null);
        this.fairRepScore.setTag(null);
        this.highlySatisfiedRep.setTag(null);
        this.highlySatisfiedRepDescription.setTag(null);
        this.highlySatisfiedRepScore.setTag(null);
        this.highlyUnsatisfiedRep.setTag(null);
        this.highlyUnsatisfiedRepDescription.setTag(null);
        this.highlyUnsatisfiedRepRating.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.satisfiedRep.setTag(null);
        this.satisfiedRepDescription.setTag(null);
        this.satisfiedRepScore.setTag(null);
        this.subtotal.setTag(null);
        this.unsatisfiedRep.setTag(null);
        this.unsatisfiedRepDescription.setTag(null);
        this.unsatisfiedRepRating.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback12 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback9 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback13 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback10 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
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
        if (BR.entreeMenuFragment == variableId) {
            setEntreeMenuFragment((com.example.mysurveybuddy.ui.order.EntreeMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.mysurveybuddy.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEntreeMenuFragment(@Nullable com.example.mysurveybuddy.ui.order.EntreeMenuFragment EntreeMenuFragment) {
        this.mEntreeMenuFragment = EntreeMenuFragment;
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
        java.lang.String viewModelSurveyItemsFairRepGetFormattedScore = null;
        java.lang.String viewModelSurveyItemsHighlySatisfiedRepName = null;
        java.lang.String viewModelSurveyItemsSatisfiedRepDescription = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsHighlySatisfiedRep = null;
        java.lang.String viewModelSurveyItemsSatisfiedRepGetFormattedScore = null;
        java.lang.String viewModelSurveyItemsHighlySatisfiedRepGetFormattedScore = null;
        java.lang.String viewModelSurveyItemsFairRepName = null;
        java.lang.String viewModelSurveyItemsHighlyUnsatisfiedRepGetFormattedScore = null;
        java.lang.String viewModelTotalGetValue = null;
        java.lang.String viewModelSurveyItemsHighlySatisfiedRepDescription = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsSatisfiedRep = null;
        java.lang.String viewModelSurveyItemsHighlyUnsatisfiedRepName = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelTotal = null;
        java.lang.String viewModelSurveyItemsSatisfiedRepName = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsHighlyUnsatisfiedRep = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsFairRep = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsUnsatisfiedRep = null;
        java.lang.String viewModelSurveyItemsUnsatisfiedRepGetFormattedScore = null;
        java.lang.String viewModelSurveyItemsUnsatisfiedRepDescription = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTotal = null;
        java.lang.String viewModelSurveyItemsFairRepDescription = null;
        com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelSurveyItemsUnsatisfiedRepName = null;
        java.lang.String viewModelSurveyItemsHighlyUnsatisfiedRepDescription = null;
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
                        // read viewModel.surveyItems["highly_satisfied_rep"]
                        viewModelSurveyItemsHighlySatisfiedRep = viewModelSurveyItems.get("highly_satisfied_rep");
                        // read viewModel.surveyItems["satisfied_rep"]
                        viewModelSurveyItemsSatisfiedRep = viewModelSurveyItems.get("satisfied_rep");
                        // read viewModel.surveyItems["highly_unsatisfied_rep"]
                        viewModelSurveyItemsHighlyUnsatisfiedRep = viewModelSurveyItems.get("highly_unsatisfied_rep");
                        // read viewModel.surveyItems["fair_rep"]
                        viewModelSurveyItemsFairRep = viewModelSurveyItems.get("fair_rep");
                        // read viewModel.surveyItems["unsatisfied_rep"]
                        viewModelSurveyItemsUnsatisfiedRep = viewModelSurveyItems.get("unsatisfied_rep");
                    }


                    if (viewModelSurveyItemsHighlySatisfiedRep != null) {
                        // read viewModel.surveyItems["highly_satisfied_rep"].name
                        viewModelSurveyItemsHighlySatisfiedRepName = viewModelSurveyItemsHighlySatisfiedRep.getName();
                        // read viewModel.surveyItems["highly_satisfied_rep"].getFormattedScore()
                        viewModelSurveyItemsHighlySatisfiedRepGetFormattedScore = viewModelSurveyItemsHighlySatisfiedRep.getFormattedScore();
                        // read viewModel.surveyItems["highly_satisfied_rep"].description
                        viewModelSurveyItemsHighlySatisfiedRepDescription = viewModelSurveyItemsHighlySatisfiedRep.getDescription();
                    }
                    if (viewModelSurveyItemsSatisfiedRep != null) {
                        // read viewModel.surveyItems["satisfied_rep"].description
                        viewModelSurveyItemsSatisfiedRepDescription = viewModelSurveyItemsSatisfiedRep.getDescription();
                        // read viewModel.surveyItems["satisfied_rep"].getFormattedScore()
                        viewModelSurveyItemsSatisfiedRepGetFormattedScore = viewModelSurveyItemsSatisfiedRep.getFormattedScore();
                        // read viewModel.surveyItems["satisfied_rep"].name
                        viewModelSurveyItemsSatisfiedRepName = viewModelSurveyItemsSatisfiedRep.getName();
                    }
                    if (viewModelSurveyItemsHighlyUnsatisfiedRep != null) {
                        // read viewModel.surveyItems["highly_unsatisfied_rep"].getFormattedScore()
                        viewModelSurveyItemsHighlyUnsatisfiedRepGetFormattedScore = viewModelSurveyItemsHighlyUnsatisfiedRep.getFormattedScore();
                        // read viewModel.surveyItems["highly_unsatisfied_rep"].name
                        viewModelSurveyItemsHighlyUnsatisfiedRepName = viewModelSurveyItemsHighlyUnsatisfiedRep.getName();
                        // read viewModel.surveyItems["highly_unsatisfied_rep"].description
                        viewModelSurveyItemsHighlyUnsatisfiedRepDescription = viewModelSurveyItemsHighlyUnsatisfiedRep.getDescription();
                    }
                    if (viewModelSurveyItemsFairRep != null) {
                        // read viewModel.surveyItems["fair_rep"].getFormattedScore()
                        viewModelSurveyItemsFairRepGetFormattedScore = viewModelSurveyItemsFairRep.getFormattedScore();
                        // read viewModel.surveyItems["fair_rep"].name
                        viewModelSurveyItemsFairRepName = viewModelSurveyItemsFairRep.getName();
                        // read viewModel.surveyItems["fair_rep"].description
                        viewModelSurveyItemsFairRepDescription = viewModelSurveyItemsFairRep.getDescription();
                    }
                    if (viewModelSurveyItemsUnsatisfiedRep != null) {
                        // read viewModel.surveyItems["unsatisfied_rep"].getFormattedScore()
                        viewModelSurveyItemsUnsatisfiedRepGetFormattedScore = viewModelSurveyItemsUnsatisfiedRep.getFormattedScore();
                        // read viewModel.surveyItems["unsatisfied_rep"].description
                        viewModelSurveyItemsUnsatisfiedRepDescription = viewModelSurveyItemsUnsatisfiedRep.getDescription();
                        // read viewModel.surveyItems["unsatisfied_rep"].name
                        viewModelSurveyItemsUnsatisfiedRepName = viewModelSurveyItemsUnsatisfiedRep.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fairRep, viewModelSurveyItemsFairRepName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fairRepDescription, viewModelSurveyItemsFairRepDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fairRepScore, viewModelSurveyItemsFairRepGetFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlySatisfiedRep, viewModelSurveyItemsHighlySatisfiedRepName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlySatisfiedRepDescription, viewModelSurveyItemsHighlySatisfiedRepDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlySatisfiedRepScore, viewModelSurveyItemsHighlySatisfiedRepGetFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlyUnsatisfiedRep, viewModelSurveyItemsHighlyUnsatisfiedRepName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlyUnsatisfiedRepDescription, viewModelSurveyItemsHighlyUnsatisfiedRepDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.highlyUnsatisfiedRepRating, viewModelSurveyItemsHighlyUnsatisfiedRepGetFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.satisfiedRep, viewModelSurveyItemsSatisfiedRepName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.satisfiedRepDescription, viewModelSurveyItemsSatisfiedRepDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.satisfiedRepScore, viewModelSurveyItemsSatisfiedRepGetFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unsatisfiedRep, viewModelSurveyItemsUnsatisfiedRepName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unsatisfiedRepDescription, viewModelSurveyItemsUnsatisfiedRepDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unsatisfiedRepRating, viewModelSurveyItemsUnsatisfiedRepGetFormattedScore);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.fairRep.setOnClickListener(mCallback11);
            this.highlySatisfiedRep.setOnClickListener(mCallback9);
            this.highlyUnsatisfiedRep.setOnClickListener(mCallback13);
            this.satisfiedRep.setOnClickListener(mCallback10);
            this.unsatisfiedRep.setOnClickListener(mCallback12);
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



                    viewModel.setRep("fair_rep");
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



                    viewModel.setRep("unsatisfied_rep");
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



                    viewModel.setRep("highly_satisfied_rep");
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



                    viewModel.setRep("highly_unsatisfied_rep");
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



                    viewModel.setRep("satisfied_rep");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.total
        flag 1 (0x2L): entreeMenuFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}