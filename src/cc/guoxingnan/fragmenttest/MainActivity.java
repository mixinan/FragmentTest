package cc.guoxingnan.fragmenttest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends FragmentActivity implements OnPageChangeListener, OnCheckedChangeListener{
	private RadioGroup mRadioGroup;
	private ViewPager mViewPager;
	private List<Fragment> fragments;
	private FragmentPagerAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
		initData();
		initListener();
	}

	private void initListener() {
		mViewPager.addOnPageChangeListener(this);
		mRadioGroup.setOnCheckedChangeListener(this);
	}

	private void initView() {
		mRadioGroup = (RadioGroup) findViewById(R.id.radiogroup);
		mViewPager = (ViewPager) findViewById(R.id.viewpager);
	}

	private void initData() {
		fragments = new ArrayList<Fragment>();
		Collections.addAll(fragments, 
				FragmentOne.newInstance(),
				FragmentTwo.newInstance(),
				FragmentThree.newInstance());

		adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {

			@Override
			public int getCount() {
				return fragments.size();
			}

			@Override
			public Fragment getItem(int arg0) {
				return fragments.get(arg0);
			}
		};
		
		mViewPager.setAdapter(adapter);
		mViewPager.setOffscreenPageLimit(3);
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {

	}

	@Override
	public void onPageSelected(int arg0) {
		((RadioButton)mRadioGroup.getChildAt(arg0)).setChecked(true);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.rb1:
			mViewPager.setCurrentItem(0);
			break;
		case R.id.rb2:
			mViewPager.setCurrentItem(1);
			break;
		case R.id.rb3:
			mViewPager.setCurrentItem(2);
			break;
		}
	}

}
