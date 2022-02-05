package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Symlink {
    public static void main(String[] args) {
        try {
            Path from = Paths.get(
                    "/mnt/c/Users/Dan/Downloads/junit-platform-console-standalone-1.7.0-M1.jar");
            Path to = Paths.get("./lib/junit_symlink");
            Files.createSymbolicLink(to, from);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
