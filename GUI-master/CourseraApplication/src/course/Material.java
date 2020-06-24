/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.nio.file.Path;

public class Material {

    private String title, description, transcript;
    private Path video;

    public Material(String title, String description, String transcript, Path video) {
        this.title = title;
        this.description = description;
        this.transcript = transcript;
        this.video = video;
    }

    public String toString() {
        return "Material{" + "title=" + title + ", description=" + description + ", transcript=" + transcript + ", video=" + video.toString() + '}';
    }

}
