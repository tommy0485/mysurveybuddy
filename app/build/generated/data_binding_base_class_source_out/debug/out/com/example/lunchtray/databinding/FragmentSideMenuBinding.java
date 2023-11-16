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
import com.example.mysurveybuddy.ui.order.SideMenuFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSideMenuBinding extends ViewDataBinding {
  @NonNull
  public final Button cancelButton;

  @NonNull
  public final View divider;

  @NonNull
  public final RadioButton fairProduct;

  @NonNull
  public final TextView fairProductDescription;

  @NonNull
  public final TextView fairProductScore;

  @NonNull
  public final RadioButton highlySatisfiedProduct;

  @NonNull
  public final TextView highlySatisfiedProductDescription;

  @NonNull
  public final TextView highlySatisfiedProductScore;

  @NonNull
  public final RadioButton highlyUnsatisfiedProduct;

  @NonNull
  public final TextView highlyUnsatisfiedProductDescription;

  @NonNull
  public final TextView highlyUnsatisfiedProductScore;

  @NonNull
  public final Button nextButton;

  @NonNull
  public final RadioButton satisfiedProduct;

  @NonNull
  public final TextView satisfiedProductDescription;

  @NonNull
  public final TextView satisfiedProductScore;

  @NonNull
  public final RadioGroup sideOptions;

  @NonNull
  public final TextView subtotal;

  @NonNull
  public final RadioButton unsatisfiedProduct;

  @NonNull
  public final TextView unsatisfiedProductDescription;

  @NonNull
  public final TextView unsatisfiedProductScore;

  @Bindable
  protected OrderViewModel mViewModel;

  @Bindable
  protected SideMenuFragment mSideMenuFragment;

  protected FragmentSideMenuBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button cancelButton, View divider, RadioButton fairProduct, TextView fairProductDescription,
      TextView fairProductScore, RadioButton highlySatisfiedProduct,
      TextView highlySatisfiedProductDescription, TextView highlySatisfiedProductScore,
      RadioButton highlyUnsatisfiedProduct, TextView highlyUnsatisfiedProductDescription,
      TextView highlyUnsatisfiedProductScore, Button nextButton, RadioButton satisfiedProduct,
      TextView satisfiedProductDescription, TextView satisfiedProductScore, RadioGroup sideOptions,
      TextView subtotal, RadioButton unsatisfiedProduct, TextView unsatisfiedProductDescription,
      TextView unsatisfiedProductScore) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cancelButton = cancelButton;
    this.divider = divider;
    this.fairProduct = fairProduct;
    this.fairProductDescription = fairProductDescription;
    this.fairProductScore = fairProductScore;
    this.highlySatisfiedProduct = highlySatisfiedProduct;
    this.highlySatisfiedProductDescription = highlySatisfiedProductDescription;
    this.highlySatisfiedProductScore = highlySatisfiedProductScore;
    this.highlyUnsatisfiedProduct = highlyUnsatisfiedProduct;
    this.highlyUnsatisfiedProductDescription = highlyUnsatisfiedProductDescription;
    this.highlyUnsatisfiedProductScore = highlyUnsatisfiedProductScore;
    this.nextButton = nextButton;
    this.satisfiedProduct = satisfiedProduct;
    this.satisfiedProductDescription = satisfiedProductDescription;
    this.satisfiedProductScore = satisfiedProductScore;
    this.sideOptions = sideOptions;
    this.subtotal = subtotal;
    this.unsatisfiedProduct = unsatisfiedProduct;
    this.unsatisfiedProductDescription = unsatisfiedProductDescription;
    this.unsatisfiedProductScore = unsatisfiedProductScore;
  }

  public abstract void setViewModel(@Nullable OrderViewModel viewModel);

  @Nullable
  public OrderViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setSideMenuFragment(@Nullable SideMenuFragment sideMenuFragment);

  @Nullable
  public SideMenuFragment getSideMenuFragment() {
    return mSideMenuFragment;
  }

  @NonNull
  public static FragmentSideMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_side_menu, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSideMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSideMenuBinding>inflateInternal(inflater, R.layout.fragment_side_menu, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSideMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_side_menu, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSideMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSideMenuBinding>inflateInternal(inflater, R.layout.fragment_side_menu, null, false, component);
  }

  public static FragmentSideMenuBinding bind(@NonNull View view) {
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
  public static FragmentSideMenuBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSideMenuBinding)bind(component, view, R.layout.fragment_side_menu);
  }
}
