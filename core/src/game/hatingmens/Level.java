/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.hatingmens;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import jdk.nashorn.internal.parser.JSONParser;

/**
 *
 * @author kristian
 */
public class Level {

    private String name;
    private String description;
    private JsonReader levelReader;
    private static LevelFile currentLevel;
    private Json json;

    public Level(String level) {
        json = new Json();
        setLevel(level);
    }

    public final void setLevel(String level) {
        String levelFile = readAll(level);
        currentLevel = json.fromJson(LevelFile.class, levelFile);
    }
    
    public String readAll(String file) {
        String returnFile = "";
        try {
            Scanner reader = new Scanner(new FileReader(file));
            while(reader.hasNext()) {
                returnFile+=reader.next();
            }
            return returnFile;
        }
        catch(Exception e) {
            throw new IllegalArgumentException("No such file exists!");
        }
    }
    
    public void draw(Batch batch) {
        
    }
}
