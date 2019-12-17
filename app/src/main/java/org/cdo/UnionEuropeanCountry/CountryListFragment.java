package org.cdo.UnionEuropeanCountry;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class CountryListFragment extends Fragment {
    private RecyclerView recyclerView;
    private CountryAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crime_list, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_crime);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        updateUI();
        return view;
    }
    private void updateUI() {
        CountryLab countryLab = CountryLab.getInstance(getContext());
        List<Country> countries = countryLab.getCountryList();
        adapter = new CountryAdapter(countries);
        recyclerView.setAdapter(adapter);
    }
    private class CountryHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        private Country country;
        private TextView nameCountry;
        private ImageView flag;

        public CountryHolder(@Nullable View itemView) {
            super(itemView);
            this.itemView.setOnClickListener(this);
            this.nameCountry = this.itemView.findViewById(R.id.nameCountry);
            this.flag = this.itemView.findViewById(R.id.flag);
        }
        public void bind(Country count) {
            this.country = count;
            this.nameCountry.setText(count.getNameCountry());
            this.flag.setImageResource(count.getFlag());
        }
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(), SecondActivity.class);
            intent.putExtra("object", this.country );
                   startActivity(intent);
               }
           }
    private class CountryAdapter extends RecyclerView.Adapter<CountryHolder> {

        private List<Country> countries;

        public CountryAdapter(List<Country> countries) {
            this.countries = countries;
        }
        @NonNull
        @Override
        public CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View view = inflater.inflate(R.layout.item_list_view, parent, false );
            return new CountryHolder(view);
        }
        @Override
        public void onBindViewHolder(@NonNull CountryHolder holder, int position) {
            Country country = countries.get(position);
            holder.bind(country);
        }
        @Override
        public int getItemCount() {
            return countries.size();
        }
    }
}
