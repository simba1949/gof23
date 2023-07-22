package top.simba1949.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/22 14:21
 */
@Slf4j
public class WindowsOperatingSystem extends OperatingSystem {

    public WindowsOperatingSystem(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String fileName) {
        videoFile.decode(fileName);
    }
}