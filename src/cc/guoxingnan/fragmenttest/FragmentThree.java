package cc.guoxingnan.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentThree extends Fragment {
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_three, container, false);
		return view;
	}
	
	private static FragmentThree three;
	
	private FragmentThree(){}

	public static FragmentThree newInstance(){
		if (three == null) {
			three = new FragmentThree();
		}
		return three;
	}
}
