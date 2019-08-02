package DesignPatternEx_02;

/**
 * 被观察者接口
 */
public interface IWatched {
    void addWatcher(IWatcher watcher);

    void removeWatcher(IWatcher watcher);

    void notifyWatchers(String str);
}
