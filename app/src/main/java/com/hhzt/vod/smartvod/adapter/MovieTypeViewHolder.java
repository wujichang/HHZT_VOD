package com.hhzt.vod.smartvod.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hhzt.vod.smartvod.R;
import com.hhzt.vod.viewlayer.androidtvwidget.leanback.mode.OpenPresenter;


public class MovieTypeViewHolder extends OpenPresenter.ViewHolder {

	public TextView ivMovieTypeName;

	public MovieTypeViewHolder(View itemView) {
		super(itemView);
		ivMovieTypeName = (TextView)itemView.findViewById(R.id.tv_movie_type);
	}

}