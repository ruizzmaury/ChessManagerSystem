/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chesspieces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import view.CellDrawable;

/**
 *
 * @author mauri
 */
public abstract class Piece implements CellDrawable{

    private BufferedImage image;
    private String pieceName;
    private char[] posTable = new char[2];

    public Piece() throws IOException {

        this.image = ImageIO.read(new File(pieceName + ".png"));
    }

    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }

    public char[] getPosTable() {
        return posTable;
    }

    public void setPosTable(char[] posTable) {
        this.posTable = posTable;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

}
