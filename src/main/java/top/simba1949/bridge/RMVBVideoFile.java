package top.simba1949.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/22 14:19
 */
@Slf4j
public class RMVBVideoFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        log.info("RMVBVideoFile 视频文件：{}", fileName);
    }
}