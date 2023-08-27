package de.telran.geork.homeworks.hw7.level1;

import java.util.Objects;

public class File {

    private String fileName;
    private String fileExtension;
    private String fileText;

    public File(String fileName, String fileExtension, String fileText) {
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.fileText = fileText;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileText() {
        return fileText;
    }

    @Override
    public String toString() {
        return "File{" +
                "name '" + fileName + '\'' +
                ", type '" + fileExtension + '\'' +
                ", text '" + fileText + '\'' +
                '}';
    }

}
