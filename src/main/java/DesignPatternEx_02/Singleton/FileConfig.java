package DesignPatternEx_02.Singleton;

import java.io.*;


public class FileConfig {
    private static FileConfig _instance = null;

    private FileConfig() {
    }

    public static FileConfig getInstance() {
        if (_instance == null) {
            System.out.println("创建单例实例：" + System.currentTimeMillis());
            _instance = new FileConfig();
        }
        return _instance;
    }

    public static void getConfig(String filepath) {
        try {
            File file = new File(filepath);
            if (file.exists()) {
                // 判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), "UTF-8");// 考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                bufferedReader.close();
                read.close();
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
