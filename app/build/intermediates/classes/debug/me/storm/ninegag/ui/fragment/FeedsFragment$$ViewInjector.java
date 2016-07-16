// Generated code from Butter Knife. Do not modify!
package me.storm.ninegag.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FeedsFragment$$ViewInjector {
  public static void inject(Finder finder, final me.storm.ninegag.ui.fragment.FeedsFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427340, "field 'mSwipeLayout'");
    target.mSwipeLayout = (android.support.v4.widget.SwipeRefreshLayout) view;
    view = finder.findRequiredView(source, 2131427341, "field 'gridView'");
    target.gridView = (me.storm.ninegag.view.PageStaggeredGridView) view;
  }

  public static void reset(me.storm.ninegag.ui.fragment.FeedsFragment target) {
    target.mSwipeLayout = null;
    target.gridView = null;
  }
}
