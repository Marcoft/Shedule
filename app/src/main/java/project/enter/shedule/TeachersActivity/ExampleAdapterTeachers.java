package project.enter.shedule.TeachersActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import project.enter.shedule.R;


public class ExampleAdapterTeachers extends RecyclerView.Adapter<ExampleAdapterTeachers.ExampleViewHolder> implements Filterable {
    private ArrayList<ExampleItemTeachers> mExampleList;
    private ArrayList<ExampleItemTeachers> mExampleListForSearchView;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        //void onItemClick(int position);

        //void onDeleteClick(int position);
    }


    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {



        private TextView PIB;
        private TextView speciality;
        private TextView department;
        private ImageView photo;



        private ExampleViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            PIB = itemView.findViewById(R.id.PIB);
            speciality = itemView.findViewById(R.id.speciality);
            department = itemView.findViewById(R.id.department);
            photo = itemView.findViewById(R.id.photo);


        }
    }

    public ExampleAdapterTeachers(ArrayList<ExampleItemTeachers> exampleList) {
        mExampleList = exampleList;
        mExampleListForSearchView = new ArrayList<>(exampleList);
    }


    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_list_teachers, parent, false);
        ExampleViewHolder holder = new ExampleViewHolder(v, mListener);

        return holder;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {

        ExampleItemTeachers currentItem = mExampleList.get(position);

        holder.PIB.setText(currentItem.getPIB());
        holder.speciality.setText(currentItem.getSpeciality());
        holder.department.setText(currentItem.getSubject());
        holder.photo.setImageResource(currentItem.getTeachersPhoto());
        //holder.ans1.setTextColor(Color.parseColor("#008000"));


    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<ExampleItemTeachers> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(mExampleListForSearchView);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (ExampleItemTeachers item : mExampleListForSearchView) {
                    if (item.getPIB().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            mExampleList.clear();
            mExampleList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };


}
