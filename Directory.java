package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.displayInfo(); 
        }
    }
}

