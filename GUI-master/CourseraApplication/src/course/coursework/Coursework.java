/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.coursework;
import java.io.File;
import java.util.GregorianCalendar;

public class Coursework {
    private String reference;
    private String title;
    private File file;
    private String type;
    private GregorianCalendar deadline;

    public Coursework(String reference, String title, String path, String type, int year, int month, int dayOfMonth, int hour, int minute) {
        this.deadline = new GregorianCalendar(year, month, dayOfMonth, hour, minute);
        this.file = new File(path);
        this.reference = reference;
        this.title = title;
        this.file = file;
        this.type = type;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the deadline
     */
    public GregorianCalendar getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(GregorianCalendar deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Coursework{" + "reference=" + reference + ", title=" + title + ", file=" + file.toString() + ", type=" + type + ", deadline=" + deadline.toString() + '}';
    }
    
    
    
}
