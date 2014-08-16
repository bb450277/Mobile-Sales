package com.abc.fragment;

import com.example.drawer_test.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Function_7 extends Fragment {

	private FragmentTabHost mTabHost;

	public Function_7() {
	}

	// @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.function_layout_7, container, false);
		mTabHost = (FragmentTabHost) v.findViewById(R.id.tabhost);
		mTabHost.setup(getActivity(), getChildFragmentManager(),
				android.R.id.tabcontent);
		mTabHost.addTab(mTabHost.newTabSpec("message").setIndicator("Message"),
				Message.class, null);
		mTabHost.addTab(mTabHost.newTabSpec("performance").setIndicator("Performance"),
				Performance.class, null);
		return v;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

}
