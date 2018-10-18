package twodo.twodo.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import twodo.twodo.R;
import twodo.twodo.activity.ProfileActivity;
import twodo.twodo.dto.model.User;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<User> matches;
    private LayoutInflater mInflater;
    private View view;

    // data is passed into the constructor
    public RecyclerViewAdapter(Context context, ArrayList<User> matches) {
        this.mInflater = LayoutInflater.from(context);
        this.matches = matches;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = mInflater.inflate(R.layout.row_match, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final User match = matches.get(position);

        //holder.photo.setImage(match.getPicture());
        holder.category.setText(match.getOfferCategory());
        holder.date.setText(match.getDate());
        holder.name.setText(match.getFirstname());
        holder.age.setText(Integer.toString(match.getAge()) + view.getContext().getResources().getString(R.string.years));
        holder.description.setText(match.getOfferDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(), ProfileActivity.class);
                i.putExtra("photo", match.getFirstname() + " " + match.getLastname());
                i.putExtra("name", match.getFirstname() + " " + match.getLastname());
                i.putExtra("age", match.getAge());
                i.putExtra("phone", match.getPhone());
                i.putExtra("email", match.getEmail());
                i.putExtra("address", match.getAddress());
                i.putExtra("category", match.getOfferCategory());
                i.putExtra("description", match.getOfferDescription());
                view.getContext().startActivity(i);
            }
        });
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return matches.size();
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView photo;
        TextView category;
        TextView date;
        TextView name;
        TextView age;
        TextView description;

        ViewHolder(View itemView) {
            super(itemView);

            photo = itemView.findViewById(R.id.photo);
            category = itemView.findViewById(R.id.category);
            date = itemView.findViewById(R.id.date);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            description = itemView.findViewById(R.id.description);
        }
    }

    // convenience method for getting data at click position
    public User getItem(int id) {
        return matches.get(id);
    }
}