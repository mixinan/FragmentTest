package cc.guoxingnan.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_one, container, false);
		return view;
	}
	
	private static FragmentOne one;
	
	private FragmentOne(){}
	
	public static FragmentOne newInstance(){
		if (one == null) {
			one = new FragmentOne();
		}
		return one;
	}
}
