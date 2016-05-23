package cc.guoxingnan.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTwo extends Fragment {
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_two, container, false);
		return view;
	}

	private static FragmentTwo two;
	
	private FragmentTwo(){}

	public static FragmentTwo newInstance(){
		if (two == null) {
			two = new FragmentTwo();
		}
		return two;
	}
}
