package project.enter.shedule.Shedule;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import project.enter.shedule.R;


public class ExampleAdapterSchedule extends RecyclerView.Adapter<ExampleAdapterSchedule.ExampleViewHolder> {
    private ArrayList<ExampleItemSchedule> mExampleList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        //void onItemClick(int position);

        //void onDeleteClick(int position);
    }


    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {



        private TextView startTime;
        private TextView endTime;
        private TextView nameSubject;
        private TextView nameRoom;
        private TextView nameTeacher;
        private TextView typeLesson;
        private Button colorButton;


        private ExampleViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            startTime = itemView.findViewById(R.id.startTime);
            endTime = itemView.findViewById(R.id.endTime);
            nameSubject = itemView.findViewById(R.id.nameSubject);
            nameRoom = itemView.findViewById(R.id.nameRoom);
            nameTeacher = itemView.findViewById(R.id.nameTeacher);
            typeLesson = itemView.findViewById(R.id.typeLesson);
            colorButton = itemView.findViewById(R.id.colorButton);


        }
    }

    public ExampleAdapterSchedule(ArrayList<ExampleItemSchedule> exampleList) {
        mExampleList = exampleList;
    }


    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_list_schedule, parent, false);
        ExampleViewHolder holder = new ExampleViewHolder(v, mListener);

        return holder;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {

        ExampleItemSchedule currentItem = mExampleList.get(position);

        holder.startTime.setText(currentItem.getStartTime());
        holder.endTime.setText(currentItem.getEndTime());
        holder.nameSubject.setText(currentItem.getNameSubject());
        holder.nameRoom.setText(currentItem.getNameRoom());
        holder.typeLesson.setText(currentItem.getTypeLesson());
        holder.nameTeacher.setText(currentItem.getNameTeacher());
        if(currentItem.getTypeLesson().equalsIgnoreCase("Лекція")){
            holder.colorButton.setBackgroundColor(Color.parseColor("#4169E1"));
        }else {
            holder.colorButton.setBackgroundColor(Color.parseColor("#FFD700"));
        }


    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }



}
