package DesignPatternEx_02;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者实现类
 */
public class Watched implements IWatched {
    List<IWatcher> watchers = new ArrayList<IWatcher>();

    @Override
    public void addWatcher(IWatcher watcher) {
        watchers.add(watcher);
    }

    @Override
    public void removeWatcher(IWatcher watcher) {
        watchers.remove(watcher);
    }

    @Override
    public void notifyWatchers(String str) {
        for (IWatcher watcher : watchers) {
            watcher.update(str);
        }
    }
}
