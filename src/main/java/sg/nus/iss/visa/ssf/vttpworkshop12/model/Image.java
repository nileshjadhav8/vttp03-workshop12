package sg.nus.iss.visa.ssf.vttpworkshop12.model;

//to populate the image data
public class Image {

    private String name;
    private String path;
    
    public Image() {
    }
    public Image(String name, String path) {
        this.name = name;
        this.path = path;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }


    @Override
    public String toString() {
        return "Image [name=" + name + ", path=" + path + "]";
    }
    
}
