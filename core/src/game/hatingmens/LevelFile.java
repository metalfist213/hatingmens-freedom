/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.hatingmens;

/**
 *
 * @author kristian
 */
public class LevelFile {
    private int height;
    private int width;
    private Layer[] layers;
    private int nextobjectid;
    private String orientation;
    private String renderorder;
    private int tileheight;
    private int tilewidth;
    private float version;
    private Tileset[] tilesets;
    
    public int[] getData(int index) {
        return layers[index].getData();
    }
    
    public int getHeight() {
        return height;
    }
}
