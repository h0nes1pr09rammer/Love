// Generated code from Butter Knife. Do not modify!
package me.storm.ninegag.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FeedsAdapter$Holder$$ViewInjector {
  public static void inject(Finder finder, final me.storm.ninegag.ui.adapter.FeedsAdapter.Holder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427344, "field 'image'");
    target.image = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131427343, "field 'caption'");
    target.caption = (android.widget.TextView) view;
  }

  public static void reset(me.storm.ninegag.ui.adapter.FeedsAdapter.Holder target) {
    target.image = null;
    target.caption = null;
  }
}
