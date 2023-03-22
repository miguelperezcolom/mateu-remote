package com.example.storageserver;

import io.mateu.remote.ReferenceForPackageScanning;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackageClasses = {StorageServerApplication.class, ReferenceForPackageScanning.class, })
@EnableScheduling
public class StorageServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageServerApplication.class, args);
    }

}
