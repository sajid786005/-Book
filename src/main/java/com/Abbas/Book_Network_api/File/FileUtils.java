package com.Abbas.Book_Network_api.File;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.criteria.Path;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.ssl.SslProperties;

import java.io.IOException;
import java.nio.file.Files;

@Slf4j
public class FileUtils {
    public static byte[] readFileFromLocation(String fileUrl) {
        if (StringUtils.isBlank(fileUrl)) {
            return null;
        }
        try {
            Path filePath = new SslProperties.Bundles.Watch.File(fileUrl).toPath();
            return Files.readAllBytes((java.nio.file.Path) filePath);
        } catch (IOException e) {
            log.warn("Nou file found in the path {}", fileUrl);
        }
        return null;
    }
}
