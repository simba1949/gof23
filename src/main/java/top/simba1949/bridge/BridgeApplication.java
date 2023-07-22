package top.simba1949.bridge;

/**
 * @author anthony
 * @datetime 2023/7/22 14:28
 */
public class BridgeApplication {
    public static void main(String[] args) {
        // 创建需要播放的文件
        VideoFile videoFile = new AVIVideoFile();
        // 使用操作系统播放文件
        OperatingSystem operatingSystem = new MacOperatingSystem(videoFile);
        operatingSystem.play("误杀III");
    }
}
