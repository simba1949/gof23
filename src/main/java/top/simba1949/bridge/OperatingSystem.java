package top.simba1949.bridge;

/**
 * @author anthony
 * @datetime 2023/7/22 14:19
 */
public abstract class OperatingSystem {

    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    abstract void play(String fileName);
}