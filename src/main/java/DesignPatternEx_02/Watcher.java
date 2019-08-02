package DesignPatternEx_02;

public class Watcher implements IWatcher {

    @Override
    public void update(String str) {
        System.out.println(" " + str);
    }
}
