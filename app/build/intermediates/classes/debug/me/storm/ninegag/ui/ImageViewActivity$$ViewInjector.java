// Generated code from Butter Knife. Do not modify!
package me.storm.ninegag.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ImageViewActivity$$ViewInjector {
  public static void inject(Finder finder, final me.storm.ninegag.ui.ImageViewActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427333, "field 'photoView'");
    target.photoView = (uk.co.senab.photoview.PhotoView) view;
    view = finder.findRequiredView(source, 2131427334, "field 'progressWheel'");
    target.progressWheel = (me.storm.ninegag.view.ProgressWheel) view;
  }

  public static void reset(me.storm.ninegag.ui.ImageViewActivity target) {
    target.photoView = null;
    target.progressWheel = null;
  }
}
