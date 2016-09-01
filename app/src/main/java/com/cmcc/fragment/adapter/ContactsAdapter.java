package com.cmcc.fragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cmcc.bean.ContactsBean;
import com.cmcc.firstapplication.R;

import java.util.List;

public class ContactsAdapter extends BaseAdapter {
	private List<ContactsBean> mListMsgBean = null;
	private Context mContext;
	private LayoutInflater mInflater;
	public ContactsAdapter(List<ContactsBean> listMsgBean, Context context){
		mListMsgBean = listMsgBean;
		mContext = context;
		mInflater = LayoutInflater.from(mContext);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mListMsgBean.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mListMsgBean.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View v = mInflater.inflate(R.layout.contacts_item_layout, null);
		
		ImageView imageView = (ImageView) v.findViewById(R.id.img_cts_item);
		imageView.setImageResource(mListMsgBean.get(position).getPhotoDrawableId());
		
		TextView nameMsg = (TextView)v.findViewById(R.id.name_cts_item);
		nameMsg.setText(mListMsgBean.get(position).getMessageName());

		TextView contentMsg = (TextView)v.findViewById(R.id.content_cts_item);
		contentMsg.setText(mListMsgBean.get(position).getMessageContent());
		
		TextView timeMsg = (TextView)v.findViewById(R.id.time_cts_item);
		timeMsg.setText(mListMsgBean.get(position).getMessageTime());

		return v;
	}

}
