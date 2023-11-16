// Generated by data binding compiler. Do not edit!
package com.example.lunchtray.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.lunchtray.R;
import com.example.mysurveybuddy.model.OrderViewModel;
import com.example.mysurveybuddy.model.SurveyItem;
import com.example.mysurveybuddy.ui.order.AccompanimentMenuFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAccompanimentMenuBinding extends ViewDataBinding {
  @NonNull
  public final RadioGroup accompanimentOptions;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final View divider;

  @NonNull
  public final RadioButton maybe;

  @NonNull
  public final TextView maybeDescription;

  @NonNull
  public final TextView maybePrice;

  @NonNull
  public final Button nextButton;

  @NonNull
  public final TextView subtotal;

  @NonNull
  public final RadioButton wouldNotRecommend;

  @NonNull
  public final TextView wouldNotRecommendDescription;

  @NonNull
  public final TextView wouldNotRecommendScore;

  @NonNull
  public final RadioButton wouldRecommend;

  @NonNull
  public final TextView wouldRecommendDescription;

  @NonNull
  public final TextView wouldRecommendScore;

  @Bindable
  protected OrderViewModel mViewModel;

  @Bindable
  protected SurveyItem mMenuItems;

  @Bindable
  protected AccompanimentMenuFragment mAccompanimentMenuFragment;

  protected FragmentAccompanimentMenuBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RadioGroup accompanimentOptions, Button cancelButton, View divider,
      RadioButton maybe, TextView maybeDescription, TextView maybePrice, Button nextButton,
      TextView subtotal, RadioButton wouldNotRecommend, TextView wouldNotRecommendDescription,
      TextView wouldNotRecommendScore, RadioButton wouldRecommend,
      TextView wouldRecommendDescription, TextView wouldRecommendScore) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accompanimentOptions = accompanimentOptions;
    this.cancelButton = cancelButton;
    this.divider = divider;
    this.maybe = maybe;
    this.maybeDescription = maybeDescription;
    this.maybePrice = maybePrice;
    this.nextButton = nextButton;
    this.subtotal = subtotal;
    this.wouldNotRecommend = wouldNotRecommend;
    this.wouldNotRecommendDescription = wouldNotRecommendDescription;
    this.wouldNotRecommendScore = wouldNotRecommendScore;
    this.wouldRecommend = wouldRecommend;
    this.wouldRecommendDescription = wouldRecommendDescription;
    this.wouldRecommendScore = wouldRecommendScore;
  }

  public abstract void setViewModel(@Nullable OrderViewModel viewModel);

  @Nullable
  public OrderViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setMenuItems(@Nullable SurveyItem menuItems);

  @Nullable
  public SurveyItem getMenuItems() {
    return mMenuItems;
  }

  public abstract void setAccompanimentMenuFragment(
      @Nullable AccompanimentMenuFragment accompanimentMenuFragment);

  @Nullable
  public AccompanimentMenuFragment getAccompanimentMenuFragment() {
    return mAccompanimentMenuFragment;
  }

  @NonNull
  public static FragmentAccompanimentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_accompaniment_menu, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAccompanimentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAccompanimentMenuBinding>inflateInternal(inflater, R.layout.fragment_accompaniment_menu, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAccompanimentMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_accompaniment_menu, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAccompanimentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAccompanimentMenuBinding>inflateInternal(inflater, R.layout.fragment_accompaniment_menu, null, false, component);
  }

  public static FragmentAccompanimentMenuBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentAccompanimentMenuBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentAccompanimentMenuBinding)bind(component, view, R.layout.fragment_accompaniment_menu);
  }
}