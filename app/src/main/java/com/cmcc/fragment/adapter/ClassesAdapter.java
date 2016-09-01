package com.cmcc.fragment.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cmcc.bean.ClassesBean;
import com.cmcc.firstapplication.R;
//import com.readystatesoftware.viewbadger.BadgeView;

import java.util.List;

public class ClassesAdapter extends BaseAdapter {
	private List<ClassesBean> mListClsBean = null;
	private Context mContext;
	private LayoutInflater mInflater;
	public ClassesAdapter(List<ClassesBean> listMsgBean, Context context){
		mListClsBean = listMsgBean;
		mContext = context;
		mInflater = LayoutInflater.from(mContext);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mListClsBean.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mListClsBean.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View v = mInflater.inflate(R.layout.classes_item_layout, null);
		
		ImageView imageView = (ImageView) v.findViewById(R.id.img_stu_item);
		imageView.setImageResource(mListClsBean.get(position).getPhotoDrawableId());

		//设置图片右上角 未读消息
		//LinearLayout lo = (LinearLayout) v.findViewById(R.id.classes_layout);
		/*BadgeView bv = new BadgeView(mContext, imageView);
		bv.setText("5");
		bv.setTextColor(Color.WHITE);
		bv.setBadgePosition(BadgeView.POSITION_TOP_RIGHT);
		bv.setTextSize(12);
		bv.show();*/
		//ending


		TextView nameMsg = (TextView)v.findViewById(R.id.name_stu_item);
		nameMsg.setText(mListClsBean.get(position).getStudentName());

		return v;
	}

}
