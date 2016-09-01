package com.cmcc.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.cmcc.bean.ContactsBean;
import com.cmcc.classapp.MainActivity;
import com.cmcc.constant.Constant;
import com.cmcc.firstapplication.R;
import com.cmcc.fragment.adapter.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

//import android.support.v4.app.Fragment;

public class ContactsFragment extends BaseFragment {

	private static final String TAG = "ContactsFragment";
	private MainActivity mMainActivity ;
	private ListView mListView;
	private ContactsAdapter mMsgAdapter;
	private List<ContactsBean> mMsgBean = new ArrayList<ContactsBean>();
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View messageLayout = inflater.inflate(R.layout.contacts_layout,
				container, false);
		Log.d(TAG, "onCreateView---->");
		mMainActivity = (MainActivity) getActivity();
		mFragmentManager = getActivity().getFragmentManager();
		mListView = (ListView)messageLayout.findViewById(R.id.listview_contacts);
		mMsgAdapter = new ContactsAdapter(mMsgBean, mMainActivity);
		mListView.setAdapter(mMsgAdapter);
		mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
									int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(mMainActivity, mMsgBean.get(position).toString(),
						Toast.LENGTH_SHORT).show();
			}

		});
		return messageLayout;
	}


	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		Log.e(TAG, "onAttach-----");

	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.e(TAG, "onCreate------");
		mMsgBean.add(new ContactsBean(R.drawable.all_parents_icon, "所有人", "请明天来学校参加家长会", "刚刚"));
		mMsgBean.add(new ContactsBean(R.drawable.ic_photo_2, "李四妈", "你的孩子可聪明了！", "昨天"));
		mMsgBean.add(new ContactsBean(R.drawable.ic_photo_3, "王五妈", "孩子上课老师睡觉?", "刚刚"));
		mMsgBean.add(new ContactsBean(R.drawable.ic_photo_4, "赵六爸", "孩子不够自信", "1小时前"));
		mMsgBean.add(new ContactsBean(R.drawable.ic_photo_5, "张三爸", "孩子数学考了100分", "昨天"));
		mMsgBean.add(new ContactsBean(R.drawable.ic_photo_6, "Jone", "GOOD boy！", "刚刚"));
		mMsgBean.add(new ContactsBean(R.drawable.ic_photo_7, "Jane", "挺好的！", "刚刚"));
		mMsgBean.add(new ContactsBean(R.drawable.ic_photo_8, "Jack", "请明天来学校参加家长会！", "刚刚"));
		mMsgBean.add(new ContactsBean(R.drawable.ic_photo_9, "James", "请明天来学校参加家长会！", "刚刚"));
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.e(TAG, "onActivityCreated-------");
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		Log.e(TAG, "onStart----->");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.e(TAG, "onresume---->");
		MainActivity.currFragTag = Constant.FRAGMENT_FLAG_CONTACTS;
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.e(TAG, "onpause");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.e(TAG, "onStop");
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		Log.e(TAG, "ondestoryView");
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.e(TAG, "ondestory");
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		Log.d(TAG, "onDetach------");

	}




	
}
