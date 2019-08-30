package com.xy.timershaftx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by Xia_焱 on  2019/8/29.
 * 邮箱：XiahaotianV@163.com
 */
public class TimeAdapter extends RecyclerView.Adapter<TimeAdapter.ViewHolderX> {
    private Context mContext;
    private List<String> mList;

    public TimeAdapter(Context context, List<String> list) {
        this.mContext = context;
        this.mList = list;
    }

    @NonNull
    @Override
    public TimeAdapter.ViewHolderX onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.item_recycler_list, parent, false);
        ViewHolderX viewHoldX = new ViewHolderX(inflate);
        return viewHoldX;
    }

    @Override
    public void onBindViewHolder(@NonNull TimeAdapter.ViewHolderX holder, int position) {
        if (position==0){
            holder.ivTag.setImageResource(R.mipmap.icon_b);
            holder.tvLine_a.setVisibility(View.GONE);
        }else {
            holder.ivTag.setImageResource(R.mipmap.icon_a);
            holder.tvLine_a.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    class ViewHolderX extends RecyclerView.ViewHolder {

          TextView tvLine_a;
          TextView tvLine;
          ImageView ivTag;

        public ViewHolderX(@NonNull View itemView) {
            super(itemView);
            tvLine_a = itemView.findViewById(R.id.tv_line_a);
            tvLine = itemView.findViewById(R.id.tv_line);
            ivTag = itemView.findViewById(R.id.iv_tag);
        }
    }
}
