package com.core.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiongke
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "upload.minio")
public class MinioProperties {

    private String url;

    private String endpoint;

    private String accessKey;

    private String secretKey;

    private String bucketName;
}
