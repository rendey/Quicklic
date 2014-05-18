package quicklic.quicklic.quicklic;

import java.util.ArrayList;

import quicklic.floating.api.R;

import android.view.View;
import android.view.View.OnClickListener;

public class QuicklicScroll {

	private QuicklicActivity quicklicActivity;
	private ArrayList<Integer> imageList;

	public QuicklicScroll(QuicklicActivity quicklicActivity)
	{
		this.quicklicActivity = quicklicActivity;

		init();
	}

	private void init()
	{
		imageList = new ArrayList<Integer>();

		// TODO
		imageList.add(R.drawable.scroll_test);

		quicklicActivity.addViewsForBalance(8, imageList, onClickListener);
	}

	private OnClickListener onClickListener = new OnClickListener()
	{
		@Override
		public void onClick( View v )
		{
			//TODO
		}
	};

}