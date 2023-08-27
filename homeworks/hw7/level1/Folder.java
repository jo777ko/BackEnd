package de.telran.geork.homeworks.hw7.level1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder implements Iterable<File>{
    List<File> files;


    private String folderName;
    private String owner;

    public Folder(String folderName, String owner) {
        this.folderName = folderName;
        this.owner = owner;
        this.files = new ArrayList<>();
    }

    public int size(){
        return files.size();
    }

    public void addFile(String type, String text){
        this.files.add(new File(this.folderName, type, text));
    }

    @Override
    public Iterator<File> iterator() {
        return files.iterator();
    }
}
