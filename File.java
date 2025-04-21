package composite;

public class File extends FileSystemComponent {

    public File(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("File: " + name);
    }
}

