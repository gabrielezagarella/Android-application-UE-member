package org.cdo.UnionEuropeanCountry;
        import androidx.fragment.app.Fragment;

public class CountryListActivity extends SingleFragmentActivity {

        @Override
        public Fragment createFragment() {
                return new CountryListFragment();
        }
}
