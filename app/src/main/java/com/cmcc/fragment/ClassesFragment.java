package com.cmcc.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.cmcc.bean.ClassesBean;
import com.cmcc.classapp.MainActivity;
import com.cmcc.constant.Constant;
import com.cmcc.firstapplication.R;
import com.cmcc.fragment.adapter.ClassesAdapter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClassesFragment extends BaseFragment {

	private static final String TAG = "ClassesFragment";
	private MainActivity mMainActivity ;
	private GridView mGridView;
	private ClassesAdapter mClassAdapter;
	private List<ClassesBean> mClassBean = new ArrayList<ClassesBean>();
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View classesLayout = inflater.inflate(R.layout.classes_layout,
				container, false);
		Log.d(TAG, "onCreateView---->");
		mMainActivity = (MainActivity) getActivity();
		mFragmentManager = getActivity().getFragmentManager();
		mGridView = (GridView)classesLayout.findViewById(R.id.gridView_classes);
		mClassAdapter = new ClassesAdapter(mClassBean, mMainActivity);  //MSGBean
		mGridView.setAdapter(mClassAdapter);
		mGridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(mMainActivity, mClassBean.get(position).toString(),
						Toast.LENGTH_SHORT).show();
			}

		});
		return classesLayout;
	}



	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.e(TAG, "onCreate------");

		mClassBean.add(new ClassesBean(R.drawable.post_avatar_1, "    张小三"));
		mClassBean.add(new ClassesBean(R.drawable.post_avatar_2, "    李小四"));
		mClassBean.add(new ClassesBean(R.drawable.post_avatar_3, "    王小五"));
		mClassBean.add(new ClassesBean(R.drawable.post_avatar_4, "    赵小六"));
		mClassBean.add(new ClassesBean(R.drawable.post_avatar_5, "    姚小明"));
		mClassBean.add(new ClassesBean(R.drawable.post_avatar_5, "    马小云"));
		mClassBean.add(new ClassesBean(R.drawable.post_avatar_5, "    刘小东"));
		mClassBean.add(new ClassesBean(R.drawable.post_avatar_5, "    李小宏"));
		mClassBean.add(new ClassesBean(R.drawable.ic_add_class, "    添加"));


		 String sss = new String();


		}
		//生成适配器的ImageItem <====> 动态数组的元素，两者一一对应
	//	ClassesAdapter saImageItems = new ClassesAdapter(this, //没什么解释
	//			lstImageItem,//数据来源
	//			R.layout.classes_item_layout,//night_item的XML实现
	//			//动态数组与ImageItem对应的子项
	//			new String[] {"ItemImage","ItemText"},

				//ImageItem的XML文件里面的一个ImageView,两个TextView ID
	//			new int[] {R.id.ItemImage,R.id.ItemText});
		//添加并且显示
	//	gridview.setAdapter(saImageItems);
		//添加消息处理
	//	gridview.setOnItemClickListener(new ItemClickListener());  -->


	//当AdapterView被单击(触摸屏或者键盘)，则返回的Item单击事件







}
