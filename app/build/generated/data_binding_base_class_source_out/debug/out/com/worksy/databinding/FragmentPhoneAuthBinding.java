// Generated by view binder compiler. Do not edit!
package com.worksy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.worksy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPhoneAuthBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton buttonBack;

  @NonNull
  public final MaterialButton buttonResend;

  @NonNull
  public final MaterialButton buttonSendCode;

  @NonNull
  public final MaterialButton buttonVerify;

  @NonNull
  public final TextInputEditText editTextCode;

  @NonNull
  public final TextInputEditText editTextPhone;

  @NonNull
  public final LinearLayout layoutPhone;

  @NonNull
  public final LinearLayout layoutVerification;

  @NonNull
  public final ProgressBar progressBar;

  private FragmentPhoneAuthBinding(@NonNull ScrollView rootView, @NonNull MaterialButton buttonBack,
      @NonNull MaterialButton buttonResend, @NonNull MaterialButton buttonSendCode,
      @NonNull MaterialButton buttonVerify, @NonNull TextInputEditText editTextCode,
      @NonNull TextInputEditText editTextPhone, @NonNull LinearLayout layoutPhone,
      @NonNull LinearLayout layoutVerification, @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.buttonBack = buttonBack;
    this.buttonResend = buttonResend;
    this.buttonSendCode = buttonSendCode;
    this.buttonVerify = buttonVerify;
    this.editTextCode = editTextCode;
    this.editTextPhone = editTextPhone;
    this.layoutPhone = layoutPhone;
    this.layoutVerification = layoutVerification;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPhoneAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPhoneAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_phone_auth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPhoneAuthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonBack;
      MaterialButton buttonBack = ViewBindings.findChildViewById(rootView, id);
      if (buttonBack == null) {
        break missingId;
      }

      id = R.id.buttonResend;
      MaterialButton buttonResend = ViewBindings.findChildViewById(rootView, id);
      if (buttonResend == null) {
        break missingId;
      }

      id = R.id.buttonSendCode;
      MaterialButton buttonSendCode = ViewBindings.findChildViewById(rootView, id);
      if (buttonSendCode == null) {
        break missingId;
      }

      id = R.id.buttonVerify;
      MaterialButton buttonVerify = ViewBindings.findChildViewById(rootView, id);
      if (buttonVerify == null) {
        break missingId;
      }

      id = R.id.editTextCode;
      TextInputEditText editTextCode = ViewBindings.findChildViewById(rootView, id);
      if (editTextCode == null) {
        break missingId;
      }

      id = R.id.editTextPhone;
      TextInputEditText editTextPhone = ViewBindings.findChildViewById(rootView, id);
      if (editTextPhone == null) {
        break missingId;
      }

      id = R.id.layoutPhone;
      LinearLayout layoutPhone = ViewBindings.findChildViewById(rootView, id);
      if (layoutPhone == null) {
        break missingId;
      }

      id = R.id.layoutVerification;
      LinearLayout layoutVerification = ViewBindings.findChildViewById(rootView, id);
      if (layoutVerification == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      return new FragmentPhoneAuthBinding((ScrollView) rootView, buttonBack, buttonResend,
          buttonSendCode, buttonVerify, editTextCode, editTextPhone, layoutPhone,
          layoutVerification, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
