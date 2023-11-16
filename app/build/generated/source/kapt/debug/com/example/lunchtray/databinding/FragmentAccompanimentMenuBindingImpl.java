package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccompanimentMenuBindingImpl extends FragmentAccompanimentMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.accompaniment_options, 11);
        sViewsWithIds.put(R.id.divider, 12);
        sViewsWithIds.put(R.id.cancel_button, 13);
        sViewsWithIds.put(R.id.next_button, 14);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAccompanimentMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentAccompanimentMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RadioGroup) bindings[11]
            , (android.widget.Button) bindings[13]
            , (android.view.View) bindings[12]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[14]
            , (android.widget.TextView) bindings[10]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.maybe.setTag(null);
        this.maybeDescription.setTag(null);
        this.maybePrice.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.subtotal.setTag(null);
        this.wouldNotRecommend.setTag(null);
        this.wouldNotRecommendDescription.setTag(null);
        this.wouldNotRecommendScore.setTag(null);
        this.wouldRecommend.setTag(null);
        this.wouldRecommendDescription.setTag(null);
        this.wouldRecommendScore.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.accompanimentMenuFragment == variableId) {
            setAccompanimentMenuFragment((com.example.mysurveybuddy.ui.order.AccompanimentMenuFragment) variable);
        }
        else if (BR.menuItems == variableId) {
            setMenuItems((com.example.mysurveybuddy.model.SurveyItem) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.mysurveybuddy.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAccompanimentMenuFragment(@Nullable com.example.mysurveybuddy.ui.order.AccompanimentMenuFragment AccompanimentMenuFragment) {
        this.mAccompanimentMenuFragment = AccompanimentMenuFragment;
    }
    public void setMenuItems(@Nullable com.example.mysurveybuddy.model.SurveyItem MenuItems) {
        this.mMenuItems = MenuItems;
    }
    public void setViewModel(@Nullable com.example.mysurveybuddy.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
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
        java.lang.String viewModelSurveyItemsWouldRecommendGetFormattedScore = null;
        java.lang.String viewModelSurveyItemsWouldRecommendDescription = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelTotal = null;
        java.lang.String viewModelSurveyItemsMaybeGetFormattedScore = null;
        java.lang.String viewModelSurveyItemsWouldNotRecommendName = null;
        java.lang.String viewModelSurveyItemsWouldRecommendName = null;
        java.lang.String viewModelSurveyItemsMaybeDescription = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsMaybe = null;
        java.lang.String viewModelSurveyItemsMaybeName = null;
        java.lang.String viewModelSurveyItemsWouldNotRecommendGetFormattedScore = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsWouldRecommend = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTotal = null;
        com.example.mysurveybuddy.model.SurveyItem viewModelSurveyItemsWouldNotRecommend = null;
        java.lang.String viewModelSurveyItemsWouldNotRecommendDescription = null;
        java.lang.String viewModelTotalGetValue = null;
        com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;
        java.util.Map<java.lang.String,com.example.mysurveybuddy.model.SurveyItem> viewModelSurveyItems = null;

        if ((dirtyFlags & 0x19L) != 0) {



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
            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.surveyItems
                        viewModelSurveyItems = viewModel.getSurveyItems();
                    }


                    if (viewModelSurveyItems != null) {
                        // read viewModel.surveyItems["maybe"]
                        viewModelSurveyItemsMaybe = viewModelSurveyItems.get("maybe");
                        // read viewModel.surveyItems["would_recommend"]
                        viewModelSurveyItemsWouldRecommend = viewModelSurveyItems.get("would_recommend");
                        // read viewModel.surveyItems["would_not_recommend"]
                        viewModelSurveyItemsWouldNotRecommend = viewModelSurveyItems.get("would_not_recommend");
                    }


                    if (viewModelSurveyItemsMaybe != null) {
                        // read viewModel.surveyItems["maybe"].getFormattedScore()
                        viewModelSurveyItemsMaybeGetFormattedScore = viewModelSurveyItemsMaybe.getFormattedScore();
                        // read viewModel.surveyItems["maybe"].description
                        viewModelSurveyItemsMaybeDescription = viewModelSurveyItemsMaybe.getDescription();
                        // read viewModel.surveyItems["maybe"].name
                        viewModelSurveyItemsMaybeName = viewModelSurveyItemsMaybe.getName();
                    }
                    if (viewModelSurveyItemsWouldRecommend != null) {
                        // read viewModel.surveyItems["would_recommend"].getFormattedScore()
                        viewModelSurveyItemsWouldRecommendGetFormattedScore = viewModelSurveyItemsWouldRecommend.getFormattedScore();
                        // read viewModel.surveyItems["would_recommend"].description
                        viewModelSurveyItemsWouldRecommendDescription = viewModelSurveyItemsWouldRecommend.getDescription();
                        // read viewModel.surveyItems["would_recommend"].name
                        viewModelSurveyItemsWouldRecommendName = viewModelSurveyItemsWouldRecommend.getName();
                    }
                    if (viewModelSurveyItemsWouldNotRecommend != null) {
                        // read viewModel.surveyItems["would_not_recommend"].name
                        viewModelSurveyItemsWouldNotRecommendName = viewModelSurveyItemsWouldNotRecommend.getName();
                        // read viewModel.surveyItems["would_not_recommend"].getFormattedScore()
                        viewModelSurveyItemsWouldNotRecommendGetFormattedScore = viewModelSurveyItemsWouldNotRecommend.getFormattedScore();
                        // read viewModel.surveyItems["would_not_recommend"].description
                        viewModelSurveyItemsWouldNotRecommendDescription = viewModelSurveyItemsWouldNotRecommend.getDescription();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.maybe, viewModelSurveyItemsMaybeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.maybeDescription, viewModelSurveyItemsMaybeDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.maybePrice, viewModelSurveyItemsMaybeGetFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wouldNotRecommend, viewModelSurveyItemsWouldNotRecommendName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wouldNotRecommendDescription, viewModelSurveyItemsWouldNotRecommendDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wouldNotRecommendScore, viewModelSurveyItemsWouldNotRecommendGetFormattedScore);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wouldRecommend, viewModelSurveyItemsWouldRecommendName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wouldRecommendDescription, viewModelSurveyItemsWouldRecommendDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wouldRecommendScore, viewModelSurveyItemsWouldRecommendGetFormattedScore);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.maybe.setOnClickListener(mCallback2);
            this.wouldNotRecommend.setOnClickListener(mCallback3);
            this.wouldRecommend.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setRecommend("maybe");
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.mysurveybuddy.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setRecommend("would_not_recommend");
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



                    viewModel.setRecommend("would_recommend");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.total
        flag 1 (0x2L): accompanimentMenuFragment
        flag 2 (0x3L): menuItems
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}