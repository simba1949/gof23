package top.simba1949.bridge;

/**
 * @author anthony
 * @datetime 2023/7/22 14:21
 */
public class MacOperatingSystem extends OperatingSystem {

    public MacOperatingSystem(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String fileName) {
        videoFile.decode(fileName);
    }
}