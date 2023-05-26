package com.hilary.endpointusersapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {

    private Context context;
    private  List<User> userList;

    public UserAdapter(Context context, List<User> users){
        this.context = context;
        this.userList = users;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false);
        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        User user = userList.get(position);
        holder.firstName.setText(user.getFName());
        holder.lastName.setText(user.getLName());
        holder.email.setText(user.getEmail());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public  class  UserHolder extends RecyclerView.ViewHolder {
        TextView firstName, lastName, email;
        public  UserHolder(@NonNull View itemView){
            super(itemView);

            firstName = itemView.findViewById(R.id.fNameTextView);
            lastName = itemView.findViewById(R.id.lNameTextView);
            email = itemView.findViewById(R.id.emailTextView);
        }
    }
}
