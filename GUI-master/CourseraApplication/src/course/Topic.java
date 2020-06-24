/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

public class Topic {
    private String title;
    private String description;
    private Material[] topicMaterial;

    public Topic(String title, String description, Material[] topicMaterial) {
        this.title = title;
        this.description = description;
        this.topicMaterial = topicMaterial;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString() {
        return "Topic{" + "title=" + title + ", description=" + description + '}';
    }

    /**
     * @return the topicMaterial
     */
    public Material[] getTopicMaterial() {
        return topicMaterial;
    }
    
}
