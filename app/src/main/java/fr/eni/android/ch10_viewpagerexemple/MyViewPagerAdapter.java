package fr.eni.android.ch10_viewpagerexemple;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nazim on 25/11/14.
 */
public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private String[] tab;

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
        tab = new String[]
                {"posición 1", "posición 2", "posición 3"};
    }

    @Override
    public Fragment getItem(final int pos) {
        return MyFragment.newInstance(tab[pos]);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tab[position];
    }
}
