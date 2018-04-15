package moon.the.on.junburg.com.androidinstagramclone.Utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Junburg on 2018. 3. 26..
 */

public class SectionStatePagerAdapter extends FragmentStatePagerAdapter{

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final HashMap<Fragment, Integer> mFragments = new HashMap<>();
    private final HashMap<String, Integer> mFragmentNumbers = new HashMap<>();
    private final HashMap<Integer, String> mFragmentNames = new HashMap<>();

    public SectionStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    /**
     * 매개변수로 Fragment와 Fragment의 이름을 넘겨서 생성
     * Fragment와 그 이름, 또는 숫자로 Fragment의 순서를 얻을 수 있음
     */
    public void addFragment(Fragment fragment, String fragmentName) {
        mFragmentList.add(fragment);
        mFragments.put(fragment, mFragmentList.size() - 1);
        mFragmentNumbers.put(fragmentName, mFragmentList.size() - 1);
        mFragmentNames.put(mFragmentList.size() - 1, fragmentName);
    }

    /**
     *
     */
    public Integer getFragmentNumber(String fragmentName) {
        if(mFragmentNumbers.containsKey(fragmentName)) {
            return mFragmentNumbers.get(fragmentName);
        } else {
            return null;
        }
    }

    /**
     *
     */
    public Integer getFragmentNumber(Fragment fragment) {
        if(mFragmentNumbers.containsKey(fragment)) {
            return mFragmentNumbers.get(fragment);
        } else {
            return null;
        }
    }

    /**
     *
     */
    public String getFragmentNumber(Integer fragmentNumber) {
        if(mFragmentNames.containsKey(fragmentNumber)) {
            return mFragmentNames.get(fragmentNumber);
        } else {
            return null;
        }
    }




}
