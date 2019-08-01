package DesignPatternEx_02;

public class WatcherPatternEx {
    public static void main(String[] args) {
        System.out.println("Observer Pattern:");
        IWatched watched = new Watched();

        IWatcher watcher1 = new Watcher();
        IWatcher watcher2 = new Watcher();
        Watcher watcher3 = new Watcher();

        watched.addWatcher(watcher1);
        watched.addWatcher(watcher2);
        watched.addWatcher(watcher3);

        watched.notifyWatchers("Hello World!!!");
    }
}


