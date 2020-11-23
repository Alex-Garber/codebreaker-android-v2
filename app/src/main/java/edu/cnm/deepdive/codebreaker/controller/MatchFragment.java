package edu.cnm.deepdive.codebreaker.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import edu.cnm.deepdive.codebreaker.databinding.FragmentMatchBinding;
import org.jetbrains.annotations.NotNull;

public class MatchFragment extends Fragment {

  private FragmentMatchBinding binding;

  public static MatchFragment createInstance(/* params to pass to fragment*/) {
    MatchFragment fragment = new MatchFragment();
    Bundle args = new Bundle();
    //Add param values to args, args.put???()
    fragment.setArguments(args);
    return fragment;

  }


  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Bundle args = getArguments();
    //Do whatever is necessary with args
  }

  @Nullable
  @org.jetbrains.annotations.Nullable
  @Override
  public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable  Bundle savedInstanceState) {
    binding = FragmentMatchBinding.inflate(inflater);
    // Access references in binding to set contents of view binding as appropriate.
    return binding.getRoot();
  }

  @Override
  public void onViewCreated(@NonNull @NotNull View view,
      @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    // Get reference to view model and set observers on live data.
  }
}
